package com.android.rexben.bookapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TableOfContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_of_content);
    }

    public void parable(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void twosome(View view) {
        startActivity(new Intent(this, Main2Activity.class));
    }

    public void hard(View view) {
        startActivity(new Intent(this, Main3Activity.class));
    }

    public void child(View view) {
        startActivity(new Intent(this, Main3Activity.class));
    }
}
