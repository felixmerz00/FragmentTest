package com.example.fragmenttest;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * Provides the appropriate Fragment for a view pager.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if( position == 0){
            return new FragmentOne();
        }else if(position == 1){
            return new FragmentTwo();
        }else {
            return new FragmentThree();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return mContext.getString(R.string.titleFragment1);
        }else if(position == 1 ){
            return mContext.getString(R.string.titleFragment2);
        }else {
            return mContext.getString(R.string.titleFragment3);
        }

    }
}
