package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RemindUserCompleteProfileDialog;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.RemindUserCompleteProfileActivity */
public final class RemindUserCompleteProfileActivity extends AmeSSActivity {

    /* renamed from: b */
    public static OnDismissListener f95245b;

    /* renamed from: c */
    public static final C36299a f95246c = new C36299a(null);

    /* renamed from: a */
    public RemindUserCompleteProfileDialog f95247a;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.RemindUserCompleteProfileActivity$a */
    public static final class C36299a {
        private C36299a() {
        }

        /* renamed from: a */
        public static OnDismissListener m117303a() {
            return RemindUserCompleteProfileActivity.f95245b;
        }

        public /* synthetic */ C36299a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m117304a(OnDismissListener onDismissListener) {
            RemindUserCompleteProfileActivity.f95245b = onDismissListener;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.RemindUserCompleteProfileActivity$b */
    static final class C36300b implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ RemindUserCompleteProfileActivity f95248a;

        C36300b(RemindUserCompleteProfileActivity remindUserCompleteProfileActivity) {
            this.f95248a = remindUserCompleteProfileActivity;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            OnDismissListener a = C36299a.m117303a();
            if (a != null) {
                a.onDismiss(RemindUserCompleteProfileActivity.m117302a(this.f95248a));
            }
            C36299a.m117304a(null);
            this.f95248a.finish();
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RemindUserCompleteProfileActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RemindUserCompleteProfileActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RemindUserCompleteProfileActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: a */
    public static final /* synthetic */ RemindUserCompleteProfileDialog m117302a(RemindUserCompleteProfileActivity remindUserCompleteProfileActivity) {
        RemindUserCompleteProfileDialog remindUserCompleteProfileDialog = remindUserCompleteProfileActivity.f95247a;
        if (remindUserCompleteProfileDialog == null) {
            C7573i.m23583a("mDialog");
        }
        return remindUserCompleteProfileDialog;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RemindUserCompleteProfileActivity", "onCreate", true);
        super.onCreate(bundle);
        Context context = this;
        Intent intent = getIntent();
        C7573i.m23582a((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras == null) {
            C7573i.m23580a();
        }
        this.f95247a = new RemindUserCompleteProfileDialog(context, extras);
        RemindUserCompleteProfileDialog remindUserCompleteProfileDialog = this.f95247a;
        if (remindUserCompleteProfileDialog == null) {
            C7573i.m23583a("mDialog");
        }
        remindUserCompleteProfileDialog.show();
        RemindUserCompleteProfileDialog remindUserCompleteProfileDialog2 = this.f95247a;
        if (remindUserCompleteProfileDialog2 == null) {
            C7573i.m23583a("mDialog");
        }
        remindUserCompleteProfileDialog2.setOnDismissListener(new C36300b(this));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RemindUserCompleteProfileActivity", "onCreate", false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        RemindUserCompleteProfileDialog remindUserCompleteProfileDialog = this.f95247a;
        if (remindUserCompleteProfileDialog == null) {
            C7573i.m23583a("mDialog");
        }
        remindUserCompleteProfileDialog.mo92982a(i, i2, intent);
    }
}
