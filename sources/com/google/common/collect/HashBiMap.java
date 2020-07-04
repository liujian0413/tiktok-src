package com.google.common.collect;

import com.google.common.base.C17434j;
import com.google.common.base.C17439m;
import com.google.common.collect.ImmutableCollection.C17583b;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public final class HashBiMap<K, V> extends AbstractMap<K, V> implements C18050s<K, V>, Serializable {
    private transient Set<Entry<K, V>> entrySet;
    public transient int firstInInsertionOrder;
    private transient int[] hashTableKToV;
    private transient int[] hashTableVToK;
    public transient C18050s<V, K> inverse;
    private transient Set<K> keySet;
    transient K[] keys;
    private transient int lastInInsertionOrder;
    transient int modCount;
    private transient int[] nextInBucketKToV;
    private transient int[] nextInBucketVToK;
    public transient int[] nextInInsertionOrder;
    private transient int[] prevInInsertionOrder;
    transient int size;
    private transient Set<V> valueSet;
    transient V[] values;

    /* renamed from: com.google.common.collect.HashBiMap$a */
    final class C17569a extends C18027g<K, V> {

        /* renamed from: a */
        final K f48658a;

        /* renamed from: b */
        int f48659b;

        public final K getKey() {
            return this.f48658a;
        }

        public final V getValue() {
            m58494a();
            if (this.f48659b == -1) {
                return null;
            }
            return HashBiMap.this.values[this.f48659b];
        }

        /* renamed from: a */
        private void m58494a() {
            if (this.f48659b == -1 || this.f48659b > HashBiMap.this.size || !C17434j.m57955a(HashBiMap.this.keys[this.f48659b], this.f48658a)) {
                this.f48659b = HashBiMap.this.findEntryByKey(this.f48658a);
            }
        }

        public final V setValue(V v) {
            m58494a();
            if (this.f48659b == -1) {
                return HashBiMap.this.put(this.f48658a, v);
            }
            V v2 = HashBiMap.this.values[this.f48659b];
            if (C17434j.m57955a(v2, v)) {
                return v;
            }
            HashBiMap.this.replaceValueInEntry(this.f48659b, v, false);
            return v2;
        }

        C17569a(int i) {
            this.f48658a = HashBiMap.this.keys[i];
            this.f48659b = i;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$b */
    static final class C17570b<K, V> extends C18027g<V, K> {

        /* renamed from: a */
        final HashBiMap<K, V> f48661a;

        /* renamed from: b */
        final V f48662b;

        /* renamed from: c */
        int f48663c;

        public final V getKey() {
            return this.f48662b;
        }

        public final K getValue() {
            m58495a();
            if (this.f48663c == -1) {
                return null;
            }
            return this.f48661a.keys[this.f48663c];
        }

        /* renamed from: a */
        private void m58495a() {
            if (this.f48663c == -1 || this.f48663c > this.f48661a.size || !C17434j.m57955a(this.f48662b, this.f48661a.values[this.f48663c])) {
                this.f48663c = this.f48661a.findEntryByValue(this.f48662b);
            }
        }

        public final K setValue(K k) {
            m58495a();
            if (this.f48663c == -1) {
                return this.f48661a.putInverse(this.f48662b, k, false);
            }
            K k2 = this.f48661a.keys[this.f48663c];
            if (C17434j.m57955a(k2, k)) {
                return k;
            }
            this.f48661a.replaceKeyInEntry(this.f48663c, k, false);
            return k2;
        }

        C17570b(HashBiMap<K, V> hashBiMap, int i) {
            this.f48661a = hashBiMap;
            this.f48662b = hashBiMap.values[i];
            this.f48663c = i;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$c */
    final class C17571c extends C17576h<K, V, Entry<K, V>> {
        C17571c() {
            super(HashBiMap.this);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Entry<K, V> mo45343a(int i) {
            return new C17569a(i);
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int findEntryByKey = HashBiMap.this.findEntryByKey(key);
            if (findEntryByKey == -1 || !C17434j.m57955a(value, HashBiMap.this.values[findEntryByKey])) {
                return false;
            }
            return true;
        }

        public final boolean remove(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int a = C17761bg.m59065a(key);
                int findEntryByKey = HashBiMap.this.findEntryByKey(key, a);
                if (findEntryByKey != -1 && C17434j.m57955a(value, HashBiMap.this.values[findEntryByKey])) {
                    HashBiMap.this.removeEntryKeyHashKnown(findEntryByKey, a);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$d */
    static class C17572d<K, V> extends AbstractMap<V, K> implements C18050s<V, K>, Serializable {

        /* renamed from: a */
        private final HashBiMap<K, V> f48665a;

        /* renamed from: b */
        private transient Set<Entry<V, K>> f48666b;

        public final C18050s<K, V> inverse() {
            return this.f48665a;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Set<K> values() {
            return this.f48665a.keySet();
        }

        public final void clear() {
            this.f48665a.clear();
        }

        public final Set<V> keySet() {
            return this.f48665a.values();
        }

        public final int size() {
            return this.f48665a.size;
        }

        public final Set<Entry<V, K>> entrySet() {
            Set<Entry<V, K>> set = this.f48666b;
            if (set != null) {
                return set;
            }
            C17573e eVar = new C17573e(this.f48665a);
            this.f48666b = eVar;
            return eVar;
        }

        C17572d(HashBiMap<K, V> hashBiMap) {
            this.f48665a = hashBiMap;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f48665a.inverse = this;
        }

        public final boolean containsKey(Object obj) {
            return this.f48665a.containsValue(obj);
        }

        public final boolean containsValue(Object obj) {
            return this.f48665a.containsKey(obj);
        }

        public final K get(Object obj) {
            return this.f48665a.getInverse(obj);
        }

        public final K remove(Object obj) {
            return this.f48665a.removeInverse(obj);
        }

        public final K put(V v, K k) {
            return this.f48665a.putInverse(v, k, false);
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$e */
    static class C17573e<K, V> extends C17576h<K, V, Entry<V, K>> {
        C17573e(HashBiMap<K, V> hashBiMap) {
            super(hashBiMap);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Entry<V, K> mo45343a(int i) {
            return new C17570b(this.f48669b, i);
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int findEntryByValue = this.f48669b.findEntryByValue(key);
            if (findEntryByValue == -1 || !C17434j.m57955a(this.f48669b.keys[findEntryByValue], value)) {
                return false;
            }
            return true;
        }

        public final boolean remove(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int a = C17761bg.m59065a(key);
                int findEntryByValue = this.f48669b.findEntryByValue(key, a);
                if (findEntryByValue != -1 && C17434j.m57955a(this.f48669b.keys[findEntryByValue], value)) {
                    this.f48669b.removeEntryValueHashKnown(findEntryByValue, a);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$f */
    final class C17574f extends C17576h<K, V, K> {
        C17574f() {
            super(HashBiMap.this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final K mo45343a(int i) {
            return HashBiMap.this.keys[i];
        }

        public final boolean contains(Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            int a = C17761bg.m59065a(obj);
            int findEntryByKey = HashBiMap.this.findEntryByKey(obj, a);
            if (findEntryByKey == -1) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(findEntryByKey, a);
            return true;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$g */
    final class C17575g extends C17576h<K, V, V> {
        C17575g() {
            super(HashBiMap.this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo45343a(int i) {
            return HashBiMap.this.values[i];
        }

        public final boolean contains(Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        public final boolean remove(Object obj) {
            int a = C17761bg.m59065a(obj);
            int findEntryByValue = HashBiMap.this.findEntryByValue(obj, a);
            if (findEntryByValue == -1) {
                return false;
            }
            HashBiMap.this.removeEntryValueHashKnown(findEntryByValue, a);
            return true;
        }
    }

    /* renamed from: com.google.common.collect.HashBiMap$h */
    static abstract class C17576h<K, V, T> extends AbstractSet<T> {

        /* renamed from: b */
        final HashBiMap<K, V> f48669b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract T mo45343a(int i);

        public void clear() {
            this.f48669b.clear();
        }

        public Iterator<T> iterator() {
            return new Iterator<T>() {

                /* renamed from: b */
                private int f48671b = C17576h.this.f48669b.firstInInsertionOrder;

                /* renamed from: c */
                private int f48672c = -1;

                /* renamed from: d */
                private int f48673d = C17576h.this.f48669b.modCount;

                /* renamed from: e */
                private int f48674e = C17576h.this.f48669b.size;

                public final boolean hasNext() {
                    m58504a();
                    if (this.f48671b == -2 || this.f48674e <= 0) {
                        return false;
                    }
                    return true;
                }

                /* renamed from: a */
                private void m58504a() {
                    if (C17576h.this.f48669b.modCount != this.f48673d) {
                        throw new ConcurrentModificationException();
                    }
                }

                public final T next() {
                    if (hasNext()) {
                        T a = C17576h.this.mo45343a(this.f48671b);
                        this.f48672c = this.f48671b;
                        this.f48671b = C17576h.this.f48669b.nextInInsertionOrder[this.f48671b];
                        this.f48674e--;
                        return a;
                    }
                    throw new NoSuchElementException();
                }

                public final void remove() {
                    boolean z;
                    m58504a();
                    if (this.f48672c != -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C18053v.m59703a(z);
                    C17576h.this.f48669b.removeEntry(this.f48672c);
                    if (this.f48671b == C17576h.this.f48669b.size) {
                        this.f48671b = this.f48672c;
                    }
                    this.f48672c = -1;
                    this.f48673d = C17576h.this.f48669b.modCount;
                }
            };
        }

        public int size() {
            return this.f48669b.size;
        }

        C17576h(HashBiMap<K, V> hashBiMap) {
            this.f48669b = hashBiMap;
        }
    }

    public final int size() {
        return this.size;
    }

    public static <K, V> HashBiMap<K, V> create() {
        return create(16);
    }

    public final Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        C17571c cVar = new C17571c();
        this.entrySet = cVar;
        return cVar;
    }

    public final C18050s<V, K> inverse() {
        C18050s<V, K> sVar = this.inverse;
        if (sVar != null) {
            return sVar;
        }
        C17572d dVar = new C17572d(this);
        this.inverse = dVar;
        return dVar;
    }

    public final Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        C17574f fVar = new C17574f();
        this.keySet = fVar;
        return fVar;
    }

    public final Set<V> values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        C17575g gVar = new C17575g();
        this.valueSet = gVar;
        return gVar;
    }

    public final void clear() {
        Arrays.fill(this.keys, 0, this.size, null);
        Arrays.fill(this.values, 0, this.size, null);
        Arrays.fill(this.hashTableKToV, -1);
        Arrays.fill(this.hashTableVToK, -1);
        Arrays.fill(this.nextInBucketKToV, 0, this.size, -1);
        Arrays.fill(this.nextInBucketVToK, 0, this.size, -1);
        Arrays.fill(this.prevInInsertionOrder, 0, this.size, -1);
        Arrays.fill(this.nextInInsertionOrder, 0, this.size, -1);
        this.size = 0;
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.modCount++;
    }

    private HashBiMap(int i) {
        init(i);
    }

    private int bucket(int i) {
        return i & (this.hashTableKToV.length - 1);
    }

    private static int[] createFilledWithAbsent(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C17928cz.m59561a((Map<K, V>) this, objectOutputStream);
    }

    public static <K, V> HashBiMap<K, V> create(int i) {
        return new HashBiMap<>(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int a = C17928cz.m59551a(objectInputStream);
        init(16);
        C17928cz.m59560a((Map<K, V>) this, objectInputStream, a);
    }

    public final boolean containsKey(Object obj) {
        if (findEntryByKey(obj) != -1) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (findEntryByValue(obj) != -1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final int findEntryByKey(Object obj) {
        return findEntryByKey(obj, C17761bg.m59065a(obj));
    }

    /* access modifiers changed from: 0000 */
    public final int findEntryByValue(Object obj) {
        return findEntryByValue(obj, C17761bg.m59065a(obj));
    }

    public final V get(Object obj) {
        int findEntryByKey = findEntryByKey(obj);
        if (findEntryByKey == -1) {
            return null;
        }
        return this.values[findEntryByKey];
    }

    /* access modifiers changed from: 0000 */
    public final K getInverse(Object obj) {
        int findEntryByValue = findEntryByValue(obj);
        if (findEntryByValue == -1) {
            return null;
        }
        return this.keys[findEntryByValue];
    }

    /* access modifiers changed from: 0000 */
    public final void removeEntry(int i) {
        removeEntryKeyHashKnown(i, C17761bg.m59065a((Object) this.keys[i]));
    }

    public static <K, V> HashBiMap<K, V> create(Map<? extends K, ? extends V> map) {
        HashBiMap<K, V> create = create(map.size());
        create.putAll(map);
        return create;
    }

    public final V remove(Object obj) {
        int a = C17761bg.m59065a(obj);
        int findEntryByKey = findEntryByKey(obj, a);
        if (findEntryByKey == -1) {
            return null;
        }
        V v = this.values[findEntryByKey];
        removeEntryKeyHashKnown(findEntryByKey, a);
        return v;
    }

    /* access modifiers changed from: 0000 */
    public final K removeInverse(Object obj) {
        int a = C17761bg.m59065a(obj);
        int findEntryByValue = findEntryByValue(obj, a);
        if (findEntryByValue == -1) {
            return null;
        }
        K k = this.keys[findEntryByValue];
        removeEntryValueHashKnown(findEntryByValue, a);
        return k;
    }

    /* access modifiers changed from: 0000 */
    public final void init(int i) {
        C18053v.m59700a(i, "expectedSize");
        int a = C17761bg.m59064a(i, 1.0d);
        this.size = 0;
        this.keys = (Object[]) new Object[i];
        this.values = (Object[]) new Object[i];
        this.hashTableKToV = createFilledWithAbsent(a);
        this.hashTableVToK = createFilledWithAbsent(a);
        this.nextInBucketKToV = createFilledWithAbsent(i);
        this.nextInBucketVToK = createFilledWithAbsent(i);
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.prevInInsertionOrder = createFilledWithAbsent(i);
        this.nextInInsertionOrder = createFilledWithAbsent(i);
    }

    private void ensureCapacity(int i) {
        if (this.nextInBucketKToV.length < i) {
            int a = C17583b.m58531a(this.nextInBucketKToV.length, i);
            this.keys = Arrays.copyOf(this.keys, a);
            this.values = Arrays.copyOf(this.values, a);
            this.nextInBucketKToV = expandAndFillWithAbsent(this.nextInBucketKToV, a);
            this.nextInBucketVToK = expandAndFillWithAbsent(this.nextInBucketVToK, a);
            this.prevInInsertionOrder = expandAndFillWithAbsent(this.prevInInsertionOrder, a);
            this.nextInInsertionOrder = expandAndFillWithAbsent(this.nextInInsertionOrder, a);
        }
        if (this.hashTableKToV.length < i) {
            int a2 = C17761bg.m59064a(i, 1.0d);
            this.hashTableKToV = createFilledWithAbsent(a2);
            this.hashTableVToK = createFilledWithAbsent(a2);
            for (int i2 = 0; i2 < this.size; i2++) {
                int bucket = bucket(C17761bg.m59065a((Object) this.keys[i2]));
                this.nextInBucketKToV[i2] = this.hashTableKToV[bucket];
                this.hashTableKToV[bucket] = i2;
                int bucket2 = bucket(C17761bg.m59065a((Object) this.values[i2]));
                this.nextInBucketVToK[i2] = this.hashTableVToK[bucket2];
                this.hashTableVToK[bucket2] = i2;
            }
        }
    }

    public final V forcePut(K k, V v) {
        return put(k, v, true);
    }

    public final V put(K k, V v) {
        return put(k, v, false);
    }

    private static int[] expandAndFillWithAbsent(int[] iArr, int i) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(copyOf, length, i, -1);
        return copyOf;
    }

    /* access modifiers changed from: 0000 */
    public final void removeEntryKeyHashKnown(int i, int i2) {
        removeEntry(i, i2, C17761bg.m59065a((Object) this.values[i]));
    }

    /* access modifiers changed from: 0000 */
    public final void removeEntryValueHashKnown(int i, int i2) {
        removeEntry(i, C17761bg.m59065a((Object) this.keys[i]), i2);
    }

    private void insertIntoTableKToV(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57968a(z);
        int bucket = bucket(i2);
        this.nextInBucketKToV[i] = this.hashTableKToV[bucket];
        this.hashTableKToV[bucket] = i;
    }

    private void insertIntoTableVToK(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57968a(z);
        int bucket = bucket(i2);
        this.nextInBucketVToK[i] = this.hashTableVToK[bucket];
        this.hashTableVToK[bucket] = i;
    }

    private void setSucceeds(int i, int i2) {
        if (i == -2) {
            this.firstInInsertionOrder = i2;
        } else {
            this.nextInInsertionOrder[i] = i2;
        }
        if (i2 == -2) {
            this.lastInInsertionOrder = i;
        } else {
            this.prevInInsertionOrder[i2] = i;
        }
    }

    /* access modifiers changed from: 0000 */
    public final int findEntryByKey(Object obj, int i) {
        return findEntry(obj, i, this.hashTableKToV, this.nextInBucketKToV, this.keys);
    }

    /* access modifiers changed from: 0000 */
    public final int findEntryByValue(Object obj, int i) {
        return findEntry(obj, i, this.hashTableVToK, this.nextInBucketVToK, this.values);
    }

    private void deleteFromTableKToV(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57968a(z);
        int bucket = bucket(i2);
        if (this.hashTableKToV[bucket] == i) {
            this.hashTableKToV[bucket] = this.nextInBucketKToV[i];
            this.nextInBucketKToV[i] = -1;
            return;
        }
        int i3 = this.hashTableKToV[bucket];
        int i4 = this.nextInBucketKToV[i3];
        while (true) {
            int i5 = i4;
            int i6 = i3;
            i3 = i5;
            if (i3 == -1) {
                StringBuilder sb = new StringBuilder("Expected to find entry with key ");
                sb.append(this.keys[i]);
                throw new AssertionError(sb.toString());
            } else if (i3 == i) {
                int[] iArr = this.nextInBucketKToV;
                iArr[i6] = iArr[i];
                this.nextInBucketKToV[i] = -1;
                return;
            } else {
                i4 = this.nextInBucketKToV[i3];
            }
        }
    }

    private void deleteFromTableVToK(int i, int i2) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57968a(z);
        int bucket = bucket(i2);
        if (this.hashTableVToK[bucket] == i) {
            this.hashTableVToK[bucket] = this.nextInBucketVToK[i];
            this.nextInBucketVToK[i] = -1;
            return;
        }
        int i3 = this.hashTableVToK[bucket];
        int i4 = this.nextInBucketVToK[i3];
        while (true) {
            int i5 = i4;
            int i6 = i3;
            i3 = i5;
            if (i3 == -1) {
                StringBuilder sb = new StringBuilder("Expected to find entry with value ");
                sb.append(this.values[i]);
                throw new AssertionError(sb.toString());
            } else if (i3 == i) {
                int[] iArr = this.nextInBucketVToK;
                iArr[i6] = iArr[i];
                this.nextInBucketVToK[i] = -1;
                return;
            } else {
                i4 = this.nextInBucketVToK[i3];
            }
        }
    }

    private void moveEntryToIndex(int i, int i2) {
        int i3;
        int i4;
        if (i != i2) {
            int i5 = this.prevInInsertionOrder[i];
            int i6 = this.nextInInsertionOrder[i];
            setSucceeds(i5, i2);
            setSucceeds(i2, i6);
            K k = this.keys[i];
            V v = this.values[i];
            this.keys[i2] = k;
            this.values[i2] = v;
            int bucket = bucket(C17761bg.m59065a((Object) k));
            if (this.hashTableKToV[bucket] == i) {
                this.hashTableKToV[bucket] = i2;
            } else {
                int i7 = this.hashTableKToV[bucket];
                int i8 = this.nextInBucketKToV[i7];
                while (true) {
                    int i9 = i8;
                    i4 = i7;
                    i7 = i9;
                    if (i7 == i) {
                        break;
                    }
                    i8 = this.nextInBucketKToV[i7];
                }
                this.nextInBucketKToV[i4] = i2;
            }
            int[] iArr = this.nextInBucketKToV;
            iArr[i2] = iArr[i];
            this.nextInBucketKToV[i] = -1;
            int bucket2 = bucket(C17761bg.m59065a((Object) v));
            if (this.hashTableVToK[bucket2] == i) {
                this.hashTableVToK[bucket2] = i2;
            } else {
                int i10 = this.hashTableVToK[bucket2];
                int i11 = this.nextInBucketVToK[i10];
                while (true) {
                    int i12 = i11;
                    i3 = i10;
                    i10 = i12;
                    if (i10 == i) {
                        break;
                    }
                    i11 = this.nextInBucketVToK[i10];
                }
                this.nextInBucketVToK[i3] = i2;
            }
            int[] iArr2 = this.nextInBucketVToK;
            iArr2[i2] = iArr2[i];
            this.nextInBucketVToK[i] = -1;
        }
    }

    private void removeEntry(int i, int i2, int i3) {
        boolean z;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57968a(z);
        deleteFromTableKToV(i, i2);
        deleteFromTableVToK(i, i3);
        setSucceeds(this.prevInInsertionOrder[i], this.nextInInsertionOrder[i]);
        moveEntryToIndex(this.size - 1, i);
        this.keys[this.size - 1] = null;
        this.values[this.size - 1] = null;
        this.size--;
        this.modCount++;
    }

    /* access modifiers changed from: 0000 */
    public final V put(K k, V v, boolean z) {
        boolean z2;
        int a = C17761bg.m59065a((Object) k);
        int findEntryByKey = findEntryByKey(k, a);
        if (findEntryByKey != -1) {
            V v2 = this.values[findEntryByKey];
            if (C17434j.m57955a(v2, v)) {
                return v;
            }
            replaceValueInEntry(findEntryByKey, v, z);
            return v2;
        }
        int a2 = C17761bg.m59065a((Object) v);
        int findEntryByValue = findEntryByValue(v, a2);
        if (!z) {
            if (findEntryByValue == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C17439m.m57976a(z2, "Value already present: %s", (Object) v);
        } else if (findEntryByValue != -1) {
            removeEntryValueHashKnown(findEntryByValue, a2);
        }
        ensureCapacity(this.size + 1);
        this.keys[this.size] = k;
        this.values[this.size] = v;
        insertIntoTableKToV(this.size, a);
        insertIntoTableVToK(this.size, a2);
        setSucceeds(this.lastInInsertionOrder, this.size);
        setSucceeds(this.size, -2);
        this.size++;
        this.modCount++;
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final K putInverse(V v, K k, boolean z) {
        int i;
        boolean z2;
        int a = C17761bg.m59065a((Object) v);
        int findEntryByValue = findEntryByValue(v, a);
        if (findEntryByValue != -1) {
            K k2 = this.keys[findEntryByValue];
            if (C17434j.m57955a(k2, k)) {
                return k;
            }
            replaceKeyInEntry(findEntryByValue, k, z);
            return k2;
        }
        int i2 = this.lastInInsertionOrder;
        int a2 = C17761bg.m59065a((Object) k);
        int findEntryByKey = findEntryByKey(k, a2);
        if (!z) {
            if (findEntryByKey == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C17439m.m57976a(z2, "Key already present: %s", (Object) k);
        } else if (findEntryByKey != -1) {
            i2 = this.prevInInsertionOrder[findEntryByKey];
            removeEntryKeyHashKnown(findEntryByKey, a2);
        }
        ensureCapacity(this.size + 1);
        this.keys[this.size] = k;
        this.values[this.size] = v;
        insertIntoTableKToV(this.size, a2);
        insertIntoTableVToK(this.size, a);
        if (i2 == -2) {
            i = this.firstInInsertionOrder;
        } else {
            i = this.nextInInsertionOrder[i2];
        }
        setSucceeds(i2, this.size);
        setSucceeds(this.size, i);
        this.size++;
        this.modCount++;
        return null;
    }

    public final void replaceKeyInEntry(int i, K k, boolean z) {
        boolean z2;
        int i2;
        int i3;
        if (i != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C17439m.m57968a(z2);
        int a = C17761bg.m59065a((Object) k);
        int findEntryByKey = findEntryByKey(k, a);
        int i4 = this.lastInInsertionOrder;
        if (findEntryByKey == -1) {
            i2 = i4;
            i3 = -2;
        } else if (z) {
            i2 = this.prevInInsertionOrder[findEntryByKey];
            i3 = this.nextInInsertionOrder[findEntryByKey];
            removeEntryKeyHashKnown(findEntryByKey, a);
            if (i == this.size) {
                i = findEntryByKey;
            }
        } else {
            StringBuilder sb = new StringBuilder("Key already present in map: ");
            sb.append(k);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 == i) {
            i2 = this.prevInInsertionOrder[i];
        } else if (i2 == this.size) {
            i2 = findEntryByKey;
        }
        if (i3 == i) {
            findEntryByKey = this.nextInInsertionOrder[i];
        } else if (i3 != this.size) {
            findEntryByKey = i3;
        }
        setSucceeds(this.prevInInsertionOrder[i], this.nextInInsertionOrder[i]);
        deleteFromTableKToV(i, C17761bg.m59065a((Object) this.keys[i]));
        this.keys[i] = k;
        insertIntoTableKToV(i, C17761bg.m59065a((Object) k));
        setSucceeds(i2, i);
        setSucceeds(i, findEntryByKey);
    }

    public final void replaceValueInEntry(int i, V v, boolean z) {
        boolean z2;
        if (i != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C17439m.m57968a(z2);
        int a = C17761bg.m59065a((Object) v);
        int findEntryByValue = findEntryByValue(v, a);
        if (findEntryByValue != -1) {
            if (z) {
                removeEntryValueHashKnown(findEntryByValue, a);
                if (i == this.size) {
                    i = findEntryByValue;
                }
            } else {
                StringBuilder sb = new StringBuilder("Value already present in map: ");
                sb.append(v);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        deleteFromTableVToK(i, C17761bg.m59065a((Object) this.values[i]));
        this.values[i] = v;
        insertIntoTableVToK(i, a);
    }

    /* access modifiers changed from: 0000 */
    public final int findEntry(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[bucket(i)];
        while (i2 != -1) {
            if (C17434j.m57955a(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }
}
