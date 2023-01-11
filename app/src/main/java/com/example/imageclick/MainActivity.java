package com.example.imageclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    ImageView iv;
    int arr[]={R.drawable.celebration2,R.drawable.cake,R.drawable.balloons};
    int pos=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv= (ImageView) findViewById(R.id.imageView2);
    }

    public void changeimg(View view){;
        iv.setVisibility(View.VISIBLE);

        iv.setImageResource(arr[pos]);
        pos++;
        pos = pos % 3;
    }
}