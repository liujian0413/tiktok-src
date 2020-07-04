package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class bul implements bup {

    /* renamed from: a */
    private final /* synthetic */ Activity f43626a;

    bul(buh buh, Activity activity) {
        this.f43626a = activity;
    }

    /* renamed from: a */
    public final void mo41345a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f43626a);
    }
}
