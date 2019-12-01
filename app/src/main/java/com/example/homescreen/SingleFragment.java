package com.example.homescreen;

import android.os.Bundle;

import javax.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public abstract  class SingleFragment extends AppCompatActivity {
    protected abstract Fragment createFragement();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recylerview); //class jis mein fragment layout hoga

        FragmentManager fm = getSupportFragmentManager();
       // Fragment fragment = fm.findFragmentById(R.id.fragment_container);

//        if(fragment == null) {
//            fragment = createFragement();
//            fm.beginTransaction().add(R.id.fragment_container,fragment).commit();


        }

    }

