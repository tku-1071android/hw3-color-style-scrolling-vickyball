package com.example.myapplicationch4;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView texR,texG,texB,tev;
    String text="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texR=findViewById(R.id.textView);
        texG=findViewById(R.id.textView2);
        texB=findViewById(R.id.textView3);
        tev=findViewById(R.id.textView5);
    }
    public void  changecolor(View v){
        Random x=new Random();
        int red=x.nextInt(256);
        texR.setText("Red:"+red);
        texR.setTextColor(Color.rgb(red,0,0));

        int green=x.nextInt(256);
        texG.setText("Green:"+green);
        texG.setTextColor(Color.rgb(0,green,0));

        int blue=x.nextInt(256);
        texB.setText("Blue:"+blue);
        texB.setTextColor(Color.rgb(0,0,blue));

        text+=red+","+green+","+blue+"\n";
        tev.setTextSize(16);
        tev.setText(text);
        tev.setMovementMethod(new ScrollingMovementMethod());
        tev.setBackgroundColor(Color.rgb(red,green,blue));
    }



}
