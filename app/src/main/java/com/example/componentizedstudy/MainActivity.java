package com.example.componentizedstudy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.common.base.BaseActivity;
import com.example.module.order.Order_MainActivity;
import com.example.module.person.PersonActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        BuildConfig.url
    }

    public void jumpOrder(View view) {
        Intent intent = new Intent(this, Order_MainActivity.class);
        startActivity(intent);
    }

    public void jumpPersonal(View view) {
        Intent intent = new Intent(this, PersonActivity.class);
        startActivity(intent);
    }
}
