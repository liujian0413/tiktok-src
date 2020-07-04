package com.p280ss.android.ugc.aweme.main.follow;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.main.follow.LiveBroadcastWarn_LifecycleAdapter */
public class LiveBroadcastWarn_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final LiveBroadcastWarn f85997a;

    LiveBroadcastWarn_LifecycleAdapter(LiveBroadcastWarn liveBroadcastWarn) {
        this.f85997a = liveBroadcastWarn;
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
            if (event == Event.ON_STOP) {
                if (!z2 || nVar.mo124a("onStop", 1)) {
                    this.f85997a.onStop();
                }
            } else if (event == Event.ON_DESTROY) {
                if (!z2 || nVar.mo124a("onDestroy", 1)) {
                    this.f85997a.onDestroy();
                }
            }
        }
    }
}
