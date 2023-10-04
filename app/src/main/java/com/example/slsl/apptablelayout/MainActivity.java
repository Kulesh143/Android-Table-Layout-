package com.example.slsl.apptablelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import Moddle.Users;

public class MainActivity extends AppCompatActivity {

    ArrayList<Users> usersArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usersArrayList = new ArrayList<>();

        usersArrayList.add(new Users("1", "Dilhari", "0783971169"));
        usersArrayList.add(new Users("2", "Jayathilaka", "0705713005"));
        usersArrayList.add(new Users("3", "Rashmi", "0770797878"));


    }

    public void addRow(View view) {
        TableLayout tableLayout = findViewById(R.id.tableLayout);

        for (Users users : usersArrayList) {
            TableRow tableRow = new TableRow(getApplicationContext());

            TextView textView = new TextView(getApplicationContext());
            TextView textView1 = new TextView(getApplicationContext());
            TextView textView2 = new TextView(getApplicationContext());

            textView.setText(users.getId());
            textView1.setText(users.getName());
            textView2.setText(users.getMobile());

            tableRow.addView(textView);
            tableRow.addView(textView1);
            tableRow.addView(textView2);


            tableLayout.addView(tableRow);
        }


//        TableRow tableRow = new TableRow(getApplicationContext());
//        TextView textView = new TextView(getApplicationContext());
//        textView.setText("kawili.lk");
//        textView.setTextSize(30);
//
//        tableRow.addView(textView);
//
//        TableLayout tableLayout = findViewById(R.id.tableLayout);
//        tableLayout.addView(tableRow);
    }

    public void addRowFromXml(View view) {
        TableLayout tableLayout = findViewById(R.id.tableLayout);

       // tableLayout.removeViews(1,tableLayout.getChildCount()-1); //methana tiyenne ptan gnna thani iwra wena thnai nemei. methna tiynne ptan gnna tnai mulu count gnanai. ekai -1 ghuwe

        for (final Users users : usersArrayList) {
            View row = LayoutInflater.from(this).inflate(R.layout.row, null);

            TextView textView4 = row.findViewById(R.id.textView4);
            TextView textView5 = row.findViewById(R.id.textView5);
            TextView textView6 = row.findViewById(R.id.textView6);

            textView4.setText(users.getId());
            textView5.setText(users.getName());
            textView6.setText(users.getMobile());

            Button button = row.findViewById(R.id.button3);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),users.getName(),Toast.LENGTH_SHORT).show();
                }
            });

            tableLayout.addView(row);
        }
    }

    public void listViewNext(View view) {
        Intent intent = new Intent(getApplicationContext(),listViews.class);
        startActivity(intent);

    }
}
