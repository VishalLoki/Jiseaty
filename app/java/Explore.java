package com.example.jiseaty;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Explore extends AppCompatActivity {
    public List<Item1> items = new ArrayList<Item1>();
    public SwipeRefreshLayout swipeRefreshLayout;
    public RecyclerView recyclerView;
    public MyMapAdapter myMapAdapter;
    public SearchView searchView;
    JSONArray predefinedArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_explore);


        ImageButton home = findViewById(R.id.home);
        ImageButton back = findViewById(R.id.back);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Explore.this, MainActivity.class);
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

        Button edubut = findViewById(R.id.edubut);
        Button allbut = findViewById(R.id.allbut);

        edubut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Explore.this,Education.class));
            }
        });
        allbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Explore.this,MainActivity.class));
            }
        });

        searchView = findViewById(R.id.searchView);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterList(newText);
                return true;
            }
        });

        recyclerView = findViewById(R.id.recyclerview1);
        myMapAdapter = new MyMapAdapter(getApplicationContext(), items);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myMapAdapter);
        predefinedArray = getPredefinedJsonArray();
        handleApiResponse(predefinedArray);
    }
    private JSONArray getPredefinedJsonArray() {
        try{
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append("{\"loc_name\":\"GCT Entrance\",\"loc_name1\":\"(GCT+Entrance)\",\"imageUrl\":\"https://drive.google.com/uc?id=1xYXPd4wNobgNV_IimfaMlOG77F9nb3xL\",\"lat\":\"11.019342\",\"lon\":\"76.938478\"},");
            stringBuilder.append("{\"loc_name\":\"GCT Canteen\",\"loc_name1\":\"(GCT+Canteen)\",\"imageUrl\":\"https://drive.google.com/uc?id=1t2kB7EZvMEVllgPAl02wN3uLG4aGK5x1\",\"lat\":\"11.01894\",\"lon\":\"76.93510\"},");
            stringBuilder.append("{\"loc_name\":\"GCT NCC Office\",\"loc_name1\":\"(GCT+NCC+Office)\",\"imageUrl\":\"https://drive.google.com/uc?id=1I0CuAFQsYo0V_2R6emFc1yOoI8NM7OIe\",\"lat\":\"11.01871\",\"lon\":\"76.93474\"},");
            stringBuilder.append("{\"loc_name\":\"Soil Mechanics Lab\",\"loc_name1\":\"(Soil+Mechanics+Lab)\",\"imageUrl\":\"https://drive.google.com/uc?id=1-1XKhkZj0k1f_jAL9jWtVCynT4ZFf007\",\"lat\":\"11.01778\",\"lon\":\"76.93438\"},");
            stringBuilder.append("{\"loc_name\":\"Department of Civil Engineering\",\"loc_name1\":\"(Department+of+Civil+Engineering)\",\"imageUrl\":\"https://drive.google.com/uc?id=1zGkQ3MNN7zQKeWYfCW_6llTIlNY8pz9S\",\"lat\":\"11.01800\",\"lon\":\"76.93463\"},");
            stringBuilder.append("{\"loc_name\":\"Science Block\",\"loc_name1\":\"(Science+Block)\",\"imageUrl\":\"https://drive.google.com/uc?id=112-Lg6mnYmJHxtU5hU77AyOMFr1Vwtvr\",\"lat\":\"11.01814\",\"lon\":\"76.93484\"},");
            stringBuilder.append("{\"loc_name\":\"Main Block\",\"loc_name1\":\"(Main+Block)\",\"imageUrl\":\"https://drive.google.com/uc?id=1mNjsRKBa40Ai3eIOP8D8beL6uObHj3Eg\",\"lat\":\"11.018144\",\"lon\":\"76.935941\"},");
            stringBuilder.append("{\"loc_name\":\"GCT Open Auditorium\",\"loc_name1\":\"(GCT+Open+Auditorium)\",\"imageUrl\":\"https://drive.google.com/uc?id=1YmYR3vWnPmcXoJFE54CJJzHn1Zoujxhn\",\"lat\":\"11.018616\",\"lon\":\"76.935984\"},");
            stringBuilder.append("{\"loc_name\":\"GCT Alumini Association\",\"loc_name1\":\"(GCT+Alumini+Association)\",\"imageUrl\":\"https://drive.google.com/uc?id=14jbem8SvQgv-j2lWwAkj19f0rqP7_eIp\",\"lat\":\"11.017534\",\"lon\":\"76.938503\"},");
            stringBuilder.append("{\"loc_name\":\"GCT 2nd Entrance\",\"loc_name1\":\"(GCT+2nd+Entrance)\",\"imageUrl\":\"https://drive.google.com/uc?id=1qRK5dlz1u1DUh6dVvS9T_vD4-gW6EwYN\",\"lat\":\"11.017275\",\"lon\":\"76.939958\"},");
            stringBuilder.append("{\"loc_name\":\"GCT Post Office\",\"loc_name1\":\"(GCT+Post+Office)\",\"imageUrl\":\"https://drive.google.com/uc?id=1bzQxoX1WhUb3II5z2vZqhYvw0jr78gdy\",\"lat\":\"11.018027\",\"lon\":\"76.936458\"},");
            stringBuilder.append("{\"loc_name\":\"JJ Rudra Block\",\"loc_name1\":\"(JJ+Rudra+Block)\",\"imageUrl\":\"https://drive.google.com/uc?id=128rXBBCLvev9Ob8Ezziwj7oxVPvUhOPX\",\"lat\":\"11.017726\",\"lon\":\"76.936316\"},");
            stringBuilder.append("{\"loc_name\":\"Department of EIE and EEE\",\"loc_name1\":\"(Department+of+EIE+and+EEE)\",\"imageUrl\":\"https://drive.google.com/uc?id=1pIthiEWQBKOnznNbwHcjQnWOo7cfDXIi\",\"lat\":\"11.01755\",\"lon\":\"76.93566\"},");
            stringBuilder.append("{\"loc_name\":\"EEE Seminar Hall\",\"loc_name1\":\"(EEE+Seminar+Hall)\",\"imageUrl\":\"https://drive.google.com/uc?id=1PJaamRIVa9DlkIri1q97zN09PdJwEmG1\",\"lat\":\"11.017684\",\"lon\":\"76.935446\"},");
            stringBuilder.append("{\"loc_name\":\"Department of Computer Science and Engineering\",\"loc_name1\":\"(Department+of+Computer+Science+and+Engineering)\",\"imageUrl\":\"https://drive.google.com/uc?id=1f4pWmcqA5WsxlJBtOWruhsXaVbmXaHpx\",\"lat\":\"11.01777\",\"lon\":\"76.93496\"},");
            stringBuilder.append("{\"loc_name\":\"Geology Laboratory\",\"loc_name1\":\"(Geology+Laboratory)\",\"imageUrl\":\"https://drive.google.com/uc?id=12iu72_wNQF6pwD7-6ye5ewpfFe0pXcS2\",\"lat\":\"11.01748\",\"lon\":\"76.93445\"},");
            stringBuilder.append("{\"loc_name\":\"Department of Industrial BioTechnology\",\"loc_name1\":\"(Department+of+Industrial+BioTechnology)\",\"imageUrl\":\"https://drive.google.com/uc?id=1rU4AIDuyMN7Sa2CT7BPFTGF4sFEghZEu\",\"lat\":\"11.02013\",\"lon\":\"76.93342\"},");
            stringBuilder.append("{\"loc_name\":\"Chemical Engineering Laboratory\",\"loc_name1\":\"(Chemical+Engineering+Laboratory)\",\"imageUrl\":\"https://drive.google.com/uc?id=1QTtMTWX9Xmv8yjqgwhAMWPX_ArFDFxw3\",\"lat\":\"11.01989\",\"lon\":\"76.93308\"},");
            stringBuilder.append("{\"loc_name\":\"ThamiraBarani Illam\",\"loc_name1\":\"(ThamiraBarani+Illam)\",\"imageUrl\":\"https://drive.google.com/uc?id=1d7H5Lnu7Z8jV2uyQGegQVU_ruYiv5kZM\",\"lat\":\"11.02008\",\"lon\":\"76.93438\"},");
            stringBuilder.append("{\"loc_name\":\"GCT Power House\",\"loc_name1\":\"(GCT+Power+House)\",\"imageUrl\":\"https://drive.google.com/uc?id=1V8zitxjHLq_b8TnQXhaacSUo-FSIiwkn\",\"lat\":\"11.01919\",\"lon\":\"76.93439\"},");
            stringBuilder.append("{\"loc_name\":\"Power House - Electricity Field\",\"loc_name1\":\"(Power+House+-+Electricity+Field)\",\"imageUrl\":\"https://drive.google.com/uc?id=13VRnbrrkCSqN6iprVrBG0dsGErW8la3H\",\"lat\":\"11.019321\",\"lon\":\"76.934368\"},");
            stringBuilder.append("{\"loc_name\":\"GCT Library\",\"loc_name1\":\"(GCT+Library)\",\"imageUrl\":\"https://drive.google.com/uc?id=1aExknPStizUVL-D_MOYocLHBkb49MX-r\",\"lat\":\"11.01900\",\"lon\":\"76.93593\"},");
            stringBuilder.append("{\"loc_name\":\"GCT Parking\",\"loc_name1\":\"(GCT+Parking)\",\"imageUrl\":\"https://drive.google.com/uc?id=1wiFVoONnVFq-_8t-WKULN7aRQmoheF0c\",\"lat\":\"11.019172\",\"lon\":\"76.936304\"},");
            stringBuilder.append("{\"loc_name\":\"GCT Centre - Four Road Division\",\"loc_name1\":\"(GCT+Centre+-+Four+Road+Division)\",\"imageUrl\":\"https://drive.google.com/uc?id=1BeSyAKEoKI_Dt-S8OOoG1tj-b6jQEPXy\",\"lat\":\"11.019270\",\"lon\":\"76.936615\"},");
            stringBuilder.append("{\"loc_name\":\"GCT Pathway\",\"loc_name1\":\"(GCT+Pathway)\",\"imageUrl\":\"https://drive.google.com/uc?id=188VDR1cJWiSta-L3aRaK_lVpsEHnad_H\",\"lat\":\"11.01928\",\"lon\":\"76.93728\"},");
            stringBuilder.append("{\"loc_name\":\"GCT Football Ground\",\"loc_name1\":\"(GCT+Football+Ground)\",\"imageUrl\":\"https://drive.google.com/uc?id=1R3SNz1m2_7P9-XTi3LvK21UfeGvQY2G-\",\"lat\":\"11.01873\",\"lon\":\"76.93737\"},");
            stringBuilder.append("{\"loc_name\":\"Bhavani Illam\",\"loc_name1\":\"(Bhavani+Illam)\",\"imageUrl\":\"https://drive.google.com/uc?id=1APHWtWLfk_Br5W9H8L0wZ9ld09gWeNl5\",\"lat\":\"11.01957\",\"lon\":\"76.93518\"},");
            stringBuilder.append("{\"loc_name\":\"SBI Bank - GCT Branch\",\"loc_name1\":\"(SBI+Bank+-+GCT+Branch)\",\"imageUrl\":\"https://drive.google.com/uc?id=1LpglOoy_As8ALVZOa91FlDUj-5tXd0ph\",\"lat\":\"11.018536\",\"lon\":\"76.936519\"},");
            stringBuilder.append("{\"loc_name\":\"GCT Oval\",\"loc_name1\":\"(GCT+Oval)\",\"imageUrl\":\"https://drive.google.com/uc?id=11XR9CRCHRmiT-j5BuP30byAtX2sWuFBj\",\"lat\":\"11.01894\",\"lon\":\"76.93654\"},");
            stringBuilder.append("{\"loc_name\":\"GCT Main Auditorium\",\"loc_name1\":\"(GCT+Main+Auditorium)\",\"imageUrl\":\"https://drive.google.com/uc?id=1t1upAiCZOtSyDE8YXP9uiHIrIz9lBbyZ\",\"lat\":\"11.01888\",\"lon\":\"76.93610\"},");
            stringBuilder.append("{\"loc_name\":\"MBA MCA Counselling Hall\",\"loc_name1\":\"(MBA+MCA+Counselling+Hall)\",\"imageUrl\":\"https://drive.google.com/uc?id=17KtbgTSvsg1VpvCe7VwEAdNt_YuRkUqG\",\"lat\":\"11.01911\",\"lon\":\"76.93572\"},");
            stringBuilder.append("{\"loc_name\":\"Autonomous Examination Center\",\"loc_name1\":\"(Autonomous+Examination+Center)\",\"imageUrl\":\"https://drive.google.com/uc?id=1xvJyfgY7pFT6OX2_ZS0dCuvAJ_N2ckH8\",\"lat\":\"11.01874\",\"lon\":\"76.93517\"},");
            stringBuilder.append("{\"loc_name\":\"Controller of Examinations\",\"loc_name1\":\"(Controller+of+Examinations)\",\"imageUrl\":\"https://drive.google.com/uc?id=1gIpT1nIyRFN-jSQKYfCAujhBQqLewv6U\",\"lat\":\"11.01889\",\"lon\":\"76.93536\"},");
            stringBuilder.append("{\"loc_name\":\"Vaigai Illam\",\"loc_name1\":\"(Vaigai+Illam)\",\"imageUrl\":\"https://drive.google.com/uc?id=1kT9i7XE5ueCcRbpwqcasfOApoFCI-_X0\",\"lat\":\"11.02009\",\"lon\":\"76.93517\"},");
            stringBuilder.append("{\"loc_name\":\"Strength of Materials Laboratory\",\"loc_name1\":\"(Strength+of+Materials+Laboratory)\",\"imageUrl\":\"https://drive.google.com/uc?id=1oCzvq43owy2jggXtyrMUGNQD9m81ifkw\",\"lat\":\"11.01786\",\"lon\":\"76.93444\"},");
            stringBuilder.append("{\"loc_name\":\"Transportation Engineering Laboratory\",\"loc_name1\":\"(Transportation+Engineering+Laboratory)\",\"imageUrl\":\"https://drive.google.com/uc?id=1nIYWe6P_FMi8qjmMFSuiB-iwfTesdqEh\",\"lat\":\"11.01781\",\"lon\":\"76.93430\"},");
            stringBuilder.append("{\"loc_name\":\"Hydraulic Laboratory\",\"loc_name1\":\"(Hydraulic+Laboratory)\",\"imageUrl\":\"https://drive.google.com/uc?id=1GMk-tkruCXmibKEZOa0ltIHtrFJpiKKn\",\"lat\":\"11.01778\",\"lon\":\"76.9339\"},");
            stringBuilder.append("{\"loc_name\":\"Thermal Engg Mechanical Lab\",\"loc_name1\":\"(Thermal+Engg+Mechanical+Lab)\",\"imageUrl\":\"https://drive.google.com/uc?id=1CKVQJQ7gWgs6f1dBZShmXYRiMUD-Fe36\",\"lat\":\"11.01759\",\"lon\":\"76.93400\"},");
            stringBuilder.append("{\"loc_name\":\"Advanced Thermal Engg Lab\",\"loc_name1\":\"(Advanced+Thermal+Engg+Lab)\",\"imageUrl\":\"https://drive.google.com/uc?id=1SJoHhyxy8ATqXSZQbb9vIxAM6ieIsp_H\",\"lat\":\"11.01725\",\"lon\":\"76.93399\"},");
            stringBuilder.append("{\"loc_name\":\"Geo Technical Block\",\"loc_name1\":\"(Geo+Technical+Block)\",\"imageUrl\":\"https://drive.google.com/uc?id=1_dIvAowyWdjpkP6abNuw2Ote4hJjfv-K\",\"lat\":\"11.01773\",\"lon\":\"76.93415\"},");
            stringBuilder.append("{\"loc_name\":\"Electrical Engineering Laboratory\",\"loc_name1\":\"(Electrical+Engineering+Laboratory)\",\"imageUrl\":\"https://drive.google.com/uc?id=1HctfKfduLI9KeFtIb2RLh7gvtPiI2fGS\",\"lat\":\"11.018153\",\"lon\":\"76.933980\"},");
            stringBuilder.append("{\"loc_name\":\"Control Engg\",\"loc_name1\":\"(Control+Engg)\",\"imageUrl\":\"https://drive.google.com/uc?id=1ifP1Qfci4mtryOGRMxf08ltevAwDwcLg\",\"lat\":\"11.018348\",\"lon\":\"76.933976\"},");
            stringBuilder.append("{\"loc_name\":\"Production Engineering[UG] Lab\",\"loc_name1\":\"(Production+Engineering[UG]+Lab)\",\"imageUrl\":\"https://drive.google.com/uc?id=1LQG2cpURogFDLmfhl1AqpNk_56SgqSpK\",\"lat\":\"11.018532\",\"lon\":\"76.93403\"},");
            stringBuilder.append("{\"loc_name\":\"Workshops\",\"loc_name1\":\"(Workshops)\",\"imageUrl\":\"https://drive.google.com/uc?id=1yS5CQ-9_qCiYvgtGZ702hP0wg8bAbHYW\",\"lat\":\"11.018596\",\"lon\":\"76.933956\"},");
            stringBuilder.append("{\"loc_name\":\"Foundry\",\"loc_name1\":\"(Foundry)\",\"imageUrl\":\"https://drive.google.com/uc?id=1purCyPVwmZ2NCGfbtvWC6ULWk-8janMv\",\"lat\":\"11.01877\",\"lon\":\"76.93396\"},");
            stringBuilder.append("{\"loc_name\":\"Carpentry\",\"loc_name1\":\"(Carpentry)\",\"imageUrl\":\"https://drive.google.com/uc?id=1cF7qEFu4xJIYF2eKEdnTow2UT3a9Zhbn\",\"lat\":\"11.01903\",\"lon\":\"76.93406\"},");
            stringBuilder.append("{\"loc_name\":\"Smithy\",\"loc_name1\":\"(Smithy)\",\"imageUrl\":\"https://drive.google.com/uc?id=1l9WWDdoqqX5E40KALyC-KT7I91FA2eiV\",\"lat\":\"11.018987\",\"lon\":\"76.933943\"},");
            stringBuilder.append("{\"loc_name\":\"Fitting\",\"loc_name1\":\"(Fitting)\",\"imageUrl\":\"https://drive.google.com/uc?id=1OAC5tH_v7D788KDOszVLw9IrqTUD4imO\",\"lat\":\"11.01885\",\"lon\":\"76.93431\"},");
            stringBuilder.append("{\"loc_name\":\"Advanced Concrete Laboratory\",\"loc_name1\":\"(Advanced+Concrete+Laboratory)\",\"imageUrl\":\"https://drive.google.com/uc?id=1_GfAHocOZdHg7oFnuB35YTPOFffwnhrg\",\"lat\":\"11.018406\",\"lon\":\"76.93426\"},");
            stringBuilder.append("{\"loc_name\":\"Structures Laboratory\",\"loc_name1\":\"(Structures+Laboratory)\",\"imageUrl\":\"https://drive.google.com/uc?id=1Qzx1mBylCw5VfPo8McXNN6WlLyWOvEuN\",\"lat\":\"11.01856\",\"lon\":\"76.93429\"},");
            stringBuilder.append("{\"loc_name\":\"Model park - Structural Models\",\"loc_name1\":\"(Model+park+-+Structural+Models)\",\"imageUrl\":\"https://drive.google.com/uc?id=1-9-5AdRCzIoliXy_8zMx0Y8k5FsRGpT9\",\"lat\":\"11.01784\",\"lon\":\"76.934219\"},");
            stringBuilder.append("{\"loc_name\":\"Training Center Cum Hostel Block\",\"loc_name1\":\"(Training+Center+Cum+Hostel+Block)\",\"imageUrl\":\"https://drive.google.com/uc?id=15Rfb3xJPifnrBivWeGA32R_douzqnRWx\",\"lat\":\"11.01802\",\"lon\":\"76.939418\"},");
            stringBuilder.append("{\"loc_name\":\"Department of ECE\",\"loc_name1\":\"(Department+of+ECE)\",\"imageUrl\":\"https://drive.google.com/uc?id=1_pXcMMcXWVKQ9tGsM3wQytgYQObEjkR6\",\"lat\":\"11.01730\",\"lon\":\"76.93491\"},");
            stringBuilder.append("{\"loc_name\":\"Dept of ECE Laboratory\",\"loc_name1\":\"(Dept+of+ECE+Laboratory)\",\"imageUrl\":\"https://drive.google.com/uc?id=1T894iAHEKoixCZp5dmSoBd3x2lMKE6hP\",\"lat\":\"11.01742\",\"lon\":\"76.93498\"},");
            stringBuilder.append("{\"loc_name\":\"Rotract GCT\",\"loc_name1\":\"(Rotract+GCT)\",\"imageUrl\":\"https://drive.google.com/uc?id=1HZb9wrBoN_3vnzniCYURgYYn64DY-7xx\",\"lat\":\"11.018722\",\"lon\":\"76.934620\"},");
            stringBuilder.append("{\"loc_name\":\"Manufacturing Engineering\",\"loc_name1\":\"(Manufacturing+Engineering)\",\"imageUrl\":\"https://drive.google.com/uc?id=1LyZ-YtqexX-kTkYJkoL4mz6cyOo5j_aC\",\"lat\":\"11.019602\",\"lon\":\"76.934163\"},");
            stringBuilder.append("{\"loc_name\":\"Dept of TEO of the Assistant Engineer\",\"loc_name1\":\"(Dept+of+TEO+of+the+Assistant+Engineer)\",\"imageUrl\":\"https://drive.google.com/uc?id=1U_kY6SabbbbxKUvMTqEVO01syWrkYsOk\",\"lat\":\"11.01934\",\"lon\":\"76.93417\"},");
            stringBuilder.append("{\"loc_name\":\"Engg Design\",\"loc_name1\":\"(Engg+Design)\",\"imageUrl\":\"https://drive.google.com/uc?id=1zHh65A_u7huzfxiUQMPfqpj4p_NmcDLp\",\"lat\":\"11.019504\",\"lon\":\"76.933911\"},");
            stringBuilder.append("{\"loc_name\":\"Center of Excellence - Environmental Studies\",\"loc_name1\":\"(Center+of+Excellence+-+Environmental+Studies)\",\"imageUrl\":\"https://drive.google.com/uc?id=1LM2pHY0h9724pFvQn3gyGE0hl24QCMxV\",\"lat\":\"11.01981\",\"lon\":\"76.93379\"},");
            stringBuilder.append("{\"loc_name\":\"SAE GCT Collegiate Club Fabrication Shop\",\"loc_name1\":\"(SAE+GCT+Collegiate+Club+Fabrication+Shop)\",\"imageUrl\":\"https://drive.google.com/uc?id=12R1xB4pCLb4pFVIXG8Y37Bem9AHlf9At\",\"lat\":\"11.01909\",\"lon\":\"76.93457\"},");
            stringBuilder.append("{\"loc_name\":\"Bus Shed\",\"loc_name1\":\"(Bus+Shed)\",\"imageUrl\":\"https://drive.google.com/uc?id=1X-9QVxvuaVqVyogTfPufP05gx81o_0ja\",\"lat\":\"11.01904\",\"lon\":\"76.93478\"},");
            stringBuilder.append("{\"loc_name\":\"Gallery\",\"loc_name1\":\"(Gallery)\",\"imageUrl\":\"https://drive.google.com/uc?id=1_9mpMNmNs6tt-NGbEaRMjQfew9xkkBbB\",\"lat\":\"11.01900\",\"lon\":\"76.93680\"},");
            stringBuilder.append("{\"loc_name\":\"Kabaddi Ground\",\"loc_name1\":\"(Kabaddi+Ground)\",\"imageUrl\":\"https://drive.google.com/uc?id=1_C5_9dfLup32du3mGSQZTTxmZtGLtWnu\",\"lat\":\"11.01880\",\"lon\":\"76.93682\"},");
            stringBuilder.append("{\"loc_name\":\"Volley ball Ground\",\"loc_name1\":\"(Volley+ball+Ground)\",\"imageUrl\":\"https://drive.google.com/uc?id=18evEk5IifqToVyfMD1zvoJQ-gx9r0qkt\",\"lat\":\"11.01861\",\"lon\":\"76.93683\"},");
            stringBuilder.append("{\"loc_name\":\"Basket ball Court\",\"loc_name1\":\"(Basket+ball+Court)\",\"imageUrl\":\"https://drive.google.com/uc?id=1OIxxEUHKYqevRiLcJmVzp4UCAZBcGe17\",\"lat\":\"11.01841\",\"lon\":\"76.93685\"},");
            stringBuilder.append("{\"loc_name\":\"Department of Physical Education\",\"loc_name1\":\"(Department+of+Physical+Education)\",\"imageUrl\":\"https://drive.google.com/uc?id=1EfL0qclGYQVgAU9zkjrXQbSY7E7pmIgM\",\"lat\":\"11.01919\",\"lon\":\"76.93683\"},");
            stringBuilder.append("{\"loc_name\":\"GCT Orchestra\",\"loc_name1\":\"(GCT+Orchestra)\",\"imageUrl\":\"https://drive.google.com/uc?id=1uKsyjC1o8oqUJPkIX2qsL9YGnXilzHNC\",\"lat\":\"11.01911\",\"lon\":\"76.93677\"},");
            stringBuilder.append("{\"loc_name\":\"PWD\",\"loc_name1\":\"(PWD)\",\"imageUrl\":\"https://drive.google.com/uc?id=1OpAVQNwPtB5Fx13cZMuzTJRffmiXbgYy\",\"lat\":\"11.01902\",\"lon\":\"76.93629\"},");
            stringBuilder.append("{\"loc_name\":\"GCT Library Block 2\",\"loc_name1\":\"(GCT+Library+Block+2)\",\"imageUrl\":\"https://drive.google.com/uc?id=1i6njBdij-gUs3K1FE2r2t28gpscO9Mrz\",\"lat\":\"11.019071\",\"lon\":\"76.935354\"},");
            stringBuilder.append("{\"loc_name\":\"Palaru Illam\",\"loc_name1\":\"(Palaru+Illam)\",\"imageUrl\":\"https://drive.google.com/uc?id=1-82VNPjoomUmcVWMb_cQ5d10k1PT7Qae\",\"lat\":\"11.020471\",\"lon\":\"76.935991\"},");
            stringBuilder.append("{\"loc_name\":\"Ponnaiyaru Illam\",\"loc_name1\":\"(Ponnaiyaru+Illam)\",\"imageUrl\":\"https://drive.google.com/uc?id=1bEszKcK3ypBQaonQrtqC_gT7tuOvMgub\",\"lat\":\"11.0202\",\"lon\":\"76.936043\"},");
            stringBuilder.append("{\"loc_name\":\"Kaveri Illam\",\"loc_name1\":\"(Kaveri+Illam)\",\"imageUrl\":\"https://drive.google.com/uc?id=1n3YuoWB0jBV1omwCHlLE-5-zo2F07Myl\",\"lat\":\"11.019728\",\"lon\":\"76.936151\"},");
            stringBuilder.append("{\"loc_name\":\"Vellaru Illam\",\"loc_name1\":\"(Vellaru+Illam)\",\"imageUrl\":\"https://drive.google.com/uc?id=1LR1M7CRCMig7Du4pG1KocJw7k6ldF0qG\",\"lat\":\"11.02062\",\"lon\":\"76.93435\"},");
            stringBuilder.append("{\"loc_name\":\"Amaravathi Illam\",\"loc_name1\":\"(Amaravathi+Illam)\",\"imageUrl\":\"https://drive.google.com/uc?id=1_iGZskD7cfSRqRNJSpWScjIjWxYNlLm1\",\"lat\":\"11.02268\",\"lon\":\"76.93531\"},");
            stringBuilder.append("{\"loc_name\":\"Manimutharu Illam\",\"loc_name1\":\"(Manimutharu+Illam)\",\"imageUrl\":\"https://drive.google.com/uc?id=1zy6SGISL8Vdv4hp_hMUocweJcGuuCBMG\",\"lat\":\"11.02185\",\"lon\":\"76.93450\"},");
            stringBuilder.append("{\"loc_name\":\"Noyyal Illam\",\"loc_name1\":\"(Noyyal+Illam)\",\"imageUrl\":\"https://drive.google.com/uc?id=14AXM8YB2iBsBkvogfu70ZMi_aYyngRyU\",\"lat\":\"11.02125\",\"lon\":\"76.93609\"},");
            stringBuilder.append("{\"loc_name\":\"Kothayaru Illam\",\"loc_name1\":\"(Kothayaru+Illam)\",\"imageUrl\":\"https://drive.google.com/uc?id=1COBsQqjue2kuoXfrzCs7TNNFQH7IDBdg\",\"lat\":\"11.02133\",\"lon\":\"76.93523\"},");
            stringBuilder.append("{\"loc_name\":\"Girls Hostel Entrance\",\"loc_name1\":\"(Girls+Hostel+Entrance)\",\"imageUrl\":\"https://drive.google.com/uc?id=1NmdeT-RzGlltN0U0iFmduMUzOPXV4EO-\",\"lat\":\"11.02176\",\"lon\":\"76.93720\"},");
            stringBuilder.append("{\"loc_name\":\"GCT Hostel Office\",\"loc_name1\":\"(GCT+Hostel+Office)\",\"imageUrl\":\"https://drive.google.com/uc?id=17cp_3DLUdXRSFBjM9x73yVgB-WohTSax\",\"lat\":\"11.020576\",\"lon\":\"76.936809\"},");
            stringBuilder.append("{\"loc_name\":\"Dispensary\",\"loc_name1\":\"(Dispensary)\",\"imageUrl\":\"https://drive.google.com/uc?id=18hykKUJK76fSWTD3EX50ONz0xhGachrC\",\"lat\":\"11.020258\",\"lon\":\"76.936683\"},");

            //stringBuilder.append("{\"loc_name\":\"\",\"loc_name1\":\"\",\"imageUrl\":\"\",\"lat\":\"\",\"lon\":\"\"},");
            stringBuilder.append("]");
            String jsonArraystring = stringBuilder.toString();
            return new JSONArray(jsonArraystring);
        }catch(JSONException e){
            e.printStackTrace();
        }
        return new JSONArray();
    }

    private void handleApiResponse(JSONArray responseArray) {
        try {
            for (int i = 0; i < responseArray.length(); i++) {
                JSONObject itemObject = responseArray.getJSONObject(i);
                String loc_name = itemObject.getString("loc_name");
                String loc_name1 = itemObject.getString("loc_name1");
                String imageUrl = itemObject.getString("imageUrl");
                String latitude = itemObject.getString("lat");
                String longitude = itemObject.getString("lon");

                items.add(new Item1(loc_name, loc_name1, imageUrl, latitude, longitude));
            }

            myMapAdapter.notifyDataSetChanged();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    public void filterList(String Text){
        List<Item1> filterList = new ArrayList<>();
        for (Item1 item1: items){
            if(item1.getLocation_name().toLowerCase().contains(Text.toLowerCase())){
                filterList.add(item1);
            }
        }
        if(filterList.isEmpty()){
            Toast.makeText(this,"No data found",Toast.LENGTH_SHORT).show();
        }else{
            myMapAdapter.setFilteredList(filterList);
        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

}
