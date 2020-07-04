package com.p280ss.android.vesdk.filterparam;

/* renamed from: com.ss.android.vesdk.filterparam.VEVideoCropFilterParam */
public class VEVideoCropFilterParam extends VEBaseFilterParam {
    public float[] cropNodesCoord;

    public VEVideoCropFilterParam() {
        this.cropNodesCoord = new float[]{-1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f};
        this.filterName = "crop filter";
        this.filterType = 19;
        this.filterDurationType = 1;
    }

    public VEVideoCropFilterParam(float[] fArr) {
        this();
        if (fArr != null) {
            this.cropNodesCoord = fArr;
        }
    }
}
