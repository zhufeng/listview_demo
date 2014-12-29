package com.zhufeng.listviewdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SimpleAdapter;

public class SimpleAdapterActivity extends ListActivity implements
		OnClickListener {

	private Button btn_return;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_array_adapter);

		SimpleAdapter adapter = new SimpleAdapter(this, getData(),
				R.layout.activity_simple_adapter,
				new String[] { "title", "img" }, new int[] { R.id.title,
						R.id.img });
		setListAdapter(adapter);

		btn_return = (Button) findViewById(R.id.btn_return);
		btn_return.setOnClickListener(this);

	}

	private List<Map<String, Object>> getData() {
		// map.put(参数名字,参数值)
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", "摩托罗拉");
		map.put("img", R.drawable.ic_launcher);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "诺基亚");
		map.put("img", R.drawable.ic_launcher);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "三星");
		map.put("img", R.drawable.ic_launcher);
		list.add(map);
		return list;
	}

	public void onClick(View v) {
		SimpleAdapterActivity.this.finish();
	}

}
