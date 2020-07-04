package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new Comparator<Comparable>() {
        /* renamed from: a */
        private static int m20522a(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m20522a((Comparable) obj, (Comparable) obj2);
        }
    };
    Comparator<? super K> comparator;
    private C6613a entrySet;
    final C6618d<K, V> header;
    private C6615b keySet;
    int modCount;
    C6618d<K, V> root;
    int size;

    /* renamed from: com.google.gson.internal.LinkedTreeMap$a */
    class C6613a extends AbstractSet<Entry<K, V>> {
        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new C6617c<Entry<K, V>>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public Entry<K, V> next() {
                    return mo16047a();
                }

                {
                    LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                }
            };
        }

        public final int size() {
            return LinkedTreeMap.this.size;
        }

        C6613a() {
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry) || LinkedTreeMap.this.findByEntry((Entry) obj) == null) {
                return false;
            }
            return true;
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            C6618d findByEntry = LinkedTreeMap.this.findByEntry((Entry) obj);
            if (findByEntry == null) {
                return false;
            }
            LinkedTreeMap.this.removeInternal(findByEntry, true);
            return true;
        }
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$b */
    final class C6615b extends AbstractSet<K> {
        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        public final Iterator<K> iterator() {
            return new C6617c<K>() {
                public final K next() {
                    return mo16047a().f18975f;
                }

                {
                    LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                }
            };
        }

        public final int size() {
            return LinkedTreeMap.this.size;
        }

        C6615b() {
        }

        public final boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            if (LinkedTreeMap.this.removeInternalByKey(obj) != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$c */
    abstract class C6617c<T> implements Iterator<T> {

        /* renamed from: b */
        C6618d<K, V> f18966b = LinkedTreeMap.this.header.f18973d;

        /* renamed from: c */
        C6618d<K, V> f18967c;

        /* renamed from: d */
        int f18968d = LinkedTreeMap.this.modCount;

        public final boolean hasNext() {
            if (this.f18966b != LinkedTreeMap.this.header) {
                return true;
            }
            return false;
        }

        public final void remove() {
            if (this.f18967c != null) {
                LinkedTreeMap.this.removeInternal(this.f18967c, true);
                this.f18967c = null;
                this.f18968d = LinkedTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C6618d<K, V> mo16047a() {
            C6618d<K, V> dVar = this.f18966b;
            if (dVar == LinkedTreeMap.this.header) {
                throw new NoSuchElementException();
            } else if (LinkedTreeMap.this.modCount == this.f18968d) {
                this.f18966b = dVar.f18973d;
                this.f18967c = dVar;
                return dVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        C6617c() {
        }
    }

    /* renamed from: com.google.gson.internal.LinkedTreeMap$d */
    static final class C6618d<K, V> implements Entry<K, V> {

        /* renamed from: a */
        C6618d<K, V> f18970a;

        /* renamed from: b */
        C6618d<K, V> f18971b;

        /* renamed from: c */
        C6618d<K, V> f18972c;

        /* renamed from: d */
        C6618d<K, V> f18973d;

        /* renamed from: e */
        C6618d<K, V> f18974e;

        /* renamed from: f */
        final K f18975f;

        /* renamed from: g */
        V f18976g;

        /* renamed from: h */
        int f18977h;

        public final K getKey() {
            return this.f18975f;
        }

        public final V getValue() {
            return this.f18976g;
        }

        C6618d() {
            this.f18974e = this;
            this.f18973d = this;
        }

        /* renamed from: a */
        public final C6618d<K, V> mo16050a() {
            C6618d dVar = this;
            for (C6618d dVar2 = this.f18971b; dVar2 != null; dVar2 = dVar2.f18971b) {
                dVar = dVar2;
            }
            return dVar;
        }

        /* renamed from: b */
        public final C6618d<K, V> mo16051b() {
            C6618d dVar = this;
            for (C6618d dVar2 = this.f18972c; dVar2 != null; dVar2 = dVar2.f18972c) {
                dVar = dVar2;
            }
            return dVar;
        }

        public final int hashCode() {
            int i;
            int i2 = 0;
            if (this.f18975f == null) {
                i = 0;
            } else {
                i = this.f18975f.hashCode();
            }
            if (this.f18976g != null) {
                i2 = this.f18976g.hashCode();
            }
            return i ^ i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f18975f);
            sb.append("=");
            sb.append(this.f18976g);
            return sb.toString();
        }

        public final V setValue(V v) {
            V v2 = this.f18976g;
            this.f18976g = v;
            return v2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (this.f18975f != null ? this.f18975f.equals(entry.getKey()) : entry.getKey() == null) {
                if (this.f18976g != null ? this.f18976g.equals(entry.getValue()) : entry.getValue() == null) {
                    return true;
                }
            }
            return false;
        }

        C6618d(C6618d<K, V> dVar, K k, C6618d<K, V> dVar2, C6618d<K, V> dVar3) {
            this.f18970a = dVar;
            this.f18975f = k;
            this.f18977h = 1;
            this.f18973d = dVar2;
            this.f18974e = dVar3;
            dVar3.f18973d = this;
            dVar2.f18974e = this;
        }
    }

    public final int size() {
        return this.size;
    }

    public LinkedTreeMap() {
        this(NATURAL_ORDER);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final Set<Entry<K, V>> entrySet() {
        C6613a aVar = this.entrySet;
        if (aVar != null) {
            return aVar;
        }
        C6613a aVar2 = new C6613a<>();
        this.entrySet = aVar2;
        return aVar2;
    }

    public final Set<K> keySet() {
        C6615b bVar = this.keySet;
        if (bVar != null) {
            return bVar;
        }
        C6615b bVar2 = new C6615b<>();
        this.keySet = bVar2;
        return bVar2;
    }

    public final void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        C6618d<K, V> dVar = this.header;
        dVar.f18974e = dVar;
        dVar.f18973d = dVar;
    }

    public final boolean containsKey(Object obj) {
        if (findByObject(obj) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final C6618d<K, V> findByObject(Object obj) {
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
        C6618d findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.f18976g;
        }
        return null;
    }

    public final V remove(Object obj) {
        C6618d removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.f18976g;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final C6618d<K, V> removeInternalByKey(Object obj) {
        C6618d<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Comparator<? super K>, code=java.util.Comparator, for r2v0, types: [java.util.Comparator<? super K>, java.util.Comparator] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LinkedTreeMap(java.util.Comparator r2) {
        /*
            r1 = this;
            r1.<init>()
            com.google.gson.internal.LinkedTreeMap$d r0 = new com.google.gson.internal.LinkedTreeMap$d
            r0.<init>()
            r1.header = r0
            if (r2 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            java.util.Comparator<java.lang.Comparable> r2 = NATURAL_ORDER
        L_0x000f:
            r1.comparator = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.<init>(java.util.Comparator):void");
    }

    /* access modifiers changed from: 0000 */
    public final C6618d<K, V> findByEntry(Entry<?, ?> entry) {
        boolean z;
        C6618d<K, V> findByObject = findByObject(entry.getKey());
        if (findByObject == null || !equal(findByObject.f18976g, entry.getValue())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return findByObject;
        }
        return null;
    }

    private void rotateLeft(C6618d<K, V> dVar) {
        int i;
        int i2;
        C6618d<K, V> dVar2 = dVar.f18971b;
        C6618d<K, V> dVar3 = dVar.f18972c;
        C6618d<K, V> dVar4 = dVar3.f18971b;
        C6618d<K, V> dVar5 = dVar3.f18972c;
        dVar.f18972c = dVar4;
        if (dVar4 != null) {
            dVar4.f18970a = dVar;
        }
        replaceInParent(dVar, dVar3);
        dVar3.f18971b = dVar;
        dVar.f18970a = dVar3;
        int i3 = 0;
        if (dVar2 != null) {
            i = dVar2.f18977h;
        } else {
            i = 0;
        }
        if (dVar4 != null) {
            i2 = dVar4.f18977h;
        } else {
            i2 = 0;
        }
        dVar.f18977h = Math.max(i, i2) + 1;
        int i4 = dVar.f18977h;
        if (dVar5 != null) {
            i3 = dVar5.f18977h;
        }
        dVar3.f18977h = Math.max(i4, i3) + 1;
    }

    private void rotateRight(C6618d<K, V> dVar) {
        int i;
        int i2;
        C6618d<K, V> dVar2 = dVar.f18971b;
        C6618d<K, V> dVar3 = dVar.f18972c;
        C6618d<K, V> dVar4 = dVar2.f18971b;
        C6618d<K, V> dVar5 = dVar2.f18972c;
        dVar.f18971b = dVar5;
        if (dVar5 != null) {
            dVar5.f18970a = dVar;
        }
        replaceInParent(dVar, dVar2);
        dVar2.f18972c = dVar;
        dVar.f18970a = dVar2;
        int i3 = 0;
        if (dVar3 != null) {
            i = dVar3.f18977h;
        } else {
            i = 0;
        }
        if (dVar5 != null) {
            i2 = dVar5.f18977h;
        } else {
            i2 = 0;
        }
        dVar.f18977h = Math.max(i, i2) + 1;
        int i4 = dVar.f18977h;
        if (dVar4 != null) {
            i3 = dVar4.f18977h;
        }
        dVar2.f18977h = Math.max(i4, i3) + 1;
    }

    private boolean equal(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    private void replaceInParent(C6618d<K, V> dVar, C6618d<K, V> dVar2) {
        C6618d<K, V> dVar3 = dVar.f18970a;
        dVar.f18970a = null;
        if (dVar2 != null) {
            dVar2.f18970a = dVar3;
        }
        if (dVar3 == null) {
            this.root = dVar2;
        } else if (dVar3.f18971b == dVar) {
            dVar3.f18971b = dVar2;
        } else {
            dVar3.f18972c = dVar2;
        }
    }

    public final V put(K k, V v) {
        if (k != null) {
            C6618d find = find(k, true);
            V v2 = find.f18976g;
            find.f18976g = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    private void rebalance(C6618d<K, V> dVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (dVar != null) {
            C6618d<K, V> dVar2 = dVar.f18971b;
            C6618d<K, V> dVar3 = dVar.f18972c;
            int i5 = 0;
            if (dVar2 != null) {
                i = dVar2.f18977h;
            } else {
                i = 0;
            }
            if (dVar3 != null) {
                i2 = dVar3.f18977h;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 != -2) {
                if (i6 != 2) {
                    if (i6 != 0) {
                        dVar.f18977h = Math.max(i, i2) + 1;
                        if (!z) {
                            break;
                        }
                    } else {
                        dVar.f18977h = i + 1;
                        if (z) {
                            return;
                        }
                    }
                } else {
                    C6618d<K, V> dVar4 = dVar2.f18971b;
                    C6618d<K, V> dVar5 = dVar2.f18972c;
                    if (dVar5 != null) {
                        i3 = dVar5.f18977h;
                    } else {
                        i3 = 0;
                    }
                    if (dVar4 != null) {
                        i5 = dVar4.f18977h;
                    }
                    int i7 = i5 - i3;
                    if (i7 == 1 || (i7 == 0 && !z)) {
                        rotateRight(dVar);
                    } else {
                        rotateLeft(dVar2);
                        rotateRight(dVar);
                    }
                    if (z) {
                        break;
                    }
                }
            } else {
                C6618d<K, V> dVar6 = dVar3.f18971b;
                C6618d<K, V> dVar7 = dVar3.f18972c;
                if (dVar7 != null) {
                    i4 = dVar7.f18977h;
                } else {
                    i4 = 0;
                }
                if (dVar6 != null) {
                    i5 = dVar6.f18977h;
                }
                int i8 = i5 - i4;
                if (i8 == -1 || (i8 == 0 && !z)) {
                    rotateLeft(dVar);
                } else {
                    rotateRight(dVar3);
                    rotateLeft(dVar);
                }
                if (z) {
                    break;
                }
            }
            dVar = dVar.f18970a;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void removeInternal(C6618d<K, V> dVar, boolean z) {
        C6618d<K, V> dVar2;
        int i;
        if (z) {
            dVar.f18974e.f18973d = dVar.f18973d;
            dVar.f18973d.f18974e = dVar.f18974e;
        }
        C6618d<K, V> dVar3 = dVar.f18971b;
        C6618d<K, V> dVar4 = dVar.f18972c;
        C6618d<K, V> dVar5 = dVar.f18970a;
        int i2 = 0;
        if (dVar3 == null || dVar4 == null) {
            if (dVar3 != null) {
                replaceInParent(dVar, dVar3);
                dVar.f18971b = null;
            } else if (dVar4 != null) {
                replaceInParent(dVar, dVar4);
                dVar.f18972c = null;
            } else {
                replaceInParent(dVar, null);
            }
            rebalance(dVar5, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (dVar3.f18977h > dVar4.f18977h) {
            dVar2 = dVar3.mo16051b();
        } else {
            dVar2 = dVar4.mo16050a();
        }
        removeInternal(dVar2, false);
        C6618d<K, V> dVar6 = dVar.f18971b;
        if (dVar6 != null) {
            i = dVar6.f18977h;
            dVar2.f18971b = dVar6;
            dVar6.f18970a = dVar2;
            dVar.f18971b = null;
        } else {
            i = 0;
        }
        C6618d<K, V> dVar7 = dVar.f18972c;
        if (dVar7 != null) {
            i2 = dVar7.f18977h;
            dVar2.f18972c = dVar7;
            dVar7.f18970a = dVar2;
            dVar.f18972c = null;
        }
        dVar2.f18977h = Math.max(i, i2) + 1;
        replaceInParent(dVar, dVar2);
    }

    /* access modifiers changed from: 0000 */
    public final C6618d<K, V> find(K k, boolean z) {
        int i;
        C6618d<K, V> dVar;
        Comparable comparable;
        C6618d<K, V> dVar2;
        Comparator<? super K> comparator2 = this.comparator;
        C6618d<K, V> dVar3 = this.root;
        if (dVar3 != null) {
            if (comparator2 == NATURAL_ORDER) {
                comparable = (Comparable) k;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(dVar3.f18975f);
                } else {
                    i = comparator2.compare(k, dVar3.f18975f);
                }
                if (i != 0) {
                    if (i < 0) {
                        dVar2 = dVar3.f18971b;
                    } else {
                        dVar2 = dVar3.f18972c;
                    }
                    if (dVar2 == null) {
                        break;
                    }
                    dVar3 = dVar2;
                } else {
                    return dVar3;
                }
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C6618d<K, V> dVar4 = this.header;
        if (dVar3 != null) {
            dVar = new C6618d<>(dVar3, k, dVar4, dVar4.f18974e);
            if (i < 0) {
                dVar3.f18971b = dVar;
            } else {
                dVar3.f18972c = dVar;
            }
            rebalance(dVar3, true);
        } else if (comparator2 != NATURAL_ORDER || (k instanceof Comparable)) {
            dVar = new C6618d<>(dVar3, k, dVar4, dVar4.f18974e);
            this.root = dVar;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(k.getClass().getName());
            sb.append(" is not Comparable");
            throw new ClassCastException(sb.toString());
        }
        this.size++;
        this.modCount++;
        return dVar;
    }
}
