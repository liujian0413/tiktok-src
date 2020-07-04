package com.bytedance.android.live.core.paging.p151a;

import android.arch.lifecycle.C0052o;
import android.arch.paging.C0100h.C0103a;

/* renamed from: com.bytedance.android.live.core.paging.a.b */
public final class C3180b<V> extends C0103a<V> {

    /* renamed from: a */
    private C0052o<Boolean> f9775a = new C0052o<>();

    /* renamed from: b */
    private C0052o<Boolean> f9776b = new C0052o<>();

    /* renamed from: a */
    public final void mo220a() {
        super.mo220a();
        this.f9776b.postValue(Boolean.valueOf(true));
    }

    /* renamed from: a */
    public final void mo221a(V v) {
        super.mo221a(v);
        this.f9775a.postValue(Boolean.valueOf(false));
    }

    public C3180b(C0052o<Boolean> oVar, C0052o<Boolean> oVar2) {
        this.f9775a = oVar;
        this.f9776b = oVar2;
    }
}
