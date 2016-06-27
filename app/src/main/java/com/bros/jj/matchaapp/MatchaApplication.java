package com.bros.jj.matchaapp;

import android.app.Application;

import com.beardedhen.androidbootstrap.TypefaceProvider;

public class MatchaApplication extends Application {
    @Override public void onCreate() {
        super.onCreate();
        TypefaceProvider.registerDefaultIconSets();
    }
}
