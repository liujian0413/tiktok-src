package com.p280ss.android.ugc.aweme.detail.operators;

import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.movie.p1402a.C33642a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.o */
public final class C26164o extends C26117a<C33642a, C25674b<C33642a>> {
    /* renamed from: a */
    public final int mo67682a(int i) {
        return i + 11000;
    }

    public C26164o(C25673a<?, ?> aVar) {
        if (!(aVar instanceof C33642a)) {
            aVar = null;
        }
        C33642a aVar2 = (C33642a) aVar;
        if (aVar2 == null) {
            aVar2 = new C33642a();
        }
        this.f68941a = aVar2;
        this.f68942b = new C25674b();
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        C7573i.m23587b(feedParam, "feedParam");
        this.f68942b.mo56976a(Integer.valueOf(i), feedParam.getMvId(), Integer.valueOf(feedParam.getVideoType()));
    }
}
