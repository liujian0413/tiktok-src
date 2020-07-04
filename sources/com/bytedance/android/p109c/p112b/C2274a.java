package com.bytedance.android.p109c.p112b;

/* renamed from: com.bytedance.android.c.b.a */
final class C2274a {
    /* renamed from: a */
    static long m9790a(byte[] bArr, int i, int i2) {
        long j = 0;
        long j2 = 1;
        for (int i3 = i; i3 < i + i2; i3++) {
            j2 = (j2 + ((long) bArr[i3])) % 65521;
            j = (j + j2) % 65521;
        }
        return (j << 16) + j2;
    }
}
