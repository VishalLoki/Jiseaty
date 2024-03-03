package com.example.jiseaty;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//import com.google.android.gms.ads.AdView;
import com.squareup.picasso.Picasso;

public class FinalMap extends AppCompatActivity {
    //private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_final_map);

        /*MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);*/

        String loc_name = getIntent().getStringExtra("loc_name");
        String loc_name1 = getIntent().getStringExtra("loc_name1");
        String imageUrl = getIntent().getStringExtra("image_url");
        String latString = getIntent().getStringExtra("lat");
        String lonString = getIntent().getStringExtra("lon");
        ImageButton home=findViewById(R.id.home);
        ImageButton back=findViewById(R.id.back);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FinalMap.this, MainActivity.class);
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

        ImageView deptImage = findViewById(R.id.deptimage);
        TextView locNamee = findViewById(R.id.locName);

        Picasso.get().load(imageUrl).into(deptImage);
        locNamee.setText(loc_name);

        FrameLayout nav = findViewById(R.id.nav);

        nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float lat = Float.parseFloat(latString);
                float lon = Float.parseFloat(lonString);
                Uri gmmIntentUri = Uri.parse("geo:" + lat + "," + lon + "?q=" + lat + "," + lon + loc_name1);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");

                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Uri mapWebUri = Uri.parse("https://www.google.com/maps?q=" + lat + "," + lon);
                    Intent mapWebIntent = new Intent(Intent.ACTION_VIEW, mapWebUri);
                    startActivity(mapWebIntent);
                }
            }
        });



    }
    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }
}