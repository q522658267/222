package com.homecook.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        
        // 初始化视图和设置点击事件
        initViews(view);
        
        return view;
    }
    
    private void initViews(View view) {
        // 设置编辑资料按钮点击事件
        view.findViewById(R.id.btn_edit_profile).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 实际应用中会跳转到编辑资料页面
            }
        });
        
        // 设置查看全部订单按钮点击事件
        view.findViewById(R.id.btn_view_all_orders).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 实际应用中会跳转到订单列表页面
            }
        });
        
        // 设置退出登录按钮点击事件
        view.findViewById(R.id.btn_logout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 退出登录并返回登录页面
                getActivity().finish();
            }
        });
    }
}
