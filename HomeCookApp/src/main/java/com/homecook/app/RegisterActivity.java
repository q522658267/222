package com.homecook.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity {

    private TextInputEditText etName, etPhone, etPassword;
    private RadioButton rbCustomer, rbCook;
    private Button btnRegister;
    private TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // 初始化视图
        etName = findViewById(R.id.et_name);
        etPhone = findViewById(R.id.et_phone);
        etPassword = findViewById(R.id.et_password);
        rbCustomer = findViewById(R.id.rb_customer);
        rbCook = findViewById(R.id.rb_cook);
        btnRegister = findViewById(R.id.btn_register);
        tvLogin = findViewById(R.id.tv_login);

        // 注册按钮点击事件
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString().trim();
                String phone = etPhone.getText().toString().trim();
                String password = etPassword.getText().toString().trim();
                String userType = rbCustomer.isChecked() ? "customer" : "cook";

                // 简单的输入验证
                if (name.isEmpty() || phone.isEmpty() || password.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "请填写完整信息", Toast.LENGTH_SHORT).show();
                    return;
                }

                // 模拟注册成功
                Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
                
                // 跳转到登录页面
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // 登录文本点击事件
        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // 返回登录页面
            }
        });
    }
}
