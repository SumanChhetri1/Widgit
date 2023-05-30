package com.example.widgit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class GridViewExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        GridView gridView=findViewById(R.id.grid);
        getSupportActionBar().hide();
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(GridViewExample.this, "Click me", Toast.LENGTH_SHORT).show();
                Intent FullImageIntent=new Intent(getApplicationContext(),FullImage.class);
                FullImageIntent.putExtra("id",i);
                startActivity(FullImageIntent);

            }
        });
    }
}