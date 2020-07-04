package com.p280ss.avframework.livestreamv2.effectcamera.model;

/* renamed from: com.ss.avframework.livestreamv2.effectcamera.model.ReshapeFaceBean */
public class ReshapeFaceBean {
    private float mCheekIntensity;
    private float mEyeIntensity;
    private String mResPath;

    public float getCheekIntensity() {
        return this.mCheekIntensity;
    }

    public float getEyeIntensity() {
        return this.mEyeIntensity;
    }

    public String getResPath() {
        return this.mResPath;
    }

    public ReshapeFaceBean() {
        this("", 0.0f, 0.0f);
    }

    public void setCheekIntensity(float f) {
        this.mCheekIntensity = f;
    }

    public void setEyeIntensity(float f) {
        this.mEyeIntensity = f;
    }

    public void setResPath(String str) {
        this.mResPath = str;
    }

    public ReshapeFaceBean(String str, float f, float f2) {
        this.mResPath = str;
        this.mEyeIntensity = f;
        this.mCheekIntensity = f2;
    }
}
