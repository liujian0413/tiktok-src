package com.p280ss.android.ugc.playerkit.model;

/* renamed from: com.ss.android.ugc.playerkit.model.c */
public final class C44919c {

    /* renamed from: a */
    public String f115522a;

    /* renamed from: b */
    public boolean f115523b;

    /* renamed from: c */
    public boolean f115524c;

    /* renamed from: d */
    public int f115525d;

    /* renamed from: e */
    public int f115526e;

    /* renamed from: f */
    public Object f115527f;

    /* renamed from: g */
    public String f115528g;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaError{sourceId='");
        sb.append(this.f115522a);
        sb.append('\'');
        sb.append(", h265=");
        sb.append(this.f115523b);
        sb.append(", isDash=");
        sb.append(this.f115524c);
        sb.append(", errorCode=");
        sb.append(this.f115525d);
        sb.append(", errorExtra=");
        sb.append(this.f115526e);
        sb.append(", extraInfo=");
        sb.append(this.f115527f);
        sb.append(", playUrl='");
        sb.append(this.f115528g);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public C44919c(String str, boolean z, int i, int i2, Object obj) {
        this.f115522a = str;
        this.f115523b = z;
        this.f115525d = i;
        this.f115526e = i2;
        this.f115527f = obj;
    }
}
