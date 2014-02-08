package com.gen.civilization.fragment;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;

import android.support.v4.app.Fragment;

import com.gen.civilization.R;

@EFragment(R.layout.fragment_record_holder)
public class RecordHolderFragment extends Fragment {
	
	public static final String TITLE = "title";
	
	@FragmentArg(value=TITLE)
	String title = "";
	
	@AfterViews
	void afterViews () {
		getChildFragmentManager().beginTransaction()
			.add(getId(), new RecordFragment_())
			.commit();
			
	}
	
	public String getTitle () {
		return title;
	}

}
