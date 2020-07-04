package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

public final class brg {

    /* renamed from: a */
    public final Uri f43314a;

    /* renamed from: b */
    public final byte[] f43315b;

    /* renamed from: c */
    public final long f43316c;

    /* renamed from: d */
    public final long f43317d;

    /* renamed from: e */
    public final long f43318e;

    /* renamed from: f */
    public final String f43319f;

    /* renamed from: g */
    public final int f43320g;

    public brg(Uri uri) {
        this(uri, 0);
    }

    private brg(Uri uri, int i) {
        this(uri, 0, -1, null, 0);
    }

    public brg(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    private brg(Uri uri, long j, long j2, String str, int i) {
        this(uri, 0, 0, -1, null, 0);
    }

    private brg(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, null, j, j2, j3, str, 0);
    }

    public brg(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = false;
        brr.m49871a(j >= 0);
        brr.m49871a(j2 >= 0);
        if (j3 > 0 || j3 == -1) {
            z = true;
        }
        brr.m49871a(z);
        this.f43314a = uri;
        this.f43315b = bArr;
        this.f43316c = j;
        this.f43317d = j2;
        this.f43318e = j3;
        this.f43319f = str;
        this.f43320g = i;
    }

    /* renamed from: a */
    public final boolean mo41194a(int i) {
        return (this.f43320g & 1) == 1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f43314a);
        String arrays = Arrays.toString(this.f43315b);
        long j = this.f43316c;
        long j2 = this.f43317d;
        long j3 = this.f43318e;
        String str = this.f43319f;
        int i = this.f43320g;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 93 + String.valueOf(arrays).length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(arrays);
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
