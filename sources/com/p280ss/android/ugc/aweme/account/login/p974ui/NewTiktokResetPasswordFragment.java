package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.p647b.C12718b;
import com.bytedance.sdk.account.p645a.p649d.C12730b;
import com.bytedance.sdk.account.p660d.C12798d;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.C21169e;
import com.p280ss.android.ugc.aweme.account.login.fragment.C21524n;
import com.p280ss.android.ugc.aweme.account.login.loginlog.C21558a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.NewTiktokResetPasswordFragment */
public class NewTiktokResetPasswordFragment extends BaseResetPasswordFragment {

    /* renamed from: G */
    public View f58477G;

    /* renamed from: H */
    public TextView f58478H;

    /* renamed from: J */
    private MusCountDownView f58479J;

    /* renamed from: K */
    private TextView f58480K;

    /* renamed from: L */
    private C12728d f58481L;

    public void onResume() {
        super.onResume();
        if (this.f58479J != null) {
            this.f58479J.mo58216b(1);
        }
    }

    public void afterHandleRequest() {
        super.afterHandleRequest();
        if (isViewValid() && this.f58348u != null) {
            ((LoginButton) this.f58348u).mo57357a();
        }
    }

    public void beforeHandleRequest() {
        if (isViewValid() && this.f58348u != null) {
            ((LoginButton) this.f58348u).mo57356Z_();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo58163j() {
        final String trim = this.f58345r.getText().toString().trim();
        this.f58481L.mo31182a(trim, (C12718b) new C12718b() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(C12730b bVar) {
                C6907h.m21524a("set_password_response", (Map) new C21102b().mo56946a("platform", "phone").mo56946a("enter_from", "reset_password").mo56944a("is_success", 1).f56672a);
                NewTiktokResetPasswordFragment.this.f58478H.setVisibility(8);
                NewTiktokResetPasswordFragment.this.f58477G.setVisibility(8);
                NewTiktokResetPasswordFragment.this.mo58160a(NewTiktokResetPasswordFragment.this.f58344q.getText().toString(), trim, null);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onError(C12730b bVar, int i) {
                C6907h.m21524a("set_password_response", (Map) new C21102b().mo56946a("platform", "phone").mo56946a("enter_from", "reset_password").mo56944a("is_success", 0).mo56944a("error_code", i).f56672a);
                NewTiktokResetPasswordFragment.this.f58478H.setVisibility(0);
                NewTiktokResetPasswordFragment.this.f58478H.setText(R.string.csi);
            }
        });
    }

    /* renamed from: A */
    private void m72992A() {
        if (mo58129g() != null) {
            C21558a.m72263a().mo57697a("", "", false, "register", "", "注册重发验证码");
            C6907h.m21518a((Context) getActivity(), "resend_click", "verification_code", C21671bd.m72536d(), 0);
            mo58129g().mo57435a(this.f58349v, null, this.f58363F);
        }
        mo58161b(2);
        this.f58479J.mo58213a(1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo58241d(View view) {
        m72992A();
        C6907h.m21524a("send_sms", (Map) new C21102b().mo56946a("send_method", "user_click").mo56944a("send_reason", C21169e.f56919d).mo56946a("enter_method", this.f58305i).mo56946a("enter_from", this.f58304h).f56672a);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f58481L = C12798d.m37186a(getContext());
        this.f58479J = (MusCountDownView) view.findViewById(R.id.d8h);
        this.f58359B = (TextView) view.findViewById(R.id.aqc);
        this.f58477G = view.findViewById(R.id.ehj);
        this.f58480K = (TextView) view.findViewById(R.id.ehi);
        this.f58478H = (TextView) view.findViewById(R.id.ehq);
        super.mo58156r();
        this.f58343e.setText(C1642a.m8034a(getString(R.string.b76), new Object[]{this.f58349v}));
        if (this.f58348u instanceof LoginButton) {
            LoginButton loginButton = (LoginButton) this.f58348u;
            loginButton.setLoginBackgroundRes(R.drawable.bav);
            loginButton.setAutoMirrored(false);
            loginButton.setLoadingBackground(R.drawable.bba);
        }
        this.f58479J.setTickListener((C21524n) getActivity());
        this.f58479J.setOnClickListener(new C21878o(this));
        this.f58479J.mo58214a(1, mo58166u());
        m72992A();
        C6907h.m21524a("send_sms", (Map) new C21102b().mo56946a("send_method", "auto_system").mo56944a("send_reason", C21169e.f56919d).mo56946a("enter_method", this.f58305i).mo56946a("enter_from", this.f58304h).f56672a);
        C6907h.m21524a("set_password_show", (Map) new C21102b().mo56946a("platform", "phone").mo56946a("enter_from", "reset_password").f56672a);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.qj, viewGroup, false);
    }

    public void showErrorMessage(String str, int i, boolean z) {
        if (isViewValid()) {
            if (!TextUtils.isEmpty(str)) {
                this.f58477G.setVisibility(0);
                this.f58480K.setText(str);
            } else if (i == -12) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.b1y).mo25750a();
            } else if (i == -21) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.b25).mo25750a();
            } else {
                C10761a.m31399c((Context) getActivity(), (int) R.string.b29).mo25750a();
            }
            if (!z) {
                mo57355c();
            }
        }
    }
}
