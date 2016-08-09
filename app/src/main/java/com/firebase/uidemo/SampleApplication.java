package com.firebase.uidemo;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by Aristides Papadopoulos (github:talosdev).
 */
public class SampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        LeakCanary.install(this);


    }
}
