package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class bed implements bee {

    /* renamed from: a */
    private final /* synthetic */ Activity f41753a;

    bed(bdw bdw, Activity activity) {
        this.f41753a = activity;
    }

    /* renamed from: a */
    public final void mo40548a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f41753a);
    }
}
