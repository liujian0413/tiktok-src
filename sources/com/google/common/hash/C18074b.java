package com.google.common.hash;

/* renamed from: com.google.common.hash.b */
abstract class C18074b implements C18083g {
    C18074b() {
    }

    /* renamed from: a */
    public final <T> C18083g mo46676a(T t, Funnel<? super T> funnel) {
        funnel.funnel(t, this);
        return this;
    }
}
