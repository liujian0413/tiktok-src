package com.p280ss.avframework.livestreamv2.interact.render;

/* renamed from: com.ss.avframework.livestreamv2.interact.render.ImageFrame */
public class ImageFrame {
    public static float[] ANDROID_DEFAULT_TRANSFORM_MATRIX = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
    public static final float[] sHomogeneousCoordinates = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private int mHeight;
    private int mTextureFormat = 1;
    private int mTextureID;
    private float[] mTransfromMatrix;
    private int mWidth;

    public int getHeight() {
        return this.mHeight;
    }

    public int getTextureFormat() {
        return this.mTextureFormat;
    }

    public int getTextureID() {
        return this.mTextureID;
    }

    public float[] getTransfromMatrix() {
        return this.mTransfromMatrix;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void setHeight(int i) {
        this.mHeight = i;
    }

    public void setTextureFormat(int i) {
        this.mTextureFormat = i;
    }

    public void setTextureID(int i) {
        this.mTextureID = i;
    }

    public void setTransfromMatrix(float[] fArr) {
        this.mTransfromMatrix = fArr;
    }

    public void setWidth(int i) {
        this.mWidth = i;
    }

    public ImageFrame(int i, int i2, int i3) {
        this.mTextureID = i;
        this.mWidth = i2;
        this.mHeight = i3;
        this.mTransfromMatrix = ANDROID_DEFAULT_TRANSFORM_MATRIX;
    }

    public ImageFrame(int i, int i2, int i3, float[] fArr) {
        this.mTextureID = i;
        this.mWidth = i2;
        this.mHeight = i3;
        this.mTransfromMatrix = fArr;
    }
}
