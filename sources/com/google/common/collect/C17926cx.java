package com.google.common.collect;

import com.google.common.base.C17439m;
import java.io.Serializable;

/* renamed from: com.google.common.collect.cx */
final class C17926cx<T> extends C17896ch<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C17896ch<? super T> f49229a;

    /* renamed from: a */
    public final <S extends T> C17896ch<S> mo46226a() {
        return this.f49229a;
    }

    public final int hashCode() {
        return -this.f49229a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f49229a);
        sb.append(".reverse()");
        return sb.toString();
    }

    C17926cx(C17896ch<? super T> chVar) {
        this.f49229a = (C17896ch) C17439m.m57962a(chVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17926cx)) {
            return false;
        }
        return this.f49229a.equals(((C17926cx) obj).f49229a);
    }

    /* renamed from: a */
    public final <E extends T> E mo46247a(E e, E e2) {
        return this.f49229a.mo46250b(e, e2);
    }

    /* renamed from: b */
    public final <E extends T> E mo46250b(E e, E e2) {
        return this.f49229a.mo46247a(e, e2);
    }

    public final int compare(T t, T t2) {
        return this.f49229a.compare(t2, t);
    }
}
