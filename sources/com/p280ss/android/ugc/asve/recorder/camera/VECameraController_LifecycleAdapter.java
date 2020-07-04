package com.p280ss.android.ugc.asve.recorder.camera;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController_LifecycleAdapter */
public class VECameraController_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final VECameraController f55920a;

    VECameraController_LifecycleAdapter(VECameraController vECameraController) {
        this.f55920a = vECameraController;
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
                    this.f55920a.onCreate();
                }
            } else if (event == Event.ON_STOP) {
                if (!z2 || nVar.mo124a("onStop", 1)) {
                    this.f55920a.onStop();
                }
            } else if (event == Event.ON_START) {
                if (!z2 || nVar.mo124a("onResume", 1)) {
                    this.f55920a.onResume();
                }
            } else if (event == Event.ON_DESTROY) {
                if (!z2 || nVar.mo124a("onDestroy", 1)) {
                    this.f55920a.onDestroy();
                }
            }
        }
    }
}
