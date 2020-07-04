package com.p280ss.android.ugc.aweme.detail.operators;

import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.ai */
public final class C26126ai extends C26117a<C25673a, C25674b<C25673a>> {
    /* renamed from: a */
    public final int mo67682a(int i) {
        return 8000;
    }

    /* renamed from: a */
    public final boolean mo67686a(Fragment fragment) {
        if (this.f68941a != null) {
            return true;
        }
        return false;
    }

    public C26126ai(C25673a aVar) {
        this.f68941a = aVar;
        this.f68942b = new C25674b();
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        this.f68942b.mo56976a(feedParam.getAid());
    }
}
