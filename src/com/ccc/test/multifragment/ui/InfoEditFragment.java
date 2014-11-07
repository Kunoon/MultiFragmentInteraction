package com.ccc.test.multifragment.ui;

import com.ccc.test.multifragment.R;
import com.ccc.test.multifragment.impl.ImplEditInfo;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class InfoEditFragment extends Fragment {

	private ImplEditInfo iEI;
	
	private TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;
	
	public InfoEditFragment() {
	}
	
	public InfoEditFragment(ImplEditInfo iEI) {
		this.iEI = iEI;
	}
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.info_edit_fragment, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		tv1 = (TextView)InfoEditFragment.this.getView().findViewById(R.id.textView_1);
		tv2 = (TextView)InfoEditFragment.this.getView().findViewById(R.id.textView_2);
		tv3 = (TextView)InfoEditFragment.this.getView().findViewById(R.id.textView_3);
		tv4 = (TextView)InfoEditFragment.this.getView().findViewById(R.id.textView_4);
		tv5 = (TextView)InfoEditFragment.this.getView().findViewById(R.id.textView_5);
		tv6 = (TextView)InfoEditFragment.this.getView().findViewById(R.id.textView_6);
		tv7 = (TextView)InfoEditFragment.this.getView().findViewById(R.id.textView_7);
		
		tv1.setOnClickListener(clickListener);
		tv2.setOnClickListener(clickListener);
		tv3.setOnClickListener(clickListener);
		tv4.setOnClickListener(clickListener);
		tv5.setOnClickListener(clickListener);
		tv6.setOnClickListener(clickListener);
		tv7.setOnClickListener(clickListener);
		
	}
	
	android.view.View.OnClickListener clickListener = new android.view.View.OnClickListener() {

		@Override
		public void onClick(View v) {
			switch(v.getId()){
			case R.id.textView_1:
				iEI.editInfo(Integer.parseInt(InfoEditFragment.this.getTag()), tv1.getText().toString());
				break;
			case R.id.textView_2:
				iEI.editInfo(Integer.parseInt(InfoEditFragment.this.getTag()), tv2.getText().toString());
				break;
			case R.id.textView_3:
				iEI.editInfo(Integer.parseInt(InfoEditFragment.this.getTag()), tv3.getText().toString());
				break;
			case R.id.textView_4:
				iEI.editInfo(Integer.parseInt(InfoEditFragment.this.getTag()), tv4.getText().toString());
				break;
			case R.id.textView_5:
				iEI.editInfo(Integer.parseInt(InfoEditFragment.this.getTag()), tv5.getText().toString());
				break;
			case R.id.textView_6:
				iEI.editInfo(Integer.parseInt(InfoEditFragment.this.getTag()), tv6.getText().toString());
				break;
			case R.id.textView_7:
				iEI.editInfo(Integer.parseInt(InfoEditFragment.this.getTag()), tv7.getText().toString());
				break;
				default:
					break;
			}
		}
	};
	
}
