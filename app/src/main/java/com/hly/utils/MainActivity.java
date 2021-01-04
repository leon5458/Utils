package com.hly.utils;

import com.google.gson.Gson;
import com.hly.utils.base.BaseActivity;
import com.hly.utils.gson.GsonUtil;
import com.hly.utils.gson.HomeWorkBean;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.BaseAdapter;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends BaseActivity {
    @Override
    protected int setLayoutResourceID() {
        return R.layout.activity_main;
    }

    @Override
    protected void setUpView() {
        /**
         * GsonUtil使用方法
         */
        // 使用gson解析数据
        Gson gson = new Gson();
        HomeWorkBean homeWorkBean = gson.fromJson("接口返回的json", HomeWorkBean.class);
        // 使用gson工具类解析数据
        HomeWorkBean homeWorkBean1 = GsonUtil.GsonToBean("接口返回的json", HomeWorkBean.class);

    }

}
