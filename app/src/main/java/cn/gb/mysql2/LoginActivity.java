package cn.gb.mysql2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import dao.StudentDao;
import dao.StudentDaoImp;

/**
 * 登陆界面
 */

public class LoginActivity extends Activity {
    //定义Toast显示时间属性
    final int s = Toast.LENGTH_SHORT;
    public Button loginBtn;

    public AutoCompleteTextView atv;
    public EditText et;
    StudentDao st = new StudentDaoImp();
    public static String userId;
    public static String password;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        setContentView(R.layout.activity_login);

        et = findViewById(R.id.password);
        atv = findViewById(R.id.userId);

        loginBtn = findViewById(R.id.sign_in_button);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                password = et.getText().toString();
                userId = atv.getText().toString();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        if (st.isUser(userId, password)) {
                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(intent);
                            finish();

                        } else {
                            Looper.prepare();
                            Toast.makeText(getApplicationContext(), "账户或者密码错误，请重新输入", s).show();
                            Looper.loop();
                        }

                    }
                }).start();

            }
        });

    }

}

