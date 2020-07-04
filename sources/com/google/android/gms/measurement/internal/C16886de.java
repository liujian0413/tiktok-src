package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.de */
final class C16886de implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f47220a;

    /* renamed from: b */
    private final /* synthetic */ String f47221b;

    /* renamed from: c */
    private final /* synthetic */ String f47222c;

    /* renamed from: d */
    private final /* synthetic */ String f47223d;

    /* renamed from: e */
    private final /* synthetic */ boolean f47224e;

    /* renamed from: f */
    private final /* synthetic */ zzk f47225f;

    /* renamed from: g */
    private final /* synthetic */ C16875cu f47226g;

    C16886de(C16875cu cuVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z, zzk zzk) {
        this.f47226g = cuVar;
        this.f47220a = atomicReference;
        this.f47221b = str;
        this.f47222c = str2;
        this.f47223d = str3;
        this.f47224e = z;
        this.f47225f = zzk;
    }

    public final void run() {
        synchronized (this.f47220a) {
            try {
                C16944i d = this.f47226g.f47176c;
                if (d == null) {
                    this.f47226g.mo43585q().f47487a.mo44163a("Failed to get user properties", C16953r.m56340a(this.f47221b), this.f47222c, this.f47223d);
                    this.f47220a.set(Collections.emptyList());
                    this.f47220a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f47221b)) {
                    this.f47220a.set(d.mo43685a(this.f47222c, this.f47223d, this.f47224e, this.f47225f));
                } else {
                    this.f47220a.set(d.mo43684a(this.f47221b, this.f47222c, this.f47223d, this.f47224e));
                }
                this.f47226g.m55701E();
                this.f47220a.notify();
            } catch (RemoteException e) {
                try {
                    this.f47226g.mo43585q().f47487a.mo44163a("Failed to get user properties", C16953r.m56340a(this.f47221b), this.f47222c, e);
                    this.f47220a.set(Collections.emptyList());
                    this.f47220a.notify();
                } catch (Throwable th) {
                    this.f47220a.notify();
                    throw th;
                }
            }
        }
    }
}
