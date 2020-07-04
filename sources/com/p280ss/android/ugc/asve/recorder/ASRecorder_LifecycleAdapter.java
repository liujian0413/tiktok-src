package com.p280ss.android.ugc.asve.recorder;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.asve.recorder.ASRecorder_LifecycleAdapter */
public class ASRecorder_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final ASRecorder f55803a;

    ASRecorder_LifecycleAdapter(ASRecorder aSRecorder) {
        this.f55803a = aSRecorder;
    }

    /* renamed from: a */
    public final void mo108a(C0043i iVar, Event event, boolean z, C0051n nVar) {
        boolean z2;
        if (nVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && event == Event.ON_CREATE) {
            if (!z2 || nVar.mo124a("onCreate", 1)) {
                this.f55803a.onCreate();
            }
        }
    }
}
