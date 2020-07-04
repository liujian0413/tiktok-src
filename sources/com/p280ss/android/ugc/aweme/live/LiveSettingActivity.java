package com.p280ss.android.ugc.aweme.live;

import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.live.LiveSettingActivity */
public class LiveSettingActivity extends BaseLiveSdkActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.cu);
        C0633q a = getSupportFragmentManager().mo2645a();
        a.mo2585a((int) R.id.aoy, C32430a.m105068e().mo22021g());
        a.mo2604c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveSettingActivity", "onCreate", false);
    }
}
