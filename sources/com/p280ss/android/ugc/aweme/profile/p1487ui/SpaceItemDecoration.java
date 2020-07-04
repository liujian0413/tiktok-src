package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.SpaceItemDecoration */
public class SpaceItemDecoration extends C1272h {

    /* renamed from: a */
    private int f95249a;

    public SpaceItemDecoration(int i) {
        this.f95249a = i;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        if (recyclerView.mo5571e(view) > 1) {
            rect.top = this.f95249a;
        }
    }
}
