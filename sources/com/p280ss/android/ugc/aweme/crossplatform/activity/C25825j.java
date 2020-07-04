package com.p280ss.android.ugc.aweme.crossplatform.activity;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.j */
final /* synthetic */ class C25825j implements OnClickListener {

    /* renamed from: a */
    private final C25824i f68295a;

    C25825j(C25824i iVar) {
        this.f68295a = iVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f68295a.mo67141a(view);
    }
}
