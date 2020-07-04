package com.p280ss.android.vesdk.filterparam;

/* renamed from: com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam */
public class VEVideoTransformFilterParam extends VEBaseFilterParam {
    public float alpha;
    public int animEndTime;
    public String animPath;
    public int animStartTime;
    public String blendModePath;
    public int degree;
    public int mirror;
    public float scaleFactor;
    public float transX;
    public float transY;
    public int transformType;

    /* renamed from: com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam$paramType */
    public enum paramType {
        UPDATE_VIDEO_TRANSFORM,
        UPDATE_VIDEO_ANIMATION,
        UPDATE_VIDEO_ANIMATION_AND_ANIMATION
    }

    public VEVideoTransformFilterParam() {
        this.filterName = "canvas blend";
        this.filterType = 15;
        this.filterDurationType = 1;
        this.scaleFactor = 1.0f;
        this.alpha = 1.0f;
        this.animPath = "";
        this.blendModePath = "";
        this.transformType = paramType.UPDATE_VIDEO_TRANSFORM.ordinal();
    }
}
