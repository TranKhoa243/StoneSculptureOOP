package com.example.stonesculptureoop.view.lionstatuefragment;

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
import com.example.stonesculptureoop.presenter.lionstatus.LionStatueContract;
import com.example.stonesculptureoop.presenter.lionstatus.LionStatuePresenter;
import com.example.stonesculptureoop.view.lionstatuefragment.adapter.LionStatueAdapter;

import java.util.List;


public class LionStatueFragment extends Fragment implements LionStatueContract.ViewInterface {

    private RecyclerView recyclerViewLionStatue;
    private View view;
    private LionStatueAdapter lionStatueAdapter;
    private LionStatuePresenter lionStatuePresenter;

    public LionStatueFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view= inflater.inflate(R.layout.fragment_lion_statue, container, false);
        recyclerViewLionStatue=view.findViewById(R.id.recycler_view_lion_statue);
        lionStatuePresenter=new LionStatuePresenter(this);
        lionStatuePresenter.onFetchLionStatus();
        //addControl();
        return view;
    }

    /*private void addControl() {

    }*/

    @Override
    public void onSuccessful(List<LionStatue> result) {
        lionStatueAdapter=new LionStatueAdapter();
        Log.d("Check data",result.toString());
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this.getContext(),RecyclerView.VERTICAL,false);
        recyclerViewLionStatue.setLayoutManager(linearLayoutManager);

        lionStatueAdapter.setData(result);
        recyclerViewLionStatue.setAdapter(lionStatueAdapter);
    }
}