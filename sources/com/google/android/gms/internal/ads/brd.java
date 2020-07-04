package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

public final class brd implements bre {

    /* renamed from: a */
    private final byte[] f43310a;

    /* renamed from: b */
    private Uri f43311b;

    /* renamed from: c */
    private int f43312c;

    /* renamed from: d */
    private int f43313d;

    public brd(byte[] bArr) {
        brr.m49869a(bArr);
        brr.m49871a(bArr.length > 0);
        this.f43310a = bArr;
    }

    /* renamed from: a */
    public final long mo39589a(brg brg) throws IOException {
        this.f43311b = brg.f43314a;
        this.f43312c = (int) brg.f43317d;
        this.f43313d = (int) (brg.f43318e == -1 ? ((long) this.f43310a.length) - brg.f43317d : brg.f43318e);
        if (this.f43313d > 0 && this.f43312c + this.f43313d <= this.f43310a.length) {
            return (long) this.f43313d;
        }
        int i = this.f43312c;
        long j = brg.f43318e;
        int length = this.f43310a.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i);
        sb.append(", ");
        sb.append(j);
        sb.append("], length: ");
        sb.append(length);
        throw new IOException(sb.toString());
    }

    /* renamed from: a */
    public final int mo39588a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f43313d == 0) {
            return -1;
        }
        int min = Math.min(i2, this.f43313d);
        System.arraycopy(this.f43310a, this.f43312c, bArr, i, min);
        this.f43312c += min;
        this.f43313d -= min;
        return min;
    }

    /* renamed from: a */
    public final Uri mo39590a() {
        return this.f43311b;
    }

    /* renamed from: b */
    public final void mo39592b() throws IOException {
        this.f43311b = null;
    }
}
