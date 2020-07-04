package com.p280ss.android.ugc.aweme.detail;

import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import com.p280ss.android.ugc.aweme.detail.p1167ui.C26191b;
import com.p280ss.android.ugc.aweme.detail.p1167ui.C26192c;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.adapter.CarVideoViewHolder;
import com.p280ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter;
import com.p280ss.android.ugc.aweme.feed.adapter.XiGuaVideoViewHolder;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.BaseFeedPageParams;

/* renamed from: com.ss.android.ugc.aweme.detail.DetailFeedPagerAdapter */
public class DetailFeedPagerAdapter extends FeedPagerAdapter {
    /* renamed from: b */
    public final C28130ac mo67565b(View view, C28343z<C28318an> zVar, OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams) {
        XiGuaVideoViewHolder xiGuaVideoViewHolder = new XiGuaVideoViewHolder(view, zVar, onTouchListener, fragment, baseFeedPageParams, this.f73987c, this.f73989e);
        mo71586a((C28130ac) xiGuaVideoViewHolder);
        return xiGuaVideoViewHolder;
    }

    /* renamed from: c */
    public final C28130ac mo67566c(View view, C28343z<C28318an> zVar, OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams) {
        CarVideoViewHolder carVideoViewHolder = new CarVideoViewHolder(view, zVar, onTouchListener, fragment, baseFeedPageParams, this.f73987c, this.f73989e);
        mo71586a((C28130ac) carVideoViewHolder);
        return carVideoViewHolder;
    }

    /* renamed from: a */
    public C28130ac mo67564a(View view, C28343z<C28318an> zVar, OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams) {
        C26192c cVar = new C26192c(view, zVar, onTouchListener, fragment, baseFeedPageParams, this.f73987c, this.f73989e);
        mo71586a((C28130ac) cVar);
        return cVar;
    }

    public DetailFeedPagerAdapter(Context context, LayoutInflater layoutInflater, int i, C28343z<C28318an> zVar, Fragment fragment, OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams) {
        super(context, layoutInflater, i, zVar, fragment, onTouchListener, baseFeedPageParams);
    }

    /* renamed from: a */
    public C28130ac mo67563a(int i, View view, C28343z<C28318an> zVar, String str, OnTouchListener onTouchListener, Fragment fragment, int i2) {
        C26191b bVar = new C26191b(i, view, zVar, str, onTouchListener, fragment, i2, mo71584a());
        return bVar;
    }
}
