package com.google.common.collect;

import com.google.common.base.C17434j;
import com.google.common.base.C17439m;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.common.collect.a */
abstract class C17689a<K, V> extends C17750aw<K, V> implements C18050s<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    public transient Map<K, V> delegate;
    private transient Set<Entry<K, V>> entrySet;
    public transient C17689a<V, K> inverse;
    private transient Set<K> keySet;
    private transient Set<V> valueSet;

    /* renamed from: com.google.common.collect.a$a */
    class C17691a extends C17751ax<K, V> {

        /* renamed from: b */
        private final Entry<K, V> f48914b;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Entry<K, V> delegate() {
            return this.f48914b;
        }

        public final V setValue(V v) {
            C17689a.this.checkValue(v);
            C17439m.m57982b(C17689a.this.entrySet().contains(this), (Object) "entry no longer in map");
            if (C17434j.m57955a(v, getValue())) {
                return v;
            }
            C17439m.m57976a(!C17689a.this.containsValue(v), "value already present: %s", (Object) v);
            V value = this.f48914b.setValue(v);
            C17439m.m57982b(C17434j.m57955a(v, C17689a.this.get(getKey())), (Object) "entry no longer in map");
            C17689a.this.updateInverseMap(getKey(), true, value, v);
            return value;
        }

        C17691a(Entry<K, V> entry) {
            this.f48914b = entry;
        }
    }

    /* renamed from: com.google.common.collect.a$b */
    class C17692b extends C17757bc<Entry<K, V>> {

        /* renamed from: a */
        final Set<Entry<K, V>> f48915a;

        /* access modifiers changed from: protected */
        public final Set<Entry<K, V>> delegate() {
            return this.f48915a;
        }

        public final void clear() {
            C17689a.this.clear();
        }

        public final Iterator<Entry<K, V>> iterator() {
            return C17689a.this.entrySetIterator();
        }

        public final Object[] toArray() {
            return standardToArray();
        }

        public final boolean containsAll(Collection<?> collection) {
            return standardContainsAll(collection);
        }

        public final boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        public final boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }

        private C17692b() {
            this.f48915a = C17689a.this.delegate.entrySet();
        }

        public final boolean contains(Object obj) {
            return C17839bx.m59341a((Collection<Entry<K, V>>) delegate(), obj);
        }

        public final <T> T[] toArray(T[] tArr) {
            return standardToArray(tArr);
        }

        public final boolean remove(Object obj) {
            if (!this.f48915a.contains(obj)) {
                return false;
            }
            Entry entry = (Entry) obj;
            C17689a.this.inverse.delegate.remove(entry.getValue());
            this.f48915a.remove(entry);
            return true;
        }
    }

    /* renamed from: com.google.common.collect.a$c */
    static class C17693c<K, V> extends C17689a<K, V> {
        private static final long serialVersionUID = 0;

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ Object delegate() {
            return C17689a.super.delegate();
        }

        public final /* bridge */ /* synthetic */ Collection values() {
            return C17689a.super.values();
        }

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return inverse().inverse();
        }

        /* access modifiers changed from: 0000 */
        public final K checkKey(K k) {
            return this.inverse.checkValue(k);
        }

        /* access modifiers changed from: 0000 */
        public final V checkValue(V v) {
            return this.inverse.checkKey(v);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.inverse = (C17689a) objectInputStream.readObject();
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(inverse());
        }

        C17693c(Map<K, V> map, C17689a<V, K> aVar) {
            super(map, aVar);
        }
    }

    /* renamed from: com.google.common.collect.a$d */
    class C17694d extends C17757bc<K> {
        public final void clear() {
            C17689a.this.clear();
        }

        public final Iterator<K> iterator() {
            return C17839bx.m59334a(C17689a.this.entrySet().iterator());
        }

        /* access modifiers changed from: protected */
        public final Set<K> delegate() {
            return C17689a.this.delegate.keySet();
        }

        private C17694d() {
        }

        public final boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        public final boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }

        public final boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            C17689a.this.removeFromBothMaps(obj);
            return true;
        }
    }

    /* renamed from: com.google.common.collect.a$e */
    class C17695e extends C17757bc<V> {

        /* renamed from: a */
        final Set<V> f48918a;

        /* access modifiers changed from: protected */
        public final Set<V> delegate() {
            return this.f48918a;
        }

        public final Object[] toArray() {
            return standardToArray();
        }

        public final String toString() {
            return standardToString();
        }

        public final Iterator<V> iterator() {
            return C17839bx.m59346b(C17689a.this.entrySet().iterator());
        }

        private C17695e() {
            this.f48918a = C17689a.this.inverse.keySet();
        }

        public final <T> T[] toArray(T[] tArr) {
            return standardToArray(tArr);
        }
    }

    /* access modifiers changed from: 0000 */
    public K checkKey(K k) {
        return k;
    }

    /* access modifiers changed from: 0000 */
    public V checkValue(V v) {
        return v;
    }

    /* access modifiers changed from: protected */
    public Map<K, V> delegate() {
        return this.delegate;
    }

    public C18050s<V, K> inverse() {
        return this.inverse;
    }

    public void clear() {
        this.delegate.clear();
        this.inverse.delegate.clear();
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        C17692b bVar = new C17692b();
        this.entrySet = bVar;
        return bVar;
    }

    /* access modifiers changed from: 0000 */
    public Iterator<Entry<K, V>> entrySetIterator() {
        final Iterator it = this.delegate.entrySet().iterator();
        return new Iterator<Entry<K, V>>() {

            /* renamed from: a */
            Entry<K, V> f48910a;

            public final boolean hasNext() {
                return it.hasNext();
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Entry<K, V> next() {
                this.f48910a = (Entry) it.next();
                return new C17691a(this.f48910a);
            }

            public final void remove() {
                boolean z;
                if (this.f48910a != null) {
                    z = true;
                } else {
                    z = false;
                }
                C18053v.m59703a(z);
                Object value = this.f48910a.getValue();
                it.remove();
                C17689a.this.removeFromInverseMap(value);
                this.f48910a = null;
            }
        };
    }

    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        C17694d dVar = new C17694d();
        this.keySet = dVar;
        return dVar;
    }

    public Set<V> values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        C17695e eVar = new C17695e();
        this.valueSet = eVar;
        return eVar;
    }

    public boolean containsValue(Object obj) {
        return this.inverse.containsKey(obj);
    }

    /* access modifiers changed from: 0000 */
    public C17689a<V, K> makeInverse(Map<V, K> map) {
        return new C17693c(map, this);
    }

    public void removeFromInverseMap(V v) {
        this.inverse.delegate.remove(v);
    }

    public V remove(Object obj) {
        if (containsKey(obj)) {
            return removeFromBothMaps(obj);
        }
        return null;
    }

    public V removeFromBothMaps(Object obj) {
        V remove = this.delegate.remove(obj);
        removeFromInverseMap(remove);
        return remove;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    private C17689a(Map<K, V> map, C17689a<V, K> aVar) {
        this.delegate = map;
        this.inverse = aVar;
    }

    public V forcePut(K k, V v) {
        return putInBothMaps(k, v, true);
    }

    public V put(K k, V v) {
        return putInBothMaps(k, v, false);
    }

    C17689a(Map<K, V> map, Map<V, K> map2) {
        setDelegates(map, map2);
    }

    /* access modifiers changed from: 0000 */
    public void setDelegates(Map<K, V> map, Map<V, K> map2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.delegate == null) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57981b(z);
        if (this.inverse == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C17439m.m57981b(z2);
        C17439m.m57968a(map.isEmpty());
        C17439m.m57968a(map2.isEmpty());
        if (map != map2) {
            z3 = true;
        }
        C17439m.m57968a(z3);
        this.delegate = map;
        this.inverse = makeInverse(map2);
    }

    private V putInBothMaps(K k, V v, boolean z) {
        checkKey(k);
        checkValue(v);
        boolean containsKey = containsKey(k);
        if (containsKey && C17434j.m57955a(v, get(k))) {
            return v;
        }
        if (z) {
            inverse().remove(v);
        } else {
            C17439m.m57976a(!containsValue(v), "value already present: %s", (Object) v);
        }
        V put = this.delegate.put(k, v);
        updateInverseMap(k, containsKey, put, v);
        return put;
    }

    public void updateInverseMap(K k, boolean z, V v, V v2) {
        if (z) {
            removeFromInverseMap(v);
        }
        this.inverse.delegate.put(v2, k);
    }
}
