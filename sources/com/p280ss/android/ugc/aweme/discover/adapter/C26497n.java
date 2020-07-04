package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.n */
final /* synthetic */ class C26497n implements OnClickListener {

    /* renamed from: a */
    private final HotVideoViewHolder f69895a;

    C26497n(HotVideoViewHolder hotVideoViewHolder) {
        this.f69895a = hotVideoViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f69895a.mo67979b(view);
    }
}
