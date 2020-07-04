package com.bytedance.jedi.arch.internal;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

public class LifecycleAwareObserver_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final LifecycleAwareObserver f31267a;

    LifecycleAwareObserver_LifecycleAdapter(LifecycleAwareObserver lifecycleAwareObserver) {
        this.f31267a = lifecycleAwareObserver;
    }

    /* renamed from: a */
    public final void mo108a(C0043i iVar, Event event, boolean z, C0051n nVar) {
        boolean z2;
        if (nVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (!z2 || nVar.mo124a("onLifecycleEvent", 2)) {
                this.f31267a.onLifecycleEvent(iVar);
            }
        } else if (event == Event.ON_DESTROY) {
            if (!z2 || nVar.mo124a("onDestroy", 1)) {
                this.f31267a.onDestroy();
            }
        }
    }
}
