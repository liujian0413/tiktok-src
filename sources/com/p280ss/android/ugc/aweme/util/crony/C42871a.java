package com.p280ss.android.ugc.aweme.util.crony;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.IntentFilter;
import android.os.Bundle;

/* renamed from: com.ss.android.ugc.aweme.util.crony.a */
public final class C42871a {

    /* renamed from: a */
    static Application f111370a;

    /* renamed from: b */
    static String f111371b;

    /* renamed from: c */
    static C42874c f111372c;

    /* renamed from: b */
    private static void m136142b() {
        f111370a.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            public final void onActivityDestroyed(Activity activity) {
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityStarted(Activity activity) {
            }

            public final void onActivityStopped(Activity activity) {
            }

            public final void onActivityPaused(Activity activity) {
                C42871a.f111371b = null;
            }

            public final void onActivityResumed(Activity activity) {
                C42871a.f111371b = activity.getClass().getCanonicalName();
            }
        });
    }

    /* renamed from: a */
    private static void m136139a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ss.android.ugc.aweme.util.crony.action_clipboard");
        intentFilter.addAction("com.ss.android.ugc.aweme.util.crony.action_clipboard_put");
        intentFilter.addAction("com.ss.android.ugc.aweme.util.crony.action_activity");
        intentFilter.addAction("com.ss.android.ugc.aweme.util.crony.action_info");
        f111370a.registerReceiver(new CronyReceiver(), intentFilter);
    }

    /* renamed from: a */
    public static void m136141a(C42874c cVar) {
        f111372c = cVar;
    }

    /* renamed from: a */
    public static void m136140a(Application application) {
        f111370a = application;
        m136139a();
        m136142b();
    }
}
