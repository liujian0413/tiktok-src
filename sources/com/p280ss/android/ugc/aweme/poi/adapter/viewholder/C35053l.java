package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.l */
final /* synthetic */ class C35053l implements OnClickListener {

    /* renamed from: a */
    private final PoiOptimizedDetailViewHolder f91662a;

    C35053l(PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder) {
        this.f91662a = poiOptimizedDetailViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f91662a.mo88816b(view);
    }
}
