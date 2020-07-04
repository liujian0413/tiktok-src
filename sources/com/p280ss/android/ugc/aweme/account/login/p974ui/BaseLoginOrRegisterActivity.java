package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.app.ProgressDialog;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ViewGroup;
import bolts.C1591g;
import bolts.C1592h;
import butterknife.BindView;
import com.bytedance.common.utility.p480a.C9704b;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.C21151c;
import com.p280ss.android.ugc.aweme.account.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginPart;
import com.p280ss.android.ugc.aweme.account.login.C21559m;
import com.p280ss.android.ugc.aweme.account.login.C21569n;
import com.p280ss.android.ugc.aweme.account.login.C21578r;
import com.p280ss.android.ugc.aweme.account.login.C21579s;
import com.p280ss.android.ugc.aweme.account.login.C21592t;
import com.p280ss.android.ugc.aweme.account.login.C21637u;
import com.p280ss.android.ugc.aweme.account.login.C21642z;
import com.p280ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p280ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber;
import com.p280ss.android.ugc.aweme.account.login.viewmodel.HideLoginPlatformModel;
import com.p280ss.android.ugc.aweme.account.p940c.C21158a;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a.C21172b;
import com.p280ss.android.ugc.aweme.account.util.C22334m;
import com.p280ss.android.ugc.aweme.account.util.C22337n;
import com.p280ss.android.ugc.aweme.account.util.C22347v;
import com.p280ss.android.ugc.aweme.account.view.C22360b;
import com.p280ss.android.ugc.aweme.main.p1385g.C33016c;
import com.p280ss.android.ugc.aweme.main.p1385g.C33033s;
import com.p280ss.android.ugc.aweme.main.p1385g.C33034t;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity */
public abstract class BaseLoginOrRegisterActivity extends AmeBaseActivity implements C21172b, C21559m, C21569n {

    /* renamed from: k */
    public C21637u f58319k;

    /* renamed from: l */
    public BaseFragment f58320l;

    /* renamed from: m */
    protected long f58321m;
    @BindView(2131493136)
    ViewGroup mFragmentContainer;
    @BindView(2131493491)
    DmtStatusView mStatusView;

    /* renamed from: n */
    public String f58322n;

    /* renamed from: o */
    public PhoneNumber f58323o;

    /* renamed from: p */
    public SparseArray<C21866f> f58324p = new SparseArray<>(4);

    /* renamed from: q */
    protected String f58325q;

    /* renamed from: r */
    protected C21158a f58326r;

    /* renamed from: s */
    private String f58327s;

    /* renamed from: t */
    private ProgressDialog f58328t;

    /* renamed from: a */
    public final int mo56948a() {
        return R.layout.d2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo58141e();

    public void setStatusBarColor() {
        C10994a.m32208b(this);
    }

    /* renamed from: j */
    private boolean m72854j() {
        return TextUtils.equals(this.f58322n, "toutiao");
    }

    /* renamed from: b */
    public final void mo57197b() {
        try {
            getSupportFragmentManager().mo2655c();
        } catch (Exception unused) {
        }
    }

    public void onStart() {
        super.onStart();
        C21671bd.m72523a(7, 1, "");
    }

    /* renamed from: f */
    static final /* synthetic */ void m72850f() {
        C21671bd.m72523a(7, 4, "");
        if (C21671bd.m72539g()) {
            C21671bd.m72522a(1, 1, (Object) "");
        } else {
            C21671bd.m72522a(1, 3, (Object) "");
        }
    }

    public void dismissProgressDialog() {
        if (this.f58328t != null && this.f58328t.isShowing()) {
            this.f58328t.dismiss();
        }
    }

    public void onBackPressed() {
        if (getSupportFragmentManager().mo2657e() == 1) {
            C22337n.m73944a(this, false, true);
        } else {
            mo57197b();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f58319k != null) {
            this.f58319k.mo57855d(C21671bd.m72539g());
        }
    }

    public ProgressDialog showProgressDialog() {
        if (this.f58328t == null) {
            this.f58328t = C22347v.m73995b(this);
            this.f58328t.setMessage(getString(R.string.c_o));
            this.f58328t.setCanceledOnTouchOutside(false);
        }
        if (!this.f58328t.isShowing()) {
            this.f58328t.show();
        }
        return this.f58328t;
    }

    /* renamed from: g */
    private void m72851g() {
        ((C33016c) C21671bd.m72521a(C33016c.class)).mo60008a("login");
        this.f58320l = new LoginOrRegisterFragment();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            extras.putString("enter_type", "click_login");
            this.f58320l.setArguments(extras);
        }
        this.mFragmentContainer.setVisibility(0);
        m72849c(this.f58320l, false);
        this.mStatusView.setVisibility(8);
        C42951au.m136343b(this.f58326r);
    }

    /* renamed from: h */
    private void m72852h() {
        ((C33016c) C21671bd.m72521a(C33016c.class)).mo60008a("login");
        this.f58320l = new PhonePassLoginFragment();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            extras.putString("enter_type", "click_login");
            this.f58320l.setArguments(extras);
        }
        this.mFragmentContainer.setVisibility(0);
        m72849c(this.f58320l, false);
        this.mStatusView.setVisibility(8);
        C42951au.m136343b(this.f58326r);
    }

    /* renamed from: i */
    private void m72853i() {
        ((C33016c) C21671bd.m72521a(C33016c.class)).mo60008a("login");
        this.f58320l = new ThirdPartyLoginFragment();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            extras.putString("enter_type", "click_login");
            this.f58320l.setArguments(extras);
        }
        this.mFragmentContainer.setVisibility(0);
        m72849c(this.f58320l, false);
        this.mStatusView.setVisibility(8);
        C42951au.m136343b(this.f58326r);
    }

    public void finish() {
        super.finish();
        C21170a.m71341b(this);
        C21170a.m71337a(11);
        overridePendingTransition(0, R.anim.af);
        ((C33033s) C21671bd.m72521a(C33033s.class)).mo60030a(this);
        int intExtra = getIntent().getIntExtra("bundle_flow_type", C21578r.f57928p);
        if ((intExtra == C21578r.f57930r || intExtra == C21578r.f57931s || intExtra == C21578r.f57932t) && (this.f58320l instanceof C21642z) && ((C21642z) this.f58320l).mo57516X_()) {
            C21579s.m72313b(new BaseLoginMethod());
        }
        if (!(this.f58320l instanceof ThirdPartyLoginFragment) || ((ThirdPartyLoginFragment) this.f58320l).f58521e) {
            new Handler().postDelayed(C21861a.f58559a, 200);
        }
    }

    /* renamed from: c */
    public final void mo56985c() {
        String str;
        super.mo56985c();
        this.f58327s = getIntent().getStringExtra("enter_from");
        this.f58325q = getIntent().getStringExtra("enter_method");
        this.f58321m = System.currentTimeMillis();
        int intExtra = getIntent().getIntExtra("bundle_flow_type", C21578r.f57928p);
        this.f58322n = getIntent().getStringExtra("bundle_from");
        if (intExtra == C21578r.f57928p) {
            mo58141e();
        } else if (intExtra == C21578r.f57930r) {
            m72851g();
        } else if (intExtra == C21578r.f57931s) {
            m72852h();
        } else if (intExtra == C21578r.f57932t) {
            m72853i();
        } else if (intExtra == C21578r.f57929q) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
                if (telephonyManager == null) {
                    str = "";
                } else {
                    str = C9704b.m28640a(telephonyManager);
                }
            } catch (Exception unused) {
                str = "";
            }
            mo58137a(C22334m.m73937a(PhonePassLoginFragment.class).mo58756a("key_input_phone_num", str).mo58756a("enter_from", this.f58327s).mo58756a("enter_type", "click_login").mo58756a("enter_method", this.f58325q).mo58753a(), true);
            this.f58323o.setRawInput(str);
            this.mFragmentContainer.setVisibility(0);
        } else {
            finish();
        }
        this.f58319k = new C21637u();
    }

    /* renamed from: a */
    public final void mo58136a(Fragment fragment) {
        mo58137a(fragment, false);
    }

    /* renamed from: a */
    public final void mo57757a(boolean z) {
        if (this.f58319k != null) {
            this.f58319k.mo57757a(z);
        }
    }

    /* renamed from: c */
    public final void mo58140c(boolean z) {
        if (this.f58319k != null) {
            this.f58319k.mo57854c(z);
        }
    }

    /* renamed from: a_ */
    public final void mo57096a_(int i) {
        if (i == 4) {
            finish();
            return;
        }
        if (i == 11) {
            C21170a.m71341b(this);
            super.finish();
        }
    }

    /* renamed from: b */
    public final void mo58139b(boolean z) {
        if (this.f58319k != null) {
            this.f58319k.mo57853b(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Bundle mo58135a(C1592h hVar) throws Exception {
        if (!hVar.mo6889d()) {
            AccountLoginAlogHelper.m71522b("", "cancel", ALogLoginPart.USER_OPERATOR_AFTER_LOGIN, null, "");
            if (this.f58320l != null) {
                this.f58320l.mo58127e();
                this.f58320l = null;
            }
        }
        C21671bd.m72534b(C21671bd.m72543k());
        if (!m72854j()) {
            finish();
        }
        AccountLoginAlogHelper.m71515a("");
        return (Bundle) hVar.mo6890e();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f58323o = new PhoneNumber().setRawInput(bundle.getString("phone_number_raw_input")).setCountryCode(bundle.getInt("phone_number_country_code")).setNationalNumber(bundle.getLong("phone_number_nation_number"));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("phone_number_raw_input", this.f58323o.getRawInput());
        bundle.putInt("phone_number_country_code", this.f58323o.getCountryCode());
        bundle.putLong("phone_number_nation_number", this.f58323o.getNationalNumber());
    }

    /* renamed from: a */
    public final void mo57193a(Bundle bundle) {
        if (!TextUtils.isEmpty(C21592t.f57970b)) {
            bundle.putString("enter_from", C21592t.f57970b);
        }
        if (!TextUtils.isEmpty(C21592t.f57969a)) {
            bundle.putString("enter_method", C21592t.f57969a);
        }
        if (C21671bd.m72535c()) {
            bundle.putBoolean("only_login", true);
        }
        if ("mobile".equals(bundle.getString("platform"))) {
            bundle.putInt("user_mode", 0);
            C21151c.m71289a(bundle).mo6876a((C1591g<TResult, TContinuationResult>) new C21862b<TResult,TContinuationResult>(this), C1592h.f5958b);
            if (m72854j()) {
                showProgressDialog();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        this.f58323o = new PhoneNumber().setCountryCode(PhoneNumberUtil.m73057a((Context) this).mo58312a(((C33034t) C21671bd.m72521a(C33034t.class)).mo60002b(), Locale.getDefault().getCountry()));
        BaseLoginMethod a = C21579s.m72305a(LoginMethodName.DEFAULT);
        if ((a instanceof PhoneLoginMethod) && getIntent().getBooleanExtra("need_auto_fill_latest_login_info", true)) {
            PhoneLoginMethod phoneLoginMethod = (PhoneLoginMethod) a;
            this.f58323o.setCountryCode(phoneLoginMethod.getPhoneNumber().getCountryCode());
            this.f58323o.setNationalNumber(phoneLoginMethod.getPhoneNumber().getNationalNumber());
            this.f58323o.setRawInput(String.valueOf(this.f58323o.getNationalNumber()));
        }
        this.f58326r = new C21158a(this, new C22360b(this));
        this.f58326r.setCanceledOnTouchOutside(false);
        ((HideLoginPlatformModel) C0069x.m159a((FragmentActivity) this).mo147a(HideLoginPlatformModel.class)).f59213b.setValue(getIntent().getStringExtra("need_hide_login_way"));
        super.onCreate(bundle);
        overridePendingTransition(R.anim.ae, 0);
        C21170a.m71339a((C21172b) this);
    }

    /* renamed from: c */
    private void m72849c(Fragment fragment, boolean z) {
        if (fragment instanceof BaseFragment) {
            this.f58320l = (BaseFragment) fragment;
        }
        if (getSupportFragmentManager().mo2658f() == null) {
            getSupportFragmentManager().mo2645a().mo2585a((int) R.id.aoy, fragment).mo2606d();
            return;
        }
        C0633q a = getSupportFragmentManager().mo2645a();
        a.mo2599b(R.id.aoy, fragment);
        a.mo2589a((String) null);
        a.mo2606d();
    }

    /* renamed from: b */
    public final void mo58138b(Fragment fragment, boolean z) {
        if (fragment instanceof BaseFragment) {
            this.f58320l = (BaseFragment) fragment;
        }
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
    public final void mo58137a(Fragment fragment, boolean z) {
        if (fragment instanceof BaseFragment) {
            this.f58320l = (BaseFragment) fragment;
        }
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

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f58320l != null) {
            this.f58320l.onActivityResult(i, i2, intent);
        }
        if (C21671bd.m72539g()) {
            finish();
        }
    }
}
