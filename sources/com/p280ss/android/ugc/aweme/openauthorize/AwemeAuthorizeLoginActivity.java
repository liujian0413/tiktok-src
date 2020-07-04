package com.p280ss.android.ugc.aweme.openauthorize;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.facebook.ads.AdError;
import com.p280ss.android.sdk.activity.SSActivity;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity */
public class AwemeAuthorizeLoginActivity extends SSActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        Bundle bundle2 = C42914ab.m136242a().mo104634a("only_login", true).f111445a;
        ArrayList stringArrayListExtra = getIntent().getStringArrayListExtra("authorize_hide_platforms");
        if (stringArrayListExtra != null) {
            bundle2.putStringArrayList("authorize_hide_platforms", stringArrayListExtra);
        }
        String stringExtra = getIntent().getStringExtra("auth_from_app");
        if (stringExtra != null) {
            bundle2.putString("auth_from_app", stringExtra);
        }
        C32656f.m105744a((Activity) this, "authorize", "", bundle2, (C23305g) new C23305g() {
            /* renamed from: a */
            public final void mo58663a() {
                AwemeAuthorizeLoginActivity.this.setResult(-1);
                AwemeAuthorizeLoginActivity.this.finish();
            }

            /* renamed from: a */
            public final void mo58664a(Bundle bundle) {
                AwemeAuthorizeLoginActivity.this.setResult(0);
                AwemeAuthorizeLoginActivity.this.finish();
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m111938a(Activity activity, int i, ArrayList<String> arrayList) {
        Intent intent = new Intent(activity, AwemeAuthorizeLoginActivity.class);
        intent.putStringArrayListExtra("authorize_hide_platforms", arrayList);
        activity.startActivityForResult(intent, AdError.INTERNAL_ERROR_CODE);
    }
}
