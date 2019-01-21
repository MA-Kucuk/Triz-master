package com.example.malikucuk.triz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import com.example.malikucuk.triz.EskiProje40matris.BulusPrensip40Activity;

public class Main2Activity extends AppCompatActivity {

    Button bt_bulus40x;
    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bt_bulus40x=findViewById(R.id.bt_bulusprensip);
        bulus40xClisckListener();
    }
    private void bulus40xClisckListener(){
        bt_bulus40x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),BulusPrensip40Activity.class));
            }
        });
    }
    public void toMatrix(View view) {


        Intent intent = new Intent(this, Matrix.class);

        startActivity(intent);
    }
    public void ayrilik_prensipleri(View view) {


        Intent intent = new Intent(this, AyrilikPrensipleriActivity.class);

        startActivity(intent);
    }
}
