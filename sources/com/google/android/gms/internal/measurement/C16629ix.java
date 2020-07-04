package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.ix */
final class C16629ix<E> extends C16538ft<E> {

    /* renamed from: a */
    private static final C16629ix<Object> f46484a;

    /* renamed from: b */
    private final List<E> f46485b;

    /* renamed from: d */
    public static <E> C16629ix<E> m54343d() {
        return f46484a;
    }

    C16629ix() {
        this(new ArrayList(10));
    }

    private C16629ix(List<E> list) {
        this.f46485b = list;
    }

    public final void add(int i, E e) {
        mo42738c();
        this.f46485b.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.f46485b.get(i);
    }

    public final E remove(int i) {
        mo42738c();
        E remove = this.f46485b.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        mo42738c();
        E e2 = this.f46485b.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f46485b.size();
    }

    /* renamed from: a */
    public final /* synthetic */ C16590hl mo42747a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f46485b);
            return new C16629ix(arrayList);
        }
        throw new IllegalArgumentException();
    }

    static {
        C16629ix<Object> ixVar = new C16629ix<>();
        f46484a = ixVar;
        ixVar.mo42737b();
    }
}
