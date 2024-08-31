package com.example.mvp_image.model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;


import com.example.mvp_image.callback.DownloadImageCallBack;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ImageDownloader {
    private static final String TAG = "ImageDownloader";
    private static final ExecutorService executors = Executors.newSingleThreadExecutor();

    public static void downloadImage(String link, DownloadImageCallBack callback) {
        executors.execute(() -> {
            try {
                InputStream in = new URL(link).openStream();
                Bitmap bitmap = BitmapFactory.decodeStream(in);
                callback.onDownloadSuccess(bitmap);
                Log.d(TAG, "downloadImageAndConvertToBitmap success : ");
                //return bitmap;
            } catch (IOException e) {
                callback.onDownloadFailed(e.getMessage());
                Log.e(TAG, "downloadImage: ", e);
                //return null;
            }
        });

//        try {
//            //return future.get(); // This will block until the task is complete
//        } catch (InterruptedException | ExecutionException e) {
//            Log.e(TAG, "downloadImage: ", e);
//            //return null;
//        }
    }
}
