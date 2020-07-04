package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class azo {

    /* renamed from: a */
    private static final azo f41273a = new azo();

    /* renamed from: b */
    private final azt f41274b = new ayq();

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, azs<?>> f41275c = new ConcurrentHashMap();

    /* renamed from: a */
    public static azo m47917a() {
        return f41273a;
    }

    /* renamed from: a */
    public final <T> azs<T> mo40356a(Class<T> cls) {
        axw.m47745a(cls, "messageType");
        azs<T> azs = (azs) this.f41275c.get(cls);
        if (azs != null) {
            return azs;
        }
        azs<T> a = this.f41274b.mo40331a(cls);
        axw.m47745a(cls, "messageType");
        axw.m47745a(a, "schema");
        azs azs2 = (azs) this.f41275c.putIfAbsent(cls, a);
        return azs2 != null ? azs2 : a;
    }

    /* renamed from: a */
    public final <T> azs<T> mo40357a(T t) {
        return mo40356a(t.getClass());
    }

    private azo() {
    }
}
