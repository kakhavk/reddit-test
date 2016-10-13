package com.example.mac10.reddittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class InfoActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView info1view, info2view, info3view;
    private LinearLayout info1layout, info2layout, info3layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }

    private void findViews(){
        info1view=(TextView) findViewById(R.id.info1_name);
        info2view=(TextView) findViewById(R.id.info2_name);
        info3view=(TextView) findViewById(R.id.info3_name);

        info1layout=(LinearLayout) findViewById(R.id.info1_layout);
        info2layout=(LinearLayout) findViewById(R.id.info2_layout);
        info3layout=(LinearLayout) findViewById(R.id.info3_layout);

        info1layout.setOnClickListener(this);
        info2layout.setOnClickListener(this);
        info3layout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent();
        String info;
        int imageId;


            if(v==info1layout) {
                info = info1view.getText().toString();
                imageId = R.mipmap.bu;
            }else if(v==info1layout) {
                info = info2view.getText().toString();
                imageId = R.mipmap.cikvi;
            }else if(v==info1layout) {
                info = info3view.getText().toString();
                imageId = R.mipmap.tevzi;
            }

    }
}
