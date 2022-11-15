package com.example.kt1_2050531200101_nguyentienan;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
    private RecyclerView rcvSong;
    private Adapter songAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        rcvSong = findViewById(R.id.listsong);
        songAdapter = new Adapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvSong.setLayoutManager(linearLayoutManager);

        songAdapter.setData(getlistSong());
        rcvSong.setAdapter(songAdapter);


    }
    private List<singer> getlistSong() {
        List<singer> list = new ArrayList<>();
        list.add((new singer("Nguyễn Thanh Tùng", "Son Tung Mtp", "5 sao", R.drawable.anh1_1)));
        list.add((new singer("Nguyễn Việt Hoàng", "Mono", "4 sao", R.drawable.mono)));
        list.add((new singer("Nguyễn Hoàng Long", "Low G","5 sao", R.drawable.lowg)));
        list.add((new singer("Trần Minh Hiếu", "HIEUTHU2", "5 sao", R.drawable.ht2)));
        list.add((new singer("Phạm Lưu Tuấn Tài", "Issac", "5 sao", R.drawable.issac)));
        list.add((new singer("Trịnh Trần Phương Tuấn", "Jack 5 củ", "1 sao", R.drawable.jack)));
        return list;
    }

}