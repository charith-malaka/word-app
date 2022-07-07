package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ArrayList<ModelClass> modelClass = new ArrayList<>();
    int[] wordImages = {R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_background,
                        R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_background};

    //declare variable
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> wordList;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        //take the data
        setUpModelClass();

        //set adapter to recycler
        Adapter adapter = new Adapter(this, modelClass);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }


    private  void setUpModelClass()  {

        String[] wordNames = getResources().getStringArray(R.array.name_of_word);
        String[] wordDefinition = getResources().getStringArray(R.array.definition_of_word);
        String[] wordExample = getResources().getStringArray(R.array.example_of_word);

        for (int i = 0; i < wordNames.length; i++)   {

            modelClass.add(new ModelClass(wordNames[i], wordDefinition[i], wordExample[i], wordImages[i]));
        }


    }

}