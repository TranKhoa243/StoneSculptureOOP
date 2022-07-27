package com.example.stonesculptureoop.view.main.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.stonesculptureoop.view.lionstatuefragment.LionStatueFragment;
import com.example.stonesculptureoop.view.statueoflibertyfragment.StatueOfLibertyFragment;

public class ViewPagerMainAdapter extends FragmentStateAdapter {
    private final int LION_STATUE_INDEX=0;
    private final int STATUE_OF_LIBERTY_INDEX=1;

    private String[] titles= new String[]{"Summary","Favorites"};

    public ViewPagerMainAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case LION_STATUE_INDEX:
                /*return new SummaryFragment();*/
                return new LionStatueFragment();
            case STATUE_OF_LIBERTY_INDEX:
                /*return new FavoritesFragment();*/
                return new StatueOfLibertyFragment();
        }
        /*return new SummaryFragment();*/
        return new LionStatueFragment();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
