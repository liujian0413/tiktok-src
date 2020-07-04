package com.p280ss.android.ugc.trill.main.shortcut;

import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.p313im.C30553b;

/* renamed from: com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity */
public class ShortcutMessageActivity extends MainActivity {
    boolean isFirstOpenFlag = true;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onResume", true);
        super.onResume();
        jumpProxy();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onResume", false);
    }

    private void jumpProxy() {
        if (this.isFirstOpenFlag) {
            this.isFirstOpenFlag = false;
            if (!C6399b.m19946v() || !C21115b.m71197a().isLogin()) {
                this.mDataCenter.mo60134a("proformToTab", (Object) "NOTIFICATION");
            } else {
                C30553b.m99810g().openSessionListActivity(this);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onCreate", false);
    }
}
