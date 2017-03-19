package com.example.izajul.weatherpro.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;


public class FragmentPageAdapter extends FragmentPagerAdapter {
    private final List<Fragment> mFragmentList = new ArrayList<>();

    public FragmentPageAdapter(FragmentManager fm) {super(fm);}
    @Override
    public Fragment getItem(int position) {return mFragmentList.get(position);}
    @Override
    public int getCount() {return mFragmentList.size();}
    public void addFreagment(Fragment fragment){mFragmentList.add(fragment);}
}
