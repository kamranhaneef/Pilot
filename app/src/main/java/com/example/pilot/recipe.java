package com.example.pilot;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.navigation.NavigationView;


public class recipe extends AppCompatActivity
{

    private TextView mTextMessage;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item)
        {
            switch (item.getItemId())
            {
                case R.id.navigation_home:
                {
                    Intent intent = new Intent(recipe.this, MainActivity.class);
                    startActivity(intent);
                    mTextMessage.setText(R.string.title_home);
                    return true;
                }
                case R.id.navigation_recipe:
                {
                    Intent intent = new Intent(recipe.this, recipe.class);
                    startActivity(intent);
                    mTextMessage.setText(R.string.title_recipe);
                    return true;
                }
                case R.id.navigation_notifications:
                {
                    Intent intent = new Intent(recipe.this, notification.class);
                    startActivity(intent);
                    mTextMessage.setText(R.string.title_recipe);
                    return true;
                }
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
