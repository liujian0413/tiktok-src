package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenShortVideoMethod_LifecycleAdapter */
public class OpenShortVideoMethod_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final OpenShortVideoMethod f73529a;

    OpenShortVideoMethod_LifecycleAdapter(OpenShortVideoMethod openShortVideoMethod) {
        this.f73529a = openShortVideoMethod;
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
                this.f73529a.onDestroy();
            }
        }
    }
}
