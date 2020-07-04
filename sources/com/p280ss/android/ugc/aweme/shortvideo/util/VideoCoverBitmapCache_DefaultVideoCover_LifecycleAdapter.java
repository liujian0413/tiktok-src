package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;
import com.p280ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache.DefaultVideoCover;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache_DefaultVideoCover_LifecycleAdapter */
public class VideoCoverBitmapCache_DefaultVideoCover_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final DefaultVideoCover f107958a;

    VideoCoverBitmapCache_DefaultVideoCover_LifecycleAdapter(DefaultVideoCover defaultVideoCover) {
        this.f107958a = defaultVideoCover;
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
                this.f107958a.onDestroy();
            }
        }
    }
}
