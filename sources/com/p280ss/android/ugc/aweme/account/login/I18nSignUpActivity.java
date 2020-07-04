package com.p280ss.android.ugc.aweme.account.login;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity */
public final class I18nSignUpActivity extends I18nSignUpLoginPageActivity {

    /* renamed from: g */
    private HashMap f57099g;

    /* renamed from: b */
    public final View mo57181b(int i) {
        if (this.f57099g == null) {
            this.f57099g = new HashMap();
        }
        View view = (View) this.f57099g.get(Integer.valueOf(R.id.cwi));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.cwi);
        this.f57099g.put(Integer.valueOf(R.id.cwi), findViewById);
        return findViewById;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onCreate", false);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }
}
