package com.ccc.test.multifragment.ui;

import com.ccc.test.multifragment.adapter.ContentsFragment_Adapter;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class ContentsFragment extends ListFragment {
	Activity mActivity;
	
	private ContentsFragment_Adapter cFAdapter;
	private String[] values = {"购车意向", "跟踪记录", "回访计划", "试乘试驾", "报价合同", "购车记录"};
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		this.mActivity = activity;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		//listview赋值
		cFAdapter = new ContentsFragment_Adapter(mActivity, values);
		setListAdapter(cFAdapter);
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		Toast.makeText(mActivity, values[position], Toast.LENGTH_SHORT).show();
	}
	
}
