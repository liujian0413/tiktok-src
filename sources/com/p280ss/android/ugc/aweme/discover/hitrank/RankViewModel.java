package com.p280ss.android.ugc.aweme.discover.hitrank;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.hitrank.RankViewModel */
public class RankViewModel extends C0063u {

    /* renamed from: a */
    private HitNotice f70345a;

    /* renamed from: b */
    private C0052o<C26680e> f70346b;

    /* renamed from: c */
    private RankApi f70347c;

    public void onCleared() {
        super.onCleared();
        C42961az.m136383d(this);
    }

    /* renamed from: a */
    public final C0052o<C26680e> mo68407a() {
        if (this.f70346b == null) {
            this.f70346b = new C0052o<>();
        }
        return this.f70346b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo68408a(C1592h hVar) throws Exception {
        HitNotice hitNotice = (HitNotice) hVar.mo6890e();
        if (hitNotice != null) {
            this.f70345a = hitNotice;
        }
        if (hVar.mo6887c() || hVar.mo6889d()) {
            mo68407a().postValue(new C26680e(-2, null));
        } else if (this.f70345a == null) {
            mo68407a().postValue(new C26680e(-1, null));
        } else {
            mo68407a().postValue(new C26680e(1, this.f70345a));
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ HitNotice mo68410b(String str, String str2) throws Exception {
        return (HitNotice) this.f70347c.getActivityInfo(str, str2).get();
    }

    /* renamed from: c */
    private void m87634c(String str, String str2) {
        C1592h.m7853a((Callable<TResult>) new C26684h<TResult>(this, str, str2)).mo6876a((C1591g<TResult, TContinuationResult>) new C26685i<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: a */
    public final void mo68409a(String str, String str2) {
        if (this.f70347c == null) {
            this.f70347c = (RankApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(RankApi.class);
        }
        m87634c(str, str2);
    }
}
