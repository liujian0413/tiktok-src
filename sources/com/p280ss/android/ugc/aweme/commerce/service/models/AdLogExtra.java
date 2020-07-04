package com.p280ss.android.ugc.aweme.commerce.service.models;

import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.AdLogExtra */
public final class AdLogExtra implements Serializable {
    private String adExtraData = "";
    private long creativeId;
    private long groupId;
    private String logExtra = "";

    public final String getAdExtraData() {
        return this.adExtraData;
    }

    public final long getCreativeId() {
        return this.creativeId;
    }

    public final long getGroupId() {
        return this.groupId;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final void setCreativeId(long j) {
        this.creativeId = j;
    }

    public final void setGroupId(long j) {
        this.groupId = j;
    }

    public final void setAdExtraData(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.adExtraData = str;
    }

    public final void setLogExtra(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.logExtra = str;
    }
}
