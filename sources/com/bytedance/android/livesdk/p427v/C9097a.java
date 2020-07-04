package com.bytedance.android.livesdk.p427v;

import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p354j.C7486b;
import p346io.reactivex.p354j.C7489f;

/* renamed from: com.bytedance.android.livesdk.v.a */
public class C9097a {

    /* renamed from: b */
    private static volatile C9097a f24766b;

    /* renamed from: a */
    private final C7489f<Object> f24767a = C7486b.m23223a().mo19260n();

    private C9097a() {
    }

    /* renamed from: a */
    public static C9097a m27146a() {
        if (f24766b == null) {
            synchronized (C9097a.class) {
                if (f24766b == null) {
                    f24766b = new C9097a();
                }
            }
        }
        return f24766b;
    }

    /* renamed from: a */
    public final void mo22267a(Object obj) {
        this.f24767a.onNext(obj);
    }

    /* renamed from: a */
    public final <T> C7492s<T> mo22266a(Class<T> cls) {
        return this.f24767a.mo19296a(cls).mo19294a(C47549a.m148327a());
    }
}
