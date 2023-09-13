package com.example.week2;


import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout=new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setGravity(Gravity.START);

        TextView textView1=new TextView(this);
        textView1.setText("이름 : 홍길동");
        textView1.setTextSize(20);
        textView1.setGravity(Gravity.START);

        TextView textView2=new TextView(this);
        textView2.setText("프로그래밍 능력 : JAVA(중), Python(상)");
        textView2.setTextSize(20);
        textView2.setGravity(Gravity.START);

        TextView textView3=new TextView(this);
        textView3.setText("국적 : 대한민국\n연락처 : 0326pjh@naver.com");
        textView3.setTextSize(20);
        textView3.setGravity(Gravity.START);


        linearLayout.addView(textView1);
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);

        setContentView(linearLayout);
    }
}