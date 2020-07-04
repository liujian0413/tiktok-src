package com.p280ss.android.ugc.aweme.account.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.fragment.a */
final /* synthetic */ class C21177a implements OnClickListener {

    /* renamed from: a */
    private final BaseBindMobileInputPhoneFragmentV2 f56951a;

    C21177a(BaseBindMobileInputPhoneFragmentV2 baseBindMobileInputPhoneFragmentV2) {
        this.f56951a = baseBindMobileInputPhoneFragmentV2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f56951a.onClick(view);
    }
}
