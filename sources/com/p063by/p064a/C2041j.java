package com.p063by.p064a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C1444a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p063by.inflate_lib.C2058a;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.common.widget.DiggLayout;
import com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p280ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.j */
public final class C2041j implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        FeedSwipeRefreshLayout feedSwipeRefreshLayout = new FeedSwipeRefreshLayout(context);
        LayoutParams a = C1444a.m7241a(viewGroup, -1, -1);
        feedSwipeRefreshLayout.setId(R.id.cr7);
        feedSwipeRefreshLayout.setKeepScreenOn(true);
        if (viewGroup != null) {
            feedSwipeRefreshLayout.setLayoutParams(a);
            if (z) {
                viewGroup.addView(feedSwipeRefreshLayout);
            }
        }
        LoadMoreFrameLayout loadMoreFrameLayout = new LoadMoreFrameLayout(context);
        MarginLayoutParams a2 = C1444a.m7241a(feedSwipeRefreshLayout, -1, -1);
        loadMoreFrameLayout.setId(R.id.bua);
        loadMoreFrameLayout.setLayoutParams(a2);
        if (loadMoreFrameLayout.getParent() == null) {
            feedSwipeRefreshLayout.addView(loadMoreFrameLayout);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        MarginLayoutParams a3 = C1444a.m7241a(loadMoreFrameLayout, -1, -1);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(a3);
        if (linearLayout.getParent() == null) {
            loadMoreFrameLayout.addView(linearLayout);
        }
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        view.setBackgroundColor(resources.getColor(R.color.l3));
        view.setId(R.id.dmr);
        view.setLayoutParams(layoutParams);
        if (view.getParent() == null) {
            linearLayout.addView(view);
        }
        VerticalViewPager verticalViewPager = new VerticalViewPager(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        verticalViewPager.setId(R.id.edp);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 48;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.weight = 1.0f;
        }
        verticalViewPager.setLayoutParams(layoutParams2);
        if (verticalViewPager.getParent() == null) {
            linearLayout.addView(verticalViewPager);
        }
        View view2 = new View(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        view2.setBackgroundColor(resources.getColor(R.color.l3));
        view2.setId(R.id.ob);
        view2.setLayoutParams(layoutParams3);
        if (view2.getParent() == null) {
            linearLayout.addView(view2);
        }
        ViewStub viewStub = new ViewStub(context);
        MarginLayoutParams a4 = C1444a.m7241a(loadMoreFrameLayout, -1, -1);
        viewStub.setLayoutResource(R.layout.fs);
        viewStub.setId(R.id.fb);
        viewStub.setInflatedId(R.id.fa);
        viewStub.setLayoutParams(a4);
        if (viewStub.getParent() == null) {
            loadMoreFrameLayout.addView(viewStub);
        }
        View a5 = C2058a.m9123a(context, R.layout.o5, loadMoreFrameLayout, false, 0);
        if (!(a5 == null || a5 == loadMoreFrameLayout)) {
            a5.setLayoutParams(C1444a.m7241a(loadMoreFrameLayout, -1, -2));
            if (a5.getParent() == null) {
                loadMoreFrameLayout.addView(a5);
            }
        }
        DiggLayout diggLayout = new DiggLayout(context);
        MarginLayoutParams a6 = C1444a.m7241a(loadMoreFrameLayout, -1, -1);
        diggLayout.setId(R.id.a8y);
        if (RelativeLayout.LayoutParams.class.isInstance(a6)) {
            ((RelativeLayout.LayoutParams) a6).addRule(13, -1);
        }
        diggLayout.setLayoutParams(a6);
        if (diggLayout.getParent() == null) {
            loadMoreFrameLayout.addView(diggLayout);
        }
        C1444a.m7242a(feedSwipeRefreshLayout);
        C1444a.m7242a(loadMoreFrameLayout);
        C1444a.m7242a(linearLayout);
        C1444a.m7242a(view);
        C1444a.m7242a(verticalViewPager);
        C1444a.m7242a(view2);
        C1444a.m7242a(viewStub);
        C1444a.m7242a(a5);
        C1444a.m7242a(diggLayout);
        return feedSwipeRefreshLayout;
    }
}
