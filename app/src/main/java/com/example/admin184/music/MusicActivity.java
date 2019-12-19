package com.example.admin184.music;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.admin184.music.play.MediaPlayerActivity;

public class MusicActivity extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState ){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_activity);
        butt();

    }

    public void butt() {
        Button mus;
        Button fin;
        Button my;
         mus = (Button) findViewById(R.id.mus_bt);
         fin = (Button) findViewById(R.id.found_bt);
         my=(Button)findViewById(R.id.mine_bt);
         mus.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                startActivity(new Intent(MusicActivity.this,MediaPlayerActivity.class));
                finish();
             }
         });
        fin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MusicActivity.this,FoundActivity.class));
                finish();
            }
        });
        my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MusicActivity.this,MineActivity.class);
                startActivity(intent);
            }
        });
    }


}


