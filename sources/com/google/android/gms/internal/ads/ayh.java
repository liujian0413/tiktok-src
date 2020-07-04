package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;

final class ayh<K> implements Iterator<Entry<K, Object>> {

    /* renamed from: a */
    private Iterator<Entry<K, Object>> f41223a;

    public ayh(Iterator<Entry<K, Object>> it) {
        this.f41223a = it;
    }

    public final boolean hasNext() {
        return this.f41223a.hasNext();
    }

    public final void remove() {
        this.f41223a.remove();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f41223a.next();
        return entry.getValue() instanceof aye ? new ayg(entry) : entry;
    }
}
