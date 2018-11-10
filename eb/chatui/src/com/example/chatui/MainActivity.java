package com.example.chatui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {
	   ListView m_ListView;
	   CustomAdapter m_Adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	    // Ŀ���� ����� ����
		m_Adapter = new CustomAdapter();

		// Xml���� �߰��� ListView ����
		m_ListView = (ListView) findViewById(R.id.listView1);

		// ListView�� ����� ����
		m_ListView.setAdapter(m_Adapter);
		
		m_Adapter.add("�̰� ����",1);
		m_Adapter.add("����",1);
		m_Adapter.add("��������",0);
		m_Adapter.add("����ְ�",1);
		m_Adapter.add("���ڶ󱸳����� �����մϴ�. ���ع��� ��λ��� ������ �⵵�� ���� ���� �츮 ����",1);
		m_Adapter.add("����ְ�",1);
		m_Adapter.add("����ְ�",0);
		m_Adapter.add("2015/11/20",2);
		m_Adapter.add("����ְ�",1);
		m_Adapter.add("����ְ�",1);
		
		
		findViewById(R.id.button1).setOnClickListener(new Button.OnClickListener() {
				@Override
				public void onClick(View v) {						
					 EditText editText = (EditText) findViewById(R.id.editText1) ;  
					 String inputValue = editText.getText().toString() ;
					 editText.setText("");
					 refresh(inputValue,0); 				 
				}
			}
		);
		

		findViewById(R.id.button2).setOnClickListener(new Button.OnClickListener() {
				@Override
				public void onClick(View v) {						
					 EditText editText = (EditText) findViewById(R.id.editText1) ;  
					 String inputValue = editText.getText().toString() ;
					 editText.setText("");
					 refresh(inputValue,1); 				 
				}
			}
		);
		
	}

	private void refresh (String inputValue, int _str) {  
		m_Adapter.add(inputValue,_str) ;  
		m_Adapter.notifyDataSetChanged();  
	} 
}
