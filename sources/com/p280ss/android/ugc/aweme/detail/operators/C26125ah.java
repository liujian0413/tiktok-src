package com.p280ss.android.ugc.aweme.detail.operators;

import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.detail.operators.C26134am.C26136b;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26104i;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28467s;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.newfollow.userstate.C34180a;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.ah */
public final class C26125ah extends C26117a<C34180a, C26104i> implements C26136b {
    /* renamed from: a */
    public final int mo67682a(int i) {
        return 1;
    }

    /* renamed from: a */
    public final void mo67694a(C28467s sVar) {
        ((C26104i) this.f68942b).f68933a = sVar;
    }

    /* renamed from: a */
    public final void mo67695a(boolean z) {
        ((C26104i) this.f68942b).f68934d = true;
    }

    public C26125ah(C25673a aVar) {
        C34180a aVar2;
        if (aVar instanceof C34180a) {
            aVar2 = (C34180a) aVar;
        } else {
            aVar2 = new C34180a();
        }
        this.f68941a = aVar2;
        this.f68942b = new C26104i();
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        ((C26104i) this.f68942b).mo56976a(Integer.valueOf(i), feedParam.getUid());
    }
}
