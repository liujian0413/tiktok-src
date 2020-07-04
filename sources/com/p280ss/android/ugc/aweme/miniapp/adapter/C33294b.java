package com.p280ss.android.ugc.aweme.miniapp.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.miniapp.adapter.b */
final /* synthetic */ class C33294b implements OnClickListener {

    /* renamed from: a */
    private final MostUseMicroAppViewHolder f86964a;

    C33294b(MostUseMicroAppViewHolder mostUseMicroAppViewHolder) {
        this.f86964a = mostUseMicroAppViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f86964a.mo85408a(view);
    }
}
