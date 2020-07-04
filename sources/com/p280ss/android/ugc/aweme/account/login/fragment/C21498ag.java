package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.ag */
final /* synthetic */ class C21498ag implements OnClickListener {

    /* renamed from: a */
    private final MusLoginPhonePasswordFragment f57812a;

    /* renamed from: b */
    private final boolean f57813b;

    C21498ag(MusLoginPhonePasswordFragment musLoginPhonePasswordFragment, boolean z) {
        this.f57812a = musLoginPhonePasswordFragment;
        this.f57813b = z;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f57812a.mo57612b(this.f57813b, view);
    }
}
