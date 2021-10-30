package com.example.tugas4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MovieAdapter adapter;
    private ArrayList<Movie> movieArrayListArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView)findViewById(R.id.recycleview);
        adapter = new MovieAdapter(movieArrayListArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        movieArrayListArrayList= new ArrayList<>();
        movieArrayListArrayList.add(new Movie("DC", "Asal Negara : Amerika", "Super Hiro.",R.drawable.dc));
        movieArrayListArrayList.add((new Movie("Luca","Asal Negara: Italy", "Animatid Cartoon.",R.drawable.disny)));
        movieArrayListArrayList.add((new Movie("Yowis Ben", "Asal Negara: Indonesia", "Komedi Drama.",R.drawable.yowisben)));
    }
}