package com.p280ss.android.ugc.trill.main.shortcut;

import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;

/* renamed from: com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity */
public class ShortcutShootingActivity extends AmeActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onCreate", true);
        super.onCreate(bundle);
        getIntent().setClass(this, ((IAVService) ServiceManager.get().getService(IAVService.class)).getRecordPermissionActivity());
        startActivity(getIntent());
        finish();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onCreate", false);
    }
}
