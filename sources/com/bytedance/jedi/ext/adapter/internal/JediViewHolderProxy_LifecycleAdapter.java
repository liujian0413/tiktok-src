package com.bytedance.jedi.ext.adapter.internal;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

public class JediViewHolderProxy_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final JediViewHolderProxy f31491a;

    JediViewHolderProxy_LifecycleAdapter(JediViewHolderProxy jediViewHolderProxy) {
        this.f31491a = jediViewHolderProxy;
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
                    this.f31491a.onCreate();
                }
            } else if (event == Event.ON_START) {
                if (!z2 || nVar.mo124a("onStart", 1)) {
                    this.f31491a.onStart();
                }
            } else if (event == Event.ON_STOP) {
                if (!z2 || nVar.mo124a("onStop", 1)) {
                    this.f31491a.onStop();
                }
            } else if (event == Event.ON_DESTROY) {
                if (!z2 || nVar.mo124a("onDestroy", 1)) {
                    this.f31491a.onDestroy();
                }
            }
        }
    }
}
