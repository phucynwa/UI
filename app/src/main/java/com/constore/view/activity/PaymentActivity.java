package com.constore.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.constore.R;
import com.constore.model.bean.PaymentAddress;

public class PaymentActivity extends AppCompatActivity {

    private TextView txtAddressPayment, txtPaymentUserInfo, txtProductName,txtProductDetail, txtProductPrice, txtShipFee, txtTotalPrice, txtTotalShipFee, txtTotal ;
    private EditText edtDiscount;
    private ImageView imgProduct, imgDeleteItem ;
    private Button btnNext;

    private PaymentAddress paymentAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        // Add back button
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        txtAddressPayment = findViewById(R.id.txt_address_payment);
        txtPaymentUserInfo = findViewById(R.id.txt_username_payment);
        txtProductName = findViewById(R.id.txt_product_name);
        txtProductDetail = findViewById(R.id.txt_product_detail);
        txtProductPrice = findViewById(R.id.txt_product_price);
        txtShipFee = findViewById(R.id.txt_shipment_fee);
        txtTotalPrice = findViewById(R.id.txt_total_price);
        txtTotalShipFee = findViewById(R.id.txt_total_shipment);
        txtTotal = findViewById(R.id.txt_total);

        edtDiscount = findViewById(R.id.edt_discount);

        imgProduct = findViewById(R.id.img_product);
        imgDeleteItem = findViewById(R.id.img_delete_item);

        Intent intent = getIntent();
        paymentAddress = (PaymentAddress) intent.getSerializableExtra("Info");

        txtAddressPayment.setText(getPaymentAddress(paymentAddress));
        txtPaymentUserInfo.setText(getPaymentInfo(paymentAddress));

        btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ChooseAccountingActivity.class);
                startActivity(intent);
            }
        });
    }

    public String getPaymentInfo(PaymentAddress paymentAddress){
        String result ="";
        if(!paymentAddress.getName().isEmpty()){
            result += paymentAddress.getName() + " ";
        }
        if(!paymentAddress.getPhone().isEmpty()){
            result += paymentAddress.getPhone();
        }
        return result;
    }

    public String getPaymentAddress(PaymentAddress paymentAddress){
        String result ="";
        if(!paymentAddress.getDetailAddress().isEmpty()){
            result += paymentAddress.getDetailAddress() + ", ";
        }
        if(!paymentAddress.getWard().isEmpty()){
            result += paymentAddress.getWard() + ", ";
        }
        if(!paymentAddress.getDistrict().isEmpty()){
            result += paymentAddress.getDistrict() + ", ";
        }
        if(!paymentAddress.getCity().isEmpty()){
            result += paymentAddress.getCity();
        }

        return result;
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
