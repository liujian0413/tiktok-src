package com.p280ss.android.ugc.aweme.account.p982ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.login.C32656f;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity */
public final class FullScreenLoginActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C22254a f59437a = new C22254a(null);

    /* renamed from: com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity$a */
    public static final class C22254a {
        private C22254a() {
        }

        public /* synthetic */ C22254a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m73769a(Context context, String str, String str2) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(str, "enterForm");
            C7573i.m23587b(str2, "enterMethod");
            Intent intent = new Intent(context, FullScreenLoginActivity.class);
            intent.putExtra("enter_method", str2);
            intent.putExtra("enter_from", str);
            context.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity$b */
    public static final class C22255b implements C23305g {

        /* renamed from: a */
        final /* synthetic */ FullScreenLoginActivity f59438a;

        /* renamed from: a */
        public final void mo58663a() {
            this.f59438a.finish();
            this.f59438a.overridePendingTransition(0, 0);
        }

        C22255b(FullScreenLoginActivity fullScreenLoginActivity) {
            this.f59438a = fullScreenLoginActivity;
        }

        /* renamed from: a */
        public final void mo58664a(Bundle bundle) {
            this.f59438a.finish();
            this.f59438a.overridePendingTransition(0, 0);
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        C32656f.m105744a((Activity) this, getIntent().getStringExtra("enter_from"), getIntent().getStringExtra("enter_method"), (Bundle) null, (C23305g) new C22255b(this));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.FullScreenLoginActivity", "onCreate", false);
    }
}
