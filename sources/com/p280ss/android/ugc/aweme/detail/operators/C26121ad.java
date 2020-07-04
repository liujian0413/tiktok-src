package com.p280ss.android.ugc.aweme.detail.operators;

import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25676d;
import com.p280ss.android.ugc.aweme.discover.presenter.C26823f;
import com.p280ss.android.ugc.aweme.discover.presenter.C26825g;
import com.p280ss.android.ugc.aweme.discover.presenter.C26831l;
import com.p280ss.android.ugc.aweme.discover.presenter.C26834m;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.ad */
public final class C26121ad implements C26134am {

    /* renamed from: a */
    private C25673a f68945a;

    /* renamed from: b */
    private C25674b f68946b;

    /* renamed from: a */
    public final int mo67682a(int i) {
        return 9;
    }

    /* renamed from: a */
    public final boolean mo67686a(Fragment fragment) {
        return true;
    }

    /* renamed from: f */
    public final boolean mo67692f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo67693g() {
        return false;
    }

    /* renamed from: a */
    public final Object mo67683a() {
        return this.f68945a;
    }

    /* renamed from: b */
    public final boolean mo67688b() {
        return this.f68945a.isDataEmpty();
    }

    /* renamed from: c */
    public final boolean mo67689c() {
        return this.f68946b.mo66540i();
    }

    /* renamed from: e */
    public final void mo67691e() {
        this.f68946b.mo59134U_();
        this.f68946b.mo66535W_();
    }

    /* renamed from: a */
    public final void mo67685a(C26138ao aoVar) {
        this.f68946b.mo66537a(aoVar);
        this.f68946b.mo66568a((C25676d) aoVar);
        this.f68946b.mo66536a(this.f68945a);
    }

    public C26121ad(C25673a aVar) {
        C25674b bVar;
        if (aVar == null) {
            this.f68945a = new C26823f();
            bVar = new C26825g();
        } else {
            this.f68945a = aVar;
            if (aVar instanceof C26831l) {
                bVar = new C26834m(null);
            } else {
                bVar = new C26825g();
            }
        }
        this.f68946b = bVar;
    }

    /* renamed from: a */
    public final boolean mo67687a(String str) {
        Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(str);
        if (awemeById == null) {
            awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getProfileSelfSeeAweme(str);
        }
        if (awemeById == null) {
            return false;
        }
        return this.f68946b.mo66569a((Object) awemeById);
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        this.f68946b.mo56976a(Integer.valueOf(i));
    }
}
