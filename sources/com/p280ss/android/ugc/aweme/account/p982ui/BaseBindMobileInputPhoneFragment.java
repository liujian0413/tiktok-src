package com.p280ss.android.ugc.aweme.account.p982ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import bolts.C1592h;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.common.C10775d;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.dialog.C11029b;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p662f.p663a.C12836s;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12855p;
import com.p280ss.android.account.token.C18897a;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.C21169e;
import com.p280ss.android.ugc.aweme.account.activity.BindMobileActivityV2;
import com.p280ss.android.ugc.aweme.account.fragment.VerificationCodeFragmentV2;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21323ad;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21348y;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p946i.C21220e;
import com.p280ss.android.ugc.aweme.account.p950k.C21235f;
import com.p280ss.android.ugc.aweme.account.util.C22325d;
import com.p280ss.android.ugc.aweme.account.util.C22326e;
import com.p280ss.android.ugc.aweme.account.util.C22344s;
import com.p280ss.android.ugc.aweme.account.util.C22347v;
import com.p280ss.android.ugc.aweme.account.view.StateButton.C22358a;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.main.p1385g.C33027m;
import com.p280ss.android.ugc.aweme.main.p1385g.C33030p;
import com.p280ss.android.ugc.aweme.main.p1385g.C33038x;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.user.C42811c;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.ui.BaseBindMobileInputPhoneFragment */
public abstract class BaseBindMobileInputPhoneFragment extends BaseAccountFragment implements C22307g {

    /* renamed from: q */
    public static final boolean f59376q = C7163a.m22363a();

    /* renamed from: A */
    private long f59377A;

    /* renamed from: B */
    private long f59378B = -1;

    /* renamed from: e */
    private String f59379e;

    /* renamed from: r */
    public int f59380r;

    /* renamed from: s */
    public String f59381s;

    /* renamed from: t */
    public String f59382t;

    /* renamed from: u */
    public String f59383u;

    /* renamed from: v */
    public String f59384v;

    /* renamed from: w */
    protected int f59385w;

    /* renamed from: x */
    private int f59386x;

    /* renamed from: y */
    private String f59387y;

    /* renamed from: z */
    private C12728d f59388z;

    /* renamed from: E */
    private int m73729E() {
        return this.f59380r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final int mo58623x() {
        return 1;
    }

    /* renamed from: j */
    public final long mo57601j() {
        return System.currentTimeMillis() - this.f59378B;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo58622w() {
        return mo58147k();
    }

    /* renamed from: A */
    private static int m73726A() {
        if (C6399b.m19944t()) {
            return R.string.si;
        }
        return R.string.sa;
    }

    /* renamed from: D */
    private static SharedPreferences m73728D() {
        return C7285c.m22838a(C21671bd.m72532b(), "com.ss.spipe_bind", 0);
    }

    /* renamed from: z */
    private void m73731z() {
        this.f59377A = m73728D().getLong("last_show_bind_dialog_time", 0);
    }

    public void onResume() {
        super.onResume();
        if (this.f59385w == 5) {
            this.f59378B = System.currentTimeMillis();
        }
    }

    /* renamed from: u */
    public final void mo58620u() {
        super.mo58620u();
        mo58125a(this.f58334o);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public final /* synthetic */ Object mo58631y() throws Exception {
        m73728D().edit().putLong("last_show_bind_dialog_time", this.f59377A).commit();
        return null;
    }

    /* renamed from: B */
    private boolean m73727B() {
        if (TimeUnit.DAYS.toMillis(1) <= System.currentTimeMillis() - this.f59377A && !TextUtils.isEmpty(this.f59382t)) {
            return C22325d.m73918b(this.f59382t);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo58621v() {
        String str;
        if (this.f58334o != null && isViewValid() && this.mBtnLogin != null) {
            final String p = mo58152p();
            if (!mo58147k()) {
                C10761a.m31403c((Context) C21671bd.m72532b(), getResources().getString(R.string.fsx)).mo25750a();
                return;
            }
            mo58618s();
            if (this.f59385w == 1) {
                this.f59380r = C21169e.f56932q;
                this.f59388z.mo31185a(p, "", m73729E(), 0, this.f59383u, 1, 1, "", this.f59384v, new C21348y(this) {
                    /* renamed from: b */
                    public final void mo57366b(C12710e<C12836s> eVar) {
                        C21235f.m71483a(1, BaseBindMobileInputPhoneFragment.this.f59380r, eVar.f33702b, eVar.f33703c);
                        if (BaseBindMobileInputPhoneFragment.this.isViewValid()) {
                            if (BaseBindMobileInputPhoneFragment.this.mBtnLogin != null) {
                                C22358a.m74033a(BaseBindMobileInputPhoneFragment.this.mBtnLogin);
                            }
                            if (eVar.f33702b == 1057) {
                                BaseBindMobileInputPhoneFragment.this.mo58627a(eVar);
                                return;
                            }
                            if (!TextUtils.isEmpty(eVar.f33703c)) {
                                BaseBindMobileInputPhoneFragment.this.mo58626a(eVar.f33702b, eVar.f33703c);
                            }
                        }
                    }

                    public final void onSuccess(C12710e<C12836s> eVar) {
                        super.onSuccess(eVar);
                        C21235f.m71483a(0, BaseBindMobileInputPhoneFragment.this.f59380r, 0, "");
                        if (BaseBindMobileInputPhoneFragment.this.isViewValid() && BaseBindMobileInputPhoneFragment.this.f58334o != null) {
                            if (BaseBindMobileInputPhoneFragment.this.mBtnLogin != null) {
                                C22358a.m74033a(BaseBindMobileInputPhoneFragment.this.mBtnLogin);
                            }
                            if (TextUtils.isEmpty(BaseBindMobileInputPhoneFragment.this.f59384v)) {
                                ((BaseAccountActivity) BaseBindMobileInputPhoneFragment.this.getActivity()).mo58616a(VerificationCodeFragment.m73864b(4, p, "", BaseBindMobileInputPhoneFragment.this.f59383u, BaseBindMobileInputPhoneFragment.this.f59381s));
                                return;
                            }
                            ((BaseAccountActivity) BaseBindMobileInputPhoneFragment.this.getActivity()).mo58616a(VerificationCodeFragment.m73865c(4, p, "", BaseBindMobileInputPhoneFragment.this.f59384v, BaseBindMobileInputPhoneFragment.this.f59381s));
                        }
                    }
                });
            } else if (this.f59385w == 2 || this.f59385w == 5) {
                if (this.f59385w == 5) {
                    KeyboardUtils.m77057c(this.mEditText);
                    C6907h.m21524a("click_next_for_proAccount", (Map) new C21102b().mo56944a("is_success", 1).mo56946a("method", "phone").mo56946a("page", "Set up by Phone").mo56945a("duration", System.currentTimeMillis() - this.f59378B).f56672a);
                }
                this.f59380r = C21169e.f56923h;
                this.f59388z.mo31184a(p, "", m73729E(), 0, "", 1, 1, (C12855p) new C21348y(this) {
                    public final void onSuccess(C12710e<C12836s> eVar) {
                        super.onSuccess(eVar);
                        C21235f.m71483a(0, BaseBindMobileInputPhoneFragment.this.f59380r, 0, "");
                        if (BaseBindMobileInputPhoneFragment.this.isViewValid()) {
                            if (BaseBindMobileInputPhoneFragment.this.f58334o != null) {
                                BaseBindMobileInputPhoneFragment.this.mo58619t();
                                BaseBindMobileInputPhoneFragment.this.mo58629f(p);
                            }
                            if (TextUtils.equals(BaseBindMobileInputPhoneFragment.this.f59381s, "live")) {
                                C21671bd.m72521a(C33030p.class);
                            }
                        }
                    }

                    /* renamed from: b */
                    public final void mo57366b(C12710e<C12836s> eVar) {
                        String str;
                        C21235f.m71483a(1, BaseBindMobileInputPhoneFragment.this.f59380r, eVar.f33702b, eVar.f33703c);
                        if (BaseBindMobileInputPhoneFragment.this.isViewValid()) {
                            BaseBindMobileInputPhoneFragment.this.mo58619t();
                            if (TextUtils.equals(BaseBindMobileInputPhoneFragment.this.f59381s, "live")) {
                                C21671bd.m72521a(C33030p.class);
                            }
                            if (eVar.f33702b == 1057) {
                                if (TextUtils.equals(BaseBindMobileInputPhoneFragment.this.f59381s, "authorize_force_bind")) {
                                    C10761a.m31409e(BaseBindMobileInputPhoneFragment.this.getContext(), (int) R.string.cj).mo25750a();
                                } else {
                                    BaseBindMobileInputPhoneFragment.this.mo58627a(eVar);
                                }
                            } else if (eVar.f33702b == 2015) {
                                BaseBindMobileInputPhoneFragment.this.mo58628a(p, (OnClickListener) new C22305e(this, p));
                            } else {
                                if (eVar.f33702b == 1001) {
                                    if (BaseBindMobileInputPhoneFragment.this.f59385w == 5) {
                                        C6907h.m21524a("input_wrong_phone", (Map) new C21102b().mo56946a("page", "Set up by Phone").mo56946a("error_code", "2").f56672a);
                                        if (BaseBindMobileInputPhoneFragment.this.isViewValid()) {
                                            Context context = BaseBindMobileInputPhoneFragment.this.getContext();
                                            if (TextUtils.isEmpty(eVar.f33703c)) {
                                                str = BaseBindMobileInputPhoneFragment.this.getResources().getString(R.string.ctp);
                                            } else {
                                                str = eVar.f33703c;
                                            }
                                            C10761a.m31403c(context, str).mo25750a();
                                        }
                                    }
                                } else if (eVar.f33702b == 1003) {
                                    if (BaseBindMobileInputPhoneFragment.this.f59385w == 5) {
                                        C6907h.m21524a("input_wrong_phone", (Map) new C21102b().mo56946a("page", "Set up by Phone").mo56946a("error_code", "1").f56672a);
                                    }
                                } else if (!TextUtils.isEmpty(eVar.f33703c)) {
                                    BaseBindMobileInputPhoneFragment.this.mo58626a(eVar.f33702b, eVar.f33703c);
                                }
                            }
                        }
                    }

                    /* access modifiers changed from: 0000 */
                    /* renamed from: a */
                    public final /* synthetic */ void mo58637a(String str, DialogInterface dialogInterface, int i) {
                        BaseBindMobileInputPhoneFragment.this.mo58629f(str);
                    }
                });
            } else if (this.f59385w == 4) {
                this.f59380r = C21169e.f56936u;
                this.f59388z.mo31187a(p, "", m73729E(), (C12855p) new C21348y(this) {
                    public final void onSuccess(C12710e<C12836s> eVar) {
                        super.onSuccess(eVar);
                        C21235f.m71483a(0, BaseBindMobileInputPhoneFragment.this.f59380r, 0, "");
                        if (BaseBindMobileInputPhoneFragment.this.isViewValid() && BaseBindMobileInputPhoneFragment.this.f58334o != null) {
                            if (BaseBindMobileInputPhoneFragment.this.mBtnLogin != null) {
                                C22358a.m74033a(BaseBindMobileInputPhoneFragment.this.mBtnLogin);
                            }
                            BaseBindMobileInputPhoneFragment.this.mo58630g(p);
                        }
                    }

                    /* renamed from: b */
                    public final void mo57366b(C12710e<C12836s> eVar) {
                        C21235f.m71483a(1, BaseBindMobileInputPhoneFragment.this.f59380r, eVar.f33702b, eVar.f33703c);
                        if (BaseBindMobileInputPhoneFragment.this.isViewValid()) {
                            if (BaseBindMobileInputPhoneFragment.this.mBtnLogin != null) {
                                C22358a.m74033a(BaseBindMobileInputPhoneFragment.this.mBtnLogin);
                            }
                            if (eVar.f33702b == 1057) {
                                BaseBindMobileInputPhoneFragment.this.mo58627a(eVar);
                            } else if (eVar.f33702b == 2015) {
                                BaseBindMobileInputPhoneFragment.this.mo58628a(p, (OnClickListener) new C22306f(this, p));
                            } else {
                                if (!TextUtils.isEmpty(eVar.f33703c)) {
                                    BaseBindMobileInputPhoneFragment.this.mo58626a(eVar.f33702b, eVar.f33703c);
                                }
                            }
                        }
                    }

                    /* access modifiers changed from: 0000 */
                    /* renamed from: a */
                    public final /* synthetic */ void mo58638a(String str, DialogInterface dialogInterface, int i) {
                        BaseBindMobileInputPhoneFragment.this.mo58630g(str);
                    }
                });
            } else if (this.f59385w == 3) {
                this.f59380r = C21169e.f56940y;
                this.f59388z.mo31185a(p, "", m73729E(), 0, this.f59383u, 1, 1, "", this.f59384v, new C21348y(this) {
                    /* renamed from: b */
                    public final void mo57366b(C12710e<C12836s> eVar) {
                        C21235f.m71483a(1, BaseBindMobileInputPhoneFragment.this.f59380r, eVar.f33702b, eVar.f33703c);
                        if (BaseBindMobileInputPhoneFragment.this.isViewValid()) {
                            if (BaseBindMobileInputPhoneFragment.this.mBtnLogin != null) {
                                C22358a.m74033a(BaseBindMobileInputPhoneFragment.this.mBtnLogin);
                            }
                            if (!TextUtils.isEmpty(eVar.f33703c)) {
                                BaseBindMobileInputPhoneFragment.this.mo58626a(eVar.f33702b, eVar.f33703c);
                            }
                        }
                    }

                    public final void onSuccess(C12710e<C12836s> eVar) {
                        super.onSuccess(eVar);
                        C21235f.m71483a(0, BaseBindMobileInputPhoneFragment.this.f59380r, 0, "");
                        if (BaseBindMobileInputPhoneFragment.this.isViewValid() && BaseBindMobileInputPhoneFragment.this.f58334o != null) {
                            if (BaseBindMobileInputPhoneFragment.this.mBtnLogin != null) {
                                C22358a.m74033a(BaseBindMobileInputPhoneFragment.this.mBtnLogin);
                            }
                            ((BaseAccountActivity) BaseBindMobileInputPhoneFragment.this.getActivity()).mo58616a(VerificationCodeFragment.m73864b(3, p, "", "", BaseBindMobileInputPhoneFragment.this.f59381s));
                        }
                    }
                });
                C22358a.m74033a(this.mBtnLogin);
            }
            if (this.f59381s == null || !this.f59381s.contains("third_party_")) {
                str = this.f59381s;
            } else {
                str = "log_in";
            }
            C6907h.m21524a("send_sms", (Map) new C21102b().mo56946a("send_method", "user_click").mo56944a("send_reason", this.f59380r).mo56946a("enter_from", str).f56672a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo57106d() {
        mo58156r();
        m73731z();
        if (getArguments() != null) {
            this.f59385w = getArguments().getInt("type");
            this.f59381s = getArguments().getString("enter_from");
            this.f59383u = getArguments().getString("ticket");
            this.f59382t = C22325d.m73917a(this.f59381s);
            this.f59384v = getArguments().getString("unusable_mobile_ticket");
            this.f59379e = getArguments().getString("profile_key");
            this.f58334o.setHint(R.string.sk);
            this.f59386x = getArguments().getInt("proaccount_switch_type");
            this.f59387y = getArguments().getString("proaccount_category");
            if (this.f59385w == 1) {
                this.mTitleHint.setText(R.string.se);
                this.mTxtHint.setText(R.string.s9);
            } else if (this.f59385w == 5) {
                ((BaseBindMobileActivity) getActivity()).f59375p = new C22303c(this);
                this.mSelectCountryDown.setImageResource(R.drawable.a2x);
                this.backBtn.setImageResource(R.drawable.cmw);
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.setMargins((int) C9738o.m28708b(getContext(), 32.0f), (int) C9738o.m28708b(getContext(), 10.0f), (int) C9738o.m28708b(getContext(), 32.0f), 0);
                layoutParams.addRule(3, R.id.e6z);
                this.mLLContainer.setLayoutParams(layoutParams);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.setMargins(0, 0, 0, 0);
                layoutParams2.gravity = 16;
                this.f58332m.setLayoutParams(layoutParams2);
                this.mPhoneDownView.setVisibility(0);
                this.f58334o.setHintTextColor(getResources().getColor(R.color.a52));
                this.f58334o.setTextColor(getResources().getColor(R.color.a4z));
                LayoutParams layoutParams3 = new LayoutParams(-2, -2);
                layoutParams3.addRule(9, -1);
                layoutParams3.addRule(3, this.mRlTitle.getId());
                layoutParams3.setMargins((int) C9738o.m28708b(getContext(), 32.0f), (int) C9738o.m28708b(getContext(), 40.0f), (int) C9738o.m28708b(getContext(), 32.0f), 0);
                this.mTitleHint.setLayoutParams(layoutParams3);
                this.mTitleHint.setGravity(8388611);
                this.mTitleHint.setText(R.string.d3m);
                this.mTitleHint.setTextSize(20.0f);
                this.mTitleHint.setTextColor(getResources().getColor(R.color.a4z));
                LayoutParams layoutParams4 = new LayoutParams(-2, -2);
                layoutParams4.setMargins((int) C9738o.m28708b(getContext(), 32.0f), (int) C9738o.m28708b(getContext(), 8.0f), (int) C9738o.m28708b(getContext(), 32.0f), (int) C9738o.m28708b(getContext(), 28.0f));
                layoutParams4.addRule(9, -1);
                layoutParams4.addRule(3, this.mTitleHint.getId());
                this.mTxtHint.setGravity(8388611);
                this.mTxtHint.setLayoutParams(layoutParams4);
                this.mTxtHint.setTextColor(getResources().getColor(R.color.a53));
                this.mTxtHint.setText(R.string.bf_);
                this.mBtnPreAccount.setVisibility(0);
                this.mBtnLogin.setVisibility(8);
                this.mBtnPreAccount.setText(getString(R.string.t4));
                LayoutParams layoutParams5 = new LayoutParams(-2, -2);
                layoutParams5.setMargins((int) C9738o.m28708b(getContext(), 32.0f), (int) C9738o.m28708b(getContext(), 12.0f), (int) C9738o.m28708b(getContext(), 32.0f), 0);
                layoutParams5.addRule(3, R.id.abz);
                this.mPasswordTip.setLayoutParams(layoutParams5);
                this.mPasswordTip.setVisibility(0);
                this.mPasswordTip.setText(R.string.cbh);
                this.mPasswordTip.setGravity(8388611);
                this.mPasswordTip.setTextColor(getResources().getColor(R.color.a53));
                this.mDmtStatusView.setBuilder(C10803a.m31631a(getContext()));
                this.mPhoneContainer.setBackgroundResource(0);
                this.mSwitchToEmail.setVisibility(0);
                String a = C1642a.m8034a(getString(R.string.dpx), new Object[]{getString(R.string.dpv)});
                SpannableString spannableString = new SpannableString(a);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(R.color.a4r));
                spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.a4z)), 0, a.length() - getString(R.string.dpv).length(), 33);
                spannableString.setSpan(foregroundColorSpan, a.length() - getString(R.string.dpv).length(), a.length(), 33);
                this.mSwitchToEmail.setText(spannableString);
                this.mSwitchToEmail.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        String str;
                        String str2;
                        ClickInstrumentation.onClick(view);
                        C6907h.onEventV3("set_up_by_email");
                        if (C6399b.m19946v()) {
                            str = "https://m.tiktok.com/passport/email/email_bind_index/";
                        } else {
                            str = "https://www.tiktok.com/passport/email/email_bind_index/";
                        }
                        C19290j jVar = new C19290j(str);
                        C42811c.m135845a();
                        User b = C42811c.m135859b();
                        String b2 = ((C33027m) C21671bd.m72521a(C33027m.class)).mo60025b();
                        String a = ((C33027m) C21671bd.m72521a(C33027m.class)).mo60024a();
                        jVar.mo51188a("lang", b2);
                        jVar.mo51186a("aid", 1233);
                        jVar.mo51188a("locale", a);
                        jVar.mo51188a("enterfrom", "switchtoproaccount");
                        if (!TextUtils.isEmpty(b.getEmail())) {
                            jVar.mo51188a("email", b.getEmail());
                            StringBuilder sb = new StringBuilder();
                            sb.append(jVar.mo51184a());
                            sb.append("#verify-email");
                            str2 = sb.toString();
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(jVar.mo51184a());
                            sb2.append("#bind-email");
                            str2 = sb2.toString();
                        }
                        C22326e.m73920a(BaseBindMobileInputPhoneFragment.this.getActivity(), str2, true);
                    }
                });
                this.f58333n.setTextColor(getResources().getColor(R.color.a4z));
            } else if (this.f59385w == 2) {
                this.mTitleHint.setText(R.string.sj);
                this.mTxtHint.setText(m73726A());
                if (this.f59381s != null && this.f59381s.contains("third_party_")) {
                    this.mRightText.setVisibility(0);
                    this.backBtn.setVisibility(4);
                    if (!C10775d.m31450a().f28891a && C21671bd.m72540h().isForbidSkipBindPhone() && C21671bd.m72542j()) {
                        this.mRightText.setVisibility(4);
                    }
                }
                if (TextUtils.equals(this.f59381s, "authorize_force_bind")) {
                    this.mTitleHint.setText(R.string.c6y);
                    this.mTxtHint.setVisibility(8);
                    this.mRightText.setVisibility(4);
                    this.backBtn.setImageDrawable(C0683b.m2903a(getContext(), (int) R.drawable.a1s));
                    if ((getActivity() instanceof BaseAccountActivity) && getActivity().getSupportFragmentManager().mo2657e() > 1) {
                        this.backBtn.setImageDrawable(C0683b.m2903a(getContext(), (int) R.drawable.a1q));
                    }
                }
            } else if (this.f59385w == 4) {
                this.mTitleHint.setText(R.string.sj);
                this.mTxtHint.setText(m73726A());
            } else if (this.f59385w == 3) {
                if (C6399b.m19944t()) {
                    this.mTitleHint.setText(R.string.sf);
                    this.mTxtHint.setText(R.string.fnn);
                } else {
                    this.mTitleHint.setText(R.string.sb);
                    this.mTxtHint.setText(R.string.zl);
                    this.f58334o.setHint("");
                }
            }
            this.f59388z = C12798d.m37186a(getContext());
        }
    }

    /* renamed from: g */
    public final void mo58630g(String str) {
        ((BaseAccountActivity) getActivity()).mo58616a(VerificationCodeFragment.m73863a(this.f59381s, 8, str, C42914ab.m136242a().mo104633a("profile_key", this.f59379e).f111445a));
    }

    /* renamed from: a */
    public final void mo58627a(final C12710e<C12836s> eVar) {
        if (eVar != null && eVar.f33702b == 1057) {
            C6907h.m21524a("phone_bundling_conflict_alert", (Map) new C21102b().mo56946a("enter_from", "log_in").mo56946a("platform", C21220e.m71416a(this.f59382t)).f56672a);
            new C10741a(getContext()).mo25649a((int) R.string.s8).mo25657b((int) R.string.s6).mo25650a((int) R.string.s5, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C6907h.m21524a("phone_bundling_conflict_check", (Map) new C21102b().mo56946a("enter_from", "log_in").mo56946a("platform", C21220e.m71416a(BaseBindMobileInputPhoneFragment.this.f59382t)).f56672a);
                    String str = ((C12836s) eVar.f33709g).f34000d;
                    if (!TextUtils.isEmpty(str)) {
                        Map a = C18897a.m61680a(str);
                        JSONObject jSONObject = new JSONObject();
                        for (Entry entry : a.entrySet()) {
                            try {
                                jSONObject.put((String) entry.getKey(), entry.getValue());
                            } catch (Exception unused) {
                            }
                        }
                        ((C33038x) C21671bd.m72521a(C33038x.class)).mo60006a((Context) C21671bd.m72532b(), AppLog.addCommonParams(str, false), jSONObject.toString());
                    }
                    dialogInterface.dismiss();
                }
            }).mo25658b((int) R.string.s4, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C6907h.m21524a("phone_bundling_conflict_cancel", (Map) new C21102b().mo56946a("enter_from", "log_in").mo56946a("platform", C21220e.m71416a(BaseBindMobileInputPhoneFragment.this.f59382t)).f56672a);
                    dialogInterface.dismiss();
                }
            }).mo25656a().mo25637a().setCanceledOnTouchOutside(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo58172e(String str) {
        if (C6399b.m19944t() || this.f59385w != 2 || m73727B()) {
            super.mo58172e(this.f59382t);
            return;
        }
        C11029b a = C22347v.m73994a(getContext()).mo26645b((int) R.string.t5).mo26646b((int) R.string.e2a, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                BaseBindMobileInputPhoneFragment.super.mo58172e(BaseBindMobileInputPhoneFragment.this.f59382t);
            }
        }).mo26635a((int) R.string.st, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }).mo26642a(false).mo26644a();
        a.setCanceledOnTouchOutside(false);
        a.show();
        this.f59377A = System.currentTimeMillis();
        C1592h.m7855a((Callable<TResult>) new C22304d<TResult>(this), (Executor) C1592h.f5957a);
    }

    /* renamed from: f */
    public final void mo58629f(String str) {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof BindMobileActivityV2)) {
            if (activity != null) {
                if (this.f59385w != 5) {
                    ((BaseAccountActivity) activity).mo58616a(VerificationCodeFragment.m73864b(5, str, "", "", this.f59381s));
                } else {
                    ((BaseAccountActivity) activity).mo58616a(VerificationCodeFragment.m73862a(9, str, "", "", this.f59381s, this.f59386x, this.f59387y));
                }
            }
        } else if (this.f59385w != 5) {
            ((BaseAccountActivity) activity).mo58616a(VerificationCodeFragmentV2.m71347a(5, str, "", "", this.f59381s));
        } else {
            ((BaseAccountActivity) activity).mo58616a(VerificationCodeFragmentV2.m71347a(9, str, "", "", this.f59381s));
        }
    }

    /* renamed from: a */
    public final void mo58626a(int i, String str) {
        C22344s.m73953a(getContext(), str, i);
    }

    /* renamed from: a */
    public final void mo58628a(String str, final OnClickListener onClickListener) {
        this.f59388z.mo31214b(str, (String) null, m73729E(), (C12855p) new C21323ad(this) {
            /* renamed from: a */
            public final void mo57345a(C12710e<C12836s> eVar) {
            }

            public final void onSuccess(C12710e<C12836s> eVar) {
                super.onSuccess(eVar);
                if (BaseBindMobileInputPhoneFragment.this.getActivity() != null) {
                    C11030a a = C22347v.m73994a(BaseBindMobileInputPhoneFragment.this.getActivity());
                    a.mo26634a((int) R.string.cti).mo26645b((int) R.string.ctj).mo26646b((int) R.string.bfm, onClickListener).mo26642a(false);
                    C42951au.m136342a(a.mo26644a());
                }
            }
        });
        C6907h.m21524a("send_voice_verification_code", (Map) new C21102b().mo56946a("send_reason", String.valueOf(m73729E())).mo56946a("send_method", "anti_spam").f56672a);
    }
}
