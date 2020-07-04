package com.p280ss.android.vesdk.filterparam;

/* renamed from: com.ss.android.vesdk.filterparam.VEVideoAjustmentFilterParam */
public class VEVideoAjustmentFilterParam extends VEBaseFilterParam {
    public float[] ajustmentIntensity;
    public String[] ajustmentName;
    public int[] ajustmentType;

    public VEVideoAjustmentFilterParam() {
        this.filterName = "quality filter";
        this.filterType = 17;
        this.filterDurationType = 1;
    }
}
