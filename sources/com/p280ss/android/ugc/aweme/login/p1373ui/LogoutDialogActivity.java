package com.p280ss.android.ugc.aweme.login.p1373ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.login.p1373ui.C32694a.C32695a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity */
public final class LogoutDialogActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C32692a f85191a = new C32692a(null);

    /* renamed from: com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity$a */
    public static final class C32692a {
        private C32692a() {
        }

        public /* synthetic */ C32692a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m105807a(Context context) {
            C7573i.m23587b(context, "context");
            context.startActivity(new Intent(context, LogoutDialogActivity.class));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity$b */
    static final class C32693b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LogoutDialogActivity f85192a;

        C32693b(LogoutDialogActivity logoutDialogActivity) {
            this.f85192a = logoutDialogActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C6861a.m21333b().logout("expired_logout", "sdk_expired_logout");
            dialogInterface.dismiss();
            C32695a.m105810a().mo84136b();
            this.f85192a.finish();
            this.f85192a.overridePendingTransition(0, 0);
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    private final void m105806a() {
        new C10741a(this).mo25653a(getString(R.string.c5n)).mo25660b(getString(R.string.c5m)).mo25654a(getString(R.string.ap5), (OnClickListener) new C32693b(this)).mo25656a().mo25637a().setCancelable(false);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.m8);
        m105806a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onCreate", false);
    }
}
