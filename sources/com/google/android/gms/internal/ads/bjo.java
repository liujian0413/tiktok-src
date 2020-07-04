package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class bjo implements bjp {

    /* renamed from: a */
    private final byte[] f42322a;

    /* renamed from: b */
    private int f42323b;

    /* renamed from: c */
    private int f42324c;

    public bjo(byte[] bArr) {
        bke.m49057a(bArr);
        bke.m49058a(bArr.length > 0);
        this.f42322a = bArr;
    }

    /* renamed from: a */
    public final void mo39544a() throws IOException {
    }

    /* renamed from: a */
    public final long mo39543a(bjq bjq) throws IOException {
        this.f42323b = (int) bjq.f42327c;
        this.f42324c = (int) (bjq.f42328d == -1 ? ((long) this.f42322a.length) - bjq.f42327c : bjq.f42328d);
        if (this.f42324c > 0 && this.f42323b + this.f42324c <= this.f42322a.length) {
            return (long) this.f42324c;
        }
        int i = this.f42323b;
        long j = bjq.f42328d;
        int length = this.f42322a.length;
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
    public final int mo39542a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f42324c == 0) {
            return -1;
        }
        int min = Math.min(i2, this.f42324c);
        System.arraycopy(this.f42322a, this.f42323b, bArr, i, min);
        this.f42323b += min;
        this.f42324c -= min;
        return min;
    }
}
