package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.common.internal.C15231d.C15232a;
import com.google.android.gms.common.internal.C15231d.C15233b;

@C6505uv
public final class bvq {

    /* renamed from: a */
    private final Runnable f43718a = new bvr(this);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f43719b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public bvw f43720c;

    /* renamed from: d */
    private Context f43721d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public bvz f43722e;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41397a(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.f43719b
            monitor-enter(r0)
            android.content.Context r1 = r2.f43721d     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.f43721d = r3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C15585bw.f43895cj     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.bt r1 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo41272a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.m50169b()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C15585bw.f43894ci     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.bt r1 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo41272a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.bvs r3 = new com.google.android.gms.internal.ads.bvs     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.but r1 = com.google.android.gms.ads.internal.C14793ay.m42897c()     // Catch:{ all -> 0x0048 }
            r1.mo41362a(r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bvq.mo41397a(android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo41396a() {
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43896ck)).booleanValue()) {
            synchronized (this.f43719b) {
                m50169b();
                acl.f40003a.removeCallbacks(this.f43718a);
                acl.f40003a.postDelayed(this.f43718a, ((Long) bym.m50299d().mo41272a(C15585bw.f43897cl)).longValue());
            }
        }
    }

    /* renamed from: a */
    public final zzwo mo41395a(zzwr zzwr) {
        synchronized (this.f43719b) {
            if (this.f43722e == null) {
                zzwo zzwo = new zzwo();
                return zzwo;
            }
            try {
                zzwo a = this.f43722e.mo41404a(zzwr);
                return a;
            } catch (RemoteException e) {
                acd.m45778b("Unable to call into cache service.", e);
                return new zzwo();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m50169b() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f43719b
            monitor-enter(r0)
            android.content.Context r1 = r3.f43721d     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0023
            com.google.android.gms.internal.ads.bvw r1 = r3.f43720c     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0023
        L_0x000c:
            com.google.android.gms.internal.ads.bvt r1 = new com.google.android.gms.internal.ads.bvt     // Catch:{ all -> 0x0025 }
            r1.<init>(r3)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.bvu r2 = new com.google.android.gms.internal.ads.bvu     // Catch:{ all -> 0x0025 }
            r2.<init>(r3)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.bvw r1 = r3.m50165a(r1, r2)     // Catch:{ all -> 0x0025 }
            r3.f43720c = r1     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.bvw r1 = r3.f43720c     // Catch:{ all -> 0x0025 }
            r1.mo38565l()     // Catch:{ all -> 0x0025 }
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bvq.m50169b():void");
    }

    /* renamed from: a */
    private final synchronized bvw m50165a(C15232a aVar, C15233b bVar) {
        return new bvw(this.f43721d, C14793ay.m42908n().mo39258a(), aVar, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m50172c() {
        synchronized (this.f43719b) {
            if (this.f43720c != null) {
                if (this.f43720c.mo38560g() || this.f43720c.mo38561h()) {
                    this.f43720c.mo38559f();
                }
                this.f43720c = null;
                this.f43722e = null;
                Binder.flushPendingCommands();
            }
        }
    }
}
