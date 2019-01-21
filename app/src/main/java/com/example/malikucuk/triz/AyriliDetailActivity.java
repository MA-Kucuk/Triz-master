package com.example.malikucuk.triz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AyriliDetailActivity extends AppCompatActivity {

    ImageView iv_myImage;
    int resim1Res,resim2Res;

    boolean state=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayrili_detail);
        iv_myImage=findViewById(R.id.iv_detail_myImage);

        if (getIntent()!=null){
            resim1Res=getIntent().getIntExtra("resim1",0);
            resim2Res=getIntent().getIntExtra("resim2",0);
            iv_myImage.setImageResource(resim1Res);
        }

        iv_myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (state){
                    //demekki ön resim açık
                    iv_myImage.setImageResource(resim2Res);
                    state=false;
                }else {
                    //demeekki arka resim açık
                    iv_myImage.setImageResource(resim1Res);
                    state=true;
                }
            }
        });
    }
}
