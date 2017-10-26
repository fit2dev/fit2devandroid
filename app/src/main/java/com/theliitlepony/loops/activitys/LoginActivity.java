package com.theliitlepony.loops.activitys;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.view.WindowManager;

import com.theliitlepony.loops.R;

import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends CoreActivity {


    @BindView(R.id.studentName)
    TextInputEditText studentName;
    @BindView(R.id.studentLastName)
    TextInputEditText studentLastName;
    @BindView(R.id.layout_student_lastname)
    TextInputLayout layout_student_lastname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE
                | WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.loginBtn)
    protected void LoginHandler() {
        loading.show();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                loading.dismiss();
                Login();
            }
        }, 2000);
    }

    private void Login() {
        String student_firstname = studentName.getText().toString();
        String student_lastname = studentLastName.getText().toString();

        if (student_firstname.isEmpty() || student_lastname.isEmpty()) {
            layout_student_lastname.setErrorEnabled(true);
            layout_student_lastname.setError("กรุณาใส่ชื่อและนามสกุลนักเรียน");
        } else {
            checkAunthen(student_firstname, student_lastname);
        }
    }

    private void checkAunthen(String student_firstname, String student_lastname) {
        if (!Objects.equals(student_firstname, "little") && !Objects.equals(student_lastname, "pony")) {
            layout_student_lastname.setErrorEnabled(true);
            layout_student_lastname.setError("ชื่อและนามสกุลไม่ถูกต้อง");
        } else {
            Intent intentSelectParentAcctivity = new Intent(LoginActivity.this,SelectInfoParentActivity.class);
            startActivity(intentSelectParentAcctivity);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    }


}

