package com.p280ss.android.ugc.aweme.filter.base;

import android.content.Context;
import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import com.p280ss.android.ugc.aweme.tools.C42160b;

/* renamed from: com.ss.android.ugc.aweme.filter.base.SpaceItemDecoration */
public class SpaceItemDecoration extends C1272h {

    /* renamed from: a */
    private final boolean f77158a;

    /* renamed from: b */
    private int f77159b;

    public SpaceItemDecoration(Context context, int i) {
        this.f77159b = i;
        this.f77158a = C42160b.m134123a(context);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        if (!this.f77158a) {
            rect.right = this.f77159b;
        } else {
            rect.left = this.f77159b;
        }
        if (RecyclerView.m5892f(view) == 0) {
            if (!this.f77158a) {
                rect.left = this.f77159b;
                return;
            }
            rect.right = this.f77159b;
        }
    }
}
