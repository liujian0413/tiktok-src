package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.View.OnTouchListener;
import com.p280ss.android.ugc.aweme.detail.DetailFeedPagerAdapter;
import com.p280ss.android.ugc.aweme.detail.p1167ui.C26191b;
import com.p280ss.android.ugc.aweme.detail.p1167ui.C26192c;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.BaseFeedPageParams;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.DiscoverDetailFeedPagerAdapter */
public class DiscoverDetailFeedPagerAdapter extends DetailFeedPagerAdapter {

    /* renamed from: l */
    private String f69471l;

    /* renamed from: m */
    private String f69472m;

    /* renamed from: n */
    private String f69473n;

    /* renamed from: o */
    private String f69474o;

    /* renamed from: p */
    private int f69475p;

    /* renamed from: a */
    public final C28130ac mo67564a(View view, C28343z<C28318an> zVar, OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams) {
        C26192c cVar = new C26192c(view, zVar, onTouchListener, fragment, baseFeedPageParams, this.f73987c, this.f73989e);
        cVar.f74143w = true;
        cVar.mo71668a(this.f69471l, this.f69472m, this.f69473n, this.f69474o);
        cVar.mo71534e(this.f69475p);
        mo71586a((C28130ac) cVar);
        return cVar;
    }

    /* renamed from: a */
    public final C28130ac mo67563a(int i, View view, C28343z<C28318an> zVar, String str, OnTouchListener onTouchListener, Fragment fragment, int i2) {
        C26191b bVar = new C26191b(i, view, zVar, str, onTouchListener, fragment, i2, null);
        bVar.mo71527a(this.f69471l, this.f69472m, this.f69473n, this.f69474o);
        bVar.mo71534e(this.f69475p);
        return bVar;
    }
}
