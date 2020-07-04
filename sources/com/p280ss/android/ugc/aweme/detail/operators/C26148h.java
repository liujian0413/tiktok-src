package com.p280ss.android.ugc.aweme.detail.operators;

import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel;
import com.p280ss.android.ugc.aweme.discover.presenter.C26814a;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.h */
public final class C26148h extends C26117a<DiscoveryV4DetailListModel, C25674b<DiscoveryV4DetailListModel>> {

    /* renamed from: c */
    public final String f68979c;

    /* renamed from: d */
    private final int f68980d = 8;

    /* renamed from: a */
    public final int mo67682a(int i) {
        return 9001;
    }

    /* renamed from: c */
    public final boolean mo67689c() {
        return super.mo67689c();
    }

    public C26148h(String str, C25673a<?, ?> aVar) {
        C7573i.m23587b(str, "tabName");
        this.f68979c = str;
        if (!(aVar instanceof DiscoveryV4DetailListModel)) {
            aVar = null;
        }
        DiscoveryV4DetailListModel discoveryV4DetailListModel = (DiscoveryV4DetailListModel) aVar;
        if (discoveryV4DetailListModel == null) {
            discoveryV4DetailListModel = new DiscoveryV4DetailListModel();
        }
        this.f68941a = discoveryV4DetailListModel;
        this.f68942b = new C26814a(this.f68979c);
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        C7573i.m23587b(feedParam, "feedParam");
        this.f68942b.mo56976a(Integer.valueOf(i), Integer.valueOf(feedParam.getCellDetailType()), feedParam.getCellId(), feedParam.getTabName(), Integer.valueOf(this.f68980d), feedParam.getAid());
    }
}
