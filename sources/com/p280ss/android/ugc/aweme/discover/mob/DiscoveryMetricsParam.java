package com.p280ss.android.ugc.aweme.discover.mob;

import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;
import com.p280ss.android.ugc.aweme.metrics.ExtraMetricsParam;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.DiscoveryMetricsParam */
public class DiscoveryMetricsParam extends ExtraMetricsParam {
    private String bannerId;
    private int clientOrder;
    private String enterFrom = "discovery";
    private String tagId;

    public HashMap<String, String> buildParams() {
        if (C26654b.m87573a()) {
            this.enterFrom = "search_section";
        }
        appendParam("banner_id", this.bannerId, C33260a.f86771b);
        appendParam("enter_from", this.enterFrom, C33260a.f86770a);
        appendParam("tag_id", this.tagId, C33260a.f86770a);
        appendParam("client_order", String.valueOf(this.clientOrder), C33260a.f86770a);
        return this.params;
    }

    public DiscoveryMetricsParam setBannerId(String str) {
        this.bannerId = str;
        return this;
    }

    public DiscoveryMetricsParam setClientOrder(int i) {
        this.clientOrder = i;
        return this;
    }

    public DiscoveryMetricsParam setEnterFrom(String str) {
        this.enterFrom = str;
        return this;
    }

    public DiscoveryMetricsParam setTagId(String str) {
        this.tagId = str;
        return this;
    }
}
