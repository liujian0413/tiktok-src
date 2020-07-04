package com.p280ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.ae */
final /* synthetic */ class C26480ae implements OnClickListener {

    /* renamed from: a */
    private final SearchSugViewHolder f69847a;

    C26480ae(SearchSugViewHolder searchSugViewHolder) {
        this.f69847a = searchSugViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f69847a.mo68091a(view);
    }
}
