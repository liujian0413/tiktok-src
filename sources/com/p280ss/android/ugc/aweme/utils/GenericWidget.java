package com.p280ss.android.ugc.aweme.utils;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle.Event;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;

/* renamed from: com.ss.android.ugc.aweme.utils.GenericWidget */
public class GenericWidget extends Widget implements GenericLifecycleObserver {
    /* renamed from: a */
    public final void mo44a(C0043i iVar, Event event) {
        if (event == Event.ON_CREATE) {
            onCreate();
        } else if (event == Event.ON_START) {
            onStart();
        } else if (event == Event.ON_PAUSE) {
            onPause();
        } else if (event == Event.ON_RESUME) {
            onResume();
        } else if (event == Event.ON_STOP) {
            onStop();
        } else {
            if (event == Event.ON_DESTROY) {
                onDestroy();
            }
        }
    }
}
