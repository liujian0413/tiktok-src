package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.dc */
final class C16884dc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f47208a = true;

    /* renamed from: b */
    private final /* synthetic */ boolean f47209b;

    /* renamed from: c */
    private final /* synthetic */ zzo f47210c;

    /* renamed from: d */
    private final /* synthetic */ zzk f47211d;

    /* renamed from: e */
    private final /* synthetic */ zzo f47212e;

    /* renamed from: f */
    private final /* synthetic */ C16875cu f47213f;

    C16884dc(C16875cu cuVar, boolean z, boolean z2, zzo zzo, zzk zzk, zzo zzo2) {
        this.f47213f = cuVar;
        this.f47209b = z2;
        this.f47210c = zzo;
        this.f47211d = zzk;
        this.f47212e = zzo2;
    }

    public final void run() {
        C16944i d = this.f47213f.f47176c;
        if (d == null) {
            this.f47213f.mo43585q().f47487a.mo44160a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f47208a) {
            this.f47213f.mo43775a(d, this.f47209b ? null : this.f47210c, this.f47211d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f47212e.f47548a)) {
                    d.mo43692a(this.f47210c, this.f47211d);
                } else {
                    d.mo43691a(this.f47210c);
                }
            } catch (RemoteException e) {
                this.f47213f.mo43585q().f47487a.mo44161a("Failed to send conditional user property to the service", e);
            }
        }
        this.f47213f.m55701E();
    }
}
