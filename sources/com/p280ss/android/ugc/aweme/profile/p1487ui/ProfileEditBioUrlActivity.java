package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileEditBioUrlFragment.C36229a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlActivity */
public final class ProfileEditBioUrlActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C36228a f95032a = new C36228a(null);

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlActivity$a */
    public static final class C36228a {
        private C36228a() {
        }

        public /* synthetic */ C36228a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m117098a(Context context, String str) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(str, "bioUrl");
            Intent intent = new Intent(context, ProfileEditBioUrlActivity.class);
            intent.putExtra("bio_url", str);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static final void m117097a(Context context, String str) {
        C36228a.m117098a(context, str);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public final void setStatusBarColor() {
        if (C6399b.m19944t()) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).setCustomStatusBarInLayout(this);
        } else {
            C10994a.m32208b(this);
        }
    }

    /* renamed from: a */
    private final void m117096a() {
        String stringExtra = getIntent().getStringExtra("bio_url");
        if (stringExtra == null) {
            stringExtra = "";
        }
        ProfileEditBioUrlFragment a = C36229a.m117114a(stringExtra, true, "", 0, true);
        a.setUserVisibleHint(true);
        C0608j supportFragmentManager = getSupportFragmentManager();
        C7573i.m23582a((Object) supportFragmentManager, "supportFragmentManager");
        a.show(supportFragmentManager, "EditBioUrl");
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ai);
        m117096a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlActivity", "onCreate", false);
    }
}
