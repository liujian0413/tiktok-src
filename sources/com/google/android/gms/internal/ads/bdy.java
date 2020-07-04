package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class bdy implements bee {

    /* renamed from: a */
    private final /* synthetic */ Activity f41747a;

    bdy(bdw bdw, Activity activity) {
        this.f41747a = activity;
    }

    /* renamed from: a */
    public final void mo40548a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f41747a);
    }
}
