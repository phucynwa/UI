package com.constore.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.constore.R;

public class HomeActivity extends AppCompatActivity {

    Button btnSearch, btnCart, btnPayment, btnRate, btnContact, btnNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnSearch = findViewById(R.id.btnSearch);
        btnCart = findViewById(R.id.btnCart);
        btnPayment = findViewById(R.id.btnPayment);
        btnRate = findViewById(R.id.btnRate);
        btnContact = findViewById(R.id.btnContact);
        btnNotification = findViewById(R.id.btnNotification);


        // Onclick
        btnSearch.setOnClickListener(v -> startActivity(new Intent(v.getContext(), SearchActivity.class)));
        btnCart.setOnClickListener(v -> startActivity(new Intent(v.getContext(), CartActivity.class)));
        btnPayment.setOnClickListener(v -> startActivity(new Intent(v.getContext(), PaymentActivity.class)));
        btnRate.setOnClickListener(v -> startActivity(new Intent(v.getContext(), RateActivity.class)));
        btnContact.setOnClickListener(v -> startActivity(new Intent(v.getContext(), ContactActivity.class)));
        btnNotification.setOnClickListener(v -> startActivity(new Intent(v.getContext(), NotificationActivity.class)));

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        // end the activity
        if (id == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
