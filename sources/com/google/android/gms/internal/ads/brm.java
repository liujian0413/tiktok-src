package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class brm {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ExecutorService f43352a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public bro<? extends brp> f43353b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public IOException f43354c;

    public brm(String str) {
        this.f43352a = bsf.m49938a(str);
    }

    /* renamed from: a */
    public final <T extends brp> long mo41202a(T t, brn<T> brn, int i) {
        Looper myLooper = Looper.myLooper();
        brr.m49873b(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bro bro = new bro(this, myLooper, t, brn, i, elapsedRealtime);
        bro.mo41206a(0);
        return elapsedRealtime;
    }

    /* renamed from: a */
    public final boolean mo41204a() {
        return this.f43353b != null;
    }

    /* renamed from: b */
    public final void mo41205b() {
        this.f43353b.mo41207a(false);
    }

    /* renamed from: a */
    public final void mo41203a(Runnable runnable) {
        if (this.f43353b != null) {
            this.f43353b.mo41207a(true);
        }
        this.f43352a.execute(runnable);
        this.f43352a.shutdown();
    }
}
