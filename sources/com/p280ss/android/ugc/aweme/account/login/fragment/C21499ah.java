package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.ah */
final /* synthetic */ class C21499ah implements OnClickListener {

    /* renamed from: a */
    private final MusLoginPhonePasswordFragment f57814a;

    /* renamed from: b */
    private final boolean f57815b;

    C21499ah(MusLoginPhonePasswordFragment musLoginPhonePasswordFragment, boolean z) {
        this.f57814a = musLoginPhonePasswordFragment;
        this.f57815b = z;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f57814a.mo57611a(this.f57815b, view);
    }
}
