package com.p280ss.android.ugc.aweme.live.alphaplayer;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.PlayerController_LifecycleAdapter */
public class PlayerController_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final PlayerController f84657a;

    PlayerController_LifecycleAdapter(PlayerController playerController) {
        this.f84657a = playerController;
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
            if (event == Event.ON_PAUSE) {
                if (!z2 || nVar.mo124a("onPause", 1)) {
                    this.f84657a.onPause();
                }
            } else if (event == Event.ON_RESUME) {
                if (!z2 || nVar.mo124a("onResume", 1)) {
                    this.f84657a.onResume();
                }
            } else if (event == Event.ON_STOP) {
                if (!z2 || nVar.mo124a("onStop", 1)) {
                    this.f84657a.onStop();
                }
            } else if (event == Event.ON_DESTROY) {
                if (!z2 || nVar.mo124a("onDestroy", 1)) {
                    this.f84657a.onDestroy();
                }
            }
        }
    }
}
