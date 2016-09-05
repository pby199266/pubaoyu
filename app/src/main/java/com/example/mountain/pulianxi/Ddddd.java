package com.example.mountain.pulianxi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by Administrator on 2016/8/3.
 */
public class Ddddd extends Activity{
    Context context;
    LayoutInflater layoutInflater;
    public Ddddd(Context context){

        this.context=context;
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view=layoutInflater.inflate(R.layout.custom,null);
        setContentView(view);
    }
}
