package com.google.android.gms.tagmanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: com.google.android.gms.tagmanager.be */
final class C17014be implements ComponentCallbacks2 {

    /* renamed from: a */
    private final /* synthetic */ C17028d f47656a;

    C17014be(C17028d dVar) {
        this.f47656a = dVar;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20) {
            this.f47656a.mo44258a();
        }
    }
}
