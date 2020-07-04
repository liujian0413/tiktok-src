package com.p280ss.android.ugc.aweme.detail.operators;

import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.sticker.prop.p1636a.C41856b;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.af */
public final class C26123af extends C26117a<C41856b, C25674b<C41856b>> {
    /* renamed from: a */
    public final int mo67682a(int i) {
        return i + VideoCacheTTnetProxyTimeoutExperiment.DEFAULT;
    }

    public C26123af(C25673a aVar) {
        C41856b bVar;
        if (aVar instanceof C41856b) {
            bVar = (C41856b) aVar;
        } else {
            bVar = new C41856b();
        }
        this.f68941a = bVar;
        this.f68942b = new C25674b();
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        this.f68942b.mo56976a(Integer.valueOf(i), feedParam.getStickerId(), Integer.valueOf(feedParam.getVideoType()));
    }
}
