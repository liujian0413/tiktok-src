package com.p280ss.android.ugc.aweme.feed.listener;

import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1279k;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.feed.listener.OnRecyclerViewFlingListener */
public class OnRecyclerViewFlingListener extends C1279k {

    /* renamed from: a */
    RecyclerView f75141a;

    /* renamed from: b */
    private C28532n f75142b;

    /* renamed from: c */
    private boolean f75143c = true;

    /* renamed from: d */
    private int[] f75144d;

    /* renamed from: e */
    private int[] f75145e;

    /* renamed from: f */
    private int f75146f = -1;

    /* renamed from: a */
    private void m93724a() {
        if (this.f75142b.aR_()) {
            this.f75142b.aP_();
        } else {
            this.f75142b.mo59100a(false);
        }
    }

    public OnRecyclerViewFlingListener(RecyclerView recyclerView, C28532n nVar) {
        this.f75141a = recyclerView;
        this.f75142b = nVar;
    }

    /* renamed from: a */
    public final boolean mo5816a(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (!this.f75143c) {
            return false;
        }
        C1273i layoutManager = this.f75141a.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            i4 = gridLayoutManager.mo5445j();
            i3 = gridLayoutManager.mo5447l();
            if (this.f75146f == -1) {
                this.f75146f = gridLayoutManager.f4716b;
            }
        } else if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            i4 = linearLayoutManager.mo5445j();
            i3 = linearLayoutManager.mo5447l();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            if (this.f75146f == -1) {
                this.f75146f = staggeredGridLayoutManager.f5123a;
            }
            if (this.f75144d == null) {
                this.f75144d = new int[staggeredGridLayoutManager.f5123a];
            }
            if (this.f75145e == null) {
                this.f75145e = new int[staggeredGridLayoutManager.f5123a];
            }
            staggeredGridLayoutManager.mo6009a(this.f75144d);
            staggeredGridLayoutManager.mo6011c(this.f75145e);
            i4 = this.f75144d[0];
            i3 = this.f75145e[this.f75145e.length - 1];
        } else {
            throw new RuntimeException("Unsupported LayoutManager used. Valid ones are LinearLayoutManager, GridLayoutManager and StaggeredGridLayoutManager");
        }
        int s = layoutManager.mo5800s();
        int A = layoutManager.mo5744A();
        if (s > 0) {
            View c = layoutManager.mo5432c(i4);
            if (c != null) {
                i5 = c.getHeight();
            } else {
                i5 = 0;
            }
            if (i5 == 0) {
                return false;
            }
            if (this.f75146f != -1) {
                if ((i2 / i5) + (i3 / this.f75146f) + 3 >= A / this.f75146f) {
                    m93724a();
                }
            } else if ((i2 / i5) + i3 >= A - 2) {
                m93724a();
            }
        }
        return false;
    }
}
