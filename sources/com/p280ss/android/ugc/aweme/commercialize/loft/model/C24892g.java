package com.p280ss.android.ugc.aweme.commercialize.loft.model;

import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.g */
public class C24892g<T, A> {

    /* renamed from: a */
    private C7562b<? super A, ? extends T> f65639a;

    /* renamed from: b */
    private volatile T f65640b;

    public C24892g(C7562b<? super A, ? extends T> bVar) {
        C7573i.m23587b(bVar, "creator");
        this.f65639a = bVar;
    }

    /* renamed from: a */
    public final T mo65136a(A a) {
        T t;
        T t2 = this.f65640b;
        if (t2 != null) {
            return t2;
        }
        synchronized (this) {
            t = this.f65640b;
            if (t == null) {
                C7562b<? super A, ? extends T> bVar = this.f65639a;
                if (bVar == null) {
                    C7573i.m23580a();
                }
                t = bVar.invoke(a);
                this.f65640b = t;
                this.f65639a = null;
            }
        }
        return t;
    }
}
