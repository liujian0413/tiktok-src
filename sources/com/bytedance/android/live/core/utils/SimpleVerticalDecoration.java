package com.bytedance.android.live.core.utils;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.View;

public class SimpleVerticalDecoration extends C1272h {

    /* renamed from: a */
    private final int f10107a;

    /* renamed from: b */
    private final int f10108b;

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int i = this.f10107a / 2;
        int i2 = this.f10107a / 2;
        int bn_ = ((LayoutParams) view.getLayoutParams()).bn_();
        if (bn_ == 0) {
            i = this.f10108b;
        } else if (bn_ == recyclerView.getAdapter().getItemCount() - 1) {
            i2 = this.f10108b;
        }
        rect.set(0, i, 0, i2);
    }
}
