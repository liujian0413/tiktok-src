package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.hq */
final class C16595hq<K> implements Iterator<Entry<K, Object>> {

    /* renamed from: a */
    private Iterator<Entry<K, Object>> f46430a;

    public C16595hq(Iterator<Entry<K, Object>> it) {
        this.f46430a = it;
    }

    public final boolean hasNext() {
        return this.f46430a.hasNext();
    }

    public final void remove() {
        this.f46430a.remove();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f46430a.next();
        return entry.getValue() instanceof C16591hm ? new C16594hp(entry) : entry;
    }
}
