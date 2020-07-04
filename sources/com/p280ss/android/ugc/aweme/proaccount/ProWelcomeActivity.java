package com.p280ss.android.ugc.aweme.proaccount;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.proaccount.ProCategoryFragment.C35626a;
import com.p280ss.android.ugc.aweme.proaccount.ProWelcomeFragment.C35634a;
import com.p280ss.android.ugc.aweme.proaccount.ProWelcomeFragment.C35635b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity */
public final class ProWelcomeActivity extends AmeBaseActivity implements C35635b {

    /* renamed from: c */
    public static final C35631a f93337c = new C35631a(null);

    /* renamed from: a */
    public long f93338a = -1;

    /* renamed from: b */
    public long f93339b = -1;

    /* renamed from: d */
    private ProWelcomeFragment f93340d;

    /* renamed from: e */
    private HashMap f93341e;

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity$a */
    public static final class C35631a {
        private C35631a() {
        }

        public /* synthetic */ C35631a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static Intent m115115a(Context context) {
            C7573i.m23587b(context, "context");
            return new Intent(context, ProWelcomeActivity.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity$b */
    public static final class C35632b implements C10797a {

        /* renamed from: a */
        final /* synthetic */ ProWelcomeActivity f93342a;

        /* renamed from: b */
        public final void mo25896b(View view) {
        }

        C35632b(ProWelcomeActivity proWelcomeActivity) {
            this.f93342a = proWelcomeActivity;
        }

        /* renamed from: a */
        public final void mo25895a(View view) {
            this.f93342a.mo90444i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity$c */
    static final class C35633c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProWelcomeActivity f93343a;

        C35633c(ProWelcomeActivity proWelcomeActivity) {
            this.f93343a = proWelcomeActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f93343a.mo59893d();
        }
    }

    /* renamed from: a */
    private View m115107a(int i) {
        if (this.f93341e == null) {
            this.f93341e = new HashMap();
        }
        View view = (View) this.f93341e.get(Integer.valueOf(R.id.egs));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.egs);
        this.f93341e.put(Integer.valueOf(R.id.egs), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.e6;
    }

    public final void onBackPressed() {
        mo90444i();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: l */
    private final void m115110l() {
        ((ButtonTitleBar) m115107a(R.id.egs)).setOnTitleBarClickListener(new C35632b(this));
    }

    /* renamed from: c */
    public final void mo58711c() {
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        User curUser = a.getCurUser();
        if (curUser == null || !curUser.isSecret()) {
            mo59893d();
        } else {
            m115108j();
        }
    }

    /* renamed from: j */
    private final void m115108j() {
        new C10741a(this).mo25649a((int) R.string.ap8).mo25657b((int) R.string.ap2).mo25658b((int) R.string.aoz, (OnClickListener) null).mo25650a((int) R.string.ap0, (OnClickListener) new C35633c(this)).mo25656a().mo25637a();
    }

    /* renamed from: k */
    private final void m115109k() {
        this.f93340d = C35634a.m115126a();
        ProWelcomeFragment proWelcomeFragment = this.f93340d;
        if (proWelcomeFragment == null) {
            C7573i.m23583a("fragment");
        }
        proWelcomeFragment.mo90448a((C35635b) this);
        this.f93338a = System.currentTimeMillis();
        C0633q a = getSupportFragmentManager().mo2645a();
        ProWelcomeFragment proWelcomeFragment2 = this.f93340d;
        if (proWelcomeFragment2 == null) {
            C7573i.m23583a("fragment");
        }
        a.mo2600b(R.id.aoy, proWelcomeFragment2, "imageFragment").mo2589a((String) null).mo2604c();
    }

    /* renamed from: d */
    public final void mo59893d() {
        this.f93339b = System.currentTimeMillis();
        ProCategoryFragment a = C35626a.m115103a();
        ProWelcomeFragment proWelcomeFragment = this.f93340d;
        if (proWelcomeFragment == null) {
            C7573i.m23583a("fragment");
        }
        a.setTargetFragment(proWelcomeFragment, 10001);
        getSupportFragmentManager().mo2645a().mo2583a((int) R.anim.c4, (int) R.anim.cc).mo2600b(R.id.aoy, a, "categoryFragment").mo2589a((String) null).mo2604c();
    }

    /* renamed from: i */
    public final void mo90444i() {
        C0608j supportFragmentManager = getSupportFragmentManager();
        C7573i.m23582a((Object) supportFragmentManager, "supportFragmentManager");
        if (supportFragmentManager.mo2657e() == 1) {
            Fragment a = getSupportFragmentManager().mo2644a("imageFragment");
            if (a != null && a.isVisible()) {
                C6907h.m21524a("back", (Map) C22984d.m75611a().mo59973a("enter_from", "welcome screen").mo59971a("duration", System.currentTimeMillis() - this.f93338a).f60753a);
            }
            finish();
            return;
        }
        Fragment a2 = getSupportFragmentManager().mo2644a("categoryFragment");
        if (a2 != null && a2.isVisible()) {
            Intent intent = new Intent();
            intent.putExtra("BACK_FROM_CATEGORY", true);
            Fragment fragment = a2.mTarget;
            if (fragment != null) {
                fragment.onActivityResult(10001, -1, intent);
            }
            C6907h.m21524a("back", (Map) C22984d.m75611a().mo59973a("enter_from", "Choose a Category").mo59971a("duration", System.currentTimeMillis() - this.f93339b).f60753a);
        }
        getSupportFragmentManager().mo2655c();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity", "onCreate", true);
        super.onCreate(bundle);
        m115109k();
        m115110l();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity", "onCreate", false);
    }
}
