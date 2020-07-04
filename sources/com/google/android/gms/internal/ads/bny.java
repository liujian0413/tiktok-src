package com.google.android.gms.internal.ads;

import java.io.IOException;

final class bny {

    /* renamed from: b */
    private static final long[] f42846b = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public int f42847a;

    /* renamed from: c */
    private final byte[] f42848c = new byte[8];

    /* renamed from: d */
    private int f42849d;

    /* renamed from: a */
    public final void mo41048a() {
        this.f42849d = 0;
        this.f42847a = 0;
    }

    /* renamed from: a */
    public final long mo41047a(bne bne, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.f42849d == 0) {
            if (!bne.mo41006a(this.f42848c, 0, 1, z)) {
                return -1;
            }
            this.f42847a = m49516a(this.f42848c[0] & 255);
            if (this.f42847a != -1) {
                this.f42849d = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        if (this.f42847a > i) {
            this.f42849d = 0;
            return -2;
        }
        if (this.f42847a != 1) {
            bne.mo41009b(this.f42848c, 1, this.f42847a - 1);
        }
        this.f42849d = 0;
        return m49517a(this.f42848c, this.f42847a, z2);
    }

    /* renamed from: a */
    public static int m49516a(int i) {
        for (int i2 = 0; i2 < f42846b.length; i2++) {
            if ((f42846b[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static long m49517a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= f42846b[i - 1] ^ -1;
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }
}
