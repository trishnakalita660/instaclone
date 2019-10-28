package com.example.tryclone.Main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;



import com.example.tryclone.R;
import com.example.tryclone.Utils.BottomNvigationViewHelper;
import com.google.android.material.tabs.TabLayout;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private static final int ACTIVITY_NUMBER=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate:Starting");
        setupBottomNavigationView();
        setupViewPager();

    }
    private void setupViewPager(){
        SectionsPagerAdapter adapter= new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new CameraFragment());
        adapter.addFragment(new HomeFragment());
        adapter.addFragment(new MessagesFragment());
        ViewPager viewPager= (ViewPager)findViewById(R.id.container);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout= (TabLayout)findViewById(R.id.tabs);
       tabLayout.setupWithViewPager(viewPager);
       tabLayout.getTabAt(0).setIcon(R.drawable.ic_camera);
       tabLayout.getTabAt(1).setIcon(R.drawable.insta);
       tabLayout.getTabAt(2).setIcon(R.drawable.ic_arrow);

    }



    private void setupBottomNavigationView(){
    Log.d(TAG," setupBottomNavigationView:seting up BottomNavigationView");
        BottomNavigationViewEx bottomNavigationViewEx=(BottomNavigationViewEx)findViewById(R.id.bottomNavViewBar);
        BottomNvigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNvigationViewHelper.enableNavigation(MainActivity.this,bottomNavigationViewEx);

        Menu menu= bottomNavigationViewEx.getMenu();
        MenuItem menuItem=menu.getItem(ACTIVITY_NUMBER);
        menuItem.setChecked(true);
    }
}
