package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] languages ={"Java","Python","Dart","JavaScript","C#","C","Swift","C++"};
        recyclerView.setAdapter(new ProgrammingAdapter(languages));
    }
}
