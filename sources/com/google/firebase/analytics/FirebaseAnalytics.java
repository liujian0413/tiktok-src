package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.measurement.internal.C16825ay;
import com.google.android.gms.measurement.internal.C16928es;
import com.google.android.gms.measurement.internal.C16948m;
import com.google.firebase.iid.FirebaseInstanceId;

public final class FirebaseAnalytics {

    /* renamed from: a */
    private static volatile FirebaseAnalytics f49646a;

    /* renamed from: b */
    private final C16825ay f49647b;

    /* renamed from: c */
    private final Object f49648c = new Object();

    public static FirebaseAnalytics getInstance(Context context) {
        if (f49646a == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f49646a == null) {
                    f49646a = new FirebaseAnalytics(C16825ay.m55497a(context, (C16948m) null));
                }
            }
        }
        return f49646a;
    }

    /* renamed from: a */
    public final void mo47131a(String str, Bundle bundle) {
        this.f49647b.f47011g.mo43502a(str, bundle);
    }

    public final void setCurrentScreen(Activity activity, String str, String str2) {
        if (!C16928es.m56086a()) {
            this.f49647b.mo43585q().f47490d.mo44160a("setCurrentScreen must be called from the main thread");
        } else {
            this.f49647b.mo43666j().mo43764a(activity, str, str2);
        }
    }

    /* renamed from: a */
    public final void mo47130a(String str) {
        this.f49647b.f47011g.mo43503a("app", "_id", str);
    }

    private FirebaseAnalytics(C16825ay ayVar) {
        C15267r.m44384a(ayVar);
        this.f49647b = ayVar;
    }

    public final String getFirebaseInstanceId() {
        return FirebaseInstanceId.m60321a().mo47187b();
    }
}
