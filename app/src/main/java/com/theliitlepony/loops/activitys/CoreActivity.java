package com.theliitlepony.loops.activitys;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

import com.theliitlepony.loops.R;

/**
 * Created by user on 22 ต.ค. 2560.
 */

public class CoreActivity extends AppCompatActivity {

    public Dialog loading;
    protected String DEBUG_TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DEBUG_TAG = this.getClass().getSimpleName();

        loading = new Dialog(this);
        loading.requestWindowFeature(Window.FEATURE_NO_TITLE);
        loading.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        loading.setContentView(R.layout.component_loading);
        loading.setCancelable(false);

    }


    @Override
    protected void onDestroy() {
        if(loading!=null){
            loading.dismiss();
        }

        super.onDestroy();
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
