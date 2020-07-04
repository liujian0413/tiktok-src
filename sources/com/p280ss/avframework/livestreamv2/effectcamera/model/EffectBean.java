package com.p280ss.avframework.livestreamv2.effectcamera.model;

/* renamed from: com.ss.avframework.livestreamv2.effectcamera.model.EffectBean */
public class EffectBean {
    private boolean mIsCustom;
    private String mRenderCacheKey;
    private String mResPath;
    private boolean mWithoutFace;

    public String getRenderCacheKey() {
        return this.mRenderCacheKey;
    }

    public String getResPath() {
        return this.mResPath;
    }

    public boolean isCustom() {
        return this.mIsCustom;
    }

    public boolean isWithoutFace() {
        return this.mWithoutFace;
    }

    public EffectBean() {
        this("");
    }

    public void setCustom(boolean z) {
        this.mIsCustom = z;
    }

    public void setRenderCacheKey(String str) {
        this.mRenderCacheKey = str;
    }

    public void setResPath(String str) {
        this.mResPath = str;
    }

    public void setWithoutFace(boolean z) {
        this.mWithoutFace = z;
    }

    public EffectBean(String str) {
        this(str, false);
    }

    public EffectBean(String str, boolean z) {
        this.mResPath = str;
        this.mWithoutFace = z;
    }

    public EffectBean(String str, String str2, boolean z) {
        this.mResPath = str2;
        this.mRenderCacheKey = str;
        this.mWithoutFace = z;
        this.mIsCustom = true;
    }
}
