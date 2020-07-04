package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22603f;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.TimeUnlockFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.session.C23468a;
import com.p280ss.android.ugc.aweme.mobile.p1400a.C33598a;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeUnlockActivity */
public class TimeUnlockActivity extends BaseLockActivity {

    /* renamed from: b */
    public static String f60192b = "UNLOCK";

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo59305a() {
        return R.layout.f6;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeUnlockActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeUnlockActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeUnlockActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeUnlockActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeUnlockActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C7212bb.m22498b(this);
    }

    public void onBackPressed() {
        if (C22603f.m74726c() != null) {
            super.onBackPressed();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo59307b() {
        View findViewById = findViewById(R.id.aoy);
        if (C6399b.m19944t()) {
            findViewById.setBackgroundColor(getResources().getColor(R.color.a6c));
        }
        this.f60185a = C33598a.m108487a(TimeUnlockFragment.class).mo85932a();
        this.f60185a.setArguments(getIntent().getExtras());
        C23468a c = C22603f.m74726c();
        if (c != null) {
            c.mo61079a((C0043i) this.f60185a);
        }
        mo59306a(this.f60185a);
    }
}
