package com.bytedance.widget;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

public class Widget_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final Widget f34474a;

    Widget_LifecycleAdapter(Widget widget) {
        this.f34474a = widget;
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
                if (!z2 || nVar.mo124a("create$widget_release", 1)) {
                    this.f34474a.create$widget_release();
                }
            } else if (event == Event.ON_START) {
                if (!z2 || nVar.mo124a("start$widget_release", 1)) {
                    this.f34474a.start$widget_release();
                }
            } else if (event == Event.ON_RESUME) {
                if (!z2 || nVar.mo124a("resume$widget_release", 1)) {
                    this.f34474a.resume$widget_release();
                }
            } else if (event == Event.ON_PAUSE) {
                if (!z2 || nVar.mo124a("pause$widget_release", 1)) {
                    this.f34474a.pause$widget_release();
                }
            } else if (event == Event.ON_STOP) {
                if (!z2 || nVar.mo124a("stop$widget_release", 1)) {
                    this.f34474a.stop$widget_release();
                }
            } else if (event == Event.ON_DESTROY) {
                if (!z2 || nVar.mo124a("destroy$widget_release", 1)) {
                    this.f34474a.destroy$widget_release();
                }
            }
        }
    }
}
