package com.rohan.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class funds extends AppCompatActivity {
    boolean setvisibility;
    ImageView visibility;
    TextView paisa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funds);
        paisa=findViewById(R.id.textView7);
        visibility=findViewById(R.id.imageView3);
        visibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setvisibility = !setvisibility;
                if (setvisibility) {
                    paisa.setText("Rs 4500");
                } else {
                    paisa.setText("****");
                }
            }


    });
    }
    }
