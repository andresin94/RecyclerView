package com.example.andresim.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recView;
    private ArrayList<Persona> personas=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inicializamos la lista
        for (int i=0;i<20; i++) {
            Persona p1 = new Persona("Nombre"+i, "Apellido"+i);
            personas.add(p1);
        }
        //inicializamos el RecyclerView
        recView = findViewById(R.id.RecView);
        recView.setHasFixedSize(true);

        final PersonaAdaptador adaptador = new PersonaAdaptador(personas);
        recView.setAdapter(adaptador);
        recView.setLayoutManager(new GridLayoutManager(this,3));
    }
}
