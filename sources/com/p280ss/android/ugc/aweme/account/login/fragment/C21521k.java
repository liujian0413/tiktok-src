package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.k */
final /* synthetic */ class C21521k implements OnClickListener {

    /* renamed from: a */
    private final BaseMusRegisterFragment f57836a;

    /* renamed from: b */
    private final boolean f57837b;

    C21521k(BaseMusRegisterFragment baseMusRegisterFragment, boolean z) {
        this.f57836a = baseMusRegisterFragment;
        this.f57837b = z;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f57836a.mo57527a(this.f57837b, view);
    }
}
