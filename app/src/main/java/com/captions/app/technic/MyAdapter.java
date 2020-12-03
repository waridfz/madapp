package com.captions.app.technic;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.captions.app.technic.categories.Attitude;
import com.captions.app.technic.categories.bestfriend;
import com.captions.app.technic.categories.birthday;
import com.captions.app.technic.categories.bold;
import com.captions.app.technic.categories.Couple;
import com.captions.app.technic.categories.family;
import com.captions.app.technic.categories.Funny;
import com.captions.app.technic.categories.GoodMorning;
import com.captions.app.technic.categories.GoodNight;
import com.captions.app.technic.categories.Love;
import com.captions.app.technic.categories.religious;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    private Context c;
    private ArrayList<Model> models;

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // convert XML to OBJ
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_item, null);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        // create bind view/data
        holder.img.setImageResource(models.get(position).getImage());
        holder.modelTitle.setText(models.get(position).getTitle());

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {

                switch (models.get(pos).getTitle()){
                    case "Attitude": {
                        Intent intent = new Intent(c, Attitude.class);
                        c.startActivity(intent);
                        break;
                    }

                    case "Best Friend": {
                        Intent intent = new Intent(c, bestfriend.class);
                        c.startActivity(intent);
                        break;
                    }
                    case "Birthday": {
                        Intent intent = new Intent(c, birthday.class);
                        c.startActivity(intent);
                        break;
                    }
                    case "Bold": {
                        Intent intent = new Intent(c, bold.class);
                        c.startActivity(intent);
                        break;
                    }
                    case "Couple": {
                        Intent intent = new Intent(c, Couple.class);
                        c.startActivity(intent);
                        break;
                    }

                    case "Family": {
                        Intent intent = new Intent(c, family.class);
                        c.startActivity(intent);
                        break;
                    }

                    case "Funny": {
                        Intent intent = new Intent(c, Funny.class);
                        c.startActivity(intent);
                        break;
                    }

                    case "Good Morning": {
                        Intent intent = new Intent(c, GoodMorning.class);
                        c.startActivity(intent);
                        break;
                    }
                    case "Good Night": {
                        Intent intent = new Intent(c, GoodNight.class);
                        c.startActivity(intent);
                        break;
                    }
                    case "Love": {
                        Intent intent = new Intent(c, Love.class);
                        c.startActivity(intent);
                        break;
                    }
                    case "Religious": {
                        Intent intent = new Intent(c, religious.class);
                        c.startActivity(intent);
                        break;
                    }


                }


            }
        });

    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
