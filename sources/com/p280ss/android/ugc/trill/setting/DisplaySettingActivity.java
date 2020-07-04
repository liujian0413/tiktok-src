package com.p280ss.android.ugc.trill.setting;

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
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.trill.language.view.AppLanguageListFragment;
import com.p280ss.android.ugc.trill.language.viewmodel.AppLanguageViewModel;
import com.p280ss.android.ugc.trill.setting.LanguageSettingHostFragment.C45056a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.trill.setting.DisplaySettingActivity */
public class DisplaySettingActivity extends AmeBaseActivity implements C45056a {

    /* renamed from: a */
    AppLanguageViewModel f115794a;

    /* renamed from: b */
    private LanguageSettingHostFragment f115795b;

    /* renamed from: c */
    private AppLanguageListFragment f115796c;
    ViewGroup rootView;

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.eq;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.DisplaySettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.DisplaySettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.DisplaySettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C7212bb.m22498b(this);
    }

    /* renamed from: d */
    private void m142116d() {
        this.f115794a = (AppLanguageViewModel) C0069x.m159a((FragmentActivity) this).mo147a(AppLanguageViewModel.class);
    }

    public void onDestroy() {
        ImmersionBar.with((Activity) this).destroy();
        super.onDestroy();
    }

    /* renamed from: c */
    private void m142115c() {
        if (C6399b.m19946v()) {
            this.rootView.setBackgroundColor(getResources().getColor(R.color.a7f));
        }
        C0608j supportFragmentManager = getSupportFragmentManager();
        this.f115795b = (LanguageSettingHostFragment) supportFragmentManager.mo2644a("language_setting_host_fragment");
        if (this.f115795b == null) {
            this.f115795b = new LanguageSettingHostFragment();
            supportFragmentManager.mo2645a().mo2586a(R.id.aoy, this.f115795b, "language_setting_host_fragment").mo2606d();
            this.f115795b.f115798e = this;
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.DisplaySettingActivity", "onCreate", true);
        super.onCreate(bundle);
        m142115c();
        m142116d();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.DisplaySettingActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo107585a(Bundle bundle) {
        C0608j supportFragmentManager = getSupportFragmentManager();
        this.f115796c = (AppLanguageListFragment) supportFragmentManager.mo2644a("language_app_fragment");
        if (this.f115796c == null) {
            this.f115796c = new AppLanguageListFragment();
            this.f115796c.setArguments(bundle);
        }
        if (!this.f115796c.isAdded()) {
            C0633q a = supportFragmentManager.mo2645a();
            a.mo2584a(R.anim.c0, 0, 0, R.anim.ca);
            a.mo2586a(R.id.aoy, this.f115796c, "language_app_fragment");
            a.mo2589a((String) null);
            a.mo2606d();
        }
    }
}
