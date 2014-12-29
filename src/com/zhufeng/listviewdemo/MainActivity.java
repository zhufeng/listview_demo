package com.zhufeng.listviewdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	private Button btnArray, btnSimple, btnSimpleCursor;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		getWidgetInstance();

		btnArray.setOnClickListener(this);
		btnSimple.setOnClickListener(this);
		btnSimpleCursor.setOnClickListener(this);
	}

	public void getWidgetInstance() {
		btnArray = (Button) findViewById(R.id.btnArray);
		btnSimple = (Button) findViewById(R.id.btnSimple);
		btnSimpleCursor = (Button) findViewById(R.id.btnSimpleCursor);
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		switch (id) {
		case R.id.btnArray:
			Intent intent_array = new Intent(MainActivity.this,
					ArrayAdapterActivity.class);
			MainActivity.this.startActivity(intent_array);
			break;
		case R.id.btnSimple:
			Intent intent_simple = new Intent(MainActivity.this,
					SimpleAdapterActivity.class);
			MainActivity.this.startActivity(intent_simple);
			break;
		case R.id.btnSimpleCursor:
			Intent intent_cursor = new Intent(MainActivity.this,
					SimpleCursorAdapterActivity.class);
			MainActivity.this.startActivity(intent_cursor);
			break;
		}
	}
}
