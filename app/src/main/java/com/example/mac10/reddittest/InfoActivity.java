package com.example.mac10.reddittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class InfoActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout lr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        LinearLayout rl=(LinearLayout) findViewById(R.id.lr1);

        lr=(LinearLayout) findViewById(R.id.lr1);
        lr.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent();

        setResult(RESULT_OK, intent);
        finish();
    }

    public void onCancel(View view){
        setResult(RESULT_CANCELED);
        finish();
    }
}
