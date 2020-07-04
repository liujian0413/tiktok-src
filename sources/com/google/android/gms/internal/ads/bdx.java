package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class bdx implements bee {

    /* renamed from: a */
    private final /* synthetic */ Activity f41745a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f41746b;

    bdx(bdw bdw, Activity activity, Bundle bundle) {
        this.f41745a = activity;
        this.f41746b = bundle;
    }

    /* renamed from: a */
    public final void mo40548a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f41745a, this.f41746b);
    }
}
