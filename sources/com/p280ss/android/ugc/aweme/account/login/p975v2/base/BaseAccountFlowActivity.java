package com.p280ss.android.ugc.aweme.account.login.p975v2.base;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0069x;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.account.base.MusAbsActivity;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7585d;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowActivity */
public abstract class BaseAccountFlowActivity extends MusAbsActivity {

    /* renamed from: a */
    private Fragment f58599a;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowActivity$a */
    static final /* synthetic */ class C21887a extends FunctionReference implements C7562b<Bundle, C7581n> {
        C21887a(BaseAccountFlowActivity baseAccountFlowActivity) {
            super(1, baseAccountFlowActivity);
        }

        public final String getName() {
            return "handleActionTransition";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(BaseAccountFlowActivity.class);
        }

        public final String getSignature() {
            return "handleActionTransition(Landroid/os/Bundle;)V";
        }

        /* renamed from: a */
        private void m73080a(Bundle bundle) {
            ((BaseAccountFlowActivity) this.receiver).mo58328a(bundle);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m73080a((Bundle) obj);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowActivity$b */
    static final /* synthetic */ class C21888b extends FunctionReference implements C7562b<Bundle, C7581n> {
        C21888b(BaseAccountFlowActivity baseAccountFlowActivity) {
            super(1, baseAccountFlowActivity);
        }

        public final String getName() {
            return "handleSuccess";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(BaseAccountFlowActivity.class);
        }

        public final String getSignature() {
            return "handleSuccess(Landroid/os/Bundle;)V";
        }

        /* renamed from: a */
        private void m73081a(Bundle bundle) {
            ((BaseAccountFlowActivity) this.receiver).mo58331b(bundle);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m73081a((Bundle) obj);
            return C7581n.f20898a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo58328a(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo58331b(Bundle bundle);

    /* renamed from: e */
    private final void mo58398e() {
        if (isActive()) {
            getSupportFragmentManager().mo2655c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final BaseAccountFlowFragment mo58327a() {
        return (BaseAccountFlowFragment) getSupportFragmentManager().mo2642a((int) R.id.aoy);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo58330b() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("enter_from");
            if (stringExtra != null) {
                return stringExtra;
            }
        }
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo58332c() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("enter_method");
            if (stringExtra != null) {
                return stringExtra;
            }
        }
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo58333d() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("enter_type");
            if (stringExtra != null) {
                return stringExtra;
            }
        }
        return "";
    }

    public void onBackPressed() {
        BaseAccountFlowFragment a = mo58327a();
        if (a == null || !a.mo58346l()) {
            C0608j supportFragmentManager = getSupportFragmentManager();
            C7573i.m23582a((Object) supportFragmentManager, "supportFragmentManager");
            if (supportFragmentManager.mo2657e() == 1) {
                finish();
            } else {
                mo58398e();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.a4h);
        FragmentActivity fragmentActivity = this;
        C0043i iVar = this;
        BaseAccountFlowActivity baseAccountFlowActivity = this;
        ((ActionResultModel) C0069x.m159a(fragmentActivity).mo147a(ActionResultModel.class)).f58597b.observe(iVar, new C21901a(new C21887a(baseAccountFlowActivity)));
        ((ActionResultModel) C0069x.m159a(fragmentActivity).mo147a(ActionResultModel.class)).f58598c.observe(iVar, new C21901a(new C21888b(baseAccountFlowActivity)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58329a(BaseAccountFlowFragment baseAccountFlowFragment, Bundle bundle) {
        String str;
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(bundle, "argument");
        C0608j supportFragmentManager = getSupportFragmentManager();
        C7573i.m23582a((Object) supportFragmentManager, "supportFragmentManager");
        int e = supportFragmentManager.mo2657e();
        if (bundle.getBoolean("finish_before_jump", false)) {
            e--;
            bundle.putBoolean("finish_before_jump", false);
            mo58398e();
        }
        Fragment fragment = baseAccountFlowFragment;
        this.f58599a = fragment;
        baseAccountFlowFragment.setArguments(bundle);
        C0633q a = getSupportFragmentManager().mo2645a();
        C7573i.m23582a((Object) a, "supportFragmentManager.beginTransaction()");
        if (e > 0 && bundle.getBoolean("open_page_without_animation", false)) {
            a.mo2584a(R.anim.c4, R.anim.cc, R.anim.c2, R.anim.cf);
        }
        String m = BaseAccountFlowFragment.m73083m();
        if (TextUtils.isEmpty(m)) {
            int i = bundle.getInt("current_page", -10);
            if (i != -10) {
                str = String.valueOf(i);
            } else if (!C7163a.m22363a()) {
                str = "";
            } else {
                throw new IllegalArgumentException("需要传 stack tag ");
            }
            m = str;
        }
        a.mo2600b(R.id.aoy, fragment, m);
        a.mo2589a((String) null);
        a.mo2606d();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment fragment = this.f58599a;
        if (fragment != null) {
            fragment.onActivityResult(i, i2, intent);
        }
    }
}
