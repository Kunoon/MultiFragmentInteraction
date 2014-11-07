package com.ccc.test.multifragment.adapter;

import com.ccc.test.multifragment.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ContentsFragment_Adapter extends BaseAdapter {
	private Context mContext;
	private String[] values;
	
	public ContentsFragment_Adapter(Context mContext, String[] values) {
		this.mContext = mContext;
		this.values = values;
	}

	@Override
	public int getCount() {
		return values.length;
	}

	@Override
	public Object getItem(int position) {
		return values[position];
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(convertView == null)
			convertView = LayoutInflater.from(mContext).inflate(R.layout.contents_fragment_detail, null);
		((TextView)convertView.findViewById(R.id.textView1)).setText(values[position]);
		
		return convertView;
	}

}
