package com.p280ss.android.ugc.aweme.setting.serverpush.p1528ui;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.utils.C43098ej;
import com.p280ss.android.ugc.awemepushapi.PushSettingExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerActivity */
public class PushSettingManagerActivity extends AmeSSActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        if (!C6399b.m19944t()) {
            C43098ej.m136710a(this, getResources().getColor(R.color.a3z));
        } else if (C6399b.m19946v()) {
            ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a03).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a3z).init();
        }
    }

    /* renamed from: a */
    private void m120593a() {
        C0608j supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2644a("FRAGMENT_PUSH_MANAGER_LIST");
        if (a == null) {
            if (VERSION.SDK_INT < 26 || !C6384b.m19835a().mo15292a(PushSettingExperiment.class, false, "enable_notification_category", C6384b.m19835a().mo15295d().enable_notification_category, false)) {
                a = PushSettingManagerFragment.m120599d();
            } else {
                a = PushSettingManagerFragmentSecondVersion.m120614d();
            }
        }
        supportFragmentManager.mo2645a().mo2600b(R.id.aoy, a, "FRAGMENT_PUSH_MANAGER_LIST").mo2606d();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ea);
        m120593a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerActivity", "onCreate", false);
    }
}
