package com.p280ss.android.ugc.aweme.account.p982ui;

import android.arch.lifecycle.C0052o;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.account.login.sms.C21590e;

/* renamed from: com.ss.android.ugc.aweme.account.ui.BindMobileActivity */
public class BindMobileActivity extends BaseBindMobileActivity {

    /* renamed from: q */
    private C21590e f59405q;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindMobileActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindMobileActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindMobileActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: e */
    public final C0052o<String> mo58141e() {
        if (this.f59405q != null) {
            return this.f59405q.f57961a;
        }
        return null;
    }

    public void finish() {
        super.finish();
        if (this.f59405q != null) {
            this.f59405q.mo57783c();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindMobileActivity", "onCreate", true);
        this.f59405q = new C21590e(this);
        this.f59405q.mo57782b();
        this.f59405q.mo57780a();
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindMobileActivity", "onCreate", false);
    }
}
