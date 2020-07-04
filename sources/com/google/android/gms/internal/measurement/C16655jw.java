package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.measurement.jw */
final class C16655jw implements ListIterator<String> {

    /* renamed from: a */
    private ListIterator<String> f46531a = this.f46533c.f46530a.listIterator(this.f46532b);

    /* renamed from: b */
    private final /* synthetic */ int f46532b;

    /* renamed from: c */
    private final /* synthetic */ C16654jv f46533c;

    C16655jw(C16654jv jvVar, int i) {
        this.f46533c = jvVar;
        this.f46532b = i;
    }

    public final boolean hasNext() {
        return this.f46531a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f46531a.hasPrevious();
    }

    public final int nextIndex() {
        return this.f46531a.nextIndex();
    }

    public final int previousIndex() {
        return this.f46531a.previousIndex();
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
        return (String) this.f46531a.previous();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f46531a.next();
    }
}
