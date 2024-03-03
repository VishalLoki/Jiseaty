package com.example.jiseaty;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MyDummyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dummy);
        handleShareIntent();
        finish();
    }
    private void handleShareIntent() {
        Intent shareIntent = getIntent().getParcelableExtra("shareIntent");
        if (shareIntent != null) {
            startActivity(Intent.createChooser(shareIntent, "Share Video"));
        }
    }
}