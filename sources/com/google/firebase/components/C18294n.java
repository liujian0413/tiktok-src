package com.google.firebase.components;

import com.google.firebase.p786b.C18277a;

/* renamed from: com.google.firebase.components.n */
final class C18294n<T> implements C18277a<T> {

    /* renamed from: a */
    private static final Object f49713a = new Object();

    /* renamed from: b */
    private volatile Object f49714b = f49713a;

    /* renamed from: c */
    private volatile C18277a<T> f49715c;

    /* renamed from: a */
    public final T mo47150a() {
        T t = this.f49714b;
        if (t == f49713a) {
            synchronized (this) {
                t = this.f49714b;
                if (t == f49713a) {
                    t = this.f49715c.mo47150a();
                    this.f49714b = t;
                    this.f49715c = null;
                }
            }
        }
        return t;
    }

    C18294n(C18283c<T> cVar, C18282b bVar) {
        this.f49715c = C18295o.m60314a(cVar, bVar);
    }
}
