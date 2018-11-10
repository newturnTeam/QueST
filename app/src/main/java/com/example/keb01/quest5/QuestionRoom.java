package com.example.keb01.quest5;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionRoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_room);
        //액션바 리네임
        getSupportActionBar().setTitle("프로젝트1 질문방");
        //좌석표로 화면전환
        Button button2 = (Button) findViewById(R.id.GoSeatView);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent();
                setResult(Activity.RESULT_OK,intent);
                finish();
            }
        });
    }
}
