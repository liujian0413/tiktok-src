package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.SdkExtraInfo */
public final class SdkExtraInfo implements Serializable {
    private String mvAlgorithmHint = "";

    /* renamed from: pl */
    private PlDataBean f104298pl;

    public final String getMvAlgorithmHint() {
        return this.mvAlgorithmHint;
    }

    public final PlDataBean getPl() {
        return this.f104298pl;
    }

    public final boolean isLegal() {
        boolean z;
        if (this.mvAlgorithmHint.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            PlDataBean plDataBean = this.f104298pl;
            if (plDataBean != null) {
                List alg = plDataBean.getAlg();
                if (alg == null || !(!alg.isEmpty())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void setPl(PlDataBean plDataBean) {
        this.f104298pl = plDataBean;
    }

    public final void setMvAlgorithmHint(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.mvAlgorithmHint = str;
    }
}
