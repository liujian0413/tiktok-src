package com.p280ss.android.medialib.camera;

import android.graphics.Bitmap;

/* renamed from: com.ss.android.medialib.camera.ImageFrame */
public class ImageFrame {
    public static final int BMP = 2;
    public static final int JPEG = 1;
    public static final int NV21 = -3;
    public static final int PNG = 0;
    public static final int UNKNOW = -1;
    public static final int YUV_888 = -2;
    Bitmap bitmap;
    int format;
    int height;
    byte[] mBuf;
    C19699j mPlane;
    int width;

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public byte[] getBuf() {
        return this.mBuf;
    }

    public int getFormat() {
        return this.format;
    }

    public int getHeight() {
        return this.height;
    }

    public C19699j getPlane() {
        return this.mPlane;
    }

    public int getWidth() {
        return this.width;
    }

    public void setBuf(byte[] bArr) {
        this.mBuf = bArr;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public ImageFrame(Bitmap bitmap2, int i) {
        this.bitmap = bitmap2;
        this.format = i;
    }

    public ImageFrame(C19699j jVar, int i, int i2, int i3) {
        this.mPlane = jVar;
        this.format = i;
        this.width = i2;
        this.height = i3;
    }

    public ImageFrame(byte[] bArr, int i, int i2, int i3) {
        this.mBuf = bArr;
        this.format = i;
        this.width = i2;
        this.height = i3;
    }
}
