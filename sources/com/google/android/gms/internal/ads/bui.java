package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class bui implements bup {

    /* renamed from: a */
    private final /* synthetic */ Activity f43622a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f43623b;

    bui(buh buh, Activity activity, Bundle bundle) {
        this.f43622a = activity;
        this.f43623b = bundle;
    }

    /* renamed from: a */
    public final void mo41345a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f43622a, this.f43623b);
    }
}
