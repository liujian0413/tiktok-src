package com.p280ss.android.ugc.aweme.account.login.digitsverify;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.account.base.MusAbsActivity;
import com.p280ss.android.ugc.aweme.account.login.digitsverify.p958a.C21362a;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a.C21172b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.digitsverify.DigitsVerifyActivity */
public class DigitsVerifyActivity extends MusAbsActivity implements OnClickListener, C21172b, C21362a {
    public boolean isRegisterEventBus() {
        return false;
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.digitsverify.DigitsVerifyActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.digitsverify.DigitsVerifyActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.digitsverify.DigitsVerifyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        C21170a.m71341b(this);
    }

    /* renamed from: a_ */
    public final void mo57096a_(int i) {
        if (i == 2) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.digitsverify.DigitsVerifyActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ae4);
        C21170a.m71339a((C21172b) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.digitsverify.DigitsVerifyActivity", "onCreate", false);
    }
}
