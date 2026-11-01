package com.edman7pro.app; // عدل السطر ده لو اسم الحزمة عندك مختلف

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.button.Button; // أو android.widget.Button حسب المتاح
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // لو لسه مأنشأتفتش ملف الـ XML، هنعرض واجهة برمجية مباشرة عشان التطبيق يشتغل معاك فوراً من غير أخطاء
        android.widget.LinearLayout layout = new android.widget.LinearLayout(this);
        layout.setOrientation(android.widget.LinearLayout.VERTICAL);
        layout.setGravity(android.view.Gravity.CENTER);
        layout.setBackgroundColor(android.graphics.Color.parseColor("#121212"));
        layout.setPadding(40, 40, 40, 40);

        // عنوان التطبيق
        android.widget.TextView titleText = new android.widget.TextView(this);
        titleText.setText("༺ EDMAN TOOLS ༻");
        titleText.setTextColor(android.graphics.Color.parseColor("#00E676"));
        titleText.setTextSize(22);
        titleText.setGravity(android.view.Gravity.CENTER);
        layout.addView(titleText);

        // مسافة فاصلة
        android.widget.Space space = new android.widget.Space(this);
        space.setMinimumHeight(60);
        layout.addView(space);

        // زر تليجرام للتواصل المباشر
        Button btnTelegram = new Button(this);
        btnTelegram.setText("قناة التليجرام والمصدر");
        btnTelegram.setTextColor(android.graphics.Color.WHITE);
        btnTelegram.setBackgroundColor(android.graphics.Color.parseColor("#0052CC"));
        
        btnTelegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/youssef7_HAKER"));
                startActivity(intent);
            }
        });
        layout.addView(btnTelegram);

        setContentView(layout);
    }
}
