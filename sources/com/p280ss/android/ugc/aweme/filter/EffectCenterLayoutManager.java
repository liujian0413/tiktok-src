package com.p280ss.android.ugc.aweme.filter;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.bytedance.common.utility.C9738o;

/* renamed from: com.ss.android.ugc.aweme.filter.EffectCenterLayoutManager */
public class EffectCenterLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    private C1287r f76904a;

    /* renamed from: b */
    private Context f76905b;

    /* renamed from: com.ss.android.ugc.aweme.filter.EffectCenterLayoutManager$a */
    static class C29143a extends LinearSmoothScroller {
        C29143a(Context context) {
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

    /* renamed from: e */
    public final void mo5437e(int i) {
        mo5417a(i, (int) (((float) (this.f4957I / 2)) - C9738o.m28708b(this.f76905b, 45.0f)));
    }

    public EffectCenterLayoutManager(Context context, int i, boolean z) {
        super(context, 0, false);
        this.f76905b = context;
    }

    /* renamed from: a */
    public final void mo5422a(RecyclerView recyclerView, C1290s sVar, int i) {
        if (this.f76904a == null) {
            this.f76904a = new C29143a(recyclerView.getContext());
        }
        this.f76904a.f4993g = i;
        mo5755a(this.f76904a);
    }

    public EffectCenterLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f76905b = context;
    }
}
