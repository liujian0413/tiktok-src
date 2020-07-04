package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ml */
final class C15872ml implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15883mw f44657a;

    /* renamed from: b */
    private final /* synthetic */ C15851lr f44658b;

    /* renamed from: c */
    private final /* synthetic */ C15863mc f44659c;

    C15872ml(C15863mc mcVar, C15883mw mwVar, C15851lr lrVar) {
        this.f44659c = mcVar;
        this.f44657a = mwVar;
        this.f44658b = lrVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.mc r0 = r3.f44659c
            java.lang.Object r0 = r0.f44630a
            monitor-enter(r0)
            com.google.android.gms.internal.ads.mw r1 = r3.f44657a     // Catch:{ all -> 0x0036 }
            int r1 = r1.mo39344e()     // Catch:{ all -> 0x0036 }
            r2 = -1
            if (r1 == r2) goto L_0x0034
            com.google.android.gms.internal.ads.mw r1 = r3.f44657a     // Catch:{ all -> 0x0036 }
            int r1 = r1.mo39344e()     // Catch:{ all -> 0x0036 }
            r2 = 1
            if (r1 != r2) goto L_0x001a
            goto L_0x0034
        L_0x001a:
            com.google.android.gms.internal.ads.mw r1 = r3.f44657a     // Catch:{ all -> 0x0036 }
            r1.mo39343d()     // Catch:{ all -> 0x0036 }
            java.util.concurrent.Executor r1 = com.google.android.gms.internal.ads.ago.f40189a     // Catch:{ all -> 0x0036 }
            com.google.android.gms.internal.ads.lr r2 = r3.f44658b     // Catch:{ all -> 0x0036 }
            r2.getClass()     // Catch:{ all -> 0x0036 }
            java.lang.Runnable r2 = com.google.android.gms.internal.ads.C15873mm.m51343a(r2)     // Catch:{ all -> 0x0036 }
            r1.execute(r2)     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "Could not receive loaded message in a timely manner. Rejecting."
            com.google.android.gms.internal.ads.acd.m45438a(r1)     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            return
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            return
        L_0x0036:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15872ml.run():void");
    }
}
