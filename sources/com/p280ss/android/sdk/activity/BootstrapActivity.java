package com.p280ss.android.sdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.common.util.C6776h;

/* renamed from: com.ss.android.sdk.activity.BootstrapActivity */
public class BootstrapActivity extends Activity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onCreate", true);
        super.onCreate(bundle);
        Intent a = C6776h.m20941a((Context) this, getPackageName());
        finish();
        if (a != null) {
            startActivity(a);
        }
        ActivityInstrumentation.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onCreate", false);
    }
}
