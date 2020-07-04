package com.p280ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.PublishPermissionFragment;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.PublishPermissionActivity */
public class PublishPermissionActivity extends AmeActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.PublishPermissionActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.PublishPermissionActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.PublishPermissionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: a */
    public final void mo96126a(int i) {
        Intent intent = new Intent();
        intent.putExtra("extra.PERMISSION", i);
        setResult(-1, intent);
        finish();
    }

    public void onCreate(Bundle bundle) {
        boolean z = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.PublishPermissionActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.e9);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("extra.TYPE", 0);
        final int intExtra2 = intent.getIntExtra("extra.PERMISSION", 0);
        int intExtra3 = intent.getIntExtra("extra.Private.DESCRIPTION", 0);
        int intExtra4 = intent.getIntExtra("extra.Friend.DESCRIPTION", 0);
        C0608j supportFragmentManager = getSupportFragmentManager();
        if (((PublishPermissionFragment) supportFragmentManager.mo2642a((int) R.id.aoy)) == null) {
            supportFragmentManager.mo2645a().mo2585a((int) R.id.aoy, (Fragment) PublishPermissionFragment.m131363a(intExtra, intExtra2, intExtra3, intExtra4)).mo2604c();
        }
        ((NormalTitleBar) findViewById(R.id.djz)).setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                PublishPermissionActivity.this.mo96126a(intExtra2);
            }
        });
        ImmersionBar fitsSystemWindows = ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a3z).fitsSystemWindows(true);
        if (!C6399b.m19946v() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isTiktokWhite()) {
            z = false;
        }
        fitsSystemWindows.statusBarDarkFont(z).init();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.PublishPermissionActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m122668a(Activity activity, int i, int i2, int i3, int i4, int i5) {
        Intent intent = new Intent(activity, PublishPermissionActivity.class);
        intent.putExtra("extra.TYPE", i);
        intent.putExtra("extra.PERMISSION", i2);
        intent.putExtra("extra.Private.DESCRIPTION", i3);
        intent.putExtra("extra.Friend.DESCRIPTION", i4);
        activity.startActivityForResult(intent, 2);
    }

    /* renamed from: a */
    public static void m122669a(Fragment fragment, int i, int i2, int i3, int i4, int i5) {
        Intent intent = new Intent(fragment.getActivity(), PublishPermissionActivity.class);
        intent.putExtra("extra.TYPE", i);
        intent.putExtra("extra.PERMISSION", i2);
        intent.putExtra("extra.Private.DESCRIPTION", i3);
        intent.putExtra("extra.Friend.DESCRIPTION", i4);
        fragment.startActivityForResult(intent, 2);
    }
}
