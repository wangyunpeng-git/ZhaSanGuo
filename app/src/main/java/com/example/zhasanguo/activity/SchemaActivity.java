package com.example.zhasanguo.activity;

import androidx.annotation.IntRange;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.zhasanguo.MainActivity;
import com.example.zhasanguo.R;

public class SchemaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schema);
        Button return_bt = findViewById(R.id.schema_return_bt);
        Button renwujieshao_bt = findViewById(R.id.renwujieshao_schema_bt);
        Button duizhanmoshi_bt = findViewById(R.id.duizhanmoshi_schema_bt);
        return_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SchemaActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
        renwujieshao_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SchemaActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
       duizhanmoshi_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          //      Intent intent = new Intent(SchemaActivity.this,VsActivity.class);
            //    startActivity(intent);
            }
        });
    }
}
