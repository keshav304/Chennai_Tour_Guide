package com.example.chennaitourguide;

import android.content.Context;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentStatePagerAdapter {
    private Context mContext;
    SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // This determines the fragment for each tab
    @Override
    public Fragment getItem(int position) {
        if(position == 0)
            return new HistoryFragment();
        else if(position == 1)
            return new BeachFragment();
        else if(position == 2)
            return new MallsFragment();
        else
            return new FoodFragment();
    }

    // This determines the number of tabs
    @Override
    public int getCount() {
        return 4;
    }

    // This determines the title for each tab
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return mContext.getString(R.string.title_history);
            case 1:
                return mContext.getString(R.string.title_attraction);
            case 2:
                return mContext.getString(R.string.title_haveli);
            case 3:
                return mContext.getString(R.string.title_street_food);
            default:
                return null;
        }
    }

}
