package com.example.componentizedstudy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.annotation.ARouter;
import com.example.annotation.model.RouterBean;
import com.example.arouter_api.ARouterLoadPath;
import com.example.common.base.BaseActivity;
import com.example.componentizedstudy.apt.ARouter$$Group$$order;
import com.example.componentizedstudy.apt.ARouter$$Group$$person;
import com.example.module.person.PersonActivity;

import java.util.Map;

@ARouter(path = "/app/MainActivity")
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void jumpOrder(View view) {
//        Intent intent = new Intent(this, Order_MainActivity.class);
//        startActivity(intent);
        ARouter$$Group$$order aRouter$$Group$$Order = new ARouter$$Group$$order();
        Map<String, Class<? extends ARouterLoadPath>> groupMap = aRouter$$Group$$Order.loadGroup();
        Class<? extends ARouterLoadPath> clazz = groupMap.get("order");
        try {
            ARouterLoadPath aRouterLoadPath = clazz.newInstance();
            Map<String, RouterBean> pathMap = aRouterLoadPath.loadPath();
            RouterBean routerBean = pathMap.get("/order/Order_MainActivity");
            Class<?> orderActivityClass = routerBean.getClazz();
            Intent intent = new Intent(this,orderActivityClass);
            startActivity(intent);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }

    public void jumpPersonal(View view) {
//        Intent intent = new Intent(this, PersonActivity.class);
//        startActivity(intent);

        ARouter$$Group$$person aRouter$$Group$$person = new ARouter$$Group$$person();
        Map<String, Class<? extends ARouterLoadPath>> groupMap = aRouter$$Group$$person.loadGroup();
        Class<? extends ARouterLoadPath> clazz = groupMap.get("person");
        try {
            ARouterLoadPath aRouterLoadPath = clazz.newInstance();
            Map<String, RouterBean> pathMap = aRouterLoadPath.loadPath();
            RouterBean routerBean = pathMap.get("/person/PersonActivity");
            Class<?> orderActivityClass = routerBean.getClazz();
            Intent intent = new Intent(this,orderActivityClass);
            startActivity(intent);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
