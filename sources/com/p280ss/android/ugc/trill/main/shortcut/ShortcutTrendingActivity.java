package com.p280ss.android.ugc.trill.main.shortcut;

import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.main.MainActivity;

/* renamed from: com.ss.android.ugc.trill.main.shortcut.ShortcutTrendingActivity */
public class ShortcutTrendingActivity extends MainActivity {
    boolean isFirstOpenFlag = true;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutTrendingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    private void jumpProxy() {
        if (this.isFirstOpenFlag) {
            this.isFirstOpenFlag = false;
            this.mDataCenter.mo60134a("proformToTab", (Object) "DISCOVER");
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutTrendingActivity", "onResume", true);
        super.onResume();
        jumpProxy();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutTrendingActivity", "onResume", false);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutTrendingActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutTrendingActivity", "onCreate", false);
    }
}
