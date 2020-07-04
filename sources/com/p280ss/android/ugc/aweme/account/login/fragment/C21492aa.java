package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.aa */
final /* synthetic */ class C21492aa implements OnClickListener {

    /* renamed from: a */
    private final MusInputPhoneFragment f57807a;

    C21492aa(MusInputPhoneFragment musInputPhoneFragment) {
        this.f57807a = musInputPhoneFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f57807a.onClick(view);
    }
}
