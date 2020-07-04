package com.p280ss.android.ugc.aweme.p1216fe.method.feeds.p1220a;

import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.detail.operators.C26117a;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.p1216fe.method.feeds.C27976a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a.a */
public final class C27982a extends C26117a<C27976a, C25674b<C27976a>> {
    /* renamed from: a */
    public final boolean mo67686a(Fragment fragment) {
        C7573i.m23587b(fragment, "owner");
        if (this.f68941a != null) {
            return true;
        }
        return false;
    }

    public C27982a(C25673a<?, ?> aVar) {
        if (!(aVar instanceof C27976a)) {
            aVar = null;
        }
        this.f68941a = (C27976a) aVar;
        this.f68942b = new C25674b();
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        C7573i.m23587b(feedParam, "feedParam");
        this.f68942b.mo56976a(Integer.valueOf(i));
    }
}
