package com.p280ss.android.ugc.aweme.detail.operators;

import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.detail.operators.C26134am.C26136b;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26102g;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28467s;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.poi.C35086h;
import com.p280ss.android.ugc.aweme.poi.C35086h.C35087a;
import com.p280ss.android.ugc.aweme.poi.model.C35105b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.u */
public final class C26170u extends C26117a<C35105b, C26102g> implements C26136b {
    /* renamed from: a */
    public final int mo67682a(int i) {
        return 10;
    }

    /* renamed from: a */
    public final void mo67694a(C28467s sVar) {
        ((C26102g) this.f68942b).f68933a = sVar;
    }

    /* renamed from: a */
    public final void mo67695a(boolean z) {
        C25674b bVar = this.f68942b;
        C7573i.m23582a((Object) bVar, "mPresenter");
        ((C26102g) bVar).f68934d = true;
    }

    public C26170u(C25673a<?, ?> aVar) {
        C35105b bVar;
        if (aVar instanceof C35105b) {
            bVar = (C35105b) aVar;
        } else {
            bVar = new C35105b();
        }
        this.f68941a = bVar;
        this.f68942b = new C26102g();
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        C7573i.m23587b(feedParam, "feedParam");
        C35086h a = new C35087a().mo88937a(feedParam.getPoiId()).mo88945d(feedParam.getRelatedId()).mo88940b(3).mo88939a();
        if (i == 1) {
            ((C26102g) this.f68942b).mo56976a(Integer.valueOf(i), a);
            return;
        }
        ((C26102g) this.f68942b).mo56976a(Integer.valueOf(i), a);
    }
}
