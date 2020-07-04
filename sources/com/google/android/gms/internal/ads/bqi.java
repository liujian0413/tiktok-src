package com.google.android.gms.internal.ads;

public final class bqi extends blm {

    /* renamed from: b */
    private static final Object f43244b = new Object();

    /* renamed from: c */
    private final long f43245c;

    /* renamed from: d */
    private final long f43246d;

    /* renamed from: e */
    private final boolean f43247e;

    public bqi(long j, boolean z) {
        this(j, j, 0, 0, z, false);
    }

    /* renamed from: b */
    public final int mo40908b() {
        return 1;
    }

    /* renamed from: c */
    public final int mo40909c() {
        return 1;
    }

    private bqi(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f43245c = j;
        this.f43246d = j2;
        this.f43247e = z;
    }

    /* renamed from: a */
    public final blp mo40906a(int i, blp blp, boolean z, long j) {
        brr.m49868a(i, 0, 1);
        boolean z2 = this.f43247e;
        long j2 = this.f43246d;
        blp.f42513a = null;
        blp.f42514b = -9223372036854775807L;
        blp.f42515c = -9223372036854775807L;
        blp.f42516d = z2;
        blp.f42517e = false;
        blp.f42520h = 0;
        blp.f42521i = j2;
        blp.f42518f = 0;
        blp.f42519g = 0;
        blp.f42522j = 0;
        return blp;
    }

    /* renamed from: a */
    public final blo mo40904a(int i, blo blo, boolean z) {
        brr.m49868a(i, 0, 1);
        Object obj = z ? f43244b : null;
        return blo.mo40911a(obj, obj, 0, this.f43245c, 0, false);
    }

    /* renamed from: a */
    public final int mo40903a(Object obj) {
        return f43244b.equals(obj) ? 0 : -1;
    }
}
