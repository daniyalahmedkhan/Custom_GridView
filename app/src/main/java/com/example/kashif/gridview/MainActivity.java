package com.example.kashif.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {


    GridView gridView;

    String letters[] = {"Dog One" , "Dog Two" , "Dog Three" , "Dog Four" , "Dog Five" , "Dog Six" , "Cats" , "Dog" , "Horse" , "Puppies" , "Parrotes" , "Rabbits"};


    int imgs[] = { R.mipmap.dog_one , R.mipmap.dog_two , R.mipmap.dog_three , R.mipmap.dog_four,

    R.mipmap.dog_five , R.mipmap.dog_six , R.mipmap.pets_cats , R.mipmap.pets_dog , R.mipmap.pets_horse , R.mipmap.pets_puppies , R.mipmap.pets_parrotes , R.mipmap.pets_rabbits};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridView);

        gridView.setAdapter(new CustomAdapter(MainActivity.this, imgs, letters));

    }
}
