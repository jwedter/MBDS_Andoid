package com.google.jerome.wedter.tp01_jerome_wedter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private Button buttonToast;
    private Button buttonInc;
    private TextView textViewCount;
    private int counter;

    private void initViews() {
        buttonToast = findViewById(R.id.toast);
        buttonInc = findViewById(R.id.increment);
        textViewCount = findViewById(R.id.textCounter);
        buttonInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //incrémenter la valeur du compteur puis mettre à jour le text
                 counter++;
                textViewCount.setText(""+counter);
            }


        });
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, counter + " " + "Click", Toast.LENGTH_SHORT).show();
            }
        });
    }
}