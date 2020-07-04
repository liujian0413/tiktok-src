package com.google.android.gms.dynamic;

import java.util.Iterator;

/* renamed from: com.google.android.gms.dynamic.f */
final class C15351f implements C15350e<T> {

    /* renamed from: a */
    private final /* synthetic */ C15343a f39631a;

    C15351f(C15343a aVar) {
        this.f39631a = aVar;
    }

    /* renamed from: a */
    public final void mo38716a(T t) {
        this.f39631a.f39626a = t;
        Iterator it = this.f39631a.f39628c.iterator();
        while (it.hasNext()) {
            ((C15344a) it.next()).mo38704a(this.f39631a.f39626a);
        }
        this.f39631a.f39628c.clear();
        this.f39631a.f39627b = null;
    }
}
