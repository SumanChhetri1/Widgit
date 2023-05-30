package com.example.widgit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    String name[]={"Nepal","India","Bhutan","Pakistan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView= findViewById(R.id.list);
        ArrayAdapter arrayAdapter=new ArrayAdapter<String>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,name);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent firstintent= new Intent(getApplicationContext(),Nepal.class);
                    startActivity(firstintent);
                }
                if(i==1){
                    Intent secondintend=new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/India"));
                    startActivity(secondintend);
                }
            }
        });
        

    }
}