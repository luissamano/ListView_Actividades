package com.samanocedillo.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class animales extends AppCompatActivity {

    int num;
    ListView lsAnimales;
    String[] array;
    Bundle params;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales);



        params = getIntent().getExtras();
        num = params.getInt("num");
        array = params.getStringArray("array");


        lsAnimales = (ListView)findViewById(R.id.lsAnimales);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array);

        lsAnimales.setAdapter(adapter);

        final Intent i = new  Intent(this, animal.class);

        lsAnimales.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                i.putExtra("animal", array[position]);
                startActivity(i);
            }
        });
    }


    public void Regresar(View view) {
        finish();
    }
}
