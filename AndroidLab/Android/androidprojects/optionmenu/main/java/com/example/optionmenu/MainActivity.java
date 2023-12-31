package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.profile:
                Intent intent = new Intent(MainActivity.this,profile.class);
                startActivity(intent);
                break;
            case R.id.settings:
                Intent intent1 = new Intent(MainActivity.this,settings.class);
                startActivity(intent1);
                break;
            case R.id.about:
                Intent intent2 = new Intent(MainActivity.this,about.class);
                startActivity(intent2);
                break;



        }
        return super.onOptionsItemSelected(item);
    }
}