package com.p280ss.android.ugc.aweme.poi.p335ui.card;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.card.PoiWebCardContainer_LifecycleAdapter */
public class PoiWebCardContainer_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final PoiWebCardContainer f92518a;

    PoiWebCardContainer_LifecycleAdapter(PoiWebCardContainer poiWebCardContainer) {
        this.f92518a = poiWebCardContainer;
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
            if (event == Event.ON_CREATE) {
                if (!z2 || nVar.mo124a("onCreate", 1)) {
                    this.f92518a.onCreate();
                }
            } else if (event == Event.ON_RESUME) {
                if (!z2 || nVar.mo124a("onResume", 1)) {
                    this.f92518a.onResume();
                }
            } else if (event == Event.ON_PAUSE) {
                if (!z2 || nVar.mo124a("onPause", 1)) {
                    this.f92518a.onPause();
                }
            } else if (event == Event.ON_DESTROY) {
                if (!z2 || nVar.mo124a("onDestroy", 1)) {
                    this.f92518a.onDestroy();
                }
            }
        }
    }
}
