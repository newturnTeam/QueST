package com.example.kandl.myapplication;

import android.app.LauncherActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       /* listview = new ArrayList<>();

        String json = null;

        try{
            InputStream is = getAssets().open("timeline.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");

            JSONObject jsonObject = new JSONObject(json);
            JSONArray item = new jsonObject.getJSONArray();

            for(int i=0;i<array.length();i++){

                JSONObject o = array.getJSONObjeect(i);
                LauncherActivity.ListItem item = new LauncherActivity.ListItem(
                        o.getString("title"),
                        o.getString("desc")
                );
            }

        }

        catch(Exception e){
            e.printStackTrace();
        }*/

    }

}
