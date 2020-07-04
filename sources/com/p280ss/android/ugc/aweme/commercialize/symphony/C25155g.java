package com.p280ss.android.ugc.aweme.commercialize.symphony;

import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.g */
public final class C25155g implements C25154f {

    /* renamed from: a */
    public static final C25155g f66365a = new C25155g();

    /* renamed from: b */
    private static WeakReference<C25154f> f66366b;

    private C25155g() {
    }

    /* renamed from: a */
    public static final C25154f m82753a() {
        WeakReference<C25154f> weakReference = f66366b;
        if (weakReference != null) {
            return (C25154f) weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo64616b() {
        C25154f a = m82753a();
        if (a != null) {
            a.mo64616b();
        }
    }

    /* renamed from: c */
    public final void mo64617c() {
        C25154f a = m82753a();
        if (a != null) {
            a.mo64617c();
        }
    }

    /* renamed from: a */
    public static final void m82754a(C25154f fVar) {
        WeakReference<C25154f> weakReference;
        if (fVar == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(fVar);
        }
        f66366b = weakReference;
    }
}
