package com.example.stonesculptureoop.presenter.statueofliberty;

import com.example.stonesculptureoop.model.LionStatue;
import com.example.stonesculptureoop.model.StatueOfLiberty;

import java.util.ArrayList;
import java.util.List;

public class StatueOfLibertyPresenter implements StatueOfLibertyContract.PresenterInterface{
    StatueOfLibertyContract.ViewInterface viewInterface;

    public StatueOfLibertyPresenter(StatueOfLibertyContract.ViewInterface viewInterface) {
        this.viewInterface = viewInterface;
    }

    @Override
    public void onFetchLionStatus() {
        List<StatueOfLiberty> statueOfLibertyList=new ArrayList<>();
        for (int i=1;i<15;i++){
            StatueOfLiberty statueOfLiberty=new StatueOfLiberty(String.valueOf(i),i*1000);
            statueOfLiberty.setStoneSculptureName("StatueOfLiberty"+i);
            statueOfLiberty.setStoneSculptureWeight(String.valueOf(i*5));
            statueOfLibertyList.add(statueOfLiberty);
        }
        viewInterface.onSuccessful(statueOfLibertyList);
    }
}
