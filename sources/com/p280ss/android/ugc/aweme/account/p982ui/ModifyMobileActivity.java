package com.p280ss.android.ugc.aweme.account.p982ui;

import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p645a.p646a.C12713h;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p662f.p663a.C12820c;
import com.bytedance.sdk.account.p662f.p663a.C12836s;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12842c;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12855p;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12859t;
import com.p280ss.android.account.p816b.C18894a;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.C21169e;
import com.p280ss.android.ugc.aweme.account.base.MusAbsActivity;
import com.p280ss.android.ugc.aweme.account.login.MusLoginManager;
import com.p280ss.android.ugc.aweme.account.login.fragment.BaseMusLoginFragment;
import com.p280ss.android.ugc.aweme.account.login.fragment.C21524n;
import com.p280ss.android.ugc.aweme.account.login.fragment.MusInputPhoneFragment;
import com.p280ss.android.ugc.aweme.account.login.fragment.MusInputPhoneFragment.C21444a;
import com.p280ss.android.ugc.aweme.account.login.fragment.MusSendCodeFragment;
import com.p280ss.android.ugc.aweme.account.login.fragment.MusSendCodeFragment.C21483a;
import com.p280ss.android.ugc.aweme.account.login.p952a.C21275f;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21328e;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21331h;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21336m;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21883t;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21883t.C21884a;
import com.p280ss.android.ugc.aweme.account.login.p974ui.InputCaptchaFragment.C21823a;
import com.p280ss.android.ugc.aweme.account.login.sms.C21590e;
import com.p280ss.android.ugc.aweme.account.p950k.C21235f;
import com.p280ss.android.ugc.aweme.account.p951l.C21241d;
import com.p280ss.android.ugc.aweme.account.util.C22349w;
import com.p280ss.android.ugc.aweme.account.util.C22349w.C22350a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.account.ui.ModifyMobileActivity */
public class ModifyMobileActivity extends MusAbsActivity implements C21444a, C21483a, C21524n {

    /* renamed from: a */
    public static int f59466a = 0;

    /* renamed from: b */
    public static int f59467b = 1;

    /* renamed from: c */
    public C0608j f59468c;

    /* renamed from: d */
    public int f59469d = f59466a;

    /* renamed from: e */
    public BaseMusLoginFragment f59470e;

    /* renamed from: f */
    public String f59471f = "";

    /* renamed from: g */
    private C21883t f59472g;

    /* renamed from: h */
    private MusLoginManager f59473h;

    /* renamed from: i */
    private C21590e f59474i;

    /* renamed from: j */
    private C12728d f59475j;

    /* renamed from: a */
    public final MusLoginManager mo57190a() {
        return this.f59473h;
    }

    /* renamed from: a */
    public final void mo57193a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo57194a(Fragment fragment, boolean z) {
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

    public void dismiss() {
    }

    /* renamed from: e */
    public final String mo57455e() {
        return null;
    }

    /* renamed from: h */
    public final String mo57459h() {
        return this.f59471f;
    }

    /* renamed from: k */
    public final String mo57462k() {
        return null;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.ModifyMobileActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.ModifyMobileActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.ModifyMobileActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: j */
    public final int mo57461j() {
        return mo57460i();
    }

    /* renamed from: b */
    public final String mo57452b() {
        if (this.f59469d == f59467b) {
            return getString(R.string.ctt);
        }
        return null;
    }

    /* renamed from: f */
    public final boolean mo57456f() {
        if (this.f59469d == f59467b) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo57458g() {
        try {
            getSupportFragmentManager().mo2655c();
        } catch (Exception unused) {
        }
    }

    /* renamed from: l */
    public final C0052o<String> mo57463l() {
        if (this.f59474i != null) {
            return this.f59474i.f57961a;
        }
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f59474i != null) {
            this.f59474i.mo57783c();
        }
    }

    /* renamed from: d */
    public final String mo57453d() {
        if (this.f59469d == f59466a) {
            return getString(R.string.ctr);
        }
        if (this.f59469d == f59467b) {
            return getString(R.string.cts);
        }
        return "";
    }

    /* renamed from: i */
    public final int mo57460i() {
        if (this.f59469d == f59466a) {
            return C21169e.f56940y;
        }
        if (this.f59469d == f59467b) {
            return C21169e.f56932q;
        }
        return C21169e.f56936u;
    }

    /* renamed from: a */
    public final C21884a mo57191a(int i) {
        return this.f59472g.mo58308b(0);
    }

    /* renamed from: b */
    public final C22349w mo57196b(int i) {
        return this.f59472g.mo58305a(i);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.ModifyMobileActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ae8);
        this.f59475j = C12798d.m37186a(getApplicationContext());
        this.f59468c = getSupportFragmentManager();
        mo58691a(this.f59468c);
        this.f59472g = new C21883t();
        this.f59473h = new MusLoginManager();
        this.f59474i = new C21590e(this);
        this.f59474i.mo57782b();
        this.f59474i.mo57780a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.ModifyMobileActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo58691a(C0608j jVar) {
        C0633q a = jVar.mo2645a();
        MusInputPhoneFragment musInputPhoneFragment = new MusInputPhoneFragment();
        musInputPhoneFragment.f57640r = this;
        musInputPhoneFragment.mo57501a((C21524n) this);
        if (C6307b.m19566a((Collection<T>) jVar.mo2658f())) {
            a.mo2585a((int) R.id.bgc, (Fragment) musInputPhoneFragment).mo2606d();
        } else {
            a.mo2599b(R.id.bgc, musInputPhoneFragment).mo2606d();
        }
    }

    /* renamed from: a */
    public final void mo57449a(String str, String str2, final C21328e eVar) {
        if (this.f59469d == f59466a) {
            this.f59475j.mo31181a(str2, C21169e.f56940y, true, (C12859t) new C12859t() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onSuccess(C12713h hVar) {
                    if (ModifyMobileActivity.this.isViewValid()) {
                        ModifyMobileActivity.this.f59471f = hVar.f33722g;
                        ModifyMobileActivity.this.f59469d = ModifyMobileActivity.f59467b;
                        if (eVar != null) {
                            eVar.mo57349a();
                        }
                        ModifyMobileActivity.this.mo58691a(ModifyMobileActivity.this.f59468c);
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onError(C12713h hVar, int i) {
                    if (ModifyMobileActivity.this.isViewValid()) {
                        if (eVar != null) {
                            eVar.mo57350a(hVar.f33703c, i);
                        }
                        C10761a.m31403c((Context) ModifyMobileActivity.this, hVar.f33703c).mo25750a();
                    }
                }
            });
            return;
        }
        if (this.f59469d == f59467b) {
            this.f59475j.mo31205a(str, str2, "", this.f59471f, (C12842c) new C21331h(new C21336m() {
                /* renamed from: a */
                public final void mo57354a(String str, String str2, int i, C21823a aVar) {
                }

                /* renamed from: c */
                public final void mo57355c() {
                }
            }) {
                /* renamed from: a */
                public final void mo57352a(C12710e<C12820c> eVar) {
                    if (ModifyMobileActivity.this.isViewValid()) {
                        if (eVar != null) {
                            eVar.mo57350a(eVar.f33703c, eVar.f33702b);
                        }
                        C10761a.m31403c((Context) ModifyMobileActivity.this, eVar.f33703c).mo25750a();
                    }
                }

                public final void onSuccess(C12710e<C12820c> eVar) {
                    String str;
                    if (ModifyMobileActivity.this.isViewValid()) {
                        User k = C21671bd.m72543k();
                        if (!(k == null || eVar.f33709g == null || ((C12820c) eVar.f33709g).f33930f == null)) {
                            C18894a aVar = (C18894a) ((C12820c) eVar.f33709g).f33930f.mo31366b().get("mobile");
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
                        C10761a.m31383a((Context) C21671bd.m72532b(), (int) R.string.c_r).mo25750a();
                        ModifyMobileActivity.this.finish();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo57450a(final String str, final String str2, BaseMusLoginFragment baseMusLoginFragment) {
        int i;
        C12728d dVar = this.f59475j;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        String sb2 = sb.toString();
        String str3 = "";
        int j = mo57461j();
        String str4 = this.f59471f;
        if (this.f59469d == f59466a) {
            i = 0;
        } else {
            i = 1;
        }
        boolean a = C21241d.m71496a();
        dVar.mo31184a(sb2, str3, j, 0, str4, i, a ? 1 : 0, (C12855p) new C21275f(baseMusLoginFragment) {
            /* renamed from: a */
            public final void mo57267a(String str, String str2) {
            }

            /* renamed from: a */
            public final void mo57263a() {
                C21235f.m71483a(0, ModifyMobileActivity.this.mo57460i(), 0, "");
                if (ModifyMobileActivity.this.isViewValid()) {
                    if (ModifyMobileActivity.this.f59469d == ModifyMobileActivity.f59466a) {
                        ModifyMobileActivity.this.f59470e = ModifyMobileActivity.this.mo58690a(ModifyMobileActivity.this.f59468c, str, str2, 3);
                        return;
                    }
                    if (ModifyMobileActivity.this.f59469d == ModifyMobileActivity.f59467b) {
                        ModifyMobileActivity.this.f59470e = ModifyMobileActivity.this.mo58690a(ModifyMobileActivity.this.f59468c, str, str2, 4);
                    }
                }
            }

            /* renamed from: a */
            public final void mo57264a(int i) {
                C21235f.m71483a(1, ModifyMobileActivity.this.mo57460i(), i, "PhoneInvalid");
                if (ModifyMobileActivity.this.isViewValid()) {
                    C10761a.m31399c((Context) ModifyMobileActivity.this, (int) R.string.cdl).mo25750a();
                }
            }

            /* renamed from: b */
            public final void mo57366b(C12710e<C12836s> eVar) {
                C21235f.m71483a(1, ModifyMobileActivity.this.mo57460i(), eVar.f33702b, eVar.f33703c);
                if (ModifyMobileActivity.this.isViewValid()) {
                    C10761a.m31399c((Context) ModifyMobileActivity.this, (int) R.string.cg0).mo25750a();
                }
            }

            /* renamed from: a */
            public final void mo57266a(C12710e<C12836s> eVar) {
                C21235f.m71483a(1, ModifyMobileActivity.this.mo57460i(), eVar.f33702b, eVar.f33703c);
                if (ModifyMobileActivity.this.isViewValid() && !TextUtils.isEmpty(eVar.f33703c)) {
                    C10761a.m31403c((Context) ModifyMobileActivity.this, eVar.f33703c).mo25750a();
                }
            }

            /* renamed from: a */
            public final void mo57265a(int i, String str) {
                C21235f.m71483a(1, ModifyMobileActivity.this.mo57460i(), i, "PhoneRegistered");
                if (ModifyMobileActivity.this.isViewValid()) {
                    ModifyMobileActivity modifyMobileActivity = ModifyMobileActivity.this;
                    if (TextUtils.isEmpty(str)) {
                        str = ModifyMobileActivity.this.getResources().getString(R.string.ctp);
                    }
                    C10761a.m31403c((Context) modifyMobileActivity, str).mo25750a();
                }
            }
        });
    }

    /* renamed from: a */
    public final BaseMusLoginFragment mo58690a(C0608j jVar, String str, String str2, int i) {
        C0633q a = jVar.mo2645a();
        MusSendCodeFragment musSendCodeFragment = new MusSendCodeFragment();
        musSendCodeFragment.mo57501a((C21524n) this);
        musSendCodeFragment.f57728C = this;
        Bundle bundle = new Bundle();
        bundle.putString("country_code", str);
        bundle.putString("phone_number", str2);
        bundle.putInt("code_type", i);
        bundle.putLong("sms_have_send_time", 60);
        musSendCodeFragment.setArguments(bundle);
        if (C6307b.m19566a((Collection<T>) jVar.mo2658f())) {
            a.mo2585a((int) R.id.bgc, (Fragment) musSendCodeFragment).mo2589a((String) null).mo2606d();
        } else {
            a.mo2599b(R.id.bgc, musSendCodeFragment).mo2589a((String) null).mo2606d();
        }
        return musSendCodeFragment;
    }

    /* renamed from: a */
    public final void mo57192a(int i, String str, long j, int i2, C22350a aVar) {
        this.f59472g.mo58306a(i, str, j, 60, aVar);
    }
}
