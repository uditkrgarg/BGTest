package com.example.gargud.bgtest;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;


public class MainActivity extends Activity {

    private int imageArray[] = { R.drawable.antartica1, R.drawable.antartica2,
            R.drawable.antartica3, R.drawable.antartica4,
            R.drawable.antartica5 };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPagerAdapter adapter = new ViewPagerAdapter(this, imageArray);
        ViewPager myPager = (ViewPager) findViewById(R.id.vp_my_image_holder);
        myPager.setAdapter(adapter);
        myPager.setCurrentItem(4);
    }


}