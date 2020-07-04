package com.p280ss.android.ugc.aweme.feed.guide;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.d */
final /* synthetic */ class C28389d implements OnClickListener {

    /* renamed from: a */
    private final EmptyGuideV2 f74835a;

    C28389d(EmptyGuideV2 emptyGuideV2) {
        this.f74835a = emptyGuideV2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f74835a.mo72033a(view);
    }
}
