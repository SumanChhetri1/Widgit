package com.example.widgit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class FullImage extends AppCompatActivity {
    ImageView fullImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        fullImage=findViewById(R.id.full_image);

        Intent i= getIntent();
        int position= i.getExtras().getInt("id");
        ImageAdapter imageAdapter=new ImageAdapter(this);
        fullImage.setImageResource(imageAdapter.image[position]);
    }
}