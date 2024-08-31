package com.example.mvp_image.view;


import static android.os.Build.VERSION_CODES.R;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {
    private Context mContext;
    private ArrayList<Bitmap> bitmapArrayList;


    public ImageAdapter(Context mContext, ArrayList<Bitmap> bitmapArrayList) {
        this.bitmapArrayList = bitmapArrayList;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = View.inflate(mContext, R., null);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        holder.image.setTag(position);
        holder.image.setImageBitmap(bitmapArrayList.get(position));
    }

    @Override
    public int getItemCount() {

        return bitmapArrayList.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.)
        }
    }
}
