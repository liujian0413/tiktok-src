package com.p280ss.android.ugc.aweme.filter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.filter.ai */
final /* synthetic */ class C29209ai implements OnClickListener {

    /* renamed from: a */
    private final FilterScrollerModule f77114a;

    C29209ai(FilterScrollerModule filterScrollerModule) {
        this.f77114a = filterScrollerModule;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f77114a.mo74738b(view);
    }
}
