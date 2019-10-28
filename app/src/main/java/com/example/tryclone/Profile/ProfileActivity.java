package com.example.tryclone.Profile;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.tryclone.R;
import com.example.tryclone.Utils.BottomNvigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class ProfileActivity extends AppCompatActivity {

    private static final String TAG = "ShareActivity";
    private static final int ACTIVITY_NUMBER=4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
      setupBottomNavigationView();
        setupToolBar();
    }
    private  void setupToolBar(){
     Toolbar toolbar =(Toolbar)findViewById(R.id.profileToolBar);
        setSupportActionBar(toolbar);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {

                Log.d(TAG, "onMenuItemClick: clicked menu item" + menuItem);

                switch (menuItem.getItemId()){
                    case  R.id.profileMenu:
                    Log.d(TAG, "onMenuItemClick: Navigating to Profile ");
                }

                return false;
            }
        });
    }
    private void setupBottomNavigationView(){
        Log.d(TAG," setupBottomNavigationView:seting up BottomNavigationView");

        BottomNavigationViewEx bottomNavigationViewEx=(BottomNavigationViewEx)findViewById(R.id.bottomNavViewBar);
        BottomNvigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNvigationViewHelper.enableNavigation(ProfileActivity.this,bottomNavigationViewEx);
        Menu menu= bottomNavigationViewEx.getMenu();
        MenuItem menuItem=menu.getItem(ACTIVITY_NUMBER);
        menuItem.setChecked(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile_menu,menu);
        return true;
    }
}

