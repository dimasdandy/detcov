package com.example.detcov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {

    ChipNavigationBar bottom_nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottom_nav = findViewById(R.id.bottom_nav);

        if(savedInstanceState == null){
            bottom_nav.setItemSelected(R.id.nav_home, true);
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragment_home home = new fragment_home();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, home)
                    .commit();
            
        }

    bottom_nav.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
        @Override
        public void onItemSelected(int id) {
            Fragment fragment = null;
            switch (id){
                case R.id.nav_home:
                    fragment = new fragment_home();
                    break;
                case R.id.nav_stats:
                    fragment = new fragment_stats();
                    break;
                case R.id.nav_about:
                    fragment = new fragment_about();
                    break;
            }

            if(fragment != null){
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
            }else{
                finish();
            }
        }
    });
    }
}
