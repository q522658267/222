package com.homecook.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class HomeFragment extends Fragment {

    private RecyclerView rvNearbyCooks;
    private RecyclerView rvPopularRequests;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        
        // 初始化视图
        rvNearbyCooks = view.findViewById(R.id.rv_nearby_cooks);
        rvPopularRequests = view.findViewById(R.id.rv_popular_requests);
        
        // 设置布局管理器
        rvNearbyCooks.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        rvPopularRequests.setLayoutManager(new LinearLayoutManager(getContext()));
        
        // 加载测试数据
        loadTestData();
        
        return view;
    }
    
    private void loadTestData() {
        // 这里应该从API获取数据，现在使用模拟数据
        // 实际应用中会使用适配器加载真实数据
    }
}
