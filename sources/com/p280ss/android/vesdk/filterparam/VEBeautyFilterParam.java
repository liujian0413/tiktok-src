package com.p280ss.android.vesdk.filterparam;

/* renamed from: com.ss.android.vesdk.filterparam.VEBeautyFilterParam */
public class VEBeautyFilterParam extends VEBaseFilterParam {
    public String beautyName;
    public int beautyType;
    public float sharpIntensity;
    public float smoothIntensity;
    public float whiteIntensity;

    public VEBeautyFilterParam() {
        this.filterName = "beauty";
        this.filterType = 12;
        this.filterDurationType = 1;
        this.beautyName = "";
        this.beautyType = -1;
    }
}
