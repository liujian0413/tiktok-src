package com.bytedance.jedi.model.p602d;

import p346io.reactivex.C7492s;

/* renamed from: com.bytedance.jedi.model.d.a */
public abstract class C11789a<K, V, REQ, RESP> implements C11790b<K, V, REQ, RESP> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C7492s<RESP> mo29350a(REQ req);

    /* renamed from: a */
    public abstract V mo29351a(REQ req, RESP resp);

    /* renamed from: b */
    public abstract K mo29352b(REQ req);

    /* renamed from: c */
    public final C7492s<RESP> mo29357c(REQ req) {
        return C11798d.m34549a(this, req, mo29350a(req));
    }
}
