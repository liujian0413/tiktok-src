package com.p280ss.android.ugc.aweme.miniapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.miniapp.q */
final /* synthetic */ class C33415q implements OnClickListener {

    /* renamed from: a */
    private final RecentlyUsedMicroAppActivity f87267a;

    C33415q(RecentlyUsedMicroAppActivity recentlyUsedMicroAppActivity) {
        this.f87267a = recentlyUsedMicroAppActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f87267a.mo85405a(view);
    }
}
