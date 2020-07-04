package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C15231d.C15232a;
import com.google.android.gms.common.internal.C15231d.C15233b;
import com.google.android.gms.internal.ads.zzbo.zza;
import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class aow implements C15232a, C15233b {

    /* renamed from: a */
    private C15494api f40880a;

    /* renamed from: b */
    private final String f40881b;

    /* renamed from: c */
    private final String f40882c;

    /* renamed from: d */
    private final LinkedBlockingQueue<zza> f40883d;

    /* renamed from: e */
    private final HandlerThread f40884e = new HandlerThread("GassClient");

    public aow(Context context, String str, String str2) {
        this.f40881b = str;
        this.f40882c = str2;
        this.f40884e.start();
        this.f40880a = new C15494api(context, this.f40884e.getLooper(), this, this);
        this.f40883d = new LinkedBlockingQueue<>();
        this.f40880a.mo38565l();
    }

    /* renamed from: b */
    public final zza mo39913b(int i) {
        zza zza;
        try {
            zza = (zza) this.f40883d.poll(DouPlusShareGuideExperiment.MIN_VALID_DURATION, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zza = null;
        }
        return zza == null ? m46834c() : zza;
    }

    /* renamed from: a */
    private final apl m46832a() {
        try {
            return this.f40880a.mo39918q();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo38570a(int i) {
        try {
            this.f40883d.put(m46834c());
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        m46833b();
        r3.f40884e.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3.f40883d.put(m46834c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        m46833b();
        r3.f40884e.quit();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0025 A[ExcHandler: all (r4v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38571a(android.os.Bundle r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.apl r4 = r3.m46832a()
            if (r4 == 0) goto L_0x0043
            com.google.android.gms.internal.ads.zzbqo r0 = new com.google.android.gms.internal.ads.zzbqo     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.lang.String r1 = r3.f40881b     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.lang.String r2 = r3.f40882c     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            com.google.android.gms.internal.ads.zzbqq r4 = r4.mo39923a(r0)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            com.google.android.gms.internal.ads.zzbo$zza r4 = r4.mo42282a()     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.zzbo$zza> r0 = r3.f40883d     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r0.put(r4)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r3.m46833b()
            android.os.HandlerThread r4 = r3.f40884e
            r4.quit()
            return
        L_0x0025:
            r4 = move-exception
            goto L_0x0031
        L_0x0027:
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.zzbo$zza> r4 = r3.f40883d     // Catch:{ InterruptedException -> 0x003a, all -> 0x0025 }
            com.google.android.gms.internal.ads.zzbo$zza r0 = m46834c()     // Catch:{ InterruptedException -> 0x003a, all -> 0x0025 }
            r4.put(r0)     // Catch:{ InterruptedException -> 0x003a, all -> 0x0025 }
            goto L_0x003a
        L_0x0031:
            r3.m46833b()
            android.os.HandlerThread r0 = r3.f40884e
            r0.quit()
            throw r4
        L_0x003a:
            r3.m46833b()
            android.os.HandlerThread r4 = r3.f40884e
            r4.quit()
            return
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aow.mo38571a(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo38572a(ConnectionResult connectionResult) {
        try {
            this.f40883d.put(m46834c());
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: b */
    private final void m46833b() {
        if (this.f40880a == null) {
            return;
        }
        if (this.f40880a.mo38560g() || this.f40880a.mo38561h()) {
            this.f40880a.mo38559f();
        }
    }

    /* renamed from: c */
    private static zza m46834c() {
        C16247a d = zza.m52760d();
        d.mo42234j(32768);
        return (zza) ((axu) d.mo40293e());
    }
}
