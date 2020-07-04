package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.db */
final class C16883db implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f47202a;

    /* renamed from: b */
    private final /* synthetic */ boolean f47203b;

    /* renamed from: c */
    private final /* synthetic */ zzag f47204c;

    /* renamed from: d */
    private final /* synthetic */ zzk f47205d;

    /* renamed from: e */
    private final /* synthetic */ String f47206e;

    /* renamed from: f */
    private final /* synthetic */ C16875cu f47207f;

    C16883db(C16875cu cuVar, boolean z, boolean z2, zzag zzag, zzk zzk, String str) {
        this.f47207f = cuVar;
        this.f47202a = z;
        this.f47203b = z2;
        this.f47204c = zzag;
        this.f47205d = zzk;
        this.f47206e = str;
    }

    public final void run() {
        C16944i d = this.f47207f.f47176c;
        if (d == null) {
            this.f47207f.mo43585q().f47487a.mo44160a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f47202a) {
            this.f47207f.mo43775a(d, this.f47203b ? null : this.f47204c, this.f47205d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f47206e)) {
                    d.mo43687a(this.f47204c, this.f47205d);
                } else {
                    d.mo43688a(this.f47204c, this.f47206e, this.f47207f.mo43585q().mo44156P_());
                }
            } catch (RemoteException e) {
                this.f47207f.mo43585q().f47487a.mo44161a("Failed to send event to the service", e);
            }
        }
        this.f47207f.m55701E();
    }
}
