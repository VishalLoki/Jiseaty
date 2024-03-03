package com.example.jiseaty;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class q_sem2 extends AppCompatActivity {
    String sem1_url,sem2_url,sem3_url,sem4_url,sem5_url,sem6_url,sem7_url,sem8_url,electives_url,verticals_url,all_url;
    String sem1_name,sem2_name,sem3_name,sem4_name,sem5_name,sem6_name,sem7_name,sem8_name,electives_name,verticals_name,all_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_qsem2);

        String dept = getIntent().getStringExtra("deptName");
        String reg = getIntent().getStringExtra("reg");

        ImageButton home=findViewById(R.id.home);
        ImageButton back=findViewById(R.id.back);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(q_sem2.this, MainActivity.class);
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

        FrameLayout sem1 = findViewById(R.id.sem1);
        FrameLayout sem2 = findViewById(R.id.sem2);
        FrameLayout sem3 = findViewById(R.id.sem3);
        FrameLayout sem4 = findViewById(R.id.sem4);
        FrameLayout sem5 = findViewById(R.id.sem5);
        FrameLayout sem6 = findViewById(R.id.sem6);
        FrameLayout sem7 = findViewById(R.id.sem7);
        FrameLayout sem8 = findViewById(R.id.sem8);

        /*

        if("reg18".equals(reg)){
            if("cse".equals(dept)){

            } else if ("civil".equals(dept)) {

            } else if("ece".equals(dept)){

            } else if ("eee".equals(dept)) {

            } else if ("eie".equals(dept)) {

            } else if ("ibt".equals(dept)){

            } else if ("it".equals(dept)){

            } else if ("mech".equals(dept)){

            } else if ("prod".equals(dept)){

            } else{
                Log.e("DeptActivity", "Unknown department: " + dept);
            }


        } else if ("reg22".equals(reg)) {

            if("cse".equals(dept)){

            } else if ("civil".equals(dept)) {

            } else if ("ece".equals(dept)) {

            } else if ("eee".equals(dept)) {

            } else if ("eie".equals(dept)) {

            } else if ("ibt".equals(dept)) {

            } else if ("it".equals(dept)) {

            } else if ("mech".equals(dept)) {

            } else if ("prod".equals(dept)) {

            } else {
                Log.e("DeptActivity", "Unknown department: " + dept);
            }



        } else {
            Log.e("DeptActivity", "Unknown regulation: " + reg);
        }*/
        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(q_sem2.this,subject.class);
                intent.putExtra("sem","sem1");
                intent.putExtra("deptName",dept);
                intent.putExtra("reg",reg);
                startActivity(intent);
            }
        });

        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(q_sem2.this,subject.class);
                intent.putExtra("sem","sem2");
                intent.putExtra("deptName",dept);
                intent.putExtra("reg",reg);
                startActivity(intent);
            }
        });

        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(q_sem2.this,subject.class);
                intent.putExtra("sem","sem3");
                intent.putExtra("deptName",dept);
                intent.putExtra("reg",reg);
                startActivity(intent);
            }
        });

        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(q_sem2.this,subject.class);
                intent.putExtra("sem","sem4");
                intent.putExtra("deptName",dept);
                intent.putExtra("reg",reg);
                startActivity(intent);
            }
        });
        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(q_sem2.this,subject.class);
                intent.putExtra("sem","sem5");
                intent.putExtra("deptName",dept);
                intent.putExtra("reg",reg);
                startActivity(intent);
            }
        });

        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(q_sem2.this,subject.class);
                intent.putExtra("sem","sem6");
                intent.putExtra("deptName",dept);
                intent.putExtra("reg",reg);
                startActivity(intent);
            }
        });

        sem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(q_sem2.this,subject.class);
                intent.putExtra("sem","sem7");
                intent.putExtra("deptName",dept);
                intent.putExtra("reg",reg);
                startActivity(intent);
            }
        });

        sem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(q_sem2.this,subject.class);
                intent.putExtra("sem","sem8");
                intent.putExtra("deptName",dept);
                intent.putExtra("reg",reg);
                startActivity(intent);
            }
        });


    }
    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }
}