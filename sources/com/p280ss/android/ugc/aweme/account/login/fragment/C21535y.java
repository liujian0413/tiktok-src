package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.y */
final /* synthetic */ class C21535y implements OnClickListener {

    /* renamed from: a */
    private final MusInputPhoneFragment f57848a;

    C21535y(MusInputPhoneFragment musInputPhoneFragment) {
        this.f57848a = musInputPhoneFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f57848a.onClick(view);
    }
}
