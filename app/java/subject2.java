package com.example.jiseaty;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class subject2 extends AppCompatActivity {
    public List<Item3> items = new ArrayList<Item3>();
    public RecyclerView recyclerView;
    public MyQues1Adapter myQues1Adapter;
    JSONArray PredefinedArray;
    String dept;
    String reg;
    String sem;
    String sub_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_subject2);

        ImageButton home=findViewById(R.id.home);
        ImageButton back=findViewById(R.id.back);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subject2.this,MainActivity.class);
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
        dept = getIntent().getStringExtra("deptName");
        reg = getIntent().getStringExtra("reg");
        sem = getIntent().getStringExtra("sem");
        sub_name = getIntent().getStringExtra("sub_name");

        TextView subname = findViewById(R.id.sub_name);
        subname.setText(sub_name);

        recyclerView = findViewById(R.id.recyclerview3);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        myQues1Adapter = new MyQues1Adapter(getApplicationContext(),items);
        recyclerView.setAdapter(myQues1Adapter);
        PredefinedArray = getPredefinedArray();
        handleApiResponse(PredefinedArray);


    }
    private JSONArray getPredefinedArray(){
        try {
            StringBuilder string = new StringBuilder();
            string.append("[");
            if("reg18".equals(reg)){
                if("cse".equals(dept)){
                    if("sem1".equals(sem)){
                        if("Communicative English".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1XAhf1UfnE1iveuHMxBT1V8EWsRQjN1TP\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1SpdvDbaVHJYrBEJ6FxQauh8FvtP1H1zu\"},");
                        }else if("Calculus".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=11t9eKhH01hHQSZFTWcpe-F_yCGybzE_0\"},");
                        }else if("Semiconductor Physics".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=12LvGiCl4u-IgR4DMMrTqfNKVbQlod3cE\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1y5Ha258OCSLoorOUUWvLsicbn3Rc_Q6S\"},");
                        }else if("Programming in C".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ARWw2o3PZg_R7wrQXgOFkvKq9kW02ctn\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1u__7V9K09bKWMkrmorsbqwJoOx9Qz45n\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=18cEey0E0ZHRE-O4IEfefhJTjaGwLCW4a\"},");
                        }
                    } else if ("sem2".equals(sem)){
                        if("Applied Chemistry".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1AWgb8IZb9cqQZ3RT45WgXK9stsXOXaBI\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1w1Wz0kI8hQeC7yvuPYCi_cQVoxhETN2l\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1bzNqV-Ev1Y1xaczwg6MeVexYlpTSLVZu\"},");
                        }else if("Differential Equations and Linear Algebra".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1xngdsQpkSIsarH7wX_DZZ-0nS8TXsB75\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1a5OgvUycxMSM_YKOI2cNeJZRvTJlJK5v\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Z78p5MKfBTjceBMR0EBHYAVuJsIOjbBD\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=183mKnMkY_BMA05EJvj3iv53y1ba5QqCx\"},");
                        }else if("Fundamentals of Electrical and Electronics Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1wV6916t9mgVgET64efSrTe7gseew0MFE\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1r8KmQkA8I_oJU1wXreDyhOwarqP9NHDc\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1sEYTkmgS_ha_Xquss0269h_PloGe4ft7\"},");
                        }
                    } else if ("sem3".equals(sem)){
                        if("Humanities".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=18798S0azyQORS6n3ieHfdgRTGCIGjeor\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1uOxHP3-aO8v1uBGArNiqtq3RE1Q5hDU2\"},");
                        }else if("Probability Theory and Applied Statistics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ZIHxdb7oN6GqqwUzdP-tFn_7sr9vRHcv\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1bSo_Mfpi7CXTQP89SFgP1H2Jq9YxtxgL\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1wTj-YIDu21BkZpEPylX_qoPDdg-ITyIP\"},");
                        }else if("Discrete Structures".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1S6HIXEXKHZDqqUcO_WKKd9K7oUODBNIy\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ZeA2laBgNtaYEMoMHRfClS_78J8B2H14\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1qTnfIPY54KscrTxCHCTubuBkP3jtFv-W\"},");
                        }else if("Engineering Mechanics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1jovt94Dpwc29ubMssIDsahrsEcqsoBrL\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1AapFz5IfpaMJHCGxNHE-6dNyTFwx83g4\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1NhVJ2wDnqg9Qt74PM0pZaXlTvRGH0sGk\"},");
                        }else if("Digital Systems".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1uh_vN3_z-34BMIZnPHTCrrmZOpsvaNTE\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1zYXfM5BpvPyx9HuNVeciKV9EPkfDYW2g\"},");
                        }else if("Data Structures".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1yFpnuCYjwr4L9j0AVFY3aQAp255p_7hW\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1yiTJbD5QkaSflOaX4buGPyHNkC456VRr\"},");
                        }else if("Environmental Sciences and Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=15V3_kMJ7vOsxaFLw9z-w-0TZtIcc8dwq\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1bkwLUCdXJCqzN4bwKjPpAp0bAE0sf94h\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1TaXDZLu11hPFEfPUKv08r3u--d3_Dg1Z\"},");
                        }
                    } else if ("sem4".equals(sem)){
                        if("Technology Management".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1X-5HDuaGHTmYTQBQSWECwO_MM_QMjZAe\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1hWHVF79q1IYYC0g37iUOcivtgxofW9y6\"},");
                        }else if("Analog and Digital Communication".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=12Ljb5bZjlukVYZl8-w5bOSAuqTOnz-dM\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1sfN6gpSS2fogC7AvReeX5SoQeGgfJW_4\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=14sR1pSAyNoGrqddcV-PQqNW1WSpH4BUH\"},");
                        }else if("Computer Architecture".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Va277KiMX7gkpv0LYMoK7cfzEHD91quD\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1E_rdd0RWYR-BNz9IfCKM2cOeotExOF7N\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1YE57BCJi7pEQ8jMwf3bc9obz4d9t-tbW\"},");
                        }else if("Database Management Systems".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1OSn0F6npVYL41rzdPao_Krw9bUVzcZGO\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1jwaWTqqeXCamrCDHRGPxLoLGeXmFD-fu\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1zkOW42DndiNCWO_m2TaPzI4AnsAtE3Qt\"},");
                        }else if("System Programming and Operating Systems".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1eyi0LC18uQokxHzenxrLsw0b5yJmpiiy\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1f0x7wWNwTl4__k1TT0jZTKTtAZlA3RAa\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1_H7GCZPnP6HHGm287V7N8wQJdPn7e74Y\"},");
                        }else if("Theory of Computation".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1xob1LKr3tEspzrdDTxDKX8bNNWvvtQk8\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1A7P4GZ1rMJGSEYYCDDjDRBUFbGGK_bz5\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1SzvV98FMlIUoqMFkIGjyHmiq0sxPl6_j\"},");
                        }else if("Constitution of India".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1-bK0-GuMw605Dw2cN7203bmjcUnkKdi3\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1iyGSmlT3PQXxwbxIONSgGZOjlkrPRI8K\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=19TpKYLkGBSM9Ca0EoLzC5o_QMPw2U7ka\"},");
                        }
                    } else if ("sem5".equals(sem)){
                        if("Professional Communication Skills".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ig7Xmerlkv9XrtkfQuOztLByrS3zsTsX\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1pc8znFFzvi7Oc5M2V8lr47ORvj96lKzf\"},");
                        }else if("Embedded Computing Systems".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1h_71ifhDeikf3kpjRRKdKYJV-6cCUhoP\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=11-PuW_jmY3JCXcUYdXXL9Hte85KbGS--\"},");
                        }else if("Computer Networks".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=16Vy415dy8LRwv7-fYCCAvtOKfvRq4mP5\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1W5xOkioXgnGva7NkArOJxQLTAqOoWeEY\"},");
                        }else if("Design and Analysis of Algorithms".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1G58uTJP-xHz3XTRuHAKrdpeJMu3hmIUK\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1qJIv-6qi0CAMterXBCLfLJ9Dzj5uNExV\"},");
                        }else if("Introduction to Web Technology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1cA3kaSi4udjIlDd8LH2fJcoqsX82M6cm\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1XE65-EPQZBqp0O5GMsfw8zrvfviSC5Pu\"},");
                        }else if("Cyber Security".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1QxzpepXJE0jaXkxGeiWiViZXPxP-QtXk\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=17XWASHhm6pVb-iQTvQ0jOtUcXXsGtvp3\"},");
                        }else if("Multimedia Systems".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1lOZ_vrmX8KrrJcyTVR_IImuuorLbV8Pa\"},");
                        }else if("Network Essentials".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=13FZxRM_nTmFadDF0icZnP5m3Ow2XbcDQ\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1-NqV5M8T0WXGlUYrcAJ7_IzAKyl4cRMw\"},");
                        }else if("Programming in Java".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1XG1UXBT0misRA2i06yNR8OJRRXMOB0HU\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1_YaajD15XRdfkvqT0PLGGZUb0c4u9AVk\"},");
                        }
                    } else if ("sem6".equals(sem)){
                        if("Digital Signal Processing and Applications".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1dL37AoulyIWzCjGWtMrDWboAUuz86SGq\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1kBvvKkauzRcOaCcdI1Z_9g7mZf5LBBLJ\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1E43R4fpdlv4ye21VKOagu4yubs0vpkg9\"},");
                        }else if("Compiler Design".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1JndtCyYaYmTCMDAijiKoEupPwK3RQEdt\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=10k_YNPHxqnqBHGsiD_vm8a4A-vci_dqq\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1e4c8GpVP9RIbdrbxM-HcGl6SWtwMMHKN\"},");
                        }else if("Software Engineering Methodologies".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1TmIIfRmMcn0Cc8m5oZYMfeZfmKJL4mxF\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1s6Pr8KMGP3KO0t9URZeznnngUvbXuFE3\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1YGqGdXjcnb-C_Qa-IjqOm2tiI_NOxUxJ\"},");
                        }else if("Cyber Security".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1QxzpepXJE0jaXkxGeiWiViZXPxP-QtXk\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=17XWASHhm6pVb-iQTvQ0jOtUcXXsGtvp3\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ryAw2WRFi4RhefRR_iHgrYpkK1QAe0Fz\"},");
                        }else if("Network Essentials".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=13FZxRM_nTmFadDF0icZnP5m3Ow2XbcDQ\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1-NqV5M8T0WXGlUYrcAJ7_IzAKyl4cRMw\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1dAkiP4lCDzv0yP0VUPT3Fr8E5gP4Y-Xe\"},");
                        }else if("Information Security".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1wBwa_GDqWddVK8F5s0YsYwdQMgdQm7sB\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1piP7vALFzIcsbeYtKDJnChL_m5V-KdQ4\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1gZ5qAKif___U40MS_9vXxRf3Kxngkk2O\"},");
                        }else if("Multimedia Systems".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1lOZ_vrmX8KrrJcyTVR_IImuuorLbV8Pa\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1TW3zGEJzzJ-45jgMEhmUmmyK29GBPQbp\"},");
                        }else if("Distributed Computing".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=14jEognqlX3Q7hf9DC4dhti3pe91ZObjM\"},");
                        }else if("Programming in Java".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1XG1UXBT0misRA2i06yNR8OJRRXMOB0HU\"},");
                        }
                    } else if ("sem7".equals(sem)){
                        if("Machine Learning".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1i71E72GUJB7RtZiEbURFwXjH1cKUgBDD\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1egBPNBWqnRV7LaOTWzAQzdT0f7iO59v9\"},");
                        }else if("Artificial Intelligence".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1pJ_31Uyt8aQJQX2OxQnlI2bIpb-d6FE9\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=11Jmqze_4HO2q_uulHtzSpTsNnP6kRUGU\"},");
                        }else if("Computer Graphics and Visualizations".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Z-yu8kRK2MRvZee5l0uRhZpkyE6RvnPq\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1tsQtou_BWvEweNumHOXmx0WTdnjXhs9f\"},");
                        }else if("Distributed Computing".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=14jEognqlX3Q7hf9DC4dhti3pe91ZObjM\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1_-1o1G-di-tiz81t8t5WQjfa-JYf53u0\"},");
                        }else if("Cyber Security".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1QxzpepXJE0jaXkxGeiWiViZXPxP-QtXk\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=17XWASHhm6pVb-iQTvQ0jOtUcXXsGtvp3\"},");
                        }else if("Programming in Java".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1XG1UXBT0misRA2i06yNR8OJRRXMOB0HU\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1_YaajD15XRdfkvqT0PLGGZUb0c4u9AVk\"},");
                        }
                    } else if ("sem8".equals(sem)){

                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("civil".equals(dept)) {
                    if("sem1".equals(sem)){
                        if("Engineering Chemistry".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=12KO9BmLDcb4RYX_IqihbGoYaqZwub7bl\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1Nezc2CA4lUkF1kJNS4bjbLRgCtvqjutZ\"},");
                        }else if("Calculus and Linear Algebra".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1A4NkpaZeB6weGzbRWAG5bw-MaVL5UfAF\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1sdHhM1Ss92yHX-SqSgsscDROVVhzZUnm\"},");
                        }else if("Basics of Electrical and Electronics Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1aTfnjPe9KP-BMil_8qO2Oaz8SfAj6Shz\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1HCIWV5d1_souoTELDa5jposV1iAAXomF\"},");
                        }
                    } else if ("sem2".equals(sem)){
                        if("Communicative English".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=18yMUG7O59-FYh1JpiUx7VFMjCpvQb8Bn\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1z0-fYnqH0vNUl8s66MjCZhTkGFBimHnk\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1hlp8goUYICSydsqRFwphkQeqlD_63gwD\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1SpdvDbaVHJYrBEJ6FxQauh8FvtP1H1zu\"},");
                        }else if("Differential Equations and Complex Variables".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Q1-2ScmGBZiXplIF45S_7_aTfwFpvm-T\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=17ZDv-A1JCHSmiWYEN_JMfe3Zq1sZTDBD\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1q_83_jSolVdKlKAz-9fgLBLumgPXjiYy\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1CuHoYFeqNXM3ko6ihKc0ihkxQvOklesT\"},");
                        }else if("Mechanics and Properties of Solids".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1MDRxKFF8X3YygaJjqpUw9bCu3_aYng9Q\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=13Xxp1jBHSld-w7M-mzlGtjr_qYKsokvZ\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1dbENmp9NZr63Ie62Wqc_x-pI2akQy3Sq\"},");
                        }else if("Programming in C".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ri1_g-vTps2elHDBFLCk5s8hKU4JnJqb\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ARWw2o3PZg_R7wrQXgOFkvKq9kW02ctn\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1fNm_DtoGhlWhDCEQuilhifdaphAS-lm4\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=18cEey0E0ZHRE-O4IEfefhJTjaGwLCW4a\"},");
                        }
                    } else if ("sem3".equals(sem)){
                        if("Transform Calculus and Partial Differential Equations".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Nuql9qOHf-LNvgE3QsH4n9pPc2pU2drH\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1n4H5cTNXXJJqOKeBZKYXDSIlGjADBtE0\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1cNvDDuol6Zb0_LC9uYU0gA8pMLvhXJWw\"},");
                        }else if("Engineering Mechanics for Civil Engineers".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1UwCA9m1PRSNLRFEz-dxg9DD4YnqkkR7X\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Te09iuvp--_4y1661RKpQkXTXQXou9hZ\"},");
                        }else if("Strength of Materials".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Pk2NX_6I-lbNgKktE76Wb6ey-oxjHyDI\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1SZY8qEk5-t3k3xJuIRxopmarKjB1Q_DZ\"},");
                        }else if("Mechanics of Fluids".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1MAiC3hNq8EtBMhWIKGX0rteBkpKRieK7\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1_xlrU96m7yRRHARNv85bbF1FbuiICn5R\"},");
                        }else if("Surveying".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1s7mPQNV0-B6geLc2sMDpkpJ3T6briRRh\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Ub2DFYfz8KkhIYiZ6zGIo13I_4nKSM3D\"},");
                        }else if("Water Supply Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1P27sN202fzeKGP2jzpjLpPyGdduKvtQy\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1UTAhyRxFBVG7o6Kfa3MyWRnCoFNWa1ba\"},");
                        }else if("Constitution of India".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1-bK0-GuMw605Dw2cN7203bmjcUnkKdi3\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1iyGSmlT3PQXxwbxIONSgGZOjlkrPRI8K\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=171uhLpQE5s3m3L3FD1aqdgUnquba50Qz\"},");
                        }
                    } else if ("sem4".equals(sem)){
                        if("Civil Engineering – Societal and Global impact".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1utScz1O8dnpVWoEt0Dk7GWZ-ZLEZmoe-\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1R48u5BkbB-4_bt3drDGa-3gY1-EOhm6X\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1zjDy84TwUWWW1jNNWsP8KDhb8KrmYlQk\"},");
                        }else if("Engineering Geology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=14QllbjzJDG7nZQFqwGs6ZuLbEUd9ixsG\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=14UbiOC5O01DFt1vvvUheK680F7qmBHpC\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1GWHEVIEWp7J4x15t1H7UZ21pqYAp90J4\"},");
                        }else if("Construction Materials and Technology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1-pjPmAGkI8eAac39m6Erdda_kIMIr_Nu\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1iP3H_vGsgcXQVPfEYh1UdUxGj2wR0VFL\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=148HIwNxwWZzDhtY806OELCpQx-mNn8m2\"},");
                        }else if("Basic Structural Design - I (Steel)".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1_PpaYZUR_k9guk1RkxHNLhel6yJkmP_x\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1-i3Rn8-68ZW9qvaj5QPA44O4k8MwXE0r\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1QTzN6352PhEgjlniPwTJgOkjmwysxP7y\"},");
                        }else if("Applied Hydraulics and Fluid Machinery".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1dmZaiwtjHFcCK322RXJ27faV9nWCbMas\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1CfTm6-lMQ7eQbBWR0aY8jJIh2XrJhoWX\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1lLRIOlh5Do5cbqULnrC1jEEN874UZf3m\"},");
                        }else if("Waste Water Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1B_j_-dCTJ27KfGaRPG3_96XfIX06HAVO\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1A715bgIL9m4YT6BU5mkYj5IYaWVGeoYo\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1L2UnY9POo4WqJoeupK1UXsdTO06xVXQa\"},");
                        }else if("Environmental Sciences and Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=15V3_kMJ7vOsxaFLw9z-w-0TZtIcc8dwq\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1bkwLUCdXJCqzN4bwKjPpAp0bAE0sf94h\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1k2euZNYvK8hBoR8Lg4b7waD-_Rw5XtU1\"},");
                        }
                    } else if ("sem5".equals(sem)){
                        if("Professional Practices, Ethics and Building Bye-laws".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1CbuF-EY0AZKmZUmn3G1aaco2byapzAVy\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1KcIFZTDqjUpWCEGR29mlsJhfG-37Jpm8\"},");
                        }else if("Structural Analysis I".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1zK1a6gzsr-Vbq8juyHKOTY3OUeIOhjWQ\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1shO5tVksi4adAO3mH8K2fGI6tHkchU2H\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Bu9YOb8FDqwssdGZUE2-PUppN5nzP5Ag\"},");
                        }else if("Basic Structural Design II (Concrete)".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1RoQt4wdorPM3hWmGRf4M_85dCAoKGiKI\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1iJYSP5DZ0ePvUInBssmaxyPjFFgkpVr-\"},");
                        }else if("Mechanics of Soils".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1t29UK4i8eVT61SZZ-egC726sgJi8SM5Z\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1EANELAkjZcDne3mPDACWDKZc9U8GOrs5\"},");
                        }else if("Concrete Technology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1X7E0Snfzb2e7vIl8Z7wYXmRPhO0EdkAm\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1zoEYQyRpoTLI1uJySKXRZ5dgLxoS-W7e\"},");
                        }else if("Climate Change and Adaptation".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1_AzLXDEknvTZHu3VoDAmZ3Ojbja2eiVY\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1-oJrx5WUibAJkBLfXKOZim3eO5Jp8vbo\"},");
                        }
                    } else if ("sem6".equals(sem)){
                        if("Structural Analysis II".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1zkHbG9XpOhOlDAwwwBC7jWiPKAD02U76\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1tKhqiNmy7Qzlkkt3t3dVb30En-dpO_Xj\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1mdGahqSVEMVkpRjDUI607TOrzioIip6U\"},");
                        }else if("Foundation Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1tz7K1QanwFbzLAnqdI2--uh2CXK9wYq_\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1-1DX-SnL6_80HByWShoyTGkBIBX9y8Fc\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1fp6uXxPA1HP3GaiRNRkEkcsDWXJPrnUR\"},");
                        }else if("Water Resources Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1gyM2EIvQRF6jnPcSDQmcrAwPdjSD8Ygs\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1zkoGwX-qrhhFpj5Wfuo_tFOG8s9x28IC\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1m0_L79HUOB5Ha828C-h8TnPnsodTnz9z\"},");
                        }else if("Highway and Railway Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1iNlA3yUgKp_Dh3vXPCKVOWhA66f7XIP7\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1kY5h6Ob_DB7t20BL7YzzDhUt0_QJAlhZ\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1-x5EO-oszzBsfAsl04M1vueaXvrKxmWY\"},");
                        }else if("Climate Change and Adaptation".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1_AzLXDEknvTZHu3VoDAmZ3Ojbja2eiVY\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1-oJrx5WUibAJkBLfXKOZim3eO5Jp8vbo\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1BVgwOX9JqkjUaQ7_E4exYMq7XcGf_kOX\"},");
                        }else if("Disaster Management and Mitigation".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1uwSZ3xSNuMCp-ZPv5B6l6YsET1gSlF4O\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1N1oSjxBsdKAx8gvF-bN4Lt-327Pp_d-t\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=175MgCbfi5HCrsWLIXHhxmU5Re5cgEUAO\"},");
                        }else if("Maintanance and Rehabilitation of structures".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1AMsnT19sfk_laCmKedzPa8-2fOYlPKjL\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1jE-Pp0hr9sRBqr6PuAp9F36eMIUtat1W\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1rIbSvK0b3E4ao0s4okdYQ2PH9yxXKVa3\"},");
                        }else if("Energy Efficient Buildings".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1VYh8s9N9Ibo8umOlJqR1JGK5xoo8fU0k\"},");
                        }
                    } else if ("sem7".equals(sem)){
                        if("Construction Management".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1jy4kA5RMFCw_yZ8lAWbZ6ds6_eBE7BkT\"},");
                        }else if("Engineering Economics, Estimation and Costing".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1tBCBhx53jdgGUSz8vWL0JugsPf_jmV1_\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1iBM8FXeN8muA3d9RBGd3TfLtxP9-_zmH\"},");
                        }else if("Prestressed Concrete Structures".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1lOFO7xtaY5Th4I3efNIEwjm0cI3oBA8a\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1qJtwGdxWbjKQnvPyFbqatGGhzGYOL0Zr\"},");
                        }else if("Concrete Structures".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1bY-3N3hUelhTlJat78ha-ciw1gWIFDwu\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1iO9pN7zn4kUUv2M0CAhCVyIufVGiAHWt\"},");
                        }else if("Ground Improvement Techniques".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1pUeFAqmnuBz34n1s-ssM2hGgz4lpSRny\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1a3p6JwCoThOP8DsVJwiFGGEDCQDi02hP\"},");
                        }else if("Airport,Docks and Harbour Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1_Ke2vkzT7q5ssNnDK9w_Waz2bHWVwe7x\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1IxKd-5gvICRcMxmF8bqhuuFnDIJ685WR\"},");
                        }else if("Climate Change and Adaptation".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1_AzLXDEknvTZHu3VoDAmZ3Ojbja2eiVY\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1-oJrx5WUibAJkBLfXKOZim3eO5Jp8vbo\"},");
                        }else if("Disaster Management and Mitigation".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1N1oSjxBsdKAx8gvF-bN4Lt-327Pp_d-t\"},");
                        }else if("Energy Efficient Buildings".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1VYh8s9N9Ibo8umOlJqR1JGK5xoo8fU0k\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1XYWWF4g8tulTMbkXTiyIIaTCSB7I-pqo\"},");
                        }
                    } else if ("sem8".equals(sem)){
                        if("Maintanance and Rehabilitation of structures".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1mkNOZwPQhp0F3yRfiWscOM4ZlOXVJFhU\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1rIbSvK0b3E4ao0s4okdYQ2PH9yxXKVa3\"},");
                        }else if("Concrete Structures".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1J2vMlVgcuy4xoQS_E29DVUm9qC30wTvT\"},");
                        }else if("Ground Improvement Techniques".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=10pLRxLNloPhfdU5hDtOf01pf8FMeLjft\"},");
                        }
                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if("ece".equals(dept)){
                    if("sem1".equals(sem)){
                        if("Communicative English".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1XAhf1UfnE1iveuHMxBT1V8EWsRQjN1TP\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1SpdvDbaVHJYrBEJ6FxQauh8FvtP1H1zu\"},");
                        }else if("Calculus and Differential Equations".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1UqWNThXRCZh1Rx0qUFWz_8o2hkhvcwdu\"},");
                        }else if("Waves , Optics and Introduction to Quantum Mechanics".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1T03O-0QFFawM-xnNd6wxLIuTesTzKodW\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1FVKns3vButbUM4BvbuI2EF8uMH8GmxcF\"},");
                        }else if("Programming in C".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ri1_g-vTps2elHDBFLCk5s8hKU4JnJqb\"},");
                            string.append("{\"date\":\"March2023(Nov-Dec2022)\",\"pdf_url\":\"https://drive.google.com/uc?id=13Jh2w1ACti3P1qcs9GGtI1RP42m4TUgm\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ARWw2o3PZg_R7wrQXgOFkvKq9kW02ctn\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1u__7V9K09bKWMkrmorsbqwJoOx9Qz45n\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=18cEey0E0ZHRE-O4IEfefhJTjaGwLCW4a\"},");
                        }
                    } else if ("sem2".equals(sem)){
                        if("Applied Chemistry".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1w1Wz0kI8hQeC7yvuPYCi_cQVoxhETN2l\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1bzNqV-Ev1Y1xaczwg6MeVexYlpTSLVZu\"},");
                        }else if("Linear Algebra, Numerical Methods and Transform Calculus".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1xZ7zAIjQMqul6JKxuI__j6_S1fzL4fFx\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1_9KUuGp_oXPCDmtR3fPuMO1bzRD-sH2x\"},");
                        }else if("Principles of Electrical Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1jgS7eP7QHyUkXZYlVEkbMFD1lZDhr7Lr\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=14gJAiK8drGu6UyK0XoabBQl64s8i9kIA\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ySRO8ZCJa3DgMf76oB-GLiA_z8kOq012\"},");
                        }
                    } else if ("sem3".equals(sem)){
                        if("Transforms and Partial Differential Equations".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Fzt9SJP14KvtnfW5I3Iu_bf_Yr0K2Bkh\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1eFqSjWt9ApGkdV-62a4apgoqfLUq_gwY\"},");
                        }else if("Data Structures and Algorithms".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1CG_SWIc8ldgJPAyhF5_97_ww-QC89bna\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1P2-NPwKojyvS54ZJhMBHj_S8LbOi-M-a\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1adThwNisCr5zdHvrAF0yEaJfkxV0alY9\"},");
                        }else if("Electron Devices and Circuits".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=15hTU7PKwWYBNblnkwBqOwnaZfbqM1m-C\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1lSPbV77oVTbAuLch40IDa9RMR85CoiVZ\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=15jQsWf429MIXnyVFyzM4MH-r15jl6Vau\"},");
                        }else if("Digital System Design".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1KqVaZubb-W_ZCRCbaQJbEZXQtoHvQs-j\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1c6v7giLiOVqMdAqXGVP86WV6jX_RGjYW\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Cz-l3MjlGCHEzsbOSgTEx1nxs-m9LJPl\"},");
                        }else if("Signals and Systems".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1241ZRC0KxBBMLxMO6F2itig5BhroCeRR\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ikHyN56tA4Ng48CB5_1nkJ1olC1ZceQM\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1uuH1mv48HOWQo41BtBtMXE9dzXEiybRF\"},");
                        }else if("Network Theory".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1c6Kc31loCrQtM-kK3ItXgpDOxiLnHi_-\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Le1ipm2OUrT-i5IoMvl6S-RSIaje7XAm\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1MvN9c0cqK4hFWkra-sW5Mu52Au6YkmcC\"},");
                        }else if("Environmental Sciences and Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=15V3_kMJ7vOsxaFLw9z-w-0TZtIcc8dwq\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1bkwLUCdXJCqzN4bwKjPpAp0bAE0sf94h\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1TaXDZLu11hPFEfPUKv08r3u--d3_Dg1Z\"},");
                        }
                    } else if ("sem4".equals(sem)){
                        if("Probability Theory and Random Processes".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1iyEn6JE90VjVJ9RxoLYxLzIgHRWNMUuF\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1KiWmK7UvMvVoYe26kHpgCbjawm-buleo\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1CRMZ2tPdbtpxkPD6NbDEZWSJs1yvZG-I\"},");
                        }else if("Electromagnetic Waves".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Oxhlh6ygQV14UQgqF6g7yVpVqhje6bcq\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=11ZIOtb489kPhiEiQA7_dGBiGtyYQNBsb\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1V_8MqVBPHT46nCFamlnIoK6TjGhg5z4Q\"},");
                        }else if("Analog Circuits".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1DUQbIE4438oGys84vF3XxMtyZ2SG74x0\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1e3mPX0Dl0XHa7iWI73Ef1MrZBdBGPW0U\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1DmfDYzkqvJCBYtBk2nN8p9uSKPHBut2N\"},");
                        }else if("Analog Communication".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1CG_SWIc8ldgJPAyhF5_97_ww-QC89bna\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ucHja71tZy9wX-pqoz_2Owca0HVMexfA\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1VNEEfePdWOsfCMuNlfsioiiqwQOmzDS6\"},");
                        }else if("Microprocessors and Microcontrollers".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1cKLykA7YICVN839euvvcPi8Jn6IJA8FR\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1We2rLWiSI0YSnYlr5NijO--_RVFkt3sj\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=17Ru2mBjuqS9EqKFshi0eOEHn5beBF43V\"},");
                        }else if("Analog Integrated Circuits".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=12UcA-KNnQAmeYAk8DAfnEZmjN7uOXw8B\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1AaimjD_ADw2fntR9NJ9wcaBTrO9Vwskr\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1OYJUaneE8ymhfy9nrasp_qkxtXm70xL6\"},");
                        }else if("Constitution of India".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1-bK0-GuMw605Dw2cN7203bmjcUnkKdi3\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1iyGSmlT3PQXxwbxIONSgGZOjlkrPRI8K\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=19TpKYLkGBSM9Ca0EoLzC5o_QMPw2U7ka\"},");
                        }
                    } else if ("sem5".equals(sem)){
                        if("Youth Empowerment for Yoga Practice".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1J1tfVik84LXZLjCUOSrbBIBuUOZfc2T0\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1qSkrdqy5MGKXYijaIHdNaofP3A0-thm7\"},");
                        }else if("Digital Communication".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1i4woch7hd4cAqNe5wLfKhLMDV8PdRRNQ\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1F6dDHsypo90qk0NgewFYX4DDOA2fcEyM\"},");
                        }else if("Transmission lines and waveguides".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1iTdTZrINBtf8smKMfAq5vM6sfVx0xYBA\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1D2llNMyZ3jJK_7hMXEzpWsepla3HqPLO\"},");
                        }else if("Digital Signal Processing".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1hNwVNhACUCqG04_Cp02-9gKGKu60fEsK\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1rPv9TcV2Mm8-EuWLT9rZSrxh2PwN-b-g\"},");
                        }else if("Control Systems".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1m5q3BwklUIYICLObRfTSbmnC0ivmsgTQ\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=11MJIhcJWdaOqGONQiwhCMsCwFw12qZ4M\"},");
                        }else if("Introduction to VLSI System Design".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=190rqrjjSk8LIEBOtelzp5jW4Vp5TU08t\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1IwrSMWGz41TFqLusAPueBKu1vlPqPehN\"},");
                        }
                    } else if ("sem6".equals(sem)){
                        if("Professional Ethics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1TPIMqgLGefEXhNTS7w73QGyBQuZKbpAq\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1xZPV1wkBVtwfJ1gKg_IG7s7ondZMvqi4\"},");
                        }else if("VLSI Design".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1hi39tQGlE4znf4WLCAApX5HMozt2TdNo\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ZL7q9nxBEAieNrCsleJRqVqVAk0FDmPx\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1069ZROmxb-w87hwt979BH0lFagdA_BcE\"},");
                        }else if("Antennas and Wave Propagation".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=187LiBZrgIMv10xHQTMfgmj8iyh-DQZ5L\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1TKuJC3NpzoR05jRa95RZIDv7wE2wSWS5\"},");
                        }else if("Computer System Architecture and Organization".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1yOsdrXp-SaQe12LwFCbBfiN9RmnbDQFB\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1hjIs9jQsBh-djp8ZMF8KC_RwmvJHMsFh\"},");
                        }else if("Embedded Systems".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1gSw7oj6x1351Big-aGQmblkV-ZmzCEcl\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1De5EjBL8XfJCfTBFPWpqO9QEyBjwKCo5\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1e6PGnK419GzVuRzUUk0ViV3V7vUo48ld\"},");
                        }else if("Control Systems".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=11MJIhcJWdaOqGONQiwhCMsCwFw12qZ4M\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1N74lr7OmzdRKtlLMPPiEEFqJIrUGm7dd\"},");
                        }else if("Internet of Things".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1v20hlvv4d7TqxiivtiE1GGYW8Ou8LslS\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1_0iOD7MJUhN9D6xfHyhbXMEO3orgVjv-\"},");
                        }else if("Digital image and video Processing".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1xPOGm_VHNRrvpHlc4c80C-bjn2yhJv6Y\"},");
                        }else if("Fiber Optic Communications".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1XQ8nFCMWBB1n5MT4aFowTsi32a9IPtky\"},");
                        }else if("Mobile Communication".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=10CogPlCGvabXskX7q1zf2HqJ46QkGj36\"},");
                        }
                    } else if ("sem7".equals(sem)){
                        if("Management Theory and Practice".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1rC_xf_h2zj1PgoidhJyJuSDbYzWuZeOc\"},");
                        }else if("Microwave Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ASf2ETpPOOZTs9hVDkOkkV6IS8yJaWPD\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1wYBqWBKKuTGSF24YIHBzIG8O995L1FE9\"},");
                        }else if("Automotive Electronics".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1vB8V1wBExTu2AaeMXEW7oeJ2tzVk5-PD\"},");
                        }else if("Bio-Medical Electronics".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1L-vLEJdvIJSIyK_1hMgnWWxyTLqClVeN\"},");
                        }else if("Data Communication Networks".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=10azjzlgQ5sIaThaW1dP3VScf9w6oYLwu\"},");
                        }else if("Fiber Optic Communications".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1xvb5rIR-8B4sFaOZEhIFn1xDqcFM3ilp\"},");
                        }else if("Mobile Communication".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1FW0Dmict0551LwlPOYKs-zCI403cmHwD\"},");
                        }
                    } else if ("sem8".equals(sem)){
                        if("Fiber Optic Communications".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1VWIh7RwSIcTX_xs_HmiFuCpe5bZ8cUyF\"},");
                        }
                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("eee".equals(dept)) {
                    if("sem1".equals(sem)){
                        if("Communicative English".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1XAhf1UfnE1iveuHMxBT1V8EWsRQjN1TP\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1SpdvDbaVHJYrBEJ6FxQauh8FvtP1H1zu\"},");
                        }else if("Calculus and Differential Equations".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1UqWNThXRCZh1Rx0qUFWz_8o2hkhvcwdu\"},");
                        }else if("Waves , Optics and Introduction to Quantum Mechanics".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1FVKns3vButbUM4BvbuI2EF8uMH8GmxcF\"},");
                        }else if("Programming in C".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ri1_g-vTps2elHDBFLCk5s8hKU4JnJqb\"},");
                            string.append("{\"date\":\"March2023(Nov-Dec2022)\",\"pdf_url\":\"https://drive.google.com/uc?id=13Jh2w1ACti3P1qcs9GGtI1RP42m4TUgm\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ARWw2o3PZg_R7wrQXgOFkvKq9kW02ctn\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1u__7V9K09bKWMkrmorsbqwJoOx9Qz45n\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=18cEey0E0ZHRE-O4IEfefhJTjaGwLCW4a\"},");
                        }
                    } else if ("sem2".equals(sem)){
                        if("Applied Chemistry".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1w1Wz0kI8hQeC7yvuPYCi_cQVoxhETN2l\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1bzNqV-Ev1Y1xaczwg6MeVexYlpTSLVZu\"},");
                        }else if("Linear Algebra, Numerical Methods and Transform Calculus".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1gtnKWKkTj7OfIIveQjpnrGVcYNTODWax\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1xZ7zAIjQMqul6JKxuI__j6_S1fzL4fFx\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1_9KUuGp_oXPCDmtR3fPuMO1bzRD-sH2x\"},");
                        }else if("Basics of Civil and Mechanical Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1VPY40FEnNO2Mtn-EAngV3dJw2t1mhyF8\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=17UzCrOmHhh6szKTdMgwZbuB6E81B8y4L\"},");
                        }
                    } else if ("sem3".equals(sem)){
                        if("Object Oriented Programming with C++".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1njJcLg0dstensoHZ3zatm43QZrQxrHyp\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1PcNICiQK3aJBbHi-jhVJ8cIDiFqMUwcr\"},");
                        }else if("Electric Circuit Theory".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=150R86RrowbYmqTgQIW6qJgupjRAEIiJ5\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1JREscHxAa0agWRSK2XzNtjJLGbErCEwF\"},");
                        }else if("Field Theory".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1KbzRgcuBOubb1WvMEcAIt7E5AWV9lioN\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=17EzApbyLkm7UoO4t451IqYKG2yO6CH2x\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1eH8KT0_qbW95bC6ugVMz4zA0-SN9Nv88\"},");
                        }else if("Electronic Devices and Circuits".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=19cCKfrQu8f1nbxD3JN6IEbO8UE9vgye_\"},");
                        }else if("Electrical Machines - I".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=14kb8r6A_UJlmVXurZJ7NyKqMCM3_nPMC\"},");
                        }else if("Digital Circuits".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=137Bhl-EvkbfPaB4FCP0_ulXTToiTFDl9\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Auuu2jH9WVqUxdFuaa1H-luEiMh8H3vG\"},");
                        }
                    } else if ("sem4".equals(sem)){
                        if("Probability and Applied Statistics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=19W6wZBFu8DcWRCRTv2hbhP2AKH7329jp\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1I6S7UHMPcNTBBU89IYw29M37sxcPt6i8\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1fNvciWmky8B5kZC7dyHxx3eQjpkwPwRK\"},");
                        }else if("Engineering Mechanics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1jovt94Dpwc29ubMssIDsahrsEcqsoBrL\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1AapFz5IfpaMJHCGxNHE-6dNyTFwx83g4\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1SjfcDALR46udWODKVJfd5rgd6DxEr3p4\"},");
                        }else if("Principles of Signals and Systems".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1feVS0bEXhpAA4piBXUdphUlDML2MKzIw\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1xOUYx5K5070q4u5myshDVXur2V5NFhOe\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1OL2Wk1qf7GBx-GqrMMBRzGWdQCxLSh2P\"},");
                        }else if("Linear Integrated Circuits".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1t6CeuT9KoOHRsxGQLfSpKa59AvhItkpq\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=14MhRnice_vWi_5L2PI2MVeVCk7FFdhMe\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ioyXwz3BlAYl_PsGHGORMbQDNo0U16Ds\"},");
                        }else if("Electrical Machines - II".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1MOxLE_v1ghkqPpOxsFATMPLUKfJtYykT\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=136Gg_M_sd5gzHGo1HfGHhsArlSCWtRK2\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Qg7MtSxjEsuTgia0G7HlNci20v3_Z-mJ\"},");
                        }else if("Electrical and Electronic Measurements".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1aUzOtMQnED9D3q1d3KGMWqSJNO9zPLOC\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1x8Ypq9U7onehu3V7d8I2u-CmGCfdd0FF\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1PlF4YzltpRAjFOo4ZiAc0oTtz0Tb0R6F\"},");
                        }else if("Constitution of India".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1-bK0-GuMw605Dw2cN7203bmjcUnkKdi3\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1iyGSmlT3PQXxwbxIONSgGZOjlkrPRI8K\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=19TpKYLkGBSM9Ca0EoLzC5o_QMPw2U7ka\"},");
                        }
                    } else if ("sem5".equals(sem)){
                        if("Business Communication Skills".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1fOBeM3GCllb0e9Wyl8FYyWLYilq_RNbx\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1_d5zLNFtPld51H6zeuLaXGodbS8FfaX6\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1HviikjBbef8wb4aB_6Y8S2Sxsr-Sdque\"},");
                        }else if("Power Generation, Transmission and Distribution".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1dwi6GGK6Nl_yAUoyNg47guYl1NYAOKCV\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=195W6zPIJSOt3qdepcOHeCQu8XyF1dBaJ\"},");
                        }else if("Microprocessors, Microcontrollers and Applications".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1mgK9BtsJE607UqSl7ZWaQlKrxpzxY0qC\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1tGlCVWVBWYewAar7kxaAnvjNvifIy4Eb\"},");
                        }else if("Control Systems Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1EJbyXRrOuZMZiKKq_3Shi7oOm-1GKGpc\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1WMYZzDldSnHr5hyws-A2M1Jp3SNMEtJg\"},");
                        }else if("Environmental Sciences and Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=15V3_kMJ7vOsxaFLw9z-w-0TZtIcc8dwq\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1bkwLUCdXJCqzN4bwKjPpAp0bAE0sf94h\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1TaXDZLu11hPFEfPUKv08r3u--d3_Dg1Z\"},");
                        }else if("Renewable Power Generation Systems".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1xEwLkzHQFd0O4bz4GikezhySyKlguojJ\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1_IPiGhUvv9W2yNKBk8pNy-TD5q5tVhDs\"},");
                        }else if("Electric Vehicles".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1DeBagWI8MzEc2xR7emdtm4m30k3hGSm4\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1P2lf2NiSPxttBrnT__55qHtY5VpB8pX3\"},");
                        }
                    } else if ("sem6".equals(sem)){
                        if("Technology Management".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1X-5HDuaGHTmYTQBQSWECwO_MM_QMjZAe\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1hWHVF79q1IYYC0g37iUOcivtgxofW9y6\"},");
                        }else if("Power System Analysis".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1NjT8q1lTP0WyfAN5CmtJ4QVxo17c6yJ9\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1blzf0IFONxW_IzkfesfOpA98SAXI8jWF\"},");
                        }else if("Power Electronic Devices and Circuits".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=18WYs_6FL0e5nWRXDdlDPoMS8HJUlppJK\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1J9G2epLqF5yXXFCi56nkxGZnwoVkUhZ4\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1RR0lb4N1yr9UMJocOEL_l0jVuxvkFhII\"},");
                        }else if("Energy Auditing and Management".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1lbC1tU7O0ljWHmSDyoQ4WepNnNAaRBb8\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1GBzdWqXrNCuQN7Exc5wsA4enNHDiRIaO\"},");
                        }else if("Mems and Applications".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=16GcxK5Xehoxtq0d4qX6huvjSD1-CPmbM\"},");
                        }else if("Automotive Electronics for Electrical Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1QTtoX11KxkxcthplqEu5jVpiU1ElVQ2T\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1uiQRK5KWBjG2L46Rj5U3uEpIOwOxB-5A\"},");
                        }else if("Renewable Power Generation Systems".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1xEwLkzHQFd0O4bz4GikezhySyKlguojJ\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1_IPiGhUvv9W2yNKBk8pNy-TD5q5tVhDs\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1oC5hOi0yci3WC5JRvSfP-qNR6cWX_4dO\"},");
                        }else if("Smart Grid Systems".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1i7oMRXRpda-BxUq9nTQJz8Qj8jQjxcIR\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=19vzVxLEEOAv3pCFuMIOCECPJaNfu-SfP\"},");
                        }else if("Special Machines and Controllers".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1obeO2msDkEPazV08GLvP8JPVNghTwotg\"},");
                        }else if("Electric Vehicles".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1DeBagWI8MzEc2xR7emdtm4m30k3hGSm4\"},");
                        }
                    } else if ("sem7".equals(sem)){
                        if("Professional Ethics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1TPIMqgLGefEXhNTS7w73QGyBQuZKbpAq\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=15yROOabPIBTvNu8qOCMhMRUgyoip0qxw\"},");
                        }else if("Power System Operation, Control and Protection".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1yvj1Ni2oXETV7UtF8oMmIzuwDEBbCzeq\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1nryy6B5e9u2FOkTPYNX--0kubkuMj67B\"},");
                        }else if("Computer System Architecture".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1t0k-mJHv0biwCBMgvwO4I4K0XDhBLtMK\"},");
                        }else if("Special Machines and Controllers".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1FK5KtV_sO7NmhR6IWyKnXLXkDwphN2R6\"},");
                        }else if("Mems and Applications".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1E3NhrIV-ojCBhQCz_1MjjJV4aR5WmS86\"},");
                        }else if("Smart Grid Technology".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1OXfWT4ZRuevRbCUomyoyRy9C7i_4KbkT\"},");
                        }else if("Smart Grid Systems".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1W_66N-YpmWMewYwzL3Blb13_c_jbqldj\"},");
                        }else if("Renewable Power Generation Systems".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1_IPiGhUvv9W2yNKBk8pNy-TD5q5tVhDs\"},");
                        }else if("Electric Vehicles".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1P2lf2NiSPxttBrnT__55qHtY5VpB8pX3\"},");
                        }else if("Power Plant Instrumentation".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1d703ULglSqGpCgYlvUHIY14OK2811qtH\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1d1IAaKxL10n3lnJTkaqxI6bpdRaVJECT\"},");
                        }else if("Biomedical Instrumentation".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1XUp40BBTvKL_55mxWYkLIoJAlElJR7pm\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1FW5oHX_nVLwdkTjY8mKAJYQiNzwOycQt\"},");
                        }
                    } else if ("sem8".equals(sem)){
                        if("Energy Auditing and Management".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1GBzdWqXrNCuQN7Exc5wsA4enNHDiRIaO\"},");
                        }
                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("eie".equals(dept)) {
                    if("sem1".equals(sem)){
                        if("Communicative English".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1XAhf1UfnE1iveuHMxBT1V8EWsRQjN1TP\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1SpdvDbaVHJYrBEJ6FxQauh8FvtP1H1zu\"},");
                        }else if("Calculus and Differential Equations".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1UqWNThXRCZh1Rx0qUFWz_8o2hkhvcwdu\"},");
                        }else if("Waves , Optics and Introduction to Quantum Mechanics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1CsPMuoGbVvm_dGc-mTBMV4xoNbQb4M-Y\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=19RGM54OSlvgCUWZnnUHZ5QEJuvPTQZTE\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1FVKns3vButbUM4BvbuI2EF8uMH8GmxcF\"},");
                        }else if("Programming in C".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1u__7V9K09bKWMkrmorsbqwJoOx9Qz45n\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=18cEey0E0ZHRE-O4IEfefhJTjaGwLCW4a\"},");
                        }
                    } else if ("sem2".equals(sem)){
                        if("Applied Chemistry".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1mM5lsC2HfMO-irlOxfR2gDZNFIKZziPy\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1AWgb8IZb9cqQZ3RT45WgXK9stsXOXaBI\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1w1Wz0kI8hQeC7yvuPYCi_cQVoxhETN2l\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1bzNqV-Ev1Y1xaczwg6MeVexYlpTSLVZu\"},");
                        }else if("Linear Algebra, Numerical Methods and Transform Calculus".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1gtnKWKkTj7OfIIveQjpnrGVcYNTODWax\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1xZ7zAIjQMqul6JKxuI__j6_S1fzL4fFx\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1_9KUuGp_oXPCDmtR3fPuMO1bzRD-sH2x\"},");
                        }else if("Electrical Circuits and Networks".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1kmooYsFHqw9C132W81k2TLRgfmFKVSUz\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1a10AlwgUH-_A-TQis0c0G0Rhs-4gvpmz\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1IkOCVZ7TS1Mwm51UCxuASoSh6pRuPq8m\"},");
                        }
                    }  else if ("sem3".equals(sem)){
                        if("Business Communication Skills".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1fOBeM3GCllb0e9Wyl8FYyWLYilq_RNbx\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1_d5zLNFtPld51H6zeuLaXGodbS8FfaX6\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1HviikjBbef8wb4aB_6Y8S2Sxsr-Sdque\"},");
                        }else if("Biology for Engineers".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1OLJcVkiJ7kIE4ZSqmhbsOe2ZZhgWi7Uj\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1bKeGj61qy4A-FYbXkAo_gBVsJeCx9cbl\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Pj88P2y7ZIeE9js8puuxhtsLm-KIXYJo\"},");
                        }else if("Principles of Electrical Machines".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1t26QNfve8fSoGK6ytk-JeePLV5zm1uhi\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1iLbZ6Mfefr8uFBziCTQjQvjHcHD3_2t0\"},");
                        }else if("Electronic circuits".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1VTzK6Y4AZp0E-cBSWVTxYzGjOmo_w5md\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1uS4LR0Vb9GW9WiaXOTzUDVjorRVAgtP8\"},");
                        }else if("Sensors and Transducers".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1aEf2VXFn5I3F3qIkNjvhYDtxJM41YfkR\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=13AJlGh9Qn__NjqSAJCMQgWgc8SgJW9qP\"},");
                        }else if("Measurements and Instrumentation".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1pAbXyJrFZXHrisAJJ9u-j5jPL8atERbU\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1KXOviP6u8v69jPN3EF-iTu12oUhWB-BS\"},");
                        }else if("Environmental Sciences and Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=15V3_kMJ7vOsxaFLw9z-w-0TZtIcc8dwq\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1bkwLUCdXJCqzN4bwKjPpAp0bAE0sf94h\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1TaXDZLu11hPFEfPUKv08r3u--d3_Dg1Z\"},");
                        }
                    } else if ("sem4".equals(sem)){
                        if("Professional Ethics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1TPIMqgLGefEXhNTS7w73QGyBQuZKbpAq\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=15yROOabPIBTvNu8qOCMhMRUgyoip0qxw\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1xZPV1wkBVtwfJ1gKg_IG7s7ondZMvqi4\"},");
                        }else if("Probability and Applied Statistics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=19W6wZBFu8DcWRCRTv2hbhP2AKH7329jp\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1I6S7UHMPcNTBBU89IYw29M37sxcPt6i8\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1fNvciWmky8B5kZC7dyHxx3eQjpkwPwRK\"},");
                        }else if("Engineering Mechanics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1jovt94Dpwc29ubMssIDsahrsEcqsoBrL\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1AapFz5IfpaMJHCGxNHE-6dNyTFwx83g4\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1SjfcDALR46udWODKVJfd5rgd6DxEr3p4\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1NhVJ2wDnqg9Qt74PM0pZaXlTvRGH0sGk\"},");
                        }else if("Electronics for Analog Signal Processing".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1u3O-Agu8a6awX8r9BL9BoptJKBmKqCjj\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1pcPcCiC5LE1McH4jk8Lg4PyP269S_vkQ\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1S-14FfBHF7TnEIaG_kJ_pHxR_27uiN6y\"},");
                        }else if("Digital Electronics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1m3o9jxsHrlkhKeaxF058KRLMB8LXRng7\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1d8VFIuzb5KOQZrw0m2orPYSf3iGGw5uB\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1zGjhu0mgqoM5ovwWBhude1EOoyYh3bTJ\"},");
                        }else if("Fundamentals of Microprocessors and Microcontrollers".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1NaTGEB-Vy65HTykxzdValyathb_ijwIg\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=18FCiUAWbdS1SWS4iFBzEDJxq5pmEytCD\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1AIj51ZnJNboDDgHeriop9DAYOYvV95vY\"},");
                        }else if("Constitution of India".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1-bK0-GuMw605Dw2cN7203bmjcUnkKdi3\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1iyGSmlT3PQXxwbxIONSgGZOjlkrPRI8K\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=19TpKYLkGBSM9Ca0EoLzC5o_QMPw2U7ka\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=171uhLpQE5s3m3L3FD1aqdgUnquba50Qz\"},");
                        }
                    } else if ("sem5".equals(sem)){
                        if("Technology Management".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1X-5HDuaGHTmYTQBQSWECwO_MM_QMjZAe\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1dEMsu44BYgtSs0M7NjeYEV-ekJhaAxnP\"},");
                        }else if("Industrial Hydraulics and Pneumatics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1mM55JqQEgldgETZeF58p6WoWlRMhyZU6\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1heXwkGkinM-fQJaKig0ZpB4D7xk2gr92\"},");
                        }else if("Control System Design".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1DZ6ubATWuw-Jt3xUyMrmDjZzKnb-mKgR\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=14V6r3FgXEsyGtW4sUcpEIhHv7JGZQB0P\"},");
                        }else if("Basics of Signals and Systems".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1IWYiCKcTU8ult4oOZGsg78oGzHQnjLCB\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1-qtWh7svTWEUZ_JK2TfwE7wzse-K61hG\"},");
                        }else if("Industrial Internet of Things".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ure2aaHzKQtLEpvrJyJF-1sUtrBkHcdJ\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1nqHDO5_2GIvfoIx69nQNRt2II1OwYO11\"},");
                        }else if("Power Electronics and Drives".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1nfTfh1QdKYSR17VyLImFj1BuwRcoXqC2\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1wLWZ2-M_GF8uDF6UQfp1O8nT21ISAZp3\"},");
                        }
                    } else if ("sem6".equals(sem)){
                        if("Principles of Communication".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1QXMRKEdDpXTt30OkEDsEoJqfL4Zg8leu\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=174LcwXOwCjAxTniSJn8-C4xemBWXcIde\"},");
                        }else if("Process Control".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=14YnA6quXD9_GCIlhVAQ58SMePl2F_iA7\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1n2AtDyU0h24xRNHlW5x6vuuUuAy6va3e\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1sR_JA7zNSidQG_HX-6UnNCuYdsqkIraw\"},");
                        }else if("Industrial Instrumentation".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ZiWpPT5yvbzyAmTIDwC4ov4OmE9pvfgt\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1GUkJLEW--1dTlgvQviMwre1m2BmMV2oO\"},");
                        }else if("Fiber Optics and Laser Instrumentation".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1o4vdaIWX0z41K61Aw1CYhu1kPYiAZi_D\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1epWGsPFFsXlPRdALF35S4WZetxKIlo6G\"},");
                        }else if("Industrial Internet of Things".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1nqHDO5_2GIvfoIx69nQNRt2II1OwYO11\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1YdmBIy7FecmavTSPMk9IIOwWIJtDgTNg\"},");
                        }else if("Automotive Instrumentation".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1yd_fwnl1lW8HV707icxM8slJ6ZY2BbQT\"},");
                        }else if("Real Time Embedded Systems".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1gPBVYPjHrOXkd4cIYsjuiqg69dzBmm-J\"},");
                        }else if("Measurement and Control".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1yYBA3KR1n7Al_vi45YE-pV0mmWf6B9WL\"},");
                        }else if("Industrial Automation".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Z_kcyiyOVtArP62Hers8_xsi5Yaw25a9\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1YWim4izXk9fM9xPJw3gvUNdFIW-2Q1OJ\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=135FSuCfFsmj2IAJ1L8hS8LOWVMsZPPh8\"},");
                        }else if("Basics of VLSI Technology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1WcY6llPqIsLN9R2QVzcgJ3IsqslIzXFW\"},");
                        }else if("Industrial Data Networks".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1G2wlXHESlQNCk3tuAFsj7Zw9OKpWYKjS\"},");
                        }else if("Robotics and its Applications".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=12LOTgleR34iZpPlePvq0utMDgNrRq1rc\"},");
                        }
                    } else if ("sem7".equals(sem)){
                        if("Soft Computing Techniques".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1okroIZg3xnUswgg0BbTOzmhdSQjaAq8p\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1eqyzIbCO49Nn8H8GHf8JBNPJdZ3QI_u6\"},");
                        }else if("Analytical Instrumentation".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Bh8i3aIKL0A4oB7SZ9RuVe-1mVOOeYAN\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1qFHmHL25erHEDurrLTkLUG5TxHmmt1R1\"},");
                        }else if("Industrial Automation Systems".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1wQ6qpjXf1g2j19Q8w_nzxkd6CQ5qwsUz\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=15H-s2I8V4F31T5HkRAbodVikDUORDmLU\"},");
                        }else if("Measurement and Control".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1yYBA3KR1n7Al_vi45YE-pV0mmWf6B9WL\"},");
                        }else if("Power Plant Instrumentation".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1d703ULglSqGpCgYlvUHIY14OK2811qtH\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1d1IAaKxL10n3lnJTkaqxI6bpdRaVJECT\"},");
                        }else if("Biomedical Instrumentation".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1XUp40BBTvKL_55mxWYkLIoJAlElJR7pm\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1FW5oHX_nVLwdkTjY8mKAJYQiNzwOycQt\"},");
                        }else if("Smart and Wireless Instrumentation".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1T1FroOr8MltgB7VPBzN1tgTtOx0QoECM\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1uwiTFwZSWYHKTxxp2qUyi02iK2EAq52H\"},");
                        }
                    } else if ("sem8".equals(sem)){
                        if("Smart and Wireless Instrumentation".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1K2NRP030RrTjVFSGGJBSGYoxBi5ExSfX\"},");
                        }
                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("ibt".equals(dept)){
                    if("sem1".equals(sem)){
                        if("Chemistry for Biotechnology".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Kosybr4vGGpCxkAzCR17LfKchgbChqWg\"},");
                        }else if("Calculus and Linear Algebra".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1A4NkpaZeB6weGzbRWAG5bw-MaVL5UfAF\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1sdHhM1Ss92yHX-SqSgsscDROVVhzZUnm\"},");
                        }else if("Basics of Electrical and Electronics Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1aTfnjPe9KP-BMil_8qO2Oaz8SfAj6Shz\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1HCIWV5d1_souoTELDa5jposV1iAAXomF\"},");
                        }
                    } else if ("sem2".equals(sem)){
                        if("Communicative English".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=18yMUG7O59-FYh1JpiUx7VFMjCpvQb8Bn\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1z0-fYnqH0vNUl8s66MjCZhTkGFBimHnk\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1hlp8goUYICSydsqRFwphkQeqlD_63gwD\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1SpdvDbaVHJYrBEJ6FxQauh8FvtP1H1zu\"},");
                        }else if("Differential Equations and Complex Variables".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Q1-2ScmGBZiXplIF45S_7_aTfwFpvm-T\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=17ZDv-A1JCHSmiWYEN_JMfe3Zq1sZTDBD\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1q_83_jSolVdKlKAz-9fgLBLumgPXjiYy\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1CuHoYFeqNXM3ko6ihKc0ihkxQvOklesT\"},");
                        }else if("Mechanics and Properties of Solids".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1MDRxKFF8X3YygaJjqpUw9bCu3_aYng9Q\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=13Xxp1jBHSld-w7M-mzlGtjr_qYKsokvZ\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1dbENmp9NZr63Ie62Wqc_x-pI2akQy3Sq\"},");
                        }else if("Programming in C".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ri1_g-vTps2elHDBFLCk5s8hKU4JnJqb\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ARWw2o3PZg_R7wrQXgOFkvKq9kW02ctn\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1fNm_DtoGhlWhDCEQuilhifdaphAS-lm4\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=18cEey0E0ZHRE-O4IEfefhJTjaGwLCW4a\"},");
                        }
                    } else if ("sem3".equals(sem)){
                        if("Transform Calculus and Partial Differential Equations".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Nuql9qOHf-LNvgE3QsH4n9pPc2pU2drH\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1n4H5cTNXXJJqOKeBZKYXDSIlGjADBtE0\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1cNvDDuol6Zb0_LC9uYU0gA8pMLvhXJWw\"},");
                        }else if("Microbiology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1VrYVAXOfvxhPLqViQzU3ooxptV9Up44D\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1lkdDGU8fs5qfyicN2u1yMTMz-PyQdnIo\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1viB0nf7_9Kvz7oG7W6Rur9reqK1wCZB7\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1g7vaAG2Vnsua5I5XAod5h2BW1j2e3C04\"},");
                        }else if("Fluid Mechanics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1aLHaXzqfQh49IMfq3AfjHctNZ6FzDYlg\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1tkDPPDJAoGcMoGkq2QGqsi4Ig2S_lLL8\"},");
                        }else if("Cell Biology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1g0-LunTpzPWtaULxv5b7PeaGeu--hJZ-\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1iYV5QTxQbRj2DoWKCUzwgVU2FVLQ-Z7I\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1vxrdh4VRwJu97kXrTEpEYJE-n8YGpjI_\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1hMjV566lQUAmqHZYW71OTAaBpmQiw-Kx\"},");
                        }else if("Biochemistry".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=10YXsIn1pX7G6C2kRxikj6CxhuxkPCZSg\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1laIKFjkOKSl6yLfwNLMakulKIS2FWcr6\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1BBsu3AhzCiNhT8gHpCAM6OSxCy3aXOo4\"},");
                        }else if("Constitution of India".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1-bK0-GuMw605Dw2cN7203bmjcUnkKdi3\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1iyGSmlT3PQXxwbxIONSgGZOjlkrPRI8K\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=19TpKYLkGBSM9Ca0EoLzC5o_QMPw2U7ka\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=171uhLpQE5s3m3L3FD1aqdgUnquba50Qz\"},");
                        }
                    } else if ("sem4".equals(sem)){
                        if("Process Calculations and Heat Transfer".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=130qjxtfPAIjSNu95Ony8XCxhB7vMWRUZ\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1-QXKBMba_t1UNP51bbh7UVuR8ySVZE1B\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=14MyEv5Hat3g6WQ17Ha4lbwdf1y7pYqO8\"},");
                        }else if("Basics of Industrial Biotechnology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1dJNPDIUKBTMv1Xh-ceWMsmU80llBUoCJ\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1txj1OTUW_SE3pPueWaVKoIyPbeEqlrS4\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Uy7LdRDPw-pw8gb0jNerK_fi3RKgPTvc\"},");
                        }else if("Molecular Biology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=14sMe0QYD9SGXCOX94UqQll-ME6uYVfMn\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1R2dWbmrYCIv6Ii6M-utJZIzSJGE7aYVg\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1bgJnVZSQsE3k2YiYkKITxVMSmjpA7ieC\"},");
                        }else if("Biochemical Thermodynamics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Vh2sR6gD50fU9NFe5pcjH0D37zOYwB-r\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Px8Lk2Fo26cFma4AXSnoyYmMgI6mZ3jJ\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1mtYLHdmBPleR2dOo7e14H4sjHnb7-F_B\"},");
                        }else if("Analytical Techniques in Biotechnology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=19iHysoXe7bUDL3_Sf52QBCeOCcLO31gN\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=12wbuV9aLPYCx5pAZU9IPc12Jyig31m1G\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1UtyxLboOouZDojIZ54tTcDg5L3PotxA0\"},");
                        }else if("Enzyme Engineering and Technology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1FL7340ZVPHoehIldcjqziuKvxNZ6olAq\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=15hVQKJpeg_cICxF8GLuvhz9eaqiHjHLT\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1fJU4iexnPD1CCHw2UcKmdlet5j9PbTpf\"},");
                        }else if("Environmental Sciences and Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=15V3_kMJ7vOsxaFLw9z-w-0TZtIcc8dwq\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1bkwLUCdXJCqzN4bwKjPpAp0bAE0sf94h\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1k2euZNYvK8hBoR8Lg4b7waD-_Rw5XtU1\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1TaXDZLu11hPFEfPUKv08r3u--d3_Dg1Z\"},");
                        }
                    } else if ("sem5".equals(sem)){
                        if("Clinical Trials and Bioethics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1sxAUf7GsMwNDNBD0x3aC9W88bR5RcWt1\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Pkmum4Rg3NRLkIYSOnmtTOfQlc-HrpZu\"},");
                        }else if("Mass Transfer Operations".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1fvkyWtTyAIdL_F8PpV89ZI2LC7v_GFnj\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1n_VUopJH-140WlM3XzgDU3S_ZuhaBRq1\"},");
                        }else if("Bioprocess Principles".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1dIvl3E1iRwXzLgc3Vhm4Ivd02QMd_cjS\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1FUl0C1pUPvXvxUlQwC227D2AUE_ZHefe\"},");
                        }else if("Genetic Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=182PfxMgdoJ0KxBASBvMO6X2zKJM9-I56\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1XEW5L6QgeZVIrfPWTCA-dxQ8UJPnLhVd\"},");
                        }else if("Medical BioTechnology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1_mSGiE5H2YztphCLGx8LznXqsD8MmGGI\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=14h615OadO5i9KdV8nQRk0JkRaE6VU8hn\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1kzEnt_jT9Ou7CW3jRsnsPSs3WTLhPB44\"},");
                        }else if("Fundamental concepts of Biology for Engineers".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1jJZ1NezQvHXgSjvSKLgz357cWS-9iee3\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ypLTg_1ZMVS07UYww8Ok5j8TFun3ZX8Y\"},");
                        }
                    } else if ("sem6".equals(sem)){
                        if("Immunology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1-9zQS-VyRfCBR0LGtQnd4pFXoh0ixrAq\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Z4OhGk6jYh_T-YHhPrSK1M_m29ViryZQ\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1kV_3miyeEVscbg2wbLsT9_AF7PB5D63H\"},");
                        }else if("Bioinformatics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1wxLLFZWj6h5oB9PjCGL5rpHo8Ep53rGn\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1C1Db5AsQNUz97NzbZZJ7nDE5iSTutAnS\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1kTcCtAwPy4Fr3QXslBjCG_DjbthVwtaM\"},");
                        }else if("Bioprocess Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1a47gY3D4qFMj9FV0Ohj04e112YqfYM6T\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=15XsyUU5hSoIIm37pxQEtzV6D2x-jzgA3\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=13_qbFdTpAfHb1-jCpyD7SxSkhYL7zJH4\"},");
                        }else if("Chemical Reaction Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1PQUIaP27sYcm7aOEV1lGwLh3uLy66-Bn\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ZZrC_2_WZhJQxwMbrmxHsSluAkM00i56\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ZKc6WuM-wRDgRwcr1g21YP4hARsHJB4Q\"},");
                        }else if("Plant BioTechnology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1saHEq-TWQrrdWZOYqe7wvIRbQQvBQQML\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1FMkgExJwpDYAANLi6a9XE4Voqf9NVeZ2\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1pYXvzThE15xCv9M1sSoP40Lg-Qc3p0Us\"},");
                        }
                    } else if ("sem7".equals(sem)){
                        if("Technology Management".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1X-5HDuaGHTmYTQBQSWECwO_MM_QMjZAe\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1dEMsu44BYgtSs0M7NjeYEV-ekJhaAxnP\"},");
                        }else if("Downstream Processing".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1GhaFadnWb4pVYcEra1HIUJ_4moBeXhi0\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1qxUZ2xZHCPRVKfECehp0XhMqNMEXvLxR\"},");
                        }else if("Food Process Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1MPJCYqOheALi_sKgivCQ3HWQKRbHt673\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1uaBoD4hiztaSWe2lpnEqGHCOfeljECud\"},");
                        }else if("Genomics and Proteomics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1kzojVQLFAC6-gpuUnufsctHEubsquDZu\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=145hV7ieT_rWDDtycaBvAmo-FZJUKIaaR\"},");
                        }else if("Marine Biotechnology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1h186Cq3zTSjRViEh126jsuGzV65Cm8J3\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1fpthJeGgoKjCBb46g4WF_xjBTljgjpyc\"},");
                        }else if("Animal Biotechnology".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1hG_jFrBSFbIO3aiXYJLLjDYJgKWyUt5j\"},");
                        }else if("Genetics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ra3S6LPh8W6Jk-6XZAH4OuMBSDy5DY1f\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1zcKWyLdos2nrIFyTW9UCIV3myHzy47xz\"},");
                        }else if("Fundamental concepts of Biology for Engineers".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1jJZ1NezQvHXgSjvSKLgz357cWS-9iee3\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ypLTg_1ZMVS07UYww8Ok5j8TFun3ZX8Y\"},");
                        }else if("Nano Biotechnology".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Ai5V8Km7m6oMpNwBrbupXq933U9o_Mkm\"},");
                        }
                    } else if ("sem8".equals(sem)){

                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("it".equals(dept)){
                    if("sem1".equals(sem)){
                        if("Communicative English".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1XAhf1UfnE1iveuHMxBT1V8EWsRQjN1TP\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1SpdvDbaVHJYrBEJ6FxQauh8FvtP1H1zu\"},");
                        }else if("Calculus".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=11t9eKhH01hHQSZFTWcpe-F_yCGybzE_0\"},");
                        }else if("Semiconductor Physics".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=12LvGiCl4u-IgR4DMMrTqfNKVbQlod3cE\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1y5Ha258OCSLoorOUUWvLsicbn3Rc_Q6S\"},");
                        }else if("Programming in C".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1u__7V9K09bKWMkrmorsbqwJoOx9Qz45n\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=18cEey0E0ZHRE-O4IEfefhJTjaGwLCW4a\"},");
                        }
                    } else if ("sem2".equals(sem)){
                        if("Applied Chemistry".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1AWgb8IZb9cqQZ3RT45WgXK9stsXOXaBI\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1w1Wz0kI8hQeC7yvuPYCi_cQVoxhETN2l\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1bzNqV-Ev1Y1xaczwg6MeVexYlpTSLVZu\"},");
                        }else if("Differential Equations and Linear Algebra".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1xngdsQpkSIsarH7wX_DZZ-0nS8TXsB75\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1a5OgvUycxMSM_YKOI2cNeJZRvTJlJK5v\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Z78p5MKfBTjceBMR0EBHYAVuJsIOjbBD\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=183mKnMkY_BMA05EJvj3iv53y1ba5QqCx\"},");
                        }else if("Fundamentals of Electrical and Electronics Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1QWK9MBBmESEv9mhkWTmrWfHDmO4MUsV7\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1wV6916t9mgVgET64efSrTe7gseew0MFE\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1r8KmQkA8I_oJU1wXreDyhOwarqP9NHDc\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1sEYTkmgS_ha_Xquss0269h_PloGe4ft7\"},");
                        }
                    } else if ("sem3".equals(sem)){
                        if("Probability Theory and Applied Statistics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ZIHxdb7oN6GqqwUzdP-tFn_7sr9vRHcv\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1bSo_Mfpi7CXTQP89SFgP1H2Jq9YxtxgL\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1wTj-YIDu21BkZpEPylX_qoPDdg-ITyIP\"},");
                        }else if("Digital Logic Design".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=12nG_cPJwQeOC7rcs5QmTvwEKo8cVXaIU\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1DAE8-3auCLhIWkHtEbgFhXu-uVVK8gdU\"},");
                        }else if("Elements of Communication Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1KEvpDnWs7obHdU789XZvM9LTTC_0gJ1S\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1WxWHyAtFcJPwWhL1sGE8E2aP6UdZpZEd\"},");
                        }else if("Basics of Microprocessors and Microcontroller".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1_TZc7b70eZgwCh8tCL9SMQX42Ni34LBK\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1e48E8u75hF7A2sxXFVFXiJTH4sbeYSlH\"},");
                        }else if("Data Structures and Applications".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1e6d8JoGXOBlxaJG4HMVjAo9XD-AramWL\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Q4PyVV6xuERuisnJ1kOWhDgEyPiR8Pny\"},");
                        }else if("Object Oriented Programming".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=14nWQEI4burhk-WXNxLZBsa9dmkCDuWLS\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1K7QjKrBtiWMnlvuUloLQSZVn8927BShA\"},");
                        }else if("Environmental Sciences and Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=15V3_kMJ7vOsxaFLw9z-w-0TZtIcc8dwq\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1bkwLUCdXJCqzN4bwKjPpAp0bAE0sf94h\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1TaXDZLu11hPFEfPUKv08r3u--d3_Dg1Z\"},");
                        }
                    } else if ("sem4".equals(sem)){
                        if("Resource Management Techniques".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1aXsnqZYQUCE44CNYSrrtgBrn8_pFRLWd\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ohucwO0jEb3fQNKHYDkiDVgx6-INtwrX\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ovaogdMhgj4FeXZsbGawt-x_gLE4wTVA\"},");
                        }else if("Elements of Discrete Structures".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1YPjlztMo3oGmABe2XofxHlIKcXGVwyTg\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=17LoTzjU2SKE5tB3bkpGGT_9FLwtCkwho\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=19EJwYOhPsYPe5L4m9IyruUUoBOkecgDe\"},");
                        }else if("Computer Organization and Architecture".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1QWK9MBBmESEv9mhkWTmrWfHDmO4MUsV7\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1vFIpRspw5_1reoDyY3PVDIhpeXW50s1C\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=13fD4T05mB-oCEzRJfhoeutfuFVix0jw_\"},");
                        }else if("Database Design and Management".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1dnhEKelHM4XbXS3PXrHEBRSlwGVshM4H\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ghBfbYoI0mZd1Rl6LjK1Ha6wLoBD_QQn\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1cdw2J07edC5mNU83polSeH7go7kd4vFM\"},");
                        }else if("Information Coding Techniques".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ImSRA2L4Mm7gC9lr9-RpVxRmUAa8p8gY\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1rZrduBma5z9bFbQXr5DGf8oqz_2wOz37\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Xtqe8BG6YxptxPD6FXGa9uxUgBYLlMDf\"},");
                        }else if("Operating Systems".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1CKRZR5JBO0i2PCz6u5IJ8_XP8l_rbsxW\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=19bMSiIoyjOYrEAfG2aQFWxuHusmMRxAI\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1jN17-HBjAYakRnZStOoRedaTSuQOyV29\"},");
                        }else if("Constitution of India".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1-bK0-GuMw605Dw2cN7203bmjcUnkKdi3\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1iyGSmlT3PQXxwbxIONSgGZOjlkrPRI8K\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=19TpKYLkGBSM9Ca0EoLzC5o_QMPw2U7ka\"},");
                        }
                    } else if ("sem5".equals(sem)){
                        if("Technology Management".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1dEMsu44BYgtSs0M7NjeYEV-ekJhaAxnP\"},");
                        }else if("Web Technology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=10HzjfxaSWfjOpZ_xfoDAkJj8ko7_hB91\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1BKbZpHf1jHpg7WPvtpE7Ac6E-0lDwUyh\"},");
                        }else if("Data Communication and Networking".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Y0IfLH2nGcb_5ps_j8vW0sEsuXxaww5e\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1MnQymlJpZ8Le49cvZgOT7TvwCE0YZ487\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=11pJQHjcrN3Sxz5pNMqScl7v9LaI2Erw9\"},");
                        }else if("Analysis and Design of Algorithms".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=11FZfzTDFA8JwSriE6v8s8z6bO5l1TTOp\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=11aBBlmleZZy-LMhi2v2D_95-pPsm13Zf\"},");
                        }else if("Enterprise Resource Planning".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1QwI2g7dl69uaVFBdPkojcnt903nHRDV9\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1CmDNKk0cbkOZNCfKOh0IZPPLkdzyKwui\"},");
                        }else if("Programming in Python".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=13qBqO6FvOmEdqkodUba6Yv_0nG85cT92\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ymo_7J63EhV21_ipBvRwP3OGow3xdGVi\"},");
                        }else if("Object Oriented Programming using C++".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1uD0nRrHm--W_xE5pUHhjAEV43bzh2zN0\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Cg3gxzZO1UaPBlgrSAINuYOFNC0j6XPX\"},");
                        }
                    } else if ("sem6".equals(sem)){
                        if("Fundamentals of Machine Learning".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1gGvqAhUjL-ctPwHYz5FbhHmpnRakkgMz\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=18boN5NMe8zyDJjDztpVTkGnQJgYJlIb5\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1mOg3Wc3TjuzXyCnWb5rbGtKI_al4_O9Z\"},");
                        }else if("Software Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1JifcGkh1xSc4Vg58xULKIrjIJ810_UAI\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1W6BIcJ8gvm7M9SBf7yAYO6v6GnE5O_v5\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1X9QfVAHW1FqFwZG0CHYYUvMm7Sn4S9n8\"},");
                        }else if("Fundamentals of Digital Signal Processing".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1zutY_FHVTQLD9jWQm4szwNvpmabH0Ryk\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Ai6HoIXyYQ_wX1DAr_4c2aGyZ2Exi96g\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Xhb1FTxSBIZl4uu_NZt15BGloBP0WEya\"},");
                        }else if("Object Oriented Programming using C++".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1uD0nRrHm--W_xE5pUHhjAEV43bzh2zN0\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Cg3gxzZO1UaPBlgrSAINuYOFNC0j6XPX\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Km-Qz1P-fBtheFJZM0-0TFaIWXzvfFSR\"},");
                        }else if("Programming in Python".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=13qBqO6FvOmEdqkodUba6Yv_0nG85cT92\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ymo_7J63EhV21_ipBvRwP3OGow3xdGVi\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1D-nPkvgniqLE_w79GZyrIm6pe1-W-BkY\"},");
                        }else if("Intellectual Property Rights".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1vmqi9U9tcp7WRmGKyu1iAQny2MLj7hPW\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1JjzlqwyqvyhB61TON5p4aJYg2zxsX667\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1PXlfT5CZbV4pEjIBPKCEFtwD-Q5nwun5\"},");
                        }else if("Software Project Management".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=10X-imndma3CA-iJl43stxcAxAMAGdhUr\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1IBy0B9MU-J7Y4qb7dePQ-Hv-abtUDc6p\"},");
                        }else if("Artificial Intelligence and Applications".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1xUHUpXxeAh01cxd1bbhLNTdVl0qle0y9\"},");
                        }else if("Mobile Computing".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1cmkKLHRZkvadnd_qCkXHqY-5oFV8U8oJ\"},");
                        }
                    } else if ("sem7".equals(sem)){
                        if("Professional Ethics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1TPIMqgLGefEXhNTS7w73QGyBQuZKbpAq\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=15yROOabPIBTvNu8qOCMhMRUgyoip0qxw\"},");
                        }else if("Cryptography and Network Security".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1S2ho5uqzpsvS7yeQKTexc36DOrdBt27s\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1YAWwSDrhNrOYhTVbYIEPHB54Vlb8DIXU\"},");
                        }else if("Internet of Things and its Applications".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1b0WIe-Pco9p49p06fzOA7_Le-YMbnMLc\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1K-we1-PgoZKDQMfExDlXVdi1i4y1UDU5\"},");
                        }else if("Mobile Computing".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1cmkKLHRZkvadnd_qCkXHqY-5oFV8U8oJ\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1vwUvJC7Nre1UvkyypQmnYfWmWxikV8bA\"},");
                        }else if("Enterprise Resource Planning".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1CmDNKk0cbkOZNCfKOh0IZPPLkdzyKwui\"},");
                        }
                    } else if ("sem8".equals(sem)){
                        if("Big Data Science".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1l3U13ykmn0WfjHipf0qUtHeZvDbyFJuC\"},");
                        }else if("Software Quality Assurance".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1f5YQZZsxxSRgWaHcfxUrOSrDeZiO_cXV\"},");
                        }
                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("mech".equals(dept)){
                    if("sem1".equals(sem)){
                        if("Engineering Chemistry".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=12KO9BmLDcb4RYX_IqihbGoYaqZwub7bl\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1Nezc2CA4lUkF1kJNS4bjbLRgCtvqjutZ\"},");
                        }else if("Calculus and Linear Algebra".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1A4NkpaZeB6weGzbRWAG5bw-MaVL5UfAF\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1sdHhM1Ss92yHX-SqSgsscDROVVhzZUnm\"},");
                        }else if("Basics of Electrical Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1c5qW6CO4UDZv0wgorw3tFtYjop8sqzFz\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1_k5JHGFBZh7ga-s40ELwpbH1vhpOzheW\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1ZdEi6ELhHMjCtVtojeMngrv_7C7EPqlQ\"},");
                        }
                    } else if ("sem2".equals(sem)){
                        if("Communicative English".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=18yMUG7O59-FYh1JpiUx7VFMjCpvQb8Bn\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1z0-fYnqH0vNUl8s66MjCZhTkGFBimHnk\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1hlp8goUYICSydsqRFwphkQeqlD_63gwD\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1SpdvDbaVHJYrBEJ6FxQauh8FvtP1H1zu\"},");
                        }else if("Differential Equations and Complex Variables".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Q1-2ScmGBZiXplIF45S_7_aTfwFpvm-T\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=17ZDv-A1JCHSmiWYEN_JMfe3Zq1sZTDBD\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1q_83_jSolVdKlKAz-9fgLBLumgPXjiYy\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1CuHoYFeqNXM3ko6ihKc0ihkxQvOklesT\"},");
                        }else if("Introduction to Electromagnetism and Applied Physics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1AAUTeYNGD9KfxjDF2ttAl9loJhpddn2I\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1DBnD8J-AmbVivNEEq908AJ26MbBTy1aI\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1LlYJpg4qvblIlxvRWChGxExlRVejb9XA\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1Cr-jJ9n62rjeZs1Z4JgwM5UAD5CyDwJA\"},");
                        }else if("Python Programming".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=16K1g9FvBvxG9-yicuA322_tLcPvcBQEk\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=11N-c73M0_v4Kp8AkVlVUzTs00BFyxmy3\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1zKYhd2HD5tlfYUP6NwzYly71xwpXvFHW\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1ycMjdIuv-Rv4cIagKcMbsarUgUgiESkM\"},");
                        }
                    } else if ("sem3".equals(sem)){
                        if("Business Communication skills".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1fOBeM3GCllb0e9Wyl8FYyWLYilq_RNbx\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1_d5zLNFtPld51H6zeuLaXGodbS8FfaX6\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1HviikjBbef8wb4aB_6Y8S2Sxsr-Sdque\"},");
                        }else if("Partial differential equations, probability and statistics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1C1MYh_LHBhttKaZRWF8kjZ8ymlhDRX_t\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1E-khuizMzmo-MTg3AT-adhvjXDY_Oi3K\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=13dvK4kZyo83KZwIEP6tI280j5R17VwRR\"},");
                        }else if("ENGINEERING MECHANICS".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1jovt94Dpwc29ubMssIDsahrsEcqsoBrL\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1AapFz5IfpaMJHCGxNHE-6dNyTFwx83g4\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1NhVJ2wDnqg9Qt74PM0pZaXlTvRGH0sGk\"},");
                        }else if("Mechanics of Materials".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1N2UGfqzSukPkTnnwKKNhoFoHcqBX8Qie\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1O8f04YZ_Km4-CgzyPgMdUIZvG8sAShs9\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=13fX-vFI2GfkdshUZ8GwWFlQgpYOAb0k3\"},");
                        }else if("Fluid Mechanics and Machinery".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1GTyuQmpDBcug3cCDEl-sspqY4U7dk05C\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1vj_2nwaXuqcVQvVUJfLoPxArf7ausc8F\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1JCPcULIhbR8zeASHHbECfJI2lfFxE7Mn\"},");
                        }else if("Manufacturing Technology I".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1IFMiUTK-V1tpx2Kah5kWeftPygKVx-u6\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1p5qS4nopRLbkG4vUCrJW4-SnT57v4FQ4\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1NGAPj6ZkkE2OtPxEpX26WKGc125uy2s3\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1-uySsgeHA6mKo0hRTvCuXebI83zHlHzp\"},");
                        }else if("Constitution of India".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1-bK0-GuMw605Dw2cN7203bmjcUnkKdi3\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1iyGSmlT3PQXxwbxIONSgGZOjlkrPRI8K\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=19TpKYLkGBSM9Ca0EoLzC5o_QMPw2U7ka\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=171uhLpQE5s3m3L3FD1aqdgUnquba50Qz\"},");
                        }
                    } else if ("sem4".equals(sem)){
                        if("Professional Ethics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1TPIMqgLGefEXhNTS7w73QGyBQuZKbpAq\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=15yROOabPIBTvNu8qOCMhMRUgyoip0qxw\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1xZPV1wkBVtwfJ1gKg_IG7s7ondZMvqi4\"},");
                        }else if("Waves and Optics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1iYhcOw3pLtyPkqNGcpngtUoBGwuTiaYw\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1rj7gd1b8PnyGVAj1lJl_D6o_eIcO1xJ_\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1X2xvxy6VBh-DyDHO5vm6DmjWbA6lI8jc\"},");
                        }else if("Basic Electronics Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1kZa4jTEoom0iHEQXKEqMz22H7z6Smv3K\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=129KV137wZULHmWudsZ-XyuFjeBv3xYHs\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1_3tg9LJaZXQOl1wMkmRmJ7ZfKnDVIKnw\"},");
                        }else if("Kinematics of Machines".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Y2wRYJGOsI2qSDqlGxYkHH0llbxiUBY9\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1LFzNRw2LhAZ7rdbgQaxCepAO3l4i8qZs\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ZpCvwpHfqKDRV8Kw_JZBSD23Fd9IyrM2\"},");
                        }else if("Thermodynamics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1oYgUc4GCoODu48anZ9rQAxDYqSnqiDpn\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1CIqi8sFiuoY6IFyR_3i9rT0ED4Xzemzk\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=13Pe0ady2TIaeo_I1evGEZ34gRV7SEgBe\"},");
                        }else if("Manufacturing Technology II".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1qhMwZOOmbt-goTv7RfvEYYqsN29KHItH\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1QFZDRcQTDmBexXGn918JKEl6404p9SOK\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1OrwmYeF3oYgi0rJChy2IJdfRaHH4a1x6\"},");
                        }else if("Environmental Sciences and Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=15V3_kMJ7vOsxaFLw9z-w-0TZtIcc8dwq\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1bkwLUCdXJCqzN4bwKjPpAp0bAE0sf94h\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1k2euZNYvK8hBoR8Lg4b7waD-_Rw5XtU1\"},");
                        }
                    } else if ("sem5".equals(sem)){
                        if("Principles of Management".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1L7N_SdPgOSYlwNa0kWb2TfLQstntn-70\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ySVYuB_GmFDp0GPIEJWz_CkNYUjMCD8p\"},");
                        }else if("Biology for Mechanical Engineers".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1xC5hO1Hec0hckyY_JV_z4CURKcjZXvw7\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1RUq-JRz915VnZpwAdYmsW05nclgAhl6q\"},");
                        }else if("Dynamics of Machines".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1BZYbu3jPbr1kdSt_lwE2gjAOjrMM2aZy\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1826oy_1Ga3W8WayWfp4cKYSr-9oeX9Lq\"},");
                        }else if("Thermal Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1mzjLoALecLl7vt-Izyu55wI0VFVNy5lX\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1FF6zo-F9ZrNI8gIORFe_CHjpMmMtZTTc\"},");
                        }else if("Automobile Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Bj8_36jlFzkX9S9tdtxHmRKLDBI_mEja\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1HKPeSQkos0Xan_WYb5EL6QEul6XQdQUW\"},");
                        }else if("Mechatronics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1nfJ9_YmBWUolY3TgYP4IOH46QT5eSWqa\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1tZN3193-7KZIZE4UTRN6qtNmRDRzzoL0\"},");
                        }
                    } else if ("sem6".equals(sem)){
                        if("Design of Machine Elements".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1NfnBTx8CLt0k5iK3gmShIwjCMuxKTott\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1dIeCAH91WpHcdZlpadgvYUTfPDESa_Qw\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1IuY3WPJIBFA77F4ec7QExP-5_sjnKwHm\"},");
                        }else if("Materials Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1QyPgMeESieCFETtMKG-KQi6oHKiBBLXp\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1UhAscAXHCeJiMfPIfjv-TZ8ZQUkghMdh\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1beBgk0ljbLQ201IQU5812Xvo7wGl-K4w\"},");
                        }else if("Heat and Mass Transfer".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=102xlywPgGjXrID60kut3eaDokfbmYEpO\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1N2dePumeqn63-SbMhKjANN3z-eiTgHMK\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1lPH6h6pSpAuU5ZKrFQZbQE-5suXCKnge\"},");
                        }else if("Gas Dynamics and Jet Propulsion".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1gvfQKJAj9_xist53h_tjJ1xaraztwoNz\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1bxMx5ti-LRzUYDoDkegAfKwRFkmdIKXA\"},");
                        }else if("Lean Manufacturing".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=14Yqy0Q1tLe4AuMx5B4WvVLuQAfv2uDys\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1NEDQyPBKau4iih0DbHCN05WYoVs60AqI\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Ts51I9uy_n7ms0yW7y1Tu4_J-rkezaAU\"},");
                        }else if("Additive Manufacturing".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Yw9Z4bkWU01VnAT65yVkBNo11yPqgwcq\"},");
                        }else if("Entrepreneurship Development".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1fBsjZNDNdwslm7h8Ciokfl3yGJjoK5Qh\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Bf-ybQTQwabQyBXgMxzdgHdxxcjF38QP\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1PvhjmgeNIRQhFhATIz1j5GeC8Yp8ulot\"},");
                        }else if("Total Quality Management".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1VSbBCXdt2SNiQXkQOI4icPPds4_FMAee\"},");
                        }else if("Process Planning and Cost Estimation".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1zS-7hlkk0GuEK2Wj0gX1z6lDhkpzzOqH\"},");
                        }
                    } else if ("sem7".equals(sem)){
                        if("Design of Transmission Systems".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1lchTorZL7mtyCIM9Q1tkxUnNe2M28zHP\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Oflf_7qW1szLUme4YsLij2_9sxLdZJpP\"},");
                        }else if("Computer Aided Design".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1WKhhbhBNnfa4Nqynw__YD4_IEvt6rla_\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1VIkBcvW-3W5pz6QcF_tCXUwd2DMaMeda\"},");
                        }else if("Finite Element Analysis".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1bnAxHuuVvaUrxGVTAmHQt08sMiLoc56X\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1-_2mhuxvg0dRTeoEdhl6NRdmRrGUX5Cb\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Zyc20gSYM063aIQP6rDL9n1ebF_OelrS\"},");
                        }else if("Process Planning and Cost Estimation".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1zS-7hlkk0GuEK2Wj0gX1z6lDhkpzzOqH\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1w6ALoKniEiFsVtAwFzVbe3ca-QLrmSOk\"},");
                        }else if("Industrial Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1w9NZ72tMOvxGc2RMeeK4mJQbd5TvsrYG\"},");
                        }else if("Welding Technology".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=14JQGpIbyy1cBLO10FEabfWYeohvIFuUD\"},");
                        }else if("Total Quality Management".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1VSbBCXdt2SNiQXkQOI4icPPds4_FMAee\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1LPybNs8QcxlsIZwZpk5CT1m_gcXkn0E-\"},");
                        }else if("Additive Manufacturing".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=10A91guxgWvV59KWbZ-EAi7v7DXoabERe\"},");
                        }
                    } else if ("sem8".equals(sem)){
                        if("Gas Dynamics and Jet Propulsion".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1bxMx5ti-LRzUYDoDkegAfKwRFkmdIKXA\"},");
                        }else if("Automobile Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1bci5EGJvPCZRxuQ2nbcD_mcBCARKbxfh\"},");
                        }else if("Entrepreneurship Development".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1zMSLsR-dMCU1CwhMTAJDqsVJe_FdiviB\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1PvhjmgeNIRQhFhATIz1j5GeC8Yp8ulot\"},");
                        }else if("Total Quality Management".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1g_403n2oxA8euJNdm2PZMqeWZ9VarsbS\"},");
                        }else if("Lean Manufacturing".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1sS9Fj3BV8vcuQP4CqH2f5El0hHtVoRop\"},");
                        }
                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("prod".equals(dept)){
                    if("sem1".equals(sem)){
                        if("Engineering Chemistry".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=12KO9BmLDcb4RYX_IqihbGoYaqZwub7bl\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1Nezc2CA4lUkF1kJNS4bjbLRgCtvqjutZ\"},");
                        }else if("Calculus and Linear Algebra".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1A4NkpaZeB6weGzbRWAG5bw-MaVL5UfAF\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1sdHhM1Ss92yHX-SqSgsscDROVVhzZUnm\"},");
                        }else if("Basics of Electrical Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1_k5JHGFBZh7ga-s40ELwpbH1vhpOzheW\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1ZdEi6ELhHMjCtVtojeMngrv_7C7EPqlQ\"},");
                        }
                    } else if ("sem2".equals(sem)){
                        if("Communicative English".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=18yMUG7O59-FYh1JpiUx7VFMjCpvQb8Bn\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1z0-fYnqH0vNUl8s66MjCZhTkGFBimHnk\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1hlp8goUYICSydsqRFwphkQeqlD_63gwD\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1SpdvDbaVHJYrBEJ6FxQauh8FvtP1H1zu\"},");
                        }else if("Differential Equations and Complex Variables".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Q1-2ScmGBZiXplIF45S_7_aTfwFpvm-T\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=17ZDv-A1JCHSmiWYEN_JMfe3Zq1sZTDBD\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1q_83_jSolVdKlKAz-9fgLBLumgPXjiYy\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1CuHoYFeqNXM3ko6ihKc0ihkxQvOklesT\"},");
                        }else if("Introduction to Electromagnetism and Applied Physics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1AAUTeYNGD9KfxjDF2ttAl9loJhpddn2I\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1DBnD8J-AmbVivNEEq908AJ26MbBTy1aI\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1LlYJpg4qvblIlxvRWChGxExlRVejb9XA\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1Cr-jJ9n62rjeZs1Z4JgwM5UAD5CyDwJA\"},");
                        }else if("Python Programming".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=16K1g9FvBvxG9-yicuA322_tLcPvcBQEk\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=11N-c73M0_v4Kp8AkVlVUzTs00BFyxmy3\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1zKYhd2HD5tlfYUP6NwzYly71xwpXvFHW\"},");
                            string.append("{\"date\":\"Jun-Jul2021\",\"pdf_url\":\"https://drive.google.com/uc?id=1ycMjdIuv-Rv4cIagKcMbsarUgUgiESkM\"},");
                        }
                    } else if ("sem3".equals(sem)){
                        if("Business Communication Skills".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1fOBeM3GCllb0e9Wyl8FYyWLYilq_RNbx\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1_d5zLNFtPld51H6zeuLaXGodbS8FfaX6\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1HviikjBbef8wb4aB_6Y8S2Sxsr-Sdque\"},");
                        }else if("Partial Differential Equations, Probability and Statistics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1C1MYh_LHBhttKaZRWF8kjZ8ymlhDRX_t\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1E-khuizMzmo-MTg3AT-adhvjXDY_Oi3K\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=13dvK4kZyo83KZwIEP6tI280j5R17VwRR\"},");
                        }else if("ENGINEERING MECHANICS".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1jovt94Dpwc29ubMssIDsahrsEcqsoBrL\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1AapFz5IfpaMJHCGxNHE-6dNyTFwx83g4\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1NhVJ2wDnqg9Qt74PM0pZaXlTvRGH0sGk\"},");
                        }else if("Thermal Sciences".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=14WPpgB4RRzlz9JLPGSklXtZ9b05I0Mif\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1KxDmQtxgjeq_Aio22gTtPu9rXvffqoy0\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1we9d6ApIWpA173gYIZubAw7TQCtwdWfM\"},");
                        }else if("Engineering Metallurgy".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=18GRLbHD-aAGsdzzbx-uHkbEiv8HkJzsy\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Py3e5l43Z69S3lehhHO0YVCSqmeiTgNc\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Pzv4cBT0suTtizNM8IjhCe9f01Ov7iCU\"},");
                        }else if("Manufacturing Technology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ahHJAlOHjhqFX1yIL1capp9hEHscGuYB\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1ouYEWGYGnpwsaO_xTrxhO_E4zF1HbbPE\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1OcZPF0xAJFoCjg0RvlkPxtVQefP-IIiE\"},");
                        }else if("Constitution of India".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1-bK0-GuMw605Dw2cN7203bmjcUnkKdi3\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1iyGSmlT3PQXxwbxIONSgGZOjlkrPRI8K\"},");
                            string.append("{\"date\":\"Feb-Mar2022\",\"pdf_url\":\"https://drive.google.com/uc?id=171uhLpQE5s3m3L3FD1aqdgUnquba50Qz\"},");
                        }
                    } else if ("sem4".equals(sem)){
                        if("Total Quality Management Concepts".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Y-SEfdznWVfjpJGFQUbmYBn8LcmrCOq8\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1OkqiaOYSZ_sePFQIegPcDPIzxKVAfFjo\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1i4smrCguwjqkZ3UKRHSTuLG7v1ISNMqd\"},");
                        }else if("Waves and Optics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1iYhcOw3pLtyPkqNGcpngtUoBGwuTiaYw\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1rj7gd1b8PnyGVAj1lJl_D6o_eIcO1xJ_\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1X2xvxy6VBh-DyDHO5vm6DmjWbA6lI8jc\"},");
                        }else if("Basic Electronics Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1kZa4jTEoom0iHEQXKEqMz22H7z6Smv3K\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=129KV137wZULHmWudsZ-XyuFjeBv3xYHs\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1_3tg9LJaZXQOl1wMkmRmJ7ZfKnDVIKnw\"},");
                        }else if("Fluid Mechanics and Machinery".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1GTyuQmpDBcug3cCDEl-sspqY4U7dk05C\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1vj_2nwaXuqcVQvVUJfLoPxArf7ausc8F\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1yO3IMRl4lwG_M0NGwwbkWYct5Y0s5FoY\"},");
                        }else if("Mechanics of Materials".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1N2UGfqzSukPkTnnwKKNhoFoHcqBX8Qie\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1O8f04YZ_Km4-CgzyPgMdUIZvG8sAShs9\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1s_UEwzwSRYrZ6pytCUGYN9al2X67g26K\"},");
                        }else if("Machine Tools and Processes".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1lJ9ExTLRR-d0zex0skXck2SaA04P8nd9\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1m7CZ98XiBsvRMFsIGDsP7G7h1L0bOZUs\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1f1NUvgmeeqkJ3kuelGQAHxB7e9Uy12I-\"},");
                        }else if("Environmental Sciences and Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=15V3_kMJ7vOsxaFLw9z-w-0TZtIcc8dwq\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1bkwLUCdXJCqzN4bwKjPpAp0bAE0sf94h\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1k2euZNYvK8hBoR8Lg4b7waD-_Rw5XtU1\"},");
                        }
                    } else if ("sem5".equals(sem)){
                        if("Operations Research Techniques".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1iEADoqg8HUWWiKFMmVBGoaAhxDyGxLNW\"},");
                        }else if("Production Planning and Control".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1-n-TKgjvpqaYxm_JQlepjTpqJYGhtAMi\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1_tdOS7ASlvslPm0mXGMDC-1HouU2o0Ol\"},");
                        }else if("Mechanics of Machines".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=105GBtEgOwz3TcIzeEQxAFyjJOjjPnn4p\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1Qxh_X98ivBS9SyJIrhfeCrL76WL8WM55\"},");
                        }else if("Metrology and Computer Aided Inspection".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1DubU7YSyKnQdHf1oRl_2h2cjwbjbY5Ol\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1l-yCEgx5asIpHmO-fxNdhTPcqopJNqxW\"},");
                        }else if("CNC Technology".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=19xNgGthGQVbYAmicTJ7bidneuIMHggp0\"},");
                        }else if("Production Management".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=17c2qp32xzverNBWJlfm0gANWae8gWzJW\"},");
                        }else if("Managerial Economics".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1qcGNOybT5JAZx9gQg9fngFB7RyMDswYS\"},");
                        }
                    } else if ("sem6".equals(sem)){
                        if("Machine Elements Design".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1h9VUwC-vZcYMBAdxLH7soNvjI3Jl5fQL\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1EDtWuUyyBoCZuInZi7yHQ-MoutmNFgyg\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1B6v4igBZNo1W4ZZzbRGSOJPXaXVkLrNG\"},");
                        }else if("Automation and CIM".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=17AopMQSIE2rMwEYdHpzvP3v-sZsBIRjQ\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=13s8NMig_whGaqHN1TYAuTg_xdJysvGBT\"},");
                        }else if("Fluid Power Drives and Controls".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1i5-93Vj7ATcgyjpga-IEHjcKT7HRh1nT\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1QDpj7BxdXDYf-Y3cHupvs6kppB3b-d2d\"},");
                        }else if("Green Manufacturing".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1kPHu82f9bvqYcU34TKdyyt6kNYkhrXBA\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=15R8Zp0teh4ZLKKO3T3yvIv4QzeiyzoVQ\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1jQ8MmFlvjlxcBa1s-TJiYFXqicUfuqNH\"},");
                        }else if("Supply Chain Management".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=13-ke_k2DlTtbVs4KByQBdTIXbReVIOzf\"},");
                        }else if("Managerial Economics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ik_ECbrdT_DCAVvkKiJbNSWXthVRUaGL\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1qcGNOybT5JAZx9gQg9fngFB7RyMDswYS\"},");
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1w6xxI_GdjWh24SyYcc4Js9RUfv6sdOOi\"},");
                        }else if("Human Values and Professional Ethics II".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=10wXrBSH57vBEpVncohNSY3Ejo0ztVrOR\"},");
                        }else if("Hydraulics and Pneumatics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1njmzLt-F-hGmcbHJchaWL_EpEvy-Ed9x\"},");
                        }
                    } else if ("sem7".equals(sem)){
                        if("Additive Manufacturing".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=10A91guxgWvV59KWbZ-EAi7v7DXoabERe\"},");
                        }else if("Production of Automotive Components".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=16mDQbq1U5cTx2j9RrvmYkRZTcIYHux_0\"},");
                        }else if("Jigs, Fixtures and Press Tools".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1CVc_i0GCrwVGuLkOpALc0klp7MCyWo2e\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1EM28Wc3bJE38J2jGFKIoAP-RmRIIt9Zy\"},");
                        }else if("Non Destructive Testing Techniques".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1yWltOtD_DnsiYlVzE8ZNkBC3xYoZfyVQ\"},");
                        }else if("Unconventional Manufacturing Processes".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=18WHBJV90VkD8CTl7SwURZkTN_g-FrbxL\"},");
                        }else if("Human Values and Professional Ethics II".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1SjI4WZjEtbNDXm2t5IgiPdjGRBu2GcAi\"},");
                        }else if("Plant Layout and Material Handling".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1g9I3clJEEB4KUSBNg9-fBQPr7pnu5hA1\"},");
                        }else if("Managerial Economics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ik_ECbrdT_DCAVvkKiJbNSWXthVRUaGL\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1qcGNOybT5JAZx9gQg9fngFB7RyMDswYS\"},");
                        }
                    } else if ("sem8".equals(sem)){
                        if("Human Values and Professional Ethics II".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=16OGiKM4NF69Mb_fEo6V7TtJ6UKhaCksf\"},");
                        }else if("Plant Layout and Material Handling".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1sLJ8_4_7QaTlhjM1a3GvdjqwMP8Iv6bf\"},");
                        }
                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else{
                    Log.e("DeptActivity", "Unknown department: " + dept);
                }


            } else if ("reg22".equals(reg)) {

                if("cse".equals(dept)){
                    if("sem1".equals(sem)){
                        if("தமிழர் மரபு/ Heritage of Tamils".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1KXzXT2fT5npp7O5mXkfQsFx36TXSK-Mi\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1lx6HSzV493HUk9Ya_SjHtP88IkanN7fQ\"},");
                        }else if("Professional English".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1TtC8LBZOyMURvnxAdDM1NIlrhvNuiCXL\"},");
                        }else if("Linear Algebra and Calculus".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1fGQGW847h7ijuBb0apWwIXUtKvzYGOsQ\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1jT60Sm53qvtyj9Vz5NcNCyA2nohRv032\"},");
                        }else if("Engineering Physics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=15_Oof87qsEHVPI9jozUlmsU18IWB7olU\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1RGzHi5BA_h-JYAzG3pwUP8sGi59MWpFd\"},");
                        }else if("Programming in C".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1XpRXyPeMJFs3zCUfKFzTIt4MvDQG4D9p\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1E1IDg_XOiNv5NujDZs8FzOAFReh-eImM\"},");
                        }else if("Environmental Science and Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1bMy9BvygBKy0LHEoPT1odO-0zPMNFXS4\"},");
                        }
                    } else if ("sem2".equals(sem)){
                        if("தமிழரும் தொழில்நுட்பமும்/ Tamils and Technology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1vQgaD9RVQzVrMzJS52wQSTC2Bzk1ikp9\"},");
                        }else if("Values and Ethics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ipSH7XctzXejMdg1X8NTnkn_TWgEalts\"},");
                        }else if("Vector Spaces and Differential Equations with MATLAB".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1PN7mtIiLZePa_8vj7ty6_4liuhXJz-F7\"},");
                        }else if("Physics for Information Science".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1OcUVbtwH3k1F6qRKZmu2vXcNlmMGRZ3F\"},");
                        }else if("Applied Chemistry".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1W5JlWUVeGheE0xDc-r6f3iD2GXBZeBKJ\"},");
                        }else if("Basics of Electrical and Electronics Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1AADnXvELBmyb4ELg-twdS2Vq3syHSz0V\"},");
                        }
                    } else if ("sem3".equals(sem)){
                        /*if("Probability, Random Processes and Queueing Theory".equals(sub_name)){

                        }else if("Digital Systems".equals(sub_name)){

                        }else if("Discrete Structures".equals(sub_name)){

                        }else if("Data Structures".equals(sub_name)){

                        }else if("Foundations of Data Science".equals(sub_name)){

                        }else if("Object Oriented Programming".equals(sub_name)){

                        }*/
                    } else if ("sem4".equals(sem)){

                    } else if ("sem5".equals(sem)){

                    } else if ("sem6".equals(sem)){

                    } else if ("sem7".equals(sem)){

                    } else if ("sem8".equals(sem)){

                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("civil".equals(dept)) {
                    if("sem1".equals(sem)){
                        if("தமிழர் மரபு/ Heritage of Tamils".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1KXzXT2fT5npp7O5mXkfQsFx36TXSK-Mi\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1lx6HSzV493HUk9Ya_SjHtP88IkanN7fQ\"},");
                        }else if("Values and Ethics".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1a7yZosMzv83WFrqWhDUY5wxbWXy-a3pM\"},");
                        }else if("Linear Algebra and Calculus".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1fGQGW847h7ijuBb0apWwIXUtKvzYGOsQ\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1jT60Sm53qvtyj9Vz5NcNCyA2nohRv032\"},");
                        }else if("Engineering Physics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=15_Oof87qsEHVPI9jozUlmsU18IWB7olU\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1RGzHi5BA_h-JYAzG3pwUP8sGi59MWpFd\"},");
                        }else if("Engineering Chemistry".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Im8MMgQMvI6mviGOe64tyzoDub86jZLY\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1whOmH8b8TPtTpjFadLu_gsWjEwK14rS8\"},");
                        }else if("Basics of Electrical and Electronics Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1AADnXvELBmyb4ELg-twdS2Vq3syHSz0V\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1PVheTfdJshDa5RaU3LDSLArqV6jB-EzV\"},");
                        }
                    } else if ("sem2".equals(sem)){
                        if("தமிழரும் தொழில்நுட்பமும்/ Tamils and Technology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1vQgaD9RVQzVrMzJS52wQSTC2Bzk1ikp9\"},");
                        }else if("Professional English".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1vUZsml7tAg0fMGXAaqbIF47ZQr9Sompw\"},");
                        }else if("Differential Equations and Numerical methods".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1y7B5gq0JaBj8M-qq8RvkqhCfOIUewdGJ\"},");
                        }else if("Engineering Mechanics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1V7RGBBsSKZqDe0QESFYQln4kQk7k3fOW\"},");
                        }else if("Programming in C".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1XpRXyPeMJFs3zCUfKFzTIt4MvDQG4D9p\"},");
                        }else if("Environmental Science and Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Xp3RM7JRd2dMQEB3aAAkhV-SD8FQ_zaK\"},");
                        }
                    } else if ("sem3".equals(sem)){
                        /*if("Transform Calculus and Partial Differential Equations".equals(sub_name)){

                        }else if("Mechanics of Fluids".equals(sub_name)){

                        }else if("Engineering Geology".equals(sub_name)){

                        }else if("Mechanics of Solids I".equals(sub_name)){

                        }else if("Surveying".equals(sub_name)){

                        }else if("Construction Materials and Technology".equals(sub_name)){

                        }*/
                    } else if ("sem4".equals(sem)){

                    } else if ("sem5".equals(sem)){

                    } else if ("sem6".equals(sem)){

                    } else if ("sem7".equals(sem)){

                    } else if ("sem8".equals(sem)){

                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("ece".equals(dept)) {
                    if("sem1".equals(sem)){
                        if("தமிழர் மரபு/ Heritage of Tamils".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1lx6HSzV493HUk9Ya_SjHtP88IkanN7fQ\"},");
                        }else if("Professional English".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1vUZsml7tAg0fMGXAaqbIF47ZQr9Sompw\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1TtC8LBZOyMURvnxAdDM1NIlrhvNuiCXL\"},");
                        }else if("Linear Algebra and Calculus".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1fGQGW847h7ijuBb0apWwIXUtKvzYGOsQ\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1jT60Sm53qvtyj9Vz5NcNCyA2nohRv032\"},");
                        }else if("Engineering Physics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=15_Oof87qsEHVPI9jozUlmsU18IWB7olU\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1RGzHi5BA_h-JYAzG3pwUP8sGi59MWpFd\"},");
                        }else if("Programming in C".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1XpRXyPeMJFs3zCUfKFzTIt4MvDQG4D9p\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1E1IDg_XOiNv5NujDZs8FzOAFReh-eImM\"},");
                        }else if("Environmental Science and Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1bMy9BvygBKy0LHEoPT1odO-0zPMNFXS4\"},");
                        }
                    } else if ("sem2".equals(sem)){
                        if("தமிழரும் தொழில்நுட்பமும்/ Tamils and Technology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1vQgaD9RVQzVrMzJS52wQSTC2Bzk1ikp9\"},");
                        }else if("Values and Ethics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ipSH7XctzXejMdg1X8NTnkn_TWgEalts\"},");
                        }else if("Differential Equations and Numerical methods".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1y7B5gq0JaBj8M-qq8RvkqhCfOIUewdGJ\"},");
                        }else if("Semiconductor Physics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1zVn339D1MNl_WiSsYfx8nviwnuipp9kK\"},");
                        }else if("Applied Chemistry".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1W5JlWUVeGheE0xDc-r6f3iD2GXBZeBKJ\"},");
                        }else if("Basics of Electrical Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Pab3Z30PiFbmOJAYn0seDjGYLbGzVd6P\"},");
                        }
                    }else if ("sem3".equals(sem)){
                        /*if("Circuit Theory".equals(sub_name)){

                        }else if("Data Structures".equals(sub_name)){

                        }else if("Signals and Systems".equals(sub_name)){

                        }else if("Analog Circuits".equals(sub_name)){

                        }else if("Digital Circuits Design".equals(sub_name)){

                        }else if("Electromagnetic Waves and Waveguides".equals(sub_name)){

                        }*/
                    } else if ("sem4".equals(sem)){

                    } else if ("sem5".equals(sem)){

                    } else if ("sem6".equals(sem)){

                    } else if ("sem7".equals(sem)){

                    } else if ("sem8".equals(sem)){

                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("eee".equals(dept)) {
                    if("sem1".equals(sem)){
                        if("தமிழர் மரபு/ Heritage of Tamils".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1KXzXT2fT5npp7O5mXkfQsFx36TXSK-Mi\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1lx6HSzV493HUk9Ya_SjHtP88IkanN7fQ\"},");
                        }else if("Professional English".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1vUZsml7tAg0fMGXAaqbIF47ZQr9Sompw\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1TtC8LBZOyMURvnxAdDM1NIlrhvNuiCXL\"},");
                        }else if("Linear Algebra and Calculus".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1fGQGW847h7ijuBb0apWwIXUtKvzYGOsQ\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1jT60Sm53qvtyj9Vz5NcNCyA2nohRv032\"},");
                        }else if("Engineering Physics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=15_Oof87qsEHVPI9jozUlmsU18IWB7olU\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1RGzHi5BA_h-JYAzG3pwUP8sGi59MWpFd\"},");
                        }else if("Programming in C".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1XpRXyPeMJFs3zCUfKFzTIt4MvDQG4D9p\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1E1IDg_XOiNv5NujDZs8FzOAFReh-eImM\"},");
                        }else if("Environmental Science and Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Xp3RM7JRd2dMQEB3aAAkhV-SD8FQ_zaK\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1bMy9BvygBKy0LHEoPT1odO-0zPMNFXS4\"},");
                        }
                    } else if ("sem2".equals(sem)){
                        if("தமிழரும் தொழில்நுட்பமும்/ Tamils and Technology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1vQgaD9RVQzVrMzJS52wQSTC2Bzk1ikp9\"},");
                        }else if("Values and Ethics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ipSH7XctzXejMdg1X8NTnkn_TWgEalts\"},");
                        }else if("Differential Equations and Numerical methods".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1y7B5gq0JaBj8M-qq8RvkqhCfOIUewdGJ\"},");
                        }else if("Engineering Mechanics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1V7RGBBsSKZqDe0QESFYQln4kQk7k3fOW\"},");
                        }else if("Applied Chemistry".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1W5JlWUVeGheE0xDc-r6f3iD2GXBZeBKJ\"},");
                        }else if("Basics of Civil and Mechanical Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=17rG68eK6Jb4H1dC-dCc2RVwjtxL0b7_C\"},");
                        }
                    } else if ("sem3".equals(sem)){
                        /*if("Data Structures".equals(sub_name)){

                        }else if("Electric Circuit Theory".equals(sub_name)){

                        }else if("Field Theory".equals(sub_name)){

                        }else if("Electronic Devices and Circuits".equals(sub_name)){

                        }else if("Electrical Machines-I".equals(sub_name)){

                        }else if("Digital Circuits".equals(sub_name)){

                        }*/
                    } else if ("sem4".equals(sem)){

                    } else if ("sem5".equals(sem)){

                    } else if ("sem6".equals(sem)){

                    } else if ("sem7".equals(sem)){

                    } else if ("sem8".equals(sem)){

                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("eie".equals(dept)) {
                    if("sem1".equals(sem)){
                        if("தமிழர் மரபு/ Heritage of Tamils".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1KXzXT2fT5npp7O5mXkfQsFx36TXSK-Mi\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1lx6HSzV493HUk9Ya_SjHtP88IkanN7fQ\"},");
                        }else if("Professional English".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1vUZsml7tAg0fMGXAaqbIF47ZQr9Sompw\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1TtC8LBZOyMURvnxAdDM1NIlrhvNuiCXL\"},");
                        }else if("Linear Algebra and Calculus".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1fGQGW847h7ijuBb0apWwIXUtKvzYGOsQ\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1jT60Sm53qvtyj9Vz5NcNCyA2nohRv032\"},");
                        }else if("Engineering Physics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=15_Oof87qsEHVPI9jozUlmsU18IWB7olU\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1RGzHi5BA_h-JYAzG3pwUP8sGi59MWpFd\"},");
                        }else if("Programming in C".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1XpRXyPeMJFs3zCUfKFzTIt4MvDQG4D9p\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1E1IDg_XOiNv5NujDZs8FzOAFReh-eImM\"},");
                        }else if("Environmental Science and Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1bMy9BvygBKy0LHEoPT1odO-0zPMNFXS4\"},");
                        }
                    } else if ("sem2".equals(sem)){
                        if("தமிழரும் தொழில்நுட்பமும்/ Tamils and Technology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1vQgaD9RVQzVrMzJS52wQSTC2Bzk1ikp9\"},");
                        }else if("Values and Ethics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ipSH7XctzXejMdg1X8NTnkn_TWgEalts\"},");
                        }else if("Differential Equations and Numerical methods".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1y7B5gq0JaBj8M-qq8RvkqhCfOIUewdGJ\"},");
                        }else if("Physics of Materials".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1PbM6mWmrSACCnVKFf50LmMQH0EwtIWXG\"},");
                        }else if("Applied Chemistry".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1W5JlWUVeGheE0xDc-r6f3iD2GXBZeBKJ\"},");
                        }else if("Basics of Civil and Mechanical Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=17rG68eK6Jb4H1dC-dCc2RVwjtxL0b7_C\"},");
                        }
                    } else if ("sem3".equals(sem)){
                        /*if("Thermodynamics and Fluid Mechanics ".equals(sub_name)){

                        }else if("Electrical Circuits and Networks ".equals(sub_name)){

                        }else if("Analog Electronics".equals(sub_name)){

                        }else if("Sensors and Transducers".equals(sub_name)){

                        }else if("Electrical and Electronic Measurement Techniques".equals(sub_name)){

                        }else if("Constitution of India".equals(sub_name)){

                        }*/
                    } else if ("sem4".equals(sem)){

                    } else if ("sem5".equals(sem)){

                    } else if ("sem6".equals(sem)){

                    } else if ("sem7".equals(sem)){

                    } else if ("sem8".equals(sem)){

                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("ibt".equals(dept)) {
                    if("sem1".equals(sem)){
                        if("தமிழர் மரபு/ Heritage of Tamils".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1lx6HSzV493HUk9Ya_SjHtP88IkanN7fQ\"},");
                        }else if("Values and Ethics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ipSH7XctzXejMdg1X8NTnkn_TWgEalts\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1a7yZosMzv83WFrqWhDUY5wxbWXy-a3pM\"},");
                        }else if("Linear Algebra and Calculus".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1fGQGW847h7ijuBb0apWwIXUtKvzYGOsQ\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1jT60Sm53qvtyj9Vz5NcNCyA2nohRv032\"},");
                        }else if("Engineering Physics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=15_Oof87qsEHVPI9jozUlmsU18IWB7olU\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1RGzHi5BA_h-JYAzG3pwUP8sGi59MWpFd\"},");
                        }else if("Chemistry for Biotechnology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1MHC7ZplvEAcpdkAHWYASMOzUjeDAsZ9L\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1-7zz82mhUC1h4UGPE_RtphkZ_726zTHM\"},");
                        }else if("Basics of Electrical and Electronics Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1AADnXvELBmyb4ELg-twdS2Vq3syHSz0V\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1PVheTfdJshDa5RaU3LDSLArqV6jB-EzV\"},");
                        }
                    } else if ("sem2".equals(sem)){
                        if("தமிழரும் தொழில்நுட்பமும்/ Tamils and Technology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1vQgaD9RVQzVrMzJS52wQSTC2Bzk1ikp9\"},");
                        }else if("Professional English".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1vUZsml7tAg0fMGXAaqbIF47ZQr9Sompw\"},");
                        }else if("Differential Equations and Numerical Methods".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1y7B5gq0JaBj8M-qq8RvkqhCfOIUewdGJ\"},");
                        }else if("Programming in C".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1XpRXyPeMJFs3zCUfKFzTIt4MvDQG4D9p\"},");
                        }else if("Biochemistry-I".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1enXLQHJEGvupRTNiOWLgbJcFqTnL1ubB\"},");
                        }else if("Environmental Science and Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Xp3RM7JRd2dMQEB3aAAkhV-SD8FQ_zaK\"},");
                        }
                    } else if ("sem3".equals(sem)){
                        /*if("Transform Calculus and Partial Differential Equations".equals(sub_name)){

                        }else if("Cell Biology".equals(sub_name)){

                        }else if("Process Calculations and Heat transfer".equals(sub_name)){

                        }else if("Industrial Microbiology".equals(sub_name)){

                        }else if("Biochemistry - II".equals(sub_name)){

                        }else if("Genetics".equals(sub_name)){

                        }*/
                    } else if ("sem4".equals(sem)){

                    } else if ("sem5".equals(sem)){

                    } else if ("sem6".equals(sem)){

                    } else if ("sem7".equals(sem)){

                    } else if ("sem8".equals(sem)){

                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("it".equals(dept)) {
                    if("sem1".equals(sem)){
                        if("தமிழர் மரபு/ Heritage of Tamils".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1KXzXT2fT5npp7O5mXkfQsFx36TXSK-Mi\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1lx6HSzV493HUk9Ya_SjHtP88IkanN7fQ\"},");
                        }else if("Professional English".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1vUZsml7tAg0fMGXAaqbIF47ZQr9Sompw\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1TtC8LBZOyMURvnxAdDM1NIlrhvNuiCXL\"},");
                        }else if("Linear Algebra and Calculus".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1fGQGW847h7ijuBb0apWwIXUtKvzYGOsQ\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1jT60Sm53qvtyj9Vz5NcNCyA2nohRv032\"},");
                        }else if("Engineering Physics".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1RGzHi5BA_h-JYAzG3pwUP8sGi59MWpFd\"},");
                        }else if("Programming in C".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1XpRXyPeMJFs3zCUfKFzTIt4MvDQG4D9p\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1E1IDg_XOiNv5NujDZs8FzOAFReh-eImM\"},");
                        }else if("Environmental Science and Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Xp3RM7JRd2dMQEB3aAAkhV-SD8FQ_zaK\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1bMy9BvygBKy0LHEoPT1odO-0zPMNFXS4\"},");
                        }
                    } else if ("sem2".equals(sem)){
                        if("தமிழரும் தொழில்நுட்பமும்/ Tamils and Technology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1vQgaD9RVQzVrMzJS52wQSTC2Bzk1ikp9\"},");
                        }else if("Values and Ethics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ipSH7XctzXejMdg1X8NTnkn_TWgEalts\"},");
                        }else if("Vector Spaces and Differential Equations with MATLAB".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1PN7mtIiLZePa_8vj7ty6_4liuhXJz-F7\"},");
                        }else if("Physics for Information Science".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1OcUVbtwH3k1F6qRKZmu2vXcNlmMGRZ3F\"},");
                        }else if("Applied Chemistry".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1W5JlWUVeGheE0xDc-r6f3iD2GXBZeBKJ\"},");
                        }else if("Basics of Electrical and Electronics Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1AADnXvELBmyb4ELg-twdS2Vq3syHSz0V\"},");
                        }
                    } else if ("sem3".equals(sem)){
                        /*if("Probability, Random Processes and Queuing Theory".equals(sub_name)){

                        }else if("Computer Organization and Architecture".equals(sub_name)){

                        }else if("Digital Logic Design".equals(sub_name)){

                        }else if("Data Structures and Algorithms".equals(sub_name)){

                        }else if("Java Programming".equals(sub_name)){

                        }*/
                    } else if ("sem4".equals(sem)){

                    } else if ("sem5".equals(sem)){

                    } else if ("sem6".equals(sem)){

                    } else if ("sem7".equals(sem)){

                    } else if ("sem8".equals(sem)){

                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("mech".equals(dept)) {
                    if("sem1".equals(sem)){
                        if("தமிழர் மரபு/ Heritage of Tamils".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1KXzXT2fT5npp7O5mXkfQsFx36TXSK-Mi\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1lx6HSzV493HUk9Ya_SjHtP88IkanN7fQ\"},");
                        }else if("Values and Ethics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ipSH7XctzXejMdg1X8NTnkn_TWgEalts\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1a7yZosMzv83WFrqWhDUY5wxbWXy-a3pM\"},");
                        }else if("Linear Algebra and Calculus".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1fGQGW847h7ijuBb0apWwIXUtKvzYGOsQ\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1jT60Sm53qvtyj9Vz5NcNCyA2nohRv032\"},");
                        }else if("Engineering Physics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=15_Oof87qsEHVPI9jozUlmsU18IWB7olU\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1RGzHi5BA_h-JYAzG3pwUP8sGi59MWpFd\"},");
                        }else if("Engineering Chemistry".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Im8MMgQMvI6mviGOe64tyzoDub86jZLY\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1whOmH8b8TPtTpjFadLu_gsWjEwK14rS8\"},");
                        }else if("Basics of Electrical and Electronics Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1AADnXvELBmyb4ELg-twdS2Vq3syHSz0V\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1PVheTfdJshDa5RaU3LDSLArqV6jB-EzV\"},");
                        }
                    } else if ("sem2".equals(sem)){
                        if("தமிழரும் தொழில்நுட்பமும்/ Tamils and Technology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1vQgaD9RVQzVrMzJS52wQSTC2Bzk1ikp9\"},");
                        }else if("Professional English".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1vUZsml7tAg0fMGXAaqbIF47ZQr9Sompw\"},");
                        }else if("Differential Equations and Numerical Methods".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1y7B5gq0JaBj8M-qq8RvkqhCfOIUewdGJ\"},");
                        }else if("Materials Science".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ovvpcSQxNLpN1lEWLzzidi6Xl7o65B_T\"},");
                        }else if("Python Programming".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1qOG93Mz3Y0cmKjJl32qXZYrqWM_GzsHF\"},");
                        }else if("Environmental Science and Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Xp3RM7JRd2dMQEB3aAAkhV-SD8FQ_zaK\"},");
                        }
                    } else if ("sem3".equals(sem)){
                        /*if("Applied Engineering Mechanics".equals(sub_name)){

                        }else if("Solid Mechanics".equals(sub_name)){

                        }else if("Fluid Mechanics and Machinery".equals(sub_name)){

                        }else if("Manufacturing Technology I".equals(sub_name)){

                        }else if("Materials Engineering and Metallurgy".equals(sub_name)){

                        }else if("Thermodynamics".equals(sub_name)){

                        }*/
                    } else if ("sem4".equals(sem)){

                    } else if ("sem5".equals(sem)){

                    } else if ("sem6".equals(sem)){

                    } else if ("sem7".equals(sem)){

                    } else if ("sem8".equals(sem)){

                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("prod".equals(dept)) {
                    if("sem1".equals(sem)){
                        if("தமிழர் மரபு/ Heritage of Tamils".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1lx6HSzV493HUk9Ya_SjHtP88IkanN7fQ\"},");
                        }else if("Values and Ethics".equals(sub_name)){
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1a7yZosMzv83WFrqWhDUY5wxbWXy-a3pM\"},");
                        }else if("Linear Algebra and Calculus".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1fGQGW847h7ijuBb0apWwIXUtKvzYGOsQ\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1jT60Sm53qvtyj9Vz5NcNCyA2nohRv032\"},");
                        }else if("Engineering Physics".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=15_Oof87qsEHVPI9jozUlmsU18IWB7olU\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1RGzHi5BA_h-JYAzG3pwUP8sGi59MWpFd\"},");
                        }else if("Engineering Chemistry".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Im8MMgQMvI6mviGOe64tyzoDub86jZLY\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1whOmH8b8TPtTpjFadLu_gsWjEwK14rS8\"},");
                        }else if("Basics of Electrical and Electronics Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1AADnXvELBmyb4ELg-twdS2Vq3syHSz0V\"},");
                            string.append("{\"date\":\"Nov-Dec2022\",\"pdf_url\":\"https://drive.google.com/uc?id=1PVheTfdJshDa5RaU3LDSLArqV6jB-EzV\"},");
                        }
                    } else if ("sem2".equals(sem)){
                        if("தமிழரும் தொழில்நுட்பமும்/ Tamils and Technology".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1vQgaD9RVQzVrMzJS52wQSTC2Bzk1ikp9\"},");
                        }else if("Professional English".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1vUZsml7tAg0fMGXAaqbIF47ZQr9Sompw\"},");
                        }else if("Differential Equations and Numerical Methods".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1y7B5gq0JaBj8M-qq8RvkqhCfOIUewdGJ\"},");
                        }else if("Materials Science".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1ovvpcSQxNLpN1lEWLzzidi6Xl7o65B_T\"},");
                        }else if("Python Programming".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1qOG93Mz3Y0cmKjJl32qXZYrqWM_GzsHF\"},");
                        }else if("Environmental Science and Engineering".equals(sub_name)){
                            string.append("{\"date\":\"Apr-May2023\",\"pdf_url\":\"https://drive.google.com/uc?id=1Xp3RM7JRd2dMQEB3aAAkhV-SD8FQ_zaK\"},");
                        }
                    } else if ("sem3".equals(sem)){
                        /*if("Thermal Systems and Heat Transfer ".equals(sub_name)){

                        }else if("Engineering Mechanics".equals(sub_name)){

                        }else if("Machine Tools and Processes".equals(sub_name)){

                        }else if("Engineering Metallurgy".equals(sub_name)){

                        }else if("Manufacturing Technology".equals(sub_name)){

                        }else if("Constitution of India".equals(sub_name)){
                            
                        }*/
                    } else if ("sem4".equals(sem)){

                    } else if ("sem5".equals(sem)){

                    } else if ("sem6".equals(sem)){

                    } else if ("sem7".equals(sem)){

                    } else if ("sem8".equals(sem)){

                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else {
                    Log.e("DeptActivity", "Unknown department: " + dept);
                }

            } else {
                Log.e("Regulation", "Unknown regulation: " + reg);
            }
            string.append("]");
            String JsonArrayString = string.toString();
            return new JSONArray(JsonArrayString);
        }catch( JSONException e){
            e.printStackTrace();
        }
        return new JSONArray();
    }
    private void handleApiResponse(JSONArray responseArray) {
        try {
            for (int i = 0; i < responseArray.length(); i++) {
                JSONObject itemObject = responseArray.getJSONObject(i);
                String date = itemObject.getString("date");
                String pdf_name = reg+"_"+sub_name+"_"+date+".pdf";
                String pdf_url = itemObject.getString("pdf_url");
                items.add(new Item3(date,pdf_name,pdf_url));
            }
            myQues1Adapter.notifyDataSetChanged();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}