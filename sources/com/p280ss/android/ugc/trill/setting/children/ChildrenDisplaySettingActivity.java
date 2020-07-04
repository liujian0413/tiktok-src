package com.p280ss.android.ugc.trill.setting.children;

import android.app.Activity;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.FragmentActivity;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.trill.language.view.AppLanguageListFragment;
import com.p280ss.android.ugc.trill.language.viewmodel.AppLanguageViewModel;
import com.p280ss.android.ugc.trill.setting.children.ChildrenLanguageSettingHostFragment.C45069a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.trill.setting.children.ChildrenDisplaySettingActivity */
public class ChildrenDisplaySettingActivity extends AmeBaseActivity implements C45069a {

    /* renamed from: a */
    AppLanguageViewModel f115819a;

    /* renamed from: b */
    private ChildrenLanguageSettingHostFragment f115820b;

    /* renamed from: c */
    private AppLanguageListFragment f115821c;
    ViewGroup rootView;

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.eq;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.children.ChildrenDisplaySettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.children.ChildrenDisplaySettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.children.ChildrenDisplaySettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: d */
    private void m142142d() {
        this.f115819a = (AppLanguageViewModel) C0069x.m159a((FragmentActivity) this).mo147a(AppLanguageViewModel.class);
    }

    public void onDestroy() {
        ImmersionBar.with((Activity) this).destroy();
        super.onDestroy();
    }

    public void setStatusBarColor() {
        if (C6399b.m19946v()) {
            ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a03).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a3z).init();
        }
    }

    /* renamed from: c */
    private void m142141c() {
        if (C6399b.m19946v()) {
            this.rootView.setBackgroundColor(getResources().getColor(R.color.a7f));
        }
        C0608j supportFragmentManager = getSupportFragmentManager();
        this.f115820b = (ChildrenLanguageSettingHostFragment) supportFragmentManager.mo2642a((int) R.id.aoy);
        if (this.f115820b == null) {
            this.f115820b = new ChildrenLanguageSettingHostFragment();
            supportFragmentManager.mo2645a().mo2586a(R.id.aoy, this.f115820b, "language_setting_host_fragment").mo2606d();
            this.f115820b.f115823e = this;
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.children.ChildrenDisplaySettingActivity", "onCreate", true);
        super.onCreate(bundle);
        m142141c();
        m142142d();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.children.ChildrenDisplaySettingActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo107601a(Bundle bundle) {
        C0608j supportFragmentManager = getSupportFragmentManager();
        this.f115821c = (AppLanguageListFragment) supportFragmentManager.mo2644a("language_app_fragment");
        if (this.f115821c == null) {
            this.f115821c = new AppLanguageListFragment();
            this.f115821c.setArguments(bundle);
        }
        C0633q a = supportFragmentManager.mo2645a();
        a.mo2584a(R.anim.c0, 0, 0, R.anim.ca);
        a.mo2586a(R.id.aoy, this.f115821c, "language_app_fragment");
        a.mo2589a((String) null);
        a.mo2606d();
    }
}
