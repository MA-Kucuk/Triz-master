package com.example.malikucuk.triz.EskiProje40matris;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.example.malikucuk.triz.R;

import java.util.ArrayList;
import java.util.List;

public class ParcalarDetayKaydir extends AppCompatActivity {

    ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcalar_detay_kaydir);
        pager=findViewById(R.id.vp_sayfala);
        Intent i=getIntent();
        String pos=i.getStringExtra("pos");
        Log.e("Parcalar"," pos : "+pos);
        ana40(Integer.parseInt(pos));

    }
    int durum;
    private void ana40(final int pos){

        final List<Integer > resimler=new ArrayList<>();
        resimler.add(R.drawable.resimbiron);
        resimler.add(R.drawable.resimikionn);
        resimler.add(R.drawable.resimucon);
        resimler.add(R.drawable.resimdorton);
        resimler.add(R.drawable.resimbeson);
        resimler.add(R.drawable.resimaltion);
        resimler.add(R.drawable.resimyedion);
        resimler.add(R.drawable.c8);
        resimler.add(R.drawable.c9);
        resimler.add(R.drawable.c10);
        resimler.add(R.drawable.c11);
        resimler.add(R.drawable.c12);
        resimler.add(R.drawable.c13);
        resimler.add(R.drawable.c14);
        resimler.add(R.drawable.c15);
        resimler.add(R.drawable.c16);
        resimler.add(R.drawable.c17);
        resimler.add(R.drawable.c18);
        resimler.add(R.drawable.c19);
        resimler.add(R.drawable.c20);
        resimler.add(R.drawable.c21);
        resimler.add(R.drawable.c22);
        resimler.add(R.drawable.c23);
        resimler.add(R.drawable.c24);
        resimler.add(R.drawable.c25);
        resimler.add(R.drawable.c26);
        resimler.add(R.drawable.c27);
        resimler.add(R.drawable.c28);
        resimler.add(R.drawable.c29);
        resimler.add(R.drawable.c30);
        resimler.add(R.drawable.c31);
        resimler.add(R.drawable.c32);
        resimler.add(R.drawable.c33);
        resimler.add(R.drawable.c34);
        resimler.add(R.drawable.c35);
        resimler.add(R.drawable.c36);
        resimler.add(R.drawable.c37);
        resimler.add(R.drawable.c38);
        resimler.add(R.drawable.c39);
        resimler.add(R.drawable.c40);


        final List<Integer> resimler_arka=new ArrayList<>();
        resimler_arka.add(R.drawable.resimbirarka);
        resimler_arka.add(R.drawable.resimikiarka);
        resimler_arka.add(R.drawable.resimucarka);
        resimler_arka.add(R.drawable.resimdortarka);
        resimler_arka.add(R.drawable.resimbesarka);
        resimler_arka.add(R.drawable.resimaltiarka);
        resimler_arka.add(R.drawable.resimyediarka);
        resimler_arka.add(R.drawable.b8);
        resimler_arka.add(R.drawable.b9);
        resimler_arka.add(R.drawable.b10);
        resimler_arka.add(R.drawable.b11);
        resimler_arka.add(R.drawable.b12);
        resimler_arka.add(R.drawable.b13);
        resimler_arka.add(R.drawable.b14);
        resimler_arka.add(R.drawable.b15);
        resimler_arka.add(R.drawable.b16);
        resimler_arka.add(R.drawable.b17);
        resimler_arka.add(R.drawable.b18);
        resimler_arka.add(R.drawable.b19);
        resimler_arka.add(R.drawable.b20);
        resimler_arka.add(R.drawable.b21);
        resimler_arka.add(R.drawable.b22);
        resimler_arka.add(R.drawable.b23);
        resimler_arka.add(R.drawable.b24);
        resimler_arka.add(R.drawable.b25);
        resimler_arka.add(R.drawable.b26);
        resimler_arka.add(R.drawable.b27);
        resimler_arka.add(R.drawable.b28);
        resimler_arka.add(R.drawable.b29);
        resimler_arka.add(R.drawable.b30);
        resimler_arka.add(R.drawable.b31);
        resimler_arka.add(R.drawable.b32);
        resimler_arka.add(R.drawable.b33);
        resimler_arka.add(R.drawable.b34);
        resimler_arka.add(R.drawable.b35);
        resimler_arka.add(R.drawable.b36);
        resimler_arka.add(R.drawable.b37);
        resimler_arka.add(R.drawable.b38);
        resimler_arka.add(R.drawable.b39);
        resimler_arka.add(R.drawable.b40);


        pager.setAdapter(new CustomPagerAdapter(this,resimler,resimler_arka));
        pager.setCurrentItem(pos);

        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Log.e("scrolled","pos :"+position);
            }

            @Override
            public void onPageSelected(final int position) {
               Log.e("selected","pos :"+position);
                final ImageView iv_resim=pager.findViewById(R.id.iv_resimler);
                iv_resim.setImageDrawable(getResources().getDrawable(resimler.get(position)));
                //Log.e("adaptör","şuan yüklenen sayfa : "+position);
                //iv_resim.setBackgroundResource(list_.get(position));

            }

            @Override
            public void onPageScrollStateChanged(int state) {
                Log.e("changed","pos :"+state);
            }
        });
    }
}
