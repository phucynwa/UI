package com.constore.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.constore.R;
import com.constore.model.bean.Category;

import java.util.List;

public class ListCategoryAdapter extends RecyclerView.Adapter<ListCategoryAdapter.ViewHolder> {

    private List<Category> mCategories;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    public ListCategoryAdapter(Context context, List<Category> categories) {
        this.mInflater = LayoutInflater.from(context);
        this.mCategories = categories;
    }

    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_category, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int icon = mCategories.get(position).getIcon();
        String categoryName = mCategories.get(position).getName();
        holder.myIconView.setImageResource(icon);
        holder.myTextView.setText(categoryName);
    }

    @Override
    public int getItemCount() {
        return mCategories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView myIconView;
        TextView myTextView;

        ViewHolder(View itemView) {
            super(itemView);
            myIconView = itemView.findViewById(R.id.image_category_icon);
            myTextView = itemView.findViewById(R.id.text_category_name);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    public Category getItem(int id) {
        return mCategories.get(id);
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}