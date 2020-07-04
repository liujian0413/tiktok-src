package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenLongVideoMethod_LifecycleAdapter */
public class OpenLongVideoMethod_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final OpenLongVideoMethod f112558a;

    OpenLongVideoMethod_LifecycleAdapter(OpenLongVideoMethod openLongVideoMethod) {
        this.f112558a = openLongVideoMethod;
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
                this.f112558a.onDestroy();
            }
        }
    }
}
