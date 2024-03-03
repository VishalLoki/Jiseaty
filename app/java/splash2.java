package com.example.jiseaty;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class splash2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_splash2);

        String dept=getIntent().getStringExtra("deptName");


        ImageView image = findViewById(R.id.image);

        if("cse".equals(dept)){
            image.setBackgroundResource(R.drawable.cse);
        }
        else if("civil".equals(dept)){
            image.setBackgroundResource(R.drawable.civil);
        }
        else if("ece".equals(dept)){
            image.setBackgroundResource(R.drawable.ece);
        }
        else if("eee".equals(dept)){
            image.setBackgroundResource(R.drawable.eee);
        }
        else if("eie".equals(dept)){
            image.setBackgroundResource(R.drawable.ei);
        }
        else if("ibt".equals(dept)){
            image.setBackgroundResource(R.drawable.ibt);
        }
        else if("it".equals(dept)){
            image.setBackgroundResource(R.drawable.it);
        }
        else if("mech".equals(dept)){
            image.setBackgroundResource(R.drawable.mech);
        }
        else if("prod".equals(dept)){
            image.setBackgroundResource(R.drawable.prod);
        }
        else {
            //
        }
        Handler handler =new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash2.this,dept.class);
                intent.putExtra("deptName",dept);
                startActivity(intent);
                finish();
            }
        },500);
    }
}