package com.p280ss.android.p817ad.splash.core;

import com.p280ss.android.p817ad.splash.core.p828c.C19001b;

/* renamed from: com.ss.android.ad.splash.core.e */
public class C19022e {

    /* renamed from: a */
    private static volatile C19022e f51365a;

    /* renamed from: b */
    private volatile C19001b f51366b;

    /* renamed from: c */
    private long f51367c;

    private C19022e() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo50517c() {
        this.f51366b = null;
        this.f51367c = 0;
    }

    /* renamed from: a */
    public static C19022e m62080a() {
        if (f51365a == null) {
            synchronized (C19022e.class) {
                if (f51365a == null) {
                    f51365a = new C19022e();
                }
            }
        }
        return f51365a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C19001b mo50516b() {
        if (Math.abs(System.currentTimeMillis() - this.f51367c) <= 10000) {
            return this.f51366b;
        }
        this.f51366b = null;
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo50515a(C19001b bVar) {
        this.f51366b = bVar;
        this.f51367c = System.currentTimeMillis();
    }
}
