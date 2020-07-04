package com.p280ss.android.ugc.aweme.mobile;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.mobile.h */
final /* synthetic */ class C33611h implements OnClickListener {

    /* renamed from: a */
    private final C33606d f87731a;

    /* renamed from: b */
    private final Activity f87732b;

    C33611h(C33606d dVar, Activity activity) {
        this.f87731a = dVar;
        this.f87732b = activity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f87731a.mo85939a(this.f87732b, view);
    }
}
