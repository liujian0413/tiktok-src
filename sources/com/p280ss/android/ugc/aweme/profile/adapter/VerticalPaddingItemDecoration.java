package com.p280ss.android.ugc.aweme.profile.adapter;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.VerticalPaddingItemDecoration */
public class VerticalPaddingItemDecoration extends C1272h {

    /* renamed from: a */
    private int f93651a;

    /* renamed from: b */
    private int f93652b;

    /* renamed from: c */
    private int f93653c;

    /* renamed from: d */
    private int f93654d;

    /* renamed from: e */
    private int f93655e;

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int f = RecyclerView.m5892f(view);
        if (f == 0) {
            rect.set(this.f93651a, this.f93653c, this.f93652b, this.f93655e / 2);
        } else if (f == recyclerView.getAdapter().getItemCount() - 1) {
            rect.set(this.f93651a, this.f93655e / 2, this.f93652b, this.f93654d);
        } else {
            rect.set(this.f93651a, this.f93655e / 2, this.f93652b, this.f93655e / 2);
        }
    }

    public VerticalPaddingItemDecoration(int i, int i2, int i3, int i4, int i5) {
        this.f93651a = i;
        this.f93653c = i2;
        this.f93652b = i3;
        this.f93654d = i4;
        this.f93655e = i5;
    }
}
