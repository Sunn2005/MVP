package com.example.mvp_image.presenter;

import android.graphics.Bitmap;

public interface IAddMainPresenter {
    //đây là những phương thức mà View có thể yêu cầu presenter làm
    void getImage(String link);
}
