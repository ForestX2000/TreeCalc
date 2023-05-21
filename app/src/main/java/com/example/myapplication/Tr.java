package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tr);
    }

    public void ToTr_1(View view) {
        Intent intent = new Intent(this, Tr_1.class);
        startActivity(intent);
    }

   /* public void ToTr_2(View view) {
      Intent intent = new Intent(this, Tr.class);
        startActivity(intent);
    }

    public void ToTr_3(View view) {
        Intent intent = new Intent(this, Tr.class);
        startActivity(intent);
    }

    public void ToTr_4(View view) {
        Intent intent = new Intent(this, Tr.class);
        startActivity(intent);
    }

    public void ToTr_5(View view) {
        Intent intent = new Intent(this, Tr.class);
        startActivity(intent);
    }

    public void ToTr_6(View view) {
        Intent intent = new Intent(this, Tr.class);
        startActivity(intent);
    }
/
*/
}