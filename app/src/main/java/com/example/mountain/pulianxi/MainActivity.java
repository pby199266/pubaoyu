package com.example.mountain.pulianxi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick_Button(View view) {
        View v = findViewById(R.id.viewstub);
        View view1 = null;
        if (v != null) {

//            ((ViewStub) v).inflate();
            v.setVisibility(View.VISIBLE);
        } else {
            setTitle("ViewStub已经替换为Custom.xml");
        }
            Log.i("sadasdasdasd", "dsdhsd");

            view=findViewById(R.id.button_layout);
            Button button= (Button) findViewById(R.id.vvvvv);

           button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.i("sadasdasdasd", "ffgffggf");
                    startActivity(new Intent(MainActivity.this, Main2Activity.class));
                    finish();

                }
            });

        }

    public void btn_zouli(View view) {
        Intent intent=new Intent(this,Main3Activity.class);
        startActivity(intent);
        finish();
    }

//    public void ddd(View view) {
//        startActivity(new Intent(MainActivity.this,Main2Activity.class));
//        finish();
//
//    }
    }
