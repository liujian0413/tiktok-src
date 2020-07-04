package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.j */
final /* synthetic */ class C21520j implements OnClickListener {

    /* renamed from: a */
    private final BaseMusRegisterFragment f57834a;

    /* renamed from: b */
    private final boolean f57835b;

    C21520j(BaseMusRegisterFragment baseMusRegisterFragment, boolean z) {
        this.f57834a = baseMusRegisterFragment;
        this.f57835b = z;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f57834a.mo57528b(this.f57835b, view);
    }
}
