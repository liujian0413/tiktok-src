package com.p280ss.android.ugc.aweme.web;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.web.BaseLifeCycleObserver_LifecycleAdapter */
public class BaseLifeCycleObserver_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final BaseLifeCycleObserver f112499a;

    BaseLifeCycleObserver_LifecycleAdapter(BaseLifeCycleObserver baseLifeCycleObserver) {
        this.f112499a = baseLifeCycleObserver;
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
            if (!z2 || nVar.mo124a("onLifecycleChanged", 4)) {
                this.f112499a.onLifecycleChanged(iVar, event);
            }
        } else if (event == Event.ON_CREATE) {
            if (!z2 || nVar.mo124a("onCreate", 2)) {
                this.f112499a.onCreate(iVar);
            }
        } else if (event == Event.ON_DESTROY) {
            if (!z2 || nVar.mo124a("onDestroy", 2)) {
                this.f112499a.onDestroy(iVar);
            }
        } else if (event == Event.ON_RESUME) {
            if (!z2 || nVar.mo124a("onResume", 2)) {
                this.f112499a.onResume(iVar);
            }
        } else if (event == Event.ON_PAUSE) {
            if (!z2 || nVar.mo124a("onPause", 2)) {
                this.f112499a.onPause(iVar);
            }
        } else if (event == Event.ON_START) {
            if (!z2 || nVar.mo124a("onStart", 2)) {
                this.f112499a.onStart(iVar);
            }
        } else if (event == Event.ON_STOP) {
            if (!z2 || nVar.mo124a("onStop", 2)) {
                this.f112499a.onStop(iVar);
            }
        }
    }
}
