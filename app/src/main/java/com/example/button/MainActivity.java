package com.example.button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.b1);
        btn.setOnClickListener(this);
        ConstraintLayout r = findViewById(R.id.root);
        r.setOnTouchListener(this);


    }


    @Override
    public void onClick(View v) {
        ConstraintLayout r = findViewById(R.id.root);
        r.setBackgroundColor(Color.BLUE);
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        ConstraintLayout r = findViewById(R.id.root);
        r.setBackgroundColor(Color.RED);
        return false;
    }
}
