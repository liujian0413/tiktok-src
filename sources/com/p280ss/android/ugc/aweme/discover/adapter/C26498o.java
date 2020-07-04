package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.o */
final /* synthetic */ class C26498o implements OnClickListener {

    /* renamed from: a */
    private final HotVideoViewHolder f69896a;

    C26498o(HotVideoViewHolder hotVideoViewHolder) {
        this.f69896a = hotVideoViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f69896a.mo67976a(view);
    }
}
