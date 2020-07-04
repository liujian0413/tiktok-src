package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.ab */
final /* synthetic */ class C21493ab implements OnClickListener {

    /* renamed from: a */
    private final MusInputPhoneFragment f57808a;

    C21493ab(MusInputPhoneFragment musInputPhoneFragment) {
        this.f57808a = musInputPhoneFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f57808a.onClick(view);
    }
}
