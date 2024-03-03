package com.example.jiseaty;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

//import com.google.android.gms.ads.interstitial.InterstitialAd;


public class Education extends AppCompatActivity {
    //private InterstitialAd m2InterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_education);
        /*String unit2="ca-app-pub-3940256099942544/1033173712";
        loadad1(unit2);*/
        Button allbut=findViewById(R.id.allbut);
        Button edubut=findViewById(R.id.edubut);
        Button mapbut=findViewById(R.id.mapbut);

        ImageButton home=findViewById(R.id.home);
        ImageButton back=findViewById(R.id.back);

        allbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Education.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        });

        edubut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
            }
        });

        mapbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*if (m2InterstitialAd != null) {
                    m2InterstitialAd.show(Education.this);
                    m2InterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                        @Override
                        public void onAdClicked() {
                            // Called when a click is recorded for an ad.
                        }

                        @Override
                        public void onAdDismissedFullScreenContent() {
                            // Called when ad is dismissed.
                            // Set the ad reference to null so you don't show the ad a second time.
                            startActivity(new Intent(Education.this, Explore.class));
                            loadad1(unit2);
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent(AdError adError) {
                            // Called when ad fails to show.
                            m2InterstitialAd = null;
                        }

                        @Override
                        public void onAdImpression() {
                            // Called when an impression is recorded for an ad.
                        }

                        @Override
                        public void onAdShowedFullScreenContent() {
                            // Called when ad is shown.
                        }
                    });
                } else {*/
                    startActivity(new Intent(Education.this, Explore.class));
                /*}*/
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Education.this,MainActivity.class);
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

        FrameLayout civbut=findViewById(R.id.civbut);
        FrameLayout csebut=findViewById(R.id.csebut);
        FrameLayout ecebut=findViewById(R.id.ecebut);
        FrameLayout eeebut=findViewById(R.id.eeebut);
        FrameLayout eiebut=findViewById(R.id.eiebut);
        FrameLayout mecbut=findViewById(R.id.mecbut);
        FrameLayout ibtbut=findViewById(R.id.ibtbut);
        FrameLayout itbut=findViewById(R.id.itbut);
        FrameLayout prodbut=findViewById(R.id.prodbut);

        civbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Education.this,splash2.class);
                intent.putExtra("deptName","civil");
                startActivity(intent);
            }
        });

        csebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Education.this,splash2.class);
                intent.putExtra("deptName","cse");
                startActivity(intent);
            }
        });

        ecebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Education.this,splash2.class);
                intent.putExtra("deptName","ece");
                startActivity(intent);
            }
        });

        eeebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Education.this,splash2.class);
                intent.putExtra("deptName","eee");
                startActivity(intent);
            }
        });

        eiebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Education.this,splash2.class);
                intent.putExtra("deptName","eie");
                startActivity(intent);
            }
        });

        mecbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Education.this,splash2.class);
                intent.putExtra("deptName","mech");
                startActivity(intent);
            }
        });

        ibtbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Education.this,splash2.class);
                intent.putExtra("deptName","ibt");
                startActivity(intent);
            }
        });

        itbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Education.this,splash2.class);
                intent.putExtra("deptName","it");
                startActivity(intent);
            }
        });

        prodbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Education.this,splash2.class);
                intent.putExtra("deptName","prod");
                startActivity(intent);
            }
        });
    }

    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }
    /*private void loadad1(String unitId){
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,unitId, adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        m2InterstitialAd = interstitialAd;
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        m2InterstitialAd = null;
                    }
                });
    }*/
}