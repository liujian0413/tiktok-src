package com.google.common.collect;

import com.google.common.base.C17439m;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;

/* renamed from: com.google.common.collect.cq */
final class C17909cq<K, V> extends ImmutableMap<K, V> {

    /* renamed from: a */
    static final ImmutableMap<Object, Object> f49189a = new C17909cq(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    final transient Object[] f49190b;

    /* renamed from: c */
    private final transient int[] f49191c;

    /* renamed from: d */
    private final transient int f49192d;

    /* renamed from: com.google.common.collect.cq$a */
    static class C17910a<K, V> extends ImmutableSet<Entry<K, V>> {

        /* renamed from: a */
        public final transient Object[] f49193a;

        /* renamed from: b */
        public final transient int f49194b;

        /* renamed from: c */
        public final transient int f49195c;

        /* renamed from: d */
        private final transient ImmutableMap<K, V> f49196d;

        /* access modifiers changed from: 0000 */
        public final boolean isPartialView() {
            return true;
        }

        public final int size() {
            return this.f49195c;
        }

        /* access modifiers changed from: 0000 */
        public final ImmutableList<Entry<K, V>> createAsList() {
            return new ImmutableList<Entry<K, V>>() {
                public final boolean isPartialView() {
                    return true;
                }

                public final int size() {
                    return C17910a.this.f49195c;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Entry<K, V> get(int i) {
                    C17439m.m57960a(i, C17910a.this.f49195c);
                    int i2 = i * 2;
                    return new SimpleImmutableEntry(C17910a.this.f49193a[C17910a.this.f49194b + i2], C17910a.this.f49193a[i2 + (C17910a.this.f49194b ^ 1)]);
                }
            };
        }

        public final C17995dt<Entry<K, V>> iterator() {
            return asList().iterator();
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f49196d.get(key))) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        public final int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        C17910a(ImmutableMap<K, V> immutableMap, Object[] objArr, int i, int i2) {
            this.f49196d = immutableMap;
            this.f49193a = objArr;
            this.f49194b = i;
            this.f49195c = i2;
        }
    }

    /* renamed from: com.google.common.collect.cq$b */
    static final class C17912b<K> extends ImmutableSet<K> {

        /* renamed from: a */
        private final transient ImmutableMap<K, ?> f49198a;

        /* renamed from: b */
        private final transient ImmutableList<K> f49199b;

        public final ImmutableList<K> asList() {
            return this.f49199b;
        }

        /* access modifiers changed from: 0000 */
        public final boolean isPartialView() {
            return true;
        }

        public final int size() {
            return this.f49198a.size();
        }

        public final C17995dt<K> iterator() {
            return asList().iterator();
        }

        public final boolean contains(Object obj) {
            if (this.f49198a.get(obj) != null) {
                return true;
            }
            return false;
        }

        C17912b(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.f49198a = immutableMap;
            this.f49199b = immutableList;
        }

        /* access modifiers changed from: 0000 */
        public final int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }
    }

    /* renamed from: com.google.common.collect.cq$c */
    static final class C17913c extends ImmutableList<Object> {

        /* renamed from: a */
        private final transient Object[] f49200a;

        /* renamed from: b */
        private final transient int f49201b;

        /* renamed from: c */
        private final transient int f49202c;

        /* access modifiers changed from: 0000 */
        public final boolean isPartialView() {
            return true;
        }

        public final int size() {
            return this.f49202c;
        }

        public final Object get(int i) {
            C17439m.m57960a(i, this.f49202c);
            return this.f49200a[(i * 2) + this.f49201b];
        }

        C17913c(Object[] objArr, int i, int i2) {
            this.f49200a = objArr;
            this.f49201b = i;
            this.f49202c = i2;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean isPartialView() {
        return false;
    }

    public final int size() {
        return this.f49192d;
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSet<Entry<K, V>> createEntrySet() {
        return new C17910a(this, this.f49190b, 0, this.f49192d);
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSet<K> createKeySet() {
        return new C17912b(this, new C17913c(this.f49190b, 0, this.f49192d));
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableCollection<V> createValues() {
        return new C17913c(this.f49190b, 1, this.f49192d);
    }

    public final V get(Object obj) {
        return m59524a(this.f49191c, this.f49190b, this.f49192d, 0, obj);
    }

    /* renamed from: a */
    static <K, V> C17909cq<K, V> m59523a(int i, Object[] objArr) {
        if (i == 0) {
            return (C17909cq) f49189a;
        }
        if (i == 1) {
            C18053v.m59702a(objArr[0], objArr[1]);
            return new C17909cq<>(null, objArr, 1);
        }
        C17439m.m57978b(i, objArr.length >> 1);
        return new C17909cq<>(m59525a(objArr, i, ImmutableSet.chooseTableSize(i), 0), objArr, i);
    }

    private C17909cq(int[] iArr, Object[] objArr, int i) {
        this.f49191c = iArr;
        this.f49190b = objArr;
        this.f49192d = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        r12[r7] = r5;
        r3 = r3 + 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int[] m59525a(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            r0 = 1
            if (r11 != r0) goto L_0x000e
            r11 = r10[r13]
            r12 = r13 ^ 1
            r10 = r10[r12]
            com.google.common.collect.C18053v.m59702a(r11, r10)
            r10 = 0
            return r10
        L_0x000e:
            int r1 = r12 + -1
            int[] r12 = new int[r12]
            r2 = -1
            java.util.Arrays.fill(r12, r2)
            r3 = 0
        L_0x0017:
            if (r3 >= r11) goto L_0x0076
            int r4 = r3 * 2
            int r5 = r4 + r13
            r6 = r10[r5]
            r7 = r13 ^ 1
            int r4 = r4 + r7
            r4 = r10[r4]
            com.google.common.collect.C18053v.m59702a(r6, r4)
            int r7 = r6.hashCode()
            int r7 = com.google.common.collect.C17761bg.m59063a(r7)
        L_0x002f:
            r7 = r7 & r1
            r8 = r12[r7]
            if (r8 != r2) goto L_0x0039
            r12[r7] = r5
            int r3 = r3 + 1
            goto L_0x0017
        L_0x0039:
            r9 = r10[r8]
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L_0x0044
            int r7 = r7 + 1
            goto L_0x002f
        L_0x0044:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Multiple entries with same key: "
            r12.<init>(r13)
            r12.append(r6)
            java.lang.String r13 = "="
            r12.append(r13)
            r12.append(r4)
            java.lang.String r13 = " and "
            r12.append(r13)
            r13 = r10[r8]
            r12.append(r13)
            java.lang.String r13 = "="
            r12.append(r13)
            r13 = r8 ^ 1
            r10 = r10[r13]
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x0076:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C17909cq.m59525a(java.lang.Object[], int, int, int):int[]");
    }

    /* renamed from: a */
    static Object m59524a(int[] iArr, Object[] objArr, int i, int i2, Object obj) {
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[i2].equals(obj)) {
                return objArr[i2 ^ 1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int a = C17761bg.m59063a(obj.hashCode());
            while (true) {
                int i3 = a & length;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    return null;
                }
                if (objArr[i4].equals(obj)) {
                    return objArr[i4 ^ 1];
                }
                a = i3 + 1;
            }
        }
    }
}
