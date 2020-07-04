package com.p280ss.android.ugc.aweme.discover.helper;

import android.arch.lifecycle.C0036d;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0051n;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.SearchMusicPlayerLifecycleObserver_LifecycleAdapter */
public class SearchMusicPlayerLifecycleObserver_LifecycleAdapter implements C0036d {

    /* renamed from: a */
    final SearchMusicPlayerLifecycleObserver f70271a;

    SearchMusicPlayerLifecycleObserver_LifecycleAdapter(SearchMusicPlayerLifecycleObserver searchMusicPlayerLifecycleObserver) {
        this.f70271a = searchMusicPlayerLifecycleObserver;
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
                    this.f70271a.onCreate();
                }
            } else if (event == Event.ON_DESTROY) {
                if (!z2 || nVar.mo124a("onDestroy", 1)) {
                    this.f70271a.onDestroy();
                }
            }
        }
    }
}
