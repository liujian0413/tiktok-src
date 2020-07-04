package com.p280ss.android.ugc.aweme.policy;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.policy.f */
final /* synthetic */ class C35499f implements OnClickListener {

    /* renamed from: a */
    private final C35495c f93148a;

    /* renamed from: b */
    private final Policy f93149b;

    C35499f(C35495c cVar, Policy policy) {
        this.f93148a = cVar;
        this.f93149b = policy;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f93148a.mo90298a(this.f93149b, view);
    }
}
