package com.example.jiseaty;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class subject extends AppCompatActivity {
    public List<Item2> items = new ArrayList<Item2>();
    public RecyclerView recyclerView;
    public MyQuesAdapter myQuesAdapter;
    JSONArray PredefinedArray;
    String dept;
    String reg;
    String sem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_subject);

        ImageButton home=findViewById(R.id.home);
        ImageButton back=findViewById(R.id.back);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subject.this,MainActivity.class);
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

        recyclerView = findViewById(R.id.recyclerview2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        myQuesAdapter = new MyQuesAdapter(getApplicationContext(),items);
        recyclerView.setAdapter(myQuesAdapter);
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
                        //string.append("{\"sub_name\":\"\"},");
                        string.append("{\"sub_name\":\"Communicative English\"},");
                        string.append("{\"sub_name\":\"Calculus\"},");
                        string.append("{\"sub_name\":\"Semiconductor Physics\"},");
                        string.append("{\"sub_name\":\"Programming in C\"},");
                    } else if ("sem2".equals(sem)){
                        string.append("{\"sub_name\":\"Applied Chemistry\"},");
                        string.append("{\"sub_name\":\"Differential Equations and Linear Algebra\"},");
                        string.append("{\"sub_name\":\"Fundamentals of Electrical and Electronics Engineering\"},");
                    } else if ("sem3".equals(sem)){
                        string.append("{\"sub_name\":\"Humanities\"},");
                        string.append("{\"sub_name\":\"Probability Theory and Applied Statistics\"},");
                        string.append("{\"sub_name\":\"Discrete Structures\"},");
                        string.append("{\"sub_name\":\"Engineering Mechanics\"},");
                        string.append("{\"sub_name\":\"Digital Systems\"},");
                        string.append("{\"sub_name\":\"Data Structures\"},");
                        string.append("{\"sub_name\":\"Environmental Sciences and Engineering\"},");
                    } else if ("sem4".equals(sem)){
                        string.append("{\"sub_name\":\"Technology Management\"},");
                        string.append("{\"sub_name\":\"Analog and Digital Communication\"},");
                        string.append("{\"sub_name\":\"Computer Architecture\"},");
                        string.append("{\"sub_name\":\"Database Management Systems\"},");
                        string.append("{\"sub_name\":\"System Programming and Operating Systems\"},");
                        string.append("{\"sub_name\":\"Theory of Computation\"},");
                        string.append("{\"sub_name\":\"Constitution of India\"},");
                    } else if ("sem5".equals(sem)){
                        string.append("{\"sub_name\":\"Professional Communication Skills\"},");
                        string.append("{\"sub_name\":\"Embedded Computing Systems\"},");
                        string.append("{\"sub_name\":\"Computer Networks\"},");
                        string.append("{\"sub_name\":\"Design and Analysis of Algorithms\"},");
                        string.append("{\"sub_name\":\"Introduction to Web Technology\"},");
                        string.append("{\"sub_name\":\"Cyber Security\"},");
                        string.append("{\"sub_name\":\"Network Essentials\"},");
                        string.append("{\"sub_name\":\"Programming in Java\"},");
                    } else if ("sem6".equals(sem)){
                        string.append("{\"sub_name\":\"Digital Signal Processing and Applications\"},");
                        string.append("{\"sub_name\":\"Compiler Design\"},");
                        string.append("{\"sub_name\":\"Software Engineering Methodologies\"},");
                        string.append("{\"sub_name\":\"Cyber Security\"},");
                        string.append("{\"sub_name\":\"Network Essentials\"},");
                        string.append("{\"sub_name\":\"Information Security\"},");
                        string.append("{\"sub_name\":\"Multimedia Systems\"},");
                        string.append("{\"sub_name\":\"Distributed Computing\"},");
                        string.append("{\"sub_name\":\"Programming in Java\"},");
                    } else if ("sem7".equals(sem)){
                        string.append("{\"sub_name\":\"Machine Learning\"},");
                        string.append("{\"sub_name\":\"Artificial Intelligence\"},");
                        string.append("{\"sub_name\":\"Computer Graphics and Visualizations\"},");
                        string.append("{\"sub_name\":\"Distributed Computing\"},");
                        string.append("{\"sub_name\":\"Cyber Security\"},");
                        string.append("{\"sub_name\":\"Programming in Java\"},");
                    } else if ("sem8".equals(sem)){

                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("civil".equals(dept)) {
                    if("sem1".equals(sem)){
                        string.append("{\"sub_name\":\"Engineering Chemistry\"},");
                        string.append("{\"sub_name\":\"Calculus and Linear Algebra\"},");
                        string.append("{\"sub_name\":\"Basics of Electrical and Electronics Engineering\"},");
                    } else if ("sem2".equals(sem)){
                        string.append("{\"sub_name\":\"Communicative English\"},");
                        string.append("{\"sub_name\":\"Differential Equations and Complex Variables\"},");
                        string.append("{\"sub_name\":\"Mechanics and Properties of Solids\"},");
                        string.append("{\"sub_name\":\"Programming in C\"},");
                    } else if ("sem3".equals(sem)){
                        string.append("{\"sub_name\":\"Transform Calculus and Partial Differential Equations\"},");
                        string.append("{\"sub_name\":\"Engineering Mechanics for Civil Engineers\"},");
                        string.append("{\"sub_name\":\"Strength of Materials\"},");
                        string.append("{\"sub_name\":\"Mechanics of Fluids\"},");
                        string.append("{\"sub_name\":\"Surveying\"},");
                        string.append("{\"sub_name\":\"Water Supply Engineering\"},");
                        string.append("{\"sub_name\":\"Constitution of India\"},");
                    } else if ("sem4".equals(sem)){
                        string.append("{\"sub_name\":\"Civil Engineering – Societal and Global impact\"},");
                        string.append("{\"sub_name\":\"Engineering Geology\"},");
                        string.append("{\"sub_name\":\"Construction Materials and Technology\"},");
                        string.append("{\"sub_name\":\"Basic Structural Design - I (Steel)\"},");
                        string.append("{\"sub_name\":\"Applied Hydraulics and Fluid Machinery\"},");
                        string.append("{\"sub_name\":\"Waste Water Engineering\"},");
                        string.append("{\"sub_name\":\"Environmental Sciences and Engineering\"},");
                    } else if ("sem5".equals(sem)){
                        string.append("{\"sub_name\":\"Professional Practices, Ethics and Building Bye-laws\"},");
                        string.append("{\"sub_name\":\"Structural Analysis I\"},");
                        string.append("{\"sub_name\":\"Basic Structural Design II (Concrete)\"},");
                        string.append("{\"sub_name\":\"Mechanics of Soils\"},");
                        string.append("{\"sub_name\":\"Concrete Technology\"},");
                        string.append("{\"sub_name\":\"Climate Change and Adaptation\"},");
                    } else if ("sem6".equals(sem)){
                        string.append("{\"sub_name\":\"Structural Analysis II\"},");
                        string.append("{\"sub_name\":\"Foundation Engineering\"},");
                        string.append("{\"sub_name\":\"Water Resources Engineering\"},");
                        string.append("{\"sub_name\":\"Highway and Railway Engineering\"},");
                        string.append("{\"sub_name\":\"Climate Change and Adaptation\"},");
                        string.append("{\"sub_name\":\"Disaster Management and Mitigation\"},");
                        string.append("{\"sub_name\":\"Maintanance and Rehabilitation of structures\"},");
                        string.append("{\"sub_name\":\"Energy Efficient Buildings\"},");
                    } else if ("sem7".equals(sem)){
                        string.append("{\"sub_name\":\"Construction Management\"},");
                        string.append("{\"sub_name\":\"Engineering Economics, Estimation and Costing\"},");
                        string.append("{\"sub_name\":\"Prestressed Concrete Structures\"},");
                        string.append("{\"sub_name\":\"Concrete Structures\"},");
                        string.append("{\"sub_name\":\"Ground Improvement Techniques\"},");
                        string.append("{\"sub_name\":\"Airport,Docks and Harbour Engineering\"},");
                        string.append("{\"sub_name\":\"Climate Change and Adaptation\"},");
                        string.append("{\"sub_name\":\"Disaster Management and Mitigation\"},");
                        string.append("{\"sub_name\":\"Energy Efficient Buildings\"},");
                    } else if ("sem8".equals(sem)){
                        string.append("{\"sub_name\":\"Maintanance and Rehabilitation of structures\"},");
                        string.append("{\"sub_name\":\"Concrete Structures\"},");
                        string.append("{\"sub_name\":\"Ground Improvement Techniques\"},");
                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if("ece".equals(dept)){
                    if("sem1".equals(sem)){
                        string.append("{\"sub_name\":\"Communicative English\"},");
                        string.append("{\"sub_name\":\"Calculus and Differential Equations\"},");
                        string.append("{\"sub_name\":\"Waves , Optics and Introduction to Quantum Mechanics\"},");
                        string.append("{\"sub_name\":\"Programming in C\"},");
                    } else if ("sem2".equals(sem)){
                        string.append("{\"sub_name\":\"Applied Chemistry\"},");
                        string.append("{\"sub_name\":\"Linear Algebra, Numerical Methods and Transform Calculus\"},");
                        string.append("{\"sub_name\":\"Principles of Electrical Engineering\"},");
                    } else if ("sem3".equals(sem)){
                        string.append("{\"sub_name\":\"Transforms and Partial Differential Equations\"},");
                        string.append("{\"sub_name\":\"Data Structures and Algorithms\"},");
                        string.append("{\"sub_name\":\"Electron Devices and Circuits\"},");
                        string.append("{\"sub_name\":\"Digital System Design\"},");
                        string.append("{\"sub_name\":\"Signals and Systems\"},");
                        string.append("{\"sub_name\":\"Network Theory\"},");
                        string.append("{\"sub_name\":\"Environmental Sciences and Engineering\"},");
                    } else if ("sem4".equals(sem)){
                        string.append("{\"sub_name\":\"Probability Theory and Random Processes\"},");
                        string.append("{\"sub_name\":\"Electromagnetic Waves\"},");
                        string.append("{\"sub_name\":\"Analog Circuits\"},");
                        string.append("{\"sub_name\":\"Analog Communication\"},");
                        string.append("{\"sub_name\":\"Microprocessors and Microcontrollers\"},");
                        string.append("{\"sub_name\":\"Analog Integrated Circuits\"},");
                        string.append("{\"sub_name\":\"Constitution of India\"},");
                    } else if ("sem5".equals(sem)){
                        string.append("{\"sub_name\":\"Youth Empowerment for Yoga Practice\"},");
                        string.append("{\"sub_name\":\"Digital Communication\"},");
                        string.append("{\"sub_name\":\"Transmission lines and waveguides\"},");
                        string.append("{\"sub_name\":\"Digital Signal Processing\"},");
                        string.append("{\"sub_name\":\"Control Systems\"},");
                        string.append("{\"sub_name\":\"Introduction to VLSI System Design\"},");
                    } else if ("sem6".equals(sem)){
                        string.append("{\"sub_name\":\"Professional Ethics\"},");
                        string.append("{\"sub_name\":\"VLSI Design\"},");
                        string.append("{\"sub_name\":\"Antennas and Wave Propagation\"},");
                        string.append("{\"sub_name\":\"Computer System Architecture and Organization\"},");
                        string.append("{\"sub_name\":\"Embedded Systems\"},");
                        string.append("{\"sub_name\":\"Control Systems\"},");
                        string.append("{\"sub_name\":\"Internet of Things\"},");
                        string.append("{\"sub_name\":\"Digital image and video Processing\"},");
                        string.append("{\"sub_name\":\"Fiber Optic Communications\"},");
                        string.append("{\"sub_name\":\"Mobile Communication\"},");
                    } else if ("sem7".equals(sem)){
                        string.append("{\"sub_name\":\"Management Theory and Practice\"},");
                        string.append("{\"sub_name\":\"Microwave Engineering\"},");
                        string.append("{\"sub_name\":\"Automotive Electronics\"},");
                        string.append("{\"sub_name\":\"Bio-Medical Electronics\"},");
                        string.append("{\"sub_name\":\"Data Communication Networks\"},");
                        string.append("{\"sub_name\":\"Fiber Optic Communications\"},");
                        string.append("{\"sub_name\":\"Mobile Communication\"},");
                    } else if ("sem8".equals(sem)){
                        string.append("{\"sub_name\":\"Fiber Optic Communications\"},");
                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("eee".equals(dept)) {
                    if("sem1".equals(sem)){
                        string.append("{\"sub_name\":\"Communicative English\"},");
                        string.append("{\"sub_name\":\"Calculus and Differential Equations\"},");
                        string.append("{\"sub_name\":\"Waves , Optics and Introduction to Quantum Mechanics\"},");
                        string.append("{\"sub_name\":\"Programming in C\"},");
                    } else if ("sem2".equals(sem)){
                        string.append("{\"sub_name\":\"Applied Chemistry\"},");
                        string.append("{\"sub_name\":\"Linear Algebra, Numerical Methods and Transform Calculus\"},");
                        string.append("{\"sub_name\":\"Basics of Civil and Mechanical Engineering\"},");
                    }  else if ("sem3".equals(sem)){
                        string.append("{\"sub_name\":\"Object Oriented Programming with C++\"},");
                        string.append("{\"sub_name\":\"Electric Circuit Theory\"},");
                        string.append("{\"sub_name\":\"Field Theory\"},");
                        string.append("{\"sub_name\":\"Electronic Devices and Circuits\"},");
                        string.append("{\"sub_name\":\"Electrical Machines - I\"},");
                        string.append("{\"sub_name\":\"Digital Circuits\"},");
                    } else if ("sem4".equals(sem)){
                        string.append("{\"sub_name\":\"Probability and Applied Statistics\"},");
                        string.append("{\"sub_name\":\"Engineering Mechanics\"},");
                        string.append("{\"sub_name\":\"Principles of Signals and Systems\"},");
                        string.append("{\"sub_name\":\"Linear Integrated Circuits\"},");
                        string.append("{\"sub_name\":\"Electrical Machines - II\"},");
                        string.append("{\"sub_name\":\"Electrical and Electronic Measurements\"},");
                        string.append("{\"sub_name\":\"Constitution of India\"},");
                    } else if ("sem5".equals(sem)){
                        string.append("{\"sub_name\":\"Business Communication Skills\"},");
                        string.append("{\"sub_name\":\"Power Generation, Transmission and Distribution\"},");
                        string.append("{\"sub_name\":\"Microprocessors, Microcontrollers and Applications\"},");
                        string.append("{\"sub_name\":\"Control Systems Engineering\"},");
                        string.append("{\"sub_name\":\"Environmental Sciences and Engineering\"},");
                        string.append("{\"sub_name\":\"Renewable Power Generation Systems\"},");
                        string.append("{\"sub_name\":\"Electric Vehicles\"},");
                    } else if ("sem6".equals(sem)){
                        string.append("{\"sub_name\":\"Technology Management\"},");
                        string.append("{\"sub_name\":\"Power System Analysis\"},");
                        string.append("{\"sub_name\":\"Power Electronic Devices and Circuits\"},");
                        string.append("{\"sub_name\":\"Energy Auditing and Management\"},");
                        string.append("{\"sub_name\":\"Mems and Applications\"},");
                        string.append("{\"sub_name\":\"Automotive Electronics for Electrical Engineering\"},");
                        string.append("{\"sub_name\":\"Renewable Power Generation Systems\"},");
                        string.append("{\"sub_name\":\"Smart Grid Systems\"},");
                        string.append("{\"sub_name\":\"Special Machines and Controllers\"},");
                        string.append("{\"sub_name\":\"Electric Vehicles\"},");
                    } else if ("sem7".equals(sem)){
                        string.append("{\"sub_name\":\"Professional Ethics\"},");
                        string.append("{\"sub_name\":\"Power System Operation, Control and Protection\"},");
                        string.append("{\"sub_name\":\"Computer System Architecture\"},");
                        string.append("{\"sub_name\":\"Special Machines and Controllers\"},");
                        string.append("{\"sub_name\":\"Mems and Applications\"},");
                        string.append("{\"sub_name\":\"Smart Grid Technology\"},");
                        string.append("{\"sub_name\":\"Smart Grid Systems\"},");
                        string.append("{\"sub_name\":\"Renewable Power Generation Systems\"},");
                        string.append("{\"sub_name\":\"Electric Vehicles\"},");
                        string.append("{\"sub_name\":\"Power Plant Instrumentation\"},");
                        string.append("{\"sub_name\":\"Biomedical Instrumentation\"},");
                    } else if ("sem8".equals(sem)){
                        string.append("{\"sub_name\":\"Energy Auditing and Management\"},");
                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("eie".equals(dept)) {
                    if("sem1".equals(sem)){
                        string.append("{\"sub_name\":\"Communicative English\"},");
                        string.append("{\"sub_name\":\"Calculus and Differential Equations\"},");
                        string.append("{\"sub_name\":\"Waves , Optics and Introduction to Quantum Mechanics\"},");
                        string.append("{\"sub_name\":\"Programming in C\"},");
                    } else if ("sem2".equals(sem)){
                        string.append("{\"sub_name\":\"Applied Chemistry\"},");
                        string.append("{\"sub_name\":\"Linear Algebra, Numerical Methods and Transform Calculus\"},");
                        string.append("{\"sub_name\":\"Electrical Circuits and Networks\"},");
                    } else if ("sem3".equals(sem)){
                        string.append("{\"sub_name\":\"Business Communication Skills\"},");
                        string.append("{\"sub_name\":\"Biology for Engineers\"},");
                        string.append("{\"sub_name\":\"Principles of Electrical Machines\"},");
                        string.append("{\"sub_name\":\"Electronic circuits\"},");
                        string.append("{\"sub_name\":\"Sensors and Transducers\"},");
                        string.append("{\"sub_name\":\"Measurements and Instrumentation\"},");
                        string.append("{\"sub_name\":\"Environmental Sciences and Engineering\"},");
                    } else if ("sem4".equals(sem)){
                        string.append("{\"sub_name\":\"Professional Ethics\"},");
                        string.append("{\"sub_name\":\"Probability and Applied Statistics\"},");
                        string.append("{\"sub_name\":\"Engineering Mechanics\"},");
                        string.append("{\"sub_name\":\"Electronics for Analog Signal Processing\"},");
                        string.append("{\"sub_name\":\"Digital Electronics\"},");
                        string.append("{\"sub_name\":\"Fundamentals of Microprocessors and Microcontrollers\"},");
                        string.append("{\"sub_name\":\"Constitution of India\"},");
                    } else if ("sem5".equals(sem)){
                        string.append("{\"sub_name\":\"Technology Management\"},");
                        string.append("{\"sub_name\":\"Industrial Hydraulics and Pneumatics\"},");
                        string.append("{\"sub_name\":\"Control System Design\"},");
                        string.append("{\"sub_name\":\"Basics of Signals and Systems\"},");
                        string.append("{\"sub_name\":\"Industrial Internet of Things\"},");
                        string.append("{\"sub_name\":\"Power Electronics and Drives\"},");
                    } else if ("sem6".equals(sem)){
                        string.append("{\"sub_name\":\"Principles of Communication\"},");
                        string.append("{\"sub_name\":\"Process Control\"},");
                        string.append("{\"sub_name\":\"Industrial Instrumentation\"},");
                        string.append("{\"sub_name\":\"Fiber Optics and Laser Instrumentation\"},");
                        string.append("{\"sub_name\":\"Industrial Internet of Things\"},");
                        string.append("{\"sub_name\":\"Automotive Instrumentation\"},");
                        string.append("{\"sub_name\":\"Real Time Embedded Systems\"},");
                        string.append("{\"sub_name\":\"Measurement and Control\"},");
                        string.append("{\"sub_name\":\"Industrial Automation\"},");
                        string.append("{\"sub_name\":\"Basics of VLSI Technology\"},");
                        string.append("{\"sub_name\":\"Industrial Data Networks\"},");
                        string.append("{\"sub_name\":\"Robotics and its Applications\"},");
                    } else if ("sem7".equals(sem)){
                        string.append("{\"sub_name\":\"Soft Computing Techniques\"},");
                        string.append("{\"sub_name\":\"Analytical Instrumentation\"},");
                        string.append("{\"sub_name\":\"Industrial Automation Systems\"},");
                        string.append("{\"sub_name\":\"Measurement and Control\"},");
                        string.append("{\"sub_name\":\"Power Plant Instrumentation\"},");
                        string.append("{\"sub_name\":\"Biomedical Instrumentation\"},");
                        string.append("{\"sub_name\":\"Smart and Wireless Instrumentation\"},");
                    } else if ("sem8".equals(sem)){
                        string.append("{\"sub_name\":\"Smart and Wireless Instrumentation\"},");
                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("ibt".equals(dept)){
                    if("sem1".equals(sem)){
                        string.append("{\"sub_name\":\"Chemistry for Biotechnology\"},");
                        string.append("{\"sub_name\":\"Calculus and Linear Algebra\"},");
                        string.append("{\"sub_name\":\"Basics of Electrical and Electronics Engineering\"},");
                    } else if ("sem2".equals(sem)){
                        string.append("{\"sub_name\":\"Communicative English\"},");
                        string.append("{\"sub_name\":\"Differential Equations and Complex Variables\"},");
                        string.append("{\"sub_name\":\"Mechanics and Properties of Solids\"},");
                        string.append("{\"sub_name\":\"Programming in C\"},");
                    } else if ("sem3".equals(sem)){
                        string.append("{\"sub_name\":\"Transform Calculus and Partial Differential Equations\"},");
                        string.append("{\"sub_name\":\"Microbiology\"},");
                        string.append("{\"sub_name\":\"Fluid Mechanics\"},");
                        string.append("{\"sub_name\":\"Cell Biology\"},");
                        string.append("{\"sub_name\":\"Biochemistry\"},");
                        string.append("{\"sub_name\":\"Constitution of India\"},");
                    } else if ("sem4".equals(sem)){
                        string.append("{\"sub_name\":\"Process Calculations and Heat Transfer\"},");
                        string.append("{\"sub_name\":\"Basics of Industrial Biotechnology\"},");
                        string.append("{\"sub_name\":\"Molecular Biology\"},");
                        string.append("{\"sub_name\":\"Biochemical Thermodynamics\"},");
                        string.append("{\"sub_name\":\"Analytical Techniques in Biotechnology\"},");
                        string.append("{\"sub_name\":\"Enzyme Engineering and Technology\"},");
                        string.append("{\"sub_name\":\"Environmental Sciences and Engineering\"},");
                    } else if ("sem5".equals(sem)){
                        string.append("{\"sub_name\":\"Clinical Trials and Bioethics\"},");
                        string.append("{\"sub_name\":\"Mass Transfer Operations\"},");
                        string.append("{\"sub_name\":\"Bioprocess Principles\"},");
                        string.append("{\"sub_name\":\"Genetic Engineering\"},");
                        string.append("{\"sub_name\":\"Medical BioTechnology\"},");
                        string.append("{\"sub_name\":\"Fundamental concepts of Biology for Engineers\"},");
                    } else if ("sem6".equals(sem)){
                        string.append("{\"sub_name\":\"Immunology\"},");
                        string.append("{\"sub_name\":\"Bioinformatics\"},");
                        string.append("{\"sub_name\":\"Bioprocess Engineering\"},");
                        string.append("{\"sub_name\":\"Chemical Reaction Engineering\"},");
                        string.append("{\"sub_name\":\"Plant BioTechnology\"},");
                    } else if ("sem7".equals(sem)){
                        string.append("{\"sub_name\":\"Technology Management\"},");
                        string.append("{\"sub_name\":\"Downstream Processing\"},");
                        string.append("{\"sub_name\":\"Food Process Engineering\"},");
                        string.append("{\"sub_name\":\"Genomics and Proteomics\"},");
                        string.append("{\"sub_name\":\"Marine Biotechnology\"},");
                        string.append("{\"sub_name\":\"Animal Biotechnology\"},");
                        string.append("{\"sub_name\":\"Genetics\"},");
                        string.append("{\"sub_name\":\"Fundamental concepts of Biology for Engineers\"},");
                        string.append("{\"sub_name\":\"Nano Biotechnology\"},");
                    } else if ("sem8".equals(sem)){

                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("it".equals(dept)){
                    if("sem1".equals(sem)){
                        string.append("{\"sub_name\":\"Communicative English\"},");
                        string.append("{\"sub_name\":\"Calculus\"},");
                        string.append("{\"sub_name\":\"Semiconductor Physics\"},");
                        string.append("{\"sub_name\":\"Programming in C\"},");
                    } else if ("sem2".equals(sem)){
                        string.append("{\"sub_name\":\"Applied Chemistry\"},");
                        string.append("{\"sub_name\":\"Differential Equations and Linear Algebra\"},");
                        string.append("{\"sub_name\":\"Fundamentals of Electrical and Electronics Engineering\"},");
                    } else if ("sem3".equals(sem)){
                        string.append("{\"sub_name\":\"Probability Theory and Applied Statistics\"},");
                        string.append("{\"sub_name\":\"Digital Logic Design\"},");
                        string.append("{\"sub_name\":\"Elements of Communication Engineering\"},");
                        string.append("{\"sub_name\":\"Basics of Microprocessors and Microcontroller\"},");
                        string.append("{\"sub_name\":\"Data Structures and Applications\"},");
                        string.append("{\"sub_name\":\"Object Oriented Programming\"},");
                        string.append("{\"sub_name\":\"Environmental Sciences and Engineering\"},");
                    } else if ("sem4".equals(sem)){
                        string.append("{\"sub_name\":\"Resource Management Techniques\"},");
                        string.append("{\"sub_name\":\"Elements of Discrete Structures\"},");
                        string.append("{\"sub_name\":\"Computer Organization and Architecture\"},");
                        string.append("{\"sub_name\":\"Database Design and Management\"},");
                        string.append("{\"sub_name\":\"Information Coding Techniques\"},");
                        string.append("{\"sub_name\":\"Operating Systems\"},");
                        string.append("{\"sub_name\":\"Constitution of India\"},");
                    } else if ("sem5".equals(sem)){
                        string.append("{\"sub_name\":\"Technology Management\"},");
                        string.append("{\"sub_name\":\"Web Technology\"},");
                        string.append("{\"sub_name\":\"Data Communication and Networking\"},");
                        string.append("{\"sub_name\":\"Analysis and Design of Algorithms\"},");
                        string.append("{\"sub_name\":\"Enterprise Resource Planning\"},");
                        string.append("{\"sub_name\":\"Programming in Python\"},");
                        string.append("{\"sub_name\":\"Object Oriented Programming using C++\"},");
                    } else if ("sem6".equals(sem)){
                        string.append("{\"sub_name\":\"Fundamentals of Machine Learning\"},");
                        string.append("{\"sub_name\":\"Software Engineering\"},");
                        string.append("{\"sub_name\":\"Fundamentals of Digital Signal Processing\"},");
                        string.append("{\"sub_name\":\"Object Oriented Programming using C++\"},");
                        string.append("{\"sub_name\":\"Programming in Python\"},");
                        string.append("{\"sub_name\":\"Intellectual Property Rights\"},");
                        string.append("{\"sub_name\":\"Software Project Management\"},");
                        string.append("{\"sub_name\":\"Artificial Intelligence and Applications\"},");
                        string.append("{\"sub_name\":\"Mobile Computing\"},");
                    } else if ("sem7".equals(sem)){
                        string.append("{\"sub_name\":\"Professional Ethics\"},");
                        string.append("{\"sub_name\":\"Cryptography and Network Security\"},");
                        string.append("{\"sub_name\":\"Internet of Things and its Applications\"},");
                        string.append("{\"sub_name\":\"Mobile Computing\"},");
                        string.append("{\"sub_name\":\"Enterprise Resource Planning\"},");
                    } else if ("sem8".equals(sem)){
                        string.append("{\"sub_name\":\"Big Data Science\"},");
                        string.append("{\"sub_name\":\"Software Quality Assurance\"},");
                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("mech".equals(dept)){
                    if("sem1".equals(sem)){
                        string.append("{\"sub_name\":\"Engineering Chemistry\"},");
                        string.append("{\"sub_name\":\"Calculus and Linear Algebra\"},");
                        string.append("{\"sub_name\":\"Basics of Electrical Engineering\"},");
                    } else if ("sem2".equals(sem)){
                        string.append("{\"sub_name\":\"Communicative English\"},");
                        string.append("{\"sub_name\":\"Differential Equations and Complex Variables\"},");
                        string.append("{\"sub_name\":\"Introduction to Electromagnetism and Applied Physics\"},");
                        string.append("{\"sub_name\":\"Python Programming\"},");
                    } else if ("sem3".equals(sem)){
                        string.append("{\"sub_name\":\"Business Communication skills\"},");
                        string.append("{\"sub_name\":\"Partial differential equations, probability and statistics\"},");
                        string.append("{\"sub_name\":\"ENGINEERING MECHANICS\"},");
                        string.append("{\"sub_name\":\"Mechanics of Materials\"},");
                        string.append("{\"sub_name\":\"Fluid Mechanics and Machinery\"},");
                        string.append("{\"sub_name\":\"Manufacturing Technology I\"},");
                        string.append("{\"sub_name\":\"Constitution of India\"},");
                    } else if ("sem4".equals(sem)){
                        string.append("{\"sub_name\":\"Professional Ethics\"},");
                        string.append("{\"sub_name\":\"Waves and Optics\"},");
                        string.append("{\"sub_name\":\"Basic Electronics Engineering\"},");
                        string.append("{\"sub_name\":\"Kinematics of Machines\"},");
                        string.append("{\"sub_name\":\"Thermodynamics\"},");
                        string.append("{\"sub_name\":\"Manufacturing Technology II\"},");
                        string.append("{\"sub_name\":\"Environmental Sciences and Engineering\"},");
                    } else if ("sem5".equals(sem)){
                        string.append("{\"sub_name\":\"Principles of Management\"},");
                        string.append("{\"sub_name\":\"Biology for Mechanical Engineers\"},");
                        string.append("{\"sub_name\":\"Dynamics of Machines\"},");
                        string.append("{\"sub_name\":\"Thermal Engineering\"},");
                        string.append("{\"sub_name\":\"Automobile Engineering\"},");
                        string.append("{\"sub_name\":\"Mechatronics\"},");
                    } else if ("sem6".equals(sem)){
                        string.append("{\"sub_name\":\"Design of Machine Elements\"},");
                        string.append("{\"sub_name\":\"Materials Engineering\"},");
                        string.append("{\"sub_name\":\"Heat and Mass Transfer\"},");
                        string.append("{\"sub_name\":\"Gas Dynamics and Jet Propulsion\"},");
                        string.append("{\"sub_name\":\"Lean Manufacturing\"},");
                        string.append("{\"sub_name\":\"Additive Manufacturing\"},");
                        string.append("{\"sub_name\":\"Entrepreneurship Development\"},");
                        string.append("{\"sub_name\":\"Total Quality Management\"},");
                        string.append("{\"sub_name\":\"Process Planning and Cost Estimation\"},");
                    } else if ("sem7".equals(sem)){
                        string.append("{\"sub_name\":\"Design of Transmission Systems\"},");
                        string.append("{\"sub_name\":\"Computer Aided Design\"},");
                        string.append("{\"sub_name\":\"Finite Element Analysis\"},");
                        string.append("{\"sub_name\":\"Process Planning and Cost Estimation\"},");
                        string.append("{\"sub_name\":\"Industrial Engineering\"},");
                        string.append("{\"sub_name\":\"Welding Technology\"},");
                        string.append("{\"sub_name\":\"Total Quality Management\"},");
                        string.append("{\"sub_name\":\"Additive Manufacturing\"},");
                    } else if ("sem8".equals(sem)){
                        string.append("{\"sub_name\":\"Gas Dynamics and Jet Propulsion\"},");
                        string.append("{\"sub_name\":\"Automobile Engineering\"},");
                        string.append("{\"sub_name\":\"Entrepreneurship Development\"},");
                        string.append("{\"sub_name\":\"Total Quality Management\"},");
                        string.append("{\"sub_name\":\"Lean Manufacturing\"},");
                    }
                    else{
                        Log.e("Semester", "Unknown semester: " + sem);
                    }
                } else if ("prod".equals(dept)){
                    if("sem1".equals(sem)){
                        string.append("{\"sub_name\":\"Engineering Chemistry\"},");
                        string.append("{\"sub_name\":\"Calculus and Linear Algebra\"},");
                        string.append("{\"sub_name\":\"Basics of Electrical Engineering\"},");
                    } else if ("sem2".equals(sem)){
                        string.append("{\"sub_name\":\"Communicative English\"},");
                        string.append("{\"sub_name\":\"Differential Equations and Complex Variables\"},");
                        string.append("{\"sub_name\":\"Introduction to Electromagnetism and Applied Physics\"},");
                        string.append("{\"sub_name\":\"Python Programming\"},");
                    } else if ("sem3".equals(sem)){
                        string.append("{\"sub_name\":\"Business Communication Skills\"},");
                        string.append("{\"sub_name\":\"Partial Differential Equations, Probability and Statistics\"},");
                        string.append("{\"sub_name\":\"ENGINEERING MECHANICS\"},");
                        string.append("{\"sub_name\":\"Thermal Sciences\"},");
                        string.append("{\"sub_name\":\"Engineering Metallurgy\"},");
                        string.append("{\"sub_name\":\"Manufacturing Technology\"},");
                        string.append("{\"sub_name\":\"Constitution of India\"},");
                    } else if ("sem4".equals(sem)){
                        string.append("{\"sub_name\":\"Total Quality Management Concepts\"},");
                        string.append("{\"sub_name\":\"Waves and Optics\"},");
                        string.append("{\"sub_name\":\"Basic Electronics Engineering\"},");
                        string.append("{\"sub_name\":\"Fluid Mechanics and Machinery\"},");
                        string.append("{\"sub_name\":\"Mechanics of Materials\"},");
                        string.append("{\"sub_name\":\"Machine Tools and Processes\"},");
                        string.append("{\"sub_name\":\"Environmental Sciences and Engineering\"},");
                    } else if ("sem5".equals(sem)){
                        string.append("{\"sub_name\":\"Operations Research Techniques\"},");
                        string.append("{\"sub_name\":\"Production Planning and Control\"},");
                        string.append("{\"sub_name\":\"Mechanics of Machines\"},");
                        string.append("{\"sub_name\":\"Metrology and Computer Aided Inspection\"},");
                        string.append("{\"sub_name\":\"CNC Technology\"},");
                        string.append("{\"sub_name\":\"Production Management\"},");
                        string.append("{\"sub_name\":\"Managerial Economics\"},");
                    } else if ("sem6".equals(sem)){
                        string.append("{\"sub_name\":\"Machine Elements Design\"},");
                        string.append("{\"sub_name\":\"Automation and CIM\"},");
                        string.append("{\"sub_name\":\"Fluid Power Drives and Controls\"},");
                        string.append("{\"sub_name\":\"Green Manufacturing\"},");
                        string.append("{\"sub_name\":\"Supply Chain Management\"},");
                        string.append("{\"sub_name\":\"Managerial Economics\"},");
                        string.append("{\"sub_name\":\"Human Values and Professional Ethics II\"},");
                        string.append("{\"sub_name\":\"Hydraulics and Pneumatics\"},");
                    } else if ("sem7".equals(sem)){
                        string.append("{\"sub_name\":\"Additive Manufacturing\"},");
                        string.append("{\"sub_name\":\"Production of Automotive Components\"},");
                        string.append("{\"sub_name\":\"Jigs, Fixtures and Press Tools\"},");
                        string.append("{\"sub_name\":\"Non Destructive Testing Techniques\"},");
                        string.append("{\"sub_name\":\"Unconventional Manufacturing Processes\"},");
                        string.append("{\"sub_name\":\"Human Values and Professional Ethics II\"},");
                        string.append("{\"sub_name\":\"Plant Layout and Material Handling\"},");
                        string.append("{\"sub_name\":\"Managerial Economics\"},");
                    } else if ("sem8".equals(sem)){
                        string.append("{\"sub_name\":\"Human Values and Professional Ethics II\"},");
                        string.append("{\"sub_name\":\"Plant Layout and Material Handling\"},");
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
                        string.append("{\"sub_name\":\"தமிழர் மரபு/ Heritage of Tamils\"},");
                        string.append("{\"sub_name\":\"Professional English\"},");
                        string.append("{\"sub_name\":\"Linear Algebra and Calculus\"},");
                        string.append("{\"sub_name\":\"Engineering Physics\"},");
                        string.append("{\"sub_name\":\"Programming in C\"},");
                        string.append("{\"sub_name\":\"Environmental Science and Engineering\"},");
                    } else if ("sem2".equals(sem)){
                        string.append("{\"sub_name\":\"தமிழரும் தொழில்நுட்பமும்/ Tamils and Technology\"},");
                        string.append("{\"sub_name\":\"Values and Ethics\"},");
                        string.append("{\"sub_name\":\"Vector Spaces and Differential Equations with MATLAB\"},");
                        string.append("{\"sub_name\":\"Physics for Information Science\"},");
                        string.append("{\"sub_name\":\"Applied Chemistry\"},");
                        string.append("{\"sub_name\":\"Basics of Electrical and Electronics Engineering\"},");
                    } else if ("sem3".equals(sem)){
                        /*string.append("{\"sub_name\":\"Probability, Random Processes and Queueing Theory\"},");
                        string.append("{\"sub_name\":\"Digital Systems\"},");
                        string.append("{\"sub_name\":\"Discrete Structures\"},");
                        string.append("{\"sub_name\":\"Data Structures\"},");
                        string.append("{\"sub_name\":\"Foundations of Data Science\"},");
                        string.append("{\"sub_name\":\"Object Oriented Programming\"},");*/
                    } else if ("sem4".equals(sem)){
                        /*string.append("{\"sub_name\":\"Analog and Digital Communication\"},");
                        string.append("{\"sub_name\":\"Computer Architecture\"},");
                        string.append("{\"sub_name\":\"Data Base Management Systems\"},");
                        string.append("{\"sub_name\":\"System Programming and Operating systems\"},");
                        string.append("{\"sub_name\":\"Design and Analysis of Algorithms\"},");
                        string.append("{\"sub_name\":\"Software Engineering Methodologies\"},");*/
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
                        string.append("{\"sub_name\":\"தமிழர் மரபு/ Heritage of Tamils\"},");
                        string.append("{\"sub_name\":\"Values and Ethics\"},");
                        string.append("{\"sub_name\":\"Linear Algebra and Calculus\"},");
                        string.append("{\"sub_name\":\"Engineering Physics\"},");
                        string.append("{\"sub_name\":\"Engineering Chemistry\"},");
                        string.append("{\"sub_name\":\"Basics of Electrical and Electronics Engineering\"},");
                    } else if ("sem2".equals(sem)){
                        string.append("{\"sub_name\":\"தமிழரும் தொழில்நுட்பமும்/ Tamils and Technology\"},");
                        string.append("{\"sub_name\":\"Professional English\"},");
                        string.append("{\"sub_name\":\"Differential Equations and Numerical methods\"},");
                        string.append("{\"sub_name\":\"Engineering Mechanics\"},");
                        string.append("{\"sub_name\":\"Programming in C\"},");
                        string.append("{\"sub_name\":\"Environmental Science and Engineering\"},");
                    } else if ("sem3".equals(sem)){
                        /*string.append("{\"sub_name\":\"Transform Calculus and Partial Differential Equations\"},");
                        string.append("{\"sub_name\":\"Mechanics of Fluids\"},");
                        string.append("{\"sub_name\":\"Engineering Geology\"},");
                        string.append("{\"sub_name\":\"Mechanics of Solids I\"},");
                        string.append("{\"sub_name\":\"Surveying\"},");
                        string.append("{\"sub_name\":\"Construction Materials and Technology\"},");*/
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
                        string.append("{\"sub_name\":\"தமிழர் மரபு/ Heritage of Tamils\"},");
                        string.append("{\"sub_name\":\"Professional English\"},");
                        string.append("{\"sub_name\":\"Linear Algebra and Calculus\"},");
                        string.append("{\"sub_name\":\"Engineering Physics\"},");
                        string.append("{\"sub_name\":\"Programming in C\"},");
                        string.append("{\"sub_name\":\"Environmental Science and Engineering\"},");
                    } else if ("sem2".equals(sem)){
                        string.append("{\"sub_name\":\"தமிழரும் தொழில்நுட்பமும்/ Tamils and Technology\"},");
                        string.append("{\"sub_name\":\"Values and Ethics\"},");
                        string.append("{\"sub_name\":\"Differential Equations and Numerical methods\"},");
                        string.append("{\"sub_name\":\"Semiconductor Physics\"},");
                        string.append("{\"sub_name\":\"Applied Chemistry\"},");
                        string.append("{\"sub_name\":\"Basics of Electrical Engineering\"},");
                    } else if ("sem3".equals(sem)){
                        /*string.append("{\"sub_name\":\"Circuit Theory\"},");
                        string.append("{\"sub_name\":\"Data Structures\"},");
                        string.append("{\"sub_name\":\"Signals and Systems\"},");
                        string.append("{\"sub_name\":\"Analog Circuits\"},");
                        string.append("{\"sub_name\":\"Digital Circuits Design\"},");
                        string.append("{\"sub_name\":\"Electromagnetic Waves and Waveguides\"},");*/
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
                        string.append("{\"sub_name\":\"தமிழர் மரபு/ Heritage of Tamils\"},");
                        string.append("{\"sub_name\":\"Professional English\"},");
                        string.append("{\"sub_name\":\"Linear Algebra and Calculus\"},");
                        string.append("{\"sub_name\":\"Engineering Physics\"},");
                        string.append("{\"sub_name\":\"Programming in C\"},");
                        string.append("{\"sub_name\":\"Environmental Science and Engineering\"},");
                    } else if ("sem2".equals(sem)){
                        string.append("{\"sub_name\":\"தமிழரும் தொழில்நுட்பமும்/ Tamils and Technology\"},");
                        string.append("{\"sub_name\":\"Values and Ethics\"},");
                        string.append("{\"sub_name\":\"Differential Equations and Numerical methods\"},");
                        string.append("{\"sub_name\":\"Applied Chemistry\"},");
                        string.append("{\"sub_name\":\"Engineering Mechanics\"},");
                        string.append("{\"sub_name\":\"Basics of Civil and Mechanical Engineering\"},");
                    } else if ("sem3".equals(sem)){
                        /*string.append("{\"sub_name\":\"Data Structures\"},");
                        string.append("{\"sub_name\":\"Electric Circuit Theory\"},");
                        string.append("{\"sub_name\":\"Field Theory\"},");
                        string.append("{\"sub_name\":\"Electronic Devices and Circuits\"},");
                        string.append("{\"sub_name\":\"Electrical Machines-I\"},");
                        string.append("{\"sub_name\":\"Digital Circuits\"},");*/
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
                        string.append("{\"sub_name\":\"தமிழர் மரபு/ Heritage of Tamils\"},");
                        string.append("{\"sub_name\":\"Professional English\"},");
                        string.append("{\"sub_name\":\"Linear Algebra and Calculus\"},");
                        string.append("{\"sub_name\":\"Engineering Physics\"},");
                        string.append("{\"sub_name\":\"Programming in C\"},");
                        string.append("{\"sub_name\":\"Environmental Science and Engineering\"},");
                    } else if ("sem2".equals(sem)){
                        string.append("{\"sub_name\":\"தமிழரும் தொழில்நுட்பமும்/ Tamils and Technology\"},");
                        string.append("{\"sub_name\":\"Values and Ethics\"},");
                        string.append("{\"sub_name\":\"Differential Equations and Numerical methods\"},");
                        string.append("{\"sub_name\":\"Physics of Materials\"},");
                        string.append("{\"sub_name\":\"Applied Chemistry\"},");
                        string.append("{\"sub_name\":\"Basics of Civil and Mechanical Engineering\"},");
                    } else if ("sem3".equals(sem)){
                        /*string.append("{\"sub_name\":\"Thermodynamics and Fluid Mechanics \"},");
                        string.append("{\"sub_name\":\"Electrical Circuits and Networks \"},");
                        string.append("{\"sub_name\":\"Analog Electronics\"},");
                        string.append("{\"sub_name\":\"Sensors and Transducers\"},");
                        string.append("{\"sub_name\":\"Electrical and Electronic Measurement Techniques\"},");
                        string.append("{\"sub_name\":\"Constitution of India\"},");*/
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
                        string.append("{\"sub_name\":\"தமிழர் மரபு/ Heritage of Tamils\"},");
                        string.append("{\"sub_name\":\"Values and Ethics\"},");
                        string.append("{\"sub_name\":\"Linear Algebra and Calculus\"},");
                        string.append("{\"sub_name\":\"Engineering Physics\"},");
                        string.append("{\"sub_name\":\"Chemistry for Biotechnology\"},");
                        string.append("{\"sub_name\":\"Basics of Electrical and Electronics Engineering\"},");
                    } else if ("sem2".equals(sem)){
                        string.append("{\"sub_name\":\"தமிழரும் தொழில்நுட்பமும்/ Tamils and Technology\"},");
                        string.append("{\"sub_name\":\"Professional English\"},");
                        string.append("{\"sub_name\":\"Differential Equations and Numerical Methods\"},");
                        string.append("{\"sub_name\":\"Programming in C\"},");
                        string.append("{\"sub_name\":\"Biochemistry-I\"},");
                        string.append("{\"sub_name\":\"Environmental Science and Engineering\"},");
                    } else if ("sem3".equals(sem)){
                        /*string.append("{\"sub_name\":\"Transform Calculus and Partial Differential Equations\"},");
                        string.append("{\"sub_name\":\"Cell Biology\"},");
                        string.append("{\"sub_name\":\"Process Calculations and Heat transfer\"},");
                        string.append("{\"sub_name\":\"Industrial Microbiology\"},");
                        string.append("{\"sub_name\":\"Biochemistry - II\"},");
                        string.append("{\"sub_name\":\"Genetics\"},");*/
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
                        string.append("{\"sub_name\":\"தமிழர் மரபு/ Heritage of Tamils\"},");
                        string.append("{\"sub_name\":\"Professional English\"},");
                        string.append("{\"sub_name\":\"Linear Algebra and Calculus\"},");
                        string.append("{\"sub_name\":\"Engineering Physics\"},");
                        string.append("{\"sub_name\":\"Programming in C\"},");
                        string.append("{\"sub_name\":\"Environmental Science and Engineering\"},");
                    } else if ("sem2".equals(sem)){
                        string.append("{\"sub_name\":\"தமிழரும் தொழில்நுட்பமும்/ Tamils and Technology\"},");
                        string.append("{\"sub_name\":\"Values and Ethics\"},");
                        string.append("{\"sub_name\":\"Vector Spaces and Differential Equations with MATLAB\"},");
                        string.append("{\"sub_name\":\"Physics for Information Science\"},");
                        string.append("{\"sub_name\":\"Applied Chemistry\"},");
                        string.append("{\"sub_name\":\"Basics of Electrical and Electronics Engineering\"},");
                    } else if ("sem3".equals(sem)){
                        /*string.append("{\"sub_name\":\"Probability, Random Processes and Queuing Theory\"},");
                        string.append("{\"sub_name\":\"Computer Organization and Architecture\"},");
                        string.append("{\"sub_name\":\"Digital Logic Design\"},");
                        string.append("{\"sub_name\":\"Data Structures and Algorithms\"},");
                        string.append("{\"sub_name\":\"Java Programming\"},");*/
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
                        string.append("{\"sub_name\":\"தமிழர் மரபு/ Heritage of Tamils\"},");
                        string.append("{\"sub_name\":\"Values and Ethics\"},");
                        string.append("{\"sub_name\":\"Linear Algebra and Calculus\"},");
                        string.append("{\"sub_name\":\"Engineering Physics\"},");
                        string.append("{\"sub_name\":\"Engineering Chemistry\"},");
                        string.append("{\"sub_name\":\"Basics of Electrical and Electronics Engineering\"},");
                    } else if ("sem2".equals(sem)){
                        string.append("{\"sub_name\":\"தமிழரும் தொழில்நுட்பமும்/ Tamils and Technology\"},");
                        string.append("{\"sub_name\":\"Professional English\"},");
                        string.append("{\"sub_name\":\"Differential Equations and Numerical Methods\"},");
                        string.append("{\"sub_name\":\"Materials Science\"},");
                        string.append("{\"sub_name\":\"Python Programming\"},");
                        string.append("{\"sub_name\":\"Environmental Science and Engineering\"},");
                    } else if ("sem3".equals(sem)){
                        /*string.append("{\"sub_name\":\"Applied Engineering Mechanics\"},");
                        string.append("{\"sub_name\":\"Solid Mechanics\"},");
                        string.append("{\"sub_name\":\"Fluid Mechanics and Machinery\"},");
                        string.append("{\"sub_name\":\"Manufacturing Technology I\"},");
                        string.append("{\"sub_name\":\"Materials Engineering and Metallurgy\"},");
                        string.append("{\"sub_name\":\"Thermodynamics\"},");*/
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
                        string.append("{\"sub_name\":\"தமிழர் மரபு/ Heritage of Tamils\"},");
                        string.append("{\"sub_name\":\"Values and Ethics\"},");
                        string.append("{\"sub_name\":\"Linear Algebra and Calculus\"},");
                        string.append("{\"sub_name\":\"Engineering Physics\"},");
                        string.append("{\"sub_name\":\"Engineering Chemistry\"},");
                        string.append("{\"sub_name\":\"Basics of Electrical and Electronics Engineering\"},");
                    } else if ("sem2".equals(sem)){
                        string.append("{\"sub_name\":\"தமிழரும் தொழில்நுட்பமும்/ Tamils and Technology\"},");
                        string.append("{\"sub_name\":\"Professional English\"},");
                        string.append("{\"sub_name\":\"Differential Equations and Numerical Methods\"},");
                        string.append("{\"sub_name\":\"Materials Science\"},");
                        string.append("{\"sub_name\":\"Python Programming\"},");
                        string.append("{\"sub_name\":\"Environmental Science and Engineering\"},");
                    } else if ("sem3".equals(sem)){
                        /*string.append("{\"sub_name\":\"Thermal Systems and Heat Transfer \"},");
                        string.append("{\"sub_name\":\"Engineering Mechanics\"},");
                        string.append("{\"sub_name\":\"Machine Tools and Processes\"},");
                        string.append("{\"sub_name\":\"Engineering Metallurgy\"},");
                        string.append("{\"sub_name\":\"Manufacturing Technology\"},");
                        string.append("{\"sub_name\":\"Constitution of India\"},");*/
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
                String sub_name = itemObject.getString("sub_name");
                items.add(new Item2(sub_name,dept,reg,sem));
            }
            myQuesAdapter.notifyDataSetChanged();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}