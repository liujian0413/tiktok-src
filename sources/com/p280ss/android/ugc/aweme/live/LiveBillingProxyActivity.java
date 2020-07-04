package com.p280ss.android.ugc.aweme.live;

import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.livesdkapi.C9469i;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.android.livesdkapi.service.C9515c;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.live.LiveBillingProxyActivity */
public class LiveBillingProxyActivity extends BaseLiveSdkActivity {

    /* renamed from: a */
    private LiveActivityProxy f84547a;

    /* renamed from: b */
    private C9515c f84548b;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBillingProxyActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBillingProxyActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBillingProxyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBillingProxyActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f84548b = C9469i.m27992d();
        if (this.f84548b != null) {
            this.f84547a = this.f84548b.mo22003a((FragmentActivity) this, 21);
            getLifecycle().mo55a(this.f84547a);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBillingProxyActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f84547a.mo11023a(i, i2, intent);
        finish();
    }
}
