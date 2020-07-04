package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.internal.measurement.C16439ce;

/* renamed from: com.google.android.gms.measurement.internal.fc */
abstract class C16939fc {

    /* renamed from: b */
    private static volatile Handler f47374b;

    /* renamed from: a */
    private final C16850bw f47375a;

    /* renamed from: c */
    private final Runnable f47376c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile long f47377d;

    C16939fc(C16850bw bwVar) {
        C15267r.m44384a(bwVar);
        this.f47375a = bwVar;
        this.f47376c = new C16940fd(this, bwVar);
    }

    /* renamed from: a */
    public abstract void mo43787a();

    /* renamed from: a */
    public final void mo44126a(long j) {
        mo44128c();
        if (j >= 0) {
            this.f47377d = this.f47375a.mo43580l().mo38684a();
            if (!m56202d().postDelayed(this.f47376c, j)) {
                this.f47375a.mo43585q().f47487a.mo44161a("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: b */
    public final boolean mo44127b() {
        return this.f47377d != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo44128c() {
        this.f47377d = 0;
        m56202d().removeCallbacks(this.f47376c);
    }

    /* renamed from: d */
    private final Handler m56202d() {
        Handler handler;
        if (f47374b != null) {
            return f47374b;
        }
        synchronized (C16939fc.class) {
            if (f47374b == null) {
                f47374b = new C16439ce(this.f47375a.mo43581m().getMainLooper());
            }
            handler = f47374b;
        }
        return handler;
    }
}
