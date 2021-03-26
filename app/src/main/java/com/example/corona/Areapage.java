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
            ); //검색 URL부분

            XmlPullParserFactory parserCreator2 = XmlPullParserFactory.newInstance();
            XmlPullParser parser = parserCreator2.newPullParser();

            parser.setInput(url.openStream(), null);

            int parserEvent = parser.getEventType();
            System.out.println("코로나 데이터 가져오는중...");

            while (parserEvent != XmlPullParser.END_DOCUMENT){
                switch(parserEvent){
                    case XmlPullParser.START_TAG://parser가 시작 태그를 만나면 실행

                        if(parser.getName().equals("createDt")){
                            inCreateDt = true;
                        }

                        if(parser.getName().equals("gubun")){
                            inGubun = true;
                        }
                        if(parser.getName().equals("defCnt")){ //mapx 만나면 내용을 받을수 있게 하자
                            inDefCnt = true;
                        }
                        if(parser.getName().equals("incDec")){
                            inIncDec = true;
                        }
                        if(parser.getName().equals("isolClearCnt")){ //mapy 만나면 내용을 받을수 있게 하자
                            inIsolClearCnt = true;
                        }
                        if(parser.getName().equals("isolIngCnt")){ //mapy 만나면 내용을 받을수 있게 하자
                            inIsolIngCnt = true;
                        }
                        if(parser.getName().equals("deathCnt")){
                            inDeathCnt = true;
                        }
                        if(parser.getName().equals("localOccCnt")){
                            inLocalOccCnt = true;
                        }
                        if(parser.getName().equals("overFlowCnt")){ //mapy 만나면 내용을 받을수 있게 하자
                            inOverFlowCnt = true;
                        }
                        if(parser.getName().equals("message")){ //message 태그를 만나면 에러 출력
                            status8.setText(status8.getText()+"에러");
                            //여기에 에러코드에 따라 다른 메세지를 출력하도록 할 수 있다.
                        }
                        break;

                    case XmlPullParser.TEXT://parser가 내용에 접근했을때
                        if(inCreateDt){
                            createDt = parser.getText();
                            inCreateDt = false;
                        }

                        if(inGubun){ //isTitle이 true일 때 태그의 내용을 저장.
                            gubun = parser.getText();
                            inGubun = false;
                        }
                        if(inDefCnt){ //isAddress이 true일 때 태그의 내용을 저장.
                            defCnt = parser.getText();
                            inDefCnt= false;
                        }
                        if(inIncDec){
                            incDec = parser.getText();
                            inIncDec = false;
                        }
                        if(inIsolClearCnt){ //isMapx이 true일 때 태그의 내용을 저장.
                            isolClearCnt = parser.getText();
                            inIsolClearCnt = false;
                        }
                        if(inIsolIngCnt){ //isMapy이 true일 때 태그의 내용을 저장.
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
                        if(inOverFlowCnt){ //isMapy이 true일 때 태그의 내용을 저장.
                            overFlowCnt = parser.getText();
                            inOverFlowCnt = false;
                        }
                        break;
                    case XmlPullParser.END_TAG:
                        if(parser.getName().equals("item")) {
                            if (gubun.equals("전북")) {
                                status8.setText(gubun);
                                status9.setText(defCnt);
                                status10.setText(isolIngCnt);
                                status11.setText(isolClearCnt);
                                status12.setText(deathCnt);
                                status13.setText(overFlowCnt);
                                status14.setText(createDt + " (기준)");
                                initem = false;
                            }
                        }
                        break;
                }
                parserEvent = parser.next();
            }
        } catch(Exception e){
            status8.setText("에러가 발생했습니다.");
            Log.e("error",e + "오류");
        }
        return ;



    }

}
