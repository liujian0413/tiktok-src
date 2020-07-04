package com.p280ss.android.ugc.aweme.detail.operators;

import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.poi.model.C35107d;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.w */
public final class C26172w extends C26117a<C35107d, C25674b<C35107d>> {
    public C26172w(C25673a aVar) {
        C35107d dVar;
        if (aVar instanceof C35107d) {
            dVar = (C35107d) aVar;
        } else {
            dVar = new C35107d();
        }
        this.f68941a = dVar;
        this.f68942b = new C25674b();
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        this.f68942b.mo56976a(Integer.valueOf(i), feedParam.getPoiId(), Integer.valueOf(i2), Boolean.valueOf(false));
    }
}
