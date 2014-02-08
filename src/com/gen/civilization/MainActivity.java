package com.gen.civilization;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import com.gen.civilization.fragment.RecordFragment_;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

@EActivity(R.layout.activity_main)
public class MainActivity extends FragmentActivity {
	
	private int[] ids = new int[] {
			R.id.fragment1,
			R.id.fragment2,
			R.id.fragment3,
			R.id.fragment4,
			R.id.fragment5,
			R.id.fragment6,
			R.id.fragment7,
			R.id.fragment8,
			R.id.fragment9,
			R.id.fragment10,
			R.id.fragment11,
			R.id.fragment12,
			R.id.fragment13,
			R.id.fragment14,
			R.id.fragment15,
			R.id.fragment16,
	};
	
	@AfterViews
	void afterView () {
		FragmentManager manager = getSupportFragmentManager();
		
		for (int i=0; i<ids.length; i++) {
			int id = ids[i];
			RecordFragment_ fragment = (RecordFragment_)manager.findFragmentById(id);
			if (i%4 == 0) {
				fragment.setTitle("共通");
				fragment.disableHunmer();
			} else {
				fragment.setTitle("都市" + (i % 4));
				fragment.disableCalture();
				fragment.disableCommerce();
			}
		}
	}
	

}
