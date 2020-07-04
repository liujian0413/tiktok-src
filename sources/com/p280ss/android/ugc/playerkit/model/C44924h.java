package com.p280ss.android.ugc.playerkit.model;

import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44863c;

/* renamed from: com.ss.android.ugc.playerkit.model.h */
public final class C44924h {

    /* renamed from: a */
    public Object f115559a;

    /* renamed from: b */
    public String f115560b;

    /* renamed from: c */
    public boolean f115561c;

    /* renamed from: d */
    public C44863c f115562d;

    /* renamed from: e */
    public String f115563e;

    /* renamed from: f */
    public String f115564f;

    /* renamed from: g */
    public boolean f115565g;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessUrlData{url=");
        sb.append(this.f115559a);
        sb.append(", isH265=");
        sb.append(this.f115561c);
        sb.append(", ratio=");
        sb.append(this.f115560b);
        sb.append(", urlKey=");
        sb.append(this.f115563e);
        sb.append(", forceSoftwareDecode=");
        sb.append(this.f115565g);
        sb.append('}');
        return sb.toString();
    }
}
