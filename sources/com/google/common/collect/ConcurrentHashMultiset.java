package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.collect.C17882cb.C17883a;
import com.google.common.primitives.C18143c;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class ConcurrentHashMultiset<E> extends C18032i<E> implements Serializable {
    private static final long serialVersionUID = 1;
    public final transient ConcurrentMap<E, AtomicInteger> countMap;

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$a */
    class C17562a extends C18034b {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C17882cb mo45256a() {
            return ConcurrentHashMultiset.this;
        }

        /* renamed from: b */
        private List<C17883a<E>> m58482b() {
            ArrayList b = C17795bu.m59150b(size());
            C17782br.m59113a((Collection<T>) b, iterator());
            return b;
        }

        public final Object[] toArray() {
            return m58482b().toArray();
        }

        private C17562a() {
            super();
        }

        public final <T> T[] toArray(T[] tArr) {
            return m58482b().toArray(tArr);
        }
    }

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$b */
    static class C17563b {

        /* renamed from: a */
        static final C17930a<ConcurrentHashMultiset> f48649a = C17928cz.m59552a(ConcurrentHashMultiset.class, "countMap");
    }

    public final void clear() {
        this.countMap.clear();
    }

    public final Set<C17883a<E>> createEntrySet() {
        return new C17562a();
    }

    /* access modifiers changed from: 0000 */
    public final int distinctElements() {
        return this.countMap.size();
    }

    /* access modifiers changed from: 0000 */
    public final Iterator<E> elementIterator() {
        throw new AssertionError("should never be called");
    }

    public final /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    public final /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public final boolean isEmpty() {
        return this.countMap.isEmpty();
    }

    public final Iterator<E> iterator() {
        return C17884cc.m59425a((C17882cb<E>) this);
    }

    public static <E> ConcurrentHashMultiset<E> create() {
        return new ConcurrentHashMultiset<>(new ConcurrentHashMap());
    }

    /* access modifiers changed from: 0000 */
    public final Set<E> createElementSet() {
        final Set keySet = this.countMap.keySet();
        return new C17757bc<E>() {
            /* access modifiers changed from: protected */
            public final Set<E> delegate() {
                return keySet;
            }

            public final boolean containsAll(Collection<?> collection) {
                return standardContainsAll(collection);
            }

            public final boolean removeAll(Collection<?> collection) {
                return standardRemoveAll(collection);
            }

            public final boolean contains(Object obj) {
                if (obj == null || !C18054w.m59710a((Collection<?>) keySet, obj)) {
                    return false;
                }
                return true;
            }

            public final boolean remove(Object obj) {
                if (obj == null || !C18054w.m59712b(keySet, obj)) {
                    return false;
                }
                return true;
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public final Iterator<C17883a<E>> entryIterator() {
        final C175602 r0 = new C17870c<C17883a<E>>() {

            /* renamed from: b */
            private final Iterator<Entry<E, AtomicInteger>> f48644b = ConcurrentHashMultiset.this.countMap.entrySet().iterator();

            /* access modifiers changed from: private */
            /* renamed from: c */
            public C17883a<E> mo45252a() {
                while (this.f48644b.hasNext()) {
                    Entry entry = (Entry) this.f48644b.next();
                    int i = ((AtomicInteger) entry.getValue()).get();
                    if (i != 0) {
                        return C17884cc.m59424a(entry.getKey(), i);
                    }
                }
                mo46191b();
                return null;
            }
        };
        return new C17748au<C17883a<E>>() {

            /* renamed from: c */
            private C17883a<E> f48647c;

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Iterator<C17883a<E>> delegate() {
                return r0;
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public C17883a<E> next() {
                this.f48647c = (C17883a) super.next();
                return this.f48647c;
            }

            public final void remove() {
                boolean z;
                if (this.f48647c != null) {
                    z = true;
                } else {
                    z = false;
                }
                C18053v.m59703a(z);
                ConcurrentHashMultiset.this.setCount(this.f48647c.mo45308b(), 0);
                this.f48647c = null;
            }
        };
    }

    public final Object[] toArray() {
        return snapshot().toArray();
    }

    private List<E> snapshot() {
        ArrayList b = C17795bu.m59150b(size());
        for (C17883a aVar : entrySet()) {
            Object b2 = aVar.mo45308b();
            for (int a = aVar.mo45307a(); a > 0; a--) {
                b.add(b2);
            }
        }
        return b;
    }

    public final int size() {
        long j = 0;
        for (AtomicInteger atomicInteger : this.countMap.values()) {
            j += (long) atomicInteger.get();
        }
        return C18143c.m59970b(j);
    }

    public static <E> ConcurrentHashMultiset<E> create(Iterable<? extends E> iterable) {
        ConcurrentHashMultiset<E> create = create();
        C17777bq.m59095a((Collection<T>) create, iterable);
        return create;
    }

    public final /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    ConcurrentHashMultiset(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        C17439m.m57976a(concurrentMap.isEmpty(), "the backing map (%s) must be empty", (Object) concurrentMap);
        this.countMap = concurrentMap;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        C17563b.f48649a.mo46285a(this, (Object) (ConcurrentMap) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.countMap);
    }

    public static <E> ConcurrentHashMultiset<E> create(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        return new ConcurrentHashMultiset<>(concurrentMap);
    }

    public final int count(Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) C17839bx.m59331a((Map<?, V>) this.countMap, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    public final <T> T[] toArray(T[] tArr) {
        return snapshot().toArray(tArr);
    }

    public final int remove(Object obj, int i) {
        int i2;
        int max;
        if (i == 0) {
            return count(obj);
        }
        C18053v.m59704b(i, "occurences");
        AtomicInteger atomicInteger = (AtomicInteger) C17839bx.m59331a((Map<?, V>) this.countMap, obj);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i2 = atomicInteger.get();
            if (i2 == 0) {
                return 0;
            }
            max = Math.max(0, i2 - i);
        } while (!atomicInteger.compareAndSet(i2, max));
        if (max == 0) {
            this.countMap.remove(obj, atomicInteger);
        }
        return i2;
    }

    public final boolean removeExactly(Object obj, int i) {
        int i2;
        int i3;
        if (i == 0) {
            return true;
        }
        C18053v.m59704b(i, "occurences");
        AtomicInteger atomicInteger = (AtomicInteger) C17839bx.m59331a((Map<?, V>) this.countMap, obj);
        if (atomicInteger == null) {
            return false;
        }
        do {
            i2 = atomicInteger.get();
            if (i2 < i) {
                return false;
            }
            i3 = i2 - i;
        } while (!atomicInteger.compareAndSet(i2, i3));
        if (i3 == 0) {
            this.countMap.remove(obj, atomicInteger);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r2 = new java.util.concurrent.atomic.AtomicInteger(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        if (r4.countMap.putIfAbsent(r5, r2) == null) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int add(E r5, int r6) {
        /*
            r4 = this;
            com.google.common.base.C17439m.m57962a(r5)
            if (r6 != 0) goto L_0x000a
            int r5 = r4.count(r5)
            return r5
        L_0x000a:
            java.lang.String r0 = "occurences"
            com.google.common.collect.C18053v.m59704b(r6, r0)
        L_0x000f:
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.countMap
            java.lang.Object r0 = com.google.common.collect.C17839bx.m59331a(r0, r5)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r1 = 0
            if (r0 != 0) goto L_0x002a
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.countMap
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.lang.Object r0 = r0.putIfAbsent(r5, r2)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 != 0) goto L_0x002a
            return r1
        L_0x002a:
            int r2 = r0.get()
            if (r2 == 0) goto L_0x0057
            int r3 = com.google.common.math.C18119c.m59886a(r2, r6)     // Catch:{ ArithmeticException -> 0x003b }
            boolean r3 = r0.compareAndSet(r2, r3)     // Catch:{ ArithmeticException -> 0x003b }
            if (r3 == 0) goto L_0x002a
            return r2
        L_0x003b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Overflow adding "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = " occurrences to a count of "
            r0.append(r6)
            r0.append(r2)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L_0x0057:
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.countMap
            java.lang.Object r3 = r3.putIfAbsent(r5, r2)
            if (r3 == 0) goto L_0x006c
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.countMap
            boolean r0 = r3.replace(r5, r0, r2)
            if (r0 == 0) goto L_0x000f
        L_0x006c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ConcurrentHashMultiset.add(java.lang.Object, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r6 != 0) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r2 = new java.util.concurrent.atomic.AtomicInteger(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r4.countMap.putIfAbsent(r5, r2) == null) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int setCount(E r5, int r6) {
        /*
            r4 = this;
            com.google.common.base.C17439m.m57962a(r5)
            java.lang.String r0 = "count"
            com.google.common.collect.C18053v.m59700a(r6, r0)
        L_0x0008:
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.countMap
            java.lang.Object r0 = com.google.common.collect.C17839bx.m59331a(r0, r5)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r1 = 0
            if (r0 != 0) goto L_0x0026
            if (r6 != 0) goto L_0x0016
            return r1
        L_0x0016:
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r0 = r4.countMap
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.lang.Object r0 = r0.putIfAbsent(r5, r2)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 != 0) goto L_0x0026
            return r1
        L_0x0026:
            int r2 = r0.get()
            if (r2 != 0) goto L_0x0045
            if (r6 != 0) goto L_0x002f
            return r1
        L_0x002f:
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r6)
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.countMap
            java.lang.Object r3 = r3.putIfAbsent(r5, r2)
            if (r3 == 0) goto L_0x0044
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r3 = r4.countMap
            boolean r0 = r3.replace(r5, r0, r2)
            if (r0 == 0) goto L_0x0008
        L_0x0044:
            return r1
        L_0x0045:
            boolean r3 = r0.compareAndSet(r2, r6)
            if (r3 == 0) goto L_0x0026
            if (r6 != 0) goto L_0x0052
            java.util.concurrent.ConcurrentMap<E, java.util.concurrent.atomic.AtomicInteger> r6 = r4.countMap
            r6.remove(r5, r0)
        L_0x0052:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ConcurrentHashMultiset.setCount(java.lang.Object, int):int");
    }

    public final boolean setCount(E e, int i, int i2) {
        C17439m.m57962a(e);
        C18053v.m59700a(i, "oldCount");
        C18053v.m59700a(i2, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) C17839bx.m59331a((Map<?, V>) this.countMap, (Object) e);
        if (atomicInteger != null) {
            int i3 = atomicInteger.get();
            if (i3 == i) {
                if (i3 == 0) {
                    if (i2 == 0) {
                        this.countMap.remove(e, atomicInteger);
                        return true;
                    }
                    AtomicInteger atomicInteger2 = new AtomicInteger(i2);
                    if (this.countMap.putIfAbsent(e, atomicInteger2) == null || this.countMap.replace(e, atomicInteger, atomicInteger2)) {
                        return true;
                    }
                    return false;
                } else if (atomicInteger.compareAndSet(i3, i2)) {
                    if (i2 == 0) {
                        this.countMap.remove(e, atomicInteger);
                    }
                    return true;
                }
            }
            return false;
        } else if (i != 0) {
            return false;
        } else {
            if (i2 == 0 || this.countMap.putIfAbsent(e, new AtomicInteger(i2)) == null) {
                return true;
            }
            return false;
        }
    }
}
