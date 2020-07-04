package com.p280ss.android.ugc.aweme.detail.operators;

import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25676d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.similarvideo.p1629b.C41716a;
import com.p280ss.android.ugc.aweme.similarvideo.p1629b.C41718b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.ae */
public final class C26122ae implements C26134am {

    /* renamed from: a */
    private C25673a f68947a;

    /* renamed from: b */
    private C25674b f68948b;

    /* renamed from: a */
    public final int mo67682a(int i) {
        return 16;
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
        return this.f68947a;
    }

    /* renamed from: b */
    public final boolean mo67688b() {
        return this.f68947a.isDataEmpty();
    }

    /* renamed from: c */
    public final boolean mo67689c() {
        return this.f68948b.mo66540i();
    }

    /* renamed from: e */
    public final void mo67691e() {
        this.f68948b.mo59134U_();
        this.f68948b.mo66535W_();
    }

    public C26122ae(C25673a aVar) {
        if (aVar == null) {
            this.f68947a = new C41716a();
            this.f68948b = new C41718b();
            return;
        }
        this.f68947a = aVar;
        this.f68948b = new C41718b();
    }

    /* renamed from: a */
    public final void mo67685a(C26138ao aoVar) {
        this.f68948b.mo66537a(aoVar);
        this.f68948b.mo66568a((C25676d) aoVar);
        this.f68948b.mo66536a(this.f68947a);
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
        return this.f68948b.mo66569a((Object) awemeById);
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        this.f68948b.mo56976a(Integer.valueOf(i));
    }
}
