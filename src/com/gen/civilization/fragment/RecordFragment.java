package com.gen.civilization.fragment;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gen.civilization.R;

@EFragment(R.layout.fragment_record)
public class RecordFragment extends Fragment {
	
	private int calturePower 	= 0;
	private int commercePower 	= 0;
	private int hunmerPower 	= 0;

	@ViewById
	LinearLayout hunmerContainer, commerceContainer, caltureContainer;

	@ViewById
	Button btnAddCalture, btnDecCalture;

	@ViewById
	Button btnAddCommerce, btnDecCommerce;

	@ViewById
	Button btnAddHunmer, btnDecHunmer;

	@ViewById
	TextView textCalture, textCommerce, textHunmer;

	@ViewById
	TextView textTitle;

	@AfterViews
	void afterViews() {
		updateInfo();
	}

	@Click
	void btnAddCalture() {
		calturePower++;
		updateInfo();
	}

	@Click
	void btnDecCalture() {
		if (calturePower <= 0)
			return;
		calturePower--;
		updateInfo();
	}

	@Click
	void btnAddCommerce() {
		commercePower++;
		updateInfo();
	}

	@Click
	void btnDecCommerce() {
		if (commercePower <= 0)
			return;
		commercePower--;
		updateInfo();
	}

	@Click
	void btnAddHunmer() {
		hunmerPower++;
		updateInfo();
	}

	@Click
	void btnDecHunmer() {
		if (hunmerPower <= 0)
			return;
		hunmerPower--;
		updateInfo();
	}

	public void disableCalture() {
		caltureContainer.setVisibility(View.GONE);
	}

	public void disableCommerce() {
		commerceContainer.setVisibility(View.GONE);
	}

	public void disableHunmer() {
		hunmerContainer.setVisibility(View.GONE);
	}

	public void setTitle(String title) {
		textTitle.setText(title);
	}

	private void updateInfo() {
		textCalture.setText("" + calturePower);
		textCommerce.setText("" + commercePower);
		textHunmer.setText("" + hunmerPower);
	}
}
