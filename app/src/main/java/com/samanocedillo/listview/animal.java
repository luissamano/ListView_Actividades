package com.samanocedillo.listview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class animal extends AppCompatActivity {

    Bundle params;
    String animal;
    TextView txtAnimal, txtDesc;
    ImageView imageView;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        txtAnimal = (TextView) findViewById(R.id.txtAnimal);
        txtDesc = (TextView) findViewById(R.id.txtDesc);
        imageView = (ImageView) findViewById(R.id.imageView);

        params = getIntent().getExtras();
        animal = params.getString("animal").toLowerCase();

        txtAnimal.setText(animal.toUpperCase());


        String uri = "@drawable/"+animal+"";
        int imageResource = getResources().getIdentifier(uri, null, getPackageName());
        Drawable imagen = ContextCompat.getDrawable(getApplicationContext(), imageResource);

        imageView.setImageDrawable(imagen);

        if (animal.toString().toLowerCase().equals("ballena")){
            txtDesc.setText("Los balénidos son una familia de cetáceos misticetos que " +
                    "incluye solo cuatro especies listadas más abajo, en dos géneros, " +
                    "Balaena y Eubalaena".toUpperCase());
        }
        else if (animal.toString().toLowerCase().equals("delfin")) {
            txtDesc.setText("Los delfines, llamados también delfines oceánicos para distinguirlos de los platanistoideos o delfines de río, son una familia de cetáceos odontocetos muy heterogénea".toUpperCase());
        }
        else if (animal.toString().toLowerCase().equals("delfin")) {
            txtDesc.setText("Los delfines, llamados también delfines oceánicos para distinguirlos de los platanistoideos o delfines de río, son una familia de cetáceos odontocetos muy heterogénea".toUpperCase());
        }
        else if (animal.toString().toLowerCase().equals("orca")) {
            txtDesc.setText("La orca es una especie de cetáceo odontoceto perteneciente a la familia Delphinidae, que habita en todos los océanos del planeta. Es la especie más grande de delfínido y la única existente actual reconocida dentro del género Orcinus".toUpperCase());
        }
        else if (animal.toString().toLowerCase().equals("caballo")) {
            txtDesc.setText("El caballo es un mamífero perisodáctilo domesticado de la familia de los équidos. Es un herbívoro perisodáctilo de gran porte, cuello largo y arqueado, poblado por largas crines.".toUpperCase());
        }
        else if (animal.toString().toLowerCase().equals("camaleon")) {
            txtDesc.setText("Los camaleones son una familia de pequeños saurópsidos escamosos. Existen cerca de 161 especies de camaleones, la mayor parte de ellas en África al sur del Sáhara.".toUpperCase());
        }
        else if (animal.toString().toLowerCase().equals("cerdo")) {
            txtDesc.setText("El cerdo es una subespecie de mamífero artiodáctilo de la familia Suidae. Es un animal doméstico usado en la alimentación humana por muchos pueblos.".toUpperCase());
        }
        else if (animal.toString().toLowerCase().equals("gato")) {
            txtDesc.setText("El gato o gato doméstico y coloquialmente llamado minino, michino, micho, mizo, miz, morrongo o morroño; es una subespecie de mamífero carnívoro de la familia Felidae.".toUpperCase());
        }

        else if (animal.toString().toLowerCase().equals("lince")) {
            txtDesc.setText("Lynx es un género de mamíferos carnívoros de la familia Felidae vulgarmente conocidos como linces. Se conocen cuatro especies caracterizadas por su tamaño medio, fuertes patas, largas orejas, cola corta y cuerpo más o menos moteado.".toUpperCase());
        }
        else if (animal.toString().toLowerCase().equals("lobo")) {
            txtDesc.setText("El lobo es una especie de mamífero placentario del orden de los carnívoros. El perro doméstico se considera miembro de la misma especie según distintos indicios, la secuencia del ADN y otros estudios genéticos.".toUpperCase());
        }
        else if (animal.toString().toLowerCase().equals("perro")) {
            txtDesc.setText("El perro, llamado perro doméstico o can, y coloquialmente chucho o tuso, y también choco; es un mamífero carnívoro de la familia de los cánidos, que constituye una subespecie del lobo.".toUpperCase());
        }
        else if (animal.toString().toLowerCase().equals("vaca")) {
            txtDesc.setText("La vaca en el caso de la hembra, o toro en el caso del macho, es un mamífero artiodáctilo de la familia de los bóvidos.".toUpperCase());
        }
        else if (animal.toString().toLowerCase().equals("aguila")) {
            txtDesc.setText("Águila es el nombre dado a las mayores aves depredadoras. Las diversas especies y subespecies de águilas pueden encontrarse en casi cualquier parte del mundo excepto en la Antártida.".toUpperCase());
        }
        else if (animal.toString().toLowerCase().equals("vaca")) {
            txtDesc.setText("El canario silvestre o serín canario es una especie de ave paseriforme de la familia de los fringílidos.".toUpperCase());
        }
        else {
            txtDesc.setText("Sin informacion".toUpperCase());
        }



    }

    public void Regresar(View view) {
        finish();
    }

}
