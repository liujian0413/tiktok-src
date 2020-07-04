package com.bytedance.ies.web.p582a;

import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.a.i */
public final class C11097i {

    /* renamed from: a */
    public String f30168a;

    /* renamed from: b */
    public String f30169b;

    /* renamed from: c */
    public String f30170c;

    /* renamed from: d */
    public JSONObject f30171d;

    /* renamed from: e */
    public int f30172e;

    /* renamed from: f */
    public boolean f30173f = true;

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsMsg{type='");
        sb.append(this.f30168a);
        sb.append('\'');
        sb.append(", callback_id='");
        sb.append(this.f30169b);
        sb.append('\'');
        sb.append(", func='");
        sb.append(this.f30170c);
        sb.append('\'');
        sb.append(", params=");
        sb.append(this.f30171d);
        sb.append(", version=");
        sb.append(this.f30172e);
        sb.append('}');
        return sb.toString();
    }
}
