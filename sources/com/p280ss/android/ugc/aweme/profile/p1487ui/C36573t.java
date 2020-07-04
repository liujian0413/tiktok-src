package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.t */
final /* synthetic */ class C36573t implements OnClickListener {

    /* renamed from: a */
    private final C36571a f95973a;

    /* renamed from: b */
    private final int f95974b;

    C36573t(C36571a aVar, int i) {
        this.f95973a = aVar;
        this.f95974b = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f95973a.mo92785a(this.f95974b, view);
    }
}
