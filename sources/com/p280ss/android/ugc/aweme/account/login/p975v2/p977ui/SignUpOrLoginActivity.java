package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui;

import android.app.Activity;
import android.arch.lifecycle.C0049m;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.keva.Keva;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.C21151c;
import com.p280ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p280ss.android.ugc.aweme.account.login.C21592t;
import com.p280ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p280ss.android.ugc.aweme.account.login.agegate.C21297b;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.ActionResultModel;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowActivity;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step.C21900a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.PhoneEmailLoginFragment;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a.C21172b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity */
public final class SignUpOrLoginActivity extends BaseAccountFlowActivity implements C21172b {

    /* renamed from: b */
    public static final C22045a f58957b = new C22045a(null);

    /* renamed from: a */
    public AgeGateResponse f58958a;

    /* renamed from: c */
    private Step f58959c = Step.PHONE_EMAIL_LOGIN;

    /* renamed from: d */
    private Step f58960d = Step.NONE;

    /* renamed from: e */
    private boolean f58961e;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity$a */
    public static final class C22045a {
        private C22045a() {
        }

        public /* synthetic */ C22045a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static Intent m73347a(Context context) {
            C7573i.m23587b(context, "context");
            Intent putExtra = new Intent(context, SignUpOrLoginActivity.class).putExtra("current_scene", Scene.SIGN_UP.getValue()).putExtra("next_page", Step.PHONE_EMAIL_SIGN_UP.getValue());
            C7573i.m23582a((Object) putExtra, "Intent(context, SignUpOr…HONE_EMAIL_SIGN_UP.value)");
            return putExtra;
        }

        /* renamed from: b */
        public static Intent m73348b(Context context) {
            C7573i.m23587b(context, "context");
            Intent putExtra = new Intent(context, SignUpOrLoginActivity.class).putExtra("current_scene", Scene.LOGIN.getValue()).putExtra("next_page", Step.PHONE_EMAIL_LOGIN.getValue());
            C7573i.m23582a((Object) putExtra, "Intent(context, SignUpOr….PHONE_EMAIL_LOGIN.value)");
            return putExtra;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity$b */
    static final class C22046b<TTaskResult, TContinuationResult> implements C1591g<Bundle, C1592h<Bundle>> {

        /* renamed from: a */
        final /* synthetic */ SignUpOrLoginActivity f58962a;

        C22046b(SignUpOrLoginActivity signUpOrLoginActivity) {
            this.f58962a = signUpOrLoginActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C1592h<Bundle> then(C1592h<Bundle> hVar) {
            this.f58962a.finish();
            if (C21671bd.m72539g()) {
                C21671bd.m72522a(1, 1, (Object) "");
            }
            this.f58962a.mo58398e();
            C21671bd.m72534b(C21671bd.m72543k());
            return hVar;
        }
    }

    /* renamed from: a */
    public static final Intent m73341a(Context context) {
        return C22045a.m73347a(context);
    }

    /* renamed from: b */
    public static final Intent m73342b(Context context) {
        return C22045a.m73348b(context);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: e */
    public final void mo58398e() {
        if (this.f58961e) {
            C21170a.m71337a(11);
        } else {
            C21170a.m71337a(10);
        }
    }

    public final void onDestroy() {
        C21170a.m71341b(this);
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarColor((int) R.color.l0).statusBarDarkFont(true).init();
    }

    public final void finish() {
        super.finish();
        C21297b.m71676a();
        switch (C22154m.f59191a[this.f58959c.ordinal()]) {
            case 1:
                C21671bd.m72522a(15, 1, (Object) "");
                return;
            case 2:
            case 3:
                if (this.f58960d != Step.NONE) {
                    if (this.f58960d == Step.INPUT_PHONE_LOGIN || this.f58960d == Step.INPUT_EMAIL_LOGIN) {
                        BaseAccountFlowFragment a = mo58327a();
                        if (!(a instanceof PhoneEmailLoginFragment)) {
                            a = null;
                        }
                        PhoneEmailLoginFragment phoneEmailLoginFragment = (PhoneEmailLoginFragment) a;
                        if (phoneEmailLoginFragment == null || !phoneEmailLoginFragment.mo57299a() || C21671bd.m72539g()) {
                            mo58398e();
                        } else {
                            C21671bd.m72545m().retryLogin();
                        }
                        C21671bd.m72523a(7, 4, "");
                        break;
                    }
                } else if (C21671bd.m72539g()) {
                    mo58398e();
                    return;
                }
                break;
        }
    }

    /* renamed from: a_ */
    public final void mo57096a_(int i) {
        if (i == 9) {
            finish();
        }
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        Serializable serializable;
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            serializable = bundle.getSerializable("age_gate_response");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof AgeGateResponse)) {
            serializable = null;
        }
        this.f58958a = (AgeGateResponse) serializable;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f58958a != null && bundle != null) {
            bundle.putSerializable("age_gate_response", this.f58958a);
        }
    }

    /* renamed from: b */
    public final void mo58331b(Bundle bundle) {
        this.f58961e = true;
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (this.f58958a != null) {
            bundle.putSerializable("age_gate_response", this.f58958a);
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
        C21151c.m71289a(bundle).mo6876a((C1591g<TResult, TContinuationResult>) new C22046b<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: a */
    public final void mo58328a(Bundle bundle) {
        boolean z;
        Bundle bundle2 = new Bundle(bundle);
        Step a = C21900a.m73110a(bundle2.getInt("next_page", Step.PHONE_EMAIL_SIGN_UP.getValue()));
        switch (C22154m.f59192b[a.ordinal()]) {
            case 1:
                if (bundle2.getInt("result_code", -99988) != -99988) {
                    setResult(bundle2.getInt("result_code", -99988));
                }
                finish();
                return;
            case 2:
                Intent intent = new Intent(this, MusLoginActivity.class);
                intent.putExtra("init_page", 13);
                intent.putExtra("age_gate_data", this.f58958a);
                intent.putExtras(bundle2);
                startActivity(intent);
                finish();
                return;
            default:
                int i = bundle2.getInt("current_page", -1);
                bundle2.putInt("previous_page", i);
                if (a == Step.PHONE_EMAIL_SIGN_UP && i == -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && !C21297b.m71679b()) {
                    a = Step.AGE_GATE_SIGN_UP;
                    if (!C21297b.m71680c()) {
                        Keva.getRepo("compliance_setting").storeBoolean("need_to_show_ftc_age_gate_but_no_showed", true);
                    }
                }
                bundle2.putInt("current_page", a.getValue());
                bundle2.remove("next_page");
                if (a == Step.THIRD_PARTY_AGE_GATE) {
                    bundle2.putString("platform", getIntent().getStringExtra("platform"));
                } else if (a == Step.AGE_GATE) {
                    bundle2.putBoolean("ftc_detect", true);
                }
                mo58329a(C22151j.m73594a(a), bundle2);
                return;
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.l0)));
        C21170a.m71339a((C21172b) this);
        this.f58959c = C21900a.m73110a(getIntent().getIntExtra("next_page", Step.PHONE_EMAIL_LOGIN.getValue()));
        this.f58960d = C21900a.m73110a(getIntent().getIntExtra("child_page", Step.NONE.getValue()));
        if (bundle == null) {
            C0049m<Bundle> mVar = ((ActionResultModel) C0069x.m159a((FragmentActivity) this).mo147a(ActionResultModel.class)).f58597b;
            Intent intent = getIntent();
            C7573i.m23582a((Object) intent, "intent");
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putString("enter_from", mo58330b());
            extras.putString("enter_method", mo58332c());
            extras.putString("enter_type", mo58333d());
            extras.putInt("next_page", this.f58959c.getValue());
            mVar.postValue(extras);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onCreate", false);
    }
}
