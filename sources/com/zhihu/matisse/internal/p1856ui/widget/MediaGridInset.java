package com.zhihu.matisse.internal.p1856ui.widget;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;

/* renamed from: com.zhihu.matisse.internal.ui.widget.MediaGridInset */
public class MediaGridInset extends C1272h {

    /* renamed from: a */
    private int f121560a;

    /* renamed from: b */
    private int f121561b;

    /* renamed from: c */
    private boolean f121562c = false;

    public MediaGridInset(int i, int i2, boolean z) {
        this.f121560a = i;
        this.f121561b = i2;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int f = RecyclerView.m5892f(view);
        int i = f % this.f121560a;
        if (this.f121562c) {
            int i2 = this.f121561b;
            rect.left = i2 - ((i * i2) / this.f121560a);
            rect.right = ((i + 1) * this.f121561b) / this.f121560a;
            if (f < this.f121560a) {
                rect.top = this.f121561b;
            }
            rect.bottom = this.f121561b;
            return;
        }
        rect.left = (this.f121561b * i) / this.f121560a;
        rect.right = this.f121561b - (((i + 1) * this.f121561b) / this.f121560a);
        if (f >= this.f121560a) {
            rect.top = this.f121561b;
        }
    }
}
