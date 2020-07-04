package com.p280ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1287r.C1288a;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.DisplayMetrics;
import android.view.View;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.SpeedyLinearLayoutManager$smoothScrollToPosition$1 */
public final class SpeedyLinearLayoutManager$smoothScrollToPosition$1 extends LinearSmoothScroller {

    /* renamed from: f */
    final /* synthetic */ RecyclerView f101900f;

    /* renamed from: b */
    public final int mo5471b() {
        return -1;
    }

    /* renamed from: a */
    public final float mo5464a(DisplayMetrics displayMetrics) {
        C7573i.m23587b(displayMetrics, "displayMetrics");
        return 440.0f / ((float) displayMetrics.densityDpi);
    }

    SpeedyLinearLayoutManager$smoothScrollToPosition$1(RecyclerView recyclerView, Context context) {
        this.f101900f = recyclerView;
        super(context);
    }

    /* renamed from: a */
    public final void mo5470a(View view, C1290s sVar, C1288a aVar) {
        C7573i.m23587b(view, "targetView");
        C7573i.m23587b(sVar, "state");
        C7573i.m23587b(aVar, "action");
        int a = mo5467a(view, mo5471b());
        int b = mo5472b(a);
        if (b > 0) {
            aVar.mo5864a(-a, 0, b, this.f4783a);
        }
    }
}
