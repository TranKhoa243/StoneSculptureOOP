package com.example.stonesculptureoop.presenter.lionstatus;

import com.example.stonesculptureoop.model.LionStatue;

import java.util.ArrayList;
import java.util.List;

public class LionStatuePresenter implements LionStatueContract.PresenterInterface{
    /*private List<LionStatue> lionStatueList;*/
    LionStatueContract.ViewInterface viewInterface;

    public LionStatuePresenter(LionStatueContract.ViewInterface viewInterface) {
        this.viewInterface = viewInterface;
    }

    @Override
    public void onFetchLionStatus() {
        List<LionStatue> lionStatueList=new ArrayList<>();
        for (int i=1;i<15;i++){
            LionStatue lionStatue=new LionStatue(String.valueOf(i),i*1000);
            lionStatue.setStoneSculptureName("LionStatus"+i);
            lionStatue.setStoneSculptureWeight(String.valueOf(i*5));
            lionStatueList.add(lionStatue);
        }
        viewInterface.onSuccessful(lionStatueList);
    }
}
