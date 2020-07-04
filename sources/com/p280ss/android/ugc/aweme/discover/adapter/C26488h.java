package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.h */
final /* synthetic */ class C26488h implements OnClickListener {

    /* renamed from: a */
    private final HotSearchImageViewHolder f69863a;

    C26488h(HotSearchImageViewHolder hotSearchImageViewHolder) {
        this.f69863a = hotSearchImageViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f69863a.mo67964a(view);
    }
}
