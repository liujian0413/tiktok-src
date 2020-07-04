package com.p280ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.sdk.activity.SSActivity;
import com.p280ss.android.ugc.aweme.IAccountService.C21080d;
import com.p280ss.android.ugc.aweme.IAccountService.C21082f;
import com.p280ss.android.ugc.aweme.IAccountService.C21083g;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p1020a.C22757f;
import com.p280ss.android.ugc.aweme.app.p1020a.C22761j;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.login.C32657g;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.app.PushLoginActivity */
public class PushLoginActivity extends SSActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        final Bundle bundle2;
        final Intent intent;
        final String str;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        final Intent intent2 = (Intent) getIntent().getParcelableExtra("next_step");
        final ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("next_steps");
        Intent intent3 = getIntent();
        if (intent3 != null) {
            bundle2 = intent3.getBundleExtra("multi_account");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            intent = (Intent) bundle2.getParcelable("push_intent");
        } else {
            intent = null;
        }
        if (intent3 != null) {
            str = intent3.getStringExtra("multi_account_push_uid");
        } else {
            str = null;
        }
        final Intent intent4 = new Intent(this, MainActivity.class);
        C226861 r3 = new C23305g() {
            /* renamed from: a */
            public final void mo58663a() {
                if (bundle2 == null || TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(str) || str.equals(C6861a.m21337f().getCurUserId())) {
                        if (intent2 != null) {
                            PushLoginActivity.this.startActivity(intent2);
                        } else if (parcelableArrayListExtra != null && parcelableArrayListExtra.size() > 1) {
                            PushLoginActivity.this.startActivities((Intent[]) parcelableArrayListExtra.toArray(new Intent[parcelableArrayListExtra.size()]));
                        }
                    }
                    PushLoginActivity.this.finish();
                    return;
                }
                if (TextUtils.equals(str, C6861a.m21337f().getCurUserId())) {
                    bundle2.putBoolean("login_jump", true);
                    bundle2.putParcelable("push_intent", intent);
                    C32657g.m105756b(bundle2);
                } else {
                    PushLoginActivity.this.startActivity(intent4);
                }
                PushLoginActivity.this.finish();
            }

            /* renamed from: a */
            public final void mo58664a(Bundle bundle) {
                PushLoginActivity.this.finish();
            }
        };
        Bundle bundle3 = new Bundle();
        if (C6399b.m19944t() && C6861a.m21337f().isLogin()) {
            bundle3.putBoolean("force_use_default_login_method", true);
            bundle3.putBoolean("need_auto_fill_latest_login_info", false);
        }
        C6861a.m21333b().showLoginAndRegisterView(new C21080d().mo56860a((Activity) this).mo56864a("push").mo56866b("push").mo56865a(true).mo56861a(bundle3).mo56862a((C21082f) new C22757f()).mo56863a((C21083g) new C22761j(r3)).mo56859a());
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onCreate", false);
    }
}
