package com.example.umadevi.briscolagame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;

import static com.example.umadevi.briscolagame.R.id.button1;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 =(Button)findViewById(R.id.button1);
        Button button2 =(Button)findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener()
        {
               @Override
               public void onClick(View view)
               {
                 Intent intent1=new Intent(MainActivity.this,Aboutgame.class);
                 startActivity(intent1);
                   final MediaPlayer mediaPlayer= MediaPlayer.create(MainActivity.this,R.raw.sample);
                   mediaPlayer.start();
               }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
                @Override
                public void onClick(View view)
                {
                  Intent intent2=new Intent(MainActivity.this,Newgame.class);
                  startActivity(intent2);
                  final MediaPlayer mediaPlayer= MediaPlayer.create(MainActivity.this,R.raw.sample2);
                  mediaPlayer.start();
                }
        });

    }
}

