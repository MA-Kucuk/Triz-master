package com.example.malikucuk.triz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class cards extends AppCompatActivity {
    boolean b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);

        b = false;
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int id = extras.getInt("id");
        ImageButton imgb = (ImageButton) findViewById(R.id.imageButton);
        int cardID = getResources().getIdentifier("c" + id, "drawable", getPackageName());
        imgb.setImageResource(cardID);


    }

    public void backcard(View view) {
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int id = extras.getInt("id");
        int backID = getResources().getIdentifier("b" + id, "drawable", getPackageName());
        int cardID = getResources().getIdentifier("c" + id, "drawable", getPackageName());
        ImageButton imgb = (ImageButton) findViewById(R.id.imageButton);
        if (!b) {
            imgb.setImageResource(backID);
            b = true;
        } else {
            imgb.setImageResource(cardID);
            b = false;
        }


    }
}
