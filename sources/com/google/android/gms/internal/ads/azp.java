package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

final class azp<E> extends awf<E> {

    /* renamed from: a */
    private static final azp<Object> f41276a;

    /* renamed from: b */
    private final List<E> f41277b;

    /* renamed from: d */
    public static <E> azp<E> m47920d() {
        return f41276a;
    }

    azp() {
        this(new ArrayList(10));
    }

    private azp(List<E> list) {
        this.f41277b = list;
    }

    public final void add(int i, E e) {
        mo40096c();
        this.f41277b.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.f41277b.get(i);
    }

    public final E remove(int i) {
        mo40096c();
        E remove = this.f41277b.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        mo40096c();
        E e2 = this.f41277b.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f41277b.size();
    }

    /* renamed from: a */
    public final /* synthetic */ ayc mo40105a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f41277b);
            return new azp(arrayList);
        }
        throw new IllegalArgumentException();
    }

    static {
        azp<Object> azp = new azp<>();
        f41276a = azp;
        azp.mo40095b();
    }
}
