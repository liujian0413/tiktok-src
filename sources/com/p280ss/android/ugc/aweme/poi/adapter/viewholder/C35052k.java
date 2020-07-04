package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.k */
final /* synthetic */ class C35052k implements OnClickListener {

    /* renamed from: a */
    private final PoiOptimizedDetailViewHolder f91661a;

    C35052k(PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder) {
        this.f91661a = poiOptimizedDetailViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f91661a.mo88818c(view);
    }
}
