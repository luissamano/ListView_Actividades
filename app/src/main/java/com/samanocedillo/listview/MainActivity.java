package com.samanocedillo.listview;

import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] menu = {"Acuatico", "Terrestre", "Aereos"};

    String[] acuaticos = {"Ballena", "Delfin", "Orca"};
    String[] terrestres = {"Caballo", "Camaleon", "Cerdo", "Gato", "Lince", "Lobo", "Perro", "Vaca"};
    String[] aereos = {"Aguila", "Canario"};

    ListView lsViewMenu;
    Intent i;
    Bundle params;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        params = getIntent().getExtras();


        lsViewMenu = (ListView)findViewById(R.id.lsViewMenu);


        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                        menu);

        lsViewMenu.setAdapter(adapter);

        i = new Intent(this, animales.class);

        lsViewMenu.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub

                switch (position) {
                    case 0:
                        i.putExtra("num", 0);
                        i.putExtra("array", acuaticos);
                        startActivity(i);
                        break;
                    case 1:
                        i.putExtra("num", 1);
                        i.putExtra("array", terrestres);
                        startActivity(i);
                        break;
                    case 2:
                        i.putExtra("num", 2);
                        i.putExtra("array", aereos);
                        startActivity(i);
                        break;

                }
            }
        });


    }




}
