package com.google.common.collect;

import com.google.common.base.C17439m;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    private transient ImmutableList<E> asList;

    /* renamed from: com.google.common.collect.ImmutableSet$a */
    public static class C17622a<E> extends C17582a<E> {

        /* renamed from: d */
        Object[] f48754d;

        /* renamed from: e */
        private int f48755e;

        public C17622a() {
            super(4);
        }

        /* JADX WARNING: type inference failed for: r0v6, types: [com.google.common.collect.ImmutableSet<E>] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.common.collect.ImmutableSet<E> mo45556a() {
            /*
                r8 = this;
                int r0 = r8.f48677b
                switch(r0) {
                    case 0: goto L_0x0034;
                    case 1: goto L_0x002a;
                    default: goto L_0x0005;
                }
            L_0x0005:
                java.lang.Object[] r0 = r8.f48754d
                r1 = 1
                if (r0 == 0) goto L_0x004e
                int r0 = r8.f48677b
                int r0 = com.google.common.collect.ImmutableSet.chooseTableSize(r0)
                java.lang.Object[] r2 = r8.f48754d
                int r2 = r2.length
                if (r0 != r2) goto L_0x004e
                int r0 = r8.f48677b
                java.lang.Object[] r2 = r8.f48676a
                int r2 = r2.length
                boolean r0 = com.google.common.collect.ImmutableSet.shouldTrim(r0, r2)
                if (r0 == 0) goto L_0x0039
                java.lang.Object[] r0 = r8.f48676a
                int r2 = r8.f48677b
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            L_0x0028:
                r3 = r0
                goto L_0x003c
            L_0x002a:
                java.lang.Object[] r0 = r8.f48676a
                r1 = 0
                r0 = r0[r1]
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.m58650of(r0)
                return r0
            L_0x0034:
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.m58649of()
                return r0
            L_0x0039:
                java.lang.Object[] r0 = r8.f48676a
                goto L_0x0028
            L_0x003c:
                com.google.common.collect.cs r0 = new com.google.common.collect.cs
                int r4 = r8.f48755e
                java.lang.Object[] r5 = r8.f48754d
                java.lang.Object[] r2 = r8.f48754d
                int r2 = r2.length
                int r6 = r2 + -1
                int r7 = r8.f48677b
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x005c
            L_0x004e:
                int r0 = r8.f48677b
                java.lang.Object[] r2 = r8.f48676a
                com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.construct(r0, r2)
                int r2 = r0.size()
                r8.f48677b = r2
            L_0x005c:
                r8.f48678c = r1
                r1 = 0
                r8.f48754d = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSet.C17622a.mo45556a():com.google.common.collect.ImmutableSet");
        }

        C17622a(int i) {
            super(i);
            this.f48754d = new Object[ImmutableSet.chooseTableSize(i)];
        }

        /* renamed from: b */
        public C17622a<E> mo45401a(Iterable<? extends E> iterable) {
            C17439m.m57962a(iterable);
            if (this.f48754d != null) {
                for (Object c : iterable) {
                    mo45403b(c);
                }
            } else {
                super.mo45401a(iterable);
            }
            return this;
        }

        /* renamed from: c */
        public C17622a<E> mo45403b(E e) {
            C17439m.m57962a(e);
            if (this.f48754d == null || ImmutableSet.chooseTableSize(this.f48677b) > this.f48754d.length) {
                this.f48754d = null;
                super.mo45403b(e);
                return this;
            }
            m58656d(e);
            return this;
        }

        /* renamed from: d */
        private void m58656d(E e) {
            int length = this.f48754d.length - 1;
            int hashCode = e.hashCode();
            int a = C17761bg.m59063a(hashCode);
            while (true) {
                int i = a & length;
                Object obj = this.f48754d[i];
                if (obj == null) {
                    this.f48754d[i] = e;
                    this.f48755e += hashCode;
                    super.mo45403b(e);
                    return;
                } else if (!obj.equals(e)) {
                    a = i + 1;
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public C17622a<E> mo45404a(Iterator<? extends E> it) {
            C17439m.m57962a(it);
            while (it.hasNext()) {
                mo45403b(it.next());
            }
            return this;
        }

        /* renamed from: b */
        public C17622a<E> mo45402a(E... eArr) {
            if (this.f48754d != null) {
                for (E c : eArr) {
                    mo45403b(c);
                }
            } else {
                super.mo45402a(eArr);
            }
            return this;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSet$b */
    static abstract class C17623b<E> extends ImmutableSet<E> {
        C17623b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract E mo45491a(int i);

        /* access modifiers changed from: 0000 */
        public ImmutableList<E> createAsList() {
            return new ImmutableList<E>() {
                /* access modifiers changed from: 0000 */
                public final boolean isPartialView() {
                    return C17623b.this.isPartialView();
                }

                public final int size() {
                    return C17623b.this.size();
                }

                public final E get(int i) {
                    return C17623b.this.mo45491a(i);
                }
            };
        }

        public C17995dt<E> iterator() {
            return asList().iterator();
        }

        /* access modifiers changed from: 0000 */
        public int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSet$c */
    static class C17625c implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Object[] f48757a;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return ImmutableSet.copyOf((E[]) this.f48757a);
        }

        C17625c(Object[] objArr) {
            this.f48757a = objArr;
        }
    }

    ImmutableSet() {
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m58649of() {
        return C17918cs.f49210a;
    }

    public static boolean shouldTrim(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* access modifiers changed from: 0000 */
    public boolean isHashCodeFast() {
        return false;
    }

    public abstract C17995dt<E> iterator();

    public static <E> C17622a<E> builder() {
        return new C17622a<>();
    }

    public int hashCode() {
        return C17933db.m59564a((Set<?>) this);
    }

    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> createAsList = createAsList();
        this.asList = createAsList;
        return createAsList;
    }

    /* access modifiers changed from: 0000 */
    public ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(toArray());
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C17625c(toArray());
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m58650of(E e) {
        return new C17938dc(e);
    }

    public static <E> C17622a<E> builderWithExpectedSize(int i) {
        C18053v.m59700a(i, "expectedSize");
        return new C17622a<>(i);
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    static int chooseTableSize(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (true) {
                double d = (double) highestOneBit;
                Double.isNaN(d);
                if (d * 0.7d >= ((double) max)) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            if (max >= 1073741824) {
                z = false;
            }
            C17439m.m57969a(z, (Object) "collection too large");
            return 1073741824;
        }
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return construct(array.length, array);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableSet) || !isHashCodeFast() || !((ImmutableSet) obj).isHashCodeFast() || hashCode() == obj.hashCode()) {
            return C17933db.m59571a((Set<?>) this, obj);
        }
        return false;
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m58649of();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m58650of(next);
        }
        return new C17622a().mo45403b(next).mo45404a(it).mo45556a();
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
        switch (eArr.length) {
            case 0:
                return m58649of();
            case 1:
                return m58650of(eArr[0]);
            default:
                return construct(eArr.length, (Object[]) eArr.clone());
        }
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m58651of(E e, E e2) {
        return construct(2, e, e2);
    }

    public static <E> ImmutableSet<E> construct(int i, Object... objArr) {
        while (true) {
            switch (i) {
                case 0:
                    return m58649of();
                case 1:
                    return m58650of(objArr[0]);
                default:
                    int chooseTableSize = chooseTableSize(i);
                    Object[] objArr2 = new Object[chooseTableSize];
                    int i2 = chooseTableSize - 1;
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i; i5++) {
                        Object a = C17892ce.m59443a(objArr[i5], i5);
                        int hashCode = a.hashCode();
                        int a2 = C17761bg.m59063a(hashCode);
                        while (true) {
                            int i6 = a2 & i2;
                            Object obj = objArr2[i6];
                            if (obj == null) {
                                int i7 = i4 + 1;
                                objArr[i4] = a;
                                objArr2[i6] = a;
                                i3 += hashCode;
                                i4 = i7;
                            } else if (!obj.equals(a)) {
                                a2++;
                            }
                        }
                    }
                    Arrays.fill(objArr, i4, i, null);
                    if (i4 == 1) {
                        return new C17938dc(objArr[0], i3);
                    }
                    if (chooseTableSize(i4) < chooseTableSize / 2) {
                        i = i4;
                    } else {
                        if (shouldTrim(i4, objArr.length)) {
                            objArr = Arrays.copyOf(objArr, i4);
                        }
                        C17918cs csVar = new C17918cs(objArr, i3, objArr2, i2, i4);
                        return csVar;
                    }
            }
        }
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m58652of(E e, E e2, E e3) {
        return construct(3, e, e2, e3);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m58653of(E e, E e2, E e3, E e4) {
        return construct(4, e, e2, e3, e4);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m58654of(E e, E e2, E e3, E e4, E e5) {
        return construct(5, e, e2, e3, e4, e5);
    }

    @SafeVarargs
    /* renamed from: of */
    public static <E> ImmutableSet<E> m58655of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        boolean z;
        if (eArr.length <= 2147483641) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57969a(z, (Object) "the total number of elements must fit in an int");
        Object[] objArr = new Object[(eArr.length + 6)];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return construct(objArr.length, objArr);
    }
}
