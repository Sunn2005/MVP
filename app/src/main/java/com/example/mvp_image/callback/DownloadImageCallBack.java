package com.example.mvp_image.callback;

import android.graphics.Bitmap;

public interface DownloadImageCallBack {
    void onDownloadSuccess(Bitmap bitmap);
    void onDownloadFailed(String message);
}
