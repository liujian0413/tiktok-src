package com.google.common.collect;

import com.google.common.base.C17439m;

/* renamed from: com.google.common.collect.cp */
final class C17908cp<E> extends ImmutableList<E> {

    /* renamed from: a */
    static final ImmutableList<Object> f49186a = new C17908cp(new Object[0], 0);

    /* renamed from: b */
    final transient Object[] f49187b;

    /* renamed from: c */
    private final transient int f49188c;

    /* access modifiers changed from: 0000 */
    public final boolean isPartialView() {
        return false;
    }

    public final int size() {
        return this.f49188c;
    }

    public final E get(int i) {
        C17439m.m57960a(i, this.f49188c);
        return this.f49187b[i];
    }

    C17908cp(Object[] objArr, int i) {
        this.f49187b = objArr;
        this.f49188c = i;
    }

    /* access modifiers changed from: 0000 */
    public final int copyIntoArray(Object[] objArr, int i) {
        System.arraycopy(this.f49187b, 0, objArr, i, this.f49188c);
        return i + this.f49188c;
    }
}
