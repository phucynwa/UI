package com.constore.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.constore.R;
import com.constore.model.bean.Category;
import com.constore.model.bean.Product;
import com.constore.view.adapter.ListCategoryAdapter;
import com.constore.view.adapter.ListProductAdapter;
import com.synnapps.carouselview.CarouselView;
import java.util.Arrays;
import java.util.List;
import com.constore.model.bean.User;

public class HomeActivity extends Activity {

    private static final String TAG = HomeActivity.class.getSimpleName();
    BottomNavigationView bottomNavigation;
    CarouselView carouselView;
    RecyclerView recyclerViewCategories, recyclerViewProducts;
    ListCategoryAdapter mListCategoryAdapter;
    ListProductAdapter mListProductAdapter;
    List<Category> categoryList = Arrays.asList(
            new Category("Book", null, R.drawable.ic_book_black_24dp),
            new Category("Fashion", null, R.drawable.ic_wc_black_24dp),
            new Category("Toy", null, R.drawable.ic_extension_black_24dp),
            new Category("Electric", null, R.drawable.ic_devices_other_black_24dp),
            new Category("Food", null, R.drawable.ic_cake_black_24dp)
    );
    List<Product> productList = Arrays.asList(
            new Product("iPhone XS Max", 29000000L),
            new Product("Samsung Galaxy S9", 24000000L),
            new Product("Levi's 501 Authentic", 6400000L),
            new Product("Dutch Lady 250ml", 35000L),
            new Product("Something else", 14000L)
    );

    int[] sampleImages = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3,
            R.drawable.image_4, R.drawable.image_5};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViews();
        initListeners();
    }

    @Override
    protected void onResume() {
        super.onResume();
        bottomNavigation.setSelectedItemId(0);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_titlebar, menu);
        menu.findItem(R.id.button_search).getIcon()
                .setTint(getResources().getColor(R.color.colorWhite));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            menu.findItem(R.id.button_cart).getIcon()
                    .setTint(getResources().getColor(R.color.colorWhite));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            menu.findItem(R.id.button_search).getIcon()
                    .setTint(getResources().getColor(R.color.colorWhite));
        }
        return super.onCreateOptionsMenu(menu);
    }

    private void initViews() {
        setContentView(R.layout.activity_home);
        bottomNavigation = findViewById(R.id.bottom_navigation);
        carouselView = findViewById(R.id.carouselView);
        recyclerViewCategories = findViewById(R.id.recycler_list_category);
        recyclerViewProducts = findViewById(R.id.recycler_list_product);
        carouselView.setPageCount(sampleImages.length);
        LinearLayoutManager horizontalLayoutManager
                = new LinearLayoutManager(HomeActivity.this, LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager horizontalLayoutManager2
                = new LinearLayoutManager(HomeActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategories.setLayoutManager(horizontalLayoutManager);
        mListCategoryAdapter = new ListCategoryAdapter(this, categoryList);
        recyclerViewCategories.setAdapter(mListCategoryAdapter);
        recyclerViewProducts.setLayoutManager(horizontalLayoutManager2);
        mListProductAdapter = new ListProductAdapter(this, productList);
        recyclerViewProducts.setAdapter(mListProductAdapter);
    }

    private void initListeners() {
        carouselView.setImageListener((position, imageView) -> imageView.setImageResource(sampleImages[position]));
        bottomNavigation.setOnNavigationItemSelectedListener(this::onNavigationItemSelected);
        mListCategoryAdapter.setClickListener((view, position) -> Log.d(TAG, "Click to position " + position));
    }

    private boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.button_notification:
                startActivity(new Intent(this, NotificationActivity.class));
                break;
            case R.id.button_cart:
                startActivity(new Intent(this, CartActivity.class));
                break;
            case R.id.button_rate:
                startActivity(new Intent(this, RateActivity.class));
                break;
            case R.id.button_contact:
                startActivity(new Intent(this, ContactActivity.class));
                break;
        }
        return true;
    }
}
