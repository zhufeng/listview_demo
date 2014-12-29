package com.zhufeng.listviewdemo;

import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.Contacts.People;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

public class SimpleCursorAdapterActivity extends ListActivity implements
		OnClickListener {

	private Button btn_return;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple_cursor_adapter);
		// 获得一个指向系统通讯录数据库的Cursor对象获得数据来源
		Cursor cur = getContentResolver().query(People.CONTENT_URI, null, null,
				null, null);
		startManagingCursor(cur);
		// 实例化列表适配器

		ListAdapter adapter = new SimpleCursorAdapter(this,
				android.R.layout.simple_list_item_1, cur,
				new String[] { People.NAME }, new int[] { android.R.id.text1 });
		setListAdapter(adapter);
		btn_return = (Button) findViewById(R.id.btn_return);
		btn_return.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		SimpleCursorAdapterActivity.this.finish();
	}

}
