package com.facebook.react.flat;

import android.graphics.Bitmap;

interface BitmapUpdateListener {
    void onBitmapReady(Bitmap bitmap);

    void onImageLoadEvent(int i);

    void onSecondaryAttach(Bitmap bitmap);
}
