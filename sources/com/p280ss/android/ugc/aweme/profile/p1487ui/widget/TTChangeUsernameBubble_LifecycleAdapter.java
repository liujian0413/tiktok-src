package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.TTChangeUsernameBubble_LifecycleAdapter */
public class TTChangeUsernameBubble_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final C36682q f96267a;

    TTChangeUsernameBubble_LifecycleAdapter(C36682q qVar) {
        this.f96267a = qVar;
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
            if (!z2 || nVar.mo124a("onHostDestroy", 1)) {
                this.f96267a.onHostDestroy();
            }
        }
    }
}
