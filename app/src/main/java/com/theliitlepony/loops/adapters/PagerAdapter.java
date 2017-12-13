package com.theliitlepony.loops.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Choccochip on 26/9/2560.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> tablist = new ArrayList<>();
    private List<String> tabtitlelist = new ArrayList<>();

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return tablist.get(position);
    }

    @Override
    public int getCount() {
        return tablist.size();
    }

    public void addFragment(Fragment fragment, String title) {
        tablist.add(fragment);
        tabtitlelist.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitlelist.get(position);
    }
}
