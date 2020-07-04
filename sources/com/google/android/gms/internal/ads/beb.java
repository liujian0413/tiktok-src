package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class beb implements bee {

    /* renamed from: a */
    private final /* synthetic */ Activity f41750a;

    beb(bdw bdw, Activity activity) {
        this.f41750a = activity;
    }

    /* renamed from: a */
    public final void mo40548a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f41750a);
    }
}
