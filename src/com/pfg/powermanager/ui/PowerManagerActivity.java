package com.pfg.powermanager.ui;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.pfg.powermanager.R;

public class PowerManagerActivity extends Activity {

	TabsAdapter mTabsAdapter;
	private ActionBar mActionBar;
	private Tab mBatteryInfoTab;
	private Tab mPowerMannagerTab;
	private ViewPager mViewpager;
	
	public static final int BATTERY_INFO_INDEX = 0;
	public static final int POWER_MANAGER_INDEX = 1;
	
	private int mSelectedTab;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		mSelectedTab = BATTERY_INFO_INDEX;
	}

	private void initViews()
	{
		if(mTabsAdapter == null)
		{
			mTabsAdapter = new TabsAdapter(this, mViewpager);
			mViewpager = new ViewPager(this);
			mViewpager.setId(R.id.power_manager);
			mViewpager.setBackgroundColor(R.drawable.backgroud);
		}
		this.setContentView(mViewpager);
	}
	
	private void createTabs(int index)
	{
		mActionBar = getActionBar();
		if(mActionBar != null)
		{
			mActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		}
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}

	private class TabsAdapter extends FragmentPagerAdapter implements ActionBar.TabListener,ViewPager.OnPageChangeListener
	{

		private ActionBar mMainActionBar;
		private ViewPager mPager;
		private Context context;
		
		public TabsAdapter(Activity activity, ViewPager viewpager) {
			super(activity.getFragmentManager());
			mPager = viewpager;
			context = activity;
			mMainActionBar = activity.getActionBar();
			mPager.setAdapter(this);
			mPager.setOnPageChangeListener(this);
		}

		@Override
		public void onPageScrollStateChanged(int arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onPageSelected(int arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTabReselected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTabSelected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTabUnselected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Fragment getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void destroyItem(View arg0, int arg1, Object arg2) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void finishUpdate(View arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Object instantiateItem(View arg0, int arg1) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void startUpdate(View arg0) {
			// TODO Auto-generated method stub
			
		}

		
		
	}
	
}
