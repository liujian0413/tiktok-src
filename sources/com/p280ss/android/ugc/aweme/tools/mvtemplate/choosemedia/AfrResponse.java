package com.p280ss.android.ugc.aweme.tools.mvtemplate.choosemedia;

import com.google.gson.p276a.C6593c;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.AfrResponse */
public final class AfrResponse {
    @C6593c(mo15949a = "afr_data")
    private List<AfrData> afrData;
    @C6593c(mo15949a = "key")
    private String key = "";

    public final List<AfrData> getAfrData() {
        return this.afrData;
    }

    public final String getKey() {
        return this.key;
    }

    public final void setAfrData(List<AfrData> list) {
        this.afrData = list;
    }

    public final void setKey(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.key = str;
    }
}
