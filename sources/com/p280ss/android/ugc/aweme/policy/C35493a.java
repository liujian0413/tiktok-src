package com.p280ss.android.ugc.aweme.policy;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.policy.a */
final /* synthetic */ class C35493a implements OnClickListener {

    /* renamed from: a */
    private final PolicyDialog f93142a;

    C35493a(PolicyDialog policyDialog) {
        this.f93142a = policyDialog;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f93142a.mo90291a(view);
    }
}
