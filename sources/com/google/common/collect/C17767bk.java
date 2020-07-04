package com.google.common.collect;

import java.io.Serializable;
import java.util.Map.Entry;

/* renamed from: com.google.common.collect.bk */
final class C17767bk<K, V> extends C17623b<K> {

    /* renamed from: a */
    private final ImmutableMap<K, V> f48996a;

    /* renamed from: com.google.common.collect.bk$a */
    static class C17768a<K> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final ImmutableMap<K, ?> f48997a;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return this.f48997a.keySet();
        }

        C17768a(ImmutableMap<K, ?> immutableMap) {
            this.f48997a = immutableMap;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean isPartialView() {
        return true;
    }

    public final C17995dt<K> iterator() {
        return this.f48996a.keyIterator();
    }

    public final int size() {
        return this.f48996a.size();
    }

    /* access modifiers changed from: 0000 */
    public final Object writeReplace() {
        return new C17768a(this.f48996a);
    }

    C17767bk(ImmutableMap<K, V> immutableMap) {
        this.f48996a = immutableMap;
    }

    public final boolean contains(Object obj) {
        return this.f48996a.containsKey(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final K mo45491a(int i) {
        return ((Entry) this.f48996a.entrySet().asList().get(i)).getKey();
    }
}
