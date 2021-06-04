package com.asbelogur.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TableActivity extends AppCompatActivity {

    TextView cell1, cell2, cell3, cell4, cell5, cell6, cell7, cell8, cell9, cell10, cell11, cell12;

    Button button_graph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        cell1 = findViewById(R.id.column1);
        cell1.setText("First Column");

        cell2 = findViewById(R.id.column2);
        cell2.setText("Second Column");

        cell3 = findViewById(R.id.column3);
        cell3.setText("Third Column");

        cell4 = findViewById(R.id.column11);
        cell4.setText("First Column");

        cell5 = findViewById(R.id.column12);
        cell5.setText("Second Column");

        cell6 = findViewById(R.id.column13);
        cell6.setText("Third Column");

        cell7 = findViewById(R.id.column21);
        cell7.setText("First Column");

        cell8 = findViewById(R.id.column22);
        cell8.setText("Second Column");

        cell9 = findViewById(R.id.column23);
        cell9.setText("Third Column");

        cell10 = findViewById(R.id.column31);
        cell10.setText("First Column");

        cell11 = findViewById(R.id.column32);
        cell11.setText("Second Column");

        cell12 = findViewById(R.id.column33);
        cell12.setText("Third Column");

        button_graph = findViewById(R.id.button_graph);

        View.OnClickListener oCL = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TableActivity.this, MainActivity.class);
                startActivity(intent);
            }
        };

        button_graph.setOnClickListener(oCL);
    }
}