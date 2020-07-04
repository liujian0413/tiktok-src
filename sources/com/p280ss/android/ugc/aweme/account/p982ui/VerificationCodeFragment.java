package com.p280ss.android.ugc.aweme.account.p982ui;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.ArrayMap;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import butterknife.OnClick;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p645a.p646a.C12713h;
import com.bytedance.sdk.account.p645a.p647b.C12718b;
import com.bytedance.sdk.account.p645a.p649d.C12730b;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p662f.p663a.C12818a;
import com.bytedance.sdk.account.p662f.p663a.C12819b;
import com.bytedance.sdk.account.p662f.p663a.C12820c;
import com.bytedance.sdk.account.p662f.p663a.C12821d;
import com.bytedance.sdk.account.p662f.p663a.C12833p;
import com.bytedance.sdk.account.p662f.p663a.C12836s;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12840a;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12841b;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12842c;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12843d;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12852m;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12855p;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12859t;
import com.p280ss.android.account.C18892b.C18893a;
import com.p280ss.android.account.p816b.C18894a;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.C21765p;
import com.p280ss.android.ugc.aweme.IAccountService.C21083g;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21169e;
import com.p280ss.android.ugc.aweme.account.login.C21592t;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21323ad;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21326c;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21329f;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21333j;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21348y;
import com.p280ss.android.ugc.aweme.account.login.p974ui.InputCaptchaFragment.C21823a;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.p280ss.android.ugc.aweme.account.model.AccountOpeModel;
import com.p280ss.android.ugc.aweme.account.model.C22199b;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21101a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p946i.C21220e;
import com.p280ss.android.ugc.aweme.account.p950k.C21229c;
import com.p280ss.android.ugc.aweme.account.p950k.C21235f;
import com.p280ss.android.ugc.aweme.account.util.C22325d;
import com.p280ss.android.ugc.aweme.account.util.C22344s;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.p280ss.android.ugc.aweme.account.util.C22347v;
import com.p280ss.android.ugc.aweme.account.view.StateButton.C22358a;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.main.p1385g.C33038x;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.UserResponse;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.ui.VerificationCodeFragment */
public class VerificationCodeFragment extends BaseAccountFragment implements C6310a, C22307g {

    /* renamed from: e */
    public static final boolean f59511e = C7163a.m22363a();

    /* renamed from: A */
    boolean f59512A;

    /* renamed from: B */
    boolean f59513B;

    /* renamed from: C */
    public long f59514C = -1;

    /* renamed from: D */
    public C12728d f59515D;

    /* renamed from: E */
    public C21823a f59516E = new C21823a() {
        /* renamed from: a */
        public final void mo57346a() {
            VerificationCodeFragment.this.mo57355c();
            VerificationCodeFragment.this.f59515D.mo31177a(C21169e.f56936u, (C12852m) new C12852m() {
                public final /* bridge */ /* synthetic */ void onNeedCaptcha(C12707b bVar, String str) {
                }

                public final void onSuccess(C12710e<C12833p> eVar) {
                    if (eVar != null && eVar.f33709g != null && !TextUtils.isEmpty(((C12833p) eVar.f33709g).f33986a)) {
                        VerificationCodeFragment.this.mo57354a(((C12833p) eVar.f33709g).f33986a, null, ((C12833p) eVar.f33709g).f33970r, VerificationCodeFragment.this.f59516E);
                    }
                }

                public final void onError(C12710e<C12833p> eVar, int i) {
                    if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(eVar.f33703c)) {
                        VerificationCodeFragment.this.mo58626a(eVar.f33702b, eVar.f33703c);
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo57347a(String str, int i) {
            VerificationCodeFragment.this.f59515D.mo31180a(VerificationCodeFragment.this.mEditText.getText().toString(), C21169e.f56934s, true, 0, VerificationCodeFragment.this.f59529w, VerificationCodeFragment.this.f59517F);
        }
    };

    /* renamed from: F */
    public C12859t f59517F = new C12859t() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onSuccess(C12713h hVar) {
            if (VerificationCodeFragment.this.isViewValid() && VerificationCodeFragment.this.getActivity() != null) {
                Intent intent = new Intent();
                intent.putExtra("ticket", hVar.f33722g);
                VerificationCodeFragment.this.getActivity().setResult(-1, intent);
                VerificationCodeFragment.this.getActivity().finish();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNeedCaptcha(C12713h hVar, String str) {
            if (!TextUtils.isEmpty(str)) {
                VerificationCodeFragment.this.mo57354a(str, hVar.f33703c, C21169e.f56934s, VerificationCodeFragment.this.f59516E);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onError(C12713h hVar, int i) {
            if (VerificationCodeFragment.this.isViewValid()) {
                C22358a.m74033a(VerificationCodeFragment.this.mBtnLogin);
                VerificationCodeFragment.this.backBtn.setEnabled(true);
                if (C22325d.f59597a.contains(Integer.valueOf(hVar.f33702b))) {
                    Intent intent = new Intent();
                    intent.putExtra("error_code", hVar.f33702b);
                    if (VerificationCodeFragment.this.getActivity() != null) {
                        VerificationCodeFragment.this.getActivity().setResult(0, intent);
                        VerificationCodeFragment.this.getActivity().finish();
                    }
                    return;
                }
                if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(hVar.f33703c)) {
                    VerificationCodeFragment.this.mo58626a(hVar.f33702b, hVar.f33703c);
                }
            }
        }
    };

    /* renamed from: G */
    private String f59518G;

    /* renamed from: H */
    private String f59519H;

    /* renamed from: J */
    private String f59520J;

    /* renamed from: K */
    private int f59521K;

    /* renamed from: L */
    private C6309f f59522L;

    /* renamed from: q */
    public boolean f59523q = true;

    /* renamed from: r */
    public int f59524r = 60;

    /* renamed from: s */
    protected int f59525s;

    /* renamed from: t */
    protected String f59526t;

    /* renamed from: u */
    public String f59527u;

    /* renamed from: v */
    public String f59528v;

    /* renamed from: w */
    public String f59529w;

    /* renamed from: x */
    public int f59530x;

    /* renamed from: y */
    boolean f59531y;

    /* renamed from: z */
    public String f59532z;

    /* renamed from: J */
    private String m73858J() {
        return this.f59526t;
    }

    /* renamed from: M */
    private int m73861M() {
        return this.f59530x;
    }

    /* renamed from: B */
    public final void mo58727B() {
        C21671bd.m72525a((Handler) this.f59522L, false);
    }

    /* renamed from: j */
    public final long mo57601j() {
        return System.currentTimeMillis() - this.f59514C;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f59523q = false;
    }

    /* renamed from: I */
    private void m73857I() {
        C6726a.m20842a(new Runnable() {
            public final void run() {
                while (VerificationCodeFragment.this.f59523q) {
                    C6726a.m20844b(new Runnable() {
                        public final void run() {
                            if (VerificationCodeFragment.this.f59524r < 0) {
                                VerificationCodeFragment.this.mo58733z();
                            } else if (VerificationCodeFragment.this.mTxtTimer != null) {
                                TextView textView = VerificationCodeFragment.this.mTxtTimer;
                                Resources resources = VerificationCodeFragment.this.getContext().getResources();
                                VerificationCodeFragment verificationCodeFragment = VerificationCodeFragment.this;
                                int i = verificationCodeFragment.f59524r;
                                verificationCodeFragment.f59524r = i - 1;
                                textView.setText(resources.getString(R.string.dge, new Object[]{Integer.valueOf(i)}));
                            }
                        }
                    });
                    try {
                        Thread.sleep(1000);
                    } catch (Exception unused) {
                    }
                }
            }
        });
    }

    /* renamed from: K */
    private String m73859K() {
        return this.mEditText.getText().toString();
    }

    /* renamed from: L */
    private String m73860L() {
        return this.mPasswordEt.getText().toString();
    }

    /* renamed from: A */
    public final void mo58726A() {
        C21671bd.m72524a(this.f59521K, this.f59532z, (C21083g) new C21083g() {
            /* renamed from: a */
            public final void mo56868a(int i, int i2, Object obj) {
                if (i == 14 && i2 == 1) {
                    User k = C21671bd.m72543k();
                    if (k == null || !k.isSecret()) {
                        if (VerificationCodeFragment.this.isViewValid()) {
                            KeyboardUtils.m77057c(VerificationCodeFragment.this.backBtn);
                            VerificationCodeFragment.this.backBtn.setEnabled(true);
                            VerificationCodeFragment.this.mo58733z();
                            VerificationCodeFragment.this.mo58619t();
                        }
                        if (VerificationCodeFragment.this.getActivity() != null) {
                            VerificationCodeFragment.this.getActivity().finish();
                        }
                        C21671bd.m72544l();
                        C21671bd.m72522a(7, 1, (Object) null);
                        C6907h.m21524a("switch_to_pro_account_success", (Map) C21102b.m71165a().mo56946a("classes", VerificationCodeFragment.this.f59532z).f56672a);
                        return;
                    }
                    VerificationCodeFragment.this.mo58727B();
                } else {
                    if (VerificationCodeFragment.this.isViewValid()) {
                        KeyboardUtils.m77057c(VerificationCodeFragment.this.backBtn);
                        VerificationCodeFragment.this.backBtn.setEnabled(true);
                        VerificationCodeFragment.this.mo58733z();
                        VerificationCodeFragment.this.mo58619t();
                    }
                    if (VerificationCodeFragment.this.getActivity() != null) {
                        C10761a.m31399c((Context) VerificationCodeFragment.this.getActivity(), (int) R.string.cjt).mo25750a();
                    }
                }
            }
        });
    }

    public void onResume() {
        super.onResume();
        if (this.f59525s == 9) {
            this.f59514C = System.currentTimeMillis();
        }
    }

    /* renamed from: H */
    private void m73856H() {
        C6907h.m21524a("auto_fill_sms_verification", (Map) new C21102b().mo56946a("enter_method", this.f58305i).f56672a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final int mo58623x() {
        if ((this.f59525s != 5 || this.f59531y) && this.f59525s != 8 && (this.f59525s != 9 || this.f59531y)) {
            return 0;
        }
        return 3;
    }

    /* renamed from: z */
    public final void mo58733z() {
        this.f59523q = false;
        if (this.mTxtTimer != null) {
            this.mTxtTimer.setText(getString(R.string.dfr));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo58622w() {
        if ((this.f59525s == 5 || this.f59525s == 9) && !this.f59531y) {
            if (this.mEditText.getText().length() != 4 || this.mPasswordEt == null || TextUtils.isEmpty(this.mPasswordEt.getText())) {
                return false;
            }
            return true;
        } else if (this.mEditText.getText().length() == 4) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: y */
    public final void mo58732y() {
        this.f59515D.mo31214b(this.f59526t, (String) null, this.f59530x, (C12855p) new C21323ad(this) {
            /* renamed from: a */
            public final void mo57345a(C12710e<C12836s> eVar) {
            }

            public final void onSuccess(C12710e<C12836s> eVar) {
                super.onSuccess(eVar);
                if (VerificationCodeFragment.this.getActivity() != null) {
                    C11030a a = C22347v.m73994a(VerificationCodeFragment.this.getActivity());
                    a.mo26634a((int) R.string.cti).mo26645b((int) R.string.ctj).mo26646b((int) R.string.bfm, (OnClickListener) null).mo26642a(false);
                    C42951au.m136342a(a.mo26644a());
                }
            }
        });
        C6907h.m21524a("send_voice_verification_code", (Map) new C21102b().mo56946a("send_reason", String.valueOf(m73861M())).mo56946a("send_method", "anti_spam").f56672a);
    }

    /* renamed from: D */
    private void m73852D() {
        if (!TextUtils.isEmpty(this.f59526t)) {
            int indexOf = getString(R.string.fjx).indexOf(37);
            if (indexOf != -1) {
                SpannableString spannableString = new SpannableString(C1642a.m8034a(getString(R.string.fjx), new Object[]{this.f59526t}));
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#face15")), indexOf, this.f59526t.length() + indexOf, 17);
                this.mTxtHint.setText(spannableString);
            }
        }
    }

    /* renamed from: E */
    private void m73853E() {
        if (!TextUtils.isEmpty(this.f59526t)) {
            int indexOf = getString(R.string.zk).indexOf(37);
            if (indexOf != -1) {
                SpannableString spannableString = new SpannableString(C1642a.m8034a(getString(R.string.zk), new Object[]{this.f59526t}));
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#face15")), indexOf, this.f59526t.length() + indexOf, 17);
                this.mTxtHint.setText(spannableString);
            }
        }
    }

    /* renamed from: F */
    private void m73854F() {
        if (!TextUtils.isEmpty(this.f59526t)) {
            String a = PhoneNumberUtil.m73059a(this.f59526t);
            String a2 = C1642a.m8034a(getString(R.string.sh), new Object[]{a});
            int indexOf = a2.indexOf(a);
            SpannableString spannableString = new SpannableString(a2);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#face15")), indexOf, this.f59526t.length() + indexOf, 17);
            this.mTxtHint.setText(spannableString);
        }
    }

    /* renamed from: G */
    private void m73855G() {
        C0052o oVar;
        FragmentActivity activity = getActivity();
        if (activity instanceof ModifyMobileActivity) {
            oVar = ((ModifyMobileActivity) activity).mo57463l();
        } else if (activity instanceof BindMobileActivity) {
            oVar = ((BindMobileActivity) activity).mo58141e();
        } else {
            oVar = null;
        }
        if (oVar != null) {
            if (!TextUtils.isEmpty((CharSequence) oVar.getValue())) {
                this.mEditText.setText((CharSequence) oVar.getValue());
                m73856H();
                oVar.setValue("");
            }
            oVar.observe(this, new C22314m(this));
        }
    }

    @OnClick({2131493605})
    public void reSendCode() {
        if (this.f59524r < 0) {
            int i = 0;
            if (this.f59525s == 1) {
                i = C21169e.f56928m;
            } else if (this.f59525s == 3) {
                i = C21169e.f56940y;
            } else if (this.f59525s == 4) {
                i = C21169e.f56932q;
            } else if (this.f59525s == 5 || this.f59525s == 9) {
                i = C21169e.f56923h;
            } else if (this.f59525s == 6) {
                i = C21169e.f56934s;
            } else if (this.f59525s == 7) {
                i = C21169e.f56934s;
            } else if (this.f59525s == 8) {
                i = C21169e.f56936u;
            }
            this.f59530x = i;
            if (this.f59525s == 9) {
                C6907h.onEventV3("resend_code_phone");
            }
            this.f59515D.mo31185a(this.f59526t, "", this.f59530x, 0, this.f59518G, 1, 0, this.f59529w, this.f59520J, new C21348y(this) {
                public final void onSuccess(C12710e<C12836s> eVar) {
                    super.onSuccess(eVar);
                    C21235f.m71483a(0, VerificationCodeFragment.this.f59530x, 0, "");
                }

                /* renamed from: b */
                public final void mo57366b(C12710e<C12836s> eVar) {
                    C21235f.m71483a(1, VerificationCodeFragment.this.f59530x, eVar.f33702b, eVar.f33703c);
                    if (C22325d.f59597a.contains(Integer.valueOf(eVar.f33702b))) {
                        Intent intent = new Intent();
                        intent.putExtra("error_code", eVar.f33702b);
                        if (VerificationCodeFragment.this.getActivity() != null) {
                            VerificationCodeFragment.this.getActivity().setResult(0, intent);
                            VerificationCodeFragment.this.getActivity().finish();
                        }
                    } else if (eVar.f33702b == 2015) {
                        VerificationCodeFragment.this.mo58732y();
                    } else {
                        if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(eVar.f33703c)) {
                            VerificationCodeFragment.this.mo58626a(eVar.f33702b, eVar.f33703c);
                        }
                    }
                }
            });
            C6907h.m21524a("send_sms", (Map) new C21102b().mo56946a("send_method", "user_click").mo56944a("send_reason", this.f59530x).mo56946a("enter_method", C21592t.f57969a).mo56946a("enter_from", C21592t.f57970b).f56672a);
            this.f59524r = 60;
            this.f59523q = true;
            m73857I();
            C6907h.m21518a((Context) getActivity(), "resend_click", "verification_code", C21671bd.m72536d(), 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo58621v() {
        this.backBtn.setEnabled(false);
        if (this.f59525s != 9 || !this.f59512A) {
            if (this.f59525s == 1) {
                this.f59515D.mo31182a(this.f59528v, (C12718b) new C12718b() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void onSuccess(C12730b bVar) {
                        if (VerificationCodeFragment.this.isViewValid() && VerificationCodeFragment.this.mEditText != null) {
                            VerificationCodeFragment.this.f59515D.mo31198a(VerificationCodeFragment.this.mEditText.getText().toString(), VerificationCodeFragment.this.f59528v, "", (C12843d) new C21333j(VerificationCodeFragment.this) {
                                /* renamed from: a */
                                public final void mo57353a(C12710e<C12821d> eVar) {
                                    if (VerificationCodeFragment.this.isViewValid()) {
                                        VerificationCodeFragment.this.backBtn.setEnabled(true);
                                        C22358a.m74033a(VerificationCodeFragment.this.mBtnLogin);
                                        if (!TextUtils.isEmpty(eVar.f33703c)) {
                                            VerificationCodeFragment.this.mo58626a(eVar.f33702b, eVar.f33703c);
                                        }
                                    }
                                    C6907h.m21518a((Context) C21671bd.m72532b(), "toast_show", "psd_error", C21671bd.m72536d(), 0);
                                }

                                public final void onSuccess(C12710e<C12821d> eVar) {
                                    if (VerificationCodeFragment.this.isViewValid() && eVar.f33709g != null) {
                                        C22358a.m74033a(VerificationCodeFragment.this.mBtnLogin);
                                        C10761a.m31383a((Context) C21671bd.m72532b(), (int) R.string.a03).mo25750a();
                                        C21671bd.m72522a(8, 1, (Object) ((C12821d) eVar.f33709g).f33932b);
                                        VerificationCodeFragment.this.getActivity().setResult(-1);
                                        VerificationCodeFragment.this.getActivity().finish();
                                    }
                                }
                            });
                        }
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void onError(C12730b bVar, int i) {
                        if (VerificationCodeFragment.this.isViewValid() && !TextUtils.isEmpty(bVar.f33703c)) {
                            VerificationCodeFragment.this.mo58626a(bVar.f33702b, bVar.f33703c);
                        }
                    }
                });
            } else if (this.f59525s == 3) {
                C22358a.m74035b(this.mBtnLogin);
                this.f59515D.mo31180a(this.mEditText.getText().toString(), C21169e.f56940y, true, 1, "", (C12859t) new C12859t() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void onSuccess(C12713h hVar) {
                        if (VerificationCodeFragment.this.isViewValid()) {
                            VerificationCodeFragment.this.backBtn.setEnabled(true);
                            C22358a.m74033a(VerificationCodeFragment.this.mBtnLogin);
                            VerificationCodeFragment.this.mo58733z();
                        }
                        ((BaseAccountActivity) VerificationCodeFragment.this.getActivity()).mo58616a(BindMobileInputPhoneFragment.m73753a(C42914ab.m136242a().mo104630a("type", 1).mo104633a("ticket", hVar.f33722g).mo104633a("enter_from", VerificationCodeFragment.this.f59527u).f111445a));
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void onError(C12713h hVar, int i) {
                        C6907h.m21518a((Context) C21671bd.m72532b(), "toast_show", "psd_error", C21671bd.m72536d(), 0);
                        if (VerificationCodeFragment.this.mBtnLogin != null) {
                            C22358a.m74033a(VerificationCodeFragment.this.mBtnLogin);
                        }
                        if (VerificationCodeFragment.this.backBtn != null) {
                            VerificationCodeFragment.this.backBtn.setEnabled(true);
                        }
                        if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(hVar.f33703c)) {
                            VerificationCodeFragment.this.mo58626a(hVar.f33702b, hVar.f33703c);
                        }
                    }
                });
            } else if (this.f59525s == 4) {
                C22358a.m74035b(this.mBtnLogin);
                ArrayMap arrayMap = new ArrayMap();
                arrayMap.put("unusable_mobile_ticket", this.f59520J);
                this.f59515D.mo31210a(this.f59526t, this.mEditText.getText().toString(), "", this.f59518G, (Map) arrayMap, (C12842c) new C12842c() {
                    public final void onSuccess(C12710e<C12820c> eVar) {
                        C21229c.m71455b(0, "changePhone", 0, "");
                        User k = C21671bd.m72543k();
                        if (k != null) {
                            try {
                                JSONObject jSONObject = ((C12820c) eVar.f33709g).f33964l;
                                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                                if (optJSONObject != null) {
                                    String optString = optJSONObject.optString("mobile");
                                    k.setPhoneBinded(true);
                                    k.setBindPhone(optString);
                                    IAccountUserService a = C21671bd.m72520a();
                                    new C18893a();
                                    a.updateUserInfo(C18893a.m61663b(jSONObject));
                                    C21671bd.m72522a(7, 1, (Object) new C21765p(optString, optJSONObject.toString()));
                                    C10761a.m31383a(VerificationCodeFragment.this.getActivity().getApplicationContext(), (int) R.string.c_r).mo25750a();
                                    VerificationCodeFragment.this.getActivity().finish();
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (VerificationCodeFragment.this.isViewValid()) {
                            VerificationCodeFragment.this.backBtn.setEnabled(true);
                            C22358a.m74033a(VerificationCodeFragment.this.mBtnLogin);
                            VerificationCodeFragment.this.mo58733z();
                            C10761a.m31383a(VerificationCodeFragment.this.getActivity().getApplicationContext(), (int) R.string.c_r).mo25750a();
                            VerificationCodeFragment.this.getActivity().finish();
                        }
                        if (C21671bd.m72546n().getVerificationService().isDangerZone()) {
                            C21671bd.m72546n().getVerificationService().showRebindView(VerificationCodeFragment.this.getActivity(), "phone_bundling");
                        }
                    }

                    public final void onError(C12710e<C12820c> eVar, int i) {
                        String str;
                        JSONObject jSONObject = ((C12820c) eVar.f33709g).f33964l;
                        if (jSONObject != null) {
                            String optString = jSONObject.optJSONObject("data").optString("description");
                            C21229c.m71455b(1, "changePhone", i, optString);
                            if (VerificationCodeFragment.this.isViewValid()) {
                                C22358a.m74033a(VerificationCodeFragment.this.mBtnLogin);
                                VerificationCodeFragment.this.backBtn.setEnabled(true);
                                if ((i == 2003 || i == 2004) && !TextUtils.isEmpty(optString)) {
                                    VerificationCodeFragment.this.mo58729g(optString);
                                } else if (i == 2027 || i == 2028) {
                                    if (TextUtils.isEmpty(optString)) {
                                        str = VerificationCodeFragment.this.getString(R.string.c6i);
                                    } else {
                                        str = optString;
                                    }
                                    C10761a.m31403c(VerificationCodeFragment.this.getContext(), str).mo25750a();
                                }
                                VerificationCodeFragment.this.mo58626a(i, optString);
                            }
                            C6907h.m21518a((Context) C21671bd.m72532b(), "toast_show", "psd_error", C21671bd.m72536d(), 0);
                        }
                    }
                });
            } else {
                if (this.f59525s == 5 || this.f59525s == 9) {
                    if (this.f59531y || !TextUtils.isEmpty(this.mPasswordEt.getText())) {
                        if (this.f59525s == 9) {
                            KeyboardUtils.m77057c(this.mEditText);
                        }
                        final String a = C22325d.m73917a(this.f59527u);
                        C6907h.m21524a("phone_bundling_submit", (Map) new C21102b().mo56946a("enter_from", "log_in").mo56946a("platform", C21220e.m71416a(a)).f56672a);
                        mo58618s();
                        String trim = this.mPasswordEt.getText().toString().trim();
                        if (!this.f59531y) {
                            this.f59515D.mo31182a(trim, (C12718b) new C12718b() {
                                /* access modifiers changed from: private */
                                /* renamed from: a */
                                public void onSuccess(C12730b bVar) {
                                    if (VerificationCodeFragment.this.isViewValid() && VerificationCodeFragment.this.mEditText != null && !TextUtils.isEmpty(VerificationCodeFragment.this.mEditText.getText())) {
                                        VerificationCodeFragment.this.mo58728f(a);
                                    }
                                }

                                /* access modifiers changed from: private */
                                /* renamed from: a */
                                public void onError(C12730b bVar, int i) {
                                    C21229c.m71454a(1, "checkPWD", bVar.f33702b, bVar.f33703c);
                                    if (VerificationCodeFragment.this.isViewValid()) {
                                        C6907h.m21524a("phone_bundling_success", (Map) new C21102b().mo56946a("enter_from", "log_in").mo56944a("status", 0).mo56944a("error_code", bVar.f33702b).mo56946a("platform", C21220e.m71416a(a)).f56672a);
                                        VerificationCodeFragment.this.mo58619t();
                                        if (!TextUtils.isEmpty(bVar.f33703c)) {
                                            VerificationCodeFragment.this.mo58626a(bVar.f33702b, bVar.f33703c);
                                        }
                                    }
                                }
                            });
                        } else {
                            this.f59515D.mo31195a(m73858J(), m73859K(), "", 0, (C12841b) new C21329f(this) {
                                public final void onSuccess(C12710e<C12819b> eVar) {
                                    String str;
                                    C21229c.m71454a(0, "bindPhone", 0, "");
                                    VerificationCodeFragment.this.f59512A = true;
                                    User k = C21671bd.m72543k();
                                    if (k != null) {
                                        C18894a aVar = (C18894a) ((C12819b) eVar.f33709g).f33924f.mo31366b().get("mobile");
                                        if (aVar != null) {
                                            str = aVar.f50929e;
                                        } else {
                                            str = "";
                                        }
                                        k.setPhoneBinded(true);
                                        k.setBindPhone(str);
                                        C21671bd.m72520a().updateUserInfo(((C12819b) eVar.f33709g).f33924f);
                                        if (VerificationCodeFragment.this.f59525s == 9) {
                                            VerificationCodeFragment.this.mo58726A();
                                        } else {
                                            C21671bd.m72522a(7, 1, (Object) new C21765p(str, ((C12819b) eVar.f33709g).f33924f.f34083f.toString()));
                                        }
                                    }
                                    if (VerificationCodeFragment.this.isViewValid() && VerificationCodeFragment.this.f59525s != 9) {
                                        KeyboardUtils.m77057c(VerificationCodeFragment.this.backBtn);
                                        VerificationCodeFragment.this.backBtn.setEnabled(true);
                                        VerificationCodeFragment.this.mo58733z();
                                        VerificationCodeFragment.this.mo58619t();
                                        if (VerificationCodeFragment.this.getActivity() != null) {
                                            ((AccountOpeModel) C0069x.m159a(VerificationCodeFragment.this.getActivity()).mo147a(AccountOpeModel.class)).f59292c.postValue(new C22199b(((C12819b) eVar.f33709g).f33919a, ((C12819b) eVar.f33709g).f33924f.f34083f.toString()));
                                            VerificationCodeFragment.this.getActivity().setResult(-1);
                                            VerificationCodeFragment.this.getActivity().finish();
                                        }
                                    }
                                }

                                /* renamed from: a */
                                public final void mo57351a(C12710e<C12819b> eVar) {
                                    String str;
                                    C21229c.m71454a(1, "bindPhone", eVar.f33702b, eVar.f33703c);
                                    C6907h.m21524a("phone_bundling_success", (Map) new C21102b().mo56946a("enter_from", "log_in").mo56944a("status", 0).mo56944a("error_code", eVar.f33702b).mo56946a("platform", C21220e.m71416a(a)).f56672a);
                                    if ((eVar.f33702b == 2004 || eVar.f33702b == 2003) && !TextUtils.isEmpty(eVar.f33703c)) {
                                        VerificationCodeFragment.this.mo58729g(eVar.f33703c);
                                    } else if (eVar.f33702b == 2027 || eVar.f33702b == 2028) {
                                        if (TextUtils.isEmpty(eVar.f33703c)) {
                                            str = VerificationCodeFragment.this.getString(R.string.c6i);
                                        } else {
                                            str = eVar.f33703c;
                                        }
                                        C10761a.m31403c(VerificationCodeFragment.this.getContext(), str).mo25750a();
                                    } else {
                                        if (VerificationCodeFragment.this.isViewValid()) {
                                            VerificationCodeFragment.this.mo58619t();
                                            VerificationCodeFragment.this.backBtn.setEnabled(true);
                                        }
                                        User k = C21671bd.m72543k();
                                        if (k != null) {
                                            k.setBindPhone("");
                                        }
                                        if (!(VerificationCodeFragment.this.f59525s == 9 || VerificationCodeFragment.this.getActivity() == null)) {
                                            ((AccountOpeModel) C0069x.m159a(VerificationCodeFragment.this.getActivity()).mo147a(AccountOpeModel.class)).f59292c.postValue(new C22199b(((C12819b) eVar.f33709g).f33919a, eVar.f33703c));
                                        }
                                        if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(eVar.f33703c)) {
                                            VerificationCodeFragment.this.mo58626a(eVar.f33702b, eVar.f33703c);
                                        }
                                        C6907h.m21518a((Context) C21671bd.m72532b(), "toast_show", "psd_error", C21671bd.m72536d(), 0);
                                    }
                                }
                            });
                        }
                    }
                } else if (this.f59525s == 6) {
                    C22358a.m74035b(this.mBtnLogin);
                    this.f59515D.mo31180a(this.mEditText.getText().toString(), C21169e.f56934s, true, 0, "", (C12859t) new C12859t() {
                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public void onSuccess(C12713h hVar) {
                            if (VerificationCodeFragment.this.isViewValid() && VerificationCodeFragment.this.getActivity() != null) {
                                Intent intent = new Intent();
                                intent.putExtra("ticket", hVar.f33722g);
                                VerificationCodeFragment.this.getActivity().setResult(-1, intent);
                                VerificationCodeFragment.this.getActivity().finish();
                            }
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public void onError(C12713h hVar, int i) {
                            if (VerificationCodeFragment.this.isViewValid()) {
                                C22358a.m74033a(VerificationCodeFragment.this.mBtnLogin);
                                VerificationCodeFragment.this.backBtn.setEnabled(true);
                                if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(hVar.f33703c)) {
                                    VerificationCodeFragment.this.mo58626a(hVar.f33702b, hVar.f33703c);
                                }
                            }
                        }
                    });
                } else if (this.f59525s == 7) {
                    C22358a.m74035b(this.mBtnLogin);
                    this.f59515D.mo31180a(this.mEditText.getText().toString(), C21169e.f56934s, true, 0, this.f59529w, this.f59517F);
                } else if (this.f59525s == 8) {
                    if (TextUtils.isEmpty(this.mPasswordEt.getText().toString())) {
                        C10761a.m31399c((Context) getActivity(), (int) R.string.cv5).mo25750a();
                    } else {
                        C22358a.m74035b(this.mBtnLogin);
                        this.f59515D.mo31203a(this.f59526t, this.mEditText.getText().toString(), this.f59519H, "", (C12840a) new C21326c(this) {
                            public final void onSuccess(C12710e<C12818a> eVar) {
                                if (!(eVar.f33709g == null || ((C12818a) eVar.f33709g).f33918e == null)) {
                                    C21671bd.m72526a(((C12818a) eVar.f33709g).f33918e);
                                }
                                if (VerificationCodeFragment.this.getActivity() != null) {
                                    VerificationCodeFragment.this.getActivity().setResult(-1);
                                    VerificationCodeFragment.this.getActivity().finish();
                                }
                            }

                            /* renamed from: a */
                            public final void mo57348a(C12710e<C12818a> eVar) {
                                if (C22325d.f59597a.contains(Integer.valueOf(eVar.f33702b))) {
                                    Intent intent = new Intent();
                                    intent.putExtra("error_code", eVar.f33702b);
                                    if (VerificationCodeFragment.this.getActivity() != null) {
                                        VerificationCodeFragment.this.getActivity().setResult(0, intent);
                                        VerificationCodeFragment.this.getActivity().finish();
                                    }
                                    return;
                                }
                                if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(eVar.f33703c)) {
                                    VerificationCodeFragment.this.mo58626a(eVar.f33702b, eVar.f33703c);
                                }
                            }
                        });
                    }
                }
            }
        } else if (this.f59513B) {
            User k = C21671bd.m72543k();
            if (k != null && k.isSecret()) {
                mo58727B();
            }
        } else {
            mo58726A();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo57106d() {
        String str;
        String str2;
        this.f59525s = getArguments().getInt("type");
        this.f59526t = getArguments().getString("mobile");
        this.f59528v = getArguments().getString("password");
        this.f59518G = getArguments().getString("ticket");
        this.f59529w = getArguments().getString("ticket");
        this.f59520J = getArguments().getString("unusable_mobile_ticket");
        this.f59519H = getArguments().getString("profile_key");
        this.f59527u = getArguments().getString("enter_from");
        this.f59521K = getArguments().getInt("proaccount_switch_type");
        this.f59532z = getArguments().getString("proaccount_category");
        this.mEditText.setFilters(new InputFilter[]{new LengthFilter(4)});
        this.mEditText.setHint(R.string.bu_);
        this.mTxtTimer.setVisibility(0);
        if (this.f59525s == 3) {
            if (C6399b.m19944t()) {
                this.mTitleHint.setText(R.string.sf);
                m73852D();
            } else {
                this.mTitleHint.setText(R.string.sc);
                m73853E();
            }
            this.mBtnLogin.setBackgroundResource(R.drawable.s6);
            str = "modify_phone";
        } else if (this.f59525s == 9) {
            ((BaseBindMobileActivity) getActivity()).f59375p = new C22313l(this);
            this.f59531y = C22345t.m73970d();
            if (this.f59531y) {
                this.mPasswordEt.setVisibility(8);
            } else {
                this.mPasswordEt.setVisibility(0);
                this.mPasswordEt.setBackgroundResource(0);
                this.mPasswordEt.setHintTextColor(getResources().getColor(R.color.a52));
                this.mPasswordEt.setTextColor(getResources().getColor(R.color.a4z));
                this.mPasswordDownView.setVisibility(0);
                this.mPasswordTip.setGravity(8388611);
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.setMargins((int) C9738o.m28708b(getContext(), 32.0f), 0, (int) C9738o.m28708b(getContext(), 32.0f), 0);
                layoutParams.addRule(3, R.id.bqv);
                layoutParams.height = (int) C9738o.m28708b(getContext(), 50.0f);
                this.mPasswordEt.setLayoutParams(layoutParams);
                this.mPasswordEt.setPadding(0, 0, 0, 0);
                LayoutParams layoutParams2 = new LayoutParams(-2, -2);
                layoutParams2.setMargins((int) C9738o.m28708b(getContext(), 32.0f), (int) C9738o.m28708b(getContext(), 10.0f), (int) C9738o.m28708b(getContext(), 32.0f), 0);
                layoutParams2.addRule(3, R.id.c_l);
                this.mPasswordTip.setLayoutParams(layoutParams2);
                this.mPasswordTip.setTextColor(getResources().getColor(R.color.a53));
            }
            this.backBtn.setImageResource(R.drawable.cmw);
            LayoutParams layoutParams3 = new LayoutParams(-2, -2);
            layoutParams3.setMargins((int) C9738o.m28708b(getContext(), 32.0f), (int) C9738o.m28708b(getContext(), 10.0f), (int) C9738o.m28708b(getContext(), 32.0f), 0);
            layoutParams3.addRule(3, R.id.e6z);
            this.mLLContainer.setLayoutParams(layoutParams3);
            this.mEditText.setPadding(0, 0, 0, 0);
            this.mEditText.setBackgroundResource(0);
            this.mTxtTimer.setBackgroundResource(0);
            this.mEditText.setHint(R.string.cb2);
            this.mEditText.setHintTextColor(getResources().getColor(R.color.a52));
            this.mEditText.setTextColor(getResources().getColor(R.color.a4z));
            this.mTxtTimer.setGravity(8388629);
            this.mTxtTimer.setTextColor(getResources().getColor(R.color.a53));
            LayoutParams layoutParams4 = new LayoutParams(-2, -2);
            layoutParams4.addRule(9, -1);
            layoutParams4.addRule(3, this.mRlTitle.getId());
            layoutParams4.setMargins((int) C9738o.m28708b(getContext(), 32.0f), (int) C9738o.m28708b(getContext(), 40.0f), (int) C9738o.m28708b(getContext(), 32.0f), 0);
            this.mTitleHint.setLayoutParams(layoutParams4);
            this.mTitleHint.setGravity(8388611);
            this.mTitleHint.setText(R.string.s_);
            this.mTitleHint.setTextSize(20.0f);
            this.mTitleHint.setTextColor(getResources().getColor(R.color.a4z));
            this.mCodeDownView.setVisibility(0);
            str = "new_phone_in";
            if (!TextUtils.isEmpty(this.f59526t)) {
                LayoutParams layoutParams5 = new LayoutParams(-2, -2);
                layoutParams5.setMargins((int) C9738o.m28708b(getContext(), 32.0f), (int) C9738o.m28708b(getContext(), 8.0f), (int) C9738o.m28708b(getContext(), 32.0f), (int) C9738o.m28708b(getContext(), 28.0f));
                layoutParams5.addRule(9, -1);
                layoutParams5.addRule(3, this.mTitleHint.getId());
                String a = PhoneNumberUtil.m73059a(this.f59526t);
                if (this.f59531y) {
                    str2 = C1642a.m8034a(getString(R.string.e7j), new Object[]{a});
                } else {
                    str2 = C1642a.m8034a(getString(R.string.e7k), new Object[]{a});
                }
                this.mTxtHint.setLayoutParams(layoutParams5);
                this.mTxtHint.setText(str2);
                this.mTxtHint.setGravity(8388611);
                this.mTxtHint.setTextColor(getResources().getColor(R.color.a53));
                this.mBtnPreAccount.setVisibility(0);
                this.mBtnLogin.setVisibility(8);
                this.mBtnPreAccount.setText(R.string.t3);
                this.mDmtStatusView.setBuilder(C10803a.m31631a(getContext()));
            }
        } else if (this.f59525s == 4) {
            this.mTitleHint.setText(R.string.sg);
            this.mBtnLogin.setBackgroundResource(R.drawable.s6);
            str = "new_phone_in";
            m73854F();
        } else if (this.f59525s == 1) {
            this.mTitleHint.setText(R.string.fjw);
            this.mBtnLogin.setBackgroundResource(R.drawable.s6);
            str = "modify_psd";
            m73852D();
            this.f59530x = C21169e.f56928m;
            this.f59515D.mo31187a(this.f59526t, (String) null, C21169e.f56928m, (C12855p) new C21348y(this) {
                public final void onSuccess(C12710e<C12836s> eVar) {
                    super.onSuccess(eVar);
                    C21235f.m71483a(0, C21169e.f56928m, 0, "");
                }

                /* renamed from: b */
                public final void mo57366b(C12710e<C12836s> eVar) {
                    C21235f.m71483a(1, C21169e.f56928m, eVar.f33702b, eVar.f33703c);
                    if (VerificationCodeFragment.this.isViewValid() && !TextUtils.isEmpty(eVar.f33703c)) {
                        VerificationCodeFragment.this.mo58626a(eVar.f33702b, eVar.f33703c);
                    }
                }
            });
        } else if (this.f59525s == 5) {
            this.f59531y = C22345t.m73970d();
            this.mTitleHint.setText(R.string.s_);
            str = "new_phone_in";
            m73854F();
        } else if (this.f59525s == 6) {
            this.mTitleHint.setText(R.string.fnb);
            str = "";
            m73852D();
            this.mTxtTimer.setText(R.string.bb6);
            this.f59524r = -1;
        } else if (this.f59525s == 7) {
            this.mTitleHint.setText(R.string.fnb);
            str = "";
            m73852D();
            this.mTxtTimer.setText(R.string.bb6);
            this.f59524r = -1;
        } else if (this.f59525s == 8) {
            this.mTitleHint.setText(R.string.fnb);
            str = "";
            m73852D();
        } else {
            str = "";
        }
        C6907h.m21519a((Context) getActivity(), "verification_in", "verification_code", C21671bd.m72536d(), 0, C21101a.m71159a().mo56942a("enter_from", str).mo56943b());
        m73855G();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo58730h(String str) {
        this.mEditText.setText(str);
        m73856H();
    }

    /* renamed from: f */
    public final void mo58728f(final String str) {
        this.f59515D.mo31204a(m73858J(), m73859K(), m73860L(), "", (C12841b) new C21329f(this) {
            /* renamed from: a */
            public final void mo57351a(C12710e<C12819b> eVar) {
                String str;
                C6907h.m21524a("phone_bundling_success", (Map) new C21102b().mo56946a("enter_from", "log_in").mo56944a("status", 0).mo56944a("error_code", eVar.f33702b).mo56946a("platform", C21220e.m71416a(str)).f56672a);
                if ((eVar.f33702b == 2004 || eVar.f33702b == 2003) && !TextUtils.isEmpty(eVar.f33703c)) {
                    VerificationCodeFragment.this.mo58729g(eVar.f33703c);
                } else if (eVar.f33702b == 2027 || eVar.f33702b == 2028) {
                    if (TextUtils.isEmpty(eVar.f33703c)) {
                        str = VerificationCodeFragment.this.getString(R.string.c6i);
                    } else {
                        str = eVar.f33703c;
                    }
                    C10761a.m31403c(VerificationCodeFragment.this.getContext(), str).mo25750a();
                } else {
                    if (VerificationCodeFragment.this.isViewValid()) {
                        VerificationCodeFragment.this.mo58619t();
                        VerificationCodeFragment.this.backBtn.setEnabled(true);
                    }
                    User k = C21671bd.m72543k();
                    if (k != null) {
                        k.setBindPhone("");
                    }
                    if (!(VerificationCodeFragment.this.f59525s == 9 || VerificationCodeFragment.this.getActivity() == null)) {
                        ((AccountOpeModel) C0069x.m159a(VerificationCodeFragment.this.getActivity()).mo147a(AccountOpeModel.class)).f59292c.postValue(new C22199b(((C12819b) eVar.f33709g).f33919a, eVar.f33703c));
                    }
                    if (VerificationCodeFragment.this.getContext() != null && !TextUtils.isEmpty(eVar.f33703c)) {
                        VerificationCodeFragment.this.mo58626a(eVar.f33702b, eVar.f33703c);
                    }
                    C6907h.m21518a((Context) C21671bd.m72532b(), "toast_show", "psd_error", C21671bd.m72536d(), 0);
                }
            }

            public final void onSuccess(C12710e<C12819b> eVar) {
                String str;
                C21229c.m71454a(0, "bindPhone", 0, "");
                VerificationCodeFragment.this.f59512A = true;
                User k = C21671bd.m72543k();
                if (k != null) {
                    C18894a aVar = (C18894a) ((C12819b) eVar.f33709g).f33924f.mo31366b().get("mobile");
                    if (aVar != null) {
                        str = aVar.f50929e;
                    } else {
                        str = "";
                    }
                    k.setPhoneBinded(true);
                    k.setBindPhone(str);
                    C21671bd.m72520a().updateUserInfo(((C12819b) eVar.f33709g).f33924f);
                    if (VerificationCodeFragment.this.f59525s == 9) {
                        C6907h.m21524a("set_up_proAccount", (Map) new C21102b().mo56946a("page", "Input Phone Captcha").mo56946a("method", "set_by_phone").mo56945a("duration", System.currentTimeMillis() - VerificationCodeFragment.this.f59514C).f56672a);
                        VerificationCodeFragment.this.mo58726A();
                    } else {
                        C21671bd.m72522a(7, 1, (Object) new C21765p(str, ((C12819b) eVar.f33709g).f33924f.f34083f.toString()));
                    }
                }
                if (VerificationCodeFragment.this.isViewValid() && VerificationCodeFragment.this.f59525s != 9) {
                    KeyboardUtils.m77057c(VerificationCodeFragment.this.backBtn);
                    VerificationCodeFragment.this.backBtn.setEnabled(true);
                    VerificationCodeFragment.this.mo58733z();
                    VerificationCodeFragment.this.mo58619t();
                    if (VerificationCodeFragment.this.getActivity() != null) {
                        ((AccountOpeModel) C0069x.m159a(VerificationCodeFragment.this.getActivity()).mo147a(AccountOpeModel.class)).f59292c.postValue(new C22199b(((C12819b) eVar.f33709g).f33919a, ((C12819b) eVar.f33709g).f33924f.f34083f.toString()));
                        VerificationCodeFragment.this.getActivity().setResult(-1);
                        VerificationCodeFragment.this.getActivity().finish();
                    }
                }
                C6907h.m21524a("phone_bundling_success", (Map) new C21102b().mo56946a("enter_from", "log_in").mo56944a("status", 1).mo56944a("error_code", eVar.f33702b).mo56946a("platform", C21220e.m71416a(str)).f56672a);
            }
        });
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f59523q = true;
        if (this.f59525s != 6 && this.f59525s != 7) {
            m73857I();
        }
    }

    /* renamed from: g */
    public final void mo58729g(String str) {
        C11030a a = C22347v.m73994a(getActivity());
        a.mo26647b((CharSequence) str);
        a.mo26635a((int) R.string.fjq, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C19282c.m63182a(VerificationCodeFragment.this.getActivity(), "login", "login_pop_confirm");
                ((C33038x) C21671bd.m72521a(C33038x.class)).mo60007a((Context) C21671bd.m72532b(), C1642a.m8034a("https://security.snssdk.com/passport/safe/aweme/unlock.html?did=%s", new Object[]{AppLog.getServerDeviceId()}), true);
            }
        });
        a.mo26646b((int) R.string.w_, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C19282c.m63182a(VerificationCodeFragment.this.getActivity(), "login", "login_pop_cancel");
            }
        });
        a.mo26649b();
    }

    public void handleMsg(Message message) {
        if ((message.obj instanceof UserResponse) && message.what == 122) {
            Object obj = message.obj;
            C21671bd.m72544l();
            C21671bd.m72522a(7, 1, (Object) null);
            C6907h.m21524a("switch_to_pro_account_success", (Map) C21102b.m71165a().mo56946a("classes", this.f59532z).f56672a);
        }
        if ((message.obj instanceof Exception) && message.what == 122) {
            if (getActivity() != null) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.cjt).mo25750a();
            }
            if (isViewValid()) {
                KeyboardUtils.m77057c(this.backBtn);
                this.backBtn.setEnabled(true);
                mo58733z();
                mo58619t();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f59515D = C12798d.m37186a(getContext());
        this.f59522L = new C6309f(this);
    }

    /* renamed from: a */
    public final void mo58626a(int i, String str) {
        if (C22344s.m73955a(i)) {
            if (i == 1050) {
                C22344s.m73954a(getContext(), getString(R.string.bzs), getString(R.string.bfm), false);
            } else {
                C22344s.m73956b(getContext(), str);
            }
            this.f59524r = -1;
            mo58733z();
            return;
        }
        C10761a.m31403c(getContext(), str).mo25750a();
    }

    /* renamed from: a */
    public static VerificationCodeFragment m73863a(String str, int i, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("type", i);
        bundle.putString("mobile", str2);
        bundle.putString("enter_from", str);
        VerificationCodeFragment verificationCodeFragment = new VerificationCodeFragment();
        verificationCodeFragment.setArguments(bundle);
        return verificationCodeFragment;
    }

    /* renamed from: b */
    public static VerificationCodeFragment m73864b(int i, String str, String str2, String str3, String str4) {
        return m73863a(str4, i, str, C42914ab.m136242a().mo104633a("password", str2).mo104633a("ticket", str3).f111445a);
    }

    /* renamed from: c */
    public static VerificationCodeFragment m73865c(int i, String str, String str2, String str3, String str4) {
        return m73863a(str4, 4, str, C42914ab.m136242a().mo104633a("password", str2).mo104633a("unusable_mobile_ticket", str3).f111445a);
    }

    /* renamed from: a */
    public static VerificationCodeFragment m73862a(int i, String str, String str2, String str3, String str4, int i2, String str5) {
        return m73863a(str4, 9, str, C42914ab.m136242a().mo104633a("password", str2).mo104633a("ticket", str3).mo104630a("proaccount_switch_type", i2).mo104633a("proaccount_category", str5).f111445a);
    }
}
