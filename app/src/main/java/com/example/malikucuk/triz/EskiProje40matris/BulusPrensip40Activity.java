package com.example.malikucuk.triz.EskiProje40matris;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.malikucuk.triz.R;

import java.util.ArrayList;
import java.util.List;

public class BulusPrensip40Activity extends AppCompatActivity {


    List<Card> lstCard ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulus_prensip40);


        lstCard = new ArrayList<>();
        lstCard.add(new Card("Segmentasyon","Kategori","Tanım",R.drawable.m1) );
        lstCard.add(new Card("Çıkarmak","Kategori","Tanım", R.drawable.m2) );
        lstCard.add(new Card("Lokal Kalite","Kategori","Tanım", R.drawable.m3) );
        lstCard.add(new Card("Asimetri","Kategori","Tanım", R.drawable.m4) );
        lstCard.add(new Card("Birleştirme","Kategori","Tanım", R.drawable.m5) );
        lstCard.add(new Card("Evrensellik","Kategori","Tanım", R.drawable.m6) );
        lstCard.add(new Card("Birbirinin içine girebilme","Kategori","Tanım", R.drawable.m7) );
        lstCard.add(new Card("Ağırlık dengeleme","Kategori","Tanım", R.drawable.m8) );
        lstCard.add(new Card("Önceden ters eylemli","Kategori","Tanım", R.drawable.m9) );
        lstCard.add(new Card("Ön Eylemli","Kategori","Tanım", R.drawable.m10) );
        lstCard.add(new Card("Yastıklama","Kategori","Tanım", R.drawable.m11) );
        lstCard.add(new Card("Eşit Potansiyellik","Kategori","Tanım", R.drawable.m12) );
        lstCard.add(new Card("Diğer Yoldan Dolanma","Kategori","Tanım", R.drawable.m13) );
        lstCard.add(new Card("Küresellik","Kategori","Tanım", R.drawable.m14) );
        lstCard.add(new Card("Dinamik,Dinamiklik","Kategori","Tanım", R.drawable.m15) );
        lstCard.add(new Card("Kısmi veya Aşırı eylem","Kategori","Tanım", R.drawable.m16) );
        lstCard.add(new Card("Diğer Boyut","Kategori","Tanım", R.drawable.m17) );
        lstCard.add(new Card("Mekanik Titreşim","Kategori","Tanım", R.drawable.m18) );
        lstCard.add(new Card("Periyodik Eylem","Kategori","Tanım", R.drawable.m19) );
        lstCard.add(new Card("Yararlı Eylemin Sürekliliği","Kategori","Tanım", R.drawable.m20) );
        lstCard.add(new Card("Acele ile/ Atlama","Kategori","Tanım", R.drawable.m21) );
        lstCard.add(new Card("Limondan Limonataya","Kategori","Tanım", R.drawable.m22) );
        lstCard.add(new Card("Geri Bildirim","Kategori","Tanım", R.drawable.m23) );
        lstCard.add(new Card("Aracı Kullanmak","Kategori","Tanım", R.drawable.m24) );
        lstCard.add(new Card("Self Servis","Kategori","Tanım", R.drawable.m25) );
        lstCard.add(new Card("Kopyalama","Kategori","Tanım", R.drawable.m26) );
        lstCard.add(new Card("Ucuz Kısa Ömürlü Nesneler","Kategori","Tanım", R.drawable.m27) );
        lstCard.add(new Card("Mekanik Yerine Koyma","Kategori","Tanım", R.drawable.m28) );
        lstCard.add(new Card("Pnömatik Hidrolik","Kategori","Tanım", R.drawable.m29) );
        lstCard.add(new Card("Esnek Filmler ve İnce Kabuk","Kategori","Tanım", R.drawable.m30) );
        lstCard.add(new Card("Gözenekli Materyal","Kategori","Tanım", R.drawable.m31) );
        lstCard.add(new Card("Renk Değiştirme","Kategori","Tanım", R.drawable.m32) );
        lstCard.add(new Card("Aynı Cins Olma/Homojenlik","Kategori","Tanım", R.drawable.m33) );
        lstCard.add(new Card("Atma ve Yeniden Alma","Kategori","Tanım", R.drawable.m34) );
        lstCard.add(new Card("Parametre Değişimi","Kategori","Tanım", R.drawable.m35) );
        lstCard.add(new Card("Faz Geçişleri","Kategori","Tanım", R.drawable.m36) );
        lstCard.add(new Card("Isıl Genleşme","Kategori","Tanım", R.drawable.m37) );
        lstCard.add(new Card("Kuvvetli Oksitlendiriciler","Kategori","Tanım", R.drawable.m38) );
        lstCard.add(new Card("Etkisiz Atmosfer","Kategori","Tanım", R.drawable.m39) );
        lstCard.add(new Card("Kompozit Malzemeler","Kategori","Tanım", R.drawable.m40) );




        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstCard);
        myrv.setLayoutManager(new GridLayoutManager(this,4));
        myrv.setAdapter(myAdapter);
    }
}
