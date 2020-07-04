package com.p280ss.android.ugc.aweme.account.login.digitsverify;

import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p662f.p663a.C12819b;
import com.bytedance.sdk.account.p662f.p663a.C12836s;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12841b;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12855p;
import com.p280ss.android.account.p816b.C18894a;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.C21169e;
import com.p280ss.android.ugc.aweme.account.base.MusAbsActivity;
import com.p280ss.android.ugc.aweme.account.login.C21578r;
import com.p280ss.android.ugc.aweme.account.login.MusLoginManager;
import com.p280ss.android.ugc.aweme.account.login.fragment.BaseMusLoginFragment;
import com.p280ss.android.ugc.aweme.account.login.fragment.C21524n;
import com.p280ss.android.ugc.aweme.account.login.fragment.MusInputPhoneFragment;
import com.p280ss.android.ugc.aweme.account.login.fragment.MusInputPhoneFragment.C21444a;
import com.p280ss.android.ugc.aweme.account.login.fragment.MusSendCodeFragment;
import com.p280ss.android.ugc.aweme.account.login.fragment.MusSendCodeFragment.C21483a;
import com.p280ss.android.ugc.aweme.account.login.p952a.C21275f;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21328e;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21883t;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21883t.C21884a;
import com.p280ss.android.ugc.aweme.account.login.sms.C21590e;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a.C21172b;
import com.p280ss.android.ugc.aweme.account.p950k.C21235f;
import com.p280ss.android.ugc.aweme.account.p951l.C21241d;
import com.p280ss.android.ugc.aweme.account.p982ui.C22307g;
import com.p280ss.android.ugc.aweme.account.util.C22338o;
import com.p280ss.android.ugc.aweme.account.util.C22349w;
import com.p280ss.android.ugc.aweme.account.util.C22349w.C22350a;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.login.digitsverify.SendVerificationCodeActivity */
public class SendVerificationCodeActivity extends MusAbsActivity implements C21172b, C21444a, C21483a, C21524n {

    /* renamed from: a */
    public MusInputPhoneFragment f57352a;

    /* renamed from: b */
    public String f57353b;

    /* renamed from: c */
    public C22307g f57354c;

    /* renamed from: d */
    private C21883t f57355d;

    /* renamed from: e */
    private MusLoginManager f57356e;

    /* renamed from: f */
    private C0608j f57357f;

    /* renamed from: g */
    private MusSendCodeFragment f57358g;

    /* renamed from: h */
    private String f57359h;

    /* renamed from: i */
    private C21590e f57360i;

    /* renamed from: j */
    private C12728d f57361j;

    /* renamed from: k */
    private String f57362k = "SEND_CODE_FRAGMENT_TAG";

    /* renamed from: l */
    private String f57363l = "INPUT_PHONE_TAG";

    /* renamed from: a */
    public final MusLoginManager mo57190a() {
        return this.f57356e;
    }

    /* renamed from: a */
    public final void mo57193a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo57194a(Fragment fragment, boolean z) {
    }

    /* renamed from: b */
    public final String mo57452b() {
        return null;
    }

    /* renamed from: b */
    public final void mo57198b(Fragment fragment, boolean z) {
    }

    /* renamed from: c */
    public final int mo57200c() {
        return 0;
    }

    /* renamed from: c */
    public final void mo57201c(int i) {
    }

    /* renamed from: c */
    public final void mo57202c(Fragment fragment, boolean z) {
    }

    /* renamed from: f */
    public final boolean mo57456f() {
        return true;
    }

    /* renamed from: h */
    public final String mo57459h() {
        return "";
    }

    /* renamed from: i */
    public final int mo57460i() {
        return C21169e.f56923h;
    }

    public boolean isRegisterEventBus() {
        return false;
    }

    /* renamed from: j */
    public final int mo57461j() {
        return C21169e.f56924i;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.digitsverify.SendVerificationCodeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.digitsverify.SendVerificationCodeActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.digitsverify.SendVerificationCodeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: k */
    public final String mo57462k() {
        if ("third_party_login".equals(this.f57359h)) {
            return "log_in";
        }
        return this.f57359h;
    }

    /* renamed from: l */
    public final C0052o<String> mo57463l() {
        if (this.f57360i != null) {
            return this.f57360i.f57961a;
        }
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        C21170a.m71341b(this);
        if (this.f57360i != null) {
            this.f57360i.mo57783c();
        }
    }

    public void finish() {
        super.finish();
        if (!C21671bd.m72543k().isPhoneBinded()) {
            C21671bd.m72522a(7, 3, (Object) null);
        }
    }

    /* renamed from: g */
    public final void mo57458g() {
        this.f57357f.mo2645a();
        C0633q a = this.f57357f.mo2645a();
        if (this.f57352a != null) {
            a.mo2600b(R.id.bgc, this.f57352a, this.f57363l).mo2604c();
        }
    }

    /* renamed from: d */
    public final String mo57453d() {
        if ("third_party_login".equals(this.f57359h)) {
            return C23481i.m77091b(R.string.cto);
        }
        if (TextUtils.equals(this.f57353b, "enter_from_bind_pre_account")) {
            return C23481i.m77091b(R.string.d3m);
        }
        return C23481i.m77091b(R.string.ctq);
    }

    public void dismiss() {
        if (!TextUtils.isEmpty(this.f57359h)) {
            "third_party_login".equals(this.f57359h);
            C6907h.m21524a("phone_bundling_success", (Map) C21102b.m71165a().mo56946a("enter_from", "log_in").f56672a);
        }
        finish();
    }

    /* renamed from: e */
    public final String mo57455e() {
        if ("third_party_login".equals(this.f57359h)) {
            return C23481i.m77091b(R.string.cbf);
        }
        if (TextUtils.equals(this.f57353b, "enter_from_bind_pre_account")) {
            return C23481i.m77091b(R.string.bf_);
        }
        return null;
    }

    public void onBackPressed() {
        if (TextUtils.equals(this.f57353b, "enter_from_bind_pre_account")) {
            Fragment a = this.f57357f.mo2644a(this.f57363l);
            Fragment a2 = this.f57357f.mo2644a(this.f57362k);
            if (a != null && a.isVisible()) {
                C6907h.m21524a("back", (Map) C21102b.m71165a().mo56946a("enter_from", "Set up by Phone").mo56945a("duration", this.f57354c.mo57601j()).f56672a);
            } else if (a2 != null && a2.isVisible()) {
                C6907h.m21524a("back", (Map) C21102b.m71165a().mo56946a("enter_from", "Input Phone Captcha").mo56945a("duration", this.f57354c.mo57601j()).f56672a);
            }
        }
        if (this.f57357f == null || this.f57357f.mo2658f() == null || !this.f57357f.mo2658f().contains(this.f57358g)) {
            super.onBackPressed();
        } else {
            mo57458g();
        }
    }

    /* renamed from: a */
    public final C21884a mo57191a(int i) {
        return this.f57355d.mo58308b(0);
    }

    /* renamed from: a_ */
    public final void mo57096a_(int i) {
        if (i == 2) {
            finish();
        }
    }

    /* renamed from: b */
    public final C22349w mo57196b(int i) {
        return this.f57355d.mo58305a(i);
    }

    public void onCreate(Bundle bundle) {
        String str;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.digitsverify.SendVerificationCodeActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ae9);
        this.f57359h = getIntent().getStringExtra("ENTER_REASON");
        this.f57353b = getIntent().getStringExtra(C21578r.f57923k);
        this.f57361j = C12798d.m37186a(getApplicationContext());
        this.f57357f = getSupportFragmentManager();
        C0633q a = this.f57357f.mo2645a();
        this.f57352a = new MusInputPhoneFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putInt(POIService.KEY_ORDER, 0);
        bundle2.putString("ENTER_REASON", this.f57359h);
        String str2 = C21578r.f57923k;
        if (TextUtils.isEmpty(this.f57353b)) {
            str = "";
        } else {
            str = this.f57353b;
        }
        bundle2.putString(str2, str);
        this.f57352a.setArguments(bundle2);
        this.f57352a.f57640r = this;
        this.f57352a.mo57501a((C21524n) this);
        a.mo2586a(R.id.bgc, this.f57352a, this.f57363l).mo2604c();
        this.f57355d = new C21883t();
        this.f57356e = new MusLoginManager();
        this.f57360i = new C21590e(this);
        this.f57360i.mo57782b();
        this.f57360i.mo57780a();
        C21170a.m71339a((C21172b) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.digitsverify.SendVerificationCodeActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    /* renamed from: a */
    public final void mo57449a(String str, String str2, final C21328e eVar) {
        this.f57361j.mo31195a(str, str2, "", 0, (C12841b) new C12841b() {
            public final void onSuccess(C12710e<C12819b> eVar) {
                String str;
                if (SendVerificationCodeActivity.this.isViewValid()) {
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
                    }
                    if (eVar != null) {
                        eVar.mo57349a();
                    }
                    C10761a.m31384a((Context) C21671bd.m72532b(), (int) R.string.bzt, 0).mo25750a();
                }
            }

            public final void onError(C12710e<C12819b> eVar, int i) {
                if (SendVerificationCodeActivity.this.isViewValid()) {
                    if (eVar != null) {
                        eVar.mo57350a(eVar.f33703c, i);
                    }
                    C10761a.m31403c((Context) SendVerificationCodeActivity.this, C22338o.m73945a((C12707b) eVar)).mo25750a();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo57450a(final String str, final String str2, BaseMusLoginFragment baseMusLoginFragment) {
        if (this.f57352a != null) {
            this.f57352a.mo57598a();
            C12728d dVar = this.f57361j;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("-");
            sb.append(str2);
            int i = mo57460i();
            String h = mo57459h();
            boolean a = C21241d.m71496a();
            dVar.mo31184a(sb.toString(), "", i, 0, h, 1, a ? 1 : 0, (C12855p) new C21275f(this.f57352a) {
                /* renamed from: a */
                public final void mo57263a() {
                    if (SendVerificationCodeActivity.this.f57352a != null) {
                        SendVerificationCodeActivity.this.f57352a.mo57600i();
                    }
                    C21235f.m71483a(0, SendVerificationCodeActivity.this.mo57460i(), 0, "");
                    C6907h.m21524a("login_click_next_result", (Map) new C21102b().mo56946a("platform", "phone").mo56944a("is_success", 1).f56672a);
                    SendVerificationCodeActivity.this.mo57451a(str, str2, "", "", 60);
                }

                /* renamed from: b */
                public final void mo57366b(C12710e<C12836s> eVar) {
                    if (SendVerificationCodeActivity.this.f57352a != null) {
                        SendVerificationCodeActivity.this.f57352a.mo57600i();
                    }
                    C21235f.m71483a(1, SendVerificationCodeActivity.this.mo57460i(), eVar.f33702b, eVar.f33703c);
                    C10761a.m31403c((Context) SendVerificationCodeActivity.this, C22338o.m73945a((C12707b) eVar)).mo25750a();
                    C6907h.m21524a("login_click_next_result", (Map) new C21102b().mo56946a("platform", "phone").mo56944a("is_success", 0).mo56944a("error_code", eVar.f33702b).mo56946a("error_desc", eVar.f33703c).f56672a);
                }

                /* renamed from: a */
                public final void mo57264a(int i) {
                    if (TextUtils.equals(SendVerificationCodeActivity.this.f57353b, "enter_from_bind_pre_account")) {
                        C6907h.m21524a("input_wrong_phone", (Map) new C21102b().mo56946a("page", "Set up by Phone").mo56946a("error_code", "1").f56672a);
                    }
                    if (SendVerificationCodeActivity.this.f57352a != null) {
                        SendVerificationCodeActivity.this.f57352a.mo57600i();
                    }
                    C21235f.m71483a(1, SendVerificationCodeActivity.this.mo57460i(), i, "PhoneInvalid");
                    if (SendVerificationCodeActivity.this.isViewValid()) {
                        C10761a.m31399c((Context) SendVerificationCodeActivity.this, (int) R.string.cdl).mo25750a();
                    }
                    C6907h.m21524a("login_click_next_result", (Map) new C21102b().mo56946a("platform", "phone").mo56944a("is_success", 0).mo56944a("error_code", i).f56672a);
                }

                /* renamed from: a */
                public final void mo57266a(C12710e<C12836s> eVar) {
                    if (SendVerificationCodeActivity.this.f57352a != null) {
                        SendVerificationCodeActivity.this.f57352a.mo57600i();
                    }
                    C21235f.m71483a(1, SendVerificationCodeActivity.this.mo57460i(), eVar.f33702b, eVar.f33703c);
                    C10761a.m31403c((Context) SendVerificationCodeActivity.this, C22338o.m73945a((C12707b) eVar)).mo25750a();
                    C6907h.m21524a("login_click_next_result", (Map) new C21102b().mo56946a("platform", "phone").mo56944a("is_success", 0).mo56944a("error_code", eVar.f33702b).mo56946a("error_desc", eVar.f33703c).f56672a);
                }

                /* renamed from: a */
                public final void mo57267a(String str, String str2) {
                    if (SendVerificationCodeActivity.this.f57352a != null) {
                        SendVerificationCodeActivity.this.f57352a.mo57600i();
                    }
                    C6907h.m21524a("login_click_next_result", (Map) new C21102b().mo56946a("platform", "phone").mo56944a("is_success", 1).f56672a);
                    SendVerificationCodeActivity.this.mo57451a(str, str2, str, str2, 60);
                }

                /* renamed from: a */
                public final void mo57265a(int i, String str) {
                    if (TextUtils.equals(SendVerificationCodeActivity.this.f57353b, "enter_from_bind_pre_account")) {
                        C6907h.m21524a("input_wrong_phone", (Map) new C21102b().mo56946a("page", "Set up your Pro Account").mo56946a("error_code", "2").f56672a);
                    }
                    C21235f.m71483a(1, SendVerificationCodeActivity.this.mo57460i(), i, "PhoneRegistered");
                    if (SendVerificationCodeActivity.this.f57352a != null) {
                        SendVerificationCodeActivity.this.f57352a.mo57600i();
                    }
                    if (SendVerificationCodeActivity.this.isViewValid()) {
                        SendVerificationCodeActivity sendVerificationCodeActivity = SendVerificationCodeActivity.this;
                        if (TextUtils.isEmpty(str)) {
                            str = SendVerificationCodeActivity.this.getResources().getString(R.string.ctp);
                        }
                        C10761a.m31403c((Context) sendVerificationCodeActivity, str).mo25750a();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo57192a(int i, String str, long j, int i2, C22350a aVar) {
        this.f57355d.mo58306a(i, str, j, 60, aVar);
    }

    /* renamed from: a */
    public final void mo57451a(String str, String str2, String str3, String str4, long j) {
        String str5;
        C0633q a = this.f57357f.mo2645a();
        if (this.f57358g == null) {
            this.f57358g = new MusSendCodeFragment();
            this.f57358g.mo57501a((C21524n) this);
            this.f57358g.f57728C = this;
        }
        Bundle bundle = new Bundle();
        bundle.putString("ENTER_REASON", this.f57359h);
        bundle.putString("country_code", str);
        String str6 = C21578r.f57923k;
        if (TextUtils.isEmpty(this.f57353b)) {
            str5 = "";
        } else {
            str5 = this.f57353b;
        }
        bundle.putString(str6, str5);
        bundle.putString("phone_number", str2);
        bundle.putString("captcha_string", str3);
        bundle.putString("captcha_error_msg", str4);
        if (TextUtils.equals(this.f57353b, "enter_from_bind_pre_account")) {
            bundle.putInt("code_type", 8);
            if (getIntent() != null) {
                bundle.putInt(C21578r.f57924l, getIntent().getIntExtra(C21578r.f57924l, 0));
                bundle.putString(C21578r.f57925m, getIntent().getStringExtra(C21578r.f57925m));
            }
        } else {
            bundle.putInt("code_type", 5);
        }
        bundle.putLong("sms_have_send_time", 60);
        this.f57358g.setArguments(bundle);
        a.mo2600b(R.id.bgc, this.f57358g, this.f57362k).mo2606d();
    }
}
