package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.e */
final class C16908e implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f47271a = this.f47272b.f47517a.keySet().iterator();

    /* renamed from: b */
    private final /* synthetic */ zzad f47272b;

    C16908e(zzad zzad) {
        this.f47272b = zzad;
    }

    public final boolean hasNext() {
        return this.f47271a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    public final /* synthetic */ Object next() {
        return (String) this.f47271a.next();
    }
}
