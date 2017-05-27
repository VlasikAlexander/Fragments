package com.jb.project.andfile.fragments;

import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;


import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    Fragment mainFragment = new MainFragment();
    Fragment secondFragment = new SecondFragment();
    Fragment fullInformationFragment = new FullInformationFragment();
    FragmentManager fm = getSupportFragmentManager();
    GoogleMap mMap;
    Toolbar mToolbar;
    DrawerLayout mDrawerLayout;

    BottomSheetBehavior mBottomSheetBehavior;
    NestedScrollView bottomSheet;



    private SearchView mSearchView;
    private MenuItem searchMenuItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        fm.beginTransaction().add(R.id.container, mainFragment).commit();

         mToolbar = (Toolbar)findViewById(R.id.myCustomToolbar);
        setSupportActionBar(mToolbar);

        bottomSheet = (NestedScrollView)findViewById(R.id.bottom_sheet);
        mBottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);

       // mBottomSheetBehavior.setPeekHeight(0);








        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        
    }

    SearchView.OnQueryTextListener listener = new SearchView.OnQueryTextListener() {
        @Override
        public boolean onQueryTextSubmit(String query) {
            return false;
        }

        @Override
        public boolean onQueryTextChange(String newText) {
            // newText is text entered by user to SearchView
            Toast.makeText(getApplicationContext(), newText, Toast.LENGTH_LONG).show();
            return false;
        }
    };

    public void changeFragment(View view) {

//            switch (view.getId()) {
//                case R.id.change_button_mf: fm.beginTransaction().replace(R.id.container, fullInformationFragment).commit();
//                    break;
//                case R.id.change_button_sf: fm.beginTransaction().replace(R.id.container, mainFragment).commit();
//                    break;
//                default: { fm.beginTransaction().replace(R.id.container, secondFragment).commit();
//                        mToolbar.setBackgroundColor(getResources().getColor(R.color.Transparent)); }
//                    break;
//
//            }





    }




        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu, menu);
            searchMenuItem = menu.findItem(R.id.action_search);
            mSearchView = (SearchView) searchMenuItem.getActionView();
            mSearchView.setOnQueryTextListener(listener);
            return true;
        }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

    }

