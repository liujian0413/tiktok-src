package com.p280ss.android.vesdk.filterparam;

/* renamed from: com.ss.android.vesdk.filterparam.VEImageTransformFilterParam */
public class VEImageTransformFilterParam extends VEBaseFilterParam {
    public float beginScale;
    public float endScale;

    public VEImageTransformFilterParam() {
        this.filterName = "image transform filter";
        this.filterType = 20;
        this.beginScale = 1.0f;
        this.endScale = 1.0f;
    }
}
