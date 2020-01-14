package com.NSLB.project;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;

import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.NSLB.project.ui.main.SectionsPagerAdapter;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends BaseActivity {
    private FragmentPagerAdapter mPagerAdapter;
    private ViewPager mViewPager;
    private static final String TAG = "MainActivity";
    private static final Boolean CHECK_IF_VERIFIED = false;
    private int[] tabIcons={
            R.drawable.ic_pets_black_24dp,
            R.drawable.ic_message_black_24dp,
            R.drawable.ic_person_black_24dp
            };
    private Context mContext = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this , getSupportFragmentManager());

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        for (int i = 0; i < sectionsPagerAdapter.getCount(); i++)
        {
            tabs.getTabAt(i).setIcon(tabIcons[i]);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int i = item.getItemId();
        if(i == R.id.action_logout){
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(this, SignInActivity.class));
            finish();
            return true;
        }else {
            return super.onOptionsItemSelected(item);
        }
    }
}