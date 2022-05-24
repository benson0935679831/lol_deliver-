package com.example.lol_deliver;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import javax.crypto.SecretKey;

public class ShopkeeperHomepage extends AppCompatActivity {

    BottomNavigationView bnView;
    private SKHomepageFragment skHomepageFragment;
    private SKNowOrderFragment skNowOrderFragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_shopkeeper_homepage);
        getSupportActionBar().hide();

        bnView = findViewById(R.id.nvg_sk);

        fragmentManager = getSupportFragmentManager();
        skHomepageFragment = new SKHomepageFragment();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fcv_sk, skHomepageFragment);
        fragmentTransaction.show(skHomepageFragment);
        fragmentTransaction.commit();

        bnView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Fragment selectedFragment = null;
                int id = item.getItemId();
                switch (id) {
                    case R.id.nav1:
                        selectedFragment = new SKHomepageFragment();
                        break;
                    case R.id.nav2:
                        selectedFragment = new SKNowOrderFragment();
                        break;
                }
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fcv_sk, selectedFragment);
                fragmentTransaction.show(selectedFragment);
                fragmentTransaction.commit();
                return true;
            }
        });
    }
}
