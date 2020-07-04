package com.p280ss.android.ugc.aweme.account.login;

import android.app.Activity;
import android.arch.lifecycle.C0052o;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.keva.Keva;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.C21151c;
import com.p280ss.android.ugc.aweme.account.base.MusAbsActivity;
import com.p280ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p280ss.android.ugc.aweme.account.login.agegate.C21297b;
import com.p280ss.android.ugc.aweme.account.login.forgetpsw.p961ui.FindPswByEmailActivity;
import com.p280ss.android.ugc.aweme.account.login.fragment.BaseMusLoginFragment;
import com.p280ss.android.ugc.aweme.account.login.fragment.BaseMusPasswordLoginFragment;
import com.p280ss.android.ugc.aweme.account.login.fragment.C21524n;
import com.p280ss.android.ugc.aweme.account.login.fragment.MusAgeGateFragment;
import com.p280ss.android.ugc.aweme.account.login.fragment.MusChangePasswordFragment;
import com.p280ss.android.ugc.aweme.account.login.fragment.MusCreateAccountFragment;
import com.p280ss.android.ugc.aweme.account.login.fragment.MusCreatePasswordFragment;
import com.p280ss.android.ugc.aweme.account.login.fragment.MusInputPhoneFragment;
import com.p280ss.android.ugc.aweme.account.login.fragment.MusLoginSecureSendCodeFragment;
import com.p280ss.android.ugc.aweme.account.login.fragment.MusLoginVerifyThirdFragment;
import com.p280ss.android.ugc.aweme.account.login.fragment.MusRegisterFragment;
import com.p280ss.android.ugc.aweme.account.login.fragment.MusSendCodeFragment;
import com.p280ss.android.ugc.aweme.account.login.fragment.MusSetPasswordFragment;
import com.p280ss.android.ugc.aweme.account.login.p952a.C21271b;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21870h;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21870h.C21871a;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21883t;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21883t.C21884a;
import com.p280ss.android.ugc.aweme.account.login.sms.C21590e;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a;
import com.p280ss.android.ugc.aweme.account.util.C22334m;
import com.p280ss.android.ugc.aweme.account.util.C22337n;
import com.p280ss.android.ugc.aweme.account.util.C22349w;
import com.p280ss.android.ugc.aweme.account.util.C22349w.C22350a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.account.login.MusLoginActivity */
public class MusLoginActivity extends MusAbsActivity implements C21524n, C21559m, C21870h {

    /* renamed from: a */
    public AgeGateResponse f57129a;

    /* renamed from: b */
    private BaseMusLoginFragment f57130b;

    /* renamed from: c */
    private C21883t f57131c;

    /* renamed from: d */
    private MusLoginManager f57132d;

    /* renamed from: e */
    private int f57133e;

    /* renamed from: f */
    private String f57134f;

    /* renamed from: g */
    private String f57135g;

    /* renamed from: h */
    private String f57136h;

    /* renamed from: i */
    private Set<C21871a> f57137i = new HashSet();

    /* renamed from: j */
    private C21590e f57138j;

    /* renamed from: k */
    private boolean f57139k = false;

    /* renamed from: a */
    public final MusLoginManager mo57190a() {
        return this.f57132d;
    }

    /* renamed from: c */
    public final int mo57200c() {
        return this.f57133e;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.MusLoginActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.MusLoginActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.MusLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: f */
    private void m71559f() {
        if (this.f57139k) {
            C21170a.m71337a(11);
        } else {
            C21170a.m71337a(10);
        }
    }

    /* renamed from: b */
    public final void mo57197b() {
        try {
            getSupportFragmentManager().mo2655c();
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public final C0052o<String> mo57203d() {
        if (this.f57138j != null) {
            return this.f57138j.f57961a;
        }
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f57132d = null;
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a03).statusBarDarkFont(true).init();
    }

    public void finish() {
        super.finish();
        if (this.f57138j != null) {
            this.f57138j.mo57783c();
        }
        int intExtra = getIntent().getIntExtra("init_page", 0);
        if (intExtra == 15 || intExtra == 14) {
            C21170a.m71337a(9);
            return;
        }
        C21297b.m71676a();
        if (intExtra == 1 || intExtra == 0) {
            if (C21671bd.m72539g()) {
                m71559f();
            }
        } else if (intExtra == 8 || intExtra == 9 || intExtra == 10 || intExtra == 11) {
            if (!(this.f57130b instanceof C21642z) || !((C21642z) this.f57130b).mo57516X_()) {
                m71559f();
            } else {
                C21671bd.m72545m().retryLogin();
            }
            C21671bd.m72523a(7, 4, "");
        }
    }

    public void onBackPressed() {
        for (C21871a aVar : this.f57137i) {
            if (aVar != null) {
                aVar.mo57573i();
            }
        }
        List f = getSupportFragmentManager().mo2658f();
        if (f != null && f.size() > 0) {
            Fragment fragment = (Fragment) getSupportFragmentManager().mo2658f().get(f.size() - 1);
            if ((fragment instanceof C21271b) && ((C21271b) fragment).aa_()) {
                return;
            }
        }
        if (getSupportFragmentManager().mo2657e() == 1) {
            C22337n.m73944a(this, false, true);
        } else {
            mo57197b();
        }
    }

    /* renamed from: e */
    private void m71558e() {
        Bundle bundle;
        int intExtra = getIntent().getIntExtra("init_page", 0);
        if (getIntent().getExtras() != null) {
            bundle = getIntent().getExtras();
        } else {
            bundle = new Bundle();
        }
        bundle.putString("enter_from", getIntent().getStringExtra("enter_from"));
        bundle.putString("enter_method", getIntent().getStringExtra("enter_method"));
        bundle.putString("enter_type", this.f57136h);
        if (intExtra == 1) {
            if (C21297b.m71679b()) {
                this.f57130b = new MusRegisterFragment();
                bundle.putString("enter_type", this.f57136h);
                this.f57130b.setArguments(bundle);
            } else {
                if (!C21297b.m71680c()) {
                    Keva.getRepo("compliance_setting").storeBoolean("need_to_show_ftc_age_gate_but_no_showed", true);
                }
                this.f57130b = new MusAgeGateFragment();
                bundle.putString("enter_type", this.f57136h);
                this.f57130b.setArguments(bundle);
            }
            this.f57130b.mo57501a((C21524n) this);
            mo57194a(this.f57130b, false);
        } else if (intExtra == 0) {
            bundle.putBoolean("need_auto_fill_account_name", getIntent().getBooleanExtra("need_auto_fill_latest_login_info", true));
            bundle.putBoolean("need_auto_fill_phone_number", getIntent().getBooleanExtra("need_auto_fill_latest_login_info", true));
            bundle.putString("enter_type", this.f57136h);
            this.f57130b = new BaseMusPasswordLoginFragment();
            this.f57130b.setArguments(bundle);
            this.f57130b.mo57501a((C21524n) this);
            mo57194a(this.f57130b, false);
        } else if (intExtra == 8 || intExtra == 9) {
            bundle.putBoolean("need_auto_fill_account_name", true);
            bundle.putString("enter_type", this.f57136h);
            this.f57130b = new BaseMusPasswordLoginFragment();
            this.f57130b.setArguments(bundle);
            this.f57130b.mo57501a((C21524n) this);
            mo57194a(this.f57130b, false);
        } else if (intExtra == 11 || intExtra == 10) {
            bundle.putBoolean("need_auto_fill_phone_number", true);
            bundle.putString("enter_type", this.f57136h);
            bundle.putInt(POIService.KEY_ORDER, 0);
            this.f57130b = new MusInputPhoneFragment();
            this.f57130b.setArguments(bundle);
            this.f57130b.mo57501a((C21524n) this);
            mo57194a(this.f57130b, false);
        } else if (intExtra == 2) {
            this.f57130b = new MusChangePasswordFragment();
            this.f57130b.mo57501a((C21524n) this);
            mo57194a(this.f57130b, false);
        } else if (intExtra == 3) {
            this.f57130b = (BaseMusLoginFragment) C22334m.m73938a(MusSetPasswordFragment.class, bundle).mo58754a("set_pass_scene", 2).mo58756a("enter_type", this.f57136h).mo58753a();
            this.f57130b.mo57501a((C21524n) this);
            mo57194a(this.f57130b, false);
        } else if (intExtra == 4) {
            this.f57130b = (BaseMusLoginFragment) C22334m.m73938a(MusAgeGateFragment.class, bundle).mo58754a("init_page", 4).mo58756a("enter_type", this.f57136h).mo58757a("ftc_detect", true).mo58753a();
            mo57194a(this.f57130b, false);
        } else if (intExtra == 5) {
            this.f57130b = (BaseMusLoginFragment) C22334m.m73938a(MusCreateAccountFragment.class, bundle).mo58754a("init_page", 5).mo58756a("enter_type", this.f57136h).mo58757a("ftc_detect", true).mo58753a();
            mo57194a(this.f57130b, false);
        } else if (intExtra == 6) {
            this.f57130b = (BaseMusLoginFragment) C22334m.m73938a(MusCreatePasswordFragment.class, bundle).mo58754a("init_page", 6).mo58756a("enter_type", this.f57136h).mo58757a("ftc_detect", true).mo58753a();
            mo57194a(this.f57130b, false);
        } else if (intExtra == 7) {
            this.f57130b = (BaseMusLoginFragment) C22334m.m73938a(MusAgeGateFragment.class, bundle).mo58754a("init_page", 7).mo58756a("enter_type", "click_login").mo58753a();
            mo57194a(this.f57130b, false);
        } else if (intExtra == 12) {
            this.f57130b = (BaseMusLoginFragment) C22334m.m73938a(MusSendCodeFragment.class, getIntent().getExtras()).mo58754a("code_type", 7).mo58756a("enter_type", this.f57136h).mo58753a();
            this.f57130b.mo57501a((C21524n) this);
            mo57194a(this.f57130b, false);
        } else if (intExtra == 13) {
            Serializable serializableExtra = getIntent().getSerializableExtra("age_gate_data");
            if (serializableExtra != null) {
                this.f57129a = (AgeGateResponse) serializableExtra;
            }
            this.f57130b = (BaseMusLoginFragment) C22334m.m73938a(MusCreateAccountFragment.class, bundle).mo58754a("init_page", bundle.getInt("age_gate_init_type")).mo58753a();
            mo57194a(this.f57130b, false);
        } else if (intExtra == 14) {
            MusLoginSecureSendCodeFragment musLoginSecureSendCodeFragment = null;
            String string = bundle.getString("loginType");
            String string2 = bundle.getString("sharkTicket");
            String string3 = bundle.getString("phoneNumber");
            String string4 = bundle.getString("pwd");
            String string5 = bundle.getString("handle");
            if (string.equals("email")) {
                musLoginSecureSendCodeFragment = MusLoginSecureSendCodeFragment.m72069a("", string, "", string3, string2, string5, string4, this.f57134f, this.f57135g);
            } else if (string.equals("username")) {
                musLoginSecureSendCodeFragment = MusLoginSecureSendCodeFragment.m72069a(string5, string, "", string3, string2, "", string4, this.f57134f, this.f57135g);
            }
            if (musLoginSecureSendCodeFragment != null) {
                this.f57130b = musLoginSecureSendCodeFragment;
                musLoginSecureSendCodeFragment.mo57501a((C21524n) this);
                mo57194a(musLoginSecureSendCodeFragment, false);
            }
        } else if (intExtra == 15) {
            String string6 = bundle.getString("loginType");
            String string7 = bundle.getString("platform");
            String string8 = bundle.getString("pwd");
            String string9 = bundle.getString("handle");
            MusLoginVerifyThirdFragment a = MusLoginVerifyThirdFragment.m72086a(string9, string6, "", string7, string9, string8, this.f57134f, this.f57135g);
            this.f57130b = a;
            a.mo57501a((C21524n) this);
            mo57194a(a, false);
        } else {
            finish();
        }
    }

    /* renamed from: a */
    public final C21884a mo57191a(int i) {
        return this.f57131c.mo58308b(0);
    }

    /* renamed from: b */
    public final C22349w mo57196b(int i) {
        return this.f57131c.mo58305a(i);
    }

    /* renamed from: c */
    public final void mo57201c(int i) {
        this.f57133e = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Bundle mo57189a(C1592h hVar) throws Exception {
        finish();
        if (C21671bd.m72539g()) {
            C21671bd.m72522a(1, 1, (Object) "");
        }
        m71559f();
        C21671bd.m72534b(C21671bd.m72543k());
        return (Bundle) hVar.mo6890e();
    }

    /* renamed from: b */
    public final void mo57199b(C21871a aVar) {
        this.f57137i.remove(aVar);
    }

    /* renamed from: a */
    public final void mo57195a(C21871a aVar) {
        this.f57137i.add(aVar);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f57129a != null) {
            bundle.putSerializable("age_gate_response", this.f57129a);
        }
        if (this.f57130b != null) {
            bundle.putInt("current_fragment_id", this.f57130b.mFragmentId);
        }
        if (this.f57131c != null) {
            this.f57131c.mo58307a(bundle);
        }
    }

    /* renamed from: a */
    public final void mo57193a(Bundle bundle) {
        this.f57139k = true;
        if (this.f57129a != null) {
            bundle.putSerializable("age_gate_response", this.f57129a);
        }
        if (!TextUtils.isEmpty(C21592t.f57970b)) {
            bundle.putString("enter_from", C21592t.f57970b);
        }
        if (!TextUtils.isEmpty(C21592t.f57969a)) {
            bundle.putString("enter_method", C21592t.f57969a);
        }
        if (C21671bd.m72535c()) {
            bundle.putBoolean("only_login", true);
        }
        C21151c.m71289a(bundle).mo6876a((C1591g<TResult, TContinuationResult>) new C21641y<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f57129a = (AgeGateResponse) bundle.getSerializable("age_gate_response");
        if (bundle.getInt("current_fragment_id") > 0 && (getSupportFragmentManager().mo2642a(bundle.getInt("current_fragment_id")) instanceof BaseMusLoginFragment)) {
            this.f57130b = (BaseMusLoginFragment) getSupportFragmentManager().mo2642a(bundle.getInt("current_fragment_id"));
        }
        if (this.f57131c != null) {
            this.f57131c.mo58309b(bundle);
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.MusLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ae7);
        this.f57134f = getIntent().getStringExtra("enter_from");
        this.f57135g = getIntent().getStringExtra("enter_method");
        this.f57136h = getIntent().getStringExtra("enter_type");
        if (getIntent().getBooleanExtra("use_find_email_pass_ticker_wrapper", false)) {
            this.f57131c = FindPswByEmailActivity.f57381a;
        }
        if (this.f57131c == null) {
            this.f57131c = new C21883t();
        }
        this.f57132d = new MusLoginManager();
        this.f57138j = new C21590e(this);
        this.f57138j.mo57782b();
        this.f57138j.mo57780a();
        getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.l0)));
        if (bundle == null) {
            m71558e();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.MusLoginActivity", "onCreate", false);
    }

    /* renamed from: b */
    public final void mo57198b(Fragment fragment, boolean z) {
        if (getSupportFragmentManager().mo2658f() == null) {
            getSupportFragmentManager().mo2645a().mo2585a((int) R.id.aoy, fragment).mo2606d();
        } else if (!z || getSupportFragmentManager().mo2657e() <= 1) {
            C0633q a = getSupportFragmentManager().mo2645a();
            a.mo2584a(R.anim.c0, R.anim.ch, R.anim.c7, R.anim.ca);
            a.mo2599b(R.id.aoy, fragment);
            a.mo2589a((String) null);
            a.mo2606d();
        } else {
            mo57197b();
        }
    }

    /* renamed from: c */
    public final void mo57202c(Fragment fragment, boolean z) {
        if (getSupportFragmentManager().mo2658f() == null) {
            getSupportFragmentManager().mo2645a().mo2585a((int) R.id.aoy, fragment).mo2606d();
        } else if (!z || getSupportFragmentManager().mo2657e() <= 1) {
            C0633q a = getSupportFragmentManager().mo2645a();
            a.mo2584a(R.anim.c4, R.anim.cc, R.anim.c2, R.anim.cf);
            a.mo2599b(R.id.aoy, fragment);
            a.mo2589a((String) null);
            a.mo2606d();
        } else {
            mo57197b();
        }
    }

    /* renamed from: a */
    public final void mo57194a(Fragment fragment, boolean z) {
        if (getSupportFragmentManager().mo2658f() == null) {
            getSupportFragmentManager().mo2645a().mo2585a((int) R.id.aoy, fragment).mo2606d();
        } else if (!z || getSupportFragmentManager().mo2657e() <= 1) {
            C0633q a = getSupportFragmentManager().mo2645a();
            a.mo2599b(R.id.aoy, fragment);
            a.mo2589a((String) null);
            a.mo2606d();
        } else {
            mo57197b();
        }
    }

    /* renamed from: a */
    public final void mo57192a(int i, String str, long j, int i2, C22350a aVar) {
        this.f57131c.mo58306a(i, str, j, 60, aVar);
    }
}
