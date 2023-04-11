package com.androidnativeproj;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class MyViewModule extends ReactContextBaseJavaModule {
private static ReactApplicationContext reactApplicationContext=null;
    public MyViewModule(ReactApplicationContext context) {
        super(context);
        reactApplicationContext=context;
    }

    @Override
    public String getName() {
        return "NativeNumberGenerator";
    }




}
