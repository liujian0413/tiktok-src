package com.p280ss.android.ugc.aweme.profile.adapter;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.DateStoryDecoration */
public final class DateStoryDecoration extends C1272h {

    /* renamed from: a */
    private int f93551a;

    /* renamed from: b */
    private int f93552b;

    /* renamed from: c */
    private int[] f93553c;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        if (this.f93553c != null) {
            int f = RecyclerView.m5892f(view);
            if (f != -1 && f < this.f93553c.length) {
                int i = this.f93553c[f];
                if (i == -1) {
                    rect.set(0, 0, 0, 0);
                    return;
                }
                rect.left = (this.f93552b * i) / this.f93551a;
                rect.right = this.f93552b - (((i + 1) * this.f93552b) / this.f93551a);
                rect.top = this.f93552b;
            }
        }
    }
}
