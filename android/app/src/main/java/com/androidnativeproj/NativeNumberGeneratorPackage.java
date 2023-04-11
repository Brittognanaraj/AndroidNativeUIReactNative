package com.androidnativeproj;

import androidx.annotation.NonNull;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NativeNumberGeneratorPackage implements ReactPackage {

    @NonNull
    @Override
    public List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactApplicationContext) {
       ArrayList<NativeModule> list= new ArrayList<NativeModule>();
        list.add(((new MyViewModule(reactApplicationContext))));
        return list;
    }

    @NonNull
    @Override
    public List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactApplicationContext) {
//        ArrayList<ViewManager> listViewManager= new ArrayList<ViewManager>();
//        listViewManager.add((( new NativeNumberGeneratorViewManager())));
        return Arrays.<ViewManager>asList(new NativeNumberGeneratorViewManager());
    }
}