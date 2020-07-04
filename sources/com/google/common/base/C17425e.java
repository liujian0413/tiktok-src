package com.google.common.base;

/* renamed from: com.google.common.base.e */
public abstract class C17425e<A, B> implements C17427g<A, B> {

    /* renamed from: a */
    private final boolean f48387a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract B mo44877a(A a);

    protected C17425e() {
        this(true);
    }

    /* renamed from: c */
    private B m57928c(A a) {
        return m57929d(a);
    }

    /* renamed from: b */
    public final B mo44914b(A a) {
        return m57928c(a);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private C17425e(boolean z) {
        this.f48387a = true;
    }

    /* renamed from: d */
    private B m57929d(A a) {
        if (!this.f48387a) {
            return mo44877a(a);
        }
        if (a == null) {
            return null;
        }
        return C17439m.m57962a(mo44877a(a));
    }
}
