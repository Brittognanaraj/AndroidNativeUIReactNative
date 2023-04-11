package com.androidnativeproj;

import androidx.annotation.NonNull;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

class NativeNumberGeneratorViewManager extends SimpleViewManager<NativeNumberGeneratorView>  {

    @ReactProp(name="initialNumber")
    public void setInitialNumberProp(NativeNumberGeneratorView view,int initialNumber){
        view.setInitialNumber(initialNumber);
    }

    @NonNull
    @Override
    public String getName() {
        return "NativeNumberGeneratorView";
    }

    @NonNull
    @Override
    protected NativeNumberGeneratorView createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return new NativeNumberGeneratorView(themedReactContext);
    }
}