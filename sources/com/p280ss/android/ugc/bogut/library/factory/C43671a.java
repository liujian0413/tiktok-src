package com.p280ss.android.ugc.bogut.library.factory;

import com.p280ss.android.ugc.bogut.library.p1721a.C43668a;

/* renamed from: com.ss.android.ugc.bogut.library.factory.a */
public final class C43671a<P extends C43668a> implements C43672c<P> {

    /* renamed from: a */
    private Class<P> f113024a;

    /* renamed from: a */
    public final P mo105640a() {
        try {
            return (C43668a) this.f113024a.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private C43671a(Class<P> cls) {
        this.f113024a = cls;
    }

    /* renamed from: a */
    public static <P extends C43668a> C43671a<P> m138354a(Class<?> cls) {
        Class cls2;
        C7287b bVar = (C7287b) cls.getAnnotation(C7287b.class);
        if (bVar == null) {
            cls2 = null;
        } else {
            cls2 = bVar.mo19021a();
        }
        if (cls2 == null) {
            return null;
        }
        return new C43671a<>(cls2);
    }
}
