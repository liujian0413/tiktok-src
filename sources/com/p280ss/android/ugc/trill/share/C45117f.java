package com.p280ss.android.ugc.trill.share;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.trill.share.f */
final /* synthetic */ class C45117f implements OnClickListener {

    /* renamed from: a */
    private final SyncShareView f115957a;

    C45117f(SyncShareView syncShareView) {
        this.f115957a = syncShareView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f115957a.mo107619b(view);
    }
}
