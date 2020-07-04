package com.p280ss.android.ugc.aweme.p313im.service.model;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.service.model.IMAdLog */
public class IMAdLog implements Serializable {
    private String creativeId;
    private String logExtra;

    public String getCreativeId() {
        return this.creativeId;
    }

    public String getLogExtra() {
        return this.logExtra;
    }

    public void setCreativeId(String str) {
        this.creativeId = str;
    }

    public void setLogExtra(String str) {
        this.logExtra = str;
    }

    public IMAdLog(String str, String str2) {
        this.logExtra = str;
        this.creativeId = str2;
    }
}
