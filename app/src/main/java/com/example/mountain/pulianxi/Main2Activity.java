package com.example.mountain.pulianxi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener,AdapterView.OnItemSelectedListener{
    private ImageView imageView;
    private int []resIds=new int[]{R.drawable.deyi,R.drawable.fadai,R.drawable.gaoxin,R.drawable.piezui,
            R.drawable.se,R.drawable.shengqi,R.drawable.weixiao};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        GridView gridView= (GridView) findViewById(R.id.gridView);
        List<Map<String,Object>> cells=new ArrayList<Map<String,Object>>();
        for (int i=0;i<resIds.length;i++){
            Map<String,Object> cell=new HashMap<>();
            cell.put("hello",resIds[i]);
            cells.add(cell);
        }
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,cells,R.layout.cell,new String[]{"hello"},new int[]{R.id.imageview});
        gridView.setAdapter(simpleAdapter);

        imageView= (ImageView) findViewById(R.id.imageview);
        gridView.setOnItemClickListener(this);
        gridView.setOnItemSelectedListener(this);

        imageView.setImageResource(resIds[0]);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        imageView.setImageResource(resIds[i]);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        imageView.setImageResource(resIds[i]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
