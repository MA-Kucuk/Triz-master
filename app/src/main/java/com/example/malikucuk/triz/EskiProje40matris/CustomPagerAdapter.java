package com.example.malikucuk.triz.EskiProje40matris;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.malikucuk.triz.R;

import java.util.List;

/**
 * Created by MONSTER on 16.06.2018.
 */

public class CustomPagerAdapter extends PagerAdapter {

    Context context;
    List<Integer> list_on;
    List<Integer> list_arka;

    public CustomPagerAdapter(Context context, List<Integer> list_, List<Integer> list_arka) {
        this.context = context;
        this.list_on = list_;
        this.list_arka=list_arka;
    }
    int durum=0;// resim ön durumunda
    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.sayfalama_adapter_item,container, false);
        final ImageView iv_resim=layout.findViewById(R.id.iv_resimler);
        iv_resim.setImageDrawable(context.getResources().getDrawable(list_on.get(position)));
        durum=0;
        iv_resim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (durum==0){// on durumundaysa arkaya dönsün
                    iv_resim.setImageDrawable(context.getResources().getDrawable(list_arka.get(position)));
                    durum=1;
                }else {//arka durumundayken on durumuna dnsün
                    iv_resim.setImageDrawable(context.getResources().getDrawable(list_on.get(position)));
                    durum=0;
                }
            }
        });

        container.addView(layout);
        return layout;
        //return super.instantiateItem(container, position);
    }

    @Override
    public int getCount() {
        return list_on.size();
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
        //super.destroyItem(container, position, object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
}
