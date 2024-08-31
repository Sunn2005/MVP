package com.example.mvp_image.view;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.mvp_image.databinding.ActivityMainBinding;
import com.example.mvp_image.presenter.IMainPresenter;
import com.example.mvp_image.presenter.MainPresenter;

import java.util.ArrayList;

//bước đầu khai báo presenter
//bước 2 khởi tạo presenter

public class MainActivity extends AppCompatActivity implements IMainActivity {
    private ActivityMainBinding viewBinding;
    private IMainPresenter presenter;
    public static ImageAdapter imageAdapter;
    public static ArrayList<Bitmap> bitmapArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        //khởi tạo presenter
        presenter = new MainPresenter(this);

        viewBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(viewBinding.getRoot());

        bitmapArrayList = new ArrayList<>();
        imageAdapter = new ImageAdapter(this, bitmapArrayList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        viewBinding.rcvImageList.setLayoutManager(gridLayoutManager);
        viewBinding.rcvImageList.setAdapter(imageAdapter);

        viewBinding.btThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddImageActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void displayImage(Bitmap bitmap) {

    }

    @Override
    public void onDownloadImageFailed(String message) {

    }
}