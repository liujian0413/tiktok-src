package com.p280ss.android.ugc.aweme.detail.operators;

import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25676d;
import com.p280ss.android.ugc.aweme.detail.operators.C26134am.C26135a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail.C27088c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.ar */
public final class C26141ar implements C26134am, C26135a {

    /* renamed from: a */
    private C25673a f68967a;

    /* renamed from: b */
    private C25674b f68968b = new C27088c();

    /* renamed from: a */
    public final int mo67682a(int i) {
        return 9;
    }

    /* renamed from: a */
    public final boolean mo67686a(Fragment fragment) {
        return true;
    }

    /* renamed from: d */
    public final boolean mo67699d() {
        return false;
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
        return this.f68967a;
    }

    /* renamed from: b */
    public final boolean mo67688b() {
        return this.f68967a.isDataEmpty();
    }

    /* renamed from: c */
    public final boolean mo67689c() {
        return this.f68968b.mo66540i();
    }

    /* renamed from: e */
    public final void mo67691e() {
        this.f68968b.mo59134U_();
        this.f68968b.mo66535W_();
    }

    public C26141ar(C25673a aVar) {
        this.f68967a = aVar;
    }

    /* renamed from: a */
    public final void mo67685a(C26138ao aoVar) {
        this.f68968b.mo66537a(aoVar);
        this.f68968b.mo66568a((C25676d) aoVar);
        this.f68968b.mo66536a(this.f68967a);
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
        return this.f68968b.mo66569a((Object) awemeById);
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        this.f68968b.mo56976a(Integer.valueOf(i));
    }
}
