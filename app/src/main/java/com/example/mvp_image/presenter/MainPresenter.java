package com.example.mvp_image.presenter;

import com.example.mvp_image.view.MainActivity;
import com.example.mvp_model_view_presenter.view.IMainActivity;

public class MainPresenter implements IMainPresenter{
    private IMainActivity view;

    public MainPresenter(MainActivity view) {
        this.view = view;
    }
}
