package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

        // Обработка системных баров
        public void onClick(View view) {
            Intent intent = new Intent(this, Frame_Animation.class);
            startActivity(intent);
        }
        public void onClick1(View view) {
        Intent intent = new Intent(this, Tween_Animation.class);
        startActivity(intent);
    }

}

