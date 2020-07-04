package com.google.android.gms.internal.measurement;

import android.os.Handler;
import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.android.gms.internal.measurement.at */
abstract class C16400at {

    /* renamed from: b */
    private static volatile Handler f45891b;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C16697t f45892a;

    /* renamed from: c */
    private final Runnable f45893c = new C16401au(this);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile long f45894d;

    C16400at(C16697t tVar) {
        C15267r.m44384a(tVar);
        this.f45892a = tVar;
    }

    /* renamed from: a */
    public abstract void mo42504a();

    /* renamed from: a */
    public final void mo42521a(long j) {
        mo42525d();
        if (j >= 0) {
            this.f45894d = this.f45892a.f46641c.mo38684a();
            if (!m53445e().postDelayed(this.f45893c, j)) {
                this.f45892a.mo43216a().mo43201e("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: b */
    public final void mo42523b(long j) {
        if (mo42524c()) {
            if (j < 0) {
                mo42525d();
                return;
            }
            long abs = j - Math.abs(this.f45892a.f46641c.mo38684a() - this.f45894d);
            if (abs < 0) {
                abs = 0;
            }
            m53445e().removeCallbacks(this.f45893c);
            if (!m53445e().postDelayed(this.f45893c, abs)) {
                this.f45892a.mo43216a().mo43201e("Failed to adjust delayed post. time", Long.valueOf(abs));
            }
        }
    }

    /* renamed from: b */
    public final long mo42522b() {
        if (this.f45894d == 0) {
            return 0;
        }
        return Math.abs(this.f45892a.f46641c.mo38684a() - this.f45894d);
    }

    /* renamed from: c */
    public final boolean mo42524c() {
        return this.f45894d != 0;
    }

    /* renamed from: d */
    public final void mo42525d() {
        this.f45894d = 0;
        m53445e().removeCallbacks(this.f45893c);
    }

    /* renamed from: e */
    private final Handler m53445e() {
        Handler handler;
        if (f45891b != null) {
            return f45891b;
        }
        synchronized (C16400at.class) {
            if (f45891b == null) {
                f45891b = new C16439ce(this.f45892a.f46639a.getMainLooper());
            }
            handler = f45891b;
        }
        return handler;
    }
}
