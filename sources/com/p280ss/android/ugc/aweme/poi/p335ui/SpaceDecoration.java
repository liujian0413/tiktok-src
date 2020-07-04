package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.SpaceDecoration */
public class SpaceDecoration extends C1272h {

    /* renamed from: a */
    private int f92460a;

    /* renamed from: b */
    private int f92461b;

    public SpaceDecoration(int i) {
        this.f92460a = i;
        this.f92461b = this.f92460a / 8;
    }

    public SpaceDecoration(int i, int i2) {
        this.f92460a = i;
        this.f92461b = i2 / 2;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int f = RecyclerView.m5892f(view);
        if (f == 0) {
            rect.left = this.f92460a;
        } else {
            rect.left = this.f92461b;
        }
        if (f == recyclerView.getAdapter().getItemCount() - 1) {
            rect.right = this.f92460a;
        } else {
            rect.right = this.f92461b;
        }
    }
}
