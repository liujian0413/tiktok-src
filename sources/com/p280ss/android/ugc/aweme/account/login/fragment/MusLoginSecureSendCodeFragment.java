package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.os.Bundle;
import android.text.TextUtils;
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
import com.bytedance.sdk.account.p668i.C12898b;
import com.p280ss.android.account.C18892b.C18893a;
import com.p280ss.android.ugc.aweme.account.C21169e;
import com.p280ss.android.ugc.aweme.account.login.C21592t;
import com.p280ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p280ss.android.ugc.aweme.account.login.p952a.C21273d;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p946i.C21222g;
import com.p280ss.android.ugc.aweme.account.p951l.C21241d;
import com.p280ss.android.ugc.aweme.account.util.C22334m;
import com.p280ss.android.ugc.aweme.account.util.C22338o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.MusLoginSecureSendCodeFragment */
public class MusLoginSecureSendCodeFragment extends BaseMusSecureSendCodeFragment {

    /* renamed from: A */
    public String f57699A;

    /* renamed from: B */
    public String f57700B;

    /* renamed from: C */
    public C21273d f57701C;

    /* renamed from: D */
    private int f57702D = 22;

    /* renamed from: E */
    private C12728d f57703E;

    /* renamed from: x */
    public String f57704x;

    /* renamed from: y */
    public String f57705y;

    /* renamed from: z */
    public String f57706z;

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo57557i() {
        if (this.mCountDownView.getRemainTick() <= 0) {
            this.mCountDownView.mo58213a(3);
        }
    }

    /* renamed from: j */
    private void m72070j() {
        this.tipTitle.setText(getString(R.string.cgb));
        this.mTvHint.setText(C1642a.m8034a(getString(R.string.cga), new Object[]{this.f57508u}));
        this.mCountDownView.mo58214a(3, this.f57508u);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo57553a() {
        this.mCountDownView.mo58213a(3);
        mo57509e().mo57209a(this.f57702D, this.f57507q, C21241d.m71496a(), this.f57504n);
        C6907h.m21524a("send_sms", (Map) new C21102b().mo56946a("send_method", "resend").mo56944a("send_reason", this.f57702D).mo56946a("enter_method", this.f57412l).mo56946a("enter_from", this.f57411k).f56672a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo57555b(String str) {
        this.mBtnLogin.mo57356Z_();
        this.f57703E.mo31180a(str, this.f57702D, true, 0, this.f57507q, (C12859t) new C12859t() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public void onNeedSecureCaptcha(C12713h hVar) {
                super.onNeedSecureCaptcha(hVar);
                if (MusLoginSecureSendCodeFragment.this.isViewValid() && MusLoginSecureSendCodeFragment.this.mBtnLogin != null) {
                    MusLoginSecureSendCodeFragment.this.mBtnLogin.mo57357a();
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(C12713h hVar) {
                if (MusLoginSecureSendCodeFragment.this.mBtnLogin != null) {
                    MusLoginSecureSendCodeFragment.this.mBtnLogin.mo57357a();
                }
                if (MusLoginSecureSendCodeFragment.this.f57700B.equals("email")) {
                    MusLoginSecureSendCodeFragment.this.mo57509e().mo57220b(MusLoginSecureSendCodeFragment.this.f57704x, MusLoginSecureSendCodeFragment.this.f57705y, hVar.f33722g, "", MusLoginSecureSendCodeFragment.this.f57701C);
                    return;
                }
                if (MusLoginSecureSendCodeFragment.this.f57700B.equals("username")) {
                    MusLoginSecureSendCodeFragment.this.mo57509e().mo57216a(MusLoginSecureSendCodeFragment.this.f57699A, MusLoginSecureSendCodeFragment.this.f57705y, hVar.f33722g, "", MusLoginSecureSendCodeFragment.this.f57701C);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onError(C12713h hVar, int i) {
                if (MusLoginSecureSendCodeFragment.this.mBtnLogin != null) {
                    MusLoginSecureSendCodeFragment.this.mBtnLogin.mo57357a();
                }
                C10761a.m31403c(MusLoginSecureSendCodeFragment.this.getContext(), C22338o.m73945a((C12707b) hVar)).mo25750a();
            }
        });
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f57704x = getArguments().getString("email");
            this.f57705y = getArguments().getString("password");
            this.f57700B = getArguments().getString("logintype");
            this.f57706z = getArguments().getString("countrycodePhone");
            this.f57699A = getArguments().getString("username");
        }
        C6907h.m21524a("account_verification_show", (Map) new C21102b().mo56946a("enter_method", this.f57412l).mo56946a("enter_from", this.f57411k).mo56946a("verification_method", "sms").f56672a);
        this.f57701C = new C21273d() {
            /* renamed from: a */
            public final void mo57255a(JSONObject jSONObject, String str, String str2) {
            }

            /* renamed from: b */
            public final void mo57256b(String str) {
            }

            /* renamed from: b */
            public final void mo57257b(String str, String str2) {
            }

            /* renamed from: a */
            public final void mo57250a() {
                if (MusLoginSecureSendCodeFragment.this.mBtnLogin != null) {
                    MusLoginSecureSendCodeFragment.this.mBtnLogin.mo57357a();
                }
                if (!TextUtils.isEmpty(MusLoginSecureSendCodeFragment.this.f57706z)) {
                    String str = MusLoginSecureSendCodeFragment.this.f57706z.split("-")[0];
                    BaseMusLoginFragment baseMusLoginFragment = (BaseMusLoginFragment) C22334m.m73937a(MusSendCodeFragment.class).mo58756a("country_code", str).mo58756a("phone_number", MusLoginSecureSendCodeFragment.this.f57706z.split("-")[1]).mo58754a("code_type", 2).mo58753a();
                    baseMusLoginFragment.mo57501a(MusLoginSecureSendCodeFragment.this.f57409h);
                    MusLoginSecureSendCodeFragment.this.mo57503b(baseMusLoginFragment, false);
                }
            }

            /* renamed from: c */
            public final void mo57258c(String str) {
                C10761a.m31396b(MusLoginSecureSendCodeFragment.this.getContext(), str, 0).mo25750a();
            }

            /* renamed from: a */
            public final void mo57251a(String str) {
                super.mo57251a(str);
                if (MusLoginSecureSendCodeFragment.this.mBtnLogin != null) {
                    MusLoginSecureSendCodeFragment.this.mBtnLogin.mo57357a();
                }
            }

            /* renamed from: a */
            public final void mo57253a(JSONObject jSONObject) {
                if (MusLoginSecureSendCodeFragment.this.isViewValid() && MusLoginSecureSendCodeFragment.this.getContext() != null) {
                    MusLoginSecureSendCodeFragment.this.mo57502a(false);
                    if (MusLoginSecureSendCodeFragment.this.getActivity() instanceof MusLoginActivity) {
                        ((MusLoginActivity) MusLoginSecureSendCodeFragment.this.getActivity()).f57129a = null;
                    }
                    if (MusLoginSecureSendCodeFragment.this.f57700B.equals("email")) {
                        new C21222g().mo57149b("email").mo57148a("1").mo57141b();
                        C6907h.m21524a("login_success", (Map) new C21102b().mo56946a("enter_method", C21592t.f57969a).mo56946a("enter_from", C21592t.f57970b).mo56946a("platform", "email").mo56946a("enter_type", MusLoginSecureSendCodeFragment.this.f57413m).mo56944a("status", 1).mo56944a("_perf_monitor", 1).f56672a);
                    } else if (MusLoginSecureSendCodeFragment.this.f57700B.equals("username")) {
                        C6907h.m21524a("login_success", (Map) new C21102b().mo56946a("enter_method", MusLoginSecureSendCodeFragment.this.f57412l).mo56946a("enter_from", MusLoginSecureSendCodeFragment.this.f57411k).mo56946a("enter_type", MusLoginSecureSendCodeFragment.this.f57413m).mo56946a("platform", "handle").mo56944a("status", 1).mo56944a("_perf_monitor", 1).f56672a);
                    }
                    try {
                        new C18893a();
                        MusLoginSecureSendCodeFragment.m71873a(jSONObject.optJSONObject("data"), (C12898b) C18893a.m61663b(jSONObject));
                    } catch (Exception unused) {
                    }
                    if (MusLoginSecureSendCodeFragment.this.f57409h != null) {
                        Bundle bundle = new Bundle(MusLoginSecureSendCodeFragment.this.getArguments());
                        bundle.putString("platform", "mobile");
                        MusLoginSecureSendCodeFragment.this.f57409h.mo57193a(bundle);
                    }
                }
            }

            /* renamed from: a */
            public final void mo57252a(String str, String str2) {
                if (MusLoginSecureSendCodeFragment.this.isViewValid() && MusLoginSecureSendCodeFragment.this.getContext() != null) {
                    if (MusLoginSecureSendCodeFragment.this.mBtnLogin != null) {
                        MusLoginSecureSendCodeFragment.this.mBtnLogin.mo57357a();
                    }
                    MusLoginSecureSendCodeFragment.this.mo57354a(str, str2, C21169e.f56922g, MusLoginSecureSendCodeFragment.this.f57509v);
                }
            }

            /* renamed from: a */
            public final void mo57254a(JSONObject jSONObject, int i, String str) {
                if (MusLoginSecureSendCodeFragment.this.isViewValid() && MusLoginSecureSendCodeFragment.this.getContext() != null) {
                    if (MusLoginSecureSendCodeFragment.this.mBtnLogin != null) {
                        MusLoginSecureSendCodeFragment.this.mBtnLogin.mo57357a();
                    }
                    if (MusLoginSecureSendCodeFragment.this.f57700B.equals("email")) {
                        new C21222g().mo57149b("email").mo57148a("0").mo57150c(String.valueOf(i)).mo57151d("/passport/user/login/").mo57141b();
                        C6907h.m21524a("login_failure", (Map) new C21102b().mo56946a("platform", "email").mo56946a("enter_method", MusLoginSecureSendCodeFragment.this.f57412l).mo56946a("enter_type", MusLoginSecureSendCodeFragment.this.f57413m).mo56946a("carrier", "").mo56944a("error_code", i).f56672a);
                    } else if (MusLoginSecureSendCodeFragment.this.f57700B.equals("username")) {
                        new C21222g().mo57149b("username").mo57148a("0").mo57150c(String.valueOf(i)).mo57151d("/passport/user/login/").mo57141b();
                        C6907h.m21524a("login_failure", (Map) new C21102b().mo56946a("platform", "username").mo56946a("enter_method", MusLoginSecureSendCodeFragment.this.f57412l).mo56946a("enter_type", MusLoginSecureSendCodeFragment.this.f57413m).mo56946a("carrier", "").mo56944a("error_code", i).f56672a);
                    }
                    C10761a.m31396b(MusLoginSecureSendCodeFragment.this.getContext(), str, 0).mo25750a();
                }
            }
        };
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f57703E = C12798d.m37186a(getContext());
        m72070j();
        return onCreateView;
    }

    /* renamed from: a */
    public static MusLoginSecureSendCodeFragment m72069a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        MusLoginSecureSendCodeFragment musLoginSecureSendCodeFragment = new MusLoginSecureSendCodeFragment();
        Bundle bundle = new Bundle();
        bundle.putString("logintype", str2);
        bundle.putString("username", str);
        bundle.putString("countrycodePhone", str3);
        bundle.putString(f57501r, str5);
        bundle.putString(f57503t, str4);
        bundle.putString("email", str6);
        bundle.putString("password", str7);
        bundle.putString("enter_from", str8);
        bundle.putString("enter_method", str9);
        musLoginSecureSendCodeFragment.setArguments(bundle);
        return musLoginSecureSendCodeFragment;
    }
}
