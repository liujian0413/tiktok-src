package com.p280ss.android.p817ad.splash.core.p828c;

import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.c.a */
public final class C19000a {

    /* renamed from: a */
    public String f51258a;

    /* renamed from: b */
    public String f51259b;

    /* renamed from: c */
    public String f51260c;

    /* renamed from: d */
    public String f51261d;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareAdInfo{mTitle='");
        sb.append(this.f51258a);
        sb.append('\'');
        sb.append(", mDescription='");
        sb.append(this.f51259b);
        sb.append('\'');
        sb.append(", mImageUrl='");
        sb.append(this.f51260c);
        sb.append('\'');
        sb.append(", mShareUrl='");
        sb.append(this.f51261d);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public C19000a(JSONObject jSONObject) {
        this.f51258a = jSONObject.optString("share_title");
        this.f51259b = jSONObject.optString("share_desc");
        this.f51260c = jSONObject.optString("share_icon");
        this.f51261d = jSONObject.optString("share_url");
    }
}
