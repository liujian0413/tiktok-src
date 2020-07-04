package com.bytedance.android.live.core.paging.viewmodel;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.paging.C0100h;
import com.bytedance.android.live.core.network.NetworkStat;
import com.bytedance.android.live.core.paging.C3197b;
import com.bytedance.android.live.core.rxutils.RxViewModel;

public class PagingViewModel<T> extends RxViewModel {

    /* renamed from: a */
    private final C0053p<NetworkStat> f9869a = new C3214a(this);

    /* renamed from: b */
    public C0052o<NetworkStat> f9870b = new C0052o<>();

    /* renamed from: c */
    public C0052o<NetworkStat> f9871c = new C0052o<>();

    /* renamed from: d */
    public C0052o<Boolean> f9872d = new C0052o<>();

    /* renamed from: e */
    public C0052o<Boolean> f9873e = new C0052o<>();

    /* renamed from: f */
    public C0052o<Integer> f9874f = new C0052o<>();

    /* renamed from: g */
    public C0052o<C0100h<T>> f9875g = new C0052o<>();

    /* renamed from: h */
    public C3197b<T> f9876h;

    /* renamed from: j */
    private final C0053p<NetworkStat> f9877j = new C3215b(this);

    /* renamed from: k */
    private final C0053p<C0100h<T>> f9878k = new C3216c(this);

    /* renamed from: l */
    private final C0053p<Boolean> f9879l = new C3217d(this);

    /* renamed from: m */
    private final C0053p<Boolean> f9880m = new C3218e(this);

    /* renamed from: n */
    private final C0053p<Integer> f9881n = new C3219f(this);

    /* renamed from: a */
    public final void mo10106a() {
        if (this.f9876h != null) {
            this.f9876h.mo10039h();
        }
    }

    /* renamed from: c */
    public final void mo10116c() {
        if (this.f9876h != null) {
            this.f9876h.mo10038g();
        }
    }

    /* renamed from: b */
    public boolean mo10115b() {
        if ((this.f9871c.getValue() != null && ((NetworkStat) this.f9871c.getValue()).mo10025a()) || this.f9876h == null) {
            return false;
        }
        this.f9876h.mo10037f();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo10107a(C0100h hVar) {
        this.f9875g.postValue(hVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo10113b(NetworkStat networkStat) {
        this.f9870b.postValue(networkStat);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo10114b(Boolean bool) {
        this.f9872d.postValue(bool);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo10108a(NetworkStat networkStat) {
        this.f9871c.postValue(networkStat);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo10110a(Boolean bool) {
        this.f9873e.postValue(bool);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo10111a(Integer num) {
        this.f9874f.setValue(num);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10109a(C3197b<T> bVar) {
        if (this.f9876h != null) {
            this.f9876h.mo10033b().removeObserver(this.f9869a);
            this.f9876h.mo10034c().removeObserver(this.f9877j);
            this.f9876h.mo10029a().removeObserver(this.f9878k);
            this.f9876h.mo10036e().removeObserver(this.f9879l);
            this.f9876h.mo10035d().removeObserver(this.f9880m);
            this.f9876h.mo10040i().removeObserver(this.f9881n);
        }
        this.f9876h = bVar;
        if (bVar != null) {
            this.f9876h.mo10033b().observeForever(this.f9869a);
            this.f9876h.mo10034c().observeForever(this.f9877j);
            this.f9876h.mo10029a().observeForever(this.f9878k);
            this.f9876h.mo10036e().observeForever(this.f9879l);
            this.f9876h.mo10035d().observeForever(this.f9880m);
            this.f9876h.mo10040i().observeForever(this.f9881n);
        }
    }

    /* renamed from: a */
    public final void mo10112a(T t) {
        if (this.f9876h != null && t != null) {
            this.f9876h.mo10031a(t);
        }
    }
}
