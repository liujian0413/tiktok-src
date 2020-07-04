package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12836s;
import com.bytedance.sdk.account.p668i.C12898b;
import com.facebook.ads.AdError;
import com.p280ss.android.account.C18892b.C18893a;
import com.p280ss.android.account.token.C18897a;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginMethod;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginPart;
import com.p280ss.android.ugc.aweme.account.log.C21253d;
import com.p280ss.android.ugc.aweme.account.login.C21559m;
import com.p280ss.android.ugc.aweme.account.login.C21569n;
import com.p280ss.android.ugc.aweme.account.login.C21579s;
import com.p280ss.android.ugc.aweme.account.login.loginlog.C21558a;
import com.p280ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p280ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21323ad;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21348y;
import com.p280ss.android.ugc.aweme.account.login.p957c.C21354c;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21866f.C21868b;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21101a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p946i.C21220e;
import com.p280ss.android.ugc.aweme.account.p950k.C21225a;
import com.p280ss.android.ugc.aweme.account.p950k.C21227b;
import com.p280ss.android.ugc.aweme.account.p950k.C21235f;
import com.p280ss.android.ugc.aweme.account.util.C22324c;
import com.p280ss.android.ugc.aweme.account.util.C22325d;
import com.p280ss.android.ugc.aweme.account.util.C22338o;
import com.p280ss.android.ugc.aweme.account.util.C22344s;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.p280ss.android.ugc.aweme.account.util.C22347v;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.main.p1385g.C33038x;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.BaseVerifyCodeFragment */
public abstract class BaseVerifyCodeFragment<T extends C21354c> extends BasePhoneNumberInputFragment<T> implements OnClickListener {

    /* renamed from: y */
    public static final boolean f58357y = C7163a.m22363a();

    /* renamed from: A */
    protected TextView f58358A;

    /* renamed from: B */
    protected TextView f58359B;

    /* renamed from: C */
    public C21866f f58360C;

    /* renamed from: D */
    public C21868b f58361D;

    /* renamed from: E */
    public String f58362E;

    /* renamed from: F */
    protected C21348y f58363F;

    /* renamed from: e */
    private final int f58364e = 60000;

    /* renamed from: q */
    private final int f58365q = 50000;

    /* renamed from: r */
    private final int f58366r = 1000;

    /* renamed from: s */
    private boolean f58367s = true;

    /* renamed from: t */
    private C21323ad f58368t;

    /* renamed from: z */
    protected boolean f58369z = true;

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract int mo58167v();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract int mo58168w();

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public boolean mo58174x() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo58175y() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public String mo58176z() {
        return "user_click";
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f58360C.mo58291a(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo58156r() {
        super.mo58156r();
        this.f58307k = C22325d.m73917a(this.f58304h);
        if (this.f58358A != null) {
            this.f58358A.setOnClickListener(this);
        }
        if (this.f58359B != null) {
            this.f58359B.setOnClickListener(this);
        }
        if (this.f58360C != null) {
            this.f58361D = new C21868b() {
                /* renamed from: b */
                public final void mo57828b() {
                    if (BaseVerifyCodeFragment.this.isViewValid()) {
                        BaseVerifyCodeFragment.this.f58358A.setText(BaseVerifyCodeFragment.this.getString(R.string.dgc));
                        if (BaseVerifyCodeFragment.this.mo58174x()) {
                            C23487o.m77140a((View) BaseVerifyCodeFragment.this.f58359B, 0);
                        }
                        BaseVerifyCodeFragment.this.mo58175y();
                    }
                }

                /* renamed from: a */
                public final void mo58177a(long j) {
                    if (BaseVerifyCodeFragment.this.isViewValid()) {
                        BaseVerifyCodeFragment.this.f58358A.setText(BaseVerifyCodeFragment.this.getString(R.string.dgd, Long.valueOf(j / 1000)));
                        if (j < 50000 && BaseVerifyCodeFragment.this.f58359B.getVisibility() != 0 && BaseVerifyCodeFragment.this.mo58174x()) {
                            BaseVerifyCodeFragment.this.f58359B.setVisibility(0);
                        }
                    }
                }
            };
            this.f58360C.mo58291a(this.f58361D);
        }
        this.f58368t = new C21323ad(this) {
            public final void onSuccess(C12710e<C12836s> eVar) {
                super.onSuccess(eVar);
                C21235f.m71483a(0, BaseVerifyCodeFragment.this.mo58168w(), 0, "");
                if (BaseVerifyCodeFragment.this.getActivity() != null) {
                    C11030a a = C22347v.m73994a(BaseVerifyCodeFragment.this.getActivity());
                    a.mo26634a((int) R.string.cti).mo26645b((int) R.string.ctj).mo26646b((int) R.string.bfm, (DialogInterface.OnClickListener) null).mo26642a(false);
                    C42951au.m136342a(a.mo26644a());
                    if (BaseVerifyCodeFragment.this.getActivity() instanceof LoginOrRegisterActivity) {
                        ((LoginOrRegisterActivity) BaseVerifyCodeFragment.this.getActivity()).mo58140c(true);
                    }
                }
            }

            /* renamed from: a */
            public final void mo57345a(C12710e<C12836s> eVar) {
                JSONObject jSONObject;
                C21235f.m71483a(1, BaseVerifyCodeFragment.this.mo58168w(), eVar.f33702b, eVar.f33703c);
                if (BaseVerifyCodeFragment.this.getActivity() instanceof LoginOrRegisterActivity) {
                    ((LoginOrRegisterActivity) BaseVerifyCodeFragment.this.getActivity()).mo58140c(false);
                }
                if (BaseVerifyCodeFragment.this.isViewValid()) {
                    if (eVar.f33702b == 2003 || eVar.f33702b == 2004) {
                        BaseVerifyCodeFragment.m72903a(eVar.f33703c, BaseVerifyCodeFragment.this.getActivity());
                    } else if (eVar.f33702b == 1091 || eVar.f33702b == 1093) {
                        JSONObject jSONObject2 = null;
                        if (eVar.f33709g != null) {
                            jSONObject = ((C12836s) eVar.f33709g).f33964l;
                        } else {
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            jSONObject2 = jSONObject.optJSONObject("data");
                        }
                        if (!(jSONObject2 == null || TextUtils.isEmpty(jSONObject2.optString("sec_info")) || BaseVerifyCodeFragment.this.getActivity() == null)) {
                            C22324c.m73916a(BaseVerifyCodeFragment.this.getActivity(), jSONObject2.optString("sec_info"), Integer.valueOf(eVar.f33702b), "", "click_message", "phone");
                        }
                    } else {
                        C10761a.m31403c(BaseVerifyCodeFragment.this.getContext(), C22338o.m73945a((C12707b) eVar)).mo25750a();
                    }
                }
            }
        };
        this.f58363F = new C21348y(this) {
            public final void onSuccess(C12710e<C12836s> eVar) {
                super.onSuccess(eVar);
                C21235f.m71483a(0, BaseVerifyCodeFragment.this.mo58168w(), 0, "");
                if (BaseVerifyCodeFragment.this.getActivity() instanceof LoginOrRegisterActivity) {
                    ((LoginOrRegisterActivity) BaseVerifyCodeFragment.this.getActivity()).mo58139b(true);
                }
            }

            /* renamed from: b */
            public final void mo57366b(C12710e<C12836s> eVar) {
                JSONObject jSONObject;
                String string;
                C21235f.m71483a(1, BaseVerifyCodeFragment.this.mo58168w(), eVar.f33702b, eVar.f33703c);
                if (BaseVerifyCodeFragment.this.getActivity() instanceof LoginOrRegisterActivity) {
                    ((LoginOrRegisterActivity) BaseVerifyCodeFragment.this.getActivity()).mo58139b(false);
                }
                if (BaseVerifyCodeFragment.this.isViewValid()) {
                    if (eVar.f33702b == 1057) {
                        if (TextUtils.equals(BaseVerifyCodeFragment.this.f58304h, "authorize_force_bind")) {
                            C10761a.m31410e(BaseVerifyCodeFragment.this.getContext(), BaseVerifyCodeFragment.this.getString(R.string.cj)).mo25750a();
                        } else {
                            BaseVerifyCodeFragment.this.mo58171a(eVar);
                        }
                    } else if (eVar.f33702b == 2015) {
                        BaseVerifyCodeFragment.this.mo58172e("anti_spam");
                        return;
                    } else if (eVar.f33702b == 2003 || eVar.f33702b == 2004) {
                        BaseVerifyCodeFragment.m72903a(eVar.f33703c, BaseVerifyCodeFragment.this.getActivity());
                        return;
                    } else if (eVar.f33702b == 2030 && BaseVerifyCodeFragment.this.getActivity() != null) {
                        JSONObject optJSONObject = ((C12836s) eVar.f33709g).f33964l.optJSONObject("data");
                        FragmentActivity activity = BaseVerifyCodeFragment.this.getActivity();
                        PhoneNumber phoneNumber = BaseVerifyCodeFragment.this.f58330l;
                        String optString = optJSONObject.optString("sms_content", "");
                        String optString2 = optJSONObject.optString("channel_mobile", "");
                        String optString3 = optJSONObject.optString("verify_ticket", "");
                        String str = BaseVerifyCodeFragment.this.f58304h;
                        String str2 = BaseVerifyCodeFragment.this.f58305i;
                        String str3 = "/passport/mobile/send_code/v1/";
                        if (BaseVerifyCodeFragment.this.getArguments() == null) {
                            string = "";
                        } else {
                            string = BaseVerifyCodeFragment.this.getArguments().getString("profile_key", "");
                        }
                        LoginSendSmsAuthenticateActivity.m72968a(activity, phoneNumber, optString, optString2, optString3, str, str2, str3, string, AdError.INTERNAL_ERROR_CODE);
                    } else if (eVar.f33702b == 1091 || eVar.f33702b == 1093) {
                        JSONObject jSONObject2 = null;
                        if (eVar.f33709g != null) {
                            jSONObject = ((C12836s) eVar.f33709g).f33964l;
                        } else {
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            jSONObject2 = jSONObject.optJSONObject("data");
                        }
                        if (!(jSONObject2 == null || TextUtils.isEmpty(jSONObject2.optString("sec_info")) || BaseVerifyCodeFragment.this.getActivity() == null)) {
                            C22324c.m73916a(BaseVerifyCodeFragment.this.getActivity(), jSONObject2.optString("sec_info"), Integer.valueOf(eVar.f33702b), "", "click_message", "phone");
                        }
                        return;
                    }
                    if (BaseVerifyCodeFragment.this.f58369z && !TextUtils.isEmpty(eVar.f33703c)) {
                        if (C22344s.m73955a(eVar.f33702b)) {
                            C22344s.m73956b(BaseVerifyCodeFragment.this.getContext(), eVar.f33703c);
                            BaseVerifyCodeFragment.this.f58360C.mo58290a();
                            if (BaseVerifyCodeFragment.this.f58361D != null) {
                                BaseVerifyCodeFragment.this.f58361D.mo57828b();
                            }
                        } else if (eVar.f33702b > 0) {
                            C10761a.m31403c(BaseVerifyCodeFragment.this.getContext(), eVar.f33703c).mo25750a();
                        } else if (BaseVerifyCodeFragment.this.getContext() != null) {
                            C10761a.m31403c(BaseVerifyCodeFragment.this.getContext(), BaseVerifyCodeFragment.this.getString(R.string.cjs)).mo25750a();
                        }
                    }
                }
            }
        };
    }

    /* renamed from: d */
    private void mo57106d() {
        String str;
        if (mo58129g() != null) {
            C21558a.m72263a().mo57697a("", "", false, "register", "", "注册重发验证码");
            C6907h.m21518a((Context) getActivity(), "resend_click", "verification_code", C21671bd.m72536d(), 0);
            this.f58362E = mo58152p();
            ((C21354c) mo58129g()).mo57435a(this.f58362E, null, this.f58363F);
        }
        String str2 = "send_sms";
        C21102b bVar = new C21102b();
        String str3 = "send_method";
        if (TextUtils.equals(getString(R.string.dgc), this.f58358A.getText())) {
            str = "resend";
        } else {
            str = mo58176z();
        }
        C6907h.m21524a(str2, (Map) bVar.mo56946a(str3, str).mo56944a("send_reason", mo58168w()).mo56946a("enter_method", this.f58305i).mo56946a("enter_from", this.f58304h).f56672a);
        mo58161b(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo58161b(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        C21253d.m71538a(z, this.f58362E);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("send_code_phone_number", this.f58362E);
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            this.f58362E = bundle.getString("send_code_phone_number");
        }
    }

    public void onAttach(Activity activity) {
        SparseArray<C21866f> sparseArray;
        super.onAttach(activity);
        if (activity instanceof LoginOrRegisterActivity) {
            sparseArray = ((LoginOrRegisterActivity) activity).f58324p;
            this.f58360C = (C21866f) sparseArray.get(mo58167v());
        } else {
            sparseArray = null;
        }
        if (this.f58360C == null) {
            C21866f fVar = new C21866f(60000, 1000, this.f58361D);
            this.f58360C = fVar;
            if (sparseArray != null) {
                sparseArray.put(mo58167v(), this.f58360C);
            }
        }
    }

    /* renamed from: a */
    public final void mo58171a(final C12710e<C12836s> eVar) {
        if (eVar != null && eVar.f33702b == 1057) {
            C6907h.m21524a("phone_bundling_conflict_alert", (Map) new C21102b().mo56946a("enter_from", "log_in").mo56946a("platform", C21220e.m71416a(this.f58307k)).f56672a);
            new C10741a(getContext()).mo25649a((int) R.string.s8).mo25657b((int) R.string.s6).mo25650a((int) R.string.s5, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C6907h.m21524a("phone_bundling_conflict_check", (Map) new C21102b().mo56946a("enter_from", "log_in").mo56946a("platform", C21220e.m71416a(BaseVerifyCodeFragment.this.f58307k)).f56672a);
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
            }).mo25658b((int) R.string.s4, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C6907h.m21524a("phone_bundling_conflict_cancel", (Map) new C21102b().mo56946a("enter_from", "log_in").mo56946a("platform", C21220e.m71416a(BaseVerifyCodeFragment.this.f58307k)).f56672a);
                    dialogInterface.dismiss();
                }
            }).mo25656a().mo25637a().setCanceledOnTouchOutside(false);
        }
    }

    /* renamed from: e */
    public final void mo58172e(String str) {
        if (mo58129g() != null) {
            C21558a.m72263a().mo57697a("", "", false, "send_voice_code", "", "发送语音验证码");
            this.f58362E = mo58152p();
            ((C21354c) mo58129g()).mo57437b(this.f58362E, null, this.f58368t);
            this.f58367s = false;
        }
        C6907h.m21524a("send_voice_verification_code", (Map) new C21102b().mo56946a("send_reason", String.valueOf(mo58168w())).mo56946a("send_method", str).f56672a);
        mo58161b(0);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view != this.f58358A) {
            if (view == this.f58359B) {
                if (!mo58147k()) {
                    C10761a.m31403c((Context) C21671bd.m72532b(), getResources().getString(R.string.fsx)).mo25750a();
                } else if (this.f58367s || !this.f58360C.mo58295e()) {
                    if (!this.f58360C.mo58295e()) {
                        this.f58360C.mo58292b();
                    }
                    mo58172e("user_click");
                } else {
                    C10761a.m31403c((Context) C21671bd.m72532b(), getResources().getString(R.string.fq2)).mo25750a();
                }
            }
        } else if (!mo58147k()) {
            C10761a.m31403c((Context) C21671bd.m72532b(), getResources().getString(R.string.fsx)).mo25750a();
        } else if (this.f58360C.mo58295e()) {
            C10761a.m31403c((Context) C21671bd.m72532b(), getResources().getString(R.string.fq2)).mo25750a();
        } else {
            this.f58360C.mo58292b();
            mo57106d();
        }
    }

    /* renamed from: a */
    public static void m72903a(String str, final Context context) {
        if (!TextUtils.isEmpty(str)) {
            C11030a a = C22347v.m73994a(context);
            a.mo26647b((CharSequence) str);
            a.mo26635a((int) R.string.fjq, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C19282c.m63182a(context, "login", "login_pop_confirm");
                    ((C33038x) C21671bd.m72521a(C33038x.class)).mo60007a(context, C1642a.m8034a("https://security.snssdk.com/passport/safe/aweme/unlock.html?did=%s", new Object[]{AppLog.getServerDeviceId()}), true);
                }
            });
            a.mo26646b((int) R.string.w_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C19282c.m63182a(context, "login", "login_pop_cancel");
                }
            });
            C42951au.m136342a(a.mo26644a());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2001 && i2 == -1) {
            String stringExtra = intent.getStringExtra("data");
            if (!TextUtils.isEmpty(stringExtra)) {
                try {
                    new C18893a();
                    C21671bd.m72526a((C12898b) C18893a.m61663b(new JSONObject(stringExtra)));
                    C22345t.m73972e(true);
                    C21225a.m71437a("success");
                    C21558a.m72263a().mo57697a("", "", true, "login", "", "mobile login success");
                    C21227b.m71450a("aweme_phone_login_rate", 1, C21101a.m71159a().mo56943b());
                    AccountLoginAlogHelper.m71514a(ALogLoginPart.LOGIN_BY_PHONE_SMS, ALogLoginMethod.PHONE_SMS, "");
                    if (getActivity() != null) {
                        if (getActivity() instanceof C21569n) {
                            ((C21569n) getActivity()).mo57757a(true);
                        }
                        ((C21559m) getActivity()).mo57193a(mo58155d("phone_sms"));
                    }
                    C6907h.onEvent(MobClick.obtain().setEventName("sign_in_success").setLabelName("sms_verification").setJsonObject(C21101a.m71159a().mo56942a("enter_from", this.f58304h).mo56942a("position", this.f58305i).mo56943b()));
                    C6907h.m21524a("login_success", (Map) new C21102b().mo56946a("enter_method", this.f58305i).mo56946a("enter_from", this.f58304h).mo56946a("platform", "sms_verification").mo56944a("status", 1).mo56944a("_perf_monitor", 1).f56672a);
                    if (getArguments() != null && getArguments().getBoolean("need_remember_login_method", true)) {
                        C21579s.m72313b((BaseLoginMethod) new PhoneLoginMethod(C21671bd.m72536d(), LoginMethodName.PHONE_SMS, this.f58330l));
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
