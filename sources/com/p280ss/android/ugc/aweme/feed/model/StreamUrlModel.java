package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.StreamUrlModel */
public class StreamUrlModel implements Serializable {
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    public String f75165id;
    @C6593c(mo15949a = "rtmp_pull_url")
    public String rtmpPullUrl;

    public String getId() {
        return this.f75165id;
    }

    public String getRtmpPullUrl() {
        return this.rtmpPullUrl;
    }

    public void setId(String str) {
        this.f75165id = str;
    }

    public void setRtmpPullUrl(String str) {
        this.rtmpPullUrl = str;
    }
}
