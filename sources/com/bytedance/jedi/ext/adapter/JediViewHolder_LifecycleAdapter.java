package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

public class JediViewHolder_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final JediViewHolder f31378a;

    JediViewHolder_LifecycleAdapter(JediViewHolder jediViewHolder) {
        this.f31378a = jediViewHolder;
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
                if (!z2 || nVar.mo124a("create$ext_adapter_release", 1)) {
                    this.f31378a.create$ext_adapter_release();
                }
            } else if (event == Event.ON_START) {
                if (!z2 || nVar.mo124a("start$ext_adapter_release", 1)) {
                    this.f31378a.start$ext_adapter_release();
                }
            } else if (event == Event.ON_RESUME) {
                if (!z2 || nVar.mo124a("resume$ext_adapter_release", 1)) {
                    this.f31378a.resume$ext_adapter_release();
                }
            } else if (event == Event.ON_PAUSE) {
                if (!z2 || nVar.mo124a("pause$ext_adapter_release", 1)) {
                    this.f31378a.pause$ext_adapter_release();
                }
            } else if (event == Event.ON_STOP) {
                if (!z2 || nVar.mo124a("stop$ext_adapter_release", 1)) {
                    this.f31378a.stop$ext_adapter_release();
                }
            } else if (event == Event.ON_DESTROY) {
                if (!z2 || nVar.mo124a("destroy$ext_adapter_release", 1)) {
                    this.f31378a.destroy$ext_adapter_release();
                }
            }
        }
    }
}
