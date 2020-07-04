package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.keva.Keva;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p662f.p663a.C12830m;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12850k;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p280ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker;
import com.p280ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker.C21160a;
import com.p280ss.android.ugc.aweme.account.ftc.activity.DeleteVideoAlertActivity;
import com.p280ss.android.ugc.aweme.account.login.C21537g;
import com.p280ss.android.ugc.aweme.account.login.C21579s;
import com.p280ss.android.ugc.aweme.account.login.C21640x;
import com.p280ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p280ss.android.ugc.aweme.account.login.agegate.C21297b;
import com.p280ss.android.ugc.aweme.account.login.agegate.p953a.C21290a;
import com.p280ss.android.ugc.aweme.account.login.agegate.p953a.C21295f;
import com.p280ss.android.ugc.aweme.account.login.agegate.p953a.C21296g;
import com.p280ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p280ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.p952a.C21271b;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21870h;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21870h.C21871a;
import com.p280ss.android.ugc.aweme.account.login.p974ui.LoginButton;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p946i.C21213a;
import com.p280ss.android.ugc.aweme.account.p946i.C21214b;
import com.p280ss.android.ugc.aweme.account.util.C22323b;
import com.p280ss.android.ugc.aweme.account.util.C22334m;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.MusAgeGateFragment */
public class MusAgeGateFragment extends BaseMusLoginFragment implements OnClickListener, C21160a, C21271b, C21296g, C21871a {

    /* renamed from: A */
    private boolean f57538A;

    /* renamed from: B */
    private C21417a f57539B;

    /* renamed from: C */
    private int f57540C = -3001;

    /* renamed from: D */
    private C21870h f57541D;

    /* renamed from: E */
    private C12728d f57542E;

    /* renamed from: F */
    private boolean f57543F = true;

    /* renamed from: n */
    public String f57544n;

    /* renamed from: o */
    public String f57545o;

    /* renamed from: p */
    public String f57546p;

    /* renamed from: q */
    private View f57547q;

    /* renamed from: r */
    private TextView f57548r;

    /* renamed from: s */
    private LoginButton f57549s;

    /* renamed from: t */
    private DatePicker f57550t;

    /* renamed from: u */
    private C21295f f57551u;

    /* renamed from: v */
    private int f57552v = 1;

    /* renamed from: w */
    private String f57553w;

    /* renamed from: x */
    private String f57554x;

    /* renamed from: y */
    private boolean f57555y;

    /* renamed from: z */
    private boolean f57556z;

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.MusAgeGateFragment$a */
    class C21417a extends C12850k {
        private C21417a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNeedSecureCaptcha(C12710e<C12830m> eVar) {
            super.onNeedSecureCaptcha(eVar);
            if (MusAgeGateFragment.this.isViewValid()) {
                MusAgeGateFragment.this.mo57502a(false);
            }
        }

        public final void onSuccess(C12710e<C12830m> eVar) {
            if (MusAgeGateFragment.this.isViewValid() && MusAgeGateFragment.this.getContext() != null && eVar.f33709g != null && ((C12830m) eVar.f33709g).f33976c != null) {
                MusAgeGateFragment.m71873a(((C12830m) eVar.f33709g).f33976c.f34083f, ((C12830m) eVar.f33709g).f33976c);
                C21537g.m72226c(1, 0, "");
                C6907h.m21524a("login_success", (Map) new C21102b().mo56946a("enter_method", MusAgeGateFragment.this.f57412l).mo56946a("enter_from", MusAgeGateFragment.this.f57411k).mo56946a("enter_type", MusAgeGateFragment.this.f57413m).mo56946a("platform", "sms_verification").mo56944a("status", 1).mo56944a("_perf_monitor", 1).f56672a);
                PhoneLoginMethod phoneLoginMethod = new PhoneLoginMethod(C21671bd.m72536d(), LoginMethodName.PHONE_SMS, MusAgeGateFragment.this.f57544n, MusAgeGateFragment.this.f57545o, MusAgeGateFragment.this.f57546p);
                C21579s.m72313b((BaseLoginMethod) phoneLoginMethod);
                Bundle bundle = new Bundle(MusAgeGateFragment.this.getArguments());
                if (((C12830m) eVar.f33709g).mo31218b().f34081d) {
                    if (MusAgeGateFragment.this.getActivity() instanceof MusLoginActivity) {
                        AgeGateResponse ageGateResponse = ((MusLoginActivity) MusAgeGateFragment.this.getActivity()).f57129a;
                        if (ageGateResponse != null) {
                            bundle.putSerializable("age_gate_response", ageGateResponse);
                        }
                    }
                    bundle.putBoolean("new_user_need_set_pass_word", true);
                    bundle.putInt("set_pass_scene", 2);
                    bundle.putString("platform", "mobile");
                    if (MusAgeGateFragment.this.f57409h != null) {
                        MusAgeGateFragment.this.f57409h.mo57193a(bundle);
                    }
                    return;
                }
                if (MusAgeGateFragment.this.getActivity() instanceof MusLoginActivity) {
                    ((MusLoginActivity) MusAgeGateFragment.this.getActivity()).f57129a = null;
                }
                if (MusAgeGateFragment.this.f57409h != null) {
                    bundle.putString("platform", "mobile");
                    MusAgeGateFragment.this.f57409h.mo57193a(bundle);
                }
            }
        }

        public final void onError(C12710e<C12830m> eVar, int i) {
            if (MusAgeGateFragment.this.isViewValid() && MusAgeGateFragment.this.getContext() != null) {
                C6907h.m21524a("login_failure", (Map) new C21102b().mo56946a("platform", "sms_verification").mo56946a("enter_method", MusAgeGateFragment.this.f57412l).mo56946a("enter_type", MusAgeGateFragment.this.f57413m).mo56946a("carrier", "").mo56944a("error_code", eVar.f33702b).f56672a);
                C21537g.m72226c(0, eVar.f33702b, eVar.f33703c);
            }
        }
    }

    /* renamed from: j */
    private void m71962j() {
        this.f57551u = new C21295f();
        this.f57551u.mo57295a((C21296g) this);
    }

    public final boolean aa_() {
        if (this.f57555y || this.f57552v == 4) {
            return true;
        }
        return false;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f57551u != null) {
            this.f57551u.mo57298c();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f57541D != null) {
            this.f57541D.mo57199b(this);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f57541D != null) {
            this.f57541D.mo57195a(this);
        }
    }

    /* renamed from: i */
    public final void mo57573i() {
        if (this.f57543F) {
            new C21213a().mo57137b(this.f57553w).mo57135a("0").mo57138c(String.valueOf(this.f57540C)).mo57141b();
        }
        C22323b.m73915a("");
    }

    /* renamed from: a */
    public final void mo57299a() {
        if ((getActivity() instanceof MusLoginActivity) && this.f57552v != 4) {
            ((MusLoginActivity) getActivity()).f57129a = (AgeGateResponse) ((C21290a) this.f57551u.mo66539h()).getData();
        }
        new C21213a().mo57137b(this.f57553w).mo57135a("1").mo57141b();
        C21640x.m72453a(!C21297b.m71680c(), (AgeGateResponse) ((C21290a) this.f57551u.mo66539h()).getData(), this.f57553w);
        m71963k();
    }

    /* renamed from: k */
    private void m71963k() {
        if (this.f57552v == 1) {
            BaseMusLoginFragment baseMusLoginFragment = (BaseMusLoginFragment) C22334m.m73938a(MusRegisterFragment.class, getArguments()).mo58756a("enter_type", this.f57413m).mo58753a();
            baseMusLoginFragment.mo57501a(this.f57409h);
            mo57503b(baseMusLoginFragment, false);
        } else if (this.f57552v == 0) {
            if (!C21297b.m71680c()) {
                C12728d dVar = this.f57542E;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f57545o);
                sb.append("-");
                sb.append(this.f57546p);
                dVar.mo31192a(sb.toString(), this.f57554x, (C12850k) this.f57539B);
                return;
            }
            BaseMusLoginFragment baseMusLoginFragment2 = (BaseMusLoginFragment) C22334m.m73938a(MusSendCodeFragment.class, getArguments()).mo58756a("country_code_alpha_2", this.f57544n).mo58756a("country_code", this.f57545o).mo58756a("phone_number", this.f57546p).mo58757a("NEW_PHONE_USER", true).mo58757a("use_whatsapp_code", this.f57556z).mo58757a("reset_ticker", this.f57538A).mo58753a();
            baseMusLoginFragment2.mo57501a(this.f57409h);
            mo57503b(baseMusLoginFragment2, false);
        } else if (this.f57552v != 4) {
            if (this.f57552v == 7 && getActivity() != null) {
                Intent intent = new Intent();
                intent.putExtra("age_gate_response", (Serializable) ((C21290a) this.f57551u.mo66539h()).getData());
                getActivity().setResult(-1, intent);
                getActivity().finish();
            }
        } else if (((AgeGateResponse) ((C21290a) this.f57551u.mo66539h()).getData()).is_prompt()) {
            Intent intent2 = new Intent(getActivity(), DeleteVideoAlertActivity.class);
            intent2.putExtra("age_gate_response", (Serializable) ((C21290a) this.f57551u.mo66539h()).getData());
            startActivity(intent2);
            if (getActivity() != null) {
                getActivity().finish();
            }
        } else {
            C10741a aVar = new C10741a(getActivity());
            aVar.mo25649a((int) R.string.cd8);
            aVar.mo25657b((int) R.string.cd3);
            aVar.mo25650a((int) R.string.bc5, (DialogInterface.OnClickListener) new C21528r(this));
            aVar.mo25656a().mo25637a().setCancelable(false);
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C21870h) {
            this.f57541D = (C21870h) activity;
        }
    }

    /* renamed from: a */
    public final void mo57502a(boolean z) {
        if (z) {
            this.f57549s.mo57356Z_();
        } else {
            this.f57549s.mo57357a();
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view == this.f57547q) {
            mo57508d();
            C22323b.m73915a("");
            return;
        }
        if (view == this.f57549s) {
            if (!C21529s.m72213a(getContext())) {
                C10761a.m31399c(getContext(), (int) R.string.cjs).mo25750a();
                return;
            }
            this.f57551u.mo57297a(this.f57555y, !this.f57555y);
        }
    }

    /* renamed from: d */
    private void m71961d(View view) {
        this.f57547q = view.findViewById(R.id.b6a);
        this.f57549s = (LoginButton) view.findViewById(R.id.qz);
        this.f57550t = (DatePicker) view.findViewById(R.id.ab5);
        this.f57548r = (TextView) view.findViewById(R.id.ep);
        this.f57547q.setOnClickListener(this);
        this.f57549s.setOnClickListener(this);
        this.f57550t.mo57060a((C21160a) this);
        C21297b.m71677a(this.f57550t);
        this.f57549s.setLoginBackgroundRes(R.drawable.baw);
        this.f57549s.setLoadingBackground(R.drawable.bba);
        if (this.f57555y) {
            this.f57548r.setText(R.string.cd2);
            this.f57547q.setVisibility(8);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f57544n = arguments.getString("country_code_alpha_2");
            this.f57545o = arguments.getString("country_code");
            this.f57546p = arguments.getString("phone_number");
            this.f57552v = arguments.getInt("init_page", 1);
            this.f57554x = arguments.getString("sms_code_key", "");
            this.f57555y = arguments.getBoolean("ftc_detect", false);
            this.f57556z = arguments.getBoolean("use_whatsapp_code", false);
            this.f57538A = arguments.getBoolean("reset_ticker", false);
        }
        this.f57542E = C12798d.m37186a(getContext());
        if (this.f57552v == 0) {
            str = "sms_verification";
        } else {
            str = "phone";
        }
        this.f57553w = str;
        Keva.getRepo("compliance_setting").storeBoolean("need_to_show_ftc_age_gate_but_no_showed", false);
        new C21214b().mo57139a(this.f57553w).mo57141b();
        this.f57539B = new C21417a();
        C21640x.m72454a(!C21297b.m71680c(), this.f57553w);
    }

    /* renamed from: a */
    public final void mo57300a(Exception exc) {
        if (isViewValid() && getActivity() != null) {
            if (exc instanceof ApiServerException) {
                ApiServerException apiServerException = (ApiServerException) exc;
                this.f57540C = apiServerException.getErrorCode();
                C10761a.m31403c((Context) getActivity(), apiServerException.getErrorMsg()).mo25750a();
                C21640x.m72453a(!C21297b.m71680c(), new AgeGateResponse(apiServerException.getErrorCode(), apiServerException.getErrorMsg(), false, false), this.f57553w);
            } else if (((C21290a) this.f57551u.mo66539h()).getData() == null || ((AgeGateResponse) ((C21290a) this.f57551u.mo66539h()).getData()).getStatus_code() < 0) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
                C21640x.m72453a(!C21297b.m71680c(), null, this.f57553w);
            } else if (((AgeGateResponse) ((C21290a) this.f57551u.mo66539h()).getData()).getStatus_code() != 0) {
                this.f57540C = ((AgeGateResponse) ((C21290a) this.f57551u.mo66539h()).getData()).getStatus_code();
                String status_msg = ((AgeGateResponse) ((C21290a) this.f57551u.mo66539h()).getData()).getStatus_msg();
                if (!TextUtils.isEmpty(status_msg)) {
                    C10761a.m31403c((Context) getActivity(), status_msg).mo25750a();
                }
                boolean z = !C21297b.m71680c();
                int i = this.f57540C;
                if (TextUtils.isEmpty(status_msg)) {
                    status_msg = "";
                }
                C21640x.m72453a(z, new AgeGateResponse(i, status_msg, false, false), this.f57553w);
            } else {
                if ((getActivity() instanceof MusLoginActivity) && this.f57552v != 4) {
                    ((MusLoginActivity) getActivity()).f57129a = (AgeGateResponse) ((C21290a) this.f57551u.mo66539h()).getData();
                }
                if (!C21297b.m71680c()) {
                    C21640x.m72453a(!C21297b.m71680c(), (AgeGateResponse) ((C21290a) this.f57551u.mo66539h()).getData(), this.f57553w);
                    C10741a aVar = new C10741a(getActivity());
                    if (this.f57555y) {
                        aVar.mo25649a((int) R.string.cd8);
                        aVar.mo25657b((int) R.string.cd3);
                        aVar.mo25650a((int) R.string.bc5, (DialogInterface.OnClickListener) new C21525o(this));
                    } else {
                        aVar.mo25649a((int) R.string.b_x);
                        aVar.mo25657b((int) R.string.cba);
                        aVar.mo25650a((int) R.string.ur, (DialogInterface.OnClickListener) new C21526p(this));
                        if (getActivity() != null && this.f57552v == 7) {
                            Intent intent = new Intent();
                            intent.putExtra("age_gate_response", (Serializable) ((C21290a) this.f57551u.mo66539h()).getData());
                            getActivity().setResult(-99, intent);
                        }
                    }
                    aVar.mo25656a().mo25637a().setCancelable(false);
                    return;
                }
                C10741a aVar2 = new C10741a(getActivity());
                aVar2.mo25657b((int) R.string.cb7);
                aVar2.mo25650a((int) R.string.cql, (DialogInterface.OnClickListener) new C21527q(this));
                aVar2.mo25656a().mo25637a().setCancelable(false);
                new C21213a().mo57137b(this.f57553w).mo57135a("0").mo57138c("56004").mo57141b();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m71962j();
        m71961d(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo57569a(DialogInterface dialogInterface, int i) {
        C21671bd.m72538f().notifyFinish();
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo57570b(DialogInterface dialogInterface, int i) {
        if (getActivity() != null) {
            this.f57543F = false;
            getActivity().onBackPressed();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo57571c(DialogInterface dialogInterface, int i) {
        mo57503b(C22334m.m73938a(MusCreateAccountFragment.class, getArguments()).mo58754a("init_page", this.f57552v).mo58753a(), false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo57572d(DialogInterface dialogInterface, int i) {
        mo57503b(C22334m.m73938a(MusCreateAccountFragment.class, getArguments()).mo58757a("ftc_detect", this.f57555y).mo58754a("init_page", this.f57552v).mo58753a(), false);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.ae_, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo57070a(DatePicker datePicker, int i, int i2, int i3, Calendar calendar) {
        this.f57551u.mo57294a(i, i2, i3);
        this.f57549s.setEnabled(true);
    }
}
