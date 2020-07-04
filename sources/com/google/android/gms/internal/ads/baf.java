package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class baf extends AbstractSet<Entry<K, V>> {

    /* renamed from: a */
    private final /* synthetic */ azv f41312a;

    private baf(azv azv) {
        this.f41312a = azv;
    }

    public Iterator<Entry<K, V>> iterator() {
        return new bad(this.f41312a, null);
    }

    public int size() {
        return this.f41312a.size();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f41312a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f41312a.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.f41312a.clear();
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f41312a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    /* synthetic */ baf(azv azv, azw azw) {
        this(azv);
    }
}
