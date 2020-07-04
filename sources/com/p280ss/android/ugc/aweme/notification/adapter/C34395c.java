package com.p280ss.android.ugc.aweme.notification.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.c */
final /* synthetic */ class C34395c implements OnClickListener {

    /* renamed from: a */
    private final FansNotificationHolder f89811a;

    C34395c(FansNotificationHolder fansNotificationHolder) {
        this.f89811a = fansNotificationHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f89811a.mo87660a(view);
    }
}
