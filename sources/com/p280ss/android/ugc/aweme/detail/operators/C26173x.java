package com.p280ss.android.ugc.aweme.detail.operators;

import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.detail.operators.C26134am.C26136b;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26109m;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28467s;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.poi.model.C35123l;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.x */
public final class C26173x extends C26117a<C35123l, C26109m> implements C26136b {
    /* renamed from: a */
    public final void mo67694a(C28467s sVar) {
        ((C26109m) this.f68942b).f68933a = sVar;
    }

    /* renamed from: a */
    public final void mo67695a(boolean z) {
        C25674b bVar = this.f68942b;
        C7573i.m23582a((Object) bVar, "mPresenter");
        ((C26109m) bVar).f68934d = true;
    }

    public C26173x(C25673a<?, ?> aVar) {
        C35123l lVar;
        if (aVar instanceof C35123l) {
            lVar = (C35123l) aVar;
        } else {
            lVar = new C35123l();
        }
        this.f68941a = lVar;
        this.f68942b = new C26109m();
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        C7573i.m23587b(feedParam, "feedParam");
        ((C26109m) this.f68942b).mo56976a("", "", feedParam.getCityCode(), Integer.valueOf(feedParam.getPoiClassCode()), feedParam.getDistrictCode(), feedParam.getBackendType());
    }
}
