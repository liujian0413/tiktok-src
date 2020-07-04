package com.p280ss.android.ugc.aweme.account.ftc.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.account.ftc.fragment.OperatorCompleteFragment;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.ftc.activity.OperatorCompleteActivity */
public final class OperatorCompleteActivity extends AmeActivity {
    public final void onBackPressed() {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ftc.activity.OperatorCompleteActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ftc.activity.OperatorCompleteActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ftc.activity.OperatorCompleteActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ftc.activity.OperatorCompleteActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ai);
        C0633q a = getSupportFragmentManager().mo2645a();
        C7573i.m23582a((Object) a, "supportFragmentManager.beginTransaction()");
        OperatorCompleteFragment operatorCompleteFragment = new OperatorCompleteFragment();
        Intent intent = getIntent();
        C7573i.m23582a((Object) intent, "intent");
        operatorCompleteFragment.setArguments(intent.getExtras());
        a.mo2585a((int) R.id.aoy, (Fragment) operatorCompleteFragment);
        a.mo2604c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ftc.activity.OperatorCompleteActivity", "onCreate", false);
    }
}
