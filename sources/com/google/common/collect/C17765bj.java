package com.google.common.collect;

import java.io.Serializable;
import java.util.Map.Entry;

/* renamed from: com.google.common.collect.bj */
abstract class C17765bj<K, V> extends ImmutableSet<Entry<K, V>> {

    /* renamed from: com.google.common.collect.bj$a */
    static class C17766a<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final ImmutableMap<K, V> f48995a;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return this.f48995a.entrySet();
        }

        C17766a(ImmutableMap<K, V> immutableMap) {
            this.f48995a = immutableMap;
        }
    }

    C17765bj() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract ImmutableMap<K, V> mo45458a();

    public int hashCode() {
        return mo45458a().hashCode();
    }

    /* access modifiers changed from: 0000 */
    public boolean isHashCodeFast() {
        return mo45458a().isHashCodeFast();
    }

    /* access modifiers changed from: 0000 */
    public boolean isPartialView() {
        return mo45458a().isPartialView();
    }

    public int size() {
        return mo45458a().size();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C17766a(mo45458a());
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        Object obj2 = mo45458a().get(entry.getKey());
        if (obj2 == null || !obj2.equals(entry.getValue())) {
            return false;
        }
        return true;
    }
}
