package com.homecook.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    private TextInputEditText etPhone, etPassword;
    private Button btnLogin;
    private TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // 初始化视图
        etPhone = findViewById(R.id.et_phone);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);
        tvRegister = findViewById(R.id.tv_register);

        // 登录按钮点击事件
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = etPhone.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                // 简单的输入验证
                if (phone.isEmpty() || password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "请输入手机号和密码", Toast.LENGTH_SHORT).show();
                    return;
                }

                // 模拟登录成功
                Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                
                // 跳转到主页
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // 注册文本点击事件
        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
