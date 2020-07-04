package com.p280ss.android.ugc.aweme.tools.draft;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.h */
final /* synthetic */ class C42291h implements OnClickListener {

    /* renamed from: a */
    private final DraftBoxFragment f110046a;

    C42291h(DraftBoxFragment draftBoxFragment) {
        this.f110046a = draftBoxFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f110046a.mo103742b(view);
    }
}
