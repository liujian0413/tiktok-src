package com.p280ss.android.ugc.aweme.discover.mixfeed;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.StaggeredGridSpacingItemDecoration */
public class StaggeredGridSpacingItemDecoration extends C1272h {

    /* renamed from: a */
    public int f70473a;

    /* renamed from: b */
    private int f70474b;

    /* renamed from: c */
    private int f70475c;

    public StaggeredGridSpacingItemDecoration(int i, int i2, int i3) {
        this.f70474b = i;
        this.f70475c = i2;
        this.f70473a = i3;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        rect.right = this.f70474b;
        if (RecyclerView.m5892f(view) < this.f70473a) {
            rect.left = this.f70475c;
        }
    }
}
