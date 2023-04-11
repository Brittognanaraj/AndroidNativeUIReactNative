package com.androidnativeproj;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;

public class MyViewManager extends ViewGroupManager<FrameLayout> {

    public static final String REACT_NAME="MyCustomView";

    public MyViewManager(ReactApplicationContext reactContext) {
    }

    @NonNull
    @Override
    public String getName() {
        return REACT_NAME;
    }

    @NonNull
    @Override
    protected FrameLayout createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        LayoutInflater inflater=(LayoutInflater) themedReactContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        FrameLayout frameLayout=(FrameLayout) inflater.inflate(R.layout.layout_framelayout,null);
        return frameLayout;
    }

}
