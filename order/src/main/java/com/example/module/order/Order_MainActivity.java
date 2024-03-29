package com.example.module.order;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.common.RecordPathManager;
import com.example.common.base.BaseActivity;

public class Order_MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity_main);

//        Intent intent = new Intent()
    }

    public void jumpApp(View view) {
        // 第一种方式 类加载方式（说明下，类加载方式，不是反射。）
//        try {
//            Class targetClass = Class.forName("com.example.componentizedstudy.MainActivity");
//            Intent intent = new Intent(this, targetClass);
//            intent.putExtra("name", "Order_MainActivity");
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

    public void jumpPersonal(View view) {
// 第一种方式 类加载方式
//        try {
//            Class targetClass = Class.forName("com.example.module.person.PersonActivity");
//            Intent intent = new Intent(this, targetClass);
//            intent.putExtra("name", "Order_MainActivity");
//            startActivity(intent);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        // 第二种方式，从全局Map的方式取出class
        Class<?> targetClass = RecordPathManager.getTargetClass("personal", "PersonalActivity");
        if (targetClass != null) {
            Intent intent = new Intent(this, targetClass);
            intent.putExtra("name", "Order_MainActivity");
            startActivity(intent);
        }

    }
}
