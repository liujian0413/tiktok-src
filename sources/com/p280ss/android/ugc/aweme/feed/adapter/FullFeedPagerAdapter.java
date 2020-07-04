package com.p280ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.BaseFeedPageParams;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter */
public class FullFeedPagerAdapter extends FeedPagerAdapter {
    /* renamed from: a */
    public final C28130ac mo67564a(View view, C28343z<C28318an> zVar, OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams) {
        C28196x xVar = new C28196x(view, zVar, onTouchListener, fragment, baseFeedPageParams, this.f73987c, this.f73989e);
        mo71586a((C28130ac) xVar);
        return xVar;
    }

    public FullFeedPagerAdapter(Context context, LayoutInflater layoutInflater, int i, C28343z<C28318an> zVar, Fragment fragment, OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams) {
        super(context, layoutInflater, i, zVar, fragment, onTouchListener, baseFeedPageParams);
    }

    /* renamed from: a */
    public final C28130ac mo67563a(int i, View view, C28343z<C28318an> zVar, String str, OnTouchListener onTouchListener, Fragment fragment, int i2) {
        C28195w wVar = new C28195w(i, view, zVar, str, onTouchListener, fragment, i2);
        return wVar;
    }
}
