package com.example.corona;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.net.URL;

public class Sexpage extends AppCompatActivity {

    BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sexpage);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        TextView status15 = (TextView)findViewById(R.id.result16);
        TextView status45 = (TextView)findViewById(R.id.result45);
        TextView status46 = (TextView)findViewById(R.id.result46);
        TextView status47 = (TextView)findViewById(R.id.result47);
        TextView status48 = (TextView)findViewById(R.id.result48);
        TextView status49 = (TextView)findViewById(R.id.result49);
        TextView status50 = (TextView)findViewById(R.id.result50);
        TextView status51 = (TextView)findViewById(R.id.result51);


        boolean initem = false,
                inConfCase = false,
                inConfCaseRate = false,
                inCreateDt = false,
                inDeath = false,
                inDeathRate = false,
                inGubun = false;

        String  confCase = null,
                confCaseRate = null,
                createDt = null,
                death = null,
                deathRate = null,
                gubun = null;



        try{
            URL url = new URL("http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19GenAgeCaseInfJson?serviceKey="+"Miy866x8hJniihoCnlX31XlfGzojEGwx%2FUWVSibHbztAB1dQdxknOZn0LOBUUsTDUfRejjIk5ac2PlVPo2Kc7g%3D%3D"+"&pageNo=1&numOfRows=10"
            ); //검색 URL부분

            XmlPullParserFactory parserCreator3 = XmlPullParserFactory.newInstance();
            XmlPullParser parser = parserCreator3.newPullParser();

            parser.setInput(url.openStream(), null);

            int parserEvent = parser.getEventType();
            System.out.println("코로나 데이터 가져오는중...");

            while (parserEvent != XmlPullParser.END_DOCUMENT){
                switch(parserEvent){
                    case XmlPullParser.START_TAG://parser가 시작 태그를 만나면 실행

                        if(parser.getName().equals("confCase")){
                            inConfCase = true;
                        }

                        if(parser.getName().equals("confCaseRate")){
                            inConfCaseRate= true;
                        }
                        if(parser.getName().equals("createDt")){ //mapx 만나면 내용을 받을수 있게 하자
                            inCreateDt = true;
                        }
                        if(parser.getName().equals("death")){
                            inDeath = true;
                        }
                        if(parser.getName().equals("deathRate")){ //mapy 만나면 내용을 받을수 있게 하자
                            inDeathRate = true;
                        }
                        if(parser.getName().equals("gubun")){ //mapy 만나면 내용을 받을수 있게 하자
                            inGubun = true;
                        }
                        if(parser.getName().equals("message")){ //message 태그를 만나면 에러 출력
                            status15.setText(status15.getText()+"에러");
                            //여기에 에러코드에 따라 다른 메세지를 출력하도록 할 수 있다.
                        }
                        break;

                    case XmlPullParser.TEXT://parser가 내용에 접근했을때
                        if(inCreateDt){
                            createDt = parser.getText();
                            inCreateDt = false;
                        }

                        if(inConfCase){ //isTitle이 true일 때 태그의 내용을 저장.
                            confCase = parser.getText();
                            inConfCase = false;
                        }
                        if(inConfCaseRate){ //isAddress이 true일 때 태그의 내용을 저장.
                            confCaseRate = parser.getText();
                            inConfCase= false;
                        }
                        if(inDeath){
                            death = parser.getText();
                            inDeath = false;
                        }
                        if(inDeathRate){ //isMapx이 true일 때 태그의 내용을 저장.
                            deathRate = parser.getText();
                            inDeathRate = false;
                        }
                        if(inGubun){ //isMapy이 true일 때 태그의 내용을 저장.
                            gubun = parser.getText();
                            inGubun = false;
                        }
                        break;
                    case XmlPullParser.END_TAG:
                        if(parser.getName().equals("item")) {
                            if (gubun.equals("여성")){
                                status48.setText(gubun);
                                status47.setText(confCase + "명");
                                status46.setText(death + "명");
                                status45.setText(createDt + " (기준)");
                                initem = false;
                            }
                        }

                        if(parser.getName().equals("item")) {
                            if (gubun.equals("남성")){
                                status49.setText(gubun);
                                status50.setText(confCase + "명");
                                status51.setText(death + "명");
                                status45.setText(createDt + " (기준)");
                                initem = false;
                            }
                        }



                        break;

                }
                parserEvent = parser.next();
            }
        } catch(Exception e){
            status15.setText("에러가 발생했습니다.");
            Log.e("error",e + "오류");
        }
        return ;



    }

}