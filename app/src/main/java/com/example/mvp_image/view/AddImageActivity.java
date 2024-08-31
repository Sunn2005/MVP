package com.example.mvp_image.view;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mvp_image.databinding.ActivityAddImageActicityBinding;
import com.example.mvp_image.presenter.AddMainPresenter;
import com.example.mvp_image.presenter.IAddMainPresenter;

public class AddImageActivity extends AppCompatActivity implements IAddImageAcitivity{
    private static final String TAG = "AddImageActivity";
    private ActivityAddImageActicityBinding addViewBinding;
    private IAddMainPresenter addPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        addViewBinding = ActivityAddImageActicityBinding.inflate(getLayoutInflater());
        setContentView(addViewBinding.getRoot());
        addPresenter = new AddMainPresenter(this);

        setUpViewEvent();

    }

    private void setUpViewEvent() {
        addViewBinding.btUpdate.setOnClickListener(v -> onButtonCliked());

    }

    private void onButtonCliked() {
        String link = addViewBinding.edLink.getText().toString();
        Log.d(TAG, "onButtonClicked: " + link);
        addPresenter.getImage(link);
        finish();
    }

    @Override
    public void getImage(Bitmap bitmap) {
        MainActivity.bitmapArrayList.add(bitmap);
        MainActivity.imageAdapter.notifyDataSetChanged();
    }
}