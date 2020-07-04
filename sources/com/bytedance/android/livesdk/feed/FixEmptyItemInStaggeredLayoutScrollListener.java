package com.bytedance.android.livesdk.feed;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.StaggeredGridLayoutManager;

public class FixEmptyItemInStaggeredLayoutScrollListener extends C1281m {

    /* renamed from: a */
    private int[] f17533a;

    /* renamed from: b */
    private int[] f17534b;

    /* renamed from: c */
    private int f17535c;

    public FixEmptyItemInStaggeredLayoutScrollListener(int i) {
        this.f17533a = new int[i];
        this.f17534b = new int[i];
        this.f17535c = i;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        try {
            C1273i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                staggeredGridLayoutManager.mo6009a(this.f17533a);
                if (this.f17533a[0] < this.f17535c) {
                    staggeredGridLayoutManager.mo6013h();
                }
                staggeredGridLayoutManager.mo6011c(this.f17534b);
                if (this.f17534b[0] >= staggeredGridLayoutManager.mo5744A() - this.f17535c) {
                    staggeredGridLayoutManager.mo6013h();
                }
            }
        } catch (Exception unused) {
        }
    }
}
