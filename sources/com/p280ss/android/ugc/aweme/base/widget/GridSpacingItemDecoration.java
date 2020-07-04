package com.p280ss.android.ugc.aweme.base.widget;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import com.p280ss.android.ugc.aweme.shortvideo.widget.baseadapter.HeaderAndFooterWrapper;

/* renamed from: com.ss.android.ugc.aweme.base.widget.GridSpacingItemDecoration */
public class GridSpacingItemDecoration extends C1272h {

    /* renamed from: a */
    private int f62009a;

    /* renamed from: b */
    private int f62010b;

    /* renamed from: c */
    private boolean f62011c = false;

    public GridSpacingItemDecoration(int i, int i2, boolean z) {
        this.f62009a = i;
        this.f62010b = i2;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int f = RecyclerView.m5892f(view);
        C1262a adapter = recyclerView.getAdapter();
        if (adapter instanceof RecyclerHeaderViewAdapter) {
            if (((RecyclerHeaderViewAdapter) adapter).f62015c != null) {
                if (f != 0) {
                    f++;
                } else {
                    return;
                }
            }
        } else if (adapter instanceof HeaderAndFooterWrapper) {
            int b = ((HeaderAndFooterWrapper) adapter).f108503a.mo3435b();
            if (f >= b) {
                f += b;
            } else {
                return;
            }
        }
        int i = f % this.f62009a;
        if (this.f62011c) {
            int i2 = this.f62010b;
            rect.left = i2 - ((i * i2) / this.f62009a);
            rect.right = ((i + 1) * this.f62010b) / this.f62009a;
            if (f < this.f62009a) {
                rect.top = this.f62010b;
            }
            rect.bottom = this.f62010b;
            return;
        }
        rect.left = (this.f62010b * i) / this.f62009a;
        rect.right = this.f62010b - (((i + 1) * this.f62010b) / this.f62009a);
        if (f >= this.f62009a) {
            rect.top = this.f62010b;
        }
    }
}
