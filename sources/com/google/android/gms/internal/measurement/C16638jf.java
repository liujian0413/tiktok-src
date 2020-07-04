package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.jf */
final class C16638jf implements Iterator<Entry<K, V>> {

    /* renamed from: a */
    private int f46505a;

    /* renamed from: b */
    private Iterator<Entry<K, V>> f46506b;

    /* renamed from: c */
    private final /* synthetic */ C16636jd f46507c;

    private C16638jf(C16636jd jdVar) {
        this.f46507c = jdVar;
        this.f46505a = this.f46507c.f46500c.size();
    }

    public final boolean hasNext() {
        return (this.f46505a > 0 && this.f46505a <= this.f46507c.f46500c.size()) || m54474a().hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m54474a() {
        if (this.f46506b == null) {
            this.f46506b = this.f46507c.f46503f.entrySet().iterator();
        }
        return this.f46506b;
    }

    public final /* synthetic */ Object next() {
        if (m54474a().hasNext()) {
            return (Entry) m54474a().next();
        }
        List b = this.f46507c.f46500c;
        int i = this.f46505a - 1;
        this.f46505a = i;
        return (Entry) b.get(i);
    }

    /* synthetic */ C16638jf(C16636jd jdVar, C16637je jeVar) {
        this(jdVar);
    }
}
