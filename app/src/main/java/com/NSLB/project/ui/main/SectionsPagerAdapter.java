package com.NSLB.project.ui.main;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.NSLB.project.board.RecentBoardFragment;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
    public Cafe mCafe = null;
    public User mUser=null;
    public Board mBoard=null;


    public SectionsPagerAdapter(Context context , FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return mCafe = new Cafe();
            case 1:
                return mUser=new User();
            case 2:
                return mBoard= new RecentBoardFragment() ;
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}