package com.bytedance.android.live.core.paging;

import android.arch.lifecycle.LiveData;
import android.arch.paging.C0100h;
import com.bytedance.android.live.core.network.NetworkStat;

/* renamed from: com.bytedance.android.live.core.paging.b */
public interface C3197b<T> {
    /* renamed from: a */
    LiveData<C0100h<T>> mo10029a();

    /* renamed from: a */
    void mo10030a(int i);

    /* renamed from: a */
    void mo10031a(T t);

    /* renamed from: b */
    int mo10032b(T t);

    /* renamed from: b */
    LiveData<NetworkStat> mo10033b();

    /* renamed from: c */
    LiveData<NetworkStat> mo10034c();

    /* renamed from: d */
    LiveData<Boolean> mo10035d();

    /* renamed from: e */
    LiveData<Boolean> mo10036e();

    /* renamed from: f */
    void mo10037f();

    /* renamed from: g */
    void mo10038g();

    /* renamed from: h */
    void mo10039h();

    /* renamed from: i */
    LiveData<Integer> mo10040i();
}
