package com.bytedance.retrofit2.rxjava2.adapter;

import com.bytedance.retrofit2.C12534t;

/* renamed from: com.bytedance.retrofit2.rxjava2.adapter.d */
public final class C12527d<T> {

    /* renamed from: a */
    public final C12534t<T> f33230a;

    /* renamed from: b */
    public final Throwable f33231b;

    /* renamed from: a */
    public static <T> C12527d<T> m36389a(C12534t<T> tVar) {
        if (tVar != null) {
            return new C12527d<>(tVar, null);
        }
        throw new NullPointerException("response == null");
    }

    /* renamed from: a */
    public static <T> C12527d<T> m36390a(Throwable th) {
        if (th != null) {
            return new C12527d<>(null, th);
        }
        throw new NullPointerException("error == null");
    }

    private C12527d(C12534t<T> tVar, Throwable th) {
        this.f33230a = tVar;
        this.f33231b = th;
    }
}
