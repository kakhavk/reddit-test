package com.example.mac10.reddittest;

import java.io.InputStream;
import java.net.URL;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    private Button chooseInfoButton;
    private ImageView testimageview1;

    private static final int INFO_REQUEST_CODE=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chooseInfoButton=(Button) findViewById(R.id.choose_info_button);
        testimageview1=(ImageView) findViewById(R.id.testimageview1);

        chooseInfoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //startActivityForResult(new Intent(MainActivity.this, InfoActivity.class), INFO_REQUEST_CODE);
                new Thread(new Runnable(){
                    //@Override
                    public void run() {
                        final Bitmap bitmap=loadImageFromNetwork("http://xtreme.hiutils.org/images/logo/xtremetitle.jpg");
                        testimageview1.post(new Runnable() {
                            //@Override
                            public void run() {
                                testimageview1.setImageBitmap(bitmap);
                            }
                        });
                    }
                }).start();
            }
        });
    }

    private Bitmap loadImageFromNetwork(String url){
        try{
            Bitmap bitmap=BitmapFactory.decodeStream((InputStream) new URL(url).getContent());
            return bitmap;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){

        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==INFO_REQUEST_CODE){
            Toast.makeText(this, " INFO_REQUEST_CODE CODE="+INFO_REQUEST_CODE, Toast.LENGTH_SHORT).show();
            if(resultCode==RESULT_OK){
                Toast.makeText(this, "RESULT_OK="+RESULT_OK, Toast.LENGTH_LONG).show();
            }
        }else{
            Toast.makeText(this, "INFO REQUEST SAD ARIIIS", Toast.LENGTH_SHORT).show();
        }
    }
}

