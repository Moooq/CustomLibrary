package com.mooq.customlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		FlowLayout flTest = (FlowLayout) findViewById(R.id.fl_test);
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 10; i++){
			list.add("item"+i);
		}
		flTest.setData(list);
	}
}
