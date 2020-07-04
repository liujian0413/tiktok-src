package com.p280ss.android.ugc.aweme.account.base.p939a;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.base.a.b */
final /* synthetic */ class C21121b implements OnClickListener {

    /* renamed from: a */
    private final C21118a f56698a;

    C21121b(C21118a aVar) {
        this.f56698a = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f56698a.mo56980a(view);
    }
}
