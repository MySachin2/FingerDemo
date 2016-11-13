package com.example.gd.fingerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Bineesh P Babu on 13-11-2016.
 */

public class New extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
    }
    public void opennew (View v){
        Intent i= new Intent(this,MainActivity.class);
        startActivity(i);
    }
}