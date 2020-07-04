package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

final class bcq implements Iterator<E> {

    /* renamed from: a */
    private int f41466a;

    /* renamed from: b */
    private final /* synthetic */ bcp f41467b;

    bcq(bcp bcp) {
        this.f41467b = bcp;
    }

    public final boolean hasNext() {
        return this.f41466a < this.f41467b.f41464a.size() || this.f41467b.f41465b.hasNext();
    }

    public final E next() {
        while (this.f41466a >= this.f41467b.f41464a.size()) {
            this.f41467b.f41464a.add(this.f41467b.f41465b.next());
        }
        List<E> list = this.f41467b.f41464a;
        int i = this.f41466a;
        this.f41466a = i + 1;
        return list.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
