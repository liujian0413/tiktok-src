package com.p280ss.android.ugc.aweme.filter;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

/* renamed from: com.ss.android.ugc.aweme.filter.CenterLayoutManager */
public class CenterLayoutManager extends LinearLayoutManager {

    /* renamed from: com.ss.android.ugc.aweme.filter.CenterLayoutManager$a */
    static class C29140a extends LinearSmoothScroller {
        C29140a(Context context) {
            super(context);
        }

        /* renamed from: a */
        public final float mo5464a(DisplayMetrics displayMetrics) {
            return 200.0f / ((float) displayMetrics.densityDpi);
        }

        /* renamed from: a */
        public final int mo5466a(int i, int i2, int i3, int i4, int i5) {
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }
    }

    public CenterLayoutManager(Context context, int i, boolean z) {
        super(context, 0, false);
    }

    /* renamed from: a */
    public final void mo5422a(RecyclerView recyclerView, C1290s sVar, int i) {
        C29140a aVar = new C29140a(recyclerView.getContext());
        aVar.f4993g = i;
        mo5755a((C1287r) aVar);
    }

    public CenterLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
