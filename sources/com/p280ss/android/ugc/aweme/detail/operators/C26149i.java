package com.p280ss.android.ugc.aweme.detail.operators;

import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.detail.operators.C26134am.C26136b;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26100e;
import com.p280ss.android.ugc.aweme.familiar.p965a.C21712c;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28467s;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.i */
public final class C26149i extends C26117a<C21712c, C26100e> implements C26136b {
    /* renamed from: a */
    public final int mo67682a(int i) {
        return 22;
    }

    /* renamed from: a */
    public final void mo67694a(C28467s sVar) {
        ((C26100e) this.f68942b).f68933a = sVar;
    }

    /* renamed from: a */
    public final void mo67695a(boolean z) {
        C25674b bVar = this.f68942b;
        C7573i.m23582a((Object) bVar, "mPresenter");
        ((C26100e) bVar).f68934d = true;
    }

    public C26149i(C21712c cVar) {
        if (cVar == null) {
            cVar = new C21712c();
        }
        this.f68941a = cVar;
        this.f68942b = new C26100e();
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        C7573i.m23587b(feedParam, "feedParam");
        if (i != 1) {
            if (i == 4) {
                ((C26100e) this.f68942b).mo56976a(Integer.valueOf(4), Integer.valueOf(2), null, null);
            }
            return;
        }
        ((C26100e) this.f68942b).mo56976a(Integer.valueOf(1), Integer.valueOf(0), null, null);
    }
}
