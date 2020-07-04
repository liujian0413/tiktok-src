package com.google.common.collect;

import com.google.common.base.C17434j;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public final class LinkedHashMultimap<K, V> extends C17793bs<K, V> {
    private static final long serialVersionUID = 1;
    public transient C17641a<K, V> multimapHeaderEntry;
    transient int valueSetCapacity = 2;

    /* renamed from: com.google.common.collect.LinkedHashMultimap$a */
    static final class C17641a<K, V> extends C17764bi<K, V> implements C17644c<K, V> {

        /* renamed from: c */
        final int f48789c;

        /* renamed from: d */
        C17641a<K, V> f48790d;

        /* renamed from: e */
        C17644c<K, V> f48791e;

        /* renamed from: f */
        C17644c<K, V> f48792f;

        /* renamed from: g */
        C17641a<K, V> f48793g;

        /* renamed from: h */
        C17641a<K, V> f48794h;

        /* renamed from: a */
        public final C17644c<K, V> mo45635a() {
            return this.f48791e;
        }

        /* renamed from: b */
        public final C17644c<K, V> mo45639b() {
            return this.f48792f;
        }

        /* renamed from: c */
        public final C17641a<K, V> mo45642c() {
            return this.f48793g;
        }

        /* renamed from: d */
        public final C17641a<K, V> mo45643d() {
            return this.f48794h;
        }

        /* renamed from: a */
        public final void mo45636a(C17641a<K, V> aVar) {
            this.f48794h = aVar;
        }

        /* renamed from: b */
        public final void mo45640b(C17641a<K, V> aVar) {
            this.f48793g = aVar;
        }

        /* renamed from: a */
        public final void mo45637a(C17644c<K, V> cVar) {
            this.f48791e = cVar;
        }

        /* renamed from: b */
        public final void mo45641b(C17644c<K, V> cVar) {
            this.f48792f = cVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo45638a(Object obj, int i) {
            if (this.f48789c != i || !C17434j.m57955a(getValue(), obj)) {
                return false;
            }
            return true;
        }

        C17641a(K k, V v, int i, C17641a<K, V> aVar) {
            super(k, v);
            this.f48789c = i;
            this.f48790d = aVar;
        }
    }

    /* renamed from: com.google.common.collect.LinkedHashMultimap$b */
    final class C17642b extends C17936c<V> implements C17644c<K, V> {

        /* renamed from: a */
        C17641a<K, V>[] f48795a;

        /* renamed from: b */
        public int f48796b;

        /* renamed from: c */
        public C17644c<K, V> f48797c = this;

        /* renamed from: e */
        private final K f48799e;

        /* renamed from: f */
        private int f48800f;

        /* renamed from: g */
        private C17644c<K, V> f48801g = this;

        /* renamed from: a */
        public final C17644c<K, V> mo45635a() {
            return this.f48801g;
        }

        /* renamed from: b */
        public final C17644c<K, V> mo45639b() {
            return this.f48797c;
        }

        public final int size() {
            return this.f48800f;
        }

        /* renamed from: c */
        private int m58768c() {
            return this.f48795a.length - 1;
        }

        public final Iterator<V> iterator() {
            return new Iterator<V>() {

                /* renamed from: a */
                C17644c<K, V> f48802a = C17642b.this.f48797c;

                /* renamed from: b */
                C17641a<K, V> f48803b;

                /* renamed from: c */
                int f48804c = C17642b.this.f48796b;

                /* renamed from: a */
                private void m58774a() {
                    if (C17642b.this.f48796b != this.f48804c) {
                        throw new ConcurrentModificationException();
                    }
                }

                public final boolean hasNext() {
                    m58774a();
                    if (this.f48802a != C17642b.this) {
                        return true;
                    }
                    return false;
                }

                public final V next() {
                    if (hasNext()) {
                        C17641a<K, V> aVar = (C17641a) this.f48802a;
                        V value = aVar.getValue();
                        this.f48803b = aVar;
                        this.f48802a = aVar.mo45639b();
                        return value;
                    }
                    throw new NoSuchElementException();
                }

                public final void remove() {
                    boolean z;
                    m58774a();
                    if (this.f48803b != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C18053v.m59703a(z);
                    C17642b.this.remove(this.f48803b.getValue());
                    this.f48804c = C17642b.this.f48796b;
                    this.f48803b = null;
                }
            };
        }

        /* renamed from: d */
        private void m58769d() {
            if (C17761bg.m59066a(this.f48800f, this.f48795a.length, 1.0d)) {
                C17641a<K, V>[] aVarArr = new C17641a[(this.f48795a.length * 2)];
                this.f48795a = aVarArr;
                int length = aVarArr.length - 1;
                for (C17644c<K, V> cVar = this.f48797c; cVar != this; cVar = cVar.mo45639b()) {
                    C17641a<K, V> aVar = (C17641a) cVar;
                    int i = aVar.f48789c & length;
                    aVar.f48790d = aVarArr[i];
                    aVarArr[i] = aVar;
                }
            }
        }

        public final void clear() {
            Arrays.fill(this.f48795a, null);
            this.f48800f = 0;
            for (C17644c<K, V> cVar = this.f48797c; cVar != this; cVar = cVar.mo45639b()) {
                LinkedHashMultimap.deleteFromMultimap((C17641a) cVar);
            }
            LinkedHashMultimap.succeedsInValueSet(this, this);
            this.f48796b++;
        }

        /* renamed from: a */
        public final void mo45637a(C17644c<K, V> cVar) {
            this.f48801g = cVar;
        }

        /* renamed from: b */
        public final void mo45641b(C17644c<K, V> cVar) {
            this.f48797c = cVar;
        }

        public final boolean contains(Object obj) {
            int a = C17761bg.m59065a(obj);
            for (C17641a<K, V> aVar = this.f48795a[m58768c() & a]; aVar != null; aVar = aVar.f48790d) {
                if (aVar.mo45638a(obj, a)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean remove(Object obj) {
            int a = C17761bg.m59065a(obj);
            int c = m58768c() & a;
            C17641a<K, V> aVar = this.f48795a[c];
            C17641a<K, V> aVar2 = null;
            while (true) {
                C17641a<K, V> aVar3 = aVar2;
                aVar2 = aVar;
                C17641a<K, V> aVar4 = aVar3;
                if (aVar2 == null) {
                    return false;
                }
                if (aVar2.mo45638a(obj, a)) {
                    if (aVar4 == null) {
                        this.f48795a[c] = aVar2.f48790d;
                    } else {
                        aVar4.f48790d = aVar2.f48790d;
                    }
                    LinkedHashMultimap.deleteFromValueSet(aVar2);
                    LinkedHashMultimap.deleteFromMultimap(aVar2);
                    this.f48800f--;
                    this.f48796b++;
                    return true;
                }
                aVar = aVar2.f48790d;
            }
        }

        public final boolean add(V v) {
            int a = C17761bg.m59065a((Object) v);
            int c = m58768c() & a;
            C17641a<K, V> aVar = this.f48795a[c];
            for (C17641a<K, V> aVar2 = aVar; aVar2 != null; aVar2 = aVar2.f48790d) {
                if (aVar2.mo45638a(v, a)) {
                    return false;
                }
            }
            C17641a<K, V> aVar3 = new C17641a<>(this.f48799e, v, a, aVar);
            LinkedHashMultimap.succeedsInValueSet(this.f48801g, aVar3);
            LinkedHashMultimap.succeedsInValueSet(aVar3, this);
            LinkedHashMultimap.succeedsInMultimap(LinkedHashMultimap.this.multimapHeaderEntry.mo45642c(), aVar3);
            LinkedHashMultimap.succeedsInMultimap(aVar3, LinkedHashMultimap.this.multimapHeaderEntry);
            this.f48795a[c] = aVar3;
            this.f48800f++;
            this.f48796b++;
            m58769d();
            return true;
        }

        C17642b(K k, int i) {
            this.f48799e = k;
            this.f48795a = new C17641a[C17761bg.m59064a(i, 1.0d)];
        }
    }

    /* renamed from: com.google.common.collect.LinkedHashMultimap$c */
    interface C17644c<K, V> {
        /* renamed from: a */
        C17644c<K, V> mo45635a();

        /* renamed from: a */
        void mo45637a(C17644c<K, V> cVar);

        /* renamed from: b */
        C17644c<K, V> mo45639b();

        /* renamed from: b */
        void mo45641b(C17644c<K, V> cVar);
    }

    public final /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    /* access modifiers changed from: 0000 */
    public final Iterator<Entry<K, V>> entryIterator() {
        return new Iterator<Entry<K, V>>() {

            /* renamed from: a */
            C17641a<K, V> f48786a = LinkedHashMultimap.this.multimapHeaderEntry.f48794h;

            /* renamed from: b */
            C17641a<K, V> f48787b;

            public final boolean hasNext() {
                if (this.f48786a != LinkedHashMultimap.this.multimapHeaderEntry) {
                    return true;
                }
                return false;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Entry<K, V> next() {
                if (hasNext()) {
                    C17641a<K, V> aVar = this.f48786a;
                    this.f48787b = aVar;
                    this.f48786a = this.f48786a.f48794h;
                    return aVar;
                }
                throw new NoSuchElementException();
            }

            public final void remove() {
                boolean z;
                if (this.f48787b != null) {
                    z = true;
                } else {
                    z = false;
                }
                C18053v.m59703a(z);
                LinkedHashMultimap.this.remove(this.f48787b.getKey(), this.f48787b.getValue());
                this.f48787b = null;
            }
        };
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public final Set<K> keySet() {
        return super.keySet();
    }

    public final /* bridge */ /* synthetic */ C17882cb keys() {
        return super.keys();
    }

    public final /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public final Collection<V> values() {
        return super.values();
    }

    public static <K, V> LinkedHashMultimap<K, V> create() {
        return new LinkedHashMultimap<>(16, 2);
    }

    public final void clear() {
        super.clear();
        succeedsInMultimap(this.multimapHeaderEntry, this.multimapHeaderEntry);
    }

    public final Set<Entry<K, V>> entries() {
        return super.entries();
    }

    /* access modifiers changed from: 0000 */
    public final Iterator<V> valueIterator() {
        return C17839bx.m59346b(entryIterator());
    }

    /* access modifiers changed from: 0000 */
    public final Set<V> createCollection() {
        return C17898cj.m59512d(this.valueSetCapacity);
    }

    public final /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    public final /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* bridge */ /* synthetic */ Set get(Object obj) {
        return super.get(obj);
    }

    public final /* bridge */ /* synthetic */ boolean putAll(C17862by byVar) {
        return super.putAll(byVar);
    }

    public final /* bridge */ /* synthetic */ Set removeAll(Object obj) {
        return super.removeAll(obj);
    }

    public static <K, V> void deleteFromMultimap(C17641a<K, V> aVar) {
        succeedsInMultimap(aVar.mo45642c(), aVar.mo45643d());
    }

    public static <K, V> void deleteFromValueSet(C17644c<K, V> cVar) {
        succeedsInValueSet(cVar.mo45635a(), cVar.mo45639b());
    }

    /* access modifiers changed from: 0000 */
    public final Collection<V> createCollection(K k) {
        return new C17642b(k, this.valueSetCapacity);
    }

    public static <K, V> LinkedHashMultimap<K, V> create(C17862by<? extends K, ? extends V> byVar) {
        LinkedHashMultimap<K, V> create = create(byVar.keySet().size(), 2);
        create.putAll(byVar);
        return create;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.multimapHeaderEntry = new C17641a<>(null, null, 0, null);
        succeedsInMultimap(this.multimapHeaderEntry, this.multimapHeaderEntry);
        this.valueSetCapacity = 2;
        int readInt = objectInputStream.readInt();
        Map b = C17898cj.m59509b(12);
        for (int i = 0; i < readInt; i++) {
            Object readObject = objectInputStream.readObject();
            b.put(readObject, createCollection(readObject));
        }
        int readInt2 = objectInputStream.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            Object readObject2 = objectInputStream.readObject();
            ((Collection) b.get(readObject2)).add(objectInputStream.readObject());
        }
        setMap(b);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(keySet().size());
        for (Object writeObject : keySet()) {
            objectOutputStream.writeObject(writeObject);
        }
        objectOutputStream.writeInt(size());
        for (Entry entry : entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public static <K, V> void succeedsInMultimap(C17641a<K, V> aVar, C17641a<K, V> aVar2) {
        aVar.mo45636a(aVar2);
        aVar2.mo45640b(aVar);
    }

    public static <K, V> void succeedsInValueSet(C17644c<K, V> cVar, C17644c<K, V> cVar2) {
        cVar.mo45641b(cVar2);
        cVar2.mo45637a(cVar);
    }

    public final /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    public final Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return super.replaceValues((Object) k, (Iterable) iterable);
    }

    public static <K, V> LinkedHashMultimap<K, V> create(int i, int i2) {
        return new LinkedHashMultimap<>(C17839bx.m59342b(i), C17839bx.m59342b(i2));
    }

    private LinkedHashMultimap(int i, int i2) {
        super(C17898cj.m59509b(i));
        C18053v.m59700a(i2, "expectedValuesPerKey");
        this.valueSetCapacity = i2;
        this.multimapHeaderEntry = new C17641a<>(null, null, 0, null);
        succeedsInMultimap(this.multimapHeaderEntry, this.multimapHeaderEntry);
    }
}
