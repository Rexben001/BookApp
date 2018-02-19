package com.android.rexben.bookapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void next_four(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void previous_three(View view) {
        startActivity(new Intent(this, TableOfContent.class));
    }
}
