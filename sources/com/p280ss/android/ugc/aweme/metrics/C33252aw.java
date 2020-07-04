package com.p280ss.android.ugc.aweme.metrics;

import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.metrics.C33259d.C33260a;

/* renamed from: com.ss.android.ugc.aweme.metrics.aw */
public final class C33252aw extends C33270l<C33252aw> {

    /* renamed from: A */
    private Aweme f86630A;

    /* renamed from: B */
    private int f86631B;

    /* renamed from: a */
    protected String f86632a;

    /* renamed from: b */
    private String f86633b;

    /* renamed from: c */
    private String f86634c;

    public C33252aw() {
        super("video_pause");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67592a() {
        mo85248a("author_id", C33230ac.m107205a(this.f86630A), C33260a.f86770a);
        mo85248a("group_id", this.f86633b, C33260a.f86771b);
        mo85255h(this.f86634c);
        mo85248a("enter_from", this.f86632a, C33260a.f86770a);
        if (this.f86631B != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f86631B);
            mo85248a("is_long_item", sb.toString(), C33260a.f86770a);
        }
    }

    /* renamed from: a */
    public final C33252aw mo85157a(int i) {
        this.f86631B = 1;
        return this;
    }

    /* renamed from: a */
    public final C33252aw mo85158a(String str) {
        this.f86632a = str;
        return this;
    }

    /* renamed from: c */
    public final C33252aw mo85159c(Aweme aweme, int i) {
        this.f86630A = aweme;
        this.f86634c = ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestId(aweme, i);
        this.f86633b = C33230ac.m107238m(aweme);
        return this;
    }
}
