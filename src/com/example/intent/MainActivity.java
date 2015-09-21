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
	findViews(); // Viewの読み込み
webView.loadUrl("http:/google.co.jp/"); // サイトの読み込み
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (v==btn){
			// TODO Auto-generated method stub
			// インテントへのインスタンス生成
			 Intent intent = new Intent(MainActivity.this, SubActivity.class);
			//　インテントに値をセット
			intent.putExtra("keyword", edit.getText().toString());
			// サブ画面の呼び出し
			startActivity(intent);	
	}
}
	public void findViews() {
// main.xmlのwebviewのIDを取得し、
// WebViewActivityのWebViewクラスに関連付ける
webView = (WebView) findViewById(R.id.webview);}
}
