package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class aqe<P> {

    /* renamed from: a */
    public final P f40909a;

    /* renamed from: b */
    public final zzbwz f40910b;

    /* renamed from: c */
    private final byte[] f40911c;

    /* renamed from: d */
    private final zzbwh f40912d;

    public aqe(P p, byte[] bArr, zzbwh zzbwh, zzbwz zzbwz) {
        this.f40909a = p;
        this.f40911c = Arrays.copyOf(bArr, bArr.length);
        this.f40912d = zzbwh;
        this.f40910b = zzbwz;
    }

    /* renamed from: a */
    public final byte[] mo39949a() {
        if (this.f40911c == null) {
            return null;
        }
        return Arrays.copyOf(this.f40911c, this.f40911c.length);
    }
}
