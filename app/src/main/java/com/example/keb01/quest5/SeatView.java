package com.example.keb01.quest5;

import android.content.DialogInterface;
import android.graphics.Color;
import android.nfc.Tag;
import android.os.SystemClock;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class SeatView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seatviewtable);

        //액션바 가리기
        getSupportActionBar().hide();

    }

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
                                //다이얼로그 화면 사라짐
                                getWindow().setBackgroundDrawable(getResources().getDrawable(R.drawable.nfc_image));
                                SystemClock.sleep(1000);
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
