package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.graphics.Rect;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.GridLayoutManager.C1241a;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.DetailDecoration */
public final class DetailDecoration extends C1272h {

    /* renamed from: a */
    private final int f62619a;

    private DetailDecoration(int i) {
        this.f62619a = i;
    }

    public DetailDecoration(int i, int i2) {
        this(i);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        C7573i.m23587b(rect, "outRect");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(recyclerView, "parent");
        C7573i.m23587b(sVar, "state");
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            layoutManager = null;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        if (gridLayoutManager != null) {
            C1241a aVar = gridLayoutManager.f4721g;
            if (aVar != null) {
                int f = RecyclerView.m5892f(view);
                int i = gridLayoutManager.f4716b;
                if (aVar.mo5386a(f) == 1) {
                    int a = aVar.mo5387a(f, i);
                    rect.left = (this.f62619a * a) / i;
                    rect.right = this.f62619a - (((a + 1) * this.f62619a) / i);
                    if (aVar.mo5390c(f, i) > 0) {
                        rect.top = this.f62619a;
                    }
                }
            }
        }
    }
}
