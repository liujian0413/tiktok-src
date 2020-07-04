package com.bytedance.common.utility.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.common.utility.collection.d */
public final class C6308d<E> implements Iterable<E> {

    /* renamed from: a */
    private final WeakHashMap<E, Object> f18545a = new WeakHashMap<>();

    /* renamed from: b */
    private final Object f18546b = new Object();

    /* renamed from: a */
    public final void mo15142a() {
        this.f18545a.clear();
    }

    /* renamed from: b */
    public final boolean mo15145b() {
        return this.f18545a.isEmpty();
    }

    /* renamed from: c */
    public final int mo15146c() {
        return this.f18545a.size();
    }

    public final Iterator<E> iterator() {
        ArrayList arrayList = new ArrayList(this.f18545a.size());
        for (Object next : this.f18545a.keySet()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList.iterator();
    }

    /* renamed from: a */
    public final void mo15143a(E e) {
        if (e == null) {
            this.f18545a.size();
        } else {
            this.f18545a.put(e, this.f18546b);
        }
    }

    /* renamed from: b */
    public final void mo15144b(E e) {
        if (e == null) {
            this.f18545a.size();
        } else {
            this.f18545a.remove(e);
        }
    }

    /* renamed from: c */
    public final boolean mo15147c(E e) {
        return this.f18545a.containsKey(e);
    }
}
