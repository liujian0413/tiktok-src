package com.google.common.collect;

import com.google.common.base.C17439m;
import java.util.Iterator;

/* renamed from: com.google.common.collect.dq */
abstract class C17992dq<F, T> implements Iterator<T> {

    /* renamed from: c */
    final Iterator<? extends F> f49293c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo45666a(F f);

    public final boolean hasNext() {
        return this.f49293c.hasNext();
    }

    public final void remove() {
        this.f49293c.remove();
    }

    public final T next() {
        return mo45666a(this.f49293c.next());
    }

    C17992dq(Iterator<? extends F> it) {
        this.f49293c = (Iterator) C17439m.m57962a(it);
    }
}
