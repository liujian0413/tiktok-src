package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class buh implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application f43619a;

    /* renamed from: b */
    private final WeakReference<ActivityLifecycleCallbacks> f43620b;

    /* renamed from: c */
    private boolean f43621c;

    public buh(Application application, ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f43620b = new WeakReference<>(activityLifecycleCallbacks);
        this.f43619a = application;
    }

    /* renamed from: a */
    private final void m50103a(bup bup) {
        try {
            ActivityLifecycleCallbacks activityLifecycleCallbacks = (ActivityLifecycleCallbacks) this.f43620b.get();
            if (activityLifecycleCallbacks != null) {
                bup.mo41345a(activityLifecycleCallbacks);
                return;
            }
            if (!this.f43621c) {
                this.f43619a.unregisterActivityLifecycleCallbacks(this);
                this.f43621c = true;
            }
        } catch (Exception e) {
            acd.m45778b("Error while dispatching lifecycle callback.", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m50103a(new bui(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        m50103a(new buj(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        m50103a(new buk(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        m50103a(new bul(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        m50103a(new bum(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m50103a(new bun(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        m50103a(new buo(this, activity));
    }
}
