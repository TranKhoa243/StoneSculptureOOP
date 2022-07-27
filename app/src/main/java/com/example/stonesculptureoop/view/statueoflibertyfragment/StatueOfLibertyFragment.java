package com.example.stonesculptureoop.view.statueoflibertyfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.stonesculptureoop.R;
import com.example.stonesculptureoop.model.LionStatue;
import com.example.stonesculptureoop.model.StatueOfLiberty;
import com.example.stonesculptureoop.presenter.lionstatus.LionStatuePresenter;
import com.example.stonesculptureoop.presenter.statueofliberty.StatueOfLibertyContract;
import com.example.stonesculptureoop.presenter.statueofliberty.StatueOfLibertyPresenter;
import com.example.stonesculptureoop.view.lionstatuefragment.adapter.LionStatueAdapter;
import com.example.stonesculptureoop.view.statueoflibertyfragment.adapter.StatueOfLibertyAdapter;

import java.util.List;


public class StatueOfLibertyFragment extends Fragment implements StatueOfLibertyContract.ViewInterface {


    private RecyclerView recyclerViewStatueOfLiberty;
    private View view;
    private StatueOfLibertyAdapter statueOfLibertyAdapter;
    private StatueOfLibertyPresenter statueOfLibertyPresenter;

    public StatueOfLibertyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_statue_of_liberty, container, false);
        recyclerViewStatueOfLiberty=view.findViewById(R.id.recycler_view_statue_of_liberty);
        statueOfLibertyPresenter=new StatueOfLibertyPresenter(this);
        statueOfLibertyPresenter.onFetchLionStatus();
        //addControl();
        return view;
    }

    @Override
    public void onSuccessful(List<StatueOfLiberty> result) {
        statueOfLibertyAdapter=new StatueOfLibertyAdapter();
        Log.d("Check data",result.toString());
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this.getContext(),RecyclerView.VERTICAL,false);
        recyclerViewStatueOfLiberty.setLayoutManager(linearLayoutManager);

        statueOfLibertyAdapter.setData(result);
        recyclerViewStatueOfLiberty.setAdapter(statueOfLibertyAdapter);
    }
}