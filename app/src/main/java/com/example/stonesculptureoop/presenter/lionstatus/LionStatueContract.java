package com.example.stonesculptureoop.presenter.lionstatus;

import com.example.stonesculptureoop.model.LionStatue;

import java.util.List;

public class LionStatueContract {
    public interface ViewInterface{
        void onSuccessful(List<LionStatue> result);
    }

    public interface PresenterInterface{
        void onFetchLionStatus();
    }
}
