package com.p280ss.android.ugc.aweme.detail;

import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import com.p280ss.android.ugc.aweme.detail.p1167ui.C26189aa;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.PoiRankDetailFeedPagerAdapter */
public final class PoiRankDetailFeedPagerAdapter extends FeedPagerAdapter {
    public final int getItemPosition(Object obj) {
        C7573i.m23587b(obj, "any");
        return -2;
    }

    public final int getCount() {
        if (m85548d()) {
            return Integer.MAX_VALUE;
        }
        return super.getCount();
    }

    /* renamed from: d */
    private final boolean m85548d() {
        int i;
        List b = mo71593b();
        if (b != null) {
            i = b.size();
        } else {
            i = 0;
        }
        if (i > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final Aweme mo67568b(int i) {
        if (!m85548d()) {
            return super.mo67568b(i);
        }
        if (i < 0) {
            return null;
        }
        return (Aweme) mo71593b().get(i % mo71593b().size());
    }

    /* renamed from: a */
    public final C28130ac mo67564a(View view, C28343z<C28318an> zVar, OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams) {
        C7573i.m23587b(baseFeedPageParams, "baseFeedPageParams");
        C26189aa aaVar = new C26189aa(view, zVar, onTouchListener, fragment, baseFeedPageParams, this.f73987c, this.f73989e);
        C28130ac acVar = aaVar;
        mo71586a(acVar);
        return acVar;
    }

    public PoiRankDetailFeedPagerAdapter(Context context, LayoutInflater layoutInflater, int i, C28343z<C28318an> zVar, Fragment fragment, OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams) {
        super(context, layoutInflater, i, zVar, fragment, onTouchListener, baseFeedPageParams);
    }
}
