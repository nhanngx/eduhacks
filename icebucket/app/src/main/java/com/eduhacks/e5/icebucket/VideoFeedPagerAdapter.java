package com.eduhacks.e5.icebucket;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by nhanngx on 30-Sep-17.
 */

public class VideoFeedPagerAdapter extends FragmentStatePagerAdapter {

    public VideoFeedPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new VideoItemFragment();
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
