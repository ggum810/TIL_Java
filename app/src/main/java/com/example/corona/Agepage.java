package com.example.corona;


import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;

import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.net.URL;
import java.util.ArrayList;

public class Agepage  extends AppCompatActivity {

    BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agepage);

        barChart  = (BarChart) findViewById(R.id.bargraph);

        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(1058f, 0));
        barEntries.add(new BarEntry(2181f, 1));
        barEntries.add(new BarEntry(6737f, 2));
        barEntries.add(new BarEntry(4604f, 3));
        barEntries.add(new BarEntry(5032f, 4));
        barEntries.add(new BarEntry(6506f, 5));
        barEntries.add(new BarEntry(5415f, 6));
        barEntries.add(new BarEntry(2699f, 7));
        barEntries.add(new BarEntry(1471f, 8));
        BarDataSet barDataSet = new BarDataSet(barEntries,"연령");

        ArrayList<String> theDates = new ArrayList<>();
        theDates.add("10세이하");
        theDates.add("10대");
        theDates.add("20대");
        theDates.add("30대");
        theDates.add("40대");
        theDates.add("50대");
        theDates.add("60대");
        theDates.add("70대");
        theDates.add("80세이상");


        BarData theData = new BarData(theDates,barDataSet);
        barChart.setData(theData);

        barDataSet.setColors(ColorTemplate.JOYFUL_COLORS);


        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setScaleEnabled(true);




        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        StrictMode.enableDefaults();

        TextView status15 = (TextView)findViewById(R.id.result);
        TextView status16 = (TextView)findViewById(R.id.result16);
        TextView status17 = (TextView)findViewById(R.id.result17);
        TextView status18 = (TextView)findViewById(R.id.result18);
        TextView status20 = (TextView)findViewById(R.id.result20);
        TextView status21 = (TextView)findViewById(R.id.result21);
        TextView status22 = (TextView)findViewById(R.id.result22);
        TextView status23 = (TextView)findViewById(R.id.result23);
        TextView status24 = (TextView)findViewById(R.id.result24);
        TextView status25 = (TextView)findViewById(R.id.result25);
        TextView status26 = (TextView)findViewById(R.id.result26);
        TextView status27 = (TextView)findViewById(R.id.result27);
        TextView status28 = (TextView)findViewById(R.id.result28);
        TextView status29 = (TextView)findViewById(R.id.result29);
        TextView status30 = (TextView)findViewById(R.id.result30);
        TextView status31 = (TextView)findViewById(R.id.result31);
        TextView status32 = (TextView)findViewById(R.id.result32);
        TextView status33 = (TextView)findViewById(R.id.result33);
        TextView status34 = (TextView)findViewById(R.id.result34);
        TextView status35 = (TextView)findViewById(R.id.result35);
        TextView status36 = (TextView)findViewById(R.id.result36);
        TextView status37 = (TextView)findViewById(R.id.result37);
        TextView status38 = (TextView)findViewById(R.id.result38);
        TextView status39 = (TextView)findViewById(R.id.result39);
        TextView status40 = (TextView)findViewById(R.id.result40);
        TextView status41 = (TextView)findViewById(R.id.result41);
        TextView status42 = (TextView)findViewById(R.id.result42);
        TextView status43 = (TextView)findViewById(R.id.result43);
        TextView status44 = (TextView)findViewById(R.id.result44);


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
                            if (gubun.equals("0-9")){
                                status17.setText(gubun + "세");
                                status18.setText(confCase + "명");
                                status20.setText(death + "명");
                                status16.setText(createDt + " (기준)");
                                initem = false;
                            }
                        }

                        if(parser.getName().equals("item")) {
                            if (gubun.equals("10-19")) {
                                status21.setText(gubun + "세");
                                status22.setText(confCase + "명");
                                status23.setText(death + "명");
                                status16.setText(createDt + " (기준)");
                                initem = false;
                            }
                        }

                        if(parser.getName().equals("item")) {
                            if (gubun.equals("20-29")) {
                                status24.setText(gubun + "세");
                                status25.setText(confCase + "명");
                                status26.setText(death + "명");
                                status16.setText(createDt + " (기준)");
                                initem = false;
                            }
                        }

                        if(parser.getName().equals("item")) {
                            if (gubun.equals("30-39")) {
                                status27.setText(gubun + "세");
                                status28.setText(confCase + "명");
                                status29.setText(death + "명");
                                status16.setText(createDt + " (기준)");
                                initem = false;
                            }
                        }

                        if(parser.getName().equals("item")) {
                            if (gubun.equals("40-49")) {
                                status30.setText(gubun + "세");
                                status31.setText(confCase + "명");
                                status32.setText(death + "명");
                                status16.setText(createDt + " (기준)");
                                initem = false;
                            }
                        }


                    if(parser.getName().equals("item")) {
                        if (gubun.equals("50-59")) {
                            status33.setText(gubun + "세");
                            status34.setText(confCase + "명");
                            status35.setText(death + "명");
                            status16.setText(createDt + " (기준)");
                            initem = false;
                        }
                    }

                        if(parser.getName().equals("item")) {
                            if (gubun.equals("60-69")) {
                                status36.setText(gubun + "세");
                                status37.setText(confCase + "명");
                                status38.setText(death + "명");
                                status16.setText(createDt + " (기준)");
                                initem = false;
                            }
                        }

                        if(parser.getName().equals("item")) {
                            if (gubun.equals("70-79")) {
                                status39.setText(gubun + "세");
                                status40.setText(confCase + "명");
                                status41.setText(death + "명");
                                status16.setText(createDt + " (기준)");
                                initem = false;
                            }
                        }

                        if(parser.getName().equals("item")) {
                            if (gubun.equals("80 이상")) {
                                status42.setText(gubun );
                                status43.setText(confCase + "명");
                                status44.setText(death + "명");
                                status16.setText(createDt + " (기준)");
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


