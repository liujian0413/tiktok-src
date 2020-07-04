package com.p280ss.android.ugc.aweme.discover.jedi.adapter;

import android.graphics.Rect;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import com.p280ss.android.ugc.aweme.base.widget.RecyclerHeaderViewAdapter;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.adapter.SearchGridSpacingItemDecoration */
public class SearchGridSpacingItemDecoration extends C1272h {

    /* renamed from: a */
    private int f70418a = 2;

    /* renamed from: b */
    private int f70419b;

    /* renamed from: c */
    private boolean f70420c;

    public SearchGridSpacingItemDecoration(int i, int i2, boolean z) {
        this.f70419b = i2;
        this.f70420c = false;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int f = RecyclerView.m5892f(view);
        C1262a adapter = recyclerView.getAdapter();
        if ((adapter instanceof RecyclerHeaderViewAdapter) && ((RecyclerHeaderViewAdapter) adapter).f62015c != null) {
            if (f != 0) {
                f++;
            } else {
                return;
            }
        }
        int a = ((GridLayoutManager) recyclerView.getLayoutManager()).f4721g.mo5387a(f, this.f70418a);
        if (this.f70420c) {
            int i = this.f70419b;
            rect.left = i - ((a * i) / this.f70418a);
            rect.right = ((a + 1) * this.f70419b) / this.f70418a;
            if (f < this.f70418a) {
                rect.top = this.f70419b;
            }
            rect.bottom = this.f70419b;
            return;
        }
        rect.left = (this.f70419b * a) / this.f70418a;
        rect.right = this.f70419b - (((a + 1) * this.f70419b) / this.f70418a);
        if (f >= this.f70418a) {
            rect.top = this.f70419b;
        }
    }
}
