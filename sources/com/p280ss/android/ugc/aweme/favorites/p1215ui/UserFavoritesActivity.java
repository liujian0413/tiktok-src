package com.p280ss.android.ugc.aweme.favorites.p1215ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity */
public class UserFavoritesActivity extends AmeSlideSSActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: a */
    private void m91201a() {
        C0608j supportFragmentManager = getSupportFragmentManager();
        C0633q a = supportFragmentManager.mo2645a();
        Fragment a2 = supportFragmentManager.mo2644a("user_favorites_fragment_tag");
        if (a2 == null) {
            a2 = new UserFavoritesFragment();
        }
        a2.setUserVisibleHint(true);
        a.mo2600b(R.id.a19, a2, "user_favorites_fragment_tag");
        a.mo2604c();
    }

    public void setStatusBarColor() {
        if (C6399b.m19946v()) {
            ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a03).init();
        } else if (!C7212bb.m22494a((Activity) this)) {
            ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a3z).init();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onCreate", true);
        super.onCreate(bundle);
        requestDisableOptimizeViewHierarchy();
        setContentView((int) R.layout.f7);
        m91201a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m91202a(Context context, Bundle bundle) {
        Intent intent = new Intent(context, UserFavoritesActivity.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }
}
