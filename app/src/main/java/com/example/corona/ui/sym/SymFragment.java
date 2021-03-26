package com.example.corona.ui.sym;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.corona.CovidSy;
import com.example.corona.R;
import com.example.corona.ui.WebViewActivity4;
import com.example.corona.ui.WebViewActivity9;


public class SymFragment extends Fragment {


    private SymViewModel symViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        symViewModel =
                ViewModelProviders.of(this).get(SymViewModel.class);
        View root = inflater.inflate(R.layout.fragment_sym, container, false);

//        Button button = root.findViewById(R.id.sym2);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getActivity(), CovidSy.class);
//                startActivity(intent);
//            }
//        });
//
//
        Button webbutton4 = root.findViewById(R.id.sym6);
        webbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebViewActivity9.class);
                startActivity(intent);
            }
        });
        return root;
    }
}