package com.p280ss.android.ugc.aweme.discover.helper;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$play$6 */
public final class MusicPlayHelper$play$6 implements GenericLifecycleObserver {

    /* renamed from: a */
    final /* synthetic */ MusicPlayHelper f70262a;

    MusicPlayHelper$play$6(MusicPlayHelper musicPlayHelper) {
        this.f70262a = musicPlayHelper;
    }

    /* renamed from: a */
    public final void mo44a(C0043i iVar, Event event) {
        if (event != null && event == Event.ON_PAUSE) {
            this.f70262a.mo68326a();
        }
    }
}
