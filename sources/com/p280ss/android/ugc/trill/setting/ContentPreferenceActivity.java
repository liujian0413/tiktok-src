package com.p280ss.android.ugc.trill.setting;

import android.app.Activity;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.compliance.C25789b;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.trill.language.view.LanguageListFragment;
import com.p280ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel;
import com.p280ss.android.ugc.trill.setting.ContentPreferenceHostFragment.C45050a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.trill.setting.ContentPreferenceActivity */
public final class ContentPreferenceActivity extends AmeBaseActivity implements C45050a {

    /* renamed from: a */
    public ContentPreferenceViewModel f115779a;

    /* renamed from: b */
    private ContentPreferenceHostFragment f115780b;

    /* renamed from: c */
    private LanguageListFragment f115781c;

    /* renamed from: d */
    private PoliticalAccountSettingFragment f115782d;

    /* renamed from: e */
    private HashMap f115783e;

    /* renamed from: a */
    private View m142100a(int i) {
        if (this.f115783e == null) {
            this.f115783e = new HashMap();
        }
        View view = (View) this.f115783e.get(Integer.valueOf(R.id.cwi));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.cwi);
        this.f115783e.put(Integer.valueOf(R.id.cwi), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.eq;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.ContentPreferenceActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.ContentPreferenceActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.ContentPreferenceActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
        C7212bb.m22498b(this);
    }

    public final void onDestroy() {
        ImmersionBar.with((Activity) this).destroy();
        super.onDestroy();
    }

    /* renamed from: j */
    private final void m142102j() {
        C0063u a = C0069x.m159a((FragmentActivity) this).mo147a(ContentPreferenceViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(th…nceViewModel::class.java)");
        this.f115779a = (ContentPreferenceViewModel) a;
        ContentPreferenceViewModel contentPreferenceViewModel = this.f115779a;
        if (contentPreferenceViewModel == null) {
            C7573i.m23583a("mViewModel");
        }
        contentPreferenceViewModel.mo107575g();
    }

    /* renamed from: i */
    private final void m142101i() {
        if (C6399b.m19946v()) {
            ((RelativeLayout) m142100a(R.id.cwi)).setBackgroundColor(getResources().getColor(R.color.a7f));
        }
        this.f115780b = (ContentPreferenceHostFragment) getSupportFragmentManager().mo2644a("content_setting_host_fragment");
        if (this.f115780b == null) {
            this.f115780b = new ContentPreferenceHostFragment();
            C0633q a = getSupportFragmentManager().mo2645a();
            ContentPreferenceHostFragment contentPreferenceHostFragment = this.f115780b;
            if (contentPreferenceHostFragment == null) {
                C7573i.m23580a();
            }
            a.mo2586a(R.id.aoy, contentPreferenceHostFragment, "content_setting_host_fragment").mo2606d();
            ContentPreferenceHostFragment contentPreferenceHostFragment2 = this.f115780b;
            if (contentPreferenceHostFragment2 == null) {
                C7573i.m23580a();
            }
            contentPreferenceHostFragment2.mo107581a((C45050a) this);
        }
    }

    /* renamed from: c */
    public final void mo58711c() {
        C0608j supportFragmentManager = getSupportFragmentManager();
        this.f115781c = (LanguageListFragment) supportFragmentManager.mo2644a("language_content_fragment");
        if (this.f115781c == null) {
            this.f115781c = new LanguageListFragment();
        }
        LanguageListFragment languageListFragment = this.f115781c;
        if (languageListFragment == null) {
            C7573i.m23580a();
        }
        if (!languageListFragment.isAdded()) {
            C0633q a = supportFragmentManager.mo2645a();
            C7573i.m23582a((Object) a, "fragmentManager.beginTransaction()");
            a.mo2584a(R.anim.c0, 0, 0, R.anim.ca);
            LanguageListFragment languageListFragment2 = this.f115781c;
            if (languageListFragment2 == null) {
                C7573i.m23580a();
            }
            a.mo2586a(R.id.aoy, languageListFragment2, "language_content_fragment");
            a.mo2589a((String) null);
            a.mo2606d();
        }
    }

    /* renamed from: d */
    public final void mo59893d() {
        if (!C25789b.m84760f()) {
            C6877n.m21407a("vpa_show_in_error_region", "", null);
        }
        if (C43122ff.m136767b() || TimeLockRuler.isInTeenagerModeNewVersion()) {
            C6877n.m21407a("vpa_setting_button_clicked_in_child_mode", "", null);
        }
        C0608j supportFragmentManager = getSupportFragmentManager();
        this.f115782d = (PoliticalAccountSettingFragment) supportFragmentManager.mo2644a("vpa_choice_fragment");
        if (this.f115782d == null) {
            this.f115782d = new PoliticalAccountSettingFragment();
        }
        PoliticalAccountSettingFragment politicalAccountSettingFragment = this.f115782d;
        if (politicalAccountSettingFragment == null) {
            C7573i.m23580a();
        }
        if (!politicalAccountSettingFragment.isAdded()) {
            C0633q a = supportFragmentManager.mo2645a();
            C7573i.m23582a((Object) a, "fragmentManager.beginTransaction()");
            a.mo2584a(R.anim.c0, 0, 0, R.anim.ca);
            PoliticalAccountSettingFragment politicalAccountSettingFragment2 = this.f115782d;
            if (politicalAccountSettingFragment2 == null) {
                C7573i.m23580a();
            }
            a.mo2586a(R.id.aoy, politicalAccountSettingFragment2, "vpa_choice_fragment");
            a.mo2589a((String) null);
            a.mo2606d();
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.ContentPreferenceActivity", "onCreate", true);
        super.onCreate(bundle);
        m142101i();
        m142102j();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.ContentPreferenceActivity", "onCreate", false);
    }
}
