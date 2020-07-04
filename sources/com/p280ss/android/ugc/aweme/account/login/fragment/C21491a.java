package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.a */
final /* synthetic */ class C21491a implements OnClickListener {

    /* renamed from: a */
    private final View f57806a;

    C21491a(View view) {
        this.f57806a = view;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        KeyboardUtils.m77057c(this.f57806a);
    }
}
