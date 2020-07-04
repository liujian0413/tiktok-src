package com.bytedance.android.live.core.paging;

import android.arch.lifecycle.LiveData;
import android.arch.paging.C0100h;
import com.bytedance.android.live.core.p145a.C3145b;
import com.bytedance.android.live.core.paging.p151a.C3182d;

/* renamed from: com.bytedance.android.live.core.paging.c */
public final class C3213c<CacheKey, T> extends C3178a<T> {

    /* renamed from: a */
    private C3145b<CacheKey, T> f9866a;

    /* renamed from: b */
    private CacheKey f9867b;

    /* renamed from: a */
    public final void mo10031a(T t) {
        this.f9866a.mo9988a(this.f9867b, t);
        mo10039h();
    }

    /* renamed from: b */
    public final int mo10032b(T t) {
        return this.f9866a.mo9989b(this.f9867b, t);
    }

    public C3213c(C3182d<CacheKey, T> dVar, LiveData<C0100h<T>> liveData) {
        super(dVar, liveData);
        this.f9867b = dVar.f9779a;
        this.f9866a = dVar.f9780b;
    }
}
