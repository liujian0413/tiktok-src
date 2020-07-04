package com.p280ss.android.ugc.aweme.story.live;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.story.live.LivePreview_LifecycleAdapter */
public class LivePreview_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final LivePreview f109065a;

    LivePreview_LifecycleAdapter(LivePreview livePreview) {
        this.f109065a = livePreview;
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
                    this.f109065a.onCreate();
                }
            } else if (event == Event.ON_DESTROY) {
                if (!z2 || nVar.mo124a("onDestroy", 1)) {
                    this.f109065a.onDestroy();
                }
            }
        }
    }
}
