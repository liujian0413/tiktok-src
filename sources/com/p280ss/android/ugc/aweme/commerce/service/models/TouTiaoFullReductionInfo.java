package com.p280ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.TouTiaoFullReductionInfo */
public final class TouTiaoFullReductionInfo implements Serializable {
    @C6593c(mo15949a = "full_reduction")
    private List<String> fullReduction;
    @C6593c(mo15949a = "url")
    private String url;

    public final List<String> getFullReduction() {
        return this.fullReduction;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setFullReduction(List<String> list) {
        this.fullReduction = list;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
