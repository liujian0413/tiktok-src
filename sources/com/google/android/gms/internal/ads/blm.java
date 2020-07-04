package com.google.android.gms.internal.ads;

public abstract class blm {

    /* renamed from: a */
    public static final blm f42506a = new bln();

    /* renamed from: a */
    public abstract int mo40903a(Object obj);

    /* renamed from: a */
    public abstract blo mo40904a(int i, blo blo, boolean z);

    /* renamed from: a */
    public abstract blp mo40906a(int i, blp blp, boolean z, long j);

    /* renamed from: b */
    public abstract int mo40908b();

    /* renamed from: c */
    public abstract int mo40909c();

    /* renamed from: a */
    public final boolean mo40907a() {
        return mo40908b() == 0;
    }

    /* renamed from: a */
    public final blp mo40905a(int i, blp blp, boolean z) {
        return mo40906a(i, blp, false, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if ((mo40908b() - 1) == 0) goto L_0x001b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo40902a(int r2, com.google.android.gms.internal.ads.blo r3, com.google.android.gms.internal.ads.blp r4, int r5) {
        /*
            r1 = this;
            r0 = 0
            r1.mo40904a(r2, r3, r0)
            r1.mo40905a(r0, r4, r0)
            r3 = 1
            if (r2 != 0) goto L_0x002c
            r2 = -1
            switch(r5) {
                case 0: goto L_0x001d;
                case 1: goto L_0x001b;
                case 2: goto L_0x0014;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>()
            throw r2
        L_0x0014:
            int r5 = r1.mo40908b()
            int r5 = r5 - r3
            if (r5 != 0) goto L_0x0025
        L_0x001b:
            r3 = 0
            goto L_0x0025
        L_0x001d:
            int r5 = r1.mo40908b()
            int r5 = r5 - r3
            if (r5 != 0) goto L_0x0025
            r3 = -1
        L_0x0025:
            if (r3 != r2) goto L_0x0028
            return r2
        L_0x0028:
            r1.mo40905a(r3, r4, r0)
            return r0
        L_0x002c:
            int r2 = r2 + r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.blm.mo40902a(int, com.google.android.gms.internal.ads.blo, com.google.android.gms.internal.ads.blp, int):int");
    }
}
