package com.p280ss.android.ugc.aweme.notification.newstyle;

import android.support.p022v4.widget.SwipeRefreshLayout;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.RecyclerViewOverScrollHelperKt$fixOverScrollWhenInSwipeRefreshLayout$1 */
public final class C34497xeef99e45 extends C1281m {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f89982a;

    /* renamed from: b */
    final /* synthetic */ SwipeRefreshLayout f89983b;

    C34497xeef99e45(RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f89982a = recyclerView;
        this.f89983b = swipeRefreshLayout;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        C1273i layoutManager = this.f89982a.getLayoutManager();
        if (layoutManager != null) {
            C7573i.m23582a((Object) layoutManager, "layoutManager ?: return");
            Boolean bool = null;
            if (layoutManager instanceof LinearLayoutManager) {
                if (((LinearLayoutManager) layoutManager).mo5446k() <= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                bool = Boolean.valueOf(z4);
            } else if (layoutManager instanceof GridLayoutManager) {
                if (((GridLayoutManager) layoutManager).mo5446k() <= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                bool = Boolean.valueOf(z3);
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                int[] b = ((StaggeredGridLayoutManager) layoutManager).mo6010b((int[]) null);
                C7573i.m23582a((Object) b, "firstVisiblePositions");
                int i3 = 0;
                for (int i4 : b) {
                    if (i4 <= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        i3++;
                    }
                }
                if (i3 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
            if (bool != null && (this.f89983b.isEnabled() ^ bool.booleanValue())) {
                if (bool.booleanValue()) {
                    this.f89983b.setEnabled(true);
                } else if (!this.f89983b.mRefreshing) {
                    this.f89983b.setEnabled(false);
                }
            }
        }
    }
}
