package com.theliitlepony.loops.activities;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import com.theliitlepony.loops.R;

public class SplashScreenActivity extends CoreActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        gotoLoginActivity();
    }

    private void gotoLoginActivity() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intentLoginActivity = new Intent(SplashScreenActivity.this, LoginActivity.class);
                intentLoginActivity.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intentLoginActivity);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        },2000);
    }
}
