package com.p280ss.android.ugc.aweme.detail.operators;

import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.music.presenter.C33809j;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.q */
public final class C26166q extends C26117a<C33809j, C25674b<C33809j>> {
    /* renamed from: a */
    public final int mo67682a(int i) {
        return i + 4000;
    }

    public C26166q(C25673a aVar) {
        C33809j jVar;
        if (aVar instanceof C33809j) {
            jVar = (C33809j) aVar;
        } else {
            jVar = new C33809j();
        }
        this.f68941a = jVar;
        this.f68942b = new C25674b();
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        this.f68942b.mo56976a(Integer.valueOf(i), feedParam.getMusicId(), Integer.valueOf(feedParam.getVideoType()));
    }
}
