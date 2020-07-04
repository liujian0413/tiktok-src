package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.CreateChallengeActivity */
public class CreateChallengeActivity extends AmeSSActivity {

    /* renamed from: a */
    private CreateChallengeDialogFragment f62557a;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.CreateChallengeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.CreateChallengeActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.CreateChallengeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    private void m77798a() {
        C0608j supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2644a("create_challenge");
        if (a == null) {
            this.f62557a = new CreateChallengeDialogFragment();
            Bundle bundle = new Bundle(1);
            bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 1);
            this.f62557a.setArguments(bundle);
            this.f62557a.show(supportFragmentManager, "create_challenge");
            return;
        }
        if (a != null) {
            this.f62557a = (CreateChallengeDialogFragment) a;
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.CreateChallengeActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ba);
        m77798a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.CreateChallengeActivity", "onCreate", false);
    }
}
