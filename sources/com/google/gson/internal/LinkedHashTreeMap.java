package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new Comparator<Comparable>() {
        /* renamed from: a */
        private static int m60520a(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m60520a((Comparable) obj, (Comparable) obj2);
        }
    };
    Comparator<? super K> comparator;
    private C18367c entrySet;
    final C18372f<K, V> header;
    private C18369d keySet;
    int modCount;
    int size;
    C18372f<K, V>[] table;
    int threshold;

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$a */
    static final class C18365a<K, V> {

        /* renamed from: a */
        private C18372f<K, V> f49874a;

        /* renamed from: b */
        private int f49875b;

        /* renamed from: c */
        private int f49876c;

        /* renamed from: d */
        private int f49877d;

        C18365a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C18372f<K, V> mo47318a() {
            C18372f<K, V> fVar = this.f49874a;
            if (fVar.f49887a == null) {
                return fVar;
            }
            throw new IllegalStateException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo47319a(int i) {
            this.f49875b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f49877d = 0;
            this.f49876c = 0;
            this.f49874a = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo47320a(C18372f<K, V> fVar) {
            fVar.f49889c = null;
            fVar.f49887a = null;
            fVar.f49888b = null;
            fVar.f49895i = 1;
            if (this.f49875b > 0 && (this.f49877d & 1) == 0) {
                this.f49877d++;
                this.f49875b--;
                this.f49876c++;
            }
            fVar.f49887a = this.f49874a;
            this.f49874a = fVar;
            this.f49877d++;
            if (this.f49875b > 0 && (this.f49877d & 1) == 0) {
                this.f49877d++;
                this.f49875b--;
                this.f49876c++;
            }
            int i = 4;
            while (true) {
                int i2 = i - 1;
                if ((this.f49877d & i2) == i2) {
                    if (this.f49876c == 0) {
                        C18372f<K, V> fVar2 = this.f49874a;
                        C18372f<K, V> fVar3 = fVar2.f49887a;
                        C18372f<K, V> fVar4 = fVar3.f49887a;
                        fVar3.f49887a = fVar4.f49887a;
                        this.f49874a = fVar3;
                        fVar3.f49888b = fVar4;
                        fVar3.f49889c = fVar2;
                        fVar3.f49895i = fVar2.f49895i + 1;
                        fVar4.f49887a = fVar3;
                        fVar2.f49887a = fVar3;
                    } else if (this.f49876c == 1) {
                        C18372f<K, V> fVar5 = this.f49874a;
                        C18372f<K, V> fVar6 = fVar5.f49887a;
                        this.f49874a = fVar6;
                        fVar6.f49889c = fVar5;
                        fVar6.f49895i = fVar5.f49895i + 1;
                        fVar5.f49887a = fVar6;
                        this.f49876c = 0;
                    } else if (this.f49876c == 2) {
                        this.f49876c = 0;
                    }
                    i *= 2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$b */
    static class C18366b<K, V> {

        /* renamed from: a */
        private C18372f<K, V> f49878a;

        C18366b() {
        }

        /* renamed from: a */
        public final C18372f<K, V> mo47321a() {
            C18372f<K, V> fVar = this.f49878a;
            if (fVar == null) {
                return null;
            }
            C18372f<K, V> fVar2 = fVar.f49887a;
            fVar.f49887a = null;
            C18372f<K, V> fVar3 = fVar.f49889c;
            while (true) {
                C18372f<K, V> fVar4 = fVar2;
                fVar2 = fVar3;
                C18372f<K, V> fVar5 = fVar4;
                if (fVar2 != null) {
                    fVar2.f49887a = fVar5;
                    fVar3 = fVar2.f49888b;
                } else {
                    this.f49878a = fVar5;
                    return fVar;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo47322a(C18372f<K, V> fVar) {
            C18372f<K, V> fVar2 = null;
            while (true) {
                C18372f<K, V> fVar3 = fVar2;
                fVar2 = fVar;
                C18372f<K, V> fVar4 = fVar3;
                if (fVar2 != null) {
                    fVar2.f49887a = fVar4;
                    fVar = fVar2.f49888b;
                } else {
                    this.f49878a = fVar4;
                    return;
                }
            }
        }
    }

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$c */
    final class C18367c extends AbstractSet<Entry<K, V>> {
        public final void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new C18371e<Entry<K, V>>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public Entry<K, V> next() {
                    return mo47335a();
                }

                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }
            };
        }

        public final int size() {
            return LinkedHashTreeMap.this.size;
        }

        C18367c() {
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry) || LinkedHashTreeMap.this.findByEntry((Entry) obj) == null) {
                return false;
            }
            return true;
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            C18372f findByEntry = LinkedHashTreeMap.this.findByEntry((Entry) obj);
            if (findByEntry == null) {
                return false;
            }
            LinkedHashTreeMap.this.removeInternal(findByEntry, true);
            return true;
        }
    }

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$d */
    final class C18369d extends AbstractSet<K> {
        public final void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public final Iterator<K> iterator() {
            return new C18371e<K>() {
                public final K next() {
                    return mo47335a().f49892f;
                }

                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }
            };
        }

        public final int size() {
            return LinkedHashTreeMap.this.size;
        }

        C18369d() {
        }

        public final boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            if (LinkedHashTreeMap.this.removeInternalByKey(obj) != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$e */
    abstract class C18371e<T> implements Iterator<T> {

        /* renamed from: b */
        C18372f<K, V> f49883b = LinkedHashTreeMap.this.header.f49890d;

        /* renamed from: c */
        C18372f<K, V> f49884c;

        /* renamed from: d */
        int f49885d = LinkedHashTreeMap.this.modCount;

        public final boolean hasNext() {
            if (this.f49883b != LinkedHashTreeMap.this.header) {
                return true;
            }
            return false;
        }

        public final void remove() {
            if (this.f49884c != null) {
                LinkedHashTreeMap.this.removeInternal(this.f49884c, true);
                this.f49884c = null;
                this.f49885d = LinkedHashTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C18372f<K, V> mo47335a() {
            C18372f<K, V> fVar = this.f49883b;
            if (fVar == LinkedHashTreeMap.this.header) {
                throw new NoSuchElementException();
            } else if (LinkedHashTreeMap.this.modCount == this.f49885d) {
                this.f49883b = fVar.f49890d;
                this.f49884c = fVar;
                return fVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        C18371e() {
        }
    }

    /* renamed from: com.google.gson.internal.LinkedHashTreeMap$f */
    static final class C18372f<K, V> implements Entry<K, V> {

        /* renamed from: a */
        C18372f<K, V> f49887a;

        /* renamed from: b */
        C18372f<K, V> f49888b;

        /* renamed from: c */
        C18372f<K, V> f49889c;

        /* renamed from: d */
        C18372f<K, V> f49890d;

        /* renamed from: e */
        C18372f<K, V> f49891e;

        /* renamed from: f */
        final K f49892f;

        /* renamed from: g */
        final int f49893g;

        /* renamed from: h */
        V f49894h;

        /* renamed from: i */
        int f49895i;

        public final K getKey() {
            return this.f49892f;
        }

        public final V getValue() {
            return this.f49894h;
        }

        C18372f() {
            this.f49893g = -1;
            this.f49891e = this;
            this.f49890d = this;
        }

        /* renamed from: a */
        public final C18372f<K, V> mo47338a() {
            C18372f fVar = this;
            for (C18372f fVar2 = this.f49888b; fVar2 != null; fVar2 = fVar2.f49888b) {
                fVar = fVar2;
            }
            return fVar;
        }

        /* renamed from: b */
        public final C18372f<K, V> mo47339b() {
            C18372f fVar = this;
            for (C18372f fVar2 = this.f49889c; fVar2 != null; fVar2 = fVar2.f49889c) {
                fVar = fVar2;
            }
            return fVar;
        }

        public final int hashCode() {
            int i;
            int i2 = 0;
            if (this.f49892f == null) {
                i = 0;
            } else {
                i = this.f49892f.hashCode();
            }
            if (this.f49894h != null) {
                i2 = this.f49894h.hashCode();
            }
            return i ^ i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f49892f);
            sb.append("=");
            sb.append(this.f49894h);
            return sb.toString();
        }

        public final V setValue(V v) {
            V v2 = this.f49894h;
            this.f49894h = v;
            return v2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (this.f49892f != null ? this.f49892f.equals(entry.getKey()) : entry.getKey() == null) {
                if (this.f49894h != null ? this.f49894h.equals(entry.getValue()) : entry.getValue() == null) {
                    return true;
                }
            }
            return false;
        }

        C18372f(C18372f<K, V> fVar, K k, int i, C18372f<K, V> fVar2, C18372f<K, V> fVar3) {
            this.f49887a = fVar;
            this.f49892f = k;
            this.f49893g = i;
            this.f49895i = 1;
            this.f49890d = fVar2;
            this.f49891e = fVar3;
            fVar3.f49890d = this;
            fVar2.f49891e = this;
        }
    }

    private static int secondaryHash(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    public final int size() {
        return this.size;
    }

    public LinkedHashTreeMap() {
        this(NATURAL_ORDER);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final Set<Entry<K, V>> entrySet() {
        C18367c cVar = this.entrySet;
        if (cVar != null) {
            return cVar;
        }
        C18367c cVar2 = new C18367c<>();
        this.entrySet = cVar2;
        return cVar2;
    }

    public final Set<K> keySet() {
        C18369d dVar = this.keySet;
        if (dVar != null) {
            return dVar;
        }
        C18369d dVar2 = new C18369d<>();
        this.keySet = dVar2;
        return dVar2;
    }

    private void doubleCapacity() {
        this.table = doubleCapacity(this.table);
        this.threshold = (this.table.length / 2) + (this.table.length / 4);
    }

    public final void clear() {
        Arrays.fill(this.table, null);
        this.size = 0;
        this.modCount++;
        C18372f<K, V> fVar = this.header;
        C18372f<K, V> fVar2 = fVar.f49890d;
        while (fVar2 != fVar) {
            C18372f<K, V> fVar3 = fVar2.f49890d;
            fVar2.f49891e = null;
            fVar2.f49890d = null;
            fVar2 = fVar3;
        }
        fVar.f49891e = fVar;
        fVar.f49890d = fVar;
    }

    public final boolean containsKey(Object obj) {
        if (findByObject(obj) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final C18372f<K, V> findByObject(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return find(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final V get(Object obj) {
        C18372f findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.f49894h;
        }
        return null;
    }

    public final V remove(Object obj) {
        C18372f removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.f49894h;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final C18372f<K, V> removeInternalByKey(Object obj) {
        C18372f<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    /* access modifiers changed from: 0000 */
    public final C18372f<K, V> findByEntry(Entry<?, ?> entry) {
        boolean z;
        C18372f<K, V> findByObject = findByObject(entry.getKey());
        if (findByObject == null || !equal(findByObject.f49894h, entry.getValue())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return findByObject;
        }
        return null;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Comparator<? super K>, code=java.util.Comparator, for r2v0, types: [java.util.Comparator<? super K>, java.util.Comparator] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LinkedHashTreeMap(java.util.Comparator r2) {
        /*
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L_0x0006
            goto L_0x0008
        L_0x0006:
            java.util.Comparator<java.lang.Comparable> r2 = NATURAL_ORDER
        L_0x0008:
            r1.comparator = r2
            com.google.gson.internal.LinkedHashTreeMap$f r2 = new com.google.gson.internal.LinkedHashTreeMap$f
            r2.<init>()
            r1.header = r2
            r2 = 16
            com.google.gson.internal.LinkedHashTreeMap$f[] r2 = new com.google.gson.internal.LinkedHashTreeMap.C18372f[r2]
            r1.table = r2
            com.google.gson.internal.LinkedHashTreeMap$f<K, V>[] r2 = r1.table
            int r2 = r2.length
            int r2 = r2 / 2
            com.google.gson.internal.LinkedHashTreeMap$f<K, V>[] r0 = r1.table
            int r0 = r0.length
            int r0 = r0 / 4
            int r2 = r2 + r0
            r1.threshold = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedHashTreeMap.<init>(java.util.Comparator):void");
    }

    private void rotateLeft(C18372f<K, V> fVar) {
        int i;
        int i2;
        C18372f<K, V> fVar2 = fVar.f49888b;
        C18372f<K, V> fVar3 = fVar.f49889c;
        C18372f<K, V> fVar4 = fVar3.f49888b;
        C18372f<K, V> fVar5 = fVar3.f49889c;
        fVar.f49889c = fVar4;
        if (fVar4 != null) {
            fVar4.f49887a = fVar;
        }
        replaceInParent(fVar, fVar3);
        fVar3.f49888b = fVar;
        fVar.f49887a = fVar3;
        int i3 = 0;
        if (fVar2 != null) {
            i = fVar2.f49895i;
        } else {
            i = 0;
        }
        if (fVar4 != null) {
            i2 = fVar4.f49895i;
        } else {
            i2 = 0;
        }
        fVar.f49895i = Math.max(i, i2) + 1;
        int i4 = fVar.f49895i;
        if (fVar5 != null) {
            i3 = fVar5.f49895i;
        }
        fVar3.f49895i = Math.max(i4, i3) + 1;
    }

    private void rotateRight(C18372f<K, V> fVar) {
        int i;
        int i2;
        C18372f<K, V> fVar2 = fVar.f49888b;
        C18372f<K, V> fVar3 = fVar.f49889c;
        C18372f<K, V> fVar4 = fVar2.f49888b;
        C18372f<K, V> fVar5 = fVar2.f49889c;
        fVar.f49888b = fVar5;
        if (fVar5 != null) {
            fVar5.f49887a = fVar;
        }
        replaceInParent(fVar, fVar2);
        fVar2.f49889c = fVar;
        fVar.f49887a = fVar2;
        int i3 = 0;
        if (fVar3 != null) {
            i = fVar3.f49895i;
        } else {
            i = 0;
        }
        if (fVar5 != null) {
            i2 = fVar5.f49895i;
        } else {
            i2 = 0;
        }
        fVar.f49895i = Math.max(i, i2) + 1;
        int i4 = fVar.f49895i;
        if (fVar4 != null) {
            i3 = fVar4.f49895i;
        }
        fVar2.f49895i = Math.max(i4, i3) + 1;
    }

    static <K, V> C18372f<K, V>[] doubleCapacity(C18372f<K, V>[] fVarArr) {
        C18372f<K, V> fVar;
        int length = fVarArr.length;
        C18372f<K, V>[] fVarArr2 = new C18372f[(length * 2)];
        C18366b bVar = new C18366b();
        C18365a aVar = new C18365a();
        C18365a aVar2 = new C18365a();
        for (int i = 0; i < length; i++) {
            C18372f<K, V> fVar2 = fVarArr[i];
            if (fVar2 != null) {
                bVar.mo47322a(fVar2);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    C18372f a = bVar.mo47321a();
                    if (a == null) {
                        break;
                    } else if ((a.f49893g & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                aVar.mo47319a(i2);
                aVar2.mo47319a(i3);
                bVar.mo47322a(fVar2);
                while (true) {
                    C18372f a2 = bVar.mo47321a();
                    if (a2 == null) {
                        break;
                    } else if ((a2.f49893g & length) == 0) {
                        aVar.mo47320a(a2);
                    } else {
                        aVar2.mo47320a(a2);
                    }
                }
                C18372f<K, V> fVar3 = null;
                if (i2 > 0) {
                    fVar = aVar.mo47318a();
                } else {
                    fVar = null;
                }
                fVarArr2[i] = fVar;
                int i4 = i + length;
                if (i3 > 0) {
                    fVar3 = aVar2.mo47318a();
                }
                fVarArr2[i4] = fVar3;
            }
        }
        return fVarArr2;
    }

    private boolean equal(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public final V put(K k, V v) {
        if (k != null) {
            C18372f find = find(k, true);
            V v2 = find.f49894h;
            find.f49894h = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    private void replaceInParent(C18372f<K, V> fVar, C18372f<K, V> fVar2) {
        C18372f<K, V> fVar3 = fVar.f49887a;
        fVar.f49887a = null;
        if (fVar2 != null) {
            fVar2.f49887a = fVar3;
        }
        if (fVar3 == null) {
            this.table[fVar.f49893g & (this.table.length - 1)] = fVar2;
        } else if (fVar3.f49888b == fVar) {
            fVar3.f49888b = fVar2;
        } else {
            fVar3.f49889c = fVar2;
        }
    }

    private void rebalance(C18372f<K, V> fVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (fVar != null) {
            C18372f<K, V> fVar2 = fVar.f49888b;
            C18372f<K, V> fVar3 = fVar.f49889c;
            int i5 = 0;
            if (fVar2 != null) {
                i = fVar2.f49895i;
            } else {
                i = 0;
            }
            if (fVar3 != null) {
                i2 = fVar3.f49895i;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 != -2) {
                if (i6 != 2) {
                    if (i6 != 0) {
                        fVar.f49895i = Math.max(i, i2) + 1;
                        if (!z) {
                            break;
                        }
                    } else {
                        fVar.f49895i = i + 1;
                        if (z) {
                            return;
                        }
                    }
                } else {
                    C18372f<K, V> fVar4 = fVar2.f49888b;
                    C18372f<K, V> fVar5 = fVar2.f49889c;
                    if (fVar5 != null) {
                        i3 = fVar5.f49895i;
                    } else {
                        i3 = 0;
                    }
                    if (fVar4 != null) {
                        i5 = fVar4.f49895i;
                    }
                    int i7 = i5 - i3;
                    if (i7 == 1 || (i7 == 0 && !z)) {
                        rotateRight(fVar);
                    } else {
                        rotateLeft(fVar2);
                        rotateRight(fVar);
                    }
                    if (z) {
                        break;
                    }
                }
            } else {
                C18372f<K, V> fVar6 = fVar3.f49888b;
                C18372f<K, V> fVar7 = fVar3.f49889c;
                if (fVar7 != null) {
                    i4 = fVar7.f49895i;
                } else {
                    i4 = 0;
                }
                if (fVar6 != null) {
                    i5 = fVar6.f49895i;
                }
                int i8 = i5 - i4;
                if (i8 == -1 || (i8 == 0 && !z)) {
                    rotateLeft(fVar);
                } else {
                    rotateRight(fVar3);
                    rotateLeft(fVar);
                }
                if (z) {
                    break;
                }
            }
            fVar = fVar.f49887a;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void removeInternal(C18372f<K, V> fVar, boolean z) {
        C18372f<K, V> fVar2;
        int i;
        if (z) {
            fVar.f49891e.f49890d = fVar.f49890d;
            fVar.f49890d.f49891e = fVar.f49891e;
            fVar.f49891e = null;
            fVar.f49890d = null;
        }
        C18372f<K, V> fVar3 = fVar.f49888b;
        C18372f<K, V> fVar4 = fVar.f49889c;
        C18372f<K, V> fVar5 = fVar.f49887a;
        int i2 = 0;
        if (fVar3 == null || fVar4 == null) {
            if (fVar3 != null) {
                replaceInParent(fVar, fVar3);
                fVar.f49888b = null;
            } else if (fVar4 != null) {
                replaceInParent(fVar, fVar4);
                fVar.f49889c = null;
            } else {
                replaceInParent(fVar, null);
            }
            rebalance(fVar5, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (fVar3.f49895i > fVar4.f49895i) {
            fVar2 = fVar3.mo47339b();
        } else {
            fVar2 = fVar4.mo47338a();
        }
        removeInternal(fVar2, false);
        C18372f<K, V> fVar6 = fVar.f49888b;
        if (fVar6 != null) {
            i = fVar6.f49895i;
            fVar2.f49888b = fVar6;
            fVar6.f49887a = fVar2;
            fVar.f49888b = null;
        } else {
            i = 0;
        }
        C18372f<K, V> fVar7 = fVar.f49889c;
        if (fVar7 != null) {
            i2 = fVar7.f49895i;
            fVar2.f49889c = fVar7;
            fVar7.f49887a = fVar2;
            fVar.f49889c = null;
        }
        fVar2.f49895i = Math.max(i, i2) + 1;
        replaceInParent(fVar, fVar2);
    }

    /* access modifiers changed from: 0000 */
    public final C18372f<K, V> find(K k, boolean z) {
        int i;
        C18372f<K, V> fVar;
        C18372f<K, V> fVar2;
        Comparable comparable;
        int i2;
        C18372f<K, V> fVar3;
        Comparator<? super K> comparator2 = this.comparator;
        C18372f<K, V>[] fVarArr = this.table;
        int secondaryHash = secondaryHash(k.hashCode());
        int length = (fVarArr.length - 1) & secondaryHash;
        C18372f<K, V> fVar4 = fVarArr[length];
        if (fVar4 != null) {
            if (comparator2 == NATURAL_ORDER) {
                comparable = (Comparable) k;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i2 = comparable.compareTo(fVar4.f49892f);
                } else {
                    i2 = comparator2.compare(k, fVar4.f49892f);
                }
                if (i2 != 0) {
                    if (i2 < 0) {
                        fVar3 = fVar4.f49888b;
                    } else {
                        fVar3 = fVar4.f49889c;
                    }
                    if (fVar3 == null) {
                        fVar = fVar4;
                        i = i2;
                        break;
                    }
                    fVar4 = fVar3;
                } else {
                    return fVar4;
                }
            }
        } else {
            fVar = fVar4;
            i = 0;
        }
        if (!z) {
            return null;
        }
        C18372f<K, V> fVar5 = this.header;
        if (fVar != null) {
            fVar2 = new C18372f<>(fVar, k, secondaryHash, fVar5, fVar5.f49891e);
            if (i < 0) {
                fVar.f49888b = fVar2;
            } else {
                fVar.f49889c = fVar2;
            }
            rebalance(fVar, true);
        } else if (comparator2 != NATURAL_ORDER || (k instanceof Comparable)) {
            fVar2 = new C18372f<>(fVar, k, secondaryHash, fVar5, fVar5.f49891e);
            fVarArr[length] = fVar2;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(k.getClass().getName());
            sb.append(" is not Comparable");
            throw new ClassCastException(sb.toString());
        }
        int i3 = this.size;
        this.size = i3 + 1;
        if (i3 > this.threshold) {
            doubleCapacity();
        }
        this.modCount++;
        return fVar2;
    }
}
