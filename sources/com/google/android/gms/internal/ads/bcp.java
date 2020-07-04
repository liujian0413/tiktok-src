package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class bcp<E> extends AbstractList<E> {

    /* renamed from: c */
    private static final bcr f41463c = bcr.m48435a(bcp.class);

    /* renamed from: a */
    List<E> f41464a;

    /* renamed from: b */
    Iterator<E> f41465b;

    public bcp(List<E> list, Iterator<E> it) {
        this.f41464a = list;
        this.f41465b = it;
    }

    public E get(int i) {
        if (this.f41464a.size() > i) {
            return this.f41464a.get(i);
        }
        if (this.f41465b.hasNext()) {
            this.f41464a.add(this.f41465b.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public Iterator<E> iterator() {
        return new bcq(this);
    }

    public int size() {
        f41463c.mo40501a("potentially expensive size() call");
        f41463c.mo40501a("blowup running");
        while (this.f41465b.hasNext()) {
            this.f41464a.add(this.f41465b.next());
        }
        return this.f41464a.size();
    }
}
