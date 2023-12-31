package com.example.exception2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list.add("ITEM1");
        list.add("ITEM2");
        list.add("ITEM3");
        list.add("ITEM4");
        for(int i=0;i<5;i++) {
            try {
                list.get(i);
            } catch (Exception e) {
                Toast.makeText(this, "Exception caught", Toast.LENGTH_LONG).show();
            }
        }
    }
}