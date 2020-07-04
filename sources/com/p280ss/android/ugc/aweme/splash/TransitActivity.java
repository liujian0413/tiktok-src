package com.p280ss.android.ugc.aweme.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.splash.TransitActivity */
public class TransitActivity extends AbsActivity {
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo102519a() {
        finish();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.TransitActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo102520b() {
        startActivity(m132926c());
        overridePendingTransition(0, 0);
    }

    public void onPause() {
        super.onPause();
        new Handler().postDelayed(new C41755q(this), 500);
    }

    /* renamed from: c */
    private Intent m132926c() {
        Intent intent = getIntent();
        if (intent != null) {
            intent.setExtrasClassLoader(TransitActivity.class.getClassLoader());
            Intent intent2 = (Intent) intent.getParcelableExtra("main");
            if (intent2 != null) {
                intent2.setExtrasClassLoader(TransitActivity.class.getClassLoader());
                return intent2;
            }
        }
        return new Intent(this, MainActivity.class);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.TransitActivity", "onResume", true);
        super.onResume();
        new Handler().postDelayed(new C41754p(this), 50);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.TransitActivity", "onResume", false);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.TransitActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.f4);
        ((DmtLoadingLayout) findViewById(R.id.bu9)).setUseScreenHeight(getResources().getDimensionPixelSize(R.dimen.ml));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.TransitActivity", "onCreate", false);
    }
}
