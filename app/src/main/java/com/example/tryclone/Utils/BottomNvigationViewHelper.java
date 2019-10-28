package com.example.tryclone.Utils;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.example.tryclone.Likes.LikesActivity;
import com.example.tryclone.Main.MainActivity;
import com.example.tryclone.Profile.ProfileActivity;
import com.example.tryclone.R;
import com.example.tryclone.Search.SearchActivity;
import com.example.tryclone.Share.ShareActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;


public class BottomNvigationViewHelper {
    private static final String TAG = "BottomNvigationViewHelp";

    public  static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG,"setupBottomNavigationView:setting up");
        bottomNavigationViewEx.enableAnimation(true);
        bottomNavigationViewEx.enableItemShiftingMode(true);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);




    }
    public static void enableNavigation(final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){
                    case R.id.ic_home:
                        Intent intent1= new Intent(context, MainActivity.class);
                        context.startActivity(intent1);
                          break;
                    case R.id.ic_search:

                        Intent intent2= new Intent(context, SearchActivity.class);
                        context.startActivity(intent2);
                          break;
                    case R.id.ic_circle:
                        Intent intent3= new Intent(context, ShareActivity.class);
                        context.startActivity(intent3);
                        break;
                    case R.id.ic_alert:
                        Intent intent4= new Intent(context, LikesActivity.class);
                        context.startActivity(intent4);
                        break;
                    case R.id.ic_android:
                        Intent intent5= new Intent(context, ProfileActivity.class);
                        context.startActivity(intent5);
                        break;


                }






                return false;
            }
        });
    }

}
