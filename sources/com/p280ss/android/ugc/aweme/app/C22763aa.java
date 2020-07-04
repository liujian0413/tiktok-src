package com.p280ss.android.ugc.aweme.app;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.app.aa */
public final class C22763aa {

    /* renamed from: a */
    public static final C22765b f60451a = new C22765b(null);

    /* renamed from: com.ss.android.ugc.aweme.app.aa$a */
    public static final class C22764a implements ActivityLifecycleCallbacks {

        /* renamed from: a */
        private int f60452a;

        /* renamed from: b */
        private final String f60453b;

        /* renamed from: c */
        private final String f60454c;

        public final void onActivityDestroyed(Activity activity) {
        }

        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
        }

        public final void onActivityStopped(Activity activity) {
        }

        public C22764a(String str, String str2) {
            C7573i.m23587b(str, "className");
            C7573i.m23587b(str2, "toast");
            this.f60453b = str;
            this.f60454c = str2;
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity == null || !TextUtils.equals(activity.getClass().getName(), this.f60453b)) {
                this.f60452a++;
                if (this.f60452a > 5) {
                    AwemeApplication.f19514b.unregisterActivityLifecycleCallbacks(this);
                }
                return;
            }
            C10761a.m31404c(C6399b.m19921a(), this.f60454c, 1).mo25750a();
            AwemeApplication.f19514b.unregisterActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.aa$b */
    public static final class C22765b {
        private C22765b() {
        }

        public /* synthetic */ C22765b(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m75144a(String str, String str2) {
            C7573i.m23587b(str, "className");
            C7573i.m23587b(str2, "toast");
            AwemeApplication.f19514b.registerActivityLifecycleCallbacks(new C22764a(str, str2));
        }
    }
}
