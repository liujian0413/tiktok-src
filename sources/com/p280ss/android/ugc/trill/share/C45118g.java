package com.p280ss.android.ugc.trill.share;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.trill.share.g */
final /* synthetic */ class C45118g implements OnClickListener {

    /* renamed from: a */
    private final SyncShareView f115958a;

    C45118g(SyncShareView syncShareView) {
        this.f115958a = syncShareView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f115958a.mo107616a(view);
    }
}
