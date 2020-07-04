package com.p280ss.android.ugc.aweme.effect;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.effect.ae */
final /* synthetic */ class C27377ae implements OnClickListener {

    /* renamed from: a */
    private final C27446w f72254a;

    C27377ae(C27446w wVar) {
        this.f72254a = wVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f72254a.mo70587c(view);
    }
}
