package com.p280ss.android.ugc.aweme.poi.enterprise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.enterprise.UploadBusinessLicenseActivity */
public final class UploadBusinessLicenseActivity extends AmeSlideSSActivity {

    /* renamed from: b */
    public static final C35077a f91736b = new C35077a(null);

    /* renamed from: com.ss.android.ugc.aweme.poi.enterprise.UploadBusinessLicenseActivity$a */
    public static final class C35077a {
        private C35077a() {
        }

        public /* synthetic */ C35077a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m113206a(Activity activity, Bundle bundle) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(bundle, "bundle");
            Intent intent = new Intent(activity, UploadBusinessLicenseActivity.class);
            intent.putExtras(bundle);
            activity.startActivityForResult(intent, PreloadTask.BYTE_UNIT_NUMBER);
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.enterprise.UploadBusinessLicenseActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.enterprise.UploadBusinessLicenseActivity", "onCreate", false);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.enterprise.UploadBusinessLicenseActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.enterprise.UploadBusinessLicenseActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.enterprise.UploadBusinessLicenseActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }
}
