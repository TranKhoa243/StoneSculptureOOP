package com.example.stonesculptureoop.presenter.statueofliberty;

import com.example.stonesculptureoop.model.LionStatue;
import com.example.stonesculptureoop.model.StatueOfLiberty;

import java.util.List;

public class StatueOfLibertyContract {
    public interface ViewInterface{
        void onSuccessful(List<StatueOfLiberty> result);
    }

    public interface PresenterInterface{
        void onFetchLionStatus();
    }
}
