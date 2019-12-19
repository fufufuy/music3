package com.example.admin184.music;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoundActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foundmusic);
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
                startActivity(new Intent(FoundActivity.this,MusicActivity.class));
                finish();
            }
        });
        fin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoundActivity.this,FoundActivity.class));
                finish();
            }
        });
        my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FoundActivity.this,MineActivity.class);
                startActivity(intent);
            }
        });
    }
}
