package com.example.jiseaty;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Amendment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_amendment);

        ImageButton home=findViewById(R.id.home);
        ImageButton back=findViewById(R.id.back);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Amendment.this, MainActivity.class);
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

        FrameLayout reg18=findViewById(R.id.reg18);
        FrameLayout reg18a=findViewById(R.id.reg18a);
        FrameLayout reg22=findViewById(R.id.reg22);

        reg18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pdfName="Regulation_2018.pdf";
                String webUrl="https://drive.google.com/uc?id=1Ram3L31oZyTxAe2-hfTPOOaWa30ulr2l";
                Intent intent = new Intent(Amendment.this, pdfview.class);
                intent.putExtra("webUrl",webUrl);
                intent.putExtra("pdfName",pdfName);
                startActivity(intent);
            }
        });

        reg18a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pdfName="Regulation_2018a.pdf";
                String webUrl="https://drive.google.com/uc?id=1vRpx4RTU7q7cOwKmHrRSkA4xQYZCKizB";
                Intent intent = new Intent(Amendment.this, pdfview.class);
                intent.putExtra("webUrl",webUrl);
                intent.putExtra("pdfName",pdfName);
                startActivity(intent);
            }
        });

        reg22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pdfName="Regulation_2022.pdf";
                String webUrl="https://drive.google.com/uc?id=1foWUI6KoaUbsd52KqnTpDDscbcQ6ZWzh";

                Intent intent = new Intent(Amendment.this, pdfview.class);
                intent.putExtra("webUrl",webUrl);
                intent.putExtra("pdfName",pdfName);
                startActivity(intent);
            }
        });
    }
    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }
}