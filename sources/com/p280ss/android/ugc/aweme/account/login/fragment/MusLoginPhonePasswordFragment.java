package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p662f.p663a.C12833p;
import com.bytedance.sdk.account.p662f.p663a.C12836s;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12852m;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12855p;
import com.bytedance.sdk.account.p668i.C12898b;
import com.p280ss.android.account.C18892b.C18893a;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.C21169e;
import com.p280ss.android.ugc.aweme.account.api.p937b.C21112b;
import com.p280ss.android.ugc.aweme.account.login.C21578r;
import com.p280ss.android.ugc.aweme.account.login.C21579s;
import com.p280ss.android.ugc.aweme.account.login.C21592t;
import com.p280ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p280ss.android.ugc.aweme.account.login.MusLoginManager;
import com.p280ss.android.ugc.aweme.account.login.agegate.C21297b;
import com.p280ss.android.ugc.aweme.account.login.forgetpsw.p961ui.FindPswByEmailActivity;
import com.p280ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p280ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.p952a.C21273d;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21336m;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21348y;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21883t.C21884a;
import com.p280ss.android.ugc.aweme.account.login.p974ui.InputCaptchaFragment.C21823a;
import com.p280ss.android.ugc.aweme.account.login.p974ui.LoginButton;
import com.p280ss.android.ugc.aweme.account.login.p974ui.NewTiktokResetPasswordFragment;
import com.p280ss.android.ugc.aweme.account.login.view.C22156a;
import com.p280ss.android.ugc.aweme.account.login.view.C22156a.C22158b;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a;
import com.p280ss.android.ugc.aweme.account.p946i.C21220e;
import com.p280ss.android.ugc.aweme.account.p946i.C21221f;
import com.p280ss.android.ugc.aweme.account.p946i.C21222g;
import com.p280ss.android.ugc.aweme.account.p950k.C21231d;
import com.p280ss.android.ugc.aweme.account.p950k.C21235f;
import com.p280ss.android.ugc.aweme.account.p951l.C21241d;
import com.p280ss.android.ugc.aweme.account.p951l.C21247i;
import com.p280ss.android.ugc.aweme.account.util.C22334m;
import com.p280ss.android.ugc.aweme.account.util.C22338o;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.p1416n.C34032a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.MusLoginPhonePasswordFragment */
public class MusLoginPhonePasswordFragment extends BaseMusLoginFragment {

    /* renamed from: n */
    public static final boolean f57655n = C7163a.m22363a();

    /* renamed from: A */
    public C21454b f57656A;

    /* renamed from: B */
    public C21273d f57657B;

    /* renamed from: C */
    public C21273d f57658C;

    /* renamed from: D */
    private TextView f57659D;

    /* renamed from: E */
    private Dialog f57660E;

    /* renamed from: F */
    private boolean f57661F;

    /* renamed from: G */
    private View f57662G;

    /* renamed from: H */
    private TextView f57663H;

    /* renamed from: J */
    private TextView f57664J;

    /* renamed from: K */
    private TextView f57665K;

    /* renamed from: L */
    private View f57666L;

    /* renamed from: M */
    private View f57667M;

    /* renamed from: N */
    private View f57668N;

    /* renamed from: O */
    private C22156a f57669O;

    /* renamed from: P */
    private C21453a f57670P;

    /* renamed from: Q */
    private C12728d f57671Q;

    /* renamed from: R */
    private Context f57672R;

    /* renamed from: S */
    private int f57673S;

    /* renamed from: T */
    private int f57674T;

    /* renamed from: o */
    public String f57675o;

    /* renamed from: p */
    public String f57676p;

    /* renamed from: q */
    public String f57677q;

    /* renamed from: r */
    public EditText f57678r;

    /* renamed from: s */
    public View f57679s;

    /* renamed from: t */
    public View f57680t;

    /* renamed from: u */
    public LoginButton f57681u;

    /* renamed from: v */
    public int f57682v;

    /* renamed from: w */
    public View f57683w;

    /* renamed from: x */
    public String f57684x;

    /* renamed from: y */
    public boolean f57685y;

    /* renamed from: z */
    public int f57686z = -1;

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.MusLoginPhonePasswordFragment$a */
    class C21453a extends C21348y {

        /* renamed from: a */
        public boolean f57695a;

        /* renamed from: c */
        public final void onNeedSecureCaptcha(C12710e<C12836s> eVar) {
            super.onNeedSecureCaptcha(eVar);
            if (MusLoginPhonePasswordFragment.this.isViewValid()) {
                MusLoginPhonePasswordFragment.this.mo57502a(false);
            }
            MusLoginPhonePasswordFragment.this.f57685y = false;
        }

        /* renamed from: b */
        public final void mo57366b(C12710e<C12836s> eVar) {
            String str;
            C21235f.m71483a(1, MusLoginPhonePasswordFragment.this.f57686z, eVar.f33702b, eVar.f33703c);
            if (MusLoginPhonePasswordFragment.this.isViewValid() && MusLoginPhonePasswordFragment.this.getContext() != null) {
                if (eVar.f33702b == 1001) {
                    if (!C21297b.m71680c()) {
                        MusLoginPhonePasswordFragment.this.mo57613c(this.f57695a);
                    } else {
                        MusLoginPhonePasswordFragment.this.mo57502a(false);
                        MusLoginPhonePasswordFragment.this.f57683w.setVisibility(8);
                        MusLoginPhonePasswordFragment.this.f57680t.setBackgroundColor(MusLoginPhonePasswordFragment.this.getResources().getColor(R.color.le));
                        BaseMusLoginFragment baseMusLoginFragment = (BaseMusLoginFragment) C22334m.m73938a(MusSendCodeFragment.class, MusLoginPhonePasswordFragment.this.getArguments()).mo58756a("country_code_alpha_2", MusLoginPhonePasswordFragment.this.f57675o).mo58756a("country_code", MusLoginPhonePasswordFragment.this.f57676p).mo58756a("phone_number", MusLoginPhonePasswordFragment.this.f57677q).mo58757a("use_whatsapp_code", this.f57695a).mo58757a("reset_ticker", MusLoginPhonePasswordFragment.this.f57685y).mo58753a();
                        if (baseMusLoginFragment != null) {
                            MusLoginPhonePasswordFragment.m72029d(this.f57695a);
                        }
                        baseMusLoginFragment.mo57501a(MusLoginPhonePasswordFragment.this.f57409h);
                        MusLoginPhonePasswordFragment.this.mo57503b(baseMusLoginFragment, false);
                    }
                } else if (eVar.f33702b == 1003 || eVar.f33702b == 1002) {
                    C21501aj.m72196a(Toast.makeText(MusLoginPhonePasswordFragment.this.getActivity(), R.string.cdl, 0));
                } else if (eVar.f33702b == 2027 || eVar.f33702b == 2028) {
                    if (TextUtils.isEmpty(eVar.f33703c)) {
                        str = MusLoginPhonePasswordFragment.this.getString(R.string.c6i);
                    } else {
                        str = eVar.f33703c;
                    }
                    C10761a.m31403c(MusLoginPhonePasswordFragment.this.getContext(), str).mo25750a();
                } else {
                    C10761a.m31403c(MusLoginPhonePasswordFragment.this.getContext(), C22338o.m73945a((C12707b) eVar)).mo25750a();
                }
                MusLoginPhonePasswordFragment.this.mo57502a(false);
                MusLoginPhonePasswordFragment.this.f57685y = false;
            }
        }

        public final void onSuccess(C12710e<C12836s> eVar) {
            C21235f.m71483a(0, MusLoginPhonePasswordFragment.this.f57686z, 0, "");
            if (MusLoginPhonePasswordFragment.this.isViewValid() && MusLoginPhonePasswordFragment.this.getContext() != null) {
                if (!C21297b.m71680c()) {
                    MusLoginPhonePasswordFragment.this.mo57613c(this.f57695a);
                } else {
                    MusLoginPhonePasswordFragment.this.mo57502a(false);
                    MusLoginPhonePasswordFragment.this.f57683w.setVisibility(8);
                    MusLoginPhonePasswordFragment.this.f57680t.setBackgroundColor(MusLoginPhonePasswordFragment.this.getResources().getColor(R.color.le));
                    if (C21297b.m71679b()) {
                        BaseMusLoginFragment baseMusLoginFragment = (BaseMusLoginFragment) C22334m.m73938a(MusSendCodeFragment.class, MusLoginPhonePasswordFragment.this.getArguments()).mo58756a("country_code_alpha_2", MusLoginPhonePasswordFragment.this.f57675o).mo58756a("country_code", MusLoginPhonePasswordFragment.this.f57676p).mo58756a("phone_number", MusLoginPhonePasswordFragment.this.f57677q).mo58757a("NEW_PHONE_USER", true).mo58757a("use_whatsapp_code", this.f57695a).mo58757a("reset_ticker", MusLoginPhonePasswordFragment.this.f57685y).mo58753a();
                        if (baseMusLoginFragment != null) {
                            MusLoginPhonePasswordFragment.m72029d(this.f57695a);
                        }
                        baseMusLoginFragment.mo57501a(MusLoginPhonePasswordFragment.this.f57409h);
                        MusLoginPhonePasswordFragment.this.mo57503b(baseMusLoginFragment, false);
                    } else {
                        BaseMusLoginFragment baseMusLoginFragment2 = (BaseMusLoginFragment) C22334m.m73938a(MusAgeGateFragment.class, MusLoginPhonePasswordFragment.this.getArguments()).mo58756a("country_code_alpha_2", MusLoginPhonePasswordFragment.this.f57675o).mo58756a("country_code", MusLoginPhonePasswordFragment.this.f57676p).mo58756a("phone_number", MusLoginPhonePasswordFragment.this.f57677q).mo58754a("init_page", 0).mo58757a("use_whatsapp_code", this.f57695a).mo58757a("reset_ticker", MusLoginPhonePasswordFragment.this.f57685y).mo58753a();
                        baseMusLoginFragment2.mo57501a(MusLoginPhonePasswordFragment.this.f57409h);
                        MusLoginPhonePasswordFragment.this.mo57503b(baseMusLoginFragment2, false);
                    }
                }
                MusLoginPhonePasswordFragment.this.f57685y = false;
            }
        }

        public C21453a(C21336m mVar) {
            super(mVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.MusLoginPhonePasswordFragment$b */
    class C21454b implements C21823a {
        /* renamed from: a */
        public final void mo57346a() {
            if (MusLoginPhonePasswordFragment.this.isViewValid() && MusLoginPhonePasswordFragment.this.getContext() != null) {
                MusLoginPhonePasswordFragment.this.mo57355c();
                MusLoginPhonePasswordFragment.this.mo57509e().mo57208a(C21169e.f56922g, (C12852m) new C12852m() {
                    public final void onError(C12710e<C12833p> eVar, int i) {
                    }

                    public final void onSuccess(C12710e<C12833p> eVar) {
                        if (MusLoginPhonePasswordFragment.this.isViewValid() && MusLoginPhonePasswordFragment.this.getContext() != null && eVar.f33709g != null && !TextUtils.isEmpty(((C12833p) eVar.f33709g).f33986a)) {
                            MusLoginPhonePasswordFragment.this.mo57354a(((C12833p) eVar.f33709g).f33986a, null, C21169e.f56922g, MusLoginPhonePasswordFragment.this.f57656A);
                        }
                    }
                });
            }
        }

        private C21454b() {
        }

        /* renamed from: a */
        public final void mo57347a(String str, int i) {
            if (MusLoginPhonePasswordFragment.this.isViewValid() && MusLoginPhonePasswordFragment.this.getContext() != null) {
                MusLoginPhonePasswordFragment.this.mo57355c();
                MusLoginPhonePasswordFragment.this.f57681u.mo57356Z_();
                if (MusLoginPhonePasswordFragment.this.f57682v == 0) {
                    MusLoginManager e = MusLoginPhonePasswordFragment.this.mo57509e();
                    StringBuilder sb = new StringBuilder();
                    sb.append(MusLoginPhonePasswordFragment.this.f57676p);
                    sb.append("-");
                    sb.append(MusLoginPhonePasswordFragment.this.f57677q);
                    e.mo57221c(sb.toString(), MusLoginPhonePasswordFragment.this.f57678r.getText().toString(), str, MusLoginPhonePasswordFragment.this.f57657B);
                    return;
                }
                if (MusLoginPhonePasswordFragment.this.f57682v == 1) {
                    MusLoginPhonePasswordFragment.this.mo57509e().mo57219b(MusLoginPhonePasswordFragment.this.f57684x, MusLoginPhonePasswordFragment.this.f57678r.getText().toString(), str, MusLoginPhonePasswordFragment.this.f57658C);
                }
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo57616j() {
        C42951au.m136343b(this.f57669O);
    }

    public void onPause() {
        super.onPause();
        KeyboardUtils.m77057c(this.f57678r);
    }

    public void onStart() {
        super.onStart();
        this.f57678r.postDelayed(new Runnable() {
            public final void run() {
                MusLoginPhonePasswordFragment.this.mo57500a((View) MusLoginPhonePasswordFragment.this.f57678r);
            }
        }, 500);
    }

    /* renamed from: n */
    private String m72036n() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f57676p);
        sb.append("-");
        sb.append(this.f57677q);
        return sb.toString();
    }

    /* renamed from: k */
    private boolean m72033k() {
        C21884a aVar;
        if (this.f57409h == null) {
            aVar = null;
        } else {
            aVar = this.f57409h.mo57191a(0);
        }
        if (aVar == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f57676p);
        sb.append("-");
        sb.append(this.f57677q);
        if (!TextUtils.equals(sb.toString(), aVar.f58585a) || aVar.f58586b.f59613b == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private void m72034l() {
        C6907h.m21524a("switch_to_sms_verification", (Map) null);
        if (C21247i.m71506a(this.f57676p)) {
            m72035m();
        } else if (m72033k()) {
            boolean e = C21247i.m71510e(m72036n());
            BaseMusLoginFragment baseMusLoginFragment = (BaseMusLoginFragment) C22334m.m73938a(MusSendCodeFragment.class, getArguments()).mo58756a("country_code_alpha_2", this.f57675o).mo58756a("country_code", this.f57676p).mo58756a("phone_number", this.f57677q).mo58757a("use_whatsapp_code", e).mo58753a();
            if (baseMusLoginFragment != null) {
                m72029d(e);
            }
            baseMusLoginFragment.mo57501a(this.f57409h);
            mo57503b(baseMusLoginFragment, false);
        } else {
            m72028a(false, true);
        }
    }

    /* renamed from: i */
    public final void mo57615i() {
        if (this.f57672R == null) {
            this.f57672R = getContext();
        }
        if (this.f57660E == null && this.f57672R != null) {
            C25712a aVar = new C25712a(this.f57672R);
            aVar.mo66614a((CharSequence[]) new String[]{getString(R.string.cc9), getString(R.string.cew)}, (OnClickListener) new C21500ai(this));
            this.f57660E = aVar.mo66610a();
        }
        if (this.f57660E != null && !this.f57660E.isShowing()) {
            this.f57660E.show();
        }
    }

    /* renamed from: m */
    private void m72035m() {
        String str;
        String string;
        if (getContext() != null) {
            boolean b = C21247i.m71507b(this.f57676p);
            if (this.f57669O == null) {
                String string2 = getString(R.string.dly);
                String string3 = getString(R.string.dlv, m72036n());
                if (b) {
                    str = getString(R.string.dlx);
                } else {
                    str = getString(R.string.dlw);
                }
                if (b) {
                    string = getString(R.string.dlw);
                } else {
                    string = getString(R.string.dlx);
                }
                String str2 = string;
                C22158b bVar = new C22158b(string2, string3, str, str2, this.f57413m, m72036n());
                this.f57669O = new C22156a(getContext(), bVar);
            }
            this.f57669O.f59195a = new C21497af(this);
            this.f57669O.f59196b = new C21498ag(this, b);
            this.f57669O.f59197c = new C21499ah(this, b);
            C42951au.m136342a(this.f57669O);
        }
    }

    /* renamed from: a */
    public final void mo57608a() {
        String str;
        String str2;
        this.f57681u.mo57356Z_();
        mo57510f();
        C21221f fVar = new C21221f();
        if (this.f57682v == 0) {
            str = "phone";
        } else {
            str = "email";
        }
        fVar.mo57146b(str).mo57145a(this.f57411k).mo57141b();
        String str3 = "login_submit";
        C21102b a = new C21102b().mo56946a("enter_method", C21592t.f57969a).mo56946a("enter_from", C21592t.f57970b).mo56946a("enter_type", this.f57413m).mo56946a("group_id", C21220e.m71415a(getArguments())).mo56946a("log_pb", C21220e.m71418b(getArguments()));
        String str4 = "platform";
        if (this.f57682v == 0) {
            str2 = "phone";
        } else {
            str2 = "email";
        }
        C6907h.m21524a(str3, (Map) a.mo56946a(str4, str2).f56672a);
        if (this.f57682v == 0) {
            MusLoginManager e = mo57509e();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f57676p);
            sb.append("-");
            sb.append(this.f57677q);
            e.mo57221c(sb.toString(), this.f57678r.getText().toString(), "", this.f57657B);
            return;
        }
        if (this.f57682v == 1) {
            mo57509e().mo57219b(this.f57684x, this.f57678r.getText().toString(), "", this.f57658C);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo57614d(View view) {
        m72034l();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f57672R = activity;
    }

    /* renamed from: d */
    public static void m72029d(boolean z) {
        if (z) {
            C6907h.m21524a("phone_login_enter_whatsapp_code", (Map) null);
        } else {
            C6907h.m21524a("phone_login_enter_sms", (Map) null);
        }
    }

    /* renamed from: a */
    public final void mo57610a(String str) {
        this.f57683w.setVisibility(0);
        this.f57663H.setText(str);
    }

    /* renamed from: a */
    private void m72027a(View.OnClickListener onClickListener) {
        this.f57659D.setOnTouchListener(new C34032a(0.5f, 150, null));
        this.f57659D.setOnClickListener(onClickListener);
    }

    /* renamed from: f */
    private void m72032f(boolean z) {
        String str;
        if (z) {
            str = "phone_verification_click_whatsapp";
        } else {
            str = "phone_verification_click_sms";
        }
        C6907h.m21524a(str, (Map) new C21102b().mo56946a("enter_type", this.f57413m).f56672a);
    }

    /* renamed from: e */
    private void m72031e(boolean z) {
        if (m72033k()) {
            if ((!C21247i.m71510e(m72036n()) || !z) && (C21247i.m71510e(m72036n()) || z)) {
                this.f57685y = true;
            } else {
                boolean e = C21247i.m71510e(m72036n());
                BaseMusLoginFragment baseMusLoginFragment = (BaseMusLoginFragment) C22334m.m73938a(MusSendCodeFragment.class, getArguments()).mo58756a("country_code_alpha_2", this.f57675o).mo58756a("country_code", this.f57676p).mo58756a("phone_number", this.f57677q).mo58757a("use_whatsapp_code", e).mo58753a();
                if (baseMusLoginFragment != null) {
                    m72029d(e);
                }
                baseMusLoginFragment.mo57501a(this.f57409h);
                mo57503b(baseMusLoginFragment, false);
                C42951au.m136343b(this.f57669O);
                m72032f(z);
            }
        }
        m72028a(z, false);
        C42951au.m136343b(this.f57669O);
        m72032f(z);
    }

    /* renamed from: c */
    public final void mo57613c(boolean z) {
        mo57502a(false);
        this.f57683w.setVisibility(8);
        this.f57680t.setBackgroundColor(getResources().getColor(R.color.le));
        BaseMusLoginFragment baseMusLoginFragment = (BaseMusLoginFragment) C22334m.m73938a(MusSendCodeFragment.class, getArguments()).mo58756a("country_code_alpha_2", this.f57675o).mo58756a("country_code", this.f57676p).mo58756a("phone_number", this.f57677q).mo58757a("use_whatsapp_code", z).mo58757a("reset_ticker", this.f57685y).mo58753a();
        if (baseMusLoginFragment != null) {
            m72029d(z);
        }
        baseMusLoginFragment.mo57501a(this.f57409h);
        mo57503b(baseMusLoginFragment, false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f57675o = arguments.getString("country_code_alpha_2");
            this.f57676p = arguments.getString("country_code");
            this.f57677q = arguments.getString("phone_number");
            this.f57684x = arguments.getString("email");
            this.f57682v = arguments.getInt("login_type", 0);
            this.f57661F = arguments.getBoolean("from_register", false);
        }
        this.f57670P = new C21453a(this);
        this.f57656A = new C21454b();
        this.f57657B = new C21273d() {
            /* renamed from: a */
            public final void mo57250a() {
                C21231d.m71462a(false, 1039, "not trust device");
                MusLoginPhonePasswordFragment.this.f57681u.mo57357a();
                BaseMusLoginFragment baseMusLoginFragment = (BaseMusLoginFragment) C22334m.m73938a(MusSendCodeFragment.class, MusLoginPhonePasswordFragment.this.getArguments()).mo58756a("country_code_alpha_2", MusLoginPhonePasswordFragment.this.f57675o).mo58756a("country_code", MusLoginPhonePasswordFragment.this.f57676p).mo58756a("phone_number", MusLoginPhonePasswordFragment.this.f57677q).mo58754a("code_type", 2).mo58753a();
                baseMusLoginFragment.mo57501a(MusLoginPhonePasswordFragment.this.f57409h);
                MusLoginPhonePasswordFragment.this.mo57503b(baseMusLoginFragment, false);
            }

            /* renamed from: a */
            public final void mo57251a(String str) {
                super.mo57251a(str);
                MusLoginPhonePasswordFragment.this.f57681u.mo57357a();
            }

            /* renamed from: c */
            public final void mo57258c(String str) {
                C21231d.m71462a(false, 1056, str);
                MusLoginPhonePasswordFragment.this.f57681u.mo57357a();
                C10761a.m31396b(MusLoginPhonePasswordFragment.this.getContext(), str, 0).mo25750a();
            }

            /* renamed from: b */
            public final void mo57256b(String str) {
                if (MusLoginPhonePasswordFragment.this.f57682v == 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(MusLoginPhonePasswordFragment.this.f57676p);
                    sb.append("-");
                    sb.append(MusLoginPhonePasswordFragment.this.f57677q);
                    MusLoginVerifyThirdFragment a = MusLoginVerifyThirdFragment.m72086a("", "email", sb.toString(), str, MusLoginPhonePasswordFragment.this.f57684x, MusLoginPhonePasswordFragment.this.f57678r.getText().toString(), MusLoginPhonePasswordFragment.this.f57411k, MusLoginPhonePasswordFragment.this.f57412l);
                    a.mo57501a((C21524n) MusLoginPhonePasswordFragment.this.getActivity());
                    MusLoginPhonePasswordFragment.this.mo57503b(a, false);
                }
            }

            /* renamed from: a */
            public final void mo57253a(JSONObject jSONObject) {
                if (MusLoginPhonePasswordFragment.this.isViewValid() && MusLoginPhonePasswordFragment.this.getContext() != null) {
                    MusLoginPhonePasswordFragment.this.f57681u.mo57357a();
                    new C21222g().mo57149b("phone").mo57148a("1").mo57141b();
                    C6907h.m21524a("login_success", (Map) new C21102b().mo56946a("enter_method", C21592t.f57969a).mo56946a("enter_from", C21592t.f57970b).mo56946a("enter_type", MusLoginPhonePasswordFragment.this.f57413m).mo56946a("platform", "phone").mo56944a("status", 1).mo56944a("_perf_monitor", 1).f56672a);
                    MusLoginPhonePasswordFragment.this.f57683w.setVisibility(8);
                    MusLoginPhonePasswordFragment.this.f57680t.setBackgroundColor(MusLoginPhonePasswordFragment.this.getResources().getColor(R.color.le));
                    C21170a.m71337a(11);
                    try {
                        new C18893a();
                        MusLoginPhonePasswordFragment.m71873a(jSONObject.optJSONObject("data"), (C12898b) C18893a.m61663b(jSONObject));
                    } catch (Exception unused) {
                    }
                    if (MusLoginPhonePasswordFragment.this.f57409h != null) {
                        Bundle bundle = new Bundle(MusLoginPhonePasswordFragment.this.getArguments());
                        bundle.putString("platform", "mobile");
                        bundle.putString("login_path", "phone_password");
                        MusLoginPhonePasswordFragment.this.f57409h.mo57193a(bundle);
                    }
                    if (MusLoginPhonePasswordFragment.this.getArguments() != null && MusLoginPhonePasswordFragment.this.getArguments().getBoolean("need_remember_login_method", true)) {
                        PhoneLoginMethod phoneLoginMethod = new PhoneLoginMethod(C21671bd.m72536d(), LoginMethodName.PHONE_NUMBER_PASS, MusLoginPhonePasswordFragment.this.f57675o, MusLoginPhonePasswordFragment.this.f57676p, MusLoginPhonePasswordFragment.this.f57677q);
                        C21579s.m72313b((BaseLoginMethod) phoneLoginMethod);
                    }
                }
            }

            /* renamed from: a */
            public final void mo57252a(String str, String str2) {
                if (MusLoginPhonePasswordFragment.this.isViewValid() && MusLoginPhonePasswordFragment.this.getContext() != null) {
                    MusLoginPhonePasswordFragment.this.f57681u.mo57357a();
                    MusLoginPhonePasswordFragment.this.mo57354a(str, str2, C21169e.f56922g, MusLoginPhonePasswordFragment.this.f57656A);
                }
            }

            /* renamed from: b */
            public final void mo57257b(String str, String str2) {
                if (MusLoginPhonePasswordFragment.this.f57682v == 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(MusLoginPhonePasswordFragment.this.f57676p);
                    sb.append("-");
                    sb.append(MusLoginPhonePasswordFragment.this.f57677q);
                    MusLoginSecureSendCodeFragment a = MusLoginSecureSendCodeFragment.m72069a("", "email", sb.toString(), str, str2, MusLoginPhonePasswordFragment.this.f57684x, MusLoginPhonePasswordFragment.this.f57678r.getText().toString(), MusLoginPhonePasswordFragment.this.f57411k, MusLoginPhonePasswordFragment.this.f57412l);
                    a.mo57501a((C21524n) MusLoginPhonePasswordFragment.this.getActivity());
                    MusLoginPhonePasswordFragment.this.mo57499a((Fragment) a, false);
                }
            }

            /* renamed from: a */
            public final void mo57254a(JSONObject jSONObject, int i, String str) {
                C21231d.m71462a(false, i, str);
                if (MusLoginPhonePasswordFragment.this.isViewValid() && MusLoginPhonePasswordFragment.this.getContext() != null) {
                    MusLoginPhonePasswordFragment.this.f57681u.mo57357a();
                    C6907h.m21524a("login_failure", (Map) new C21102b().mo56946a("platform", "phone").mo56946a("enter_method", MusLoginPhonePasswordFragment.this.f57412l).mo56946a("enter_type", MusLoginPhonePasswordFragment.this.f57413m).mo56946a("carrier", "").mo56944a("error_code", i).f56672a);
                    new C21222g().mo57149b("phone").mo57148a("0").mo57150c(String.valueOf(i)).mo57151d("/passport/user/login/").mo57141b();
                    if (!C21578r.f57916d.contains(Integer.valueOf(i))) {
                        if (i == 1034) {
                            MusLoginPhonePasswordFragment musLoginPhonePasswordFragment = MusLoginPhonePasswordFragment.this;
                            if (TextUtils.isEmpty(str)) {
                                str = MusLoginPhonePasswordFragment.this.getString(R.string.c6c);
                            }
                            musLoginPhonePasswordFragment.mo57610a(str);
                        } else if (i == 2006 && TextUtils.isEmpty(str)) {
                            MusLoginPhonePasswordFragment.this.mo57610a(MusLoginPhonePasswordFragment.this.getString(R.string.c6b));
                        } else if (i == 2027 || i == 2028) {
                            if (TextUtils.isEmpty(str)) {
                                str = MusLoginPhonePasswordFragment.this.getString(R.string.c6i);
                            }
                            C10761a.m31403c(MusLoginPhonePasswordFragment.this.getContext(), str).mo25750a();
                        } else {
                            Context context = MusLoginPhonePasswordFragment.this.getContext();
                            if (TextUtils.isEmpty(str)) {
                                str = MusLoginPhonePasswordFragment.this.getString(R.string.c6c);
                            }
                            C10761a.m31396b(context, str, 0).mo25750a();
                        }
                    }
                }
            }

            /* renamed from: a */
            public final void mo57255a(JSONObject jSONObject, String str, String str2) {
                C21231d.m71462a(false, Integer.parseInt(str), str2);
                if (MusLoginPhonePasswordFragment.this.isViewValid() && MusLoginPhonePasswordFragment.this.getContext() != null) {
                    C6907h.m21524a("login_failure", (Map) new C21102b().mo56946a("platform", "phone").mo56946a("enter_method", MusLoginPhonePasswordFragment.this.f57412l).mo56946a("enter_type", MusLoginPhonePasswordFragment.this.f57413m).mo56946a("carrier", "").mo56946a("error_code", str).f56672a);
                    MusLoginPhonePasswordFragment.this.f57681u.mo57357a();
                    new C21222g().mo57149b("phone").mo57148a("0").mo57150c(str).mo57151d("/passport/user/login/").mo57141b();
                    MusLoginPhonePasswordFragment.this.f57680t.setBackgroundColor(MusLoginPhonePasswordFragment.this.getResources().getColor(R.color.a14));
                    MusLoginPhonePasswordFragment musLoginPhonePasswordFragment = MusLoginPhonePasswordFragment.this;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = MusLoginPhonePasswordFragment.this.getString(R.string.c6c);
                    }
                    musLoginPhonePasswordFragment.mo57610a(str2);
                }
            }
        };
        this.f57658C = new C21273d() {
            /* renamed from: a */
            public final void mo57250a() {
                C21231d.m71459a(1, 1039, "not trust device");
                MusLoginPhonePasswordFragment.this.f57681u.mo57357a();
            }

            /* renamed from: a */
            public final void mo57251a(String str) {
                super.mo57251a(str);
                if (MusLoginPhonePasswordFragment.this.getActivity() != null) {
                    MusLoginPhonePasswordFragment.this.f57681u.mo57357a();
                }
            }

            /* renamed from: c */
            public final void mo57258c(String str) {
                C21231d.m71459a(1, 1056, str);
                MusLoginPhonePasswordFragment.this.f57681u.mo57357a();
                C10761a.m31396b(MusLoginPhonePasswordFragment.this.getContext(), str, 0).mo25750a();
            }

            /* renamed from: b */
            public final void mo57256b(String str) {
                if (MusLoginPhonePasswordFragment.this.f57682v == 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(MusLoginPhonePasswordFragment.this.f57676p);
                    sb.append("-");
                    sb.append(MusLoginPhonePasswordFragment.this.f57677q);
                    MusLoginVerifyThirdFragment a = MusLoginVerifyThirdFragment.m72086a("", "email", sb.toString(), str, MusLoginPhonePasswordFragment.this.f57684x, MusLoginPhonePasswordFragment.this.f57678r.getText().toString(), MusLoginPhonePasswordFragment.this.f57411k, MusLoginPhonePasswordFragment.this.f57412l);
                    a.mo57501a((C21524n) MusLoginPhonePasswordFragment.this.getActivity());
                    MusLoginPhonePasswordFragment.this.mo57503b(a, false);
                }
            }

            /* renamed from: a */
            public final void mo57253a(JSONObject jSONObject) {
                if (MusLoginPhonePasswordFragment.this.isViewValid() && MusLoginPhonePasswordFragment.this.getContext() != null) {
                    if (MusLoginPhonePasswordFragment.this.getActivity() instanceof MusLoginActivity) {
                        ((MusLoginActivity) MusLoginPhonePasswordFragment.this.getActivity()).f57129a = null;
                    }
                    MusLoginPhonePasswordFragment.this.f57681u.mo57357a();
                    MusLoginPhonePasswordFragment.this.f57683w.setVisibility(8);
                    MusLoginPhonePasswordFragment.this.f57680t.setBackgroundColor(MusLoginPhonePasswordFragment.this.getResources().getColor(R.color.le));
                    new C21222g().mo57149b("email").mo57148a("1").mo57141b();
                    C6907h.m21524a("login_success", (Map) new C21102b().mo56946a("enter_method", MusLoginPhonePasswordFragment.this.f57412l).mo56946a("enter_from", MusLoginPhonePasswordFragment.this.f57411k).mo56946a("platform", "email").mo56946a("enter_type", MusLoginPhonePasswordFragment.this.f57413m).mo56944a("status", 1).mo56944a("_perf_monitor", 1).f56672a);
                    C21170a.m71337a(11);
                    try {
                        new C18893a();
                        MusLoginPhonePasswordFragment.m71873a(jSONObject.optJSONObject("data"), (C12898b) C18893a.m61663b(jSONObject));
                    } catch (Exception unused) {
                    }
                    if (MusLoginPhonePasswordFragment.this.f57409h != null) {
                        Bundle bundle = new Bundle(MusLoginPhonePasswordFragment.this.getArguments());
                        bundle.putString("platform", "mobile");
                        bundle.putString("login_path", "email_or_username");
                        MusLoginPhonePasswordFragment.this.f57409h.mo57193a(bundle);
                    }
                    if (MusLoginPhonePasswordFragment.this.getArguments() != null && MusLoginPhonePasswordFragment.this.getArguments().getBoolean("need_remember_login_method", true)) {
                        C21579s.m72313b((BaseLoginMethod) new AccountPassLoginMethod(C21671bd.m72536d(), LoginMethodName.EMAIL_PASS, MusLoginPhonePasswordFragment.this.f57684x));
                    }
                }
            }

            /* renamed from: a */
            public final void mo57252a(String str, String str2) {
                if (MusLoginPhonePasswordFragment.this.isViewValid() && MusLoginPhonePasswordFragment.this.getContext() != null) {
                    MusLoginPhonePasswordFragment.this.f57681u.mo57357a();
                    MusLoginPhonePasswordFragment.this.mo57354a(str, str2, C21169e.f56922g, MusLoginPhonePasswordFragment.this.f57656A);
                }
            }

            /* renamed from: b */
            public final void mo57257b(String str, String str2) {
                if (MusLoginPhonePasswordFragment.this.f57682v == 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(MusLoginPhonePasswordFragment.this.f57676p);
                    sb.append("-");
                    sb.append(MusLoginPhonePasswordFragment.this.f57677q);
                    MusLoginSecureSendCodeFragment a = MusLoginSecureSendCodeFragment.m72069a("", "email", sb.toString(), str, str2, MusLoginPhonePasswordFragment.this.f57684x, MusLoginPhonePasswordFragment.this.f57678r.getText().toString(), MusLoginPhonePasswordFragment.this.f57411k, MusLoginPhonePasswordFragment.this.f57412l);
                    a.mo57501a((C21524n) MusLoginPhonePasswordFragment.this.getActivity());
                    MusLoginPhonePasswordFragment.this.mo57503b(a, false);
                }
            }

            /* renamed from: a */
            public final void mo57255a(JSONObject jSONObject, String str, String str2) {
                C21231d.m71459a(1, Integer.parseInt(str), str2);
                if (MusLoginPhonePasswordFragment.this.isViewValid() && MusLoginPhonePasswordFragment.this.getContext() != null) {
                    MusLoginPhonePasswordFragment.this.f57681u.mo57357a();
                    new C21222g().mo57149b("email").mo57150c(str).mo57148a("0").mo57151d("/passport/user/login/").mo57141b();
                    MusLoginPhonePasswordFragment.this.f57680t.setBackgroundColor(MusLoginPhonePasswordFragment.this.getResources().getColor(R.color.a14));
                    MusLoginPhonePasswordFragment musLoginPhonePasswordFragment = MusLoginPhonePasswordFragment.this;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = MusLoginPhonePasswordFragment.this.getString(R.string.c6c);
                    }
                    musLoginPhonePasswordFragment.mo57610a(str2);
                }
            }

            /* renamed from: a */
            public final void mo57254a(JSONObject jSONObject, int i, String str) {
                C21231d.m71459a(1, i, str);
                if (MusLoginPhonePasswordFragment.this.isViewValid() && MusLoginPhonePasswordFragment.this.getContext() != null) {
                    MusLoginPhonePasswordFragment.this.f57681u.mo57357a();
                    new C21222g().mo57149b("email").mo57148a("0").mo57150c(String.valueOf(i)).mo57151d("/passport/user/login/").mo57141b();
                    if (!C21578r.f57916d.contains(Integer.valueOf(i))) {
                        if (i == 1034) {
                            MusLoginPhonePasswordFragment musLoginPhonePasswordFragment = MusLoginPhonePasswordFragment.this;
                            if (TextUtils.isEmpty(str)) {
                                str = MusLoginPhonePasswordFragment.this.getString(R.string.c6c);
                            }
                            musLoginPhonePasswordFragment.mo57610a(str);
                        } else if (i == 2006 && TextUtils.isEmpty(str)) {
                            MusLoginPhonePasswordFragment.this.mo57610a(MusLoginPhonePasswordFragment.this.getString(R.string.c6b));
                        } else if (i == 2027 || i == 2028) {
                            if (TextUtils.isEmpty(str)) {
                                str = MusLoginPhonePasswordFragment.this.getString(R.string.c6i);
                            }
                            C10761a.m31403c(MusLoginPhonePasswordFragment.this.getContext(), str).mo25750a();
                        } else {
                            Context context = MusLoginPhonePasswordFragment.this.getContext();
                            if (TextUtils.isEmpty(str)) {
                                str = MusLoginPhonePasswordFragment.this.getString(R.string.c6c);
                            }
                            C10761a.m31396b(context, str, 0).mo25750a();
                        }
                    }
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo57505b(boolean z) {
        if (this.f57674T == 0) {
            this.f57674T = this.f57664J.getBottom() - this.f57406e.getBottom();
        }
        if (this.f57673S == 0) {
            this.f57673S = this.f57664J.getTop() - this.f57406e.getBottom();
        }
        if (!z) {
            this.f57666L.animate().alpha(0.0f).setDuration(110).start();
            this.f57667M.animate().alpha(0.0f).setDuration(110).start();
            this.f57664J.animate().translationY(0.0f).alpha(1.0f).setStartDelay(110).setDuration(220).start();
            this.f57668N.animate().translationY(0.0f).setStartDelay(110).setDuration(220).start();
        } else if (this.f57681u.getTop() - this.f57668N.getBottom() <= f57404i) {
            this.f57666L.animate().alpha(1.0f).setDuration(110).setStartDelay(110).start();
            this.f57667M.animate().alpha(1.0f).setDuration(110).setStartDelay(110).start();
            this.f57664J.animate().translationY((float) (-this.f57673S)).alpha(0.0f).setDuration(220).start();
            this.f57668N.animate().translationY((float) (-this.f57674T)).setDuration(220).start();
        }
    }

    /* renamed from: e */
    private void m72030e(View view) {
        int i;
        this.f57659D = (TextView) view.findViewById(R.id.c_m);
        this.f57678r = (EditText) view.findViewById(R.id.agc);
        this.f57680t = view.findViewById(R.id.afz);
        this.f57679s = view.findViewById(R.id.wv);
        this.f57681u = (LoginButton) view.findViewById(R.id.qm);
        this.f57681u.setLoginBackgroundRes(R.drawable.bav);
        this.f57681u.setAutoMirrored(false);
        this.f57681u.setLoadingBackground(R.drawable.bba);
        this.f57662G = view.findViewById(R.id.qp);
        this.f57683w = view.findViewById(R.id.ehj);
        this.f57663H = (TextView) view.findViewById(R.id.ehi);
        this.f57664J = (TextView) view.findViewById(R.id.title);
        this.f57665K = (TextView) view.findViewById(R.id.adu);
        this.f57666L = view.findViewById(R.id.dmu);
        this.f57667M = view.findViewById(R.id.dmv);
        this.f57668N = view.findViewById(R.id.a24);
        C6907h.m21524a("phone_login_enter_password", (Map) new C21102b().f56672a);
        this.f57679s.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MusLoginPhonePasswordFragment.this.f57678r.setText("");
                MusLoginPhonePasswordFragment.this.f57679s.setVisibility(8);
            }
        });
        View view2 = this.f57662G;
        if (this.f57661F) {
            i = 8;
        } else {
            i = 0;
        }
        view2.setVisibility(i);
        View findViewById = view.findViewById(R.id.qq);
        findViewById.setOnTouchListener(new C34032a(0.5f, 150, null));
        findViewById.setOnClickListener(new C21496ae(this));
        this.f57678r.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                int i;
                boolean isEmpty = TextUtils.isEmpty(editable.toString());
                View view = MusLoginPhonePasswordFragment.this.f57679s;
                if (isEmpty) {
                    i = 8;
                } else {
                    i = 0;
                }
                view.setVisibility(i);
                MusLoginPhonePasswordFragment.this.f57681u.setEnabled(!isEmpty);
                if (isEmpty) {
                    MusLoginPhonePasswordFragment.this.f57683w.setVisibility(8);
                    MusLoginPhonePasswordFragment.this.f57680t.setBackgroundColor(MusLoginPhonePasswordFragment.this.getResources().getColor(R.color.le));
                }
            }
        });
        this.f57678r.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                int i;
                View view2 = MusLoginPhonePasswordFragment.this.f57679s;
                if (!z || TextUtils.isEmpty(MusLoginPhonePasswordFragment.this.f57678r.getText())) {
                    i = 8;
                } else {
                    i = 0;
                }
                view2.setVisibility(i);
            }
        });
        this.f57681u.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MusLoginPhonePasswordFragment.this.mo57608a();
            }
        });
        m72027a((View.OnClickListener) new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MusLoginPhonePasswordFragment.this.mo57615i();
            }
        });
        if (this.f57682v == 1) {
            this.f57664J.setText(R.string.ce0);
            this.f57665K.setVisibility(0);
            this.f57665K.setText(C1642a.m8034a(getResources().getString(R.string.cc_), new Object[]{this.f57684x}));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo57612b(boolean z, View view) {
        m72031e(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo57611a(boolean z, View view) {
        m72031e(!z);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f57671Q = C12798d.m37186a(getContext());
        m72030e(view);
    }

    /* renamed from: a */
    private void m72028a(boolean z, boolean z2) {
        int i;
        String str;
        String str2;
        mo57502a(true);
        if (!C21297b.m71680c()) {
            i = C21169e.f56936u;
        } else {
            i = C21169e.f56916a;
        }
        this.f57686z = i;
        boolean a = C21241d.m71496a();
        this.f57670P.f57695a = z;
        if (z) {
            C21112b.m71186a(getActivity(), m72036n(), "", this.f57686z, 0, "", 1, a, this.f57670P).mo31357d();
        } else {
            this.f57671Q.mo31184a(m72036n(), "", this.f57686z, 0, "", 1, a ? 1 : 0, (C12855p) this.f57670P);
        }
        if (z) {
            str = "send_whatsapp_code";
        } else {
            str = "send_sms";
        }
        C21102b bVar = new C21102b();
        String str3 = "send_method";
        if (z2) {
            str2 = "auto_system";
        } else {
            str2 = "user_click";
        }
        C6907h.m21524a(str, (Map) bVar.mo56946a(str3, str2).mo56944a("send_reason", C21169e.f56916a).mo56946a("enter_method", C21592t.f57969a).mo56946a("enter_from", C21592t.f57970b).f56672a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo57609a(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            C6907h.m21524a("click_forget_password", (Map) new C21102b().mo56946a("platform", "email").f56672a);
            startActivityForResult(new Intent(this.f57672R, FindPswByEmailActivity.class), PreloadTask.BYTE_UNIT_NUMBER);
        } else if (i == 1) {
            C6907h.m21524a("click_forget_password", (Map) new C21102b().mo56946a("platform", "phone").f56672a);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f57676p);
            sb.append("-");
            sb.append(this.f57677q);
            mo57506c(C22334m.m73938a(NewTiktokResetPasswordFragment.class, getArguments()).mo58756a("phone_number", sb.toString()).mo58756a("enter_type", this.f57413m).mo58753a(), false);
        }
        dialogInterface.dismiss();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.aeh, viewGroup, false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1024) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && this.f57409h != null) {
            Bundle bundle = new Bundle(getArguments());
            bundle.putString("platform", "email");
            this.f57409h.mo57193a(bundle);
        }
    }
}
