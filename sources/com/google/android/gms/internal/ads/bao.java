package com.google.android.gms.internal.ads;

import java.util.ListIterator;

final class bao implements ListIterator<String> {

    /* renamed from: a */
    private ListIterator<String> f41321a = this.f41323c.f41320a.listIterator(this.f41322b);

    /* renamed from: b */
    private final /* synthetic */ int f41322b;

    /* renamed from: c */
    private final /* synthetic */ ban f41323c;

    bao(ban ban, int i) {
        this.f41323c = ban;
        this.f41322b = i;
    }

    public final boolean hasNext() {
        return this.f41321a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f41321a.hasPrevious();
    }

    public final int nextIndex() {
        return this.f41321a.nextIndex();
    }

    public final int previousIndex() {
        return this.f41321a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object previous() {
        return (String) this.f41321a.previous();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f41321a.next();
    }
}
