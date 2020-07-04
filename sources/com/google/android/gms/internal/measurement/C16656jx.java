package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.jx */
final class C16656jx implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f46534a = this.f46535b.f46530a.iterator();

    /* renamed from: b */
    private final /* synthetic */ C16654jv f46535b;

    C16656jx(C16654jv jvVar) {
        this.f46535b = jvVar;
    }

    public final boolean hasNext() {
        return this.f46534a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f46534a.next();
    }
}
