package com.google.android.gms.internal.ads;

import android.content.Context;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.sq */
public abstract class C16039sq extends abz {

    /* renamed from: a */
    protected final C16043su f44976a;

    /* renamed from: b */
    protected final Context f44977b;

    /* renamed from: c */
    protected final Object f44978c = new Object();

    /* renamed from: d */
    protected final Object f44979d = new Object();

    /* renamed from: e */
    protected final abk f44980e;

    /* renamed from: f */
    protected zzaxi f44981f;

    protected C16039sq(Context context, abk abk, C16043su suVar) {
        super(true);
        this.f44977b = context;
        this.f44980e = abk;
        this.f44981f = abk.f39888b;
        this.f44976a = suVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract abj mo41969a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo41970a(long j) throws zzaug;

    /* renamed from: u_ */
    public void mo37836u_() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[Catch:{ zzaug -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b A[Catch:{ zzaug -> 0x0014 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37835a() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f44978c
            monitor-enter(r0)
            java.lang.String r1 = "AdRendererBackgroundTask started."
            com.google.android.gms.internal.ads.acd.m45777b(r1)     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.abk r1 = r5.f44980e     // Catch:{ all -> 0x0061 }
            int r1 = r1.f39891e     // Catch:{ all -> 0x0061 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ zzaug -> 0x0014 }
            r5.mo41970a(r2)     // Catch:{ zzaug -> 0x0014 }
            goto L_0x0051
        L_0x0014:
            r1 = move-exception
            int r2 = r1.getErrorCode()     // Catch:{ all -> 0x0061 }
            r3 = 3
            if (r2 == r3) goto L_0x0028
            r3 = -1
            if (r2 != r3) goto L_0x0020
            goto L_0x0028
        L_0x0020:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.acd.m45783e(r1)     // Catch:{ all -> 0x0061 }
            goto L_0x002f
        L_0x0028:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.acd.m45781d(r1)     // Catch:{ all -> 0x0061 }
        L_0x002f:
            com.google.android.gms.internal.ads.zzaxi r1 = r5.f44981f     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x003b
            com.google.android.gms.internal.ads.zzaxi r1 = new com.google.android.gms.internal.ads.zzaxi     // Catch:{ all -> 0x0061 }
            r1.<init>(r2)     // Catch:{ all -> 0x0061 }
            r5.f44981f = r1     // Catch:{ all -> 0x0061 }
            goto L_0x0046
        L_0x003b:
            com.google.android.gms.internal.ads.zzaxi r1 = new com.google.android.gms.internal.ads.zzaxi     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.zzaxi r3 = r5.f44981f     // Catch:{ all -> 0x0061 }
            long r3 = r3.f45633j     // Catch:{ all -> 0x0061 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0061 }
            r5.f44981f = r1     // Catch:{ all -> 0x0061 }
        L_0x0046:
            android.os.Handler r1 = com.google.android.gms.internal.ads.acl.f40003a     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.sr r3 = new com.google.android.gms.internal.ads.sr     // Catch:{ all -> 0x0061 }
            r3.<init>(r5)     // Catch:{ all -> 0x0061 }
            r1.post(r3)     // Catch:{ all -> 0x0061 }
            r1 = r2
        L_0x0051:
            com.google.android.gms.internal.ads.abj r1 = r5.mo41969a(r1)     // Catch:{ all -> 0x0061 }
            android.os.Handler r2 = com.google.android.gms.internal.ads.acl.f40003a     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.ss r3 = new com.google.android.gms.internal.ads.ss     // Catch:{ all -> 0x0061 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0061 }
            r2.post(r3)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return
        L_0x0061:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16039sq.mo37835a():void");
    }
}
