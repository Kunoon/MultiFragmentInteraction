package com.ccc.test.multifragment.ui;

import com.ccc.test.multifragment.R;
import com.ccc.test.multifragment.impl.ImplEditInfo;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class InfoDisplayFragment extends Fragment implements ImplEditInfo {
	private Activity mActivity;
	
	private FragmentManager fm;
	private FragmentTransaction ft;
	
	private TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;
	
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
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.info_display_fragment, container, false);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		tv1 = (TextView)mActivity.findViewById(R.id.textView_1);
		tv2 = (TextView)mActivity.findViewById(R.id.textView_2);
		tv3 = (TextView)mActivity.findViewById(R.id.textView_3);
		tv4 = (TextView)mActivity.findViewById(R.id.textView_4);
		tv5 = (TextView)mActivity.findViewById(R.id.textView_5);
		tv6 = (TextView)mActivity.findViewById(R.id.textView_6);
		tv7 = (TextView)mActivity.findViewById(R.id.textView_7);
		
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
			fm = mActivity.getFragmentManager();
			ft = fm.beginTransaction();
			
			if(fm.getBackStackEntryCount() > 0){
				ft.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out, android.R.animator.fade_in, android.R.animator.fade_out);
//				mActivity.getFragmentManager().executePendingTransactions();
				fm.popBackStack();
			}
			
			switch(v.getId()){
			case R.id.textView_1:
				ft.replace(R.id.edit_layout, new InfoEditFragment(InfoDisplayFragment.this), "1");
				break;
			case R.id.textView_2:
				ft.replace(R.id.edit_layout, new InfoEditFragment(InfoDisplayFragment.this), "2");
				break;
			case R.id.textView_3:
				ft.replace(R.id.edit_layout, new InfoEditFragment(InfoDisplayFragment.this), "3");
				break;
			case R.id.textView_4:
				ft.replace(R.id.edit_layout, new InfoEditFragment(InfoDisplayFragment.this), "4");
				break;
			case R.id.textView_5:
				ft.replace(R.id.edit_layout, new InfoEditFragment(InfoDisplayFragment.this), "5");
				break;
			case R.id.textView_6:
				ft.replace(R.id.edit_layout, new InfoEditFragment(InfoDisplayFragment.this), "6");
				break;
			case R.id.textView_7:
				ft.replace(R.id.edit_layout, new InfoEditFragment(InfoDisplayFragment.this), "7");
				break;
				default:
					break;
			}
			
			ft.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out, android.R.animator.fade_in, android.R.animator.fade_out);
//			mActivity.getFragmentManager().executePendingTransactions();
			ft.addToBackStack(null);
			ft.commit();
		}
	};

	@Override
	public void editInfo(int tag, String text) {
		switch (tag) {
		case 1:
			tv1.setText(text);
			break;

		case 2:
			tv2.setText(text);
			break;

		case 3:
			tv3.setText(text);
			break;

		case 4:
			tv4.setText(text);
			break;

		case 5:
			tv5.setText(text);
			break;

		case 6:
			tv6.setText(text);
			break;

		case 7:
			tv7.setText(text);
			break;

		default:
			break;
		}
	}
	

}
