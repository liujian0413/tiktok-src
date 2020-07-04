package com.p280ss.android.ugc.aweme.feed.guide;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.b */
final /* synthetic */ class C28387b implements OnClickListener {

    /* renamed from: a */
    private final EmptyGuideV2 f74833a;

    C28387b(EmptyGuideV2 emptyGuideV2) {
        this.f74833a = emptyGuideV2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f74833a.mo72044c(view);
    }
}
