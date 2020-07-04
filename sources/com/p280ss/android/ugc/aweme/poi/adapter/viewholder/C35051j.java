package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.j */
final /* synthetic */ class C35051j implements OnClickListener {

    /* renamed from: a */
    private final PoiOptimizedDetailViewHolder f91660a;

    C35051j(PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder) {
        this.f91660a = poiOptimizedDetailViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f91660a.mo88820d(view);
    }
}
