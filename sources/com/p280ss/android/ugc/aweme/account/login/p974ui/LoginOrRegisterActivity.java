package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.main.p1385g.C33016c;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity */
public class LoginOrRegisterActivity extends BaseLoginOrRegisterActivity {
    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo58141e() {
        this.mStatusView.setVisibility(8);
        this.mFragmentContainer.setVisibility(0);
        ((C33016c) C21671bd.m72521a(C33016c.class)).mo60008a("login");
        this.f58320l = new LoginOrRegisterFragment();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            extras.putString("enter_type", "click_login");
            this.f58320l.setArguments(extras);
        }
        mo58136a((Fragment) this.f58320l);
    }
}
