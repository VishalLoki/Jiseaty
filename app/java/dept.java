package com.example.jiseaty;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class dept extends AppCompatActivity {
    TextView deptname;
    ImageView deptimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_dept);

        String dept = getIntent().getStringExtra("deptName");


        ImageButton home=findViewById(R.id.home);
        ImageButton back=findViewById(R.id.back);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dept.this, MainActivity.class);
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

        FrameLayout prebut=findViewById(R.id.prebut);
        FrameLayout sylbut=findViewById(R.id.sylbut);
        FrameLayout amebut=findViewById(R.id.amebut);

        prebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dept.this,q_sem.class);
                intent.putExtra("deptName",dept);
                startActivity(intent);
            }
        });

        sylbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(dept.this, syllabus.class);
                intent.putExtra("deptName",dept);
                startActivity(intent);
            }
        });

        amebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(dept.this, Amendment.class);
                startActivity(intent);
            }
        });

        deptname=findViewById(R.id.deptname);
        deptimage=findViewById(R.id.deptimage);

        if("cse".equals(dept)){
            deptname.setText(R.string.cse);
            deptimage.setBackgroundResource(R.drawable.cse1);
        } else if ("civil".equals(dept)) {
            deptname.setText(R.string.civ);
            deptimage.setBackgroundResource(R.drawable.civil1);
        } else if ("ece".equals(dept)) {
            deptname.setText(R.string.ece);
            deptimage.setBackgroundResource(R.drawable.ece1);
        } else if ("eee".equals(dept)) {
            deptname.setText(R.string.eee);
            deptimage.setBackgroundResource(R.drawable.eee1);
        } else if ("eie".equals(dept)) {
            deptname.setText(R.string.eie);
            deptimage.setBackgroundResource(R.drawable.ei1);
        } else if ("ibt".equals(dept)) {
            deptname.setText(R.string.ibt);
            deptimage.setBackgroundResource(R.drawable.ibt1);
        } else if ("it".equals(dept)) {
            deptname.setText(R.string.it);
            deptimage.setBackgroundResource(R.drawable.it1);
        } else if ("mech".equals(dept)) {
            deptname.setText(R.string.mech);
            deptimage.setBackgroundResource(R.drawable.mech1);
        } else if ("prod".equals(dept)) {
            deptname.setText(R.string.prod);
            deptimage.setBackgroundResource(R.drawable.prod1);
        } else{
            Log.e("DeptActivity", "Unknown department: " + dept);
        }

    }
    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }
}