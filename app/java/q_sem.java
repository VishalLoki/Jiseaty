package com.example.jiseaty;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class q_sem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_qsem);

        String dept = getIntent().getStringExtra("deptName");

        ImageButton home=findViewById(R.id.home);
        ImageButton back=findViewById(R.id.back);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(q_sem.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        FrameLayout reg18 = findViewById(R.id.reg18);
        FrameLayout reg22 = findViewById(R.id.reg22);

        reg18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(q_sem.this, q_sem2.class);
                intent.putExtra("reg","reg18");
                intent.putExtra("deptName",dept);
                startActivity(intent);
            }
        });

        reg22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(q_sem.this, q_sem2.class);
                intent.putExtra("reg","reg22");
                intent.putExtra("deptName",dept);
                startActivity(intent);
            }
        });
    }
    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }
}