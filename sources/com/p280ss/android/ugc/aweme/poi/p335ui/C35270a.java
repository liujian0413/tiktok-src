package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.a */
final /* synthetic */ class C35270a implements OnClickListener {

    /* renamed from: a */
    private final AbsPoiAwemeFeedFragment f92462a;

    C35270a(AbsPoiAwemeFeedFragment absPoiAwemeFeedFragment) {
        this.f92462a = absPoiAwemeFeedFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f92462a.mo89730b(view);
    }
}
