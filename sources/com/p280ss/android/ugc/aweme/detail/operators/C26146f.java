package com.p280ss.android.ugc.aweme.detail.operators;

import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.tutorial.p1683a.C42666b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.f */
public final class C26146f extends C26117a<C42666b, C25674b<C42666b>> {
    /* renamed from: a */
    public final int mo67682a(int i) {
        return i + 13000;
    }

    public C26146f(C25673a<?, ?> aVar) {
        if (!(aVar instanceof C42666b)) {
            aVar = null;
        }
        C42666b bVar = (C42666b) aVar;
        if (bVar == null) {
            bVar = new C42666b();
        }
        this.f68941a = bVar;
        this.f68942b = new C25674b();
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        C7573i.m23587b(feedParam, "feedParam");
        this.f68942b.mo56976a(Integer.valueOf(i), feedParam.getTutorialId(), Integer.valueOf(feedParam.getVideoType()));
    }
}
