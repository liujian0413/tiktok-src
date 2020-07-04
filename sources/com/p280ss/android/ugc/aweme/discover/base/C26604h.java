package com.p280ss.android.ugc.aweme.discover.base;

import android.support.design.widget.AppBarLayout;
import android.support.p029v7.widget.RecyclerView;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.base.h */
public final class C26604h {

    /* renamed from: a */
    public final SwipeRefreshLayout f70160a;

    /* renamed from: b */
    public final RecyclerView f70161b;

    /* renamed from: c */
    public final AppBarLayout f70162c;

    public C26604h(SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView, AppBarLayout appBarLayout) {
        C7573i.m23587b(swipeRefreshLayout, "refreshLayout");
        C7573i.m23587b(recyclerView, "recyclerView");
        C7573i.m23587b(appBarLayout, "appBarLayout");
        this.f70160a = swipeRefreshLayout;
        this.f70161b = recyclerView;
        this.f70162c = appBarLayout;
    }
}
