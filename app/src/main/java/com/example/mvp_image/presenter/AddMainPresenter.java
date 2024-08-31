package com.example.mvp_image.presenter;

import android.graphics.Bitmap;

import com.example.mvp_image.callback.DownloadImageCallBack;
import com.example.mvp_image.model.ImageDownloader;
import com.example.mvp_image.view.IAddImageAcitivity;



public class AddMainPresenter implements IAddMainPresenter {
    private IAddImageAcitivity view;
    private DownloadImageCallBack callback = new DownloadImageCallBack() {
        @Override
        public void onDownloadSuccess(Bitmap bitmap) {
            view.runOnUiThread(() -> view.getImage(bitmap));

        }

        @Override
        public void onDownloadFailed(String message) {

        }
    };


    public AddMainPresenter(IAddImageAcitivity view) {
        this.view = view;
    }
    @Override
    public void getImage(String link) {
        ImageDownloader.downloadImage(link, callback);
    }
}
