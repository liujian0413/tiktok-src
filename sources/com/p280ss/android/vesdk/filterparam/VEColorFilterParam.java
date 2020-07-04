package com.p280ss.android.vesdk.filterparam;

/* renamed from: com.ss.android.vesdk.filterparam.VEColorFilterParam */
public class VEColorFilterParam extends VEBaseFilterParam {
    public float intensity;
    public String leftFilterPath;
    public float position;
    public String rightFilterPath;
    public float rightIntensity;

    public VEColorFilterParam() {
        this.filterName = "color filter";
        this.filterType = 7;
        this.filterDurationType = 1;
        this.leftFilterPath = "";
        this.rightFilterPath = "";
        this.position = 1.0f;
        this.intensity = 1.0f;
        this.rightIntensity = 1.0f;
    }
}
