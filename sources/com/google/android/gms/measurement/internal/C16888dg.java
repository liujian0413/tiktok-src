package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C15231d.C15232a;
import com.google.android.gms.common.internal.C15231d.C15233b;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.stats.C15307a;

/* renamed from: com.google.android.gms.measurement.internal.dg */
public final class C16888dg implements ServiceConnection, C15232a, C15233b {

    /* renamed from: a */
    final /* synthetic */ C16875cu f47231a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile boolean f47232b;

    /* renamed from: c */
    private volatile C16952q f47233c;

    protected C16888dg(C16875cu cuVar) {
        this.f47231a = cuVar;
    }

    /* renamed from: a */
    public final void mo43801a(Intent intent) {
        this.f47231a.mo43571c();
        Context m = this.f47231a.mo43581m();
        C15307a a = C15307a.m44540a();
        synchronized (this) {
            if (this.f47232b) {
                this.f47231a.mo43585q().f47495i.mo44160a("Connection attempt already in progress");
                return;
            }
            this.f47231a.mo43585q().f47495i.mo44160a("Using local app measurement service");
            this.f47232b = true;
            a.mo38676a(m, intent, this.f47231a.f47175b, 129);
        }
    }

    /* renamed from: a */
    public final void mo43800a() {
        if (this.f47233c != null && (this.f47233c.mo38560g() || this.f47233c.mo38561h())) {
            this.f47233c.mo38559f();
        }
        this.f47233c = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.f47231a.mo43585q().f47487a.mo44160a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x005d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C15267r.m44393b(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001d
            r3.f47232b = r4     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.cu r4 = r3.f47231a     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.r r4 = r4.mo43585q()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.t r4 = r4.f47487a     // Catch:{ all -> 0x001a }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo44160a(r5)     // Catch:{ all -> 0x001a }
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r4 = move-exception
            goto L_0x0091
        L_0x001d:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x005d }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x005d }
            if (r2 == 0) goto L_0x004f
            if (r5 != 0) goto L_0x002d
            goto L_0x0041
        L_0x002d:
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x005d }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.C16944i     // Catch:{ RemoteException -> 0x005d }
            if (r2 == 0) goto L_0x003b
            com.google.android.gms.measurement.internal.i r1 = (com.google.android.gms.measurement.internal.C16944i) r1     // Catch:{ RemoteException -> 0x005d }
        L_0x0039:
            r0 = r1
            goto L_0x0041
        L_0x003b:
            com.google.android.gms.measurement.internal.k r1 = new com.google.android.gms.measurement.internal.k     // Catch:{ RemoteException -> 0x005d }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x005d }
            goto L_0x0039
        L_0x0041:
            com.google.android.gms.measurement.internal.cu r5 = r3.f47231a     // Catch:{ RemoteException -> 0x005d }
            com.google.android.gms.measurement.internal.r r5 = r5.mo43585q()     // Catch:{ RemoteException -> 0x005d }
            com.google.android.gms.measurement.internal.t r5 = r5.f47495i     // Catch:{ RemoteException -> 0x005d }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo44160a(r1)     // Catch:{ RemoteException -> 0x005d }
            goto L_0x006a
        L_0x004f:
            com.google.android.gms.measurement.internal.cu r5 = r3.f47231a     // Catch:{ RemoteException -> 0x005d }
            com.google.android.gms.measurement.internal.r r5 = r5.mo43585q()     // Catch:{ RemoteException -> 0x005d }
            com.google.android.gms.measurement.internal.t r5 = r5.f47487a     // Catch:{ RemoteException -> 0x005d }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo44161a(r2, r1)     // Catch:{ RemoteException -> 0x005d }
            goto L_0x006a
        L_0x005d:
            com.google.android.gms.measurement.internal.cu r5 = r3.f47231a     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.r r5 = r5.mo43585q()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.t r5 = r5.f47487a     // Catch:{ all -> 0x001a }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo44160a(r1)     // Catch:{ all -> 0x001a }
        L_0x006a:
            if (r0 != 0) goto L_0x0081
            r3.f47232b = r4     // Catch:{ all -> 0x001a }
            com.google.android.gms.common.stats.C15307a.m44540a()     // Catch:{ IllegalArgumentException -> 0x008f }
            com.google.android.gms.measurement.internal.cu r4 = r3.f47231a     // Catch:{ IllegalArgumentException -> 0x008f }
            android.content.Context r4 = r4.mo43581m()     // Catch:{ IllegalArgumentException -> 0x008f }
            com.google.android.gms.measurement.internal.cu r5 = r3.f47231a     // Catch:{ IllegalArgumentException -> 0x008f }
            com.google.android.gms.measurement.internal.dg r5 = r5.f47175b     // Catch:{ IllegalArgumentException -> 0x008f }
            com.google.android.gms.common.stats.C15307a.m44541a(r4, r5)     // Catch:{ IllegalArgumentException -> 0x008f }
            goto L_0x008f
        L_0x0081:
            com.google.android.gms.measurement.internal.cu r4 = r3.f47231a     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.at r4 = r4.mo43584p()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.dh r5 = new com.google.android.gms.measurement.internal.dh     // Catch:{ all -> 0x001a }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001a }
            r4.mo43645a(r5)     // Catch:{ all -> 0x001a }
        L_0x008f:
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            return
        L_0x0091:
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16888dg.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C15267r.m44393b("MeasurementServiceConnection.onServiceDisconnected");
        this.f47231a.mo43585q().f47494h.mo44160a("Service disconnected");
        this.f47231a.mo43584p().mo43645a((Runnable) new C16890di(this, componentName));
    }

    /* renamed from: b */
    public final void mo43802b() {
        this.f47231a.mo43571c();
        Context m = this.f47231a.mo43581m();
        synchronized (this) {
            if (this.f47232b) {
                this.f47231a.mo43585q().f47495i.mo44160a("Connection attempt already in progress");
            } else if (this.f47233c == null || (!this.f47233c.mo38561h() && !this.f47233c.mo38560g())) {
                this.f47233c = new C16952q(m, Looper.getMainLooper(), this, this);
                this.f47231a.mo43585q().f47495i.mo44160a("Connecting to remote service");
                this.f47232b = true;
                this.f47233c.mo38565l();
            } else {
                this.f47231a.mo43585q().f47495i.mo44160a("Already awaiting connection attempt");
            }
        }
    }

    /* renamed from: a */
    public final void mo38571a(Bundle bundle) {
        C15267r.m44393b("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f47231a.mo43584p().mo43645a((Runnable) new C16891dj(this, (C16944i) this.f47233c.mo38568o()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f47233c = null;
                this.f47232b = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo38570a(int i) {
        C15267r.m44393b("MeasurementServiceConnection.onConnectionSuspended");
        this.f47231a.mo43585q().f47494h.mo44160a("Service connection suspended");
        this.f47231a.mo43584p().mo43645a((Runnable) new C16892dk(this));
    }

    /* renamed from: a */
    public final void mo38572a(ConnectionResult connectionResult) {
        C15267r.m44393b("MeasurementServiceConnection.onConnectionFailed");
        C16953r c = this.f47231a.f47095q.mo43659c();
        if (c != null) {
            c.f47490d.mo44161a("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f47232b = false;
            this.f47233c = null;
        }
        this.f47231a.mo43584p().mo43645a((Runnable) new C16893dl(this));
    }
}
