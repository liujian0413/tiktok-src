package com.twitter.sdk.android.core.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.twitter.sdk.android.core.internal.a */
public final class C46849a {

    /* renamed from: a */
    private final C46850a f120157a;

    /* renamed from: com.twitter.sdk.android.core.internal.a$a */
    static class C46850a {

        /* renamed from: a */
        private final Set<ActivityLifecycleCallbacks> f120158a = new HashSet();

        /* renamed from: b */
        private final Application f120159b;

        C46850a(Application application) {
            this.f120159b = application;
        }

        /* renamed from: a */
        public final boolean mo117950a(final C46852b bVar) {
            if (this.f120159b == null) {
                return false;
            }
            C468511 r0 = new ActivityLifecycleCallbacks() {
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                }

                public final void onActivityDestroyed(Activity activity) {
                }

                public final void onActivityPaused(Activity activity) {
                }

                public final void onActivityResumed(Activity activity) {
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public final void onActivityStopped(Activity activity) {
                }

                public final void onActivityStarted(Activity activity) {
                    bVar.mo117958a(activity);
                }
            };
            this.f120159b.registerActivityLifecycleCallbacks(r0);
            this.f120158a.add(r0);
            return true;
        }
    }

    /* renamed from: com.twitter.sdk.android.core.internal.a$b */
    public static abstract class C46852b {
        /* renamed from: a */
        public void mo117958a(Activity activity) {
        }
    }

    /* renamed from: a */
    public final boolean mo117949a(C46852b bVar) {
        if (this.f120157a == null || !this.f120157a.mo117950a(bVar)) {
            return false;
        }
        return true;
    }

    public C46849a(Context context) {
        this.f120157a = new C46850a((Application) context.getApplicationContext());
    }
}
