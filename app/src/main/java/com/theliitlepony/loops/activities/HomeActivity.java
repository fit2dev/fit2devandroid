package com.theliitlepony.loops.activities;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;

import com.theliitlepony.loops.R;
import com.theliitlepony.loops.adapters.PagerAdapter;
import com.theliitlepony.loops.fragments.CalendarFragment;
import com.theliitlepony.loops.fragments.InfomationFragment;
import com.theliitlepony.loops.fragments.MapFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends CoreActivity {


    @BindView(R.id.mainViewPager)
    ViewPager mainViewPager;
    @BindView(R.id.mainTabLayout)
    TabLayout mainTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        setupViewPager(mainViewPager);
        mainTabLayout.setupWithViewPager(mainViewPager);
        setupTab();
    }

    private void setupViewPager(ViewPager mainViewPager) {
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new CalendarFragment(), "ปฏิทิน");
        adapter.addFragment(new MapFragment(), "เส้นทาง");
        adapter.addFragment(new InfomationFragment(), "ข้อมูลส่วนตัว");
        mainViewPager.setAdapter(adapter);
    }

    private void setupTab() {
        mainTabLayout.getTabAt(0).setText("ปฏิทิน").setIcon(R.drawable.icons_calendar);
        mainTabLayout.getTabAt(1).setText("เส้นทาง").setIcon(R.drawable.ic_map_black_36dp);
        mainTabLayout.getTabAt(2).setText("ข้อมูลส่วนตัว").setIcon(R.drawable.ic_account_circle_black_36dp);
//        mainTabLayout.getTabAt(0).getIcon().setColorFilter(Color.parseColor("#5e5e5e"), PorterDuff.Mode.SRC_IN);
//        mainTabLayout.getTabAt(1).getIcon().setColorFilter(Color.parseColor("#5e5e5e"), PorterDuff.Mode.SRC_IN);
//        mainTabLayout.getTabAt(2).getIcon().setColorFilter(Color.parseColor("#5e5e5e"), PorterDuff.Mode.SRC_IN);
    }
}
