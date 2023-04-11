package com.androidnativeproj;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.react.uimanager.ThemedReactContext;

class NativeNumberGeneratorView extends LinearLayout {
    ThemedReactContext myContext;
    int number=0;

    public NativeNumberGeneratorView(ThemedReactContext context) {
        super(context);
        this.myContext=context;
        init();
    }



    public void setInitialNumber(int number){
        this.number=number;
        this.updateRandomNumberLabel();
    }

    private void updateRandomNumberLabel(){
        TextView randomNumberLabel=findViewById(R.id.randomNumber);
        randomNumberLabel.setText(""+this.number);
    }

    private void init(){
        View layoutInflate=inflate(myContext,R.layout.generator_layout,this);
        Button randomNumberButton=layoutInflate.findViewById(R.id.randomButton);
//        randomNumberButton.setOnClickListener {
//            this.number=(0 until 100).shuffled().last()
//            this.updateRandomNumberLabel()
//        }
    }
}