package com.example.componentizedstudy;

import com.example.common.RecordPathManager;
import com.example.common.base.BaseApplicapion;
import com.example.module.order.Order_MainActivity;
import com.example.module.person.PersonActivity;

/**
 * @author Created by LittleGreens
 * @data on 2019/8/29
 * @describe TODO
 */
public class AppApplication extends BaseApplicapion {

    @Override
    public void onCreate() {
        super.onCreate();

        // 如果项目有100个Activity，这种加法会不会太那个？如果有200个Activity，难道要手写吗，其实可以用APT来实现
        RecordPathManager.putGroup("app", "MainActivity", MainActivity.class);
        RecordPathManager.putGroup("order", "Order_MainActivity", Order_MainActivity.class);
        RecordPathManager.putGroup("personal", "PersonalActivity", PersonActivity.class);
    }
}
