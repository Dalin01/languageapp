package com.example.darlington.igbohausayoruba;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Darlington on 5/21/2017.
 */

public class SimpleFragmentPageAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "Igbo", "Hausa", "Yoruba" };

    public SimpleFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new IgboFragment();
        }
        else if(position == 1){
            return new HausaFragment();
        }
        else{
            return new YorubaFragment();
        }
    }


    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
