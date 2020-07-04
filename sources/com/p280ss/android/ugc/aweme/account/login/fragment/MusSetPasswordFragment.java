package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p645a.p647b.C12721e;
import com.bytedance.sdk.account.p645a.p649d.C12734f;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p662f.p663a.C12823f;
import com.bytedance.sdk.account.p662f.p664b.C12878t.C12879a;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12845f;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.login.C21537g;
import com.p280ss.android.ugc.aweme.account.login.C21579s;
import com.p280ss.android.ugc.aweme.account.login.C21638v;
import com.p280ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21320aa;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21337n;
import com.p280ss.android.ugc.aweme.account.login.p974ui.LoginButton;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p946i.C21220e;
import com.p280ss.android.ugc.aweme.account.p946i.C21221f;
import com.p280ss.android.ugc.aweme.account.p946i.C21222g;
import com.p280ss.android.ugc.aweme.account.p950k.C21231d;
import com.p280ss.android.ugc.aweme.account.util.C22334m;
import com.p280ss.android.ugc.aweme.account.util.C22338o;
import com.p280ss.android.ugc.aweme.account.view.StateButton.C22358a;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.MusSetPasswordFragment */
public class MusSetPasswordFragment extends BaseMusLoginFragment implements C21337n {

    /* renamed from: n */
    public EditText f57787n;

    /* renamed from: o */
    public ImageView f57788o;

    /* renamed from: p */
    public View f57789p;

    /* renamed from: q */
    public LoginButton f57790q;

    /* renamed from: r */
    public View f57791r;

    /* renamed from: s */
    public TextView f57792s;

    /* renamed from: t */
    public TextView f57793t;

    /* renamed from: u */
    public Handler f57794u;

    /* renamed from: v */
    public String f57795v;

    /* renamed from: w */
    public int f57796w;

    /* renamed from: x */
    public boolean f57797x;

    /* renamed from: y */
    private TextView f57798y;

    /* renamed from: z */
    private C12728d f57799z;

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return false;
    }

    /* renamed from: Z_ */
    public final void mo57356Z_() {
        this.f57790q.mo57356Z_();
    }

    /* renamed from: a */
    public final void mo57357a() {
        this.f57790q.mo57357a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo57650j() {
        mo57500a((View) this.f57787n);
    }

    public void onPause() {
        super.onPause();
        KeyboardUtils.m77057c(this.f57787n);
    }

    public void onStart() {
        super.onStart();
        this.f57787n.postDelayed(new C21508aq(this), 500);
    }

    public void onDestroy() {
        super.onDestroy();
        if (!this.f57797x) {
            C21671bd.m72522a(13, 2, (Object) null);
        }
        if (this.f57794u != null) {
            this.f57794u.removeCallbacksAndMessages(null);
            this.f57794u = null;
        }
    }

    /* renamed from: i */
    public final void mo57649i() {
        mo57356Z_();
        mo57509e().mo57213a(this.f57787n.getText().toString(), (C21320aa) new C21320aa(this, this.f57787n.getText().toString(), 0) {
            /* renamed from: a */
            public final void mo57342a(C12710e<C12879a> eVar) {
                if (MusSetPasswordFragment.this.isViewValid() && MusSetPasswordFragment.this.getActivity() != null) {
                    if (MusSetPasswordFragment.this.f57796w == 2) {
                        C6907h.m21524a("set_password_response", (Map) new C21102b().mo56946a("platform", "phone").mo56946a("enter_from", "register").mo56944a("is_success", 1).f56672a);
                    }
                    MusSetPasswordFragment.this.f57797x = true;
                    C21671bd.m72522a(13, 1, (Object) null);
                    MusSetPasswordFragment.this.mo57357a();
                    MusSetPasswordFragment.this.getActivity().finish();
                }
            }

            /* renamed from: b */
            public final void mo57343b(C12710e<C12879a> eVar) {
                if (MusSetPasswordFragment.this.isViewValid() && MusSetPasswordFragment.this.getActivity() != null) {
                    if (MusSetPasswordFragment.this.f57796w == 2) {
                        C6907h.m21524a("set_password_response", (Map) new C21102b().mo56946a("platform", "phone").mo56946a("enter_from", "register").mo56944a("is_success", 0).mo56946a("error_code", (String) null).f56672a);
                    }
                    MusSetPasswordFragment.this.mo57357a();
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo57648e(View view) {
        this.f57788o.setVisibility(8);
        this.f57787n.setText("");
    }

    /* renamed from: a */
    public final void mo57646a(String str) {
        mo57356Z_();
        mo57510f();
        this.f57799z.mo31206a(this.f57795v, this.f57787n.getText().toString(), "", str, (C12845f) new C12845f() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNeedSecureCaptcha(C12710e<C12823f> eVar) {
                super.onNeedSecureCaptcha(eVar);
                C22358a.m74033a(MusSetPasswordFragment.this.f57790q);
                C6907h.m21524a("set_password_response", (Map) new C21102b().mo56944a("is_success", 0).mo56946a("enter_from", "register").mo56946a("platform", "email").mo56944a("error_code", eVar.f33702b).f56672a);
                C6907h.m21524a("login_failure", (Map) new C21102b().mo56946a("platform", "email").mo56946a("enter_method", MusSetPasswordFragment.this.f57412l).mo56946a("enter_type", MusSetPasswordFragment.this.f57413m).mo56946a("carrier", "").mo56944a("error_code", eVar.f33702b).f56672a);
                C21231d.m71459a(1, eVar.f33702b, eVar.f33703c);
            }

            public final void onSuccess(C12710e<C12823f> eVar) {
                if (MusSetPasswordFragment.this.isViewValid() && MusSetPasswordFragment.this.getContext() != null && eVar.f33709g != null && ((C12823f) eVar.f33709g).f33942e != null) {
                    C6907h.m21524a("set_password_response", (Map) new C21102b().mo56944a("is_success", 1).mo56946a("enter_from", "register").mo56946a("platform", "email").f56672a);
                    MusSetPasswordFragment.this.mo57357a();
                    new C21222g().mo57148a("1").mo57149b("email").mo57141b();
                    C6907h.m21524a("login_success", (Map) new C21102b().mo56946a("enter_method", MusSetPasswordFragment.this.f57412l).mo56946a("enter_from", MusSetPasswordFragment.this.f57411k).mo56946a("enter_type", MusSetPasswordFragment.this.f57413m).mo56946a("platform", "email").mo56944a("status", 1).mo56944a("_perf_monitor", 1).f56672a);
                    C21671bd.m72526a(((C12823f) eVar.f33709g).f33942e);
                    C21537g.m72218a(1, 0, "");
                    if (MusSetPasswordFragment.this.f57409h != null) {
                        Bundle bundle = new Bundle(MusSetPasswordFragment.this.getArguments());
                        bundle.putString("platform", "email");
                        bundle.putString("login_path", "email_or_username");
                        MusSetPasswordFragment.this.f57409h.mo57193a(bundle);
                    }
                    if (MusSetPasswordFragment.this.getArguments() != null && MusSetPasswordFragment.this.getArguments().getBoolean("need_remember_login_method", true)) {
                        C21579s.m72313b((BaseLoginMethod) new AccountPassLoginMethod(C21671bd.m72536d(), LoginMethodName.EMAIL_PASS, MusSetPasswordFragment.this.f57795v));
                    }
                }
            }

            public final void onError(C12710e<C12823f> eVar, int i) {
                if (MusSetPasswordFragment.this.isViewValid() && MusSetPasswordFragment.this.getContext() != null) {
                    C6907h.m21524a("set_password_response", (Map) new C21102b().mo56944a("is_success", 0).mo56946a("enter_from", "register").mo56946a("platform", "email").mo56944a("error_code", eVar.f33702b).f56672a);
                    if (i == 2013) {
                        BaseMusLoginFragment baseMusLoginFragment = (BaseMusLoginFragment) C22334m.m73938a(MusSendCodeFragment.class, MusSetPasswordFragment.this.getArguments()).mo58754a("code_type", 6).mo58756a("email", MusSetPasswordFragment.this.f57795v).mo58756a("enter_from", MusSetPasswordFragment.this.f57411k).mo58756a("pass_word", MusSetPasswordFragment.this.f57787n.getText().toString()).mo58753a();
                        baseMusLoginFragment.mo57501a(MusSetPasswordFragment.this.f57409h);
                        MusSetPasswordFragment.this.mo57503b(baseMusLoginFragment, false);
                        return;
                    }
                    new C21222g().mo57148a("0").mo57149b("email").mo57150c(String.valueOf(eVar.f33702b)).mo57151d("/passport/email/register/v2/").mo57141b();
                    C22358a.m74033a(MusSetPasswordFragment.this.f57790q);
                    if (eVar.f33702b != 1105) {
                        C10761a.m31403c(MusSetPasswordFragment.this.getContext(), C22338o.m73945a((C12707b) eVar)).mo25750a();
                    }
                    C21537g.m72218a(0, eVar.f33702b, eVar.f33703c);
                    C21231d.m71459a(1, eVar.f33702b, eVar.f33703c);
                }
            }
        });
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f57794u = new Handler();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f57795v = arguments.getString("email");
            this.f57796w = arguments.getInt("set_pass_scene", 1);
            this.f57411k = arguments.getString("enter_from");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo57647d(View view) {
        if (this.f57796w == 3) {
            new C21221f().mo57146b("email").mo57145a(this.f57411k).mo57141b();
            C6907h.m21524a("login_submit", (Map) new C21102b().mo56946a("enter_method", this.f57412l).mo56946a("enter_from", this.f57411k).mo56946a("enter_type", this.f57413m).mo56946a("platform", "email").mo56946a("group_id", C21220e.m71415a(getArguments())).mo56946a("log_pb", C21220e.m71418b(getArguments())).f56672a);
            mo57646a("");
        } else if (this.f57796w == 4) {
            C6907h.m21524a("login_submit", (Map) new C21102b().mo56946a("enter_method", this.f57412l).mo56946a("enter_from", this.f57411k).mo56946a("enter_type", this.f57413m).mo56946a("platform", "email").mo56946a("group_id", C21220e.m71415a(getArguments())).mo56946a("log_pb", C21220e.m71418b(getArguments())).f56672a);
            this.f57799z.mo31211a(this.f57787n.getText().toString().trim(), getArguments().getString("ticket"), (Map) null, (String) null, (C12721e) new C12721e() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onSuccess(C12734f fVar) {
                    C6907h.m21524a("set_password_response", (Map) new C21102b().mo56946a("platform", "email").mo56946a("enter_from", "reset_password").mo56944a("is_success", 1).f56672a);
                    C6907h.m21524a("login_success", (Map) new C21102b().mo56946a("enter_method", MusSetPasswordFragment.this.f57412l).mo56946a("enter_from", MusSetPasswordFragment.this.f57411k).mo56946a("enter_type", MusSetPasswordFragment.this.f57413m).mo56946a("platform", "email").mo56944a("status", 1).f56672a);
                    C21671bd.m72526a(fVar.f33711g);
                    MusSetPasswordFragment.this.mo57357a();
                    if (MusSetPasswordFragment.this.getActivity() != null && !MusSetPasswordFragment.this.getActivity().isFinishing()) {
                        MusSetPasswordFragment.this.getActivity().setResult(-1);
                        MusSetPasswordFragment.this.getActivity().finish();
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onError(C12734f fVar, int i) {
                    C6907h.m21524a("set_password_response", (Map) new C21102b().mo56946a("platform", "email").mo56946a("enter_from", "reset_password").mo56944a("is_success", 0).mo56944a("error_code", fVar.f33702b).f56672a);
                    MusSetPasswordFragment.this.mo57357a();
                    C10761a.m31396b(MusSetPasswordFragment.this.getContext(), fVar.f33703c, 0).mo25750a();
                }
            });
        } else {
            mo57649i();
        }
    }

    /* renamed from: f */
    private void m72179f(View view) {
        this.f57787n = (EditText) view.findViewById(R.id.agc);
        this.f57789p = view.findViewById(R.id.agd);
        this.f57788o = (ImageView) view.findViewById(R.id.wv);
        this.f57790q = (LoginButton) view.findViewById(R.id.py);
        this.f57791r = view.findViewById(R.id.ehp);
        this.f57792s = (TextView) view.findViewById(R.id.eho);
        this.f57793t = (TextView) view.findViewById(R.id.e06);
        this.f57798y = (TextView) view.findViewById(R.id.e23);
        ImageView imageView = (ImageView) view.findViewById(R.id.b6a);
        this.f57790q.setLoginBackgroundRes(R.drawable.bav);
        int i = 0;
        this.f57790q.setAutoMirrored(false);
        this.f57790q.setLoadingBackground(R.drawable.bba);
        this.f57798y.setVisibility(8);
        if (this.f57796w == 2) {
            C6907h.m21524a("set_password_show", (Map) new C21102b().mo56946a("enter_from", "register").mo56946a("platform", "phone").f56672a);
        } else if (this.f57796w == 3) {
            C6907h.m21524a("set_password_show", (Map) new C21102b().mo56946a("enter_from", "register").mo56946a("platform", "email").f56672a);
        } else if (this.f57796w == 4) {
            C6907h.m21524a("set_password_show", (Map) new C21102b().mo56946a("enter_from", "reset_password").mo56946a("platform", "email").f56672a);
        }
        this.f57788o.setOnClickListener(new C21509ar(this));
        this.f57787n.setOnFocusChangeListener(new C21510as(this));
        this.f57787n.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(final Editable editable) {
                int i;
                MusSetPasswordFragment.this.f57794u.removeCallbacksAndMessages(null);
                MusSetPasswordFragment.this.f57794u.postDelayed(new Runnable() {
                    public final void run() {
                        if (editable.toString().length() >= 0 && editable.toString().length() < 8) {
                            MusSetPasswordFragment.this.f57790q.setEnabled(false);
                        } else if (editable.toString().length() > 20) {
                            MusSetPasswordFragment.this.f57791r.setVisibility(0);
                            MusSetPasswordFragment.this.f57792s.setText(MusSetPasswordFragment.this.getResources().getString(R.string.cet));
                            MusSetPasswordFragment.this.f57789p.setBackgroundColor(MusSetPasswordFragment.this.getResources().getColor(R.color.a14));
                            MusSetPasswordFragment.this.f57790q.setEnabled(false);
                        } else if (TextUtils.isEmpty(editable.toString()) || C21638v.m72447a(editable.toString())) {
                            MusSetPasswordFragment.this.f57791r.setVisibility(8);
                            MusSetPasswordFragment.this.f57789p.setBackgroundColor(MusSetPasswordFragment.this.getResources().getColor(R.color.le));
                            MusSetPasswordFragment.this.f57790q.setEnabled(true);
                        } else {
                            MusSetPasswordFragment.this.f57791r.setVisibility(0);
                            MusSetPasswordFragment.this.f57792s.setText(MusSetPasswordFragment.this.getResources().getString(R.string.ceq));
                            MusSetPasswordFragment.this.f57789p.setBackgroundColor(MusSetPasswordFragment.this.getResources().getColor(R.color.a14));
                            MusSetPasswordFragment.this.f57790q.setEnabled(false);
                        }
                    }
                }, 200);
                ImageView imageView = MusSetPasswordFragment.this.f57788o;
                if (!TextUtils.isEmpty(MusSetPasswordFragment.this.f57787n.getText())) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
            }
        });
        this.f57790q.setOnClickListener(new C21511at(this));
        if (this.f57796w == 2) {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo57645a(View view, boolean z) {
        int i;
        ImageView imageView = this.f57788o;
        if (!z || TextUtils.isEmpty(this.f57787n.getText())) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f57799z = C12798d.m37186a(getContext());
        m72179f(view);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.aej, viewGroup, false);
    }
}
