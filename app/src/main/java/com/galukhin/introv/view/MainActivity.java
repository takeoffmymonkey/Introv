package com.galukhin.introv.view;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.galukhin.introv.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /* --- PAGER --- */
        ViewPager vpPager = findViewById(R.id.vpPager);
        vpPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrolled(int position, float positionOffset,
                                       int positionOffsetPixels) {
            }

            @Override // SCROLL_STATE_IDLE, S_S_DRAGGING, S_S_SETTLING
            public void onPageScrollStateChanged(int state) {
            }
        });

        // Setting Adapter for Pager
        FragmentPagerAdapter adapterViewPager =
                new MyPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);
    }


    /* --- MENU --- */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_item_1:
                return true;
            case R.id.menu_item_2:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
