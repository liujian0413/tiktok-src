package com.p280ss.android.ugc.aweme.contentroaming.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.contentroaming.view.c */
final /* synthetic */ class C25806c implements OnClickListener {

    /* renamed from: a */
    private final ContentRoamingViewHolder f68231a;

    C25806c(ContentRoamingViewHolder contentRoamingViewHolder) {
        this.f68231a = contentRoamingViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f68231a.mo67065a(view);
    }
}
