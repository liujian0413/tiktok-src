package com.p280ss.android.vesdk.filterparam;

/* renamed from: com.ss.android.vesdk.filterparam.VEReshapeFilterParam */
public class VEReshapeFilterParam extends VEBaseFilterParam {
    public float cheekIntensity;
    public float eyeIntensity;
    public String resPath;

    public VEReshapeFilterParam() {
        this.filterName = "reshape filter";
        this.filterType = 13;
        this.filterDurationType = 1;
        this.resPath = "";
    }
}
