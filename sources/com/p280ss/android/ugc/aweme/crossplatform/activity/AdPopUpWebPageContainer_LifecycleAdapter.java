package com.p280ss.android.ugc.aweme.crossplatform.activity;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.AdPopUpWebPageContainer_LifecycleAdapter */
public class AdPopUpWebPageContainer_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final AdPopUpWebPageContainer f68244a;

    AdPopUpWebPageContainer_LifecycleAdapter(AdPopUpWebPageContainer adPopUpWebPageContainer) {
        this.f68244a = adPopUpWebPageContainer;
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
                    this.f68244a.onResume();
                }
            } else if (event == Event.ON_PAUSE) {
                if (!z2 || nVar.mo124a("onPause", 1)) {
                    this.f68244a.onPause();
                }
            } else if (event == Event.ON_DESTROY) {
                if (!z2 || nVar.mo124a("onDestroy", 1)) {
                    this.f68244a.onDestroy();
                }
            }
        }
    }
}
