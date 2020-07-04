package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.ac */
final /* synthetic */ class C26478ac implements OnClickListener {

    /* renamed from: a */
    private final SearchPoiViewHolder f69846a;

    C26478ac(SearchPoiViewHolder searchPoiViewHolder) {
        this.f69846a = searchPoiViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f69846a.mo68067a(view);
    }
}
