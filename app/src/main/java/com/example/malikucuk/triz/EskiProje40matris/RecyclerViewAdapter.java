package com.example.malikucuk.triz.EskiProje40matris;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.malikucuk.triz.R;

import java.util.List;

/**
 * Created by MONSTER on 3.05.2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    private Context mContext ;
    private List<Card> mData ;

    public RecyclerViewAdapter(Context mContext, List<Card> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardveiw_item_book,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final Card model=mData.get(position);
        holder.tv_card_title.setText(mData.get(position).getTitle());
        holder.img_card_thumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.cv_tikla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(mContext, "Meraba"+model.getTitle(), Toast.LENGTH_SHORT).show();
                mContext.startActivity(new Intent(mContext,ParcalarDetayKaydir.class)
                .putExtra("pos",""+(position)));
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_card_title;
        ImageView img_card_thumbnail;

        CardView cv_tikla;
        public MyViewHolder(View itemView) {
            super(itemView);

            cv_tikla=itemView.findViewById(R.id.cv_tiklama);
            tv_card_title = (TextView) itemView.findViewById(R.id.card_title_id);
            img_card_thumbnail =(ImageView) itemView.findViewById(R.id.card_img_id);
        }
    }
}
