package com.p280ss.android.ugc.trill.share.p1772ui;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.trill.share.ui.SilentSharePopupWindow_LifecycleAdapter */
public class SilentSharePopupWindow_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final SilentSharePopupWindow f116043a;

    SilentSharePopupWindow_LifecycleAdapter(SilentSharePopupWindow silentSharePopupWindow) {
        this.f116043a = silentSharePopupWindow;
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
                this.f116043a.onHostDestroy();
            }
        }
    }
}
