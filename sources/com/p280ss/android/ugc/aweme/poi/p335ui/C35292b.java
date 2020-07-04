package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.b */
final /* synthetic */ class C35292b implements OnClickListener {

    /* renamed from: a */
    private final AbsPoiAwemeFeedFragment f92505a;

    C35292b(AbsPoiAwemeFeedFragment absPoiAwemeFeedFragment) {
        this.f92505a = absPoiAwemeFeedFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f92505a.mo89723a(view);
    }
}
