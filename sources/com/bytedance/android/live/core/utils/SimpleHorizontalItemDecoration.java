package com.bytedance.android.live.core.utils;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.View;

public class SimpleHorizontalItemDecoration extends C1272h {

    /* renamed from: a */
    private final int f10105a;

    /* renamed from: b */
    private final int f10106b;

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int i = this.f10105a / 2;
        int i2 = this.f10105a / 2;
        int bn_ = ((LayoutParams) view.getLayoutParams()).bn_();
        if (bn_ == 0) {
            i = this.f10106b;
        } else if (bn_ == recyclerView.getAdapter().getItemCount() - 1) {
            i2 = this.f10106b;
        }
        rect.set(i, 0, i2, 0);
    }
}
