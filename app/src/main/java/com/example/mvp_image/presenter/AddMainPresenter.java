package com.example.mvp_image.presenter;

import android.graphics.Bitmap;

import com.example.mvp_model_view_presenter.callback.DownloadImageCallBack;
import com.example.mvp_model_view_presenter.model.ImageDownloader;
import com.example.mvp_model_view_presenter.view.IMainActivity;

public class AddMainPresenter implements IAddMainPresenter {
    private IMainActivity view;
    private DownloadImageCallBack callback = new DownloadImageCallBack() {
        @Override
        public void onDownloadSuccess(Bitmap bitmap) {
            setBitmap(bitmap);
        }

        @Override
        public void onDownloadFailed(String message) {
            view.onDownloadImageFailed(message);
        }
    };
    public AddMainPresenter(IMainActivity view) {
        this.view = view;
    }
    @Override
    public Bitmap getImage(String link) {
        return ImageDownloader.downloadImage(link, callback);

    }
    public void setBitmap(Bitmap bitmap){
        view.displayImage(bitmap);

    }
}
