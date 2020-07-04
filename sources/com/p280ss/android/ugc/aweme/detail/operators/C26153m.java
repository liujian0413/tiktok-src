package com.p280ss.android.ugc.aweme.detail.operators;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.hotsearch.model.C30362a;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.m */
public final class C26153m extends C26117a<C30362a, C25674b<C30362a>> {

    /* renamed from: c */
    private String f68982c;

    /* renamed from: a */
    public final int mo67682a(int i) {
        return 13;
    }

    public C26153m(C25673a aVar, String str) {
        C30362a aVar2;
        this.f68982c = str;
        if (aVar instanceof C30362a) {
            aVar2 = (C30362a) aVar;
        } else {
            aVar2 = new C30362a();
        }
        this.f68941a = aVar2;
        this.f68942b = new C25674b();
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        if (TextUtils.equals(this.f68982c, "from_hot_search_aweme")) {
            this.f68942b.mo56976a(Integer.valueOf(1));
            return;
        }
        if (TextUtils.equals(this.f68982c, "from_hot_search_positive_aweme")) {
            this.f68942b.mo56976a(Integer.valueOf(1), Integer.valueOf(1));
        }
    }
}
