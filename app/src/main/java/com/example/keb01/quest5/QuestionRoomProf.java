package com.example.keb01.quest5;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class QuestionRoomProf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_room_prof);
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //시발 이거왜안나와
        if(requestCode == 101 ){
            Toast.makeText(getApplicationContext(),"질문방이 생성되었습니다.",Toast.LENGTH_SHORT).show();
        }
    }
}
