package com.example.kt1_2050531200101_nguyentienan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.SongViewHoder> {

    private Context mContext;
    private List<singer> mListSong;

    public Adapter(Context mContext) {
        this.mContext = mContext;
    }
    public void  setData(List<singer> list){
        this.mListSong = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SongViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()) .inflate(R.layout.item,parent,false);
        return new SongViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHoder holder, int position) {
        singer music = mListSong.get(position);
        if ( music == null){
            return;
        }
        holder.imgSong.setImageResource(music.getImg());
        holder.songName.setText(music.getTenbai());
        holder.i4Song.setText(music.getInfor());
        holder.ctgory.setText(music.getTacgia());

    }

    @Override
    public int getItemCount() {
        if (mListSong != null){
            return  mListSong.size();
        }
        return 0;
    }

    public class SongViewHoder extends RecyclerView.ViewHolder {

        private ImageView imgSong;
        private TextView songName;
        private  TextView i4Song;
        private  TextView ctgory;



        public SongViewHoder(@NonNull View itemView) {
            super(itemView);
            imgSong =itemView.findViewById(R.id.imgAvatar);
            songName =itemView.findViewById(R.id.name);
            i4Song =itemView.findViewById(R.id.nghedanh);
            ctgory =itemView.findViewById(R.id.sosao);
        }
    }

}