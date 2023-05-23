package com.example.mismascotasrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MascotasRecycler extends AppCompatActivity {
    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mascotas_recycler);
        init();
    }
    public void init(){
        elements = new ArrayList<>();
        elements.add(new ListElement(R.drawable.perro,"Perro", "Donald", "Raza: Pitbull"));
        elements.add(new ListElement(R.drawable.pez,"Pez", "Tato", "Especie: Pez payaso"));
        elements.add(new ListElement(R.drawable.perico,"Perico", "Silvestre", "Raza: Egipcio"));
        elements.add(new ListElement(R.drawable.sirena,"Sirena", "Ariel", "Raza: Cola grande"));
        elements.add(new ListElement(R.drawable.pato,"Pato", "Adrian", "Raza: Blanco"));

        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.cvMascota);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
    public void pasarDetalle1(View view){
        Intent intent = new Intent(this, DetalleMascota.class);
        startActivity(intent);
    }
    public void pasarDetalle2(View view){
        Intent intent = new Intent(this, DetalleMascota2.class);
        startActivity(intent);
    }
    public void pasarDetalle3(View view){
        Intent intent = new Intent(this, DetalleMascota3.class);
        startActivity(intent);
    }
    public void pasarDetalle4(View view){
        Intent intent = new Intent(this, DetalleMascota4.class);
        startActivity(intent);
    }
}