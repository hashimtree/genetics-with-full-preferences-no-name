package com.shai.my;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextClock;
import android.widget.TextView;

public class ty extends Activity {
TextClock textClock ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);
        
 textClock=(TextClock)findViewById(R.id.textClock);
        TextView resultLabel = (TextView) findViewById(R.id.resultLabel);
        TextView totalScoreLabel = (TextView) findViewById(R.id.totalScoreLabel);
        
        
   ////////
String myPassword=getIntent().getStringExtra("RIGHT_ANSWER_COUN"); 
   ///////     
String nname=getIntent().getStringExtra("RIGHT_ANSWER_COU");   
   /////// 
int score=getIntent().getIntExtra("RIGHT_ANSWER_COUNT",0);
//////////
//////////
//////////
//////////
 SharedPreferences settings = getSharedPreferences("Quizapp", Context.MODE_PRIVATE);

        int totalScore = settings.getInt("totalScore",0);
        totalScore+=score;
        resultLabel.setText(score + "/5  Genetics");
        totalScoreLabel.setText("Total Score :" + totalScore+" - For: "+myPassword+" ... "+nname);

        //update the totalScore
        SharedPreferences.Editor editor =settings.edit();
        editor.putInt("totalScore",totalScore);
        editor.commit();



    }
}
