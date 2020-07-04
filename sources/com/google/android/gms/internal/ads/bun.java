package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class bun implements bup {

    /* renamed from: a */
    private final /* synthetic */ Activity f43628a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f43629b;

    bun(buh buh, Activity activity, Bundle bundle) {
        this.f43628a = activity;
        this.f43629b = bundle;
    }

    /* renamed from: a */
    public final void mo41345a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f43628a, this.f43629b);
    }
}
