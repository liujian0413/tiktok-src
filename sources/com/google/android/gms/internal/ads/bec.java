package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class bec implements bee {

    /* renamed from: a */
    private final /* synthetic */ Activity f41751a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f41752b;

    bec(bdw bdw, Activity activity, Bundle bundle) {
        this.f41751a = activity;
        this.f41752b = bundle;
    }

    /* renamed from: a */
    public final void mo40548a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f41751a, this.f41752b);
    }
}
