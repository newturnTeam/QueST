package com.example.keb01.quest5;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SeatView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seatviewtableforstu);

        //액션바 리네임
        getSupportActionBar().setTitle("팀 프로젝트1");
        //질문방으로 화면전환
        Button button = (Button) findViewById(R.id.questionroom);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),QuestionRoom.class);
                startActivityForResult(intent,101);
            }
        });
    }

    //ImageView imageView = (Imageview)findViewById(R.id.all)
    public void onClickButton1(View v) {
        switch (v.getId()) {
            case R.id.좌석1:
                new android.app.AlertDialog.Builder(this)
                        .setMessage("1번 자리에 앉으시겠습니까?")
                        //positive 클릭
                        .setPositiveButton("예", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                
                                Toast.makeText(SeatView.this, "1번 자리 앉기에 성공하였습니다.", Toast.LENGTH_SHORT).show();

                                //nfc 태그기능 추가 전 임시 sleep
                                SystemClock.sleep(1000);
                                //다이얼로그 화면 사라짐
                                dialog.dismiss();
                            }
                        })
                        .setNeutralButton("아니오", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {

                            }
                        })
                        .show(); // 팝업창 보여줌
                break;
        }
    }



}
