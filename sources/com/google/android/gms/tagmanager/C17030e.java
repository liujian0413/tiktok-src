package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.p742b.C14733a.C14734a;
import com.google.android.gms.common.util.C15322e;
import com.google.android.gms.common.util.C15325h;

/* renamed from: com.google.android.gms.tagmanager.e */
public final class C17030e {

    /* renamed from: l */
    private static Object f47694l = new Object();

    /* renamed from: m */
    private static C17030e f47695m;

    /* renamed from: a */
    private volatile long f47696a;

    /* renamed from: b */
    private volatile long f47697b;

    /* renamed from: c */
    private volatile boolean f47698c;

    /* renamed from: d */
    private volatile C14734a f47699d;

    /* renamed from: e */
    private volatile long f47700e;

    /* renamed from: f */
    private volatile long f47701f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f47702g;

    /* renamed from: h */
    private final C15322e f47703h;

    /* renamed from: i */
    private final Thread f47704i;

    /* renamed from: j */
    private final Object f47705j;

    /* renamed from: k */
    private C17051z f47706k;

    /* renamed from: a */
    public static C17030e m56532a(Context context) {
        if (f47695m == null) {
            synchronized (f47694l) {
                if (f47695m == null) {
                    C17030e eVar = new C17030e(context);
                    f47695m = eVar;
                    eVar.f47704i.start();
                }
            }
        }
        return f47695m;
    }

    private C17030e(Context context) {
        this(context, null, C15325h.m44574d());
    }

    private C17030e(Context context, C17051z zVar, C15322e eVar) {
        this.f47696a = 900000;
        this.f47697b = 30000;
        this.f47705j = new Object();
        this.f47706k = new C17042q(this);
        this.f47703h = eVar;
        if (context != null) {
            this.f47702g = context.getApplicationContext();
        } else {
            this.f47702g = context;
        }
        this.f47700e = this.f47703h.mo38684a();
        this.f47704i = new Thread(new C17048w(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m56533b() {
        Process.setThreadPriority(10);
        while (!this.f47698c) {
            C14734a a = this.f47706k.mo44273a();
            if (a != null) {
                this.f47699d = a;
                this.f47701f = this.f47703h.mo38684a();
            }
            synchronized (this) {
                notifyAll();
            }
            try {
                synchronized (this.f47705j) {
                    this.f47705j.wait(this.f47696a);
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo44261a() {
        this.f47698c = true;
        this.f47704i.interrupt();
    }
}
