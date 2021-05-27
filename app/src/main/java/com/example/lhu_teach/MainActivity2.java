package com.example.lhu_teach;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ArrayList<String> sites = new ArrayList<String>();
    RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerview = findViewById(R.id.recyclerview);
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.add("Facebook");
        sites.add("Twitch");
        sites.add("Yahoo");
        sites.add("pornhub");
        sites.add("Youtube");
        sites.add("Microsoft");
        sites.add("IBM");
        sites.add("Android");
        sites.add("Apple");
        sites.add("Linux");
        sites.add("Ubuntu");
        sites.add("IOS");
        sites.add("Gmail");
        sites.add("Google Map");
        sites.add("Google Earth");

        MyAdapter myAdapter;
        myAdapter = new MyAdapter();
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(myAdapter);
    }

    private class MyAdapter extends RecyclerView.Adapter<MainActivity2.MyAdapter.ViewHolder> {

        public class ViewHolder extends RecyclerView.ViewHolder {
            TextView textView1;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                textView1 = itemView.findViewById(R.id.textView1);
            }
        }

        @NonNull
        @Override
        public MainActivity2.MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_item, parent, false);

            return new MainActivity2.MyAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MainActivity2.MyAdapter.ViewHolder holder, int position) {
            holder.textView1.setText("網站(有彩蛋)：" + sites.get(position));
        }

        @Override
        public int getItemCount() {
            return sites.size();
        }
    }
}