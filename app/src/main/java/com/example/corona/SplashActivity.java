package com.example.corona;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                SplashActivity.this.startActivity(new Intent(SplashActivity.this.getApplicationContext(), MainActivity.class));
                SplashActivity.this.finish();
            }
        }, 2000);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        finish();
    }
}