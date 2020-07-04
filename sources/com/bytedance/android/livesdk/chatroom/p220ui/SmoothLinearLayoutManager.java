package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.graphics.PointF;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager */
public class SmoothLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public float f15194a = 25.0f;

    public SmoothLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    /* renamed from: a */
    public final void mo5422a(RecyclerView recyclerView, C1290s sVar, int i) {
        if (i < 0) {
            i = 0;
        }
        C51721 r2 = new LinearSmoothScroller(recyclerView.getContext()) {
            /* renamed from: c */
            public final PointF mo5861c(int i) {
                return SmoothLinearLayoutManager.this.mo5434d(i);
            }

            /* renamed from: a */
            public final float mo5464a(DisplayMetrics displayMetrics) {
                return SmoothLinearLayoutManager.this.f15194a / ((float) displayMetrics.densityDpi);
            }
        };
        r2.f4993g = i;
        mo5755a((C1287r) r2);
    }

    public SmoothLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
