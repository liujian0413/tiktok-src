package com.p280ss.android.ugc.aweme.detail.operators;

import com.p280ss.android.ugc.aweme.detail.p1166j.C26108l;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.poi.model.C35120j;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.aq */
public final class C26140aq extends C26117a<C35120j, C26108l> {
    /* renamed from: a */
    public final int mo67682a(int i) {
        return 10;
    }

    public C26140aq() {
        this.f68941a = new C35120j();
        this.f68942b = new C26108l();
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        C7573i.m23587b(feedParam, "feedParam");
        ((C26108l) this.f68942b).mo56976a(Integer.valueOf(i), feedParam.getCityCode());
    }
}
