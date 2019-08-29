package com.example.module.person;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.common.RecordPathManager;
import com.example.common.base.BaseActivity;

public class PersonActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
    }

    public void jumpApp(View view) {
        // 第一种方式 类加载方式，容易出现失误，维护成本高
//        try {
//            Class targetClass = Class.forName("com.example.componentizedstudy.MainActivity");
//            Intent intent = new Intent(this, targetClass);
//            intent.putExtra("name", "PersonActivity");
//            startActivity(intent);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        // 第二种方式，从全局Map的方式取出class
        Class<?> targetClass = RecordPathManager.getTargetClass("app", "MainActivity");
        if (targetClass != null) {
            Intent intent = new Intent(this, targetClass);
            intent.putExtra("name", "Order_MainActivity");
            startActivity(intent);
        }
    }

    public void jumpOrder(View view) {
        // 第一种方式 类加载方式。
//        try {
//            Class targetClass = Class.forName("com.example.module.order.Order_MainActivity");
//            Intent intent = new Intent(this, targetClass);
//            intent.putExtra("name", "PersonActivity");
//            startActivity(intent);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        // 第二种方式，从全局Map的方式取出class
        Class<?> targetClass = RecordPathManager.getTargetClass("order", "Order_MainActivity");
        if (targetClass != null) {
            Intent intent = new Intent(this, targetClass);
            intent.putExtra("name", "Order_MainActivity");
            startActivity(intent);
        }
    }


}
