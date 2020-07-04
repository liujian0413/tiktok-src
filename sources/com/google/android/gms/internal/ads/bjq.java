package com.google.android.gms.internal.ads;

import android.net.Uri;

public final class bjq {

    /* renamed from: a */
    public final Uri f42325a;

    /* renamed from: b */
    public final long f42326b;

    /* renamed from: c */
    public final long f42327c;

    /* renamed from: d */
    public final long f42328d;

    /* renamed from: e */
    public final String f42329e;

    /* renamed from: f */
    public final int f42330f;

    public bjq(Uri uri) {
        this(uri, 0);
    }

    private bjq(Uri uri, int i) {
        this(uri, 0, -1, null, 0);
    }

    public bjq(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, null, 0);
    }

    private bjq(Uri uri, long j, long j2, String str, int i) {
        this(uri, 0, 0, -1, null, 0);
    }

    public bjq(Uri uri, long j, long j2, long j3, String str, int i) {
        boolean z = false;
        bke.m49058a(j >= 0);
        bke.m49058a(j2 >= 0);
        if (j3 > 0 || j3 == -1) {
            z = true;
        }
        bke.m49058a(z);
        this.f42325a = uri;
        this.f42326b = j;
        this.f42327c = j2;
        this.f42328d = j3;
        this.f42329e = str;
        this.f42330f = i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f42325a);
        long j = this.f42326b;
        long j2 = this.f42327c;
        long j3 = this.f42328d;
        String str = this.f42329e;
        int i = this.f42330f;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91 + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }
}
