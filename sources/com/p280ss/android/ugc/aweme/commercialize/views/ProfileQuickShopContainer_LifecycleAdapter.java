package com.p280ss.android.ugc.aweme.commercialize.views;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer_LifecycleAdapter */
public class ProfileQuickShopContainer_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final ProfileQuickShopContainer f67159a;

    ProfileQuickShopContainer_LifecycleAdapter(ProfileQuickShopContainer profileQuickShopContainer) {
        this.f67159a = profileQuickShopContainer;
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
                    this.f67159a.onCreate();
                }
            } else if (event == Event.ON_DESTROY) {
                if (!z2 || nVar.mo124a("onDestroy", 1)) {
                    this.f67159a.onDestroy();
                }
            }
        }
    }
}
