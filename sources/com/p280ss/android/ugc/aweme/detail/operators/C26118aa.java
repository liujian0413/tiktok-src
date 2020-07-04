package com.p280ss.android.ugc.aweme.detail.operators;

import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.profile.presenter.C36018b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.aa */
public final class C26118aa extends C26117a<C36018b, C25674b<C36018b>> {

    /* renamed from: c */
    private boolean f68943c;

    /* renamed from: d */
    private String f68944d;

    /* renamed from: h */
    private int m85812h() {
        if (this.f68943c) {
            return 1000;
        }
        return AdError.SERVER_ERROR_CODE;
    }

    /* renamed from: a */
    public final int mo67682a(int i) {
        return m85812h() + i;
    }

    public C26118aa(C25673a aVar, boolean z, String str) {
        C36018b bVar;
        if (aVar instanceof C36018b) {
            bVar = (C36018b) aVar;
        } else {
            bVar = new C36018b();
        }
        this.f68941a = bVar;
        this.f68942b = new C25674b();
        this.f68943c = z;
        this.f68944d = str;
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        this.f68942b.mo56976a(Integer.valueOf(i), Boolean.valueOf(true), this.f68944d, Integer.valueOf(feedParam.getVideoType()), Integer.valueOf(m85812h()));
    }
}
