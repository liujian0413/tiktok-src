package com.bytedance.android.livesdk.feed.p367ui;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.bytedance.android.live.core.utils.C3358ac;

/* renamed from: com.bytedance.android.livesdk.feed.ui.FeedItemDecoration2 */
public class FeedItemDecoration2 extends C1272h {
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int i;
        boolean z;
        if (view.getVisibility() == 0) {
            i = C3358ac.m12510a(1.5f);
        } else {
            i = 0;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            z = ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f5145b;
        } else {
            z = false;
        }
        if (z) {
            i = C3358ac.m12510a(1.0f);
        }
        int a = C3358ac.m12510a(1.5f);
        rect.set(a, i, a, 0);
    }
}
