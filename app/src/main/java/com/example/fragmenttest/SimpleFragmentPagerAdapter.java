package com.example.fragmenttest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * Provides the appropriate Fragment for a view pager.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
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

}
