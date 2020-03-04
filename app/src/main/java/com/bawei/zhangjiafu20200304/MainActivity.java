package com.bawei.zhangjiafu20200304;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    private RadioButton bt1;
    private RadioButton bt2;
    private RadioButton bt3;
    private RadioButton bt4;
    private RadioButton bt5;
    private ViewPager vp;
    private RadioGroup rg;
    private ArrayList<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp = findViewById(R.id.vp);
        rg = findViewById(R.id.rg);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        list = new ArrayList<>();
        HomePage_Fragment fragment1 = new HomePage_Fragment();
        Ohter_Fragment fragment2 = new Ohter_Fragment();
        list.add(fragment1);
        list.add(fragment2);
        list.add(fragment2);
        list.add(fragment2);
        list.add(fragment2);
        vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.bt1:{
                        vp.setCurrentItem(0);
                    }break;
                    case R.id.bt2:{
                        vp.setCurrentItem(1);
                    }break;
                    case R.id.bt3:{
                        vp.setCurrentItem(2);
                    }break;
                    case R.id.bt4:{
                        vp.setCurrentItem(3);
                    }break;
                    case R.id.bt5:{
                        vp.setCurrentItem(4);
                    }break;
                }
            }
        });
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
//                rg.(position);
//                rg.check(rg.setId(position));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
