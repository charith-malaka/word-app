package com.example.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    //variables for below constructor
    Context context;
    ArrayList<ModelClass> wordList;


    //creating constructor for adapter class
    public Adapter (Context context, ArrayList<ModelClass> wordList){

        this.context = context;
        this.wordList = wordList;
    }




    //inflate the design of layout resource file ("item_design.xml")
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //simple just follow through from previous code
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_design, parent, false);


        //view is our variable which was declared above line
        return new ViewHolder(view);
    }







    //bind data from main activity.java (MAY BE FROM RESOURCE)     to recycler view
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {


        //declare variables, give different names from model class
        //just follow through
        String id = wordList.get(position).getName();
        String meaning = wordList.get(position).getDefinition();
        String usage = wordList.get(position).getExample();
        int resources = wordList.get(position).getImageView1();

        //send data to holder
        //method for setData is at the bottom
        holder.setData(id,meaning,usage, resources);

    }







    @Override
    public int getItemCount() {

        //to inform how many items are there
        return wordList.size();
    }




    public class ViewHolder extends RecyclerView.ViewHolder{

        //assign model layout xml id into holder
        //choose any name
        private ImageView imageView11;
        private TextView textview11;
        private TextView textview211;
        private TextView textview311;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //assign model class id
            imageView11 = itemView.findViewById(R.id.imageview1);
            textview11 = itemView.findViewById(R.id.tv_name);
            textview211 = itemView.findViewById(R.id.tv_definition);
            textview311 = itemView.findViewById(R.id.tv_example);

        }




        //after creating method of setData
        public void setData(String id, String meaning, String usage, int resources ) {


            //set data to above variables
            //declared in onBindViewHolder

            textview11.setText(id);
            textview211.setText(meaning);
            textview311.setText(usage);
            imageView11.setImageResource(resources);

        }
    }
}
