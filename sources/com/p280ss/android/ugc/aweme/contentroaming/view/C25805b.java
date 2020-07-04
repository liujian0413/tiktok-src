package com.p280ss.android.ugc.aweme.contentroaming.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.contentroaming.view.b */
final /* synthetic */ class C25805b implements OnClickListener {

    /* renamed from: a */
    private final ContentRoamingViewHolder f68230a;

    C25805b(ContentRoamingViewHolder contentRoamingViewHolder) {
        this.f68230a = contentRoamingViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f68230a.mo67068b(view);
    }
}
