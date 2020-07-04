package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.poi.model.PoiProductInfo;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.b */
final /* synthetic */ class C35042b implements OnClickListener {

    /* renamed from: a */
    private final PoiDcdProductInfoViewHolder f91639a;

    /* renamed from: b */
    private final PoiProductInfo f91640b;

    C35042b(PoiDcdProductInfoViewHolder poiDcdProductInfoViewHolder, PoiProductInfo poiProductInfo) {
        this.f91639a = poiDcdProductInfoViewHolder;
        this.f91640b = poiProductInfo;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f91639a.mo88797a(this.f91640b, view);
    }
}
