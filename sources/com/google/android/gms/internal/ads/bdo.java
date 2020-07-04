package com.google.android.gms.internal.ads;

final class bdo implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bdm f41703a;

    bdo(bdm bdm) {
        this.f41703a = bdm;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:10|11|12|(2:16|17)|18|19|20|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.bdm r0 = r7.f41703a
            java.lang.Boolean r0 = r0.f41694b
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            android.os.ConditionVariable r0 = com.google.android.gms.internal.ads.bdm.f41692d
            monitor-enter(r0)
            com.google.android.gms.internal.ads.bdm r1 = r7.f41703a     // Catch:{ all -> 0x004d }
            java.lang.Boolean r1 = r1.f41694b     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x0014
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x0014:
            r1 = 0
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.C15585bw.f43849bq     // Catch:{ IllegalStateException -> 0x0026 }
            com.google.android.gms.internal.ads.bt r3 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ IllegalStateException -> 0x0026 }
            java.lang.Object r2 = r3.mo41272a(r2)     // Catch:{ IllegalStateException -> 0x0026 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ IllegalStateException -> 0x0026 }
            boolean r2 = r2.booleanValue()     // Catch:{ IllegalStateException -> 0x0026 }
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            if (r2 == 0) goto L_0x003b
            com.google.android.gms.internal.ads.bwp r3 = new com.google.android.gms.internal.ads.bwp     // Catch:{ Throwable -> 0x003c }
            com.google.android.gms.internal.ads.bdm r4 = r7.f41703a     // Catch:{ Throwable -> 0x003c }
            com.google.android.gms.internal.ads.beh r4 = r4.f41695c     // Catch:{ Throwable -> 0x003c }
            android.content.Context r4 = r4.f41760a     // Catch:{ Throwable -> 0x003c }
            java.lang.String r5 = "ADSHIELD"
            r6 = 0
            r3.<init>(r4, r5, r6)     // Catch:{ Throwable -> 0x003c }
            com.google.android.gms.internal.ads.bdm.f41691a = r3     // Catch:{ Throwable -> 0x003c }
        L_0x003b:
            r1 = r2
        L_0x003c:
            com.google.android.gms.internal.ads.bdm r2 = r7.f41703a     // Catch:{ all -> 0x004d }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x004d }
            r2.f41694b = r1     // Catch:{ all -> 0x004d }
            android.os.ConditionVariable r1 = com.google.android.gms.internal.ads.bdm.f41692d     // Catch:{ all -> 0x004d }
            r1.open()     // Catch:{ all -> 0x004d }
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x004d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bdo.run():void");
    }
}
