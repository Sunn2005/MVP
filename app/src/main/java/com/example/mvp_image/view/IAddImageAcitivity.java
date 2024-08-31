package com.example.mvp_image.view;

import android.graphics.Bitmap;

public interface IAddImageAcitivity {
    void getImage(Bitmap bitmap);

    void runOnUiThread(Runnable runnable);
}
