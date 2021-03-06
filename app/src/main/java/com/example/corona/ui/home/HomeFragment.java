package com.example.corona.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.TextView;

import org.w3c.dom.Text;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import java.net.URL;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.corona.Agepage;
import com.example.corona.Areapage;
import com.example.corona.CovidSy;
import com.example.corona.R;
import com.example.corona.Sexpage;
import com.example.corona.ui.WebViewActivity4;
import com.example.corona.ui.WebViewActivity6;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);



        Button button2 = root.findViewById(R.id.areabutton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Areapage.class);
                startActivity(intent);
            }
        });

        Button agebutton = root.findViewById(R.id.agebutton);
        agebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Agepage.class);
                startActivity(intent);
            }
        });

        Button sexbutton = root.findViewById(R.id.sexbutton);
        sexbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sexpage.class);
                startActivity(intent);
            }
        });

        Button webbuton6 = root.findViewById(R.id.webView6);
        webbuton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebViewActivity6.class);
                startActivity(intent);
            }
        });

        Button button = root.findViewById(R.id.sym2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CovidSy.class);
                startActivity(intent);
            }
        });

        Button webbutton4 = root.findViewById(R.id.sym3);
        webbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebViewActivity4.class);
                startActivity(intent);
            }
        });




        StrictMode.enableDefaults();

        TextView status  = (TextView)root.findViewById(R.id.result0);
        TextView status1 = (TextView)root.findViewById(R.id.result2); //????????? ????????????!
        TextView status2 = (TextView)root.findViewById(R.id.lists1); //list1 ???????????? ????????? ??????
        TextView status3 = (TextView)root.findViewById(R.id.result3);
        TextView status4 = (TextView)root.findViewById(R.id.result4);
        TextView status5 = (TextView)root.findViewById(R.id.result5);
        TextView status6 = (TextView)root.findViewById(R.id.result6);
        TextView status7 = (TextView)root.findViewById(R.id.result7);


        boolean initem = false,
                inCreateDt = false,
                inGubun = false,
                inDefCnt = false,
                inIsolClearCnt = false,
                inIsolIngCnt = false,
                inDeathCnt = false,
                inLocalOccCnt = false,
                inIncDec = false;
        boolean inOverFlowCnt = false;


        String  createDt = null,
                gubun = null,
                defCnt = null,
                incDec = null,
                isolClearCnt = null,
                isolIngCnt = null,
                localOccCnt = null,
                deathCnt = null,
                overFlowCnt = null;


        try{
            URL url = new URL("http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19SidoInfStateJson?serviceKey="+"Miy866x8hJniihoCnlX31XlfGzojEGwx%2FUWVSibHbztAB1dQdxknOZn0LOBUUsTDUfRejjIk5ac2PlVPo2Kc7g%3D%3D"+"&pageNo=1&numOfRows=10"
            ); //?????? URL??????

            XmlPullParserFactory parserCreator = XmlPullParserFactory.newInstance();
            XmlPullParser parser = parserCreator.newPullParser();

            parser.setInput(url.openStream(), null);

            int parserEvent = parser.getEventType();
            System.out.println("????????? ????????? ???????????????...");

            while (parserEvent != XmlPullParser.END_DOCUMENT){
                switch(parserEvent){
                    case XmlPullParser.START_TAG://parser??? ?????? ????????? ????????? ??????

                        if(parser.getName().equals("createDt")){
                            inCreateDt = true;
                        }

                        if(parser.getName().equals("gubun")){
                            inGubun = true;
                        }
                        if(parser.getName().equals("defCnt")){ //mapx ????????? ????????? ????????? ?????? ??????
                            inDefCnt = true;
                        }
                        if(parser.getName().equals("incDec")){
                            inIncDec = true;
                        }
                        if(parser.getName().equals("isolClearCnt")){ //mapy ????????? ????????? ????????? ?????? ??????
                            inIsolClearCnt = true;
                        }
                        if(parser.getName().equals("isolIngCnt")){ //mapy ????????? ????????? ????????? ?????? ??????
                            inIsolIngCnt = true;
                        }
                        if(parser.getName().equals("deathCnt")){
                            inDeathCnt = true;
                        }
                        if(parser.getName().equals("localOccCnt")){
                            inLocalOccCnt = true;
                        }
                        if(parser.getName().equals("overFlowCnt")){ //mapy ????????? ????????? ????????? ?????? ??????
                            inOverFlowCnt = true;
                        }
                        if(parser.getName().equals("message")){ //message ????????? ????????? ?????? ??????
                            status1.setText(status1.getText()+"??????");
                            //????????? ??????????????? ?????? ?????? ???????????? ??????????????? ??? ??? ??????.
                        }
                        break;

                    case XmlPullParser.TEXT://parser??? ????????? ???????????????

                        if(inCreateDt){
                            createDt = parser.getText();
                            inCreateDt = false;
                        }
                        if(inGubun){ //isTitle??? true??? ??? ????????? ????????? ??????.
                            gubun = parser.getText();
                            inGubun = false;
                        }
                        if(inDefCnt){ //isAddress??? true??? ??? ????????? ????????? ??????.
                            defCnt = parser.getText();
                            inDefCnt= false;
                        }
                        if(inIncDec){
                            incDec = parser.getText();
                            inIncDec = false;
                        }
                        if(inIsolClearCnt){ //isMapx??? true??? ??? ????????? ????????? ??????.
                            isolClearCnt = parser.getText();
                            inIsolClearCnt = false;
                        }
                        if(inIsolIngCnt){ //isMapy??? true??? ??? ????????? ????????? ??????.
                            isolIngCnt = parser.getText();
                            inIsolIngCnt = false;
                        }
                        if(inDeathCnt){
                            deathCnt = parser.getText();
                            inDeathCnt = false;
                        }
                        if(inLocalOccCnt){
                            localOccCnt = parser.getText();
                            inLocalOccCnt = false;
                        }
                        if(inOverFlowCnt){ //isMapy??? true??? ??? ????????? ????????? ??????.
                            overFlowCnt = parser.getText();
                            inOverFlowCnt = false;
                        }
                        break;
                    case XmlPullParser.END_TAG:
                        if(parser.getName().equals("item")) {
                            if (gubun.equals("??????")) {
                                status.setText(createDt + "  (??????)");
                                status1.setText(defCnt);
                                status2.setText(incDec + "???");
                                status3.setText(isolIngCnt);
                                status4.setText(isolClearCnt);
                                status5.setText(deathCnt);
                                status6.setText(" "+localOccCnt + "???");
                                status7.setText(" "+overFlowCnt + "???");
                                initem = false;
                            }

                        }
                        break;
                }
                parserEvent = parser.next();
            }
        } catch(Exception e){
            status1.setText("????????? ??????????????????.");
            Log.e("error",e + "??????");

        }
        return root;
    }


}