package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.GridSpacingItemDecoration */
public class GridSpacingItemDecoration extends C1272h {

    /* renamed from: a */
    private int f83545a = 4;

    /* renamed from: b */
    private int f83546b;

    /* renamed from: c */
    private boolean f83547c;

    public GridSpacingItemDecoration(int i, int i2, boolean z) {
        this.f83546b = i2;
        this.f83547c = false;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int f = RecyclerView.m5892f(view);
        int i = f % this.f83545a;
        if (this.f83547c) {
            int i2 = this.f83546b;
            rect.left = i2 - ((i * i2) / this.f83545a);
            rect.right = ((i + 1) * this.f83546b) / this.f83545a;
            if (f < this.f83545a) {
                rect.top = this.f83546b;
            }
            rect.bottom = this.f83546b;
            return;
        }
        rect.left = (this.f83546b * i) / this.f83545a;
        rect.right = this.f83546b - (((i + 1) * this.f83546b) / this.f83545a);
        if (f >= this.f83545a) {
            rect.top = this.f83546b;
        }
    }
}
