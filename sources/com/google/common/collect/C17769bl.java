package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.common.collect.bl */
final class C17769bl<K, V> extends ImmutableCollection<V> {

    /* renamed from: a */
    public final ImmutableMap<K, V> f48998a;

    /* renamed from: com.google.common.collect.bl$a */
    static class C17772a<V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final ImmutableMap<?, V> f49003a;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return this.f49003a.values();
        }

        C17772a(ImmutableMap<?, V> immutableMap) {
            this.f49003a = immutableMap;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean isPartialView() {
        return true;
    }

    public final C17995dt<V> iterator() {
        return new C17995dt<V>() {

            /* renamed from: a */
            final C17995dt<Entry<K, V>> f48999a = C17769bl.this.f48998a.entrySet().iterator();

            public final boolean hasNext() {
                return this.f48999a.hasNext();
            }

            public final V next() {
                return ((Entry) this.f48999a.next()).getValue();
            }
        };
    }

    public final int size() {
        return this.f48998a.size();
    }

    /* access modifiers changed from: 0000 */
    public final Object writeReplace() {
        return new C17772a(this.f48998a);
    }

    public final ImmutableList<V> asList() {
        final ImmutableList asList = this.f48998a.entrySet().asList();
        return new ImmutableList<V>() {
            /* access modifiers changed from: 0000 */
            public final boolean isPartialView() {
                return true;
            }

            public final int size() {
                return asList.size();
            }

            public final V get(int i) {
                return ((Entry) asList.get(i)).getValue();
            }
        };
    }

    C17769bl(ImmutableMap<K, V> immutableMap) {
        this.f48998a = immutableMap;
    }

    public final boolean contains(Object obj) {
        if (obj == null || !C17782br.m59115a((Iterator<?>) iterator(), obj)) {
            return false;
        }
        return true;
    }
}
