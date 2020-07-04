package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class bdw implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application f41742a;

    /* renamed from: b */
    private final WeakReference<ActivityLifecycleCallbacks> f41743b;

    /* renamed from: c */
    private boolean f41744c;

    public bdw(Application application, ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f41743b = new WeakReference<>(activityLifecycleCallbacks);
        this.f41742a = application;
    }

    /* renamed from: a */
    private final void m48516a(bee bee) {
        try {
            ActivityLifecycleCallbacks activityLifecycleCallbacks = (ActivityLifecycleCallbacks) this.f41743b.get();
            if (activityLifecycleCallbacks != null) {
                bee.mo40548a(activityLifecycleCallbacks);
                return;
            }
            if (!this.f41744c) {
                this.f41742a.unregisterActivityLifecycleCallbacks(this);
                this.f41744c = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m48516a(new bdx(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        m48516a(new bdy(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        m48516a(new bdz(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        m48516a(new bea(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        m48516a(new beb(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m48516a(new bec(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        m48516a(new bed(this, activity));
    }
}
