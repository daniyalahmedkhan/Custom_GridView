package com.example.kashif.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Kashif on 11/2/2017.
 */

public class CustomAdapter extends BaseAdapter {

    private int images[];
    private String titles[];
    private Context context;
    private LayoutInflater layoutInflater;


    public CustomAdapter(Context context , int images[] , String titles[]){



        this.context = context;
        this.images = images;
        this.titles = titles;


    }



    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object getItem(int i) {
        return titles[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


      View GridView = view;

        if (view == null){


            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            GridView = layoutInflater.inflate(R.layout.custom_layout,null);

        }

        ImageView img  = (ImageView) GridView.findViewById(R.id.imageView);
        TextView txt = (TextView) GridView.findViewById(R.id.TextView);


        img.setImageResource(images[i]);

        txt.setText(titles[i]);

        return GridView;
    }
}
