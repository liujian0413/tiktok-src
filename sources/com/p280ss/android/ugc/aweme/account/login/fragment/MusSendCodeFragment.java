package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p645a.p647b.C12717a;
import com.bytedance.sdk.account.p645a.p649d.C12729a;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p662f.p663a.C12824g;
import com.bytedance.sdk.account.p662f.p663a.C12825h;
import com.bytedance.sdk.account.p662f.p663a.C12826i;
import com.bytedance.sdk.account.p662f.p663a.C12830m;
import com.bytedance.sdk.account.p662f.p663a.C12831n;
import com.bytedance.sdk.account.p662f.p663a.C12832o;
import com.bytedance.sdk.account.p662f.p663a.C12833p;
import com.bytedance.sdk.account.p662f.p663a.C12834q;
import com.bytedance.sdk.account.p662f.p663a.C12836s;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12846g;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12847h;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12849j;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12850k;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12851l;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12852m;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12853n;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12855p;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.C21765p;
import com.p280ss.android.ugc.aweme.IAccountService.C21083g;
import com.p280ss.android.ugc.aweme.account.C21169e;
import com.p280ss.android.ugc.aweme.account.api.p937b.C21112b;
import com.p280ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p280ss.android.ugc.aweme.account.login.C21537g;
import com.p280ss.android.ugc.aweme.account.login.C21578r;
import com.p280ss.android.ugc.aweme.account.login.C21579s;
import com.p280ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p280ss.android.ugc.aweme.account.login.agegate.C21297b;
import com.p280ss.android.ugc.aweme.account.login.digitsverify.SendVerificationCodeActivity;
import com.p280ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p280ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.p952a.C21274e;
import com.p280ss.android.ugc.aweme.account.login.p952a.C21275f;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21323ad;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21328e;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21337n;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21342s;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21344u;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21883t.C21884a;
import com.p280ss.android.ugc.aweme.account.login.p974ui.InputCaptchaFragment.C21823a;
import com.p280ss.android.ugc.aweme.account.login.p974ui.LoginButton;
import com.p280ss.android.ugc.aweme.account.login.p974ui.MusCountDownView;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.p280ss.android.ugc.aweme.account.login.view.AutoLinefeedTextView;
import com.p280ss.android.ugc.aweme.account.loginsetting.C22173a;
import com.p280ss.android.ugc.aweme.account.loginsetting.C22180e;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p946i.C21220e;
import com.p280ss.android.ugc.aweme.account.p946i.C21221f;
import com.p280ss.android.ugc.aweme.account.p946i.C21223h;
import com.p280ss.android.ugc.aweme.account.p950k.C21229c;
import com.p280ss.android.ugc.aweme.account.p950k.C21231d;
import com.p280ss.android.ugc.aweme.account.p950k.C21235f;
import com.p280ss.android.ugc.aweme.account.p951l.C21241d;
import com.p280ss.android.ugc.aweme.account.p951l.C21247i;
import com.p280ss.android.ugc.aweme.account.p982ui.C22307g;
import com.p280ss.android.ugc.aweme.account.util.C22334m;
import com.p280ss.android.ugc.aweme.account.util.C22347v;
import com.p280ss.android.ugc.aweme.account.view.StateButton.C22358a;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.profile.UserResponse;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.MusSendCodeFragment */
public class MusSendCodeFragment extends BaseMusLoginFragment implements C6310a, C21337n, C22307g {

    /* renamed from: n */
    public static final boolean f57725n = C7163a.m22363a();

    /* renamed from: A */
    public int f57726A;

    /* renamed from: B */
    public boolean f57727B;

    /* renamed from: C */
    public C21483a f57728C;

    /* renamed from: D */
    public int f57729D;

    /* renamed from: E */
    public C12728d f57730E;

    /* renamed from: F */
    public String f57731F;

    /* renamed from: G */
    boolean f57732G;

    /* renamed from: H */
    boolean f57733H;

    /* renamed from: J */
    private String f57734J;

    /* renamed from: K */
    private String f57735K;

    /* renamed from: L */
    private String f57736L;

    /* renamed from: M */
    private String f57737M;

    /* renamed from: N */
    private long f57738N = -1;

    /* renamed from: O */
    private TextView f57739O;

    /* renamed from: P */
    private AutoLinefeedTextView f57740P;

    /* renamed from: Q */
    private View f57741Q;

    /* renamed from: R */
    private LoginButton f57742R;

    /* renamed from: S */
    private DmtButton f57743S;

    /* renamed from: T */
    private DmtStatusView f57744T;

    /* renamed from: U */
    private TextView f57745U;

    /* renamed from: V */
    private String f57746V;

    /* renamed from: W */
    private String f57747W;

    /* renamed from: X */
    private boolean f57748X = true;

    /* renamed from: Y */
    private int f57749Y;

    /* renamed from: Z */
    private C6309f f57750Z;

    /* renamed from: o */
    final int f57751o = 6;

    /* renamed from: p */
    public boolean f57752p;

    /* renamed from: q */
    public boolean f57753q;

    /* renamed from: r */
    public boolean f57754r;

    /* renamed from: s */
    public EditText f57755s;

    /* renamed from: t */
    public View f57756t;

    /* renamed from: u */
    public View f57757u;

    /* renamed from: v */
    public TextView f57758v;

    /* renamed from: w */
    public MusCountDownView f57759w;

    /* renamed from: x */
    public Long f57760x;

    /* renamed from: y */
    public C21275f f57761y;

    /* renamed from: z */
    public C21484b f57762z;

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.MusSendCodeFragment$a */
    public interface C21483a {
        /* renamed from: a */
        void mo57449a(String str, String str2, C21328e eVar);

        /* renamed from: b */
        String mo57452b();

        void dismiss();

        /* renamed from: g */
        void mo57458g();

        /* renamed from: h */
        String mo57459h();

        /* renamed from: i */
        int mo57460i();

        /* renamed from: j */
        int mo57461j();

        /* renamed from: k */
        String mo57462k();

        /* renamed from: l */
        C0052o<String> mo57463l();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.MusSendCodeFragment$b */
    class C21484b implements C21823a {
        /* renamed from: a */
        public final void mo57346a() {
            if (MusSendCodeFragment.this.isViewValid() && MusSendCodeFragment.this.getContext() != null) {
                MusSendCodeFragment.this.mo57355c();
                MusSendCodeFragment.this.f57730E.mo31177a(C21169e.f56936u, (C12852m) new C12852m() {
                    public final void onError(C12710e<C12833p> eVar, int i) {
                    }

                    public final /* bridge */ /* synthetic */ void onNeedCaptcha(C12707b bVar, String str) {
                    }

                    public final void onSuccess(C12710e<C12833p> eVar) {
                        int i;
                        if (MusSendCodeFragment.this.isViewValid() && MusSendCodeFragment.this.getContext() != null && !TextUtils.isEmpty(((C12833p) eVar.f33709g).f33986a)) {
                            if (MusSendCodeFragment.this.f57727B) {
                                i = C21169e.f56916a;
                            } else {
                                i = C21169e.f56937v;
                            }
                            MusSendCodeFragment.this.mo57354a(((C12833p) eVar.f33709g).f33986a, null, i, MusSendCodeFragment.this.f57762z);
                        }
                    }
                });
            }
        }

        private C21484b() {
        }

        /* renamed from: a */
        public final void mo57347a(String str, int i) {
            int i2;
            String str2;
            if (MusSendCodeFragment.this.isViewValid() && MusSendCodeFragment.this.getContext() != null) {
                MusSendCodeFragment.this.mo57355c();
                MusSendCodeFragment.this.f57759w.mo58212a();
                if (MusSendCodeFragment.this.f57727B) {
                    i2 = C21169e.f56916a;
                } else {
                    i2 = C21169e.f56937v;
                }
                String str3 = "";
                if (MusSendCodeFragment.this.f57728C != null) {
                    i2 = MusSendCodeFragment.this.f57728C.mo57461j();
                    str3 = MusSendCodeFragment.this.f57728C.mo57459h();
                }
                String str4 = str3;
                if (MusSendCodeFragment.this.f57753q) {
                    FragmentActivity activity = MusSendCodeFragment.this.getActivity();
                    String l = MusSendCodeFragment.this.mo57636l();
                    boolean a = C21241d.m71496a();
                    C21112b.m71186a(activity, l, str, i2, 0, str4, 1, a ? 1 : 0, MusSendCodeFragment.this.f57761y).mo31357d();
                } else {
                    C12728d dVar = MusSendCodeFragment.this.f57730E;
                    String l2 = MusSendCodeFragment.this.mo57636l();
                    boolean a2 = C21241d.m71496a();
                    dVar.mo31184a(l2, str, i2, 0, str4, 1, a2 ? 1 : 0, (C12855p) MusSendCodeFragment.this.f57761y);
                }
                C6907h.m21524a("slide_verification_response", (Map) new C21102b().f56672a);
                if (MusSendCodeFragment.this.f57753q) {
                    str2 = "send_whatsapp_code";
                } else {
                    str2 = "send_sms";
                }
                C6907h.m21524a(str2, (Map) new C21102b().mo56946a("send_method", "resend").mo56944a("send_reason", i2).mo56946a("enter_method", MusSendCodeFragment.this.f57412l).mo56946a("enter_from", MusSendCodeFragment.this.f57411k).f56672a);
            }
        }
    }

    /* renamed from: a */
    public final void mo57357a() {
        mo57635k();
    }

    /* renamed from: Z_ */
    public final void mo57356Z_() {
        this.f57742R.mo57356Z_();
    }

    /* renamed from: o */
    public final void mo57639o() {
        C21671bd.m72525a((Handler) this.f57750Z, false);
    }

    /* renamed from: r */
    private void m72111r() {
        this.f57739O.postDelayed(new C21506ao(this), 500);
    }

    /* renamed from: v */
    private void m72115v() {
        if (this.f57406e != null) {
            this.f57406e.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (MusSendCodeFragment.this.f57726A == 8) {
                        C6907h.m21524a("back", (Map) C21102b.m71165a().mo56946a("enter_from", "Input Phone Captcha").mo56945a("duration", System.currentTimeMillis() - MusSendCodeFragment.this.f57760x.longValue()).f56672a);
                    }
                    if (MusSendCodeFragment.this.f57728C != null) {
                        MusSendCodeFragment.this.f57728C.mo57458g();
                    } else {
                        MusSendCodeFragment.this.mo57508d();
                    }
                }
            });
        }
    }

    /* renamed from: j */
    public final long mo57601j() {
        return System.currentTimeMillis() - this.f57760x.longValue();
    }

    /* renamed from: m */
    public final String mo57637m() {
        return this.f57755s.getText().toString();
    }

    /* renamed from: n */
    public final void mo57638n() {
        C21671bd.m72524a(this.f57749Y, this.f57731F, (C21083g) new C21083g() {
            /* renamed from: a */
            public final void mo56868a(int i, int i2, Object obj) {
                if (i == 14 && i2 == 1) {
                    MusSendCodeFragment.this.f57733H = true;
                    User k = C21671bd.m72543k();
                    if (k == null || !k.isSecret()) {
                        C21671bd.m72544l();
                        C21671bd.m72522a(7, 1, (Object) new C21765p(MusSendCodeFragment.this.mo57636l(), ""));
                        C6907h.m21524a("switch_to_pro_account_success", (Map) C21102b.m71165a().mo56946a("classes", MusSendCodeFragment.this.f57731F).f56672a);
                        return;
                    }
                    MusSendCodeFragment.this.mo57639o();
                } else {
                    if (MusSendCodeFragment.this.getActivity() != null) {
                        C10761a.m31399c((Context) MusSendCodeFragment.this.getActivity(), (int) R.string.cjt).mo25750a();
                    }
                    MusSendCodeFragment.this.mo57635k();
                }
            }
        });
    }

    public void onPause() {
        super.onPause();
        KeyboardUtils.m77057c(this.f57755s);
    }

    public void onStart() {
        super.onStart();
        this.f57755s.postDelayed(new Runnable() {
            public final void run() {
                MusSendCodeFragment.this.mo57500a((View) MusSendCodeFragment.this.f57755s);
            }
        }, 500);
    }

    /* renamed from: u */
    private void m72114u() {
        C6907h.m21524a("auto_fill_sms_verification", (Map) new C21102b().mo56946a("enter_method", this.f57412l).f56672a);
    }

    /* renamed from: l */
    public final String mo57636l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f57735K);
        sb.append("-");
        sb.append(this.f57736L);
        return sb.toString();
    }

    public void onResume() {
        super.onResume();
        if (this.f57759w != null) {
            this.f57759w.mo58215b();
        }
        if (this.f57726A == 8) {
            this.f57760x = Long.valueOf(System.currentTimeMillis());
        }
    }

    /* renamed from: q */
    private void m72110q() {
        C21884a aVar;
        if (getArguments() != null && getArguments().getBoolean("reset_ticker", false)) {
            if (this.f57409h == null) {
                aVar = null;
            } else {
                aVar = this.f57409h.mo57191a(0);
            }
            if (aVar != null && aVar.f58586b != null && aVar.f58586b.f59613b > 0) {
                aVar.f58586b.mo58765b();
            }
        }
    }

    /* renamed from: s */
    private void m72112s() {
        if (this.f57726A == 6) {
            this.f57759w.mo58214a(5, this.f57737M);
        } else if (this.f57726A == 7) {
            this.f57759w.mo58214a(6, this.f57737M);
        } else {
            this.f57759w.mo58214a(0, mo57636l());
        }
        if (this.f57753q) {
            C21247i.m71508c(mo57636l());
        } else {
            C21247i.m71509d(mo57636l());
        }
    }

    /* renamed from: i */
    public final void mo57634i() {
        if (this.f57742R == null || this.f57742R.getVisibility() != 0) {
            if (this.f57743S != null && this.f57743S.getVisibility() == 0) {
                this.f57744T.mo25942f();
            }
            return;
        }
        C22358a.m74035b(this.f57742R);
    }

    /* renamed from: t */
    private void m72113t() {
        C0052o oVar;
        if (getActivity() instanceof MusLoginActivity) {
            oVar = ((MusLoginActivity) getActivity()).mo57203d();
        } else if (this.f57728C != null) {
            oVar = this.f57728C.mo57463l();
        } else {
            oVar = null;
        }
        if (oVar != null) {
            if (!TextUtils.isEmpty((CharSequence) oVar.getValue())) {
                this.f57755s.setText((CharSequence) oVar.getValue());
                m72114u();
                oVar.setValue("");
            }
            oVar.observe(this, new C21507ap(this));
        }
    }

    /* renamed from: k */
    public final void mo57635k() {
        boolean z;
        if (this.f57742R != null && this.f57742R.getVisibility() == 0) {
            C22358a.m74033a(this.f57742R);
            mo57629b(this.f57755s.getText().toString());
        } else if (this.f57743S != null && this.f57743S.getVisibility() == 0) {
            this.f57744T.setVisibility(8);
        }
        if (this.f57742R != null) {
            LoginButton loginButton = this.f57742R;
            if (this.f57755s.getText().toString().length() >= 4) {
                z = true;
            } else {
                z = false;
            }
            loginButton.setEnabled(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final /* synthetic */ void mo57640p() {
        if (isViewValid() && getActivity() != null) {
            if (!TextUtils.isEmpty(this.f57746V)) {
                mo57354a(this.f57746V, this.f57747W, C21169e.f56937v, this.f57762z);
            }
            boolean z = false;
            if (this.f57738N != -1) {
                if (this.f57409h != null) {
                    this.f57409h.mo57196b(0).f59613b = 60 - this.f57738N;
                    this.f57759w.mo58212a();
                }
                return;
            }
            if (this.f57759w.getRemainTick() == 0) {
                if (this.f57726A == 6) {
                    if (getArguments() != null) {
                        this.f57759w.mo58212a();
                        this.f57730E.mo31196a(getArguments().getString("email"), (String) null, getArguments().getString("pass_word"), 1, (String) null, (Map) null, (String) null, (C12847h) new C12847h() {
                            public final void onSuccess(C12710e<C12825h> eVar) {
                            }

                            public final void onError(C12710e<C12825h> eVar, int i) {
                                C10761a.m31396b(MusSendCodeFragment.this.getContext(), eVar.f33703c, 0).mo25750a();
                            }
                        });
                        C6907h.m21524a("send_email_code", (Map) new C21102b().mo56946a("send_method", "auto_system").mo56946a("send_reason", "trigger_verification").f56672a);
                    }
                } else if (this.f57726A == 7) {
                    if (getArguments() != null) {
                        this.f57759w.mo58212a();
                        this.f57730E.mo31196a(getArguments().getString("email"), (String) null, (String) null, 4, (String) null, (Map) null, (String) null, (C12847h) new C12847h() {
                            public final void onSuccess(C12710e<C12825h> eVar) {
                            }

                            public final void onError(C12710e<C12825h> eVar, int i) {
                                C10761a.m31396b(MusSendCodeFragment.this.getContext(), eVar.f33703c, 0).mo25750a();
                            }
                        });
                        C6907h.m21524a("send_email_code", (Map) new C21102b().mo56946a("send_method", "auto_system").mo56946a("send_reason", "reset_password").f56672a);
                    }
                } else if (this.f57726A == 2) {
                    this.f57759w.mo58212a();
                    int i = C21169e.f56936u;
                    boolean a = C21241d.m71496a();
                    this.f57730E.mo31184a(mo57636l(), "", i, 0, "", 1, a ? 1 : 0, (C12855p) this.f57761y);
                } else if (!this.f57752p) {
                    this.f57759w.mo58212a();
                    int i2 = C21169e.f56936u;
                    String str = "";
                    if (this.f57728C != null) {
                        i2 = this.f57728C.mo57460i();
                        str = this.f57728C.mo57459h();
                    }
                    int i3 = i2;
                    String str2 = str;
                    if (this.f57728C == null && !C21297b.m71680c()) {
                        z = true;
                    }
                    if (!this.f57727B && !z) {
                        if (this.f57753q) {
                            boolean a2 = C21241d.m71496a();
                            C21112b.m71186a(getActivity(), mo57636l(), "", i3, 0, str2, 1, a2 ? 1 : 0, this.f57761y).mo31357d();
                            return;
                        }
                        boolean a3 = C21241d.m71496a();
                        this.f57730E.mo31184a(mo57636l(), "", i3, 0, str2, 1, a3 ? 1 : 0, (C12855p) this.f57761y);
                    }
                }
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m72115v();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo57632d(String str) {
        this.f57755s.setText(str);
        m72114u();
    }

    /* renamed from: a */
    public final void mo57501a(C21524n nVar) {
        super.mo57501a(nVar);
        if (this.f57759w != null && nVar != null) {
            this.f57759w.setTickListener(nVar);
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            if (this.f57409h != null) {
                mo57501a(this.f57409h);
            }
            m72112s();
        }
    }

    /* renamed from: a */
    public final void mo57627a(String str) {
        if (isViewValid() && getContext() != null) {
            C1081a aVar = new C1081a(getContext(), R.style.rk);
            aVar.mo4233a((CharSequence) "").mo4240b((CharSequence) str).mo4226a((int) R.string.afn, (DialogInterface.OnClickListener) null);
            C42951au.m136342a(aVar.mo4242b());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r7.length() == 4) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo57629b(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = r6.isViewValid()
            if (r0 == 0) goto L_0x007a
            android.content.Context r0 = r6.getContext()
            if (r0 != 0) goto L_0x000e
            goto L_0x007a
        L_0x000e:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 1
            r2 = 8
            r3 = 0
            if (r0 == 0) goto L_0x0025
            int r0 = r6.f57726A
            if (r0 != r2) goto L_0x0022
            com.bytedance.ies.dmt.ui.widget.DmtButton r0 = r6.f57743S
            r0.setEnabled(r3)
            goto L_0x005e
        L_0x0022:
            com.ss.android.ugc.aweme.account.login.ui.LoginButton r0 = r6.f57742R
            goto L_0x004c
        L_0x0025:
            int r0 = r6.f57726A
            r4 = 6
            if (r0 == r4) goto L_0x0051
            int r0 = r6.f57726A
            r5 = 7
            if (r0 != r5) goto L_0x0030
            goto L_0x0051
        L_0x0030:
            int r0 = r6.f57726A
            r4 = 4
            if (r0 != r2) goto L_0x0043
            com.bytedance.ies.dmt.ui.widget.DmtButton r0 = r6.f57743S
            int r5 = r7.length()
            if (r5 != r4) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            r0.setEnabled(r1)
            goto L_0x005e
        L_0x0043:
            com.ss.android.ugc.aweme.account.login.ui.LoginButton r0 = r6.f57742R
            int r5 = r7.length()
            if (r5 != r4) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            r0.setEnabled(r1)
            goto L_0x005e
        L_0x0051:
            com.ss.android.ugc.aweme.account.login.ui.LoginButton r0 = r6.f57742R
            int r5 = r7.length()
            if (r5 != r4) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            r0.setEnabled(r1)
        L_0x005e:
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x0079
            android.view.View r7 = r6.f57757u
            r7.setVisibility(r2)
            android.view.View r7 = r6.f57756t
            android.content.res.Resources r0 = r6.getResources()
            r1 = 2131100096(0x7f0601c0, float:1.7812564E38)
            int r0 = r0.getColor(r1)
            r7.setBackgroundColor(r0)
        L_0x0079:
            return
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.fragment.MusSendCodeFragment.mo57629b(java.lang.String):void");
    }

    /* renamed from: c */
    public final void mo57630c(String str) {
        if (C21297b.m71679b()) {
            this.f57730E.mo31192a(mo57636l(), str, (C12850k) new C12850k() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onNeedSecureCaptcha(C12710e<C12830m> eVar) {
                    super.onNeedSecureCaptcha(eVar);
                    if (MusSendCodeFragment.this.isViewValid()) {
                        MusSendCodeFragment.this.mo57635k();
                    }
                }

                public final void onSuccess(C12710e<C12830m> eVar) {
                    C21671bd.m72526a(((C12830m) eVar.f33709g).f33976c);
                    MusSendCodeFragment.this.mo57626a((C12826i) eVar.f33709g);
                }

                public final void onError(C12710e<C12830m> eVar, int i) {
                    MusSendCodeFragment.this.mo57625a(i, eVar.f33703c);
                }
            });
            return;
        }
        BaseMusLoginFragment baseMusLoginFragment = (BaseMusLoginFragment) C22334m.m73938a(MusAgeGateFragment.class, getArguments()).mo58756a("country_code_alpha_2", this.f57734J).mo58756a("country_code", this.f57735K).mo58756a("phone_number", this.f57736L).mo58756a("enter_type", this.f57413m).mo58754a("init_page", 0).mo58756a("sms_code_key", str).mo58753a();
        baseMusLoginFragment.mo57501a(this.f57409h);
        mo57503b(baseMusLoginFragment, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo57633e(View view) {
        int i;
        if (this.f57748X || this.f57759w.getRemainTick() <= 0) {
            if (this.f57759w.getRemainTick() <= 0) {
                this.f57759w.mo58212a();
            }
            if (this.f57727B) {
                i = C21169e.f56916a;
            } else {
                i = C21169e.f56936u;
            }
            this.f57729D = i;
            this.f57730E.mo31214b(mo57636l(), "", this.f57729D, (C12855p) new C21323ad(this) {
                /* renamed from: a */
                public final void mo57345a(C12710e<C12836s> eVar) {
                }

                /* access modifiers changed from: private */
                /* renamed from: b */
                public void onNeedSecureCaptcha(C12710e<C12836s> eVar) {
                    super.onNeedSecureCaptcha(eVar);
                    if (MusSendCodeFragment.this.isViewValid()) {
                        MusSendCodeFragment.this.mo57635k();
                    }
                }

                public final void onSuccess(C12710e<C12836s> eVar) {
                    if (MusSendCodeFragment.this.isViewValid() && MusSendCodeFragment.this.getActivity() != null) {
                        C22347v.m73994a(MusSendCodeFragment.this.getActivity()).mo26634a((int) R.string.cti).mo26645b((int) R.string.ctj).mo26646b((int) R.string.bfm, (DialogInterface.OnClickListener) null).mo26642a(false).mo26649b();
                    }
                }
            });
            this.f57748X = false;
            return;
        }
        C10761a.m31403c((Context) C21671bd.m72532b(), getResources().getString(R.string.fq2)).mo25750a();
    }

    public void handleMsg(Message message) {
        if ((message.obj instanceof UserResponse) && message.what == 122) {
            Object obj = message.obj;
            C21671bd.m72544l();
            C21671bd.m72522a(7, 1, (Object) new C21765p(mo57636l(), ""));
            C6907h.m21524a("switch_to_pro_account_success", (Map) C21102b.m71165a().mo56946a("classes", this.f57731F).f56672a);
        }
        if ((message.obj instanceof Exception) && message.what == 122) {
            if (getActivity() != null) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.cjt).mo25750a();
            }
            if (isViewValid()) {
                KeyboardUtils.m77057c(this.f57755s);
                mo57635k();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f57734J = arguments.getString("country_code_alpha_2");
            this.f57735K = arguments.getString("country_code");
            this.f57736L = arguments.getString("phone_number");
            this.f57737M = arguments.getString("email");
            this.f57752p = arguments.getBoolean("from_register", false);
            this.f57753q = arguments.getBoolean("use_whatsapp_code", false);
            this.f57754r = arguments.getBoolean("from_choose_dialog", false);
            this.f57746V = arguments.getString("captcha_string");
            this.f57747W = arguments.getString("captcha_error_msg");
            this.f57726A = arguments.getInt("code_type");
            this.f57727B = arguments.getBoolean("NEW_PHONE_USER", false);
            this.f57738N = arguments.getLong("sms_have_send_time", -1);
            this.f57411k = arguments.getString("enter_from");
            this.f57749Y = arguments.getInt(C21578r.f57924l);
            this.f57731F = arguments.getString(C21578r.f57925m);
        }
        this.f57762z = new C21484b();
        this.f57761y = new C21275f(this) {
            /* renamed from: a */
            public final void mo57263a() {
                if (MusSendCodeFragment.this.f57753q) {
                    C21235f.m71485b(0, MusSendCodeFragment.this.f57729D, 0, "");
                } else if (MusSendCodeFragment.this.f57754r) {
                    C21235f.m71484a(0, MusSendCodeFragment.this.f57729D, 0, "", "choose_dialog");
                } else {
                    C21235f.m71483a(0, MusSendCodeFragment.this.f57729D, 0, "");
                }
                MusSendCodeFragment.this.mo57635k();
            }

            /* renamed from: c */
            public final void onNeedSecureCaptcha(C12710e<C12836s> eVar) {
                super.onNeedSecureCaptcha(eVar);
                if (MusSendCodeFragment.this.isViewValid()) {
                    MusSendCodeFragment.this.mo57635k();
                }
            }

            /* renamed from: a */
            public final void mo57264a(int i) {
                if (MusSendCodeFragment.this.f57753q) {
                    C21235f.m71485b(1, MusSendCodeFragment.this.f57729D, i, "PhoneInvalid");
                } else if (MusSendCodeFragment.this.f57754r) {
                    C21235f.m71484a(1, MusSendCodeFragment.this.f57729D, i, "PhoneInvalid", "choose_dialog");
                } else {
                    C21235f.m71483a(1, MusSendCodeFragment.this.f57729D, i, "PhoneInvalid");
                }
                if (MusSendCodeFragment.this.isViewValid() && MusSendCodeFragment.this.getActivity() != null) {
                    MusSendCodeFragment.this.mo57627a(MusSendCodeFragment.this.getResources().getString(R.string.cdl));
                    MusSendCodeFragment.this.mo57635k();
                }
            }

            /* renamed from: b */
            public final void mo57268b(int i) {
                if (MusSendCodeFragment.this.f57753q) {
                    C21235f.m71485b(1, MusSendCodeFragment.this.f57729D, i, "RejectSec");
                } else if (MusSendCodeFragment.this.f57754r) {
                    C21235f.m71484a(1, MusSendCodeFragment.this.f57729D, i, "RejectSec", "choose_dialog");
                } else {
                    C21235f.m71483a(1, MusSendCodeFragment.this.f57729D, i, "RejectSec");
                }
                super.mo57268b(i);
                if (MusSendCodeFragment.this.isViewValid() && MusSendCodeFragment.this.getContext() != null) {
                    MusSendCodeFragment.this.mo57635k();
                }
            }

            /* renamed from: b */
            public final void mo57366b(C12710e<C12836s> eVar) {
                if (MusSendCodeFragment.this.f57753q) {
                    C21235f.m71485b(1, MusSendCodeFragment.this.f57729D, eVar.f33702b, eVar.f33703c);
                } else if (MusSendCodeFragment.this.f57754r) {
                    C21235f.m71484a(1, MusSendCodeFragment.this.f57729D, eVar.f33702b, eVar.f33703c, "choose_dialog");
                } else {
                    C21235f.m71483a(1, MusSendCodeFragment.this.f57729D, eVar.f33702b, eVar.f33703c);
                }
                if (MusSendCodeFragment.this.isViewValid() && MusSendCodeFragment.this.getContext() != null) {
                    MusSendCodeFragment.this.mo57635k();
                    C10761a.m31392b(MusSendCodeFragment.this.getContext(), (int) R.string.cg0, 0).mo25750a();
                }
            }

            /* renamed from: a */
            public final void mo57266a(C12710e<C12836s> eVar) {
                String str;
                if (MusSendCodeFragment.this.f57753q) {
                    C21235f.m71485b(1, MusSendCodeFragment.this.f57729D, eVar.f33702b, eVar.f33703c);
                } else if (MusSendCodeFragment.this.f57754r) {
                    C21235f.m71484a(1, MusSendCodeFragment.this.f57729D, eVar.f33702b, eVar.f33703c, "choose_dialog");
                } else {
                    C21235f.m71483a(1, MusSendCodeFragment.this.f57729D, eVar.f33702b, eVar.f33703c);
                }
                MusSendCodeFragment.this.mo57635k();
                if (eVar.f33702b == 2027 || eVar.f33702b == 2028) {
                    if (TextUtils.isEmpty(eVar.f33703c)) {
                        str = MusSendCodeFragment.this.getString(R.string.c6i);
                    } else {
                        str = eVar.f33703c;
                    }
                    C10761a.m31403c(MusSendCodeFragment.this.getContext(), str).mo25750a();
                    return;
                }
                if (!TextUtils.isEmpty(eVar.f33703c)) {
                    MusSendCodeFragment.this.mo57627a(eVar.f33703c);
                }
            }

            /* renamed from: a */
            public final void mo57265a(int i, String str) {
                String str2;
                if (MusSendCodeFragment.this.f57753q) {
                    C21235f.m71485b(1, MusSendCodeFragment.this.f57729D, i, "PhoneRegistered");
                } else if (MusSendCodeFragment.this.f57754r) {
                    C21235f.m71484a(1, MusSendCodeFragment.this.f57729D, i, "PhoneRegistered", "choose_dialog");
                } else {
                    C21235f.m71483a(1, MusSendCodeFragment.this.f57729D, i, "PhoneRegistered");
                }
                if (MusSendCodeFragment.this.isViewValid() && MusSendCodeFragment.this.getContext() != null) {
                    String str3 = "login_failure";
                    C21102b bVar = new C21102b();
                    String str4 = "platform";
                    if (MusSendCodeFragment.this.f57753q) {
                        str2 = "whatsapp";
                    } else {
                        str2 = "sms_verification";
                    }
                    C6907h.m21524a(str3, (Map) bVar.mo56946a(str4, str2).mo56946a("enter_method", MusSendCodeFragment.this.f57412l).mo56946a("enter_type", MusSendCodeFragment.this.f57413m).mo56946a("carrier", "").mo56944a("error_code", i).f56672a);
                    MusSendCodeFragment.this.mo57635k();
                    MusSendCodeFragment musSendCodeFragment = MusSendCodeFragment.this;
                    if (TextUtils.isEmpty(str)) {
                        str = MusSendCodeFragment.this.getResources().getString(R.string.ctp);
                    }
                    musSendCodeFragment.mo57627a(str);
                }
            }

            /* renamed from: a */
            public final void mo57267a(String str, String str2) {
                int i;
                if (MusSendCodeFragment.this.isViewValid() && MusSendCodeFragment.this.getContext() != null) {
                    MusSendCodeFragment.this.mo57635k();
                    if (MusSendCodeFragment.this.f57727B) {
                        i = C21169e.f56916a;
                    } else {
                        i = C21169e.f56937v;
                    }
                    MusSendCodeFragment.this.mo57354a(str, str2, i, MusSendCodeFragment.this.f57762z);
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo57626a(C12826i iVar) {
        String str;
        if (isViewValid() && getContext() != null && iVar != null && iVar.mo31218b() != null) {
            this.f57757u.setVisibility(8);
            this.f57756t.setBackgroundColor(getResources().getColor(R.color.a7s));
            m72108a(1, 0, "");
            if (getArguments() != null && getArguments().getBoolean("need_remember_login_method", true)) {
                if (this.f57726A == 6) {
                    C21579s.m72313b((BaseLoginMethod) new AccountPassLoginMethod(C21671bd.m72536d(), LoginMethodName.EMAIL_PASS, getArguments().getString("email")));
                } else if (!TextUtils.isEmpty(this.f57736L)) {
                    PhoneLoginMethod phoneLoginMethod = new PhoneLoginMethod(C21671bd.m72536d(), LoginMethodName.PHONE_SMS, this.f57734J, this.f57735K, this.f57736L);
                    C21579s.m72313b((BaseLoginMethod) phoneLoginMethod);
                }
            }
            String str2 = "login_success";
            C21102b a = new C21102b().mo56946a("enter_method", this.f57412l).mo56946a("enter_from", this.f57411k).mo56946a("enter_type", this.f57413m);
            String str3 = "platform";
            if (this.f57753q) {
                str = "whatsapp";
            } else {
                str = "sms_verification";
            }
            C6907h.m21524a(str2, (Map) a.mo56946a(str3, str).mo56944a("status", 1).mo56944a("_perf_monitor", 1).f56672a);
            AgeGateResponse ageGateResponse = null;
            if (!iVar.mo31218b().f34081d || this.f57726A == 6) {
                if ((getActivity() instanceof MusLoginActivity) && this.f57752p) {
                    ((MusLoginActivity) getActivity()).f57129a = null;
                }
                if (this.f57409h != null) {
                    Bundle bundle = new Bundle(getArguments());
                    bundle.putString("platform", "mobile");
                    if (this.f57726A != 6) {
                        bundle.putString("login_path", "phone_sms");
                    } else {
                        bundle.putString("login_path", "email_or_username");
                    }
                    this.f57409h.mo57193a(bundle);
                }
                return;
            }
            if ((getActivity() instanceof MusLoginActivity) && this.f57752p) {
                ageGateResponse = ((MusLoginActivity) getActivity()).f57129a;
            }
            Bundle bundle2 = new Bundle(getArguments());
            if (ageGateResponse != null) {
                bundle2.putSerializable("age_gate_response", ageGateResponse);
            }
            bundle2.putBoolean("new_user_need_set_pass_word", true);
            bundle2.putInt("set_pass_scene", 2);
            bundle2.putString("login_path", "phone_sms");
            if (this.f57409h != null) {
                this.f57409h.mo57193a(bundle2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo57631d(View view) {
        int i;
        String str;
        if (this.f57726A == 6) {
            if (getArguments() != null) {
                this.f57730E.mo31196a(getArguments().getString("email"), (String) null, getArguments().getString("pass_word"), 1, (String) null, (Map) null, (String) null, (C12847h) new C12847h() {
                    public final void onSuccess(C12710e<C12825h> eVar) {
                    }

                    public final void onError(C12710e<C12825h> eVar, int i) {
                        C10761a.m31396b(MusSendCodeFragment.this.getContext(), eVar.f33703c, 0).mo25750a();
                    }
                });
                C6907h.m21524a("send_email_code", (Map) new C21102b().mo56946a("send_method", "resend").mo56946a("send_reason", "trigger_verification").f56672a);
                this.f57759w.mo58212a();
            }
        } else if (this.f57726A != 7) {
            if (this.f57727B) {
                i = C21169e.f56916a;
            } else {
                i = C21169e.f56936u;
            }
            this.f57729D = i;
            String str2 = "";
            if (this.f57728C != null) {
                this.f57729D = this.f57728C.mo57461j();
                str2 = this.f57728C.mo57459h();
            }
            String str3 = str2;
            if (this.f57753q) {
                int i2 = this.f57729D;
                boolean a = C21241d.m71496a();
                C21112b.m71186a(getActivity(), mo57636l(), "", i2, 0, str3, 1, a ? 1 : 0, this.f57761y).mo31357d();
            } else {
                int i3 = this.f57729D;
                boolean a2 = C21241d.m71496a();
                this.f57730E.mo31184a(mo57636l(), "", i3, 0, str3, 1, a2 ? 1 : 0, (C12855p) this.f57761y);
            }
            this.f57759w.mo58212a();
            if (this.f57753q) {
                str = "send_whatsapp_code";
            } else {
                str = "send_sms";
            }
            if (this.f57726A == 8) {
                C6907h.onEventV3("resend_code_phone");
            } else {
                C6907h.m21524a(str, (Map) new C21102b().mo56946a("send_method", "resend").mo56944a("send_reason", this.f57729D).mo56946a("enter_method", this.f57412l).mo56946a("enter_from", this.f57411k).f56672a);
            }
        } else if (getArguments() != null) {
            this.f57730E.mo31196a(getArguments().getString("email"), (String) null, (String) null, 4, (String) null, (Map) null, (String) null, (C12847h) new C12847h() {
                public final void onSuccess(C12710e<C12825h> eVar) {
                }

                public final void onError(C12710e<C12825h> eVar, int i) {
                    C10761a.m31396b(MusSendCodeFragment.this.getContext(), eVar.f33703c, 0).mo25750a();
                }
            });
            C6907h.m21524a("send_email_code", (Map) new C21102b().mo56946a("send_method", "resend").mo56946a("send_reason", "reset_password").f56672a);
            this.f57759w.mo58212a();
        }
    }

    /* renamed from: f */
    private void m72109f(View view) {
        int i;
        boolean z;
        TextView textView = (TextView) view.findViewById(R.id.djl);
        if (this.f57728C != null && !TextUtils.isEmpty(this.f57728C.mo57452b())) {
            textView.setText(this.f57728C.mo57452b());
        }
        this.f57739O = (TextView) view.findViewById(R.id.cb4);
        this.f57755s = (EditText) view.findViewById(R.id.agc);
        this.f57756t = view.findViewById(R.id.afz);
        this.f57742R = (LoginButton) view.findViewById(R.id.qm);
        this.f57742R.setLoginBackgroundRes(R.drawable.bav);
        this.f57742R.setAutoMirrored(false);
        this.f57742R.setLoadingBackground(R.drawable.bba);
        this.f57743S = (DmtButton) view.findViewById(R.id.q3);
        this.f57744T = (DmtStatusView) view.findViewById(R.id.dav);
        this.f57744T.setBuilder(C10803a.m31631a(getContext()));
        this.f57759w = (MusCountDownView) view.findViewById(R.id.c0t);
        this.f57757u = view.findViewById(R.id.ehj);
        this.f57758v = (TextView) view.findViewById(R.id.ehi);
        this.f57740P = (AutoLinefeedTextView) view.findViewById(R.id.dvl);
        this.f57741Q = view.findViewById(R.id.qt);
        this.f57745U = (TextView) view.findViewById(R.id.aqc);
        if (!(this.f57726A == 6 || this.f57726A == 7)) {
            this.f57759w.setTargetView(this.f57745U);
        }
        this.f57741Q.setVisibility(8);
        if (this.f57726A == 2) {
            this.f57740P.setText(R.string.cbj);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f57735K);
        sb.append(" ");
        sb.append(this.f57736L);
        String sb2 = sb.toString();
        if (this.f57726A == 8) {
            this.f57740P.setText(getContext().getResources().getString(R.string.e7j, new Object[]{PhoneNumberUtil.m73059a(sb2)}));
            this.f57743S.setVisibility(0);
            this.f57742R.setVisibility(8);
            this.f57739O.setVisibility(8);
            ((SendVerificationCodeActivity) getActivity()).f57354c = new C21503al(this);
        } else {
            this.f57743S.setVisibility(8);
            this.f57742R.setVisibility(0);
        }
        if (this.f57726A == 3 || this.f57726A == 4 || this.f57726A == 5 || this.f57726A == 8) {
            String a = PhoneNumberUtil.m73059a(sb2);
            this.f57740P.mo58473a(getString(R.string.ce3, a), a);
            this.f57739O.setVisibility(8);
        } else if (this.f57726A == 6 || this.f57726A == 7) {
            textView.setText(R.string.cc6);
            this.f57740P.setText(R.string.cc4);
            this.f57739O.setText(this.f57737M);
            this.f57755s.setHint(R.string.cbr);
            this.f57755s.setInputType(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            if (this.f57755s.getFilters() == null) {
                this.f57755s.setFilters(new InputFilter[]{new LengthFilter(6)});
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.f57755s.getFilters().length) {
                        z = false;
                        break;
                    } else if (this.f57755s.getFilters()[i2] instanceof LengthFilter) {
                        this.f57755s.getFilters()[i2] = new LengthFilter(6);
                        this.f57755s.setFilters(this.f57755s.getFilters());
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    InputFilter[] inputFilterArr = new InputFilter[(this.f57755s.getFilters().length + 1)];
                    System.arraycopy(this.f57755s.getFilters(), 0, inputFilterArr, 0, inputFilterArr.length - 1);
                    inputFilterArr[inputFilterArr.length - 1] = new LengthFilter(6);
                    this.f57755s.setFilters(inputFilterArr);
                }
            }
        } else if (!this.f57753q) {
            this.f57740P.mo58473a(getString(R.string.ce3, sb2), sb2);
            this.f57739O.setVisibility(8);
        } else {
            textView.setText(R.string.b1_);
            this.f57740P.mo58473a(getString(R.string.fs9, sb2), sb2);
            this.f57739O.setVisibility(8);
        }
        if (this.f57753q) {
            i = R.string.wu;
        } else {
            i = R.string.wv;
        }
        String string = getString(i);
        String string2 = getString(R.string.bb7);
        Factory instance = Factory.getInstance();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(string);
        sb3.append(" ");
        sb3.append(string2);
        Spannable newSpannable = instance.newSpannable(sb3.toString());
        newSpannable.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.lj)), string.length(), newSpannable.length(), 33);
        this.f57745U.setText(newSpannable);
        this.f57745U.setOnClickListener(new C21504am(this));
        this.f57743S.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                KeyboardUtils.m77057c(MusSendCodeFragment.this.f57755s);
                MusSendCodeFragment.this.mo57634i();
                if (MusSendCodeFragment.this.f57726A != 8 || !MusSendCodeFragment.this.f57732G) {
                    if (MusSendCodeFragment.this.f57728C != null) {
                        MusSendCodeFragment.this.f57728C.mo57449a(MusSendCodeFragment.this.mo57636l(), MusSendCodeFragment.this.mo57637m(), new C21328e() {
                            /* renamed from: a */
                            public final void mo57349a() {
                                C21229c.m71454a(0, "bindPhone", 0, "");
                                MusSendCodeFragment.this.f57732G = true;
                                if (MusSendCodeFragment.this.f57726A == 8) {
                                    C6907h.m21524a("set_up_proAccount", (Map) new C21102b().mo56946a("page", "Input Phone Captcha").mo56946a("method", "set_by_phone").mo56945a("duration", System.currentTimeMillis() - MusSendCodeFragment.this.f57760x.longValue()).f56672a);
                                    MusSendCodeFragment.this.mo57638n();
                                    return;
                                }
                                C21671bd.m72522a(7, 1, (Object) new C21765p(MusSendCodeFragment.this.mo57636l(), ""));
                                if (MusSendCodeFragment.this.getActivity() != null && MusSendCodeFragment.this.isViewValid()) {
                                    MusSendCodeFragment.this.f57757u.setVisibility(8);
                                    MusSendCodeFragment.this.f57756t.setBackgroundColor(MusSendCodeFragment.this.getResources().getColor(R.color.a7s));
                                    if (!TextUtils.isEmpty(MusSendCodeFragment.this.f57728C.mo57462k())) {
                                        new C21223h().mo57152a(MusSendCodeFragment.this.f57728C.mo57462k()).mo57141b();
                                    }
                                    if (MusSendCodeFragment.this.f57728C != null) {
                                        MusSendCodeFragment.this.f57728C.dismiss();
                                    }
                                }
                            }

                            /* renamed from: a */
                            public final void mo57350a(String str, int i) {
                                C21229c.m71454a(1, "bindPhone", i, str);
                                if (MusSendCodeFragment.this.getActivity() != null && MusSendCodeFragment.this.isViewValid()) {
                                    MusSendCodeFragment.this.f57757u.setVisibility(0);
                                    MusSendCodeFragment.this.f57756t.setBackgroundColor(MusSendCodeFragment.this.getResources().getColor(R.color.a14));
                                    if (i == 1202) {
                                        MusSendCodeFragment.this.f57758v.setText(MusSendCodeFragment.this.getResources().getString(R.string.cgj));
                                    } else {
                                        MusSendCodeFragment.this.f57758v.setText(MusSendCodeFragment.this.getResources().getString(R.string.cce));
                                    }
                                    MusSendCodeFragment.this.mo57635k();
                                }
                            }
                        });
                    }
                } else if (MusSendCodeFragment.this.f57733H) {
                    MusSendCodeFragment.this.mo57639o();
                } else {
                    MusSendCodeFragment.this.mo57638n();
                }
            }
        });
        this.f57742R.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                String str;
                String str2;
                ClickInstrumentation.onClick(view);
                if (!TextUtils.isEmpty(MusSendCodeFragment.this.mo57637m())) {
                    MusSendCodeFragment.this.mo57634i();
                    if (MusSendCodeFragment.this.f57728C != null) {
                        MusSendCodeFragment.this.f57728C.mo57449a(MusSendCodeFragment.this.mo57636l(), MusSendCodeFragment.this.mo57637m(), new C21328e() {
                            /* renamed from: a */
                            public final void mo57349a() {
                                if (MusSendCodeFragment.this.f57726A == 5) {
                                    C21229c.m71454a(0, "bindPhone", 0, "");
                                } else if (MusSendCodeFragment.this.f57726A == 4) {
                                    C21229c.m71455b(0, "ChangePhone", 0, "");
                                }
                                if (MusSendCodeFragment.this.getActivity() != null && MusSendCodeFragment.this.isViewValid()) {
                                    MusSendCodeFragment.this.f57757u.setVisibility(8);
                                    MusSendCodeFragment.this.f57756t.setBackgroundColor(MusSendCodeFragment.this.getResources().getColor(R.color.a7s));
                                    MusSendCodeFragment.this.mo57357a();
                                    if (!TextUtils.isEmpty(MusSendCodeFragment.this.f57728C.mo57462k())) {
                                        new C21223h().mo57152a(MusSendCodeFragment.this.f57728C.mo57462k()).mo57141b();
                                    }
                                    if (MusSendCodeFragment.this.f57728C != null) {
                                        MusSendCodeFragment.this.f57728C.dismiss();
                                    }
                                }
                            }

                            /* renamed from: a */
                            public final void mo57350a(String str, int i) {
                                if (MusSendCodeFragment.this.f57726A == 5) {
                                    C21229c.m71454a(1, "bindPhone", i, str);
                                } else if (MusSendCodeFragment.this.f57726A == 4) {
                                    C21229c.m71455b(1, "changePhone", i, str);
                                }
                                if (MusSendCodeFragment.this.getActivity() != null && MusSendCodeFragment.this.isViewValid()) {
                                    MusSendCodeFragment.this.f57757u.setVisibility(0);
                                    MusSendCodeFragment.this.f57756t.setBackgroundColor(MusSendCodeFragment.this.getResources().getColor(R.color.a14));
                                    MusSendCodeFragment.this.mo57357a();
                                    if (i == 1202) {
                                        MusSendCodeFragment.this.f57758v.setText(MusSendCodeFragment.this.getResources().getString(R.string.cgj));
                                    } else {
                                        MusSendCodeFragment.this.f57758v.setText(MusSendCodeFragment.this.getResources().getString(R.string.cce));
                                    }
                                }
                            }
                        });
                    } else if (MusSendCodeFragment.this.f57726A == 6) {
                        if (MusSendCodeFragment.this.getArguments() != null) {
                            MusSendCodeFragment.this.f57730E.mo31189a(MusSendCodeFragment.this.getArguments().getString("email"), MusSendCodeFragment.this.mo57637m(), 1, (Map) null, (String) null, (C12846g) new C12846g() {
                                public final void onSuccess(C12710e<C12824g> eVar) {
                                    C21231d.m71459a(0, 0, "");
                                    C6907h.m21524a("email_code_verification_result", (Map) new C21102b().mo56946a("enter_from", "register").mo56944a("is_success", 1).f56672a);
                                    MusSendCodeFragment.this.mo57357a();
                                    C21671bd.m72526a(((C12824g) eVar.f33709g).f33948f);
                                    MusSendCodeFragment.this.mo57626a((C12826i) eVar.f33709g);
                                }

                                public final void onError(C12710e<C12824g> eVar, int i) {
                                    C21231d.m71459a(1, eVar.f33702b, eVar.f33703c);
                                    C6907h.m21524a("email_code_verification_result", (Map) new C21102b().mo56946a("enter_from", "register").mo56944a("is_success", 0).mo56944a("error_code", eVar.f33702b).f56672a);
                                    C6907h.m21524a("login_failure", (Map) new C21102b().mo56946a("platform", "email").mo56946a("enter_method", MusSendCodeFragment.this.f57412l).mo56946a("enter_type", MusSendCodeFragment.this.f57413m).mo56946a("carrier", "").mo56944a("error_code", eVar.f33702b).f56672a);
                                    MusSendCodeFragment.this.mo57357a();
                                    C10761a.m31396b(MusSendCodeFragment.this.getContext(), eVar.f33703c, 0).mo25750a();
                                }
                            });
                        }
                    } else if (MusSendCodeFragment.this.f57726A != 7) {
                        MusSendCodeFragment.this.mo57510f();
                        String str3 = "login_submit";
                        C21102b a = new C21102b().mo56946a("enter_method", MusSendCodeFragment.this.f57412l).mo56946a("enter_from", MusSendCodeFragment.this.f57411k).mo56946a("enter_type", MusSendCodeFragment.this.f57413m);
                        String str4 = "platform";
                        if (MusSendCodeFragment.this.f57753q) {
                            str = "whatsapp";
                        } else {
                            str = "sms_verification";
                        }
                        C6907h.m21524a(str3, (Map) a.mo56946a(str4, str).mo56946a("group_id", C21220e.m71415a(MusSendCodeFragment.this.getArguments())).mo56946a("log_pb", C21220e.m71418b(MusSendCodeFragment.this.getArguments())).f56672a);
                        if (MusSendCodeFragment.this.f57726A == 2) {
                            C21221f fVar = new C21221f();
                            if (MusSendCodeFragment.this.f57726A == 2) {
                                str2 = "security_check";
                            } else {
                                str2 = MusSendCodeFragment.this.f57411k;
                            }
                            fVar.mo57145a(str2).mo57146b("phone").mo57147c("1039").mo57141b();
                        } else {
                            new C21221f().mo57145a(MusSendCodeFragment.this.f57411k).mo57146b("phone").mo57141b();
                        }
                        if (!C21297b.m71680c()) {
                            if (MusSendCodeFragment.this.f57752p) {
                                MusSendCodeFragment.this.f57730E.mo31200a(MusSendCodeFragment.this.mo57636l(), MusSendCodeFragment.this.mo57637m(), "", (C12849j) new C21274e(MusSendCodeFragment.this) {
                                    /* access modifiers changed from: private */
                                    /* renamed from: c */
                                    public void onNeedSecureCaptcha(C12710e<C12832o> eVar) {
                                        super.onNeedSecureCaptcha(eVar);
                                        if (MusSendCodeFragment.this.isViewValid()) {
                                            MusSendCodeFragment.this.mo57635k();
                                        }
                                    }

                                    /* renamed from: b */
                                    public final void mo57262b(C12710e<C12832o> eVar) {
                                        C21671bd.m72526a(((C12832o) eVar.f33709g).f33985d);
                                        MusSendCodeFragment.this.mo57626a((C12826i) eVar.f33709g);
                                    }

                                    /* renamed from: a */
                                    public final void mo57259a(int i, String str) {
                                        MusSendCodeFragment.this.mo57625a(i, str);
                                    }

                                    /* renamed from: b */
                                    public final void mo57261b(int i, String str) {
                                        MusSendCodeFragment.this.mo57628b(i, str);
                                    }
                                });
                            } else {
                                MusSendCodeFragment.this.f57730E.mo31201a(MusSendCodeFragment.this.mo57636l(), MusSendCodeFragment.this.mo57637m(), "", (C12851l) new C21342s(MusSendCodeFragment.this) {
                                    /* renamed from: a */
                                    public final void mo57361a(String str) {
                                        MusSendCodeFragment.this.mo57630c(str);
                                    }

                                    /* access modifiers changed from: private */
                                    /* renamed from: a */
                                    public void onNeedSecureCaptcha(C12710e<C12831n> eVar) {
                                        super.onNeedSecureCaptcha(eVar);
                                        if (MusSendCodeFragment.this.isViewValid()) {
                                            MusSendCodeFragment.this.mo57635k();
                                        }
                                    }

                                    public final void onSuccess(C12710e<C12831n> eVar) {
                                        C21671bd.m72526a(((C12831n) eVar.f33709g).f33981e);
                                        MusSendCodeFragment.this.mo57626a((C12826i) eVar.f33709g);
                                    }

                                    /* renamed from: a */
                                    public final void mo57360a(int i, String str) {
                                        MusSendCodeFragment.this.mo57625a(i, str);
                                    }
                                });
                            }
                        } else if (MusSendCodeFragment.this.f57727B) {
                            MusSendCodeFragment.this.f57730E.mo31207a(MusSendCodeFragment.this.mo57636l(), MusSendCodeFragment.this.mo57637m(), "", "", (C12853n) new C21344u(MusSendCodeFragment.this) {
                                /* renamed from: a */
                                public final void mo57363a(String str) {
                                    MusSendCodeFragment.this.mo57630c(str);
                                }

                                /* access modifiers changed from: private */
                                /* renamed from: a */
                                public void onNeedSecureCaptcha(C12710e<C12834q> eVar) {
                                    super.onNeedSecureCaptcha(eVar);
                                    if (MusSendCodeFragment.this.isViewValid()) {
                                        MusSendCodeFragment.this.mo57635k();
                                    }
                                }

                                public final void onSuccess(C12710e<C12834q> eVar) {
                                    C21671bd.m72526a(((C12834q) eVar.f33709g).f33991e);
                                    MusSendCodeFragment.this.mo57626a((C12826i) eVar.f33709g);
                                }

                                /* renamed from: a */
                                public final void mo57362a(int i, String str) {
                                    MusSendCodeFragment.this.mo57625a(i, str);
                                }
                            });
                        } else {
                            MusSendCodeFragment.this.f57730E.mo31200a(MusSendCodeFragment.this.mo57636l(), MusSendCodeFragment.this.mo57637m(), "", (C12849j) new C21274e(MusSendCodeFragment.this) {
                                /* renamed from: b */
                                public final void mo57262b(C12710e<C12832o> eVar) {
                                    MusSendCodeFragment.this.mo57626a((C12826i) eVar.f33709g);
                                }

                                /* access modifiers changed from: private */
                                /* renamed from: c */
                                public void onNeedSecureCaptcha(C12710e<C12832o> eVar) {
                                    super.onNeedSecureCaptcha(eVar);
                                    if (MusSendCodeFragment.this.isViewValid()) {
                                        MusSendCodeFragment.this.mo57635k();
                                    }
                                }

                                /* renamed from: a */
                                public final void mo57259a(int i, String str) {
                                    MusSendCodeFragment.this.mo57625a(i, str);
                                }

                                /* renamed from: b */
                                public final void mo57261b(int i, String str) {
                                    MusSendCodeFragment.this.mo57628b(i, str);
                                }
                            });
                        }
                    } else if (MusSendCodeFragment.this.getArguments() != null) {
                        MusSendCodeFragment.this.f57730E.mo31188a(MusSendCodeFragment.this.getArguments().getString("email"), MusSendCodeFragment.this.mo57637m(), 4, (Map) null, (String) null, (C12717a) new C12717a() {
                            /* access modifiers changed from: private */
                            /* renamed from: a */
                            public void onSuccess(C12729a aVar) {
                                MusSendCodeFragment.this.mo57357a();
                                C6907h.m21524a("email_code_verification_result", (Map) new C21102b().mo56946a("enter_from", "forget_password").mo56944a("is_success", 1).f56672a);
                                BaseMusLoginFragment baseMusLoginFragment = (BaseMusLoginFragment) C22334m.m73938a(MusSetPasswordFragment.class, MusSendCodeFragment.this.getArguments()).mo58754a("set_pass_scene", 4).mo58756a("enter_type", MusSendCodeFragment.this.f57413m).mo58756a("ticket", aVar.f33725g).mo58753a();
                                baseMusLoginFragment.mo57501a(MusSendCodeFragment.this.f57409h);
                                MusSendCodeFragment.this.mo57503b(baseMusLoginFragment, false);
                            }

                            /* access modifiers changed from: private */
                            /* renamed from: a */
                            public void onError(C12729a aVar, int i) {
                                MusSendCodeFragment.this.mo57357a();
                                C10761a.m31396b(MusSendCodeFragment.this.getContext(), aVar.f33703c, 0).mo25750a();
                                C6907h.m21524a("email_code_verification_result", (Map) new C21102b().mo56946a("enter_from", "forget_password").mo56944a("is_success", 0).mo56944a("error_code", aVar.f33702b).f56672a);
                            }
                        });
                    }
                }
            }
        });
        this.f57755s.addTextChangedListener(new C23467g() {
            public final void afterTextChanged(Editable editable) {
                MusSendCodeFragment.this.mo57629b(editable.toString());
            }
        });
        this.f57759w.setOnClickListener(new C21505an(this));
        if (this.f57409h != null) {
            this.f57759w.setTickListener(this.f57409h);
        }
        m72112s();
        m72115v();
        m72113t();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f57730E = C12798d.m37186a(getContext());
        this.f57750Z = new C6309f(this);
        m72110q();
        m72109f(view);
        if (bundle == null) {
            m72111r();
            C22180e.m73611a(this.f57735K, this.f57736L, new C22173a() {
                /* renamed from: a */
                public final void mo57562a(boolean z) {
                    String str;
                    if (MusSendCodeFragment.f57725n) {
                        StringBuilder sb = new StringBuilder("Voice verification code ");
                        if (z) {
                            str = "available";
                        } else {
                            str = "disabled";
                        }
                        sb.append(str);
                    }
                    if (MusSendCodeFragment.this.f57759w != null) {
                        MusSendCodeFragment.this.f57759w.setVoiceCodeEnabled(z);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo57625a(int i, String str) {
        String str2;
        String str3;
        if (this.f57726A == 6) {
            C21231d.m71459a(1, i, str);
        } else {
            C21231d.m71464b(false, i, str);
        }
        if (isViewValid() && getContext() != null) {
            String str4 = "login_failure";
            C21102b bVar = new C21102b();
            String str5 = "platform";
            if (this.f57753q) {
                str2 = "whatsapp";
            } else {
                str2 = "sms_verification";
            }
            C6907h.m21524a(str4, (Map) bVar.mo56946a(str5, str2).mo56946a("enter_method", this.f57412l).mo56946a("enter_type", this.f57413m).mo56946a("carrier", "").mo56944a("error_code", i).f56672a);
            if (i == 2006) {
                this.f57757u.setVisibility(0);
                this.f57758v.setText(str);
            } else if (i == 2027 || i == 2028) {
                if (TextUtils.isEmpty(str)) {
                    str3 = getString(R.string.c6i);
                } else {
                    str3 = str;
                }
                C10761a.m31403c(getContext(), str3).mo25750a();
            } else {
                this.f57757u.setVisibility(0);
                this.f57758v.setText(getResources().getString(R.string.cgj));
            }
            this.f57756t.setBackgroundColor(getResources().getColor(R.color.a14));
            m72108a(0, i, str);
            mo57357a();
        }
    }

    /* renamed from: b */
    public final void mo57628b(int i, String str) {
        String str2;
        String str3;
        if (this.f57726A == 6) {
            C21231d.m71459a(1, i, str);
        } else {
            C21231d.m71464b(false, i, str);
        }
        if (isViewValid() && getContext() != null) {
            String str4 = "login_failure";
            C21102b bVar = new C21102b();
            String str5 = "platform";
            if (this.f57753q) {
                str2 = "whatsapp";
            } else {
                str2 = "sms_verification";
            }
            C6907h.m21524a(str4, (Map) bVar.mo56946a(str5, str2).mo56946a("enter_method", this.f57412l).mo56946a("enter_type", this.f57413m).mo56946a("carrier", "").mo56944a("error_code", i).f56672a);
            this.f57757u.setVisibility(0);
            if (i == 2006) {
                this.f57758v.setText(str);
            } else if (i == 2027 || i == 2028) {
                if (TextUtils.isEmpty(str)) {
                    str3 = getString(R.string.c6i);
                } else {
                    str3 = str;
                }
                C10761a.m31403c(getContext(), str3).mo25750a();
            } else {
                this.f57758v.setText(getResources().getString(R.string.cce));
            }
            this.f57756t.setBackgroundColor(getResources().getColor(R.color.a14));
            m72108a(0, i, str);
            mo57357a();
        }
    }

    /* renamed from: a */
    private void m72108a(int i, int i2, String str) {
        if (this.f57752p) {
            C21537g.m72227d(i, i2, str);
        } else {
            C21537g.m72226c(i, i2, str);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.aed, viewGroup, false);
    }
}
