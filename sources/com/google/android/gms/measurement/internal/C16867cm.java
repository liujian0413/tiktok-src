package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.cm */
final class C16867cm implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final /* synthetic */ C16858cd f47157a;

    private C16867cm(C16858cd cdVar) {
        this.f47157a = cdVar;
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f47157a.mo43585q().f47495i.mo44160a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null && data.isHierarchical()) {
                    if (bundle == null) {
                        Bundle a = this.f47157a.mo43583o().mo43896a(data);
                        this.f47157a.mo43583o();
                        String str = C16922em.m55961a(intent) ? "gs" : "auto";
                        if (a != null) {
                            this.f47157a.mo43731a(str, "_cmp", a);
                        }
                    }
                    String queryParameter = data.getQueryParameter("referrer");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        if (!(queryParameter.contains("gclid") && (queryParameter.contains("utm_campaign") || queryParameter.contains("utm_source") || queryParameter.contains("utm_medium") || queryParameter.contains("utm_term") || queryParameter.contains("utm_content")))) {
                            this.f47157a.mo43585q().f47494h.mo44160a("Activity created with data 'referrer' param without gclid and at least one utm field");
                            return;
                        }
                        this.f47157a.mo43585q().f47494h.mo44161a("Activity created with referrer", queryParameter);
                        if (!TextUtils.isEmpty(queryParameter)) {
                            this.f47157a.mo43734a("auto", "_ldl", (Object) queryParameter, true);
                        }
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            this.f47157a.mo43585q().f47487a.mo44161a("Throwable caught in onActivityCreated", e);
        }
        this.f47157a.mo43576h().mo43763a(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f47157a.mo43576h().mo43768c(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f47157a.mo43576h().mo43766b(activity);
        C16900ds j = this.f47157a.mo43578j();
        j.mo43584p().mo43645a((Runnable) new C16905dx(j, j.mo43580l().mo38685b()));
    }

    public final void onActivityResumed(Activity activity) {
        this.f47157a.mo43576h().mo43762a(activity);
        C16900ds j = this.f47157a.mo43578j();
        j.mo43584p().mo43645a((Runnable) new C16904dw(j, j.mo43580l().mo38685b()));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f47157a.mo43576h().mo43767b(activity, bundle);
    }

    /* synthetic */ C16867cm(C16858cd cdVar, C16859ce ceVar) {
        this(cdVar);
    }
}
