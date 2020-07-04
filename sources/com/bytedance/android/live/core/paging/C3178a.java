package com.bytedance.android.live.core.paging;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.LiveData;
import android.arch.paging.C0100h;
import com.bytedance.android.live.core.network.NetworkStat;
import com.bytedance.android.live.core.paging.p151a.C3179a;
import com.bytedance.android.live.core.rxutils.C3303k;
import p346io.reactivex.p354j.C7486b;

/* renamed from: com.bytedance.android.live.core.paging.a */
public class C3178a<T> implements C3197b<T> {

    /* renamed from: a */
    private LiveData<C0100h<T>> f9766a;

    /* renamed from: b */
    private C0052o<NetworkStat> f9767b;

    /* renamed from: c */
    private C0052o<NetworkStat> f9768c;

    /* renamed from: d */
    private C0052o<Boolean> f9769d;

    /* renamed from: e */
    private C7486b<Object> f9770e;

    /* renamed from: f */
    private C7486b<Object> f9771f;

    /* renamed from: g */
    private C7486b<Object> f9772g;

    /* renamed from: h */
    private C0052o<Integer> f9773h;

    /* renamed from: i */
    private C0052o<Boolean> f9774i;

    /* renamed from: a */
    public final LiveData<C0100h<T>> mo10029a() {
        return this.f9766a;
    }

    /* renamed from: b */
    public final LiveData<NetworkStat> mo10033b() {
        return this.f9767b;
    }

    /* renamed from: c */
    public final LiveData<NetworkStat> mo10034c() {
        return this.f9768c;
    }

    /* renamed from: d */
    public final LiveData<Boolean> mo10035d() {
        return this.f9774i;
    }

    /* renamed from: e */
    public final LiveData<Boolean> mo10036e() {
        return this.f9769d;
    }

    /* renamed from: i */
    public final LiveData<Integer> mo10040i() {
        return this.f9773h;
    }

    /* renamed from: f */
    public final void mo10037f() {
        this.f9770e.onNext(C3303k.f10035a);
    }

    /* renamed from: g */
    public final void mo10038g() {
        this.f9771f.onNext(C3303k.f10035a);
    }

    /* renamed from: h */
    public final void mo10039h() {
        this.f9772g.onNext(C3303k.f10035a);
    }

    /* renamed from: a */
    public void mo10031a(T t) {
        throw new RuntimeException("unsupported operation");
    }

    /* renamed from: b */
    public int mo10032b(T t) {
        throw new RuntimeException("unsupported operation");
    }

    /* renamed from: a */
    public final void mo10030a(int i) {
        this.f9773h.setValue(Integer.valueOf(i));
    }

    public C3178a(C3179a<T> aVar, LiveData<C0100h<T>> liveData) {
        this.f9767b = aVar.mo10041a();
        this.f9768c = aVar.mo10042b();
        this.f9774i = aVar.mo10043c();
        this.f9770e = aVar.mo10045e();
        this.f9771f = aVar.mo10046f();
        this.f9772g = aVar.mo10047g();
        this.f9766a = liveData;
        this.f9769d = aVar.mo10044d();
        this.f9773h = aVar.mo10048h();
    }
}
