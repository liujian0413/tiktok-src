package com.google.common.collect;

import com.google.common.base.C17434j;
import com.google.common.base.C17439m;
import com.google.common.base.C17440n;
import com.google.common.base.C17441o;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.common.collect.ap */
final class C17740ap<K, V> extends AbstractCollection<V> {

    /* renamed from: a */
    private final C17739ao<K, V> f48978a;

    public final void clear() {
        this.f48978a.clear();
    }

    public final int size() {
        return this.f48978a.size();
    }

    public final Iterator<V> iterator() {
        return C17839bx.m59346b(this.f48978a.entries().iterator());
    }

    public final boolean contains(Object obj) {
        return this.f48978a.containsValue(obj);
    }

    C17740ap(C17739ao<K, V> aoVar) {
        this.f48978a = (C17739ao) C17439m.m57962a(aoVar);
    }

    public final boolean remove(Object obj) {
        C17440n b = this.f48978a.mo45860b();
        Iterator it = this.f48978a.mo45857a().entries().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (b.apply(entry) && C17434j.m57955a(entry.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public final boolean removeAll(Collection<?> collection) {
        return C17777bq.m59094a((Iterable<T>) this.f48978a.mo45857a().entries(), C17441o.m57991a(this.f48978a.mo45860b(), C17839bx.m59344b(C17441o.m57993a(collection))));
    }

    public final boolean retainAll(Collection<?> collection) {
        return C17777bq.m59094a((Iterable<T>) this.f48978a.mo45857a().entries(), C17441o.m57991a(this.f48978a.mo45860b(), C17839bx.m59344b(C17441o.m57989a(C17441o.m57993a(collection)))));
    }
}
