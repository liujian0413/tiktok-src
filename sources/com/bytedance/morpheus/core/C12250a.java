package com.bytedance.morpheus.core;

import android.app.PendingIntent;

/* renamed from: com.bytedance.morpheus.core.a */
public final class C12250a {

    /* renamed from: a */
    public String f32566a;

    /* renamed from: b */
    public int f32567b;

    /* renamed from: c */
    public int f32568c;

    /* renamed from: d */
    public long f32569d;

    /* renamed from: e */
    public long f32570e;

    /* renamed from: f */
    public long f32571f;

    /* renamed from: g */
    public int f32572g;

    /* renamed from: h */
    public PendingIntent f32573h;

    /* renamed from: i */
    public Exception f32574i;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MorpheusState{packageName='");
        sb.append(this.f32566a);
        sb.append('\'');
        sb.append(", versionCode=");
        sb.append(this.f32567b);
        sb.append(", status=");
        sb.append(this.f32568c);
        sb.append(", totalBytesToDownload=");
        sb.append(this.f32569d);
        sb.append(", bytesDownloaded=");
        sb.append(this.f32570e);
        sb.append(", downloadTime=");
        sb.append(this.f32571f);
        sb.append(", errorCode=");
        sb.append(this.f32572g);
        sb.append(", resolutionIntent=");
        sb.append(this.f32573h);
        sb.append(", exception=");
        sb.append(this.f32574i);
        sb.append('}');
        return sb.toString();
    }

    public C12250a(String str, int i, int i2) {
        this.f32566a = str;
        this.f32567b = i;
        this.f32568c = i2;
    }
}
