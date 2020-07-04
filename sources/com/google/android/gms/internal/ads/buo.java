package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class buo implements bup {

    /* renamed from: a */
    private final /* synthetic */ Activity f43630a;

    buo(buh buh, Activity activity) {
        this.f43630a = activity;
    }

    /* renamed from: a */
    public final void mo41345a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f43630a);
    }
}
