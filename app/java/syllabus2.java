package com.example.jiseaty;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class syllabus2 extends AppCompatActivity {
    String sem1_url,sem2_url,sem3_url,sem4_url,sem5_url,sem6_url,sem7_url,sem8_url,electives_url,verticals_url,all_url;
    String sem1_name,sem2_name,sem3_name,sem4_name,sem5_name,sem6_name,sem7_name,sem8_name,electives_name,verticals_name,all_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_syllabus2);

        String dept = getIntent().getStringExtra("deptName");
        String reg = getIntent().getStringExtra("reg");

        ImageButton home=findViewById(R.id.home);
        ImageButton back=findViewById(R.id.back);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(syllabus2.this, MainActivity.class);
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
        FrameLayout electives = findViewById(R.id.electives);
        FrameLayout verticals = findViewById(R.id.verticals);
        FrameLayout all = findViewById(R.id.all);

        if("reg18".equals(reg)){
            if("cse".equals(dept)){
                sem1_name = "18_cse_sem1.pdf";
                sem1_url = "https://drive.google.com/uc?id=1gfqzyR3iCeeNafdePgwYBUoOwzMtY8_c";
                sem2_name = "18_cse_sem2.pdf";
                sem2_url = "https://drive.google.com/uc?id=1zQiJ4GyD1Kg7RJmF7dwlZdZQ3_9K2cVl";
                sem3_name = "18_cse_sem3.pdf";
                sem3_url = "https://drive.google.com/uc?id=1iUJDxLca9RdhfZ_J7wr1LPpVSgcCT4Ko";
                sem4_name = "18_cse_sem4.pdf";
                sem4_url = "https://drive.google.com/uc?id=14WW8JH_aV_UiXxzggbYSuT7dhEBzwEPb";
                sem5_name = "18_cse_sem5.pdf";
                sem5_url = "https://drive.google.com/uc?id=1w6fBt35VtYXnAaFS28bOS0aSpPZ7OxOu";
                sem6_name = "18_cse_sem6.pdf";
                sem6_url = "https://drive.google.com/uc?id=12n5uYI9ymvllUbQD1X3LuwAzQ4Z-P7gh";
                sem7_name = "18_cse_sem7.pdf";
                sem7_url = "https://drive.google.com/uc?id=1vVQIeX62DZXaLGOyI0UCXCnLzEYxp76m";
                sem8_name = "18_cse_sem8.pdf";
                sem8_url = "https://drive.google.com/uc?id=1aEcaA94cA3bClBo7vlXoiHAwT2GBewzM";
                electives_name = "18_cse_electives.pdf";
                electives_url = "https://drive.google.com/uc?id=1ayaALmd6ougFAby8sBNbB1PK0-GSpyOj";
                verticals_name = "18_cse_verticals.pdf";
                verticals_url = "https://drive.google.com/uc?id=1DK9ztZz_QKjmvimAiEV0Ck8MiMS61cbO";
                all_name = "18_cse_all.pdf";
                all_url = "https://drive.google.com/uc?id=1Thn-VAHDEo4PW-_3mj0eNoW_HFQdI0t-";
            } else if ("civil".equals(dept)) {
                sem1_name = "18_civ_sem1.pdf";
                sem1_url = "https://drive.google.com/uc?id=1fqI4sj80BK-foXFihDJWY1syLw7lA4_h";
                sem2_name = "18_civ_sem2.pdf";
                sem2_url = "https://drive.google.com/uc?id=1HfZLxPB743pTqGiKhMeW1AI4YxU2sjLP";
                sem3_name = "18_civ_sem3.pdf";
                sem3_url = "https://drive.google.com/uc?id=1-lowIj2pPf-fng9wxo9aHCUJ_p-TveeM";
                sem4_name = "18_civ_sem4.pdf";
                sem4_url = "https://drive.google.com/uc?id=13lFUQhthjEpTa-QU6T13Z9SEOB5Ryzq9";
                sem5_name = "18_civ_sem5.pdf";
                sem5_url = "https://drive.google.com/uc?id=1c9tE2RPRaje9k3DWnreHb-jCGp1Slax8";
                sem6_name = "18_civ_sem6.pdf";
                sem6_url = "https://drive.google.com/uc?id=19SaQrJ2tFDjPIAr1R7cdN3W5VJIKxjep";
                sem7_name = "18_civ_sem7.pdf";
                sem7_url = "https://drive.google.com/uc?id=1hJPSECx8McVvl6PSz3B_LWddGbDUcJJ9";
                sem8_name = "18_civ_sem8.pdf";
                sem8_url = "https://drive.google.com/uc?id=1aKsd9wEDLkwenFFBIHIo40ZfH2mw6ARR";
                electives_name = "18_civ_electives.pdf";
                electives_url = "https://drive.google.com/uc?id=19MAtmNKB7-yrqeCNmEiM1ccJU9JLmNtw";
                verticals_name = "18_civ_verticals.pdf";
                verticals_url = "https://drive.google.com/uc?id=1Kgtxd_GuPXEA3_qJ8P4fkxMT2FN0wtuR";
                all_name = "18_civ_all.pdf";
                all_url = "https://drive.google.com/uc?id=12Kl63Z7xIgAS4AFa2tuhQpmim1IjP4sE";
            } else if("ece".equals(dept)){
                sem1_name = "18_ece_sem1.pdf";
                sem1_url = "https://drive.google.com/uc?id=1gitVwnmvoGQOldwzRrgRG9Vu-W-705mx";
                sem2_name = "18_ece_sem2.pdf";
                sem2_url = "https://drive.google.com/uc?id=1alXUlemFz2X7y86dGHJxGPjEnHr5BFqO";
                sem3_name = "18_ece_sem3.pdf";
                sem3_url = "https://drive.google.com/uc?id=1CIaK6ldvMgoqNhv8CcsvtJyFsbU92GmC";
                sem4_name = "18_ece_sem4.pdf";
                sem4_url = "https://drive.google.com/uc?id=1CJWhk6jeiZRTNGNbeS_3BfATtmA6hm7W";
                sem5_name = "18_ece_sem5.pdf";
                sem5_url = "https://drive.google.com/uc?id=1x1xaLYmxGc1NxpDk97mNdzdOsHi8v_IO";
                sem6_name = "18_ece_sem6.pdf";
                sem6_url = "https://drive.google.com/uc?id=1RnAidVLKcMfUNjX2yngFhM_Ua0oFj9eB";
                sem7_name = "18_ece_sem7.pdf";
                sem7_url = "https://drive.google.com/uc?id=1J55D96XJQaZw3iM6Ls0KMac7VDvqLwd6";
                sem8_name = "18_ece_sem8.pdf";
                sem8_url = "https://drive.google.com/uc?id=1xi3emMYp0L6z76Nx2haasbgnPPAtOf8l";
                electives_name = "18_ece_electives.pdf";
                electives_url = "https://drive.google.com/uc?id=1mHSuX7QseYQV8l-JepFZXLAGlQEcSguQ";
                verticals_name = "18_ece_verticals.pdf";
                verticals_url = "https://drive.google.com/uc?id=13Q9S24KJe6h90hzI1BPL2F7Cj_j1pqq1";
                all_name = "18_ece_all.pdf";
                all_url = "https://drive.google.com/uc?id=12DHUmDXDdxvgIsgPgud-NGSfwFMOGeWG";
            } else if ("eee".equals(dept)) {
                sem1_name = "18_eee_sem1.pdf";
                sem1_url = "https://drive.google.com/uc?id=1YN1MoKu2ZLcTqbuhfWX4nZjkzTvaMvvo";
                sem2_name = "18_eee_sem2.pdf";
                sem2_url = "https://drive.google.com/uc?id=1ka59Hu_ewpLRDVtPId2GELLejDZ7MWPH";
                sem3_name = "18_eee_sem3.pdf";
                sem3_url = "https://drive.google.com/uc?id=15EZTFFzy_CooRv8gL_iBg-oezCBlqX7L";
                sem4_name = "18_eee_sem4.pdf";
                sem4_url = "https://drive.google.com/uc?id=1R5UNyJllXDRJlhBttegh84_znY_BtRge";
                sem5_name = "18_eee_sem5.pdf";
                sem5_url = "https://drive.google.com/uc?id=1pHGp4qiJlcDvps8OxFYQgOmQqI1Jtx3M";
                sem6_name = "18_eee_sem6.pdf";
                sem6_url = "https://drive.google.com/uc?id=1-bVjlDUJjzdlWRvocyZcXX4et60vxUO0";
                sem7_name = "18_eee_sem7.pdf";
                sem7_url = "https://drive.google.com/uc?id=1fDZ_rkx2nHZ2tq_Qdfvbnd7yQXduX_4t";
                sem8_name = "18_eee_sem8.pdf";
                sem8_url = "https://drive.google.com/uc?id=11SWF7J0cWAqQgwkZq3s53ssK7FzNAn2x";
                electives_name = "18_eee_electives.pdf";
                electives_url = "https://drive.google.com/uc?id=1pkuSzNIkTCuanJV4m2iUv5OccQTRECTb";
                verticals_name = "18_eee_verticlas.pdf";
                verticals_url = "https://drive.google.com/uc?id=1WWwVcvror5lU2NZCeWA8wy8q0m_g8q3c";
                all_name = "18_eee_all.pdf";
                all_url = "https://drive.google.com/uc?id=1CrLMGgaffCh_kRixYbmt4dJP3xXLwkTi";
            } else if ("eie".equals(dept)) {
                sem1_name = "18_eie_sem1.pdf";
                sem1_url = "https://drive.google.com/uc?id=1WfDZrv8QtRuFGx2wmv9NLtoIFUkePjhc";
                sem2_name = "18_eie_sem2.pdf";
                sem2_url = "https://drive.google.com/uc?id=17Z8qYoSniqJH7j34ZZmr9clUyhCMIQDH";
                sem3_name = "18_eie_sem3.pdf";
                sem3_url = "https://drive.google.com/uc?id=1OlEGw1LGDjNe3DZwqGYgctzmdLV4e6jU";
                sem4_name = "18_eie_sem4.pdf";
                sem4_url = "https://drive.google.com/uc?id=1CzmMVhygKznUgxPZI3GXBq5SD5DDrO09";
                sem5_name = "18_eie_sem5.pdf";
                sem5_url = "https://drive.google.com/uc?id=1whCTBWXCP3yeK8rXTaFhe5lExNmviRCA";
                sem6_name = "18_eie_sem6.pdf";
                sem6_url = "https://drive.google.com/uc?id=18NFFlUWp2kJpY-Bxtm7v1GKgpYuz8hzu";
                sem7_name = "18_eie_sem7.pdf";
                sem7_url = "https://drive.google.com/uc?id=1FcMhzRBBsESUVST-IxOlK2QNH5mGvVQl";
                sem8_name = "18_eie_sem8.pdf";
                sem8_url = "https://drive.google.com/uc?id=1kDXtf8JZxZgvi0CMMo8yjRaQ6fOuKJDX";
                electives_name = "18_eie_electives.pdf";
                electives_url = "https://drive.google.com/uc?id=1mNbXatPNnoIM6ohZ3rL-iULitfiSHFaT";
                verticals_name = "18_eie_verticals.pdf";
                verticals_url = "https://drive.google.com/uc?id=1bLARncFOYHzopAGKjQaGJEaaMCP8ec5-";
                all_name = "18_eie_all.pdf";
                all_url = "https://drive.google.com/uc?id=1s1lGHaBrz83iQ4hUIso-qjwkm7KRj2Gp";
            } else if ("ibt".equals(dept)){
                sem1_name = "18_ibt_sem1.pdf";
                sem1_url = "https://drive.google.com/uc?id=1y0RFtoNDOYeMHRgMyOS9WTiuCE1-gc8X";
                sem2_name = "18_ibt_sem2.pdf";
                sem2_url = "https://drive.google.com/uc?id=1qmDM2shOZNnBsgpmtr8dnI8jRXIACJgr";
                sem3_name = "18_ibt_sem3.pdf";
                sem3_url = "https://drive.google.com/uc?id=1FO7D-3Wr9REDdhfWN2CKuQ1nNOcskMtw";
                sem4_name = "18_ibt_sem4.pdf";
                sem4_url = "https://drive.google.com/uc?id=1UIRSRaO2Wz33e5a8BiS_QVL4x8DqttzE";
                sem5_name = "18_ibt_sem5.pdf";
                sem5_url = "https://drive.google.com/uc?id=1oAsaIKfFk3wtfkikVZnXU-qz0zIKtZee";
                sem6_name = "18_ibt_sem6.pdf";
                sem6_url = "https://drive.google.com/uc?id=1cU0jyagM5yEnb5IIrQz4_t7w9lnw6l-x";
                sem7_name = "18_ibt_sem7.pdf";
                sem7_url = "https://drive.google.com/uc?id=1kxcNPyOeZmnhyeDDhikZWZuRRz-i8JfL";
                sem8_name = "18_ibt_sem8.pdf";
                sem8_url = "https://drive.google.com/uc?id=1EP-43MRSqvK1WKZUfzPTdG92yIlNMfeF";
                electives_name = "18_ibt_electives.pdf";
                electives_url = "https://drive.google.com/uc?id=1ykKesG1cLFY66-vkxg2VzofMXOBfqWt_";
                verticals_name = "18_ibt_verticals.pdf";
                verticals_url = "https://drive.google.com/uc?id=1P0bOhfxsMfvosbovP0h_QWIezCUAWdZP";
                all_name = "18_ibt_all.pdf";
                all_url = "https://drive.google.com/uc?id=1_YEF64zT7hzrk1Msi6U3B1Q7pIC_AasR";
            } else if ("it".equals(dept)){
                sem1_name = "18_it_sem1.pdf";
                sem1_url = "https://drive.google.com/uc?id=1hTqy9DDmlAH3CU3szpwcfPxj5EJWFfs0";
                sem2_name = "18_it_sem2.pdf";
                sem2_url = "https://drive.google.com/uc?id=1GhWzRcsuK1C7uhDbewStVMgODJhCjxpz";
                sem3_name = "18_it_sem3.pdf";
                sem3_url = "https://drive.google.com/uc?id=1dc_0YWB04vsgFn7UILjU68Ry3tMbbwR-";
                sem4_name = "18_it_sem4.pdf";
                sem4_url = "https://drive.google.com/uc?id=1X0xvVNVW-8vKK0wgT8MSrWWmYRcVuOpG";
                sem5_name = "18_it_sem5.pdf";
                sem5_url = "https://drive.google.com/uc?id=1HuxZ8V69py5tVjsLRG30aRNhHtCFgnkG";
                sem6_name = "18_it_sem6.pdf";
                sem6_url = "https://drive.google.com/uc?id=10-WgvfiI4qn2lrcmYT4G6pUIIE-1Q943";
                sem7_name = "18_it_sem7.pdf";
                sem7_url = "https://drive.google.com/uc?id=15J5DUUrwzbwnVt3Xuy_vUmzCYiUdJj7S";
                sem8_name = "18_it_sem8.pdf";
                sem8_url = "https://drive.google.com/uc?id=1-sVLt1mq4RkxCI5fJg832bMMHljY_r8z";
                electives_name = "18_it_electives.pdf";
                electives_url = "https://drive.google.com/uc?id=1j1I5r8kjPAFTc_aSJ82cjtLc4Ywj4r5k";
                verticals_name = "18_it_verticals.pdf";
                verticals_url = "https://drive.google.com/uc?id=1oMIWvNRrafRN147cBtXiDgdffXraMWpr";
                all_name = "18_it_all.pdf";
                all_url = "https://drive.google.com/uc?id=1d6VYHzGUJRrZNEDT-svjvgQrPCAo37SE";
            } else if ("mech".equals(dept)){
                sem1_name = "18_mech_sem1.pdf";
                sem1_url = "https://drive.google.com/uc?id=1LLp5_0mZR5L9BUb0nBPh3oN-qxdqDDMR";
                sem2_name = "18_mech_sem2.pdf";
                sem2_url = "https://drive.google.com/uc?id=1kDhw353cZDEWq0l_c3W1IH51mznXZhOj";
                sem3_name = "18_mech_sem3.pdf";
                sem3_url = "https://drive.google.com/uc?id=16jUIf7aWTKttH8nXMIoNHmuXXUIdrBtf";
                sem4_name = "18_mech_sem4.pdf";
                sem4_url = "https://drive.google.com/uc?id=1ajxiRoUKXan-d7YmHIAa5PlBWVUJQsoB";
                sem5_name = "18_mech_sem5.pdf";
                sem5_url = "https://drive.google.com/uc?id=10LlO_M5Y8lgaZC5otc0zG8iugN402HOL";
                sem6_name = "18_mech_sem6.pdf";
                sem6_url = "https://drive.google.com/uc?id=1Gn7Swiae_kD1yIDk698I7BVgCR__nyCx";
                sem7_name = "18_mech_sem7.pdf";
                sem7_url = "https://drive.google.com/uc?id=1ezH80vTV4HXUf_ASzjkDOjpXKL9OjUx8";
                sem8_name = "18_mech_sem8.pdf";
                sem8_url = "https://drive.google.com/uc?id=1FR2cDGHxloijp98_M60Dx7TeoSxxNlAC";
                electives_name = "18_mech_electives.pdf";
                electives_url = "https://drive.google.com/uc?id=1NOyjAq0CkiXCh5U5Tq8oRb5XsIMhNl2i";
                verticals_name = "18_mech_verticals.pdf";
                verticals_url = "https://drive.google.com/uc?id=1zdV7eUJmNjGIJos1tt-rA43fe1XTV1Kj";
                all_name = "18_mech_all.pdf";
                all_url = "https://drive.google.com/uc?id=1lMZOjp3XDMWmDAb9Ony1FOlSB-lAvqUk";
            } else if ("prod".equals(dept)){
                sem1_name = "18_prod_sem1.pdf";
                sem1_url = "https://drive.google.com/uc?id=1JYF_hKaZQNEQuMAgRRKvZNStwlto-Ljs";
                sem2_name = "18_prod_sem2.pdf";
                sem2_url = "https://drive.google.com/uc?id=1-d_s_kN9tYH4CRXOUYDnwNcxr4KGnVKL";
                sem3_name = "18_prod_sem3.pdf";
                sem3_url = "https://drive.google.com/uc?id=1bEM2-10gqb8Sc4v9UdOsbHYYi5lX_U9n";
                sem4_name = "18_prod_sem4.pdf";
                sem4_url = "https://drive.google.com/uc?id=1QOsmbX63q67N-VIukJbVg1CA8hrionmI";
                sem5_name = "18_prod_sem5.pdf";
                sem5_url = "https://drive.google.com/uc?id=1tqdK_HcHg9SYxeC1RLjjNlbHnRodjujV";
                sem6_name = "18_prod_sem6.pdf";
                sem6_url = "https://drive.google.com/uc?id=1gcDFFpyHIj2AxDj0Gfvug-P07B29nPCv";
                sem7_name = "18_prod_sem7.pdf";
                sem7_url = "https://drive.google.com/uc?id=1x3xmU15A0wtugcEkaz-TAZun41I_a-gf";
                sem8_name = "18_prod_sem8.pdf";
                sem8_url = "https://drive.google.com/uc?id=1lq3SYZ6vnwC-NGG5yRxhT4Mj-PSIlUag";
                electives_name = "18_prod_electives.pdf";
                electives_url = "https://drive.google.com/uc?id=1q3cgqe6pXev_EGG4dS5PWmexIkzlhWiJ";
                verticals_name = "18_prod_verticals.pdf";
                verticals_url = "https://drive.google.com/uc?id=1Kos8CrsD8iiwOu02ZetZIAeQHb2qExHx";
                all_name = "18_prod_all.pdf";
                all_url = "https://drive.google.com/uc?id=1FbeYhrt0foZWwdBseVPCiKUAznxNkE2k";
            } else{
                Log.e("DeptActivity", "Unknown department: " + dept);
            }



            sem5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(syllabus2.this, pdfview.class);
                    intent.putExtra("webUrl",sem5_url);
                    intent.putExtra("pdfName",sem5_name);
                    startActivity(intent);
                }
            });

            sem6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(syllabus2.this, pdfview.class);
                    intent.putExtra("webUrl",sem6_url);
                    intent.putExtra("pdfName",sem6_name);
                    startActivity(intent);
                }
            });

            sem7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(syllabus2.this, pdfview.class);
                    intent.putExtra("webUrl",sem7_url);
                    intent.putExtra("pdfName",sem7_name);
                    startActivity(intent);
                }
            });

            sem8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(syllabus2.this, pdfview.class);
                    intent.putExtra("webUrl",sem8_url);
                    intent.putExtra("pdfName",sem8_name);
                    startActivity(intent);
                }
            });

            electives.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(syllabus2.this, pdfview.class);
                    intent.putExtra("webUrl",electives_url);
                    intent.putExtra("pdfName",electives_name);
                    startActivity(intent);
                }
            });

            verticals.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(syllabus2.this, pdfview.class);
                    intent.putExtra("webUrl",verticals_url);
                    intent.putExtra("pdfName",verticals_name);
                    startActivity(intent);
                }
            });

            all.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(syllabus2.this, pdfview.class);
                    intent.putExtra("webUrl",all_url);
                    intent.putExtra("pdfName",all_name);
                    startActivity(intent);
                }
            });
        } else if ("reg22".equals(reg)) {

            if("cse".equals(dept)){
                sem1_name = "22_cse_sem1.pdf";
                sem1_url = "https://drive.google.com/uc?id=1zErHU8FIAJrfXVD35Ai8o5tEZgdudcM-";
                sem2_name = "22_cse_sem2.pdf";
                sem2_url = "https://drive.google.com/uc?id=1Z0e1o4P4os8uIfQwhWdETdsa6gZZmVuW";
                sem3_name = "22_cse_sem3.pdf";
                sem3_url = "https://drive.google.com/uc?id=1eKYRNraNPyoU_B7dvPqHYf5cuKoyqP4C";
                sem4_name = "22_cse_sem4.pdf";
                sem4_url = "https://drive.google.com/uc?id=1_thi11QT49j2ggcaKFjyHHQQtdLikUGG";
            } else if ("civil".equals(dept)) {
                sem1_name = "22_civ_sem1.pdf";
                sem1_url = "https://drive.google.com/uc?id=17o1YADI9QkIcHAFb_4VZ-XpzP76ruVHY";
                sem2_name = "22_civ_sem2.pdf";
                sem2_url = "https://drive.google.com/uc?id=1JnTlrmm_2R4m4OfGoPXW_TYH4LZXO0SY";
                sem3_name = "22_civ_sem3.pdf";
                sem3_url = "https://drive.google.com/uc?id=1Di6b3X5AvMkA59vITZaKSvdR9evnLFPz";
                sem4_name = "22_civ_sem4.pdf";
                sem4_url = "https://drive.google.com/uc?id=13itpu3RaRvm7HzyRIayB8yWqVmpylnvW";
            } else if ("ece".equals(dept)) {
                sem1_name = "22_ece_sem1.pdf";
                sem1_url = "https://drive.google.com/uc?id=1TUUt4wlPCnzUC29iDFz6qMnDV72t3wpp";
                sem2_name = "22_ece_sem2.pdf";
                sem2_url = "https://drive.google.com/uc?id=1AheOEjGTNprX8YVC-Uf-Y8UWb5qc9XaN";
                sem3_name = "22_ece_sem3.pdf";
                sem3_url = "https://drive.google.com/uc?id=1CRcvP6UErvylLsOhxQiEZUGVdx-j2aZZ";
                sem4_name = "22_ece_sem4.pdf";
                sem4_url = "https://drive.google.com/uc?id=1RO0c5F064CwGtBRnReotYW4xyOz1OYQ2";
            } else if ("eee".equals(dept)) {
                sem1_name = "22_eee_sem1.pdf";
                sem1_url = "https://drive.google.com/uc?id=1wjHkUJxvsYHDO2avCXeLuGOrE9NObEYw";
                sem2_name = "22_eee_sem2.pdf";
                sem2_url = "https://drive.google.com/uc?id=1pujNlW8VgqTZnPLO0TQP50_gSnpOXXUr";
                sem3_name = "22_eee_sem3.pdf";
                sem3_url = "https://drive.google.com/uc?id=1QzGf3HUV3RC_jtAc9BaYw2tTOoTxQJJM";
                sem4_name = "22_eee_sem4.pdf";
                sem4_url = "https://drive.google.com/uc?id=1Lc-UFu6Qi_gIEccoWZzlyXcIRuttbCtj";
            } else if ("eie".equals(dept)) {
                sem1_name = "22_eie_sem1.pdf";
                sem1_url = "https://drive.google.com/uc?id=1ZZxkfYBLmOlLaor98IYczFj4mpETEI5d";
                sem2_name = "22_eie_sem2.pdf";
                sem2_url = "https://drive.google.com/uc?id=1obqxSTPqvfX8z4hU-jEWYHYha0ND0e7d";
                sem3_name = "22_eie_sem3.pdf";
                sem3_url = "https://drive.google.com/uc?id=1tUmTesSULri5LNHqdG7Th6M59DKimXqn";
                sem4_name = "22_eie_sem4.pdf";
                sem4_url = "https://drive.google.com/uc?id=1wXF62U6fcKRCSRoN7KzDpJV3W96Bzov0";
            } else if ("ibt".equals(dept)) {
                sem1_name = "22_ibt_sem1.pdf";
                sem1_url = "https://drive.google.com/uc?id=1uoBHKagd6_Y_sUVtw5JZa7YM72TDJxu7";
                sem2_name = "22_ibt_sem2.pdf";
                sem2_url = "https://drive.google.com/uc?id=1886mpRymDufFppGeNUq42JoT91EZLO_M";
                sem3_name = "22_ibt_sem3.pdf";
                sem3_url = "https://drive.google.com/uc?id=18MllH8fTdi-1bCnPbQaAxLOknKs2YFKT";
                sem4_name = "22_ibt_sem4.pdf";
                sem4_url = "https://drive.google.com/uc?id=1_aOQkQqOcF2omh23Bn8e5r3UQEzYXscj";
            } else if ("it".equals(dept)) {
                sem1_name = "22_it_sem1.pdf";
                sem1_url = "https://drive.google.com/uc?id=1sNrzH_b5faMKgZqMN2lkz-zDoqOqowu2";
                sem2_name = "22_it_sem2.pdf";
                sem2_url = "https://drive.google.com/uc?id=1BK4Nv7ch_L1GLW1cS9CxxIbtUiXjaBSw";
                sem3_name = "22_it_sem3.pdf";
                sem3_url = "https://drive.google.com/uc?id=1IkVUSnITw6i3lRI04wz4VfxOrA9Jatem";
                sem4_name = "22_it_sem4.pdf";
                sem4_url = "https://drive.google.com/uc?id=10tU4ZWtv80CEDS1rVkCUg2x3NkvATtyA";
            } else if ("mech".equals(dept)) {
                sem1_name = "22_mech_sem1.pdf";
                sem1_url = "https://drive.google.com/uc?id=1QU6MtFNny_wQREPca9wN0B6ExwtC9-6j";
                sem2_name = "22_mech_sem2.pdf";
                sem2_url = "https://drive.google.com/uc?id=1SbuG5E_JWazX1pwzKNp66xif764dl8Xd";
                sem3_name = "22_mech_sem3.pdf";
                sem3_url = "https://drive.google.com/uc?id=1IVkBKNdaH3rjSM9aIben_g2rxUhk4xBO";
                sem4_name = "22_mech_sem4.pdf";
                sem4_url = "https://drive.google.com/uc?id=1QQQklrluG2Q1KZoB17lsP9DxQli2HSpM";
            } else if ("prod".equals(dept)) {
                sem1_name = "22_prod_sem1.pdf";
                sem1_url = "https://drive.google.com/uc?id=1U9s9hFEcIazwL_KWwwHaaISC26prxcEm";
                sem2_name = "22_prod_sem2.pdf";
                sem2_url = "https://drive.google.com/uc?id=1Jg_DCUqJjuh_4HWDo4MxkZXJYQo1vvX5";
                sem3_name = "22_prod_sem3.pdf";
                sem3_url = "https://drive.google.com/uc?id=1DNFa1kgUBc8PfMAy6-dhGjl5zxfp5wBG";
                sem4_name = "22_prod_sem4.pdf";
                sem4_url = "https://drive.google.com/uc?id=16SEpmafJppDOJFP1qa77rZvUj1jlV13c";
            } else {
                Log.e("DeptActivity", "Unknown department: " + dept);
            }

            sem5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(syllabus2.this,Not_updated.class);
                    startActivity(intent);
                }
            });

            sem6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(syllabus2.this,Not_updated.class);
                    startActivity(intent);
                }
            });

            sem7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(syllabus2.this,Not_updated.class);
                    startActivity(intent);
                }
            });

            sem8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(syllabus2.this,Not_updated.class);
                    startActivity(intent);
                }
            });

            electives.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(syllabus2.this,Not_updated.class);
                    startActivity(intent);
                }
            });

            verticals.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(syllabus2.this,Not_updated.class);
                    startActivity(intent);
                }
            });

            all.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(syllabus2.this,Not_updated.class);
                    startActivity(intent);
                }
            });
        } else {
            Log.e("DeptActivity", "Unknown regulation: " + reg);
        }
        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(syllabus2.this, pdfview.class);
                intent.putExtra("webUrl",sem1_url);
                intent.putExtra("pdfName",sem1_name);
                startActivity(intent);
            }
        });

        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(syllabus2.this, pdfview.class);
                intent.putExtra("webUrl",sem2_url);
                intent.putExtra("pdfName",sem2_name);
                startActivity(intent);
            }
        });

        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(syllabus2.this, pdfview.class);
                intent.putExtra("webUrl",sem3_url);
                intent.putExtra("pdfName",sem3_name);
                startActivity(intent);
            }
        });

        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(syllabus2.this, pdfview.class);
                intent.putExtra("webUrl",sem4_url);
                intent.putExtra("pdfName",sem4_name);
                startActivity(intent);
            }
        });


    }
    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }
}