package com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.graphics.PointF;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.MVLinearLayoutManager */
public class MVLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public float f101751a = 5.0f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.MVLinearLayoutManager$a */
    class C39241a extends LinearSmoothScroller {
        /* renamed from: c */
        public final PointF mo5861c(int i) {
            return MVLinearLayoutManager.this.mo5434d(i);
        }

        /* renamed from: a */
        public final float mo5464a(DisplayMetrics displayMetrics) {
            return MVLinearLayoutManager.this.f101751a / ((float) displayMetrics.densityDpi);
        }

        public C39241a(Context context) {
            super(context);
        }
    }

    public MVLinearLayoutManager(Context context, int i, boolean z) {
        super(context, 0, false);
    }

    /* renamed from: a */
    public final void mo5422a(RecyclerView recyclerView, C1290s sVar, int i) {
        C39241a aVar = new C39241a(recyclerView.getContext());
        aVar.f4993g = i;
        mo5755a((C1287r) aVar);
    }

    public MVLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
