package com.p280ss.android.ugc.aweme.metrics;

import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;

/* renamed from: com.ss.android.ugc.aweme.metrics.aa */
public final class C33227aa extends C33259d {

    /* renamed from: a */
    protected String f86488a;

    /* renamed from: b */
    private String f86489b;

    /* renamed from: c */
    private String f86490c;

    public C33227aa() {
        super("click_complete_video_entrance");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85248a("group_id", this.f86489b, C33260a.f86771b);
        mo85255h(this.f86490c);
        mo85248a("enter_from", this.f86488a, C33260a.f86770a);
    }

    /* renamed from: a */
    public final C33227aa mo85055a(String str) {
        this.f86488a = str;
        return this;
    }

    /* renamed from: c */
    public final C33227aa mo85056c(Aweme aweme, int i) {
        this.f86490c = ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestId(aweme, i);
        this.f86489b = C33230ac.m107238m(aweme);
        return this;
    }
}
