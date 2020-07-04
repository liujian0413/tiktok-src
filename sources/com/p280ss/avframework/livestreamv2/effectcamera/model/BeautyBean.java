package com.p280ss.avframework.livestreamv2.effectcamera.model;

/* renamed from: com.ss.avframework.livestreamv2.effectcamera.model.BeautyBean */
public class BeautyBean {
    private String mResPath;
    private float mSharpIntensity;
    private float mSmoothIntensity;
    private float mWhiteIntensity;

    public String getResPath() {
        return this.mResPath;
    }

    public float getSharpIntensity() {
        return this.mSharpIntensity;
    }

    public float getSmoothIntensity() {
        return this.mSmoothIntensity;
    }

    public float getWhiteIntensity() {
        return this.mWhiteIntensity;
    }

    public BeautyBean() {
        this("", 0.0f, 0.0f, 0.0f);
    }

    public void setResPath(String str) {
        this.mResPath = str;
    }

    public void setSharpIntensity(float f) {
        this.mSharpIntensity = f;
    }

    public void setSmoothIntensity(float f) {
        this.mSmoothIntensity = f;
    }

    public void setWhiteIntensity(float f) {
        this.mWhiteIntensity = f;
    }

    public BeautyBean(String str, float f, float f2, float f3) {
        this.mResPath = str;
        this.mSmoothIntensity = f;
        this.mWhiteIntensity = f2;
        this.mSharpIntensity = f3;
    }
}
