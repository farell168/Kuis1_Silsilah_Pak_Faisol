package com.example.a1718110_recycler_view_kuis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter = new KeluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Dr. Alexander Sudjadi, SE, MM", "Abah", getDrawable(R.drawable.abah)));
        keluargaArrayList.add(new Keluarga("Hidayati, SE, MM", "Bunda", getDrawable(R.drawable.bunda)));
        keluargaArrayList.add(new Keluarga("Farell Apuilino", "Saya", getDrawable(R.drawable.farm)));
        keluargaArrayList.add(new Keluarga("Fadey Alanao", "Adik", getDrawable(R.drawable.adik1)));
    }
}
