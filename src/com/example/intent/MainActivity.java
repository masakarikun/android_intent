package com.example.intent;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
	private EditText edit = null;
	private Button btn = null;
	private WebView webView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	edit = (EditText)findViewById(R.id.editText1);
	 btn = (Button)findViewById(R.id.button1);
	btn.setOnClickListener(MainActivity.this);
	findViews(); // View�̓ǂݍ���
webView.loadUrl("http:/google.co.jp/"); // �T�C�g�̓ǂݍ���
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (v==btn){
			// TODO Auto-generated method stub
			// �C���e���g�ւ̃C���X�^���X����
			 Intent intent = new Intent(MainActivity.this, SubActivity.class);
			//�@�C���e���g�ɒl���Z�b�g
			intent.putExtra("keyword", edit.getText().toString());
			// �T�u��ʂ̌Ăяo��
			startActivity(intent);	
	}
}
	public void findViews() {
// main.xml��webview��ID���擾���A
// WebViewActivity��WebView�N���X�Ɋ֘A�t����
webView = (WebView) findViewById(R.id.webview);}
}
