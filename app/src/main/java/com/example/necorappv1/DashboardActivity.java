package com.example.necorappv1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {

    Toolbar toolbar;
    private CardView cardViewRoad;
    private CardView cardViewPlane;
    private CardView cardViewTrain;
    private CardView cardViewEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        toolbar = findViewById(R.id.toolbar_daashboard);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);


        cardViewRoad = findViewById(R.id.road);
        cardViewRoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "Bus Selected", Toast.LENGTH_SHORT).show();
            }
        });

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.custom_menu, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if(item.getItemId() == R.id.nav_settings){
//            //Add code here
//            Toast.makeText(this,"Settings Clicked", Toast.LENGTH_SHORT).show();
//
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}