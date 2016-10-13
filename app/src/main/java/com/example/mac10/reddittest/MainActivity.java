package com.example.mac10.reddittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


/*
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Integer clickCount=0;
    int[] colorLabels=new int[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView=(TextView) findViewById(R.id.textView1);
        Button button=(Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                colorLabels[0]=ContextCompat.getColor(MainActivity.this, R.color.colorAccent);
                colorLabels[1]=ContextCompat.getColor(MainActivity.this, R.color.colorGreen);
                colorLabels[2]=ContextCompat.getColor(MainActivity.this, R.color.colorPrimary);
                colorLabels[3]=ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDark);
                Random r=new Random();

                textView.setTextColor(colorLabels[r.nextInt(4)]);
                clickCount+=1;
                textView.setText("HIIIIIII"+clickCount);
            }
        });

    }


    @Override
    public void onClick(View v) {

    }
}
*/