package com.example.intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SubActivity extends Activity implements OnClickListener {
	private TextView text = null;

	private Button btn1=null;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.sub);

    text = (TextView)findViewById(R.id.textView2);
	// インテントを取得
	 Intent intent = getIntent();
	// インテントに保存されたデータを取得
	String data = intent.getStringExtra("keyword");
	text.setText(data);

	Button btn1 = (Button)findViewById(R.id.button3);
	btn1.setOnClickListener(SubActivity.this);
	}
	
	
	@Override
	public void onClick(View v) {
		if (v==btn1){
			finish();
		}
	}
	// TODO Auto-generated method stub
	// サブ画面の終了

}


	