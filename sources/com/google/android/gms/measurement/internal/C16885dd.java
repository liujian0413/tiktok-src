package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.dd */
final class C16885dd implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f47214a;

    /* renamed from: b */
    private final /* synthetic */ String f47215b;

    /* renamed from: c */
    private final /* synthetic */ String f47216c;

    /* renamed from: d */
    private final /* synthetic */ String f47217d;

    /* renamed from: e */
    private final /* synthetic */ zzk f47218e;

    /* renamed from: f */
    private final /* synthetic */ C16875cu f47219f;

    C16885dd(C16875cu cuVar, AtomicReference atomicReference, String str, String str2, String str3, zzk zzk) {
        this.f47219f = cuVar;
        this.f47214a = atomicReference;
        this.f47215b = str;
        this.f47216c = str2;
        this.f47217d = str3;
        this.f47218e = zzk;
    }

    public final void run() {
        synchronized (this.f47214a) {
            try {
                C16944i d = this.f47219f.f47176c;
                if (d == null) {
                    this.f47219f.mo43585q().f47487a.mo44163a("Failed to get conditional properties", C16953r.m56340a(this.f47215b), this.f47216c, this.f47217d);
                    this.f47214a.set(Collections.emptyList());
                    this.f47214a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f47215b)) {
                    this.f47214a.set(d.mo43682a(this.f47216c, this.f47217d, this.f47218e));
                } else {
                    this.f47214a.set(d.mo43683a(this.f47215b, this.f47216c, this.f47217d));
                }
                this.f47219f.m55701E();
                this.f47214a.notify();
            } catch (RemoteException e) {
                try {
                    this.f47219f.mo43585q().f47487a.mo44163a("Failed to get conditional properties", C16953r.m56340a(this.f47215b), this.f47216c, e);
                    this.f47214a.set(Collections.emptyList());
                    this.f47214a.notify();
                } catch (Throwable th) {
                    this.f47214a.notify();
                    throw th;
                }
            }
        }
    }
}
