package com.example.application;

import android.app.Application;

import com.facebook.stetho.Stetho;

public class moneyBook extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 啟動Stetho
        Stetho.initializeWithDefaults(this);
    }
}
