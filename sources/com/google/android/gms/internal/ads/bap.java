package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class bap implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f41324a = this.f41325b.f41320a.iterator();

    /* renamed from: b */
    private final /* synthetic */ ban f41325b;

    bap(ban ban) {
        this.f41325b = ban;
    }

    public final boolean hasNext() {
        return this.f41324a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f41324a.next();
    }
}
