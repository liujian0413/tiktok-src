package com.p280ss.android.ugc.aweme.detail.operators;

import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.detail.operators.C26134am.C26136b;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26101f;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28467s;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.follow.presenter.C29452a;
import com.p280ss.android.ugc.aweme.follow.presenter.C29457e;
import com.p280ss.android.ugc.aweme.newfollow.util.C34196c;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.j */
public final class C26150j extends C26117a<C29452a, C26101f> implements C26136b {
    /* renamed from: a */
    public final int mo67682a(int i) {
        return 1;
    }

    /* renamed from: a */
    public final void mo67694a(C28467s sVar) {
        ((C26101f) this.f68942b).f68933a = sVar;
    }

    /* renamed from: a */
    public final void mo67695a(boolean z) {
        ((C26101f) this.f68942b).f68934d = true;
    }

    public C26150j(C25673a aVar) {
        C29452a aVar2;
        if (aVar instanceof C29452a) {
            aVar2 = (C29452a) aVar;
        } else {
            aVar2 = new C29452a();
        }
        this.f68941a = aVar2;
        this.f68942b = new C26101f();
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        if (i == 1) {
            ((C26101f) this.f68942b).mo56976a(Integer.valueOf(1), C29457e.m96948a(1, 0, 0, C34196c.m110395a(C22704b.f60414c).mo86928c()).mo75459a());
        } else if (i == 4) {
            ((C26101f) this.f68942b).mo56976a(Integer.valueOf(4), C29457e.m96948a(4, 2, 0, C34196c.m110395a(C22704b.f60414c).mo86928c()).mo75461a(C34196c.m110395a(C22704b.f60414c).mo86924a()).mo75459a());
        } else {
            ((C26101f) this.f68942b).mo56976a(Integer.valueOf(i), C29457e.m96948a(i, 2, 0, C34196c.m110395a(C22704b.f60414c).mo86928c()).mo75461a(C34196c.m110395a(C22704b.f60414c).mo86924a()).mo75459a());
        }
    }
}
