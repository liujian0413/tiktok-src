package com.p280ss.android.ugc.aweme.account.p982ui;

import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p262ui.common.C10775d;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.login.C21578r;
import com.p280ss.android.ugc.aweme.account.model.AccountOpeModel;
import com.p280ss.android.ugc.aweme.account.model.C22198a;
import com.p280ss.android.ugc.aweme.account.model.C22199b;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p946i.C21220e;
import com.p280ss.android.ugc.aweme.account.util.C22325d;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.main.p1385g.C33033s;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.ui.BaseBindMobileActivity */
public abstract class BaseBindMobileActivity extends BaseAccountActivity {

    /* renamed from: k */
    public String f59370k;

    /* renamed from: l */
    public String f59371l;

    /* renamed from: m */
    public int f59372m;

    /* renamed from: n */
    public String f59373n;

    /* renamed from: o */
    FrameLayout f59374o;

    /* renamed from: p */
    public C22307g f59375p;

    /* renamed from: e */
    private void mo58141e() {
        mo58616a(mo56949b());
    }

    public void onResume() {
        super.onResume();
        C22345t.m73969d(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Fragment mo56949b() {
        return BindMobileInputPhoneFragment.m73753a(m73722f());
    }

    public void finish() {
        super.finish();
        ((C33033s) C21671bd.m72521a(C33033s.class)).mo60030a(this);
        User k = C21671bd.m72543k();
        if (k != null && !k.isPhoneBinded()) {
            C21671bd.m72522a(7, 2, (Object) null);
        }
    }

    /* renamed from: f */
    private Bundle m73722f() {
        C42914ab a = C42914ab.m136242a().mo104633a("enter_from", this.f59370k);
        if (!TextUtils.isEmpty(getIntent().getStringExtra("profile_key"))) {
            a.mo104633a("profile_key", getIntent().getStringExtra("profile_key"));
        }
        if (TextUtils.equals(this.f59371l, "enter_from_bind_pre_account")) {
            a.mo104630a("type", 5);
            a.mo104630a("proaccount_switch_type", this.f59372m);
            a.mo104633a("proaccount_category", this.f59373n);
        } else {
            a.mo104630a("type", getIntent().getIntExtra("type", 2));
        }
        return a.f111445a;
    }

    public void onBackPressed() {
        if (C10775d.m31450a().f28891a || !C21671bd.m72540h().isForbidSkipBindPhone() || this.f59370k == null || !this.f59370k.contains("third_party_") || !C21671bd.m72542j()) {
            if (TextUtils.equals(this.f59371l, "enter_from_bind_pre_account") && this.f59375p != null) {
                Fragment a = getSupportFragmentManager().mo2642a((int) R.id.aoy);
                if (a != null && (a instanceof BaseBindMobileInputPhoneFragment) && a.isVisible()) {
                    C6907h.m21524a("back", (Map) C21102b.m71165a().mo56946a("enter_from", "Set up by Phone").mo56945a("duration", this.f59375p.mo57601j()).f56672a);
                } else if (a != null && (a instanceof VerificationCodeFragment) && a.isVisible()) {
                    C6907h.m21524a("back", (Map) C21102b.m71165a().mo56946a("enter_from", "Input Phone Captcha").mo56945a("duration", this.f59375p.mo57601j()).f56672a);
                }
            }
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo58624a(C22198a aVar) {
        if (aVar == null || !aVar.f59293a) {
            onBackPressed();
        } else {
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo58625a(C22199b bVar) {
        String str;
        if (bVar != null && !TextUtils.isEmpty(bVar.f59294a) && !TextUtils.isEmpty(this.f59370k)) {
            if (this.f59370k == null || !this.f59370k.contains("third_party_")) {
                str = this.f59370k;
            } else {
                str = "log_in";
            }
            C6907h.m21524a("phone_bundling_success", (Map) C21102b.m71165a().mo56946a("enter_from", str).mo56944a("status", 1).mo56946a("platform", C21220e.m71416a(C22325d.m73917a(this.f59370k))).f56672a);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f59374o = (FrameLayout) findViewById(R.id.aoy);
        this.f59370k = getIntent().getStringExtra(C21578r.f57922j);
        this.f59371l = getIntent().getStringExtra(C21578r.f57923k);
        this.f59372m = getIntent().getIntExtra(C21578r.f57924l, 0);
        this.f59373n = getIntent().getStringExtra(C21578r.f57925m);
        if (TextUtils.equals(this.f59371l, "enter_from_bind_pre_account")) {
            this.f59374o.setBackground(C0683b.m2903a((Context) this, (int) R.color.e9));
        }
        AccountOpeModel accountOpeModel = (AccountOpeModel) C0069x.m159a((FragmentActivity) this).mo147a(AccountOpeModel.class);
        accountOpeModel.f59291b.observe(this, new C22301a(this));
        accountOpeModel.f59292c.observe(this, new C22302b(this));
        mo58141e();
    }
}
