package com.anubhi.ck1;

import android.app.Activity;

import android.os.Bundle;


public class MapActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TouchImageView img = new TouchImageView(this);
        img.setImageResource(R.drawable.map);
        img.setMaxZoom(4f);
        setContentView(img);


    }

}
