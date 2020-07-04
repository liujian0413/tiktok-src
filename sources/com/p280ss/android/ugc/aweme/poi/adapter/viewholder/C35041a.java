package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.a */
final /* synthetic */ class C35041a implements OnClickListener {

    /* renamed from: a */
    private final PoiBannerViewHolder f91638a;

    C35041a(PoiBannerViewHolder poiBannerViewHolder) {
        this.f91638a = poiBannerViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f91638a.mo88787a(view);
    }
}
