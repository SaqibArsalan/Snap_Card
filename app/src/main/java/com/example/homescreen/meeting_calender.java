package com.example.homescreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class meeting_calender extends SingleFragment {
    @Override
    protected Fragment createFragement() {
        return new RecyclerFragment().newInstance();
    }
//
//    private static final String TAG = "JobsFeed";
//
//    private ArrayList<String> nNmaes = new ArrayList<>();
//    private ArrayList<Integer> nImageUrls = new ArrayList<>();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_meeting_calender);
//        initImageBitmaps();
//
//    }
//
//    private void initImageBitmaps() {
//        Log.d(TAG, "initImageBitmaps: preparing bitmaps");
//
//
//        nImageUrls.add(R.drawable.cheetos);
//        nNmaes.add("Cheetah");
//
//        nImageUrls.add(R.drawable.person_1);
//        nNmaes.add("First Person");
//
//
//        nImageUrls.add(R.drawable.person_2);
//        nNmaes.add("Second Person");
//
//        initRecyclerView();
//
//    }
//
//    private void initRecyclerView() {
//        Log.d(TAG, "initRecyclerView: init_recyclerView");
//        RecyclerView recyclerView = findViewById(R.id.recycler_view);
//        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, nNmaes, nImageUrls);
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//    }
//
//    public meeting_calender() {
//
//    }

}