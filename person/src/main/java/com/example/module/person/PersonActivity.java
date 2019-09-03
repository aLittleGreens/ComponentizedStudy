package com.example.module.person;


import android.os.Bundle;
import android.view.View;

import com.example.annotation.ARouter;
import com.example.common.base.BaseActivity;

@ARouter(path ="/person/PersonActivity")
public class PersonActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
    }

    public void jumpApp(View view) {

    }

    public void jumpOrder(View view) {

    }


}
