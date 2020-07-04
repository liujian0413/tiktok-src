package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class bdz implements bee {

    /* renamed from: a */
    private final /* synthetic */ Activity f41748a;

    bdz(bdw bdw, Activity activity) {
        this.f41748a = activity;
    }

    /* renamed from: a */
    public final void mo40548a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f41748a);
    }
}
