package com.example.film_5c;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class dettagliFilm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dettagli_film);

        Intent iRicevuta= getIntent();
        String titolo = iRicevuta.getStringExtra("tit");
        String titioloLetto= "Hai ricevuto il titolo: " + titolo;

        Toast.makeText(getApplicationContext(), titioloLetto, Toast.LENGTH_LONG).show();

        int resID = getResources().getIdentifier(titolo, "id", getPackageName());
        ImageView immagine = (ImageView) findViewById(resID);
        immagine.setVisibility(immagine.VISIBLE);

        TextView scritta = (TextView) findViewById(R.id.Titolo);

        scritta.setText(titolo);
    }
}