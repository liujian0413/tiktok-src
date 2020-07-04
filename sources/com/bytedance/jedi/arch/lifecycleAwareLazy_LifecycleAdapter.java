package com.bytedance.jedi.arch;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

public class lifecycleAwareLazy_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final lifecycleAwareLazy f31318a;

    lifecycleAwareLazy_LifecycleAdapter(lifecycleAwareLazy lifecycleawarelazy) {
        this.f31318a = lifecycleawarelazy;
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
            if (!z2 || nVar.mo124a("onStart", 1)) {
                this.f31318a.onStart();
            }
        }
    }
}
