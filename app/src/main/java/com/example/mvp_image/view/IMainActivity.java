package com.example.mvp_image.view;

import android.graphics.Bitmap;

public interface IMainActivity {
    //đâyv là những phương thức mà Presenter có thể yêu cầu View thực hiện
    void displayImage(Bitmap bitmap);
    void onDownloadImageFailed(String message);
}
