package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.i */
final /* synthetic */ class C35050i implements OnClickListener {

    /* renamed from: a */
    private final PoiOptimizedDetailViewHolder f91659a;

    C35050i(PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder) {
        this.f91659a = poiOptimizedDetailViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f91659a.mo88822e(view);
    }
}
