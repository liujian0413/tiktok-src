package com.p280ss.android.ugc.aweme.tools.draft;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.i */
final /* synthetic */ class C42292i implements OnClickListener {

    /* renamed from: a */
    private final DraftBoxFragment f110047a;

    C42292i(DraftBoxFragment draftBoxFragment) {
        this.f110047a = draftBoxFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f110047a.mo103740a(view);
    }
}
