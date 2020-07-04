package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cj */
final /* synthetic */ class C28882cj implements OnClickListener {

    /* renamed from: a */
    private final C28881ci f76150a;

    /* renamed from: b */
    private final Context f76151b;

    C28882cj(C28881ci ciVar, Context context) {
        this.f76150a = ciVar;
        this.f76151b = context;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f76150a.mo74155a(this.f76151b, view);
    }
}
