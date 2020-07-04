package com.p280ss.android.ugc.trill.share;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.trill.share.e */
final /* synthetic */ class C45116e implements OnClickListener {

    /* renamed from: a */
    private final SyncShareView f115956a;

    C45116e(SyncShareView syncShareView) {
        this.f115956a = syncShareView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f115956a.mo107620c(view);
    }
}
