package com.p280ss.android.ugc.aweme.tools.mvtemplate.choosemedia;

import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.AfrData */
public final class AfrData {
    private String algorithm = "";
    @C6593c(mo15949a = "mask_area")
    private long maskArea;
    @C6593c(mo15949a = "mask_ratio")
    private float maskRadio = 1.0f;
    private String pic;

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final long getMaskArea() {
        return this.maskArea;
    }

    public final float getMaskRadio() {
        return this.maskRadio;
    }

    public final String getPic() {
        return this.pic;
    }

    public final void setMaskArea(long j) {
        this.maskArea = j;
    }

    public final void setMaskRadio(float f) {
        this.maskRadio = f;
    }

    public final void setPic(String str) {
        this.pic = str;
    }

    public final void setAlgorithm(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.algorithm = str;
    }
}
