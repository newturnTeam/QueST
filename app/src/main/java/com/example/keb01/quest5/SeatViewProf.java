package com.example.keb01.quest5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeatViewProf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_view_prof);
        //액션바 가리기
        getSupportActionBar().hide();
        //질문방으로 화면전환
        Button button = (Button) findViewById(R.id.questionroom);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),QuestionRoomProf.class);
                startActivityForResult(intent,101);
            }
        });
    }
}
