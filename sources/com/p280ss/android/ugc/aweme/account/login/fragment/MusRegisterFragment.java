package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.app.Dialog;
import com.p280ss.android.ugc.aweme.account.base.p939a.C21118a;
import com.p280ss.android.ugc.aweme.utils.C42951au;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.MusRegisterFragment */
public class MusRegisterFragment extends BaseMusRegisterFragment {

    /* renamed from: D */
    private Dialog f57723D;

    /* renamed from: E */
    private Dialog f57724E;

    /* renamed from: j */
    public final void mo57530j() {
        C42951au.m136342a(C21118a.m71203b(getContext()));
    }

    /* renamed from: k */
    public final void mo57531k() {
        C42951au.m136342a(C21118a.m71202a(getContext()));
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f57723D != null) {
            C21502ak.m72197a(this.f57723D);
        }
        if (this.f57724E != null) {
            C21502ak.m72197a(this.f57724E);
        }
    }
}
