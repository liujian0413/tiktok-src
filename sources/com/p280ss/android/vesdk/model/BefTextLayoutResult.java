package com.p280ss.android.vesdk.model;

import android.graphics.Bitmap;

/* renamed from: com.ss.android.vesdk.model.BefTextLayoutResult */
public class BefTextLayoutResult {
    Bitmap bitmap;
    int height;
    int lineCount;
    int width;

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public int getHeight() {
        return this.height;
    }

    public int getLineCount() {
        return this.lineCount;
    }

    public int getWidth() {
        return this.width;
    }

    public void setBitmap(Bitmap bitmap2) {
        this.bitmap = bitmap2;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLineCount(int i) {
        this.lineCount = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
