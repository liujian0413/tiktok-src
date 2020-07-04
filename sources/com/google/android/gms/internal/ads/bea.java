package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class bea implements bee {

    /* renamed from: a */
    private final /* synthetic */ Activity f41749a;

    bea(bdw bdw, Activity activity) {
        this.f41749a = activity;
    }

    /* renamed from: a */
    public final void mo40548a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f41749a);
    }
}
