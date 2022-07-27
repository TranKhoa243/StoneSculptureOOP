package com.example.stonesculptureoop.view.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.stonesculptureoop.R;
import com.example.stonesculptureoop.view.main.adapter.ViewPagerMainAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    private ViewPagerMainAdapter viewPagerMainAdapter;
    private String[] titles= new String[]{"LionStatue","StatueOfLiberty"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
    }

    private void addControls() {
        tabLayout=findViewById(R.id.tab_layout);
        viewPager2=findViewById(R.id.view_pager);
        viewPagerMainAdapter=new ViewPagerMainAdapter(this);
        viewPager2.setAdapter(viewPagerMainAdapter);
        new TabLayoutMediator(tabLayout,viewPager2,((tab, position) -> tab.setText(titles[position]))).attach();
    }
}