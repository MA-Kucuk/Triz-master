package com.example.malikucuk.triz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AyrilikPrensipleriActivity extends AppCompatActivity {

    Button bt_ayrilik1,bt_ayrilik2,bt_ayrilik3,bt_ayrilik4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ayrilik_prensipleri);

        bt_ayrilik1=findViewById(R.id.ayrilik1);
        bt_ayrilik2=findViewById(R.id.ayrilik2);
        bt_ayrilik3=findViewById(R.id.ayrilik3);
        bt_ayrilik4=findViewById(R.id.ayrilik4);

        ayr1Click();
        ayr2Click();
        ayr3Click();
        ayr4Click();
    }
    private void ayr1Click(){
        bt_ayrilik1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AyriliDetailActivity.class);
                intent.putExtra("resim1",R.drawable.ayr1);
                intent.putExtra("resim2",R.drawable.ayr11);
                startActivity(intent);

            }
        });
    }private void ayr2Click(){
        bt_ayrilik2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AyriliDetailActivity.class);
                intent.putExtra("resim1",R.drawable.ayr2);
                intent.putExtra("resim2",R.drawable.ayr22);
                startActivity(intent);

            }
        });
    }private void ayr3Click(){
        bt_ayrilik3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AyriliDetailActivity.class);
                intent.putExtra("resim1",R.drawable.ayr3);
                intent.putExtra("resim2",R.drawable.ayr33);
                startActivity(intent);

            }
        });
    }private void ayr4Click(){
        bt_ayrilik4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AyriliDetailActivity.class);
                intent.putExtra("resim1",R.drawable.ayr4);
                intent.putExtra("resim2",R.drawable.ayr44);
                startActivity(intent);

            }
        });
    }
}
