package com.google.common.collect;

import com.google.common.base.C17440n;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.common.collect.an */
final class C17738an<K, V> extends C17728am<K, V> implements C17741aq<K, V> {
    /* renamed from: c */
    public final C17932da<K, V> mo45857a() {
        return (C17932da) this.f48964a;
    }

    public final Set<Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public Set<Entry<K, V>> createEntries() {
        return C17933db.m59569a(mo45857a().entries(), mo45860b());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Set<V> get(K k) {
        return (Set) super.get(k);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Set<V> removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    C17738an(C17932da<K, V> daVar, C17440n<? super Entry<K, V>> nVar) {
        super(daVar, nVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return (Set) super.replaceValues(k, iterable);
    }
}
