package com.p280ss.android.ugc.aweme.feed.guide;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.c */
final /* synthetic */ class C28388c implements OnClickListener {

    /* renamed from: a */
    private final EmptyGuideV2 f74834a;

    C28388c(EmptyGuideV2 emptyGuideV2) {
        this.f74834a = emptyGuideV2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f74834a.mo72041b(view);
    }
}
