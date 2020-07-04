package com.google.common.collect;

import com.google.common.base.C17439m;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.common.collect.h */
abstract class C18028h<K, V> implements C17862by<K, V> {
    private transient Map<K, Collection<V>> asMap;
    private transient Collection<Entry<K, V>> entries;
    private transient Set<K> keySet;
    private transient C17882cb<K> keys;
    private transient Collection<V> values;

    /* renamed from: com.google.common.collect.h$a */
    class C18029a extends C17878c<K, V> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17862by<K, V> mo46202a() {
            return C18028h.this;
        }

        public Iterator<Entry<K, V>> iterator() {
            return C18028h.this.entryIterator();
        }

        C18029a() {
        }
    }

    /* renamed from: com.google.common.collect.h$b */
    class C18030b extends C18029a implements Set<Entry<K, V>> {
        public final int hashCode() {
            return C17933db.m59564a((Set<?>) this);
        }

        C18030b() {
            super();
        }

        public final boolean equals(Object obj) {
            return C17933db.m59571a((Set<?>) this, obj);
        }
    }

    /* renamed from: com.google.common.collect.h$c */
    class C18031c extends AbstractCollection<V> {
        public final void clear() {
            C18028h.this.clear();
        }

        public final Iterator<V> iterator() {
            return C18028h.this.valueIterator();
        }

        public final int size() {
            return C18028h.this.size();
        }

        C18031c() {
        }

        public final boolean contains(Object obj) {
            return C18028h.this.containsValue(obj);
        }
    }

    C18028h() {
    }

    /* access modifiers changed from: 0000 */
    public abstract Map<K, Collection<V>> createAsMap();

    /* access modifiers changed from: 0000 */
    public abstract Collection<Entry<K, V>> createEntries();

    /* access modifiers changed from: 0000 */
    public abstract Set<K> createKeySet();

    /* access modifiers changed from: 0000 */
    public abstract C17882cb<K> createKeys();

    /* access modifiers changed from: 0000 */
    public abstract Collection<V> createValues();

    /* access modifiers changed from: 0000 */
    public abstract Iterator<Entry<K, V>> entryIterator();

    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.asMap;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> createAsMap = createAsMap();
        this.asMap = createAsMap;
        return createAsMap;
    }

    public Collection<Entry<K, V>> entries() {
        Collection<Entry<K, V>> collection = this.entries;
        if (collection != null) {
            return collection;
        }
        Collection<Entry<K, V>> createEntries = createEntries();
        this.entries = createEntries;
        return createEntries;
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        Set<K> createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    public C17882cb<K> keys() {
        C17882cb<K> cbVar = this.keys;
        if (cbVar != null) {
            return cbVar;
        }
        C17882cb<K> createKeys = createKeys();
        this.keys = createKeys;
        return createKeys;
    }

    public String toString() {
        return asMap().toString();
    }

    /* access modifiers changed from: 0000 */
    public Iterator<V> valueIterator() {
        return C17839bx.m59346b(entries().iterator());
    }

    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Collection<V> createValues = createValues();
        this.values = createValues;
        return createValues;
    }

    public boolean equals(Object obj) {
        return C17873ca.m59407a((C17862by<?, ?>) this, obj);
    }

    public boolean containsValue(Object obj) {
        for (Collection contains : asMap().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean putAll(C17862by<? extends K, ? extends V> byVar) {
        boolean z = false;
        for (Entry entry : byVar.entries()) {
            z |= put(entry.getKey(), entry.getValue());
        }
        return z;
    }

    public boolean put(K k, V v) {
        return get(k).add(v);
    }

    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        C17439m.m57962a(iterable);
        Collection<V> removeAll = removeAll(k);
        putAll(k, iterable);
        return removeAll;
    }

    public boolean containsEntry(Object obj, Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        if (collection == null || !collection.contains(obj2)) {
            return false;
        }
        return true;
    }

    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        if (collection == null || !collection.remove(obj2)) {
            return false;
        }
        return true;
    }

    public boolean putAll(K k, Iterable<? extends V> iterable) {
        C17439m.m57962a(iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty() || !get(k).addAll(collection)) {
                return false;
            }
            return true;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext() || !C17782br.m59113a(get(k), it)) {
            return false;
        }
        return true;
    }
}
