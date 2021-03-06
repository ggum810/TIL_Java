package com.example.corona;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.corona.ui.Gwangjupage;
import com.example.corona.ui.WebViewActivity;
import com.example.corona.ui.WebViewActivity7;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.net.URL;

public class Areapage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.areapage);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Button seoul = findViewById(R.id.seoulbutton);
        seoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Seoulpage.class);
                startActivity(intent);
            }
        });

        Button inchun = findViewById(R.id.inchunbutton);
        inchun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Inchunpage.class);
                startActivity(intent);
            }
        });

        Button busan = findViewById(R.id.busanbutton);
        busan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Buasnpage.class);
                startActivity(intent);
            }
        });

        Button ulsan = findViewById(R.id.ulsanbutton);
        ulsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Ulsanpage.class);
                startActivity(intent);
            }
        });

        Button daegu = findViewById(R.id.daegubutton);
        daegu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Daegupage.class);
                startActivity(intent);
            }
        });

        Button gwangju = findViewById(R.id.gwangjubutton);
        gwangju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Gwangjupage.class);
                startActivity(intent);
            }
        });

        Button daejun = findViewById(R.id.daejunbutton);
        daejun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Daejunpage.class);
                startActivity(intent);
            }
        });

        Button saejong = findViewById(R.id.saejongbutton);
        saejong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Saejongpage.class);
                startActivity(intent);
            }
        });

        Button  gyeonggi = findViewById(R.id.gyeonggibutton);
        gyeonggi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Gyeonggipage.class);
                startActivity(intent);
            }
        });

        Button  gangwon = findViewById(R.id.gangwonbutton);
        gangwon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Gangwonpage.class);
                startActivity(intent);
            }
        });

        Button  chungbuk = findViewById(R.id.chungbukbutton);
        chungbuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Chungbukpage.class);
                startActivity(intent);
            }
        });

        Button  chungnam = findViewById(R.id.chungnambutton);
        chungnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Chungnampage.class);
                startActivity(intent);
            }
        });

        Button  junnam = findViewById(R.id.junnambutton);
        junnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Junnampage.class);
                startActivity(intent);
            }
        });

        Button  gyeongbuk = findViewById(R.id.gyeonbukbutton);
        gyeongbuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Gyeonbukpage.class);
                startActivity(intent);
            }
        });

        Button  gyeongnam = findViewById(R.id.gyeongnambutton);
        gyeongnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Gyeongnampage.class);
                startActivity(intent);
            }
        });

        Button  jeju = findViewById(R.id.jejubutton);
        jeju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Jejupage.class);
                startActivity(intent);
            }
        });

        Button  gum = findViewById(R.id.gumbutton);
        gum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Gumpage.class);
                startActivity(intent);
            }
        });

        Button webbutton7 = findViewById(R.id.junbukgohome);
        webbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebViewActivity7.class);
                startActivity(intent);
            }
        });

        StrictMode.enableDefaults();

        TextView status8 = (TextView)findViewById(R.id.result8);
        TextView status9 = (TextView)findViewById(R.id.result9);
        TextView status10 = (TextView)findViewById(R.id.result10);
        TextView status11 = (TextView)findViewById(R.id.result11);
        TextView status12 = (TextView)findViewById(R.id.result12);
        TextView status13 = (TextView)findViewById(R.id.result13);
        TextView status14 = (TextView)findViewById(R.id.result14);

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

            XmlPullParserFactory parserCreator2 = XmlPullParserFactory.newInstance();
            XmlPullParser parser = parserCreator2.newPullParser();

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
                            status8.setText(status8.getText()+"??????");
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
                                status8.setText(gubun);
                                status9.setText(defCnt);
                                status10.setText(isolIngCnt);
                                status11.setText(isolClearCnt);
                                status12.setText(deathCnt);
                                status13.setText(overFlowCnt);
                                status14.setText(createDt + " (??????)");
                                initem = false;
                            }
                        }
                        break;
                }
                parserEvent = parser.next();
            }
        } catch(Exception e){
            status8.setText("????????? ??????????????????.");
            Log.e("error",e + "??????");
        }
        return ;



    }

}
