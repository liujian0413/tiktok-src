package com.p280ss.android.ugc.aweme.detail.operators;

import com.facebook.ads.AdError;
import com.p1843tt.appbrandimpl.C46577b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.k */
public final class C26151k extends C26117a<C46577b, C25674b<C46577b>> {

    /* renamed from: c */
    private boolean f68981c;

    /* renamed from: h */
    private int m85984h() {
        if (this.f68981c) {
            return 1000;
        }
        return AdError.SERVER_ERROR_CODE;
    }

    /* renamed from: a */
    public final int mo67682a(int i) {
        return m85984h() + i;
    }

    public C26151k(C25673a aVar) {
        C46577b bVar;
        if (aVar instanceof C46577b) {
            bVar = (C46577b) aVar;
        } else {
            bVar = new C46577b();
        }
        this.f68941a = bVar;
        this.f68942b = new C25674b();
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        String microAppId = feedParam.getMicroAppId();
        String hashTagName = feedParam.getHashTagName();
        int cursor = feedParam.getCursor();
        int count = feedParam.getCount();
        this.f68942b.mo56976a(Integer.valueOf(4), microAppId, hashTagName, Integer.valueOf(count), Integer.valueOf(cursor));
    }
}
