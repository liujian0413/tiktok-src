package com.p280ss.android.ugc.aweme.profile.viewmodel;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel_LifecycleAdapter */
public class FollowViewModel_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final FollowViewModel f96516a;

    FollowViewModel_LifecycleAdapter(FollowViewModel followViewModel) {
        this.f96516a = followViewModel;
    }

    /* renamed from: a */
    public final void mo108a(C0043i iVar, Event event, boolean z, C0051n nVar) {
        boolean z2;
        if (nVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && event == Event.ON_DESTROY) {
            if (!z2 || nVar.mo124a("onDestroy", 1)) {
                this.f96516a.onDestroy();
            }
        }
    }
}
