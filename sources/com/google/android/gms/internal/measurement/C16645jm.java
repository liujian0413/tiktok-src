package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.jm */
class C16645jm extends AbstractSet<Entry<K, V>> {

    /* renamed from: a */
    private final /* synthetic */ C16636jd f46518a;

    private C16645jm(C16636jd jdVar) {
        this.f46518a = jdVar;
    }

    public Iterator<Entry<K, V>> iterator() {
        return new C16644jl(this.f46518a, null);
    }

    public int size() {
        return this.f46518a.size();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f46518a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f46518a.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.f46518a.clear();
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f46518a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    /* synthetic */ C16645jm(C16636jd jdVar, C16637je jeVar) {
        this(jdVar);
    }
}
