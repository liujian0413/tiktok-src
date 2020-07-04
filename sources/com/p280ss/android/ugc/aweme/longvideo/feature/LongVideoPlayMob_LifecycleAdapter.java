package com.p280ss.android.ugc.aweme.longvideo.feature;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.longvideo.feature.LongVideoPlayMob_LifecycleAdapter */
public class LongVideoPlayMob_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final LongVideoPlayMob f85337a;

    LongVideoPlayMob_LifecycleAdapter(LongVideoPlayMob longVideoPlayMob) {
        this.f85337a = longVideoPlayMob;
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
                    this.f85337a.onResume();
                }
            } else if (event == Event.ON_PAUSE) {
                if (!z2 || nVar.mo124a("onPause", 1)) {
                    this.f85337a.onPause();
                }
            }
        }
    }
}
