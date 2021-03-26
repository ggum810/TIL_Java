package com.example.corona.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.corona.Calender;
import com.example.corona.R;
import com.example.corona.ui.WebViewActivity;
import com.example.corona.ui.WebViewActivity2;
import com.example.corona.ui.WebViewActivity3;
import com.example.corona.ui.WebViewActivity5;
import com.example.corona.ui.WebViewActivity8;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        Button button = root.findViewById(R.id.calender);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Calender.class);
                startActivity(intent);
            }
        });

        Button webbutton2 = root.findViewById(R.id.diagnosis);
        webbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebViewActivity2.class);
                startActivity(intent);
            }
        });

        Button webbutton3 = root.findViewById(R.id.diagnosis2);
        webbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebViewActivity3.class);
                startActivity(intent);
            }
        });

        Button webbuton5 = root.findViewById(R.id.diagnosis4);
        webbuton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebViewActivity5.class);
                startActivity(intent);
            }
        });

        Button webbuton8 = root.findViewById(R.id.diagnosis5);
        webbuton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebViewActivity8.class);
                startActivity(intent);
            }
        });
        return root;
    }
}