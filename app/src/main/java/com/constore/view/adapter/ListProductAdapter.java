package com.constore.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.constore.R;
import com.constore.model.bean.Category;
import com.constore.model.bean.Product;

import java.util.List;

public class ListProductAdapter extends RecyclerView.Adapter<ListProductAdapter.ViewHolder> {

    private List<Product> mProducts;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    public ListProductAdapter(Context context, List<Product> categories) {
        this.mInflater = LayoutInflater.from(context);
        this.mProducts = categories;
    }

    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_product, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        int icon = R.drawable.ic_book_black_24dp;
        String categoryName = mProducts.get(position).getName();
//        holder.myView.setBackgroundResource(icon);
        holder.myTextView.setText(categoryName);
    }

    @Override
    public int getItemCount() {
        return mProducts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        View myView;
        TextView myTextView;

        ViewHolder(View itemView) {
            super(itemView);
            myView = itemView.findViewById(R.id.image_product);
            myTextView = itemView.findViewById(R.id.text_product_name);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    public Product getItem(int id) {
        return mProducts.get(id);
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}