package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.discover.model.HotVideoItem;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.m */
final /* synthetic */ class C26493m implements OnClickListener {

    /* renamed from: a */
    private final HotVideoItemViewHolder f69869a;

    /* renamed from: b */
    private final int f69870b;

    /* renamed from: c */
    private final HotVideoItem f69871c;

    C26493m(HotVideoItemViewHolder hotVideoItemViewHolder, int i, HotVideoItem hotVideoItem) {
        this.f69869a = hotVideoItemViewHolder;
        this.f69870b = i;
        this.f69871c = hotVideoItem;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f69869a.mo67973a(this.f69870b, this.f69871c, view);
    }
}
