package com.homecook.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class PublishRequestActivity extends AppCompatActivity {

    private TextInputEditText etDishName, etDescription, etBudget, etPeopleCount, etDate, etTime, etAddress;
    private ImageView ivAddPhoto;
    private Button btnPublish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publish_request);

        // 初始化视图
        etDishName = findViewById(R.id.et_dish_name);
        etDescription = findViewById(R.id.et_description);
        etBudget = findViewById(R.id.et_budget);
        etPeopleCount = findViewById(R.id.et_people_count);
        etDate = findViewById(R.id.et_date);
        etTime = findViewById(R.id.et_time);
        etAddress = findViewById(R.id.et_address);
        ivAddPhoto = findViewById(R.id.iv_add_photo);
        btnPublish = findViewById(R.id.btn_publish);

        // 设置日期选择器
        etDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 实际应用中会显示日期选择器
                etDate.setText("2025-05-28");
            }
        });

        // 设置时间选择器
        etTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 实际应用中会显示时间选择器
                etTime.setText("18:30");
            }
        });

        // 添加图片点击事件
        ivAddPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 实际应用中会打开图片选择器
                Toast.makeText(PublishRequestActivity.this, "选择图片", Toast.LENGTH_SHORT).show();
            }
        });

        // 发布按钮点击事件
        btnPublish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 验证输入
                if (validateInput()) {
                    // 模拟发布成功
                    Toast.makeText(PublishRequestActivity.this, "发布成功", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    }

    private boolean validateInput() {
        if (etDishName.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "请输入菜品名称", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etBudget.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "请输入预算", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etDate.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "请选择日期", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etTime.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "请选择时间", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etAddress.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "请输入地址", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
