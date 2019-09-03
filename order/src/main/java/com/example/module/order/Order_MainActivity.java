package com.example.module.order;

import android.os.Bundle;
import android.view.View;

import com.example.annotation.ARouter;
import com.example.common.base.BaseActivity;

@ARouter(path = "/order/Order_MainActivity")
public class Order_MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity_main);

//        Intent intent = new Intent()
    }

    public void jumpApp(View view) {


    }

    public void jumpPersonal(View view) {


    }
}
