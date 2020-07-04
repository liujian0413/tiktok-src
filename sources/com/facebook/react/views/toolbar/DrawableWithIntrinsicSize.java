package com.facebook.react.views.toolbar;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import com.facebook.drawee.drawable.C13412g;
import com.facebook.imagepipeline.p720g.C13648f;

public class DrawableWithIntrinsicSize extends C13412g implements Callback {
    private final C13648f mImageInfo;

    public int getIntrinsicHeight() {
        return this.mImageInfo.getHeight();
    }

    public int getIntrinsicWidth() {
        return this.mImageInfo.getWidth();
    }

    public DrawableWithIntrinsicSize(Drawable drawable, C13648f fVar) {
        super(drawable);
        this.mImageInfo = fVar;
    }
}
