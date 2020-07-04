package com.p280ss.android.ugc.aweme.detail.operators;

import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.detail.operators.C26134am.C26136b;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26103h;
import com.p280ss.android.ugc.aweme.discover.mixfeed.C26756f;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28467s;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.ac */
public final class C26120ac extends C26117a<C26756f, C26103h> implements C26136b {
    /* renamed from: a */
    public final int mo67682a(int i) {
        return 9;
    }

    /* renamed from: a */
    public final void mo67694a(C28467s sVar) {
        ((C26103h) this.f68942b).f68933a = sVar;
    }

    /* renamed from: a */
    public final void mo67695a(boolean z) {
        C25674b bVar = this.f68942b;
        C7573i.m23582a((Object) bVar, "mPresenter");
        ((C26103h) bVar).f68934d = true;
    }

    public C26120ac(C25673a<?, ?> aVar) {
        C26756f fVar;
        if (aVar instanceof C26756f) {
            fVar = (C26756f) aVar;
        } else {
            fVar = new C26756f();
        }
        this.f68941a = fVar;
        this.f68942b = new C26103h();
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        C7573i.m23587b(feedParam, "feedParam");
        if (i == 1) {
            ((C26103h) this.f68942b).mo56976a(Integer.valueOf(i), feedParam.getSearchKeyword());
            return;
        }
        ((C26103h) this.f68942b).mo56976a(Integer.valueOf(i));
    }
}
