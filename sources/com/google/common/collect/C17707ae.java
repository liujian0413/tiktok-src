package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.collect.C17986do.C17987a;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.common.collect.ae */
final class C17707ae<R, C, V> extends C17921cv<R, C, V> {

    /* renamed from: a */
    public final ImmutableMap<R, Integer> f48933a;

    /* renamed from: b */
    public final ImmutableMap<C, Integer> f48934b;

    /* renamed from: c */
    public final int[] f48935c = new int[this.f48933a.size()];

    /* renamed from: d */
    public final int[] f48936d = new int[this.f48934b.size()];

    /* renamed from: e */
    public final V[][] f48937e;

    /* renamed from: f */
    private final ImmutableMap<R, ImmutableMap<C, V>> f48938f;

    /* renamed from: g */
    private final ImmutableMap<C, ImmutableMap<R, V>> f48939g;

    /* renamed from: h */
    private final int[] f48940h;

    /* renamed from: i */
    private final int[] f48941i;

    /* renamed from: com.google.common.collect.ae$a */
    final class C17709a extends C17711c<R, V> {

        /* renamed from: b */
        private final int f48943b;

        /* access modifiers changed from: 0000 */
        public final boolean isPartialView() {
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final ImmutableMap<R, Integer> mo45837a() {
            return C17707ae.this.f48933a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo45838a(int i) {
            return C17707ae.this.f48937e[i][this.f48943b];
        }

        C17709a(int i) {
            super(C17707ae.this.f48936d[i]);
            this.f48943b = i;
        }
    }

    /* renamed from: com.google.common.collect.ae$b */
    final class C17710b extends C17711c<C, ImmutableMap<R, V>> {
        /* access modifiers changed from: 0000 */
        public final boolean isPartialView() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final ImmutableMap<C, Integer> mo45837a() {
            return C17707ae.this.f48934b;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public ImmutableMap<R, V> mo45838a(int i) {
            return new C17709a(i);
        }

        private C17710b() {
            super(C17707ae.this.f48936d.length);
        }
    }

    /* renamed from: com.google.common.collect.ae$c */
    static abstract class C17711c<K, V> extends C17592b<K, V> {

        /* renamed from: a */
        private final int f48945a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract ImmutableMap<K, Integer> mo45837a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract V mo45838a(int i);

        public int size() {
            return this.f48945a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C17995dt<Entry<K, V>> mo45457b() {
            return new C17870c<Entry<K, V>>() {

                /* renamed from: b */
                private int f48947b = -1;

                /* renamed from: c */
                private final int f48948c = C17711c.this.mo45837a().size();

                /* access modifiers changed from: private */
                /* renamed from: c */
                public Entry<K, V> mo45252a() {
                    int i = this.f48947b;
                    while (true) {
                        this.f48947b = i + 1;
                        if (this.f48947b < this.f48948c) {
                            Object a = C17711c.this.mo45838a(this.f48947b);
                            if (a != null) {
                                return C17839bx.m59337a(C17711c.this.mo45839b(this.f48947b), a);
                            }
                            i = this.f48947b;
                        } else {
                            mo46191b();
                            return null;
                        }
                    }
                }
            };
        }

        /* renamed from: c */
        private boolean m58960c() {
            if (this.f48945a == mo45837a().size()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public ImmutableSet<K> createKeySet() {
            if (m58960c()) {
                return mo45837a().keySet();
            }
            return super.createKeySet();
        }

        C17711c(int i) {
            this.f48945a = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final K mo45839b(int i) {
            return mo45837a().keySet().asList().get(i);
        }

        public V get(Object obj) {
            Integer num = (Integer) mo45837a().get(obj);
            if (num == null) {
                return null;
            }
            return mo45838a(num.intValue());
        }
    }

    /* renamed from: com.google.common.collect.ae$d */
    final class C17713d extends C17711c<C, V> {

        /* renamed from: b */
        private final int f48950b;

        /* access modifiers changed from: 0000 */
        public final boolean isPartialView() {
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final ImmutableMap<C, Integer> mo45837a() {
            return C17707ae.this.f48934b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo45838a(int i) {
            return C17707ae.this.f48937e[this.f48950b][i];
        }

        C17713d(int i) {
            super(C17707ae.this.f48935c[i]);
            this.f48950b = i;
        }
    }

    /* renamed from: com.google.common.collect.ae$e */
    final class C17714e extends C17711c<R, ImmutableMap<C, V>> {
        /* access modifiers changed from: 0000 */
        public final boolean isPartialView() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final ImmutableMap<R, Integer> mo45837a() {
            return C17707ae.this.f48933a;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public ImmutableMap<C, V> mo45838a(int i) {
            return new C17713d(i);
        }

        private C17714e() {
            super(C17707ae.this.f48935c.length);
        }
    }

    public final int size() {
        return this.f48940h.length;
    }

    public final ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf((Map<? extends K, ? extends V>) this.f48939g);
    }

    public final ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.copyOf((Map<? extends K, ? extends V>) this.f48938f);
    }

    /* access modifiers changed from: 0000 */
    public final C17639b createSerializedForm() {
        return C17639b.m58757a(this, this.f48940h, this.f48941i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final V mo45836b(int i) {
        return this.f48937e[this.f48940h[i]][this.f48941i[i]];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C17987a<R, C, V> mo45835a(int i) {
        int i2 = this.f48940h[i];
        int i3 = this.f48941i[i];
        return cellOf(rowKeySet().asList().get(i2), columnKeySet().asList().get(i3), this.f48937e[i2][i3]);
    }

    public final V get(Object obj, Object obj2) {
        Integer num = (Integer) this.f48933a.get(obj);
        Integer num2 = (Integer) this.f48934b.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.f48937e[num.intValue()][num2.intValue()];
    }

    C17707ae(ImmutableList<C17987a<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        boolean z;
        this.f48937e = (Object[][]) Array.newInstance(Object.class, new int[]{immutableSet.size(), immutableSet2.size()});
        this.f48933a = C17839bx.m59328a((Collection<E>) immutableSet);
        this.f48934b = C17839bx.m59328a((Collection<E>) immutableSet2);
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            C17987a aVar = (C17987a) immutableList.get(i);
            Object a = aVar.mo45207a();
            Object b = aVar.mo45208b();
            int intValue = ((Integer) this.f48933a.get(a)).intValue();
            int intValue2 = ((Integer) this.f48934b.get(b)).intValue();
            if (this.f48937e[intValue][intValue2] == null) {
                z = true;
            } else {
                z = false;
            }
            C17439m.m57977a(z, "duplicate key: (%s, %s)", a, b);
            this.f48937e[intValue][intValue2] = aVar.mo45209c();
            int[] iArr3 = this.f48935c;
            iArr3[intValue] = iArr3[intValue] + 1;
            int[] iArr4 = this.f48936d;
            iArr4[intValue2] = iArr4[intValue2] + 1;
            iArr[i] = intValue;
            iArr2[i] = intValue2;
        }
        this.f48940h = iArr;
        this.f48941i = iArr2;
        this.f48938f = new C17714e();
        this.f48939g = new C17710b();
    }
}
