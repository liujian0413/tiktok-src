package com.p280ss.android.ugc.aweme.commercialize.views.cards;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction_LifecycleAdapter */
public class AbsHalfWebPageAction_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final AbsHalfWebPageAction f67272a;

    AbsHalfWebPageAction_LifecycleAdapter(AbsHalfWebPageAction absHalfWebPageAction) {
        this.f67272a = absHalfWebPageAction;
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
                    this.f67272a.onCreate();
                }
            } else if (event == Event.ON_RESUME) {
                if (!z2 || nVar.mo124a("onResume", 1)) {
                    this.f67272a.onResume();
                }
            } else if (event == Event.ON_DESTROY) {
                if (!z2 || nVar.mo124a("onDestroy", 1)) {
                    this.f67272a.onDestroy();
                }
            }
        }
    }
}
