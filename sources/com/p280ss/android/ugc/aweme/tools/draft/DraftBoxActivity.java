package com.p280ss.android.ugc.aweme.tools.draft;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity */
public class DraftBoxActivity extends AmeSSActivity {

    /* renamed from: a */
    private DraftBoxFragment f109997a;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onBackPressed() {
        if (this.f109997a != null) {
            this.f109997a.mo103747i();
        } else {
            super.onBackPressed();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: a */
    private void m134447a() {
        this.f109997a = (DraftBoxFragment) getSupportFragmentManager().mo2642a((int) R.id.aoy);
        if (this.f109997a == null) {
            this.f109997a = new DraftBoxFragment();
            if (getIntent() != null) {
                this.f109997a.setArguments(getIntent().getExtras());
            }
            getSupportFragmentManager().mo2645a().mo2585a((int) R.id.aoy, (Fragment) this.f109997a).mo2606d();
        }
    }

    /* renamed from: a */
    public static void m134448a(Context context) {
        if (context != null) {
            context.startActivity(new Intent(context, DraftBoxActivity.class));
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.dk);
        if (C35563c.f93224F.mo70088c().mo90360c(this) == 0) {
            m134447a();
        } else {
            C35563c.f93224F.mo70088c().mo90356a(this, new C42290g(this), "android.permission.WRITE_EXTERNAL_STORAGE");
        }
        ImmersionBar fitsSystemWindows = ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a3z).fitsSystemWindows(true);
        if (!C6399b.m19946v() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isTiktokWhite()) {
            z = false;
        }
        fitsSystemWindows.statusBarDarkFont(z).init();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m134449a(Context context, Bundle bundle) {
        if (context != null) {
            Intent intent = new Intent(context, DraftBoxActivity.class);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            context.startActivity(intent);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo103736a(String[] strArr, int[] iArr) {
        if (strArr == null || iArr == null || strArr.length == 0 || iArr.length == 0) {
            C10761a.m31399c((Context) this, (int) R.string.aw3).mo25750a();
            finish();
        } else if (iArr[0] == 0) {
            m134447a();
        } else {
            C10761a.m31399c((Context) this, (int) R.string.aw3).mo25750a();
            finish();
        }
    }
}
