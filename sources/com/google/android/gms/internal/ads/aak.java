package com.google.android.gms.internal.ads;

import android.content.Context;

@C6505uv
public final class aak implements buf {

    /* renamed from: a */
    public String f39804a;

    /* renamed from: b */
    private final Context f39805b;

    /* renamed from: c */
    private final Object f39806c;

    /* renamed from: d */
    private boolean f39807d;

    public aak(Context context, String str) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f39805b = context;
        this.f39804a = str;
        this.f39807d = false;
        this.f39806c = new Object();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39037a(boolean r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.aal r0 = com.google.android.gms.ads.internal.C14793ay.m42913s()
            android.content.Context r1 = r3.f39805b
            boolean r0 = r0.mo39043a(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Object r0 = r3.f39806c
            monitor-enter(r0)
            boolean r1 = r3.f39807d     // Catch:{ all -> 0x003f }
            if (r1 != r4) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0016:
            r3.f39807d = r4     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r3.f39804a     // Catch:{ all -> 0x003f }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0022
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0022:
            boolean r4 = r3.f39807d     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0032
            com.google.android.gms.internal.ads.aal r4 = com.google.android.gms.ads.internal.C14793ay.m42913s()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f39805b     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f39804a     // Catch:{ all -> 0x003f }
            r4.mo39039a(r1, r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0032:
            com.google.android.gms.internal.ads.aal r4 = com.google.android.gms.ads.internal.C14793ay.m42913s()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f39805b     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f39804a     // Catch:{ all -> 0x003f }
            r4.mo39045b(r1, r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aak.mo39037a(boolean):void");
    }

    /* renamed from: a */
    public final void mo39036a(bue bue) {
        mo39037a(bue.f43595a);
    }
}
