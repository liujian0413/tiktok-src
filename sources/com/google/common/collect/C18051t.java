package com.google.common.collect;

import com.google.common.base.C17427g;
import com.google.common.base.C17434j;
import com.google.common.base.C17439m;
import java.io.Serializable;

/* renamed from: com.google.common.collect.t */
final class C18051t<F, T> extends C17896ch<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C17427g<F, ? extends T> f49353a;

    /* renamed from: b */
    final C17896ch<T> f49354b;

    public final int hashCode() {
        return C17434j.m57954a(this.f49353a, this.f49354b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f49354b);
        sb.append(".onResultOf(");
        sb.append(this.f49353a);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18051t)) {
            return false;
        }
        C18051t tVar = (C18051t) obj;
        if (!this.f49353a.equals(tVar.f49353a) || !this.f49354b.equals(tVar.f49354b)) {
            return false;
        }
        return true;
    }

    C18051t(C17427g<F, ? extends T> gVar, C17896ch<T> chVar) {
        this.f49353a = (C17427g) C17439m.m57962a(gVar);
        this.f49354b = (C17896ch) C17439m.m57962a(chVar);
    }

    public final int compare(F f, F f2) {
        return this.f49354b.compare(this.f49353a.mo44914b(f), this.f49353a.mo44914b(f2));
    }
}
