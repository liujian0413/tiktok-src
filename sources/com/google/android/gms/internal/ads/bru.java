package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class bru {

    /* renamed from: a */
    public int f43368a;

    /* renamed from: b */
    private long[] f43369b;

    public bru() {
        this(32);
    }

    private bru(int i) {
        this.f43369b = new long[32];
    }

    /* renamed from: a */
    public final void mo41214a(long j) {
        if (this.f43368a == this.f43369b.length) {
            this.f43369b = Arrays.copyOf(this.f43369b, this.f43368a << 1);
        }
        long[] jArr = this.f43369b;
        int i = this.f43368a;
        this.f43368a = i + 1;
        jArr[i] = j;
    }

    /* renamed from: a */
    public final long mo41213a(int i) {
        if (i >= 0 && i < this.f43368a) {
            return this.f43369b[i];
        }
        int i2 = this.f43368a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
