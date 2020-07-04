package com.p280ss.android.vesdk;

/* renamed from: com.ss.android.vesdk.m */
public final class C45330m {

    /* renamed from: a */
    public String f116752a;

    /* renamed from: b */
    public String f116753b;

    /* renamed from: c */
    public float f116754c;

    /* renamed from: d */
    public float f116755d;

    /* renamed from: e */
    public float f116756e;

    /* renamed from: f */
    public boolean f116757f;

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"mDuetVideoPath\":\"");
        sb.append(this.f116752a);
        sb.append('\"');
        sb.append(",\"mDuetAudioPath\":\"");
        sb.append(this.f116753b);
        sb.append('\"');
        sb.append(",\"mXInPercent\":");
        sb.append(this.f116754c);
        sb.append(",\"mYInPercent\":");
        sb.append(this.f116755d);
        sb.append(",\"mAlpha\":");
        sb.append(this.f116756e);
        sb.append(",\"mIsFitMode\":");
        sb.append(this.f116757f);
        sb.append('}');
        return sb.toString();
    }

    public C45330m(String str, String str2, float f, float f2, float f3, boolean z) {
        this.f116752a = str;
        this.f116753b = str2;
        this.f116754c = f;
        this.f116755d = f2;
        this.f116756e = f3;
        this.f116757f = z;
    }
}
