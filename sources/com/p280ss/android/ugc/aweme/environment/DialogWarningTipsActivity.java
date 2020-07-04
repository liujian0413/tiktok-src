package com.p280ss.android.ugc.aweme.environment;

import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.environment.DialogWarningTipsActivity */
public class DialogWarningTipsActivity extends AmeSSActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.environment.DialogWarningTipsActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.environment.DialogWarningTipsActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.environment.DialogWarningTipsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.environment.DialogWarningTipsActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.m8);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.environment.DialogWarningTipsActivity", "onCreate", false);
    }
}
