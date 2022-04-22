package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rMakanan;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Makanan> listMakanan;

    void dummy(){
        listMakanan = new ArrayList<>();
        listMakanan.add(new Makanan("Spagethi Aglio-olio","dengan bumbu bawang putih yang nikmat", 50000, R.drawable.aglio));
        listMakanan.add(new Makanan("Macaron","manis dan lembut didalam", 30000,R.drawable.macaron));
        listMakanan.add(new Makanan("Spinach rice","menyehatkan", 40000,R.drawable.vegrice));
        listMakanan.add(new Makanan("Lobster","buttery dan gurih", 70000,R.drawable.lobster));
        listMakanan.add(new Makanan("pizza","pinggiran roti khas italia", 60000,R.drawable.pizza));
        listMakanan.add(new Makanan("pancake","empuk dan manis berpadu menjadi satu ", 40000,R.drawable.vegrice));

    }
    void data(){
        rMakanan = findViewById(R.id.rMenu);
        adapter = new Adapter(this,listMakanan);
        layoutManager = new LinearLayoutManager(this);
        rMakanan.setLayoutManager(layoutManager);
        rMakanan.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dummy();data();
    }
}
