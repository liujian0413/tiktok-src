package com.p280ss.android.ugc.aweme.detail.operators;

import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel.C29538a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.ab */
public final class C26119ab extends C26117a<C29538a, C25674b<C29538a>> {
    /* renamed from: a */
    public final int mo67682a(int i) {
        return super.mo67682a(i);
    }

    /* renamed from: a */
    public final boolean mo67686a(Fragment fragment) {
        C7573i.m23587b(fragment, "owner");
        if (this.f68941a != null) {
            return true;
        }
        return false;
    }

    public C26119ab(C25673a<?, ?> aVar) {
        this.f68941a = (C29538a) aVar;
        this.f68942b = new C25674b();
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        C7573i.m23587b(feedParam, "feedParam");
        this.f68942b.mo56976a(Integer.valueOf(i));
    }
}
