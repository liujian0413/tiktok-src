package com.p280ss.android.ugc.aweme.anim;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.anim.BackgroundAnimHelper_LifecycleAdapter */
public class BackgroundAnimHelper_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final BackgroundAnimHelper f60061a;

    BackgroundAnimHelper_LifecycleAdapter(BackgroundAnimHelper backgroundAnimHelper) {
        this.f60061a = backgroundAnimHelper;
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
                if (!z2 || nVar.mo124a("resumeAnim", 1)) {
                    this.f60061a.resumeAnim();
                }
            } else if (event == Event.ON_PAUSE) {
                if (!z2 || nVar.mo124a("stopAnim", 1)) {
                    this.f60061a.stopAnim();
                }
            }
        }
    }
}
