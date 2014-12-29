package com.zhufeng.listviewdemo;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class ArrayAdapterActivity extends ListActivity implements
		OnClickListener {

	private Button btn_return;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_array_adapter);
		// 列表项的数据
		String[] strs = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_expandable_list_item_1, strs);
		setListAdapter(adapter);

		btn_return = (Button) findViewById(R.id.btn_return); 
		btn_return.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		ArrayAdapterActivity.this.finish();
	}

}
