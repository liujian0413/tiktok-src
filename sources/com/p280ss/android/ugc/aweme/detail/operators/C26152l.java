package com.p280ss.android.ugc.aweme.detail.operators;

import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.detail.p1164h.C26066a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.history.C30231b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.l */
public final class C26152l extends C26117a<C25673a<Aweme, C26066a>, C25674b<C25673a<Aweme, C26066a>>> {
    /* renamed from: a */
    public final int mo67682a(int i) {
        return i + AdError.SERVER_ERROR_CODE;
    }

    public C26152l(C25673a aVar) {
        this.f68941a = aVar;
        this.f68942b = new C30231b();
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        this.f68942b.mo56976a(Integer.valueOf(i));
    }
}
