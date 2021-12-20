package com.example.film_5c;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.content.Intent;

public class dettagliFilm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dettagli_film);

        Intent iRicevuta= getIntent();
        String titioloLetto= "Hai ricevuto il titolo: " + iRicevuta.getStringExtra("tit");

        Toast.makeText(getApplicationContext(), titioloLetto, Toast.LENGTH_LONG).show();
    }
}