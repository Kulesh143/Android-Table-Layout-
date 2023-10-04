package com.example.slsl.apptablelayout;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import Moddle.user_resycleView;

public class listViews extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_views);

        ArrayList<user_resycleView> userResycleViewsArray;

        user_resycleView userResycleView = new user_resycleView("1", "Dilhari", "0783971169", "Female", "Kandy");
        user_resycleView userResycleView1 = new user_resycleView("2", "Jayathilaka", "0717044250", "Male", "Galle");
        user_resycleView userResycleView2 = new user_resycleView("3", "Rashmi", "0770797878", "Female", "Colombo");

        userResycleViewsArray = new ArrayList<>();

        userResycleViewsArray.add(userResycleView);
        userResycleViewsArray.add(userResycleView1);
        userResycleViewsArray.add(userResycleView2);
        userResycleViewsArray.add(new user_resycleView("4", "Kalyani", "071454158", "Female", "Borella"));
        userResycleViewsArray.add(new user_resycleView("5", "Nemika", "075695445", "Male", "Miirigama"));

        RecyclerView recyclerView = findViewById(R.id.RecycleView11);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        recycleUserViewAdapter adapter = new recycleUserViewAdapter(userResycleViewsArray);
        recyclerView.setAdapter(adapter);
    }
}

class recyleViewHolder extends RecyclerView.ViewHolder {

    public ImageView itemViewImageView;

    public TextView itemViewId;
    public TextView itemViewName;
    public TextView itemViewMobile;
    public TextView itemViewCity;

    public Button itemViewButton;

    public recyleViewHolder(@NonNull View itemView) {
        super(itemView);

        itemViewImageView = itemView.findViewById(R.id.imageView3);

        itemViewId = itemView.findViewById(R.id.textView15);
        itemViewName = itemView.findViewById(R.id.textView13);
        itemViewMobile = itemView.findViewById(R.id.textView14);
        itemViewCity = itemView.findViewById(R.id.textView16);

        itemViewButton = itemView.findViewById(R.id.button5);
    }
}

class recycleUserViewAdapter extends RecyclerView.Adapter {

    ArrayList<user_resycleView> user_resycleViewsArraysss;

    public recycleUserViewAdapter(ArrayList<user_resycleView> user_resycleViewsArraysss) {
        this.user_resycleViewsArraysss = user_resycleViewsArraysss;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {



       /* LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());

        View view = layoutInflater.inflate(R.layout.activity_list_views, viewGroup, false);*/
       /* View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_list_views,viewGroup,false);

        recyleViewHolder recyleViewHolder = new recyleViewHolder(view);
        recycleUserViewAdapter recycleUserViewAdapter = new recycleUserViewAdapter(user_resycleViewsArraysss);*/

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        user_resycleView userResycleView = user_resycleViewsArraysss.get(i);
        recyleViewHolder recyleViewHolder = (com.example.slsl.apptablelayout.recyleViewHolder) viewHolder;

        ((recyleViewHolder) viewHolder).itemViewCity.setText(userResycleView.getCity());
        ((recyleViewHolder) viewHolder).itemViewId.setText(userResycleView.getId());
        ((recyleViewHolder) viewHolder).itemViewName.setText(userResycleView.getName());
        ((recyleViewHolder) viewHolder).itemViewMobile.setText(userResycleView.getMobile());

        if (userResycleView.getGender().equalsIgnoreCase("Male")) {
            ((recyleViewHolder) viewHolder).itemViewImageView.setImageResource(R.drawable.ic_male);
        } else {
            ((recyleViewHolder) viewHolder).itemViewImageView.setImageResource(R.drawable.ic_female);
        }
    }

    @Override
    public int getItemCount() {

        return user_resycleViewsArraysss.size();

    }
}
