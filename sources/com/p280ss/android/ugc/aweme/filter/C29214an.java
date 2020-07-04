package com.p280ss.android.ugc.aweme.filter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.filter.an */
final /* synthetic */ class C29214an implements OnClickListener {

    /* renamed from: a */
    private final FilterScrollerModule f77120a;

    C29214an(FilterScrollerModule filterScrollerModule) {
        this.f77120a = filterScrollerModule;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f77120a.mo74732a(view);
    }
}
