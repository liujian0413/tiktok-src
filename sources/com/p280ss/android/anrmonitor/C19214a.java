package com.p280ss.android.anrmonitor;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ss.android.anrmonitor.a */
public final class C19214a extends Thread {

    /* renamed from: h */
    private static final C19218a f51875h = new C19218a() {
        /* renamed from: a */
        public final void mo50918a(ANRError aNRError, int i) {
            throw aNRError;
        }
    };

    /* renamed from: i */
    private static final C19219b f51876i = new C19219b() {
    };

    /* renamed from: a */
    public volatile int f51877a;

    /* renamed from: b */
    private C19218a f51878b;

    /* renamed from: c */
    private C19219b f51879c;

    /* renamed from: d */
    private final Handler f51880d;

    /* renamed from: e */
    private final int f51881e;

    /* renamed from: f */
    private final int f51882f;

    /* renamed from: g */
    private final Runnable f51883g;

    /* renamed from: com.ss.android.anrmonitor.a$a */
    public interface C19218a {
        /* renamed from: a */
        void mo50918a(ANRError aNRError, int i);
    }

    /* renamed from: com.ss.android.anrmonitor.a$b */
    public interface C19219b {
    }

    public C19214a() {
        this(5000, 3000);
    }

    public final void run() {
        setName("|ANR-Monitor|");
        while (!isInterrupted()) {
            int i = this.f51877a;
            this.f51880d.post(this.f51883g);
            try {
                Thread.sleep((long) this.f51882f);
                if (!Debug.isDebuggerConnected()) {
                    if (this.f51877a == i) {
                        this.f51878b.mo50918a(ANRError.NewMainOnly(), 2);
                        return;
                    }
                    try {
                        Thread.sleep((long) (this.f51881e - this.f51882f));
                        if (this.f51877a == i) {
                            this.f51878b.mo50918a(ANRError.NewMainOnly(), 1);
                            return;
                        }
                    } catch (InterruptedException unused) {
                        return;
                    }
                } else {
                    return;
                }
            } catch (InterruptedException unused2) {
                return;
            }
        }
    }

    /* renamed from: a */
    public final C19214a mo50915a(C19218a aVar) {
        this.f51878b = aVar;
        return this;
    }

    public C19214a(int i, int i2) {
        this.f51878b = f51875h;
        this.f51879c = f51876i;
        this.f51880d = new Handler(Looper.getMainLooper());
        this.f51877a = 0;
        this.f51883g = new Runnable() {
            public final void run() {
                C19214a.this.f51877a = (C19214a.this.f51877a + 1) % 10;
            }
        };
        if (i2 >= i) {
            this.f51881e = 5000;
            this.f51882f = 3000;
            return;
        }
        this.f51881e = i;
        this.f51882f = i2;
    }
}
