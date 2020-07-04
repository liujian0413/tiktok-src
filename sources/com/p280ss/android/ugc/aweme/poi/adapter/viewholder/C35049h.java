package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.h */
final /* synthetic */ class C35049h implements OnClickListener {

    /* renamed from: a */
    private final PoiOptimizedDetailViewHolder f91658a;

    C35049h(PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder) {
        this.f91658a = poiOptimizedDetailViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f91658a.mo88823f(view);
    }
}
