package com.bytedance.android.live.core.utils;

import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.StaggeredGridLayoutManager;

/* renamed from: com.bytedance.android.live.core.utils.ab */
public final class C3357ab {
    /* renamed from: a */
    public static void m12509a(RecyclerView recyclerView, int i) {
        if (i >= 0) {
            C1273i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).mo5417a(i, 0);
                return;
            }
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) layoutManager).mo5417a(i, 0);
            }
        }
    }
}
