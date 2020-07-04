package com.bytedance.android.live.core.rxutils.rxlifecycle.p156a;

import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7497x;

/* renamed from: com.bytedance.android.live.core.rxutils.rxlifecycle.a.c */
public final class C3320c<T, R> implements C7497x<T, T> {

    /* renamed from: a */
    private final C7492s<R> f10053a;

    /* renamed from: b */
    private final R f10054b;

    public final int hashCode() {
        return (this.f10053a.hashCode() * 31) + this.f10054b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UntilEventObservableTransformer{lifecycle=");
        sb.append(this.f10053a);
        sb.append(", event=");
        sb.append(this.f10054b);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final C7496w<T> mo10161a(C7492s<T> sVar) {
        return sVar.mo19323e((C7496w<U>) C3318a.m12396a(this.f10053a, this.f10054b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3320c cVar = (C3320c) obj;
        if (!this.f10053a.equals(cVar.f10053a)) {
            return false;
        }
        return this.f10054b.equals(cVar.f10054b);
    }

    public C3320c(C7492s<R> sVar, R r) {
        this.f10053a = sVar;
        this.f10054b = r;
    }
}
