package com.example.mashal.fragment_pager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mashal on 2018-02-07.
 */
     public class adabter extends FragmentPagerAdapter {
    private int num_tab = 3;
    private String[] titles= {"First Fragment", "Second Fragment","Third Fragment"};
      public adabter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new firstFragment();
            case 1:
                return new scend_fragment();
            case 2:
                return new three_fragment();
            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return num_tab;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
