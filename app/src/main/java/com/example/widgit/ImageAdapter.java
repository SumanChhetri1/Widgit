package com.example.widgit;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    public Context mContext;
    public int[] image={R.drawable.i,R.drawable.im,R.drawable.ima,R.drawable.imag,R.drawable.image,
            R.drawable.i,R.drawable.im,R.drawable.ima,R.drawable.imag,R.drawable.image,
            R.drawable.i,R.drawable.im,R.drawable.ima,R.drawable.imag,R.drawable.image,
            R.drawable.i,R.drawable.im,R.drawable.ima,R.drawable.imag,R.drawable.image};

    public ImageAdapter(Context context){
        this.mContext=context;
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int i) {
        return image[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView=new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(image[i]);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(340,350));
        return imageView;
    }
}
