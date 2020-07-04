package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1642a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12713h;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12859t;
import com.p280ss.android.ugc.aweme.account.login.p952a.C21270a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p951l.C21241d;
import com.p280ss.android.ugc.aweme.account.util.C22338o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.MusChangePassSendCodeFragment */
public class MusChangePassSendCodeFragment extends BaseMusSecureSendCodeFragment {

    /* renamed from: x */
    public static String f57558x = "oldpassword";

    /* renamed from: y */
    public static String f57559y = "newpassword";

    /* renamed from: A */
    private int f57560A = 22;

    /* renamed from: B */
    private C12728d f57561B;

    /* renamed from: C */
    private String f57562C;

    /* renamed from: D */
    private String f57563D;

    /* renamed from: z */
    public C21270a f57564z;

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo57557i() {
        if (this.mCountDownView.getRemainTick() <= 0) {
            this.mCountDownView.mo58213a(4);
        }
    }

    /* renamed from: j */
    private void m71975j() {
        this.tipTitle.setText(getString(R.string.cbo));
        this.mTvHint.setText(C1642a.m8034a(getString(R.string.cbn), new Object[]{this.f57508u}));
        this.mCountDownView.mo58214a(4, this.f57508u);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo57553a() {
        this.mCountDownView.mo58213a(4);
        mo57509e().mo57209a(this.f57560A, this.f57507q, C21241d.m71496a(), this.f57504n);
        C6907h.m21524a("send_sms", (Map) new C21102b().mo56946a("send_method", "resend").mo56944a("send_reason", this.f57560A).mo56946a("enter_method", this.f57412l).mo56946a("enter_from", this.f57411k).f56672a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo57555b(String str) {
        this.mBtnLogin.mo57356Z_();
        this.f57561B.mo31181a(str, this.f57560A, true, (C12859t) new C12859t() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public void onNeedSecureCaptcha(C12713h hVar) {
                super.onNeedSecureCaptcha(hVar);
                if (MusChangePassSendCodeFragment.this.isViewValid() && MusChangePassSendCodeFragment.this.mBtnLogin != null) {
                    MusChangePassSendCodeFragment.this.mBtnLogin.mo57357a();
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(C12713h hVar) {
                if (MusChangePassSendCodeFragment.this.mBtnLogin != null) {
                    MusChangePassSendCodeFragment.this.mBtnLogin.mo57357a();
                }
                MusChangePassSendCodeFragment.this.f57564z.mo57248a(hVar.f33722g);
                if (MusChangePassSendCodeFragment.this.getActivity() != null) {
                    MusChangePassSendCodeFragment.this.getActivity().onBackPressed();
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onError(C12713h hVar, int i) {
                if (MusChangePassSendCodeFragment.this.mBtnLogin != null) {
                    MusChangePassSendCodeFragment.this.mBtnLogin.mo57357a();
                }
                C10761a.m31403c(MusChangePassSendCodeFragment.this.getContext(), C22338o.m73945a((C12707b) hVar)).mo25750a();
            }
        });
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f57562C = getArguments().getString(f57558x);
            this.f57563D = getArguments().getString(f57559y);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f57561B = C12798d.m37186a(getContext());
        m71975j();
        return onCreateView;
    }

    /* renamed from: a */
    public static MusChangePassSendCodeFragment m71974a(String str, String str2, String str3, String str4, String str5) {
        MusChangePassSendCodeFragment musChangePassSendCodeFragment = new MusChangePassSendCodeFragment();
        Bundle bundle = new Bundle();
        bundle.putString(f57501r, str);
        bundle.putString(f57502s, str2);
        bundle.putString(f57558x, str4);
        bundle.putString(f57559y, str5);
        bundle.putString(f57503t, str3);
        musChangePassSendCodeFragment.setArguments(bundle);
        return musChangePassSendCodeFragment;
    }
}
