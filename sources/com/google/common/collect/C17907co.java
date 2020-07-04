package com.google.common.collect;

import java.util.Map.Entry;

/* renamed from: com.google.common.collect.co */
final class C17907co<K, V> extends ImmutableBiMap<K, V> {

    /* renamed from: a */
    static final C17907co<Object, Object> f49180a = new C17907co<>();

    /* renamed from: b */
    final transient Object[] f49181b;

    /* renamed from: c */
    private final transient int[] f49182c;

    /* renamed from: d */
    private final transient int f49183d;

    /* renamed from: e */
    private final transient int f49184e;

    /* renamed from: f */
    private final transient C17907co<V, K> f49185f;

    public final ImmutableBiMap<V, K> inverse() {
        return this.f49185f;
    }

    /* access modifiers changed from: 0000 */
    public final boolean isPartialView() {
        return false;
    }

    public final int size() {
        return this.f49184e;
    }

    private C17907co() {
        this.f49181b = new Object[0];
        this.f49185f = this;
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSet<Entry<K, V>> createEntrySet() {
        return new C17910a(this, this.f49181b, this.f49183d, this.f49184e);
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSet<K> createKeySet() {
        return new C17912b(this, new C17913c(this.f49181b, this.f49183d, this.f49184e));
    }

    public final V get(Object obj) {
        return C17909cq.m59524a(this.f49182c, this.f49181b, this.f49184e, this.f49183d, obj);
    }

    C17907co(Object[] objArr, int i) {
        int i2;
        this.f49181b = objArr;
        this.f49184e = i;
        if (i >= 2) {
            i2 = ImmutableSet.chooseTableSize(i);
        } else {
            i2 = 0;
        }
        this.f49182c = C17909cq.m59525a(objArr, i, i2, 0);
        this.f49185f = new C17907co<>(C17909cq.m59525a(objArr, i, i2, 1), objArr, i, this);
    }

    private C17907co(int[] iArr, Object[] objArr, int i, C17907co<V, K> coVar) {
        this.f49182c = iArr;
        this.f49181b = objArr;
        this.f49183d = 1;
        this.f49184e = i;
        this.f49185f = coVar;
    }
}
