package com.p280ss.android.ugc.aweme.filter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.filter.at */
final /* synthetic */ class C29224at implements OnClickListener {

    /* renamed from: a */
    private final FilterViewImpl f77138a;

    C29224at(FilterViewImpl filterViewImpl) {
        this.f77138a = filterViewImpl;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f77138a.mo74750a(view);
    }
}
