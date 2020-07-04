package com.p280ss.android.ugc.asve.recorder;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl_LifecycleAdapter */
public class VERecorderImpl_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final VERecorderImpl f55832a;

    VERecorderImpl_LifecycleAdapter(VERecorderImpl vERecorderImpl) {
        this.f55832a = vERecorderImpl;
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
            if (!z2 || nVar.mo124a("release", 1)) {
                this.f55832a.release();
            }
        }
    }
}
