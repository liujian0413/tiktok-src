package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class bkh {

    /* renamed from: a */
    public int f42380a;

    /* renamed from: b */
    private long[] f42381b;

    public bkh() {
        this(32);
    }

    private bkh(int i) {
        this.f42381b = new long[32];
    }

    /* renamed from: a */
    public final void mo40807a(long j) {
        if (this.f42380a == this.f42381b.length) {
            this.f42381b = Arrays.copyOf(this.f42381b, this.f42380a << 1);
        }
        long[] jArr = this.f42381b;
        int i = this.f42380a;
        this.f42380a = i + 1;
        jArr[i] = j;
    }

    /* renamed from: a */
    public final long mo40806a(int i) {
        if (i >= 0 && i < this.f42380a) {
            return this.f42381b[i];
        }
        int i2 = this.f42380a;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Invalid size ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
