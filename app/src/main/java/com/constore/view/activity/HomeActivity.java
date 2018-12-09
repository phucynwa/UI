package com.constore.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import com.constore.R;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = HomeActivity.class.getSimpleName();
    BottomNavigationView bottomNavigation;

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
            case R.id.button_cart:
                startActivity(new Intent(this, CartActivity.class));
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_titlebar, menu);
        menu.findItem(R.id.button_cart).getIcon()
                .setTint(getResources().getColor(R.color.colorWhite));
        menu.findItem(R.id.button_search).getIcon()
                .setTint(getResources().getColor(R.color.colorWhite));
        return super.onCreateOptionsMenu(menu);
    }

    private void initViews() {
        setContentView(R.layout.activity_home);
        bottomNavigation = findViewById(R.id.bottom_navigation);
    }


    private void initListeners() {
        bottomNavigation.setOnNavigationItemSelectedListener(this::onNavigationItemSelected);
    }

    private boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.button_notification:
                startActivity(new Intent(this, NotificationActivity.class));
                break;
            case R.id.button_payment:
                startActivity(new Intent(this, PaymentActivity.class));
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
