package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.google.common.collect.aa */
final class C17696aa<E> extends C18066y<E> {

    /* renamed from: e */
    private transient int[] f48920e;

    /* renamed from: f */
    private transient int[] f48921f;

    /* renamed from: g */
    private transient int f48922g;

    /* renamed from: h */
    private transient int f48923h;

    C17696aa() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo45804b() {
        return this.f48922g;
    }

    public final Object[] toArray() {
        return C17892ce.m59445a((Collection<?>) this);
    }

    public final void clear() {
        super.clear();
        this.f48922g = -2;
        this.f48923h = -2;
        Arrays.fill(this.f48920e, -1);
        Arrays.fill(this.f48921f, -1);
    }

    private C17696aa(int i) {
        super(i);
    }

    /* renamed from: e */
    public static <E> C17696aa<E> m58879e(int i) {
        return new C17696aa<>(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int mo45808d(int i) {
        return this.f48921f[i];
    }

    public final <T> T[] toArray(T[] tArr) {
        return C17892ce.m59446a((Collection<?>) this, tArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo45805b(int i) {
        super.mo45805b(i);
        int length = this.f48920e.length;
        this.f48920e = Arrays.copyOf(this.f48920e, i);
        this.f48921f = Arrays.copyOf(this.f48921f, i);
        if (length < i) {
            Arrays.fill(this.f48920e, length, i, -1);
            Arrays.fill(this.f48921f, length, i, -1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo45806c(int i) {
        int size = size() - 1;
        super.mo45806c(i);
        m58878b(this.f48920e[i], this.f48921f[i]);
        if (size != i) {
            m58878b(this.f48920e[size], i);
            m58878b(i, this.f48921f[size]);
        }
        this.f48920e[size] = -1;
        this.f48921f[size] = -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo45801a(int i, int i2) {
        if (i == size()) {
            return i2;
        }
        return i;
    }

    /* renamed from: b */
    private void m58878b(int i, int i2) {
        if (i == -2) {
            this.f48922g = i2;
        } else {
            this.f48921f[i] = i2;
        }
        if (i2 == -2) {
            this.f48923h = i;
        } else {
            this.f48920e[i2] = i;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo45802a(int i, float f) {
        super.mo45802a(i, f);
        this.f48920e = new int[i];
        this.f48921f = new int[i];
        Arrays.fill(this.f48920e, -1);
        Arrays.fill(this.f48921f, -1);
        this.f48922g = -2;
        this.f48923h = -2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo45803a(int i, E e, int i2) {
        super.mo45803a(i, e, i2);
        m58878b(this.f48923h, i);
        m58878b(i, -2);
    }
}
