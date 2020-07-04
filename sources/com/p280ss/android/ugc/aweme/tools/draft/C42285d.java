package com.p280ss.android.ugc.aweme.tools.draft;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.d */
final /* synthetic */ class C42285d implements OnClickListener {

    /* renamed from: a */
    private final AwemeDraftViewHolder f110040a;

    C42285d(AwemeDraftViewHolder awemeDraftViewHolder) {
        this.f110040a = awemeDraftViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f110040a.mo103733b(view);
    }
}
