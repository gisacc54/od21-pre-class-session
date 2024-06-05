package com.example.od21_class;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemReselectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                Toast.makeText(MainActivity.this, "All", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onNavigationItemReselected(@NonNull MenuItem item) {
        Toast.makeText(this, "All", Toast.LENGTH_SHORT).show();
        if (item.getItemId() == R.id.home){
            Toast.makeText(this, "Home Tab", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.search) {
            Toast.makeText(this, "Search Tab", Toast.LENGTH_SHORT).show();
        }else if (item.getItemId() == R.id.settings) {
            Toast.makeText(this, "Setting Tab", Toast.LENGTH_SHORT).show();
        }
    }
}