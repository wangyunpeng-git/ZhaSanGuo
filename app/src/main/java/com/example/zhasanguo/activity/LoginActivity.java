package com.example.zhasanguo.activity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.zhasanguo.MainActivity;
import com.example.zhasanguo.R;

public class LoginActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }
        /**
         * 界面全屏
         */
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        /**
         * 响应Button点击
         */
        ImageButton shoujiButton = findViewById(R.id.shoujidenglu_bt);
        ImageButton weixinButton = findViewById(R.id.weixindenglu_bt);
        shoujiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SchemaActivity.class);
                startActivity(intent);
                finish();
            }
        });
        weixinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,  SchemaActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


}
