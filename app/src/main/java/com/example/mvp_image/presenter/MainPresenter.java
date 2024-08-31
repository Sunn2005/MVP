package com.example.mvp_image.presenter;

import com.example.mvp_image.view.IMainActivity;
import com.example.mvp_image.view.MainActivity;


public class MainPresenter implements IMainPresenter{
    private IMainActivity view;

    public MainPresenter(MainActivity view) {
        this.view = view;
    }
}
