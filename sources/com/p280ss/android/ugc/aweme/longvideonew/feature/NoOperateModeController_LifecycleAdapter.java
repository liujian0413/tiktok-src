package com.p280ss.android.ugc.aweme.longvideonew.feature;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController_LifecycleAdapter */
public class NoOperateModeController_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final NoOperateModeController f85521a;

    NoOperateModeController_LifecycleAdapter(NoOperateModeController noOperateModeController) {
        this.f85521a = noOperateModeController;
    }

    /* renamed from: a */
    public final void mo108a(C0043i iVar, Event event, boolean z, C0051n nVar) {
        boolean z2;
        if (nVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z) {
            if (event == Event.ON_RESUME) {
                if (!z2 || nVar.mo124a("onResume", 1)) {
                    this.f85521a.onResume();
                }
            } else if (event == Event.ON_PAUSE) {
                if (!z2 || nVar.mo124a("onPause", 1)) {
                    this.f85521a.onPause();
                }
            } else if (event == Event.ON_DESTROY) {
                if (!z2 || nVar.mo124a("onDestroy", 1)) {
                    this.f85521a.onDestroy();
                }
            }
        }
    }
}