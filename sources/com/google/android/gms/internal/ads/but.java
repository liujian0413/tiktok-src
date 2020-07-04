package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;

@C6505uv
public final class but {

    /* renamed from: a */
    private final Object f43650a = new Object();

    /* renamed from: b */
    private buu f43651b = null;

    /* renamed from: c */
    private boolean f43652c = false;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41361a(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f43650a
            monitor-enter(r0)
            boolean r1 = r4.f43652c     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0032
            r1 = 0
            android.content.Context r2 = r5.getApplicationContext()     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x000f
            r2 = r5
        L_0x000f:
            boolean r3 = r2 instanceof android.app.Application     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x0016
            r1 = r2
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x0034 }
        L_0x0016:
            if (r1 != 0) goto L_0x001f
            java.lang.String r5 = "Can not cast Context to Application"
            com.google.android.gms.internal.ads.acd.m45783e(r5)     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x001f:
            com.google.android.gms.internal.ads.buu r2 = r4.f43651b     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.buu r2 = new com.google.android.gms.internal.ads.buu     // Catch:{ all -> 0x0034 }
            r2.<init>()     // Catch:{ all -> 0x0034 }
            r4.f43651b = r2     // Catch:{ all -> 0x0034 }
        L_0x002a:
            com.google.android.gms.internal.ads.buu r2 = r4.f43651b     // Catch:{ all -> 0x0034 }
            r2.mo41364a(r1, r5)     // Catch:{ all -> 0x0034 }
            r5 = 1
            r4.f43652c = r5     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.but.mo41361a(android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo41362a(buw buw) {
        synchronized (this.f43650a) {
            if (this.f43651b == null) {
                this.f43651b = new buu();
            }
            this.f43651b.mo41365a(buw);
        }
    }

    /* renamed from: a */
    public final Activity mo41360a() {
        synchronized (this.f43650a) {
            if (this.f43651b == null) {
                return null;
            }
            Activity activity = this.f43651b.f43653a;
            return activity;
        }
    }

    /* renamed from: b */
    public final Context mo41363b() {
        synchronized (this.f43650a) {
            if (this.f43651b == null) {
                return null;
            }
            Context context = this.f43651b.f43654b;
            return context;
        }
    }
}
