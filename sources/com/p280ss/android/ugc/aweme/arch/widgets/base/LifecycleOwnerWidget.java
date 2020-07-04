package com.p280ss.android.ugc.aweme.arch.widgets.base;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0044j;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget */
public class LifecycleOwnerWidget extends Widget implements C0043i {

    /* renamed from: a */
    C0044j f60917a = new C0044j(this);

    public Lifecycle getLifecycle() {
        return this.f60917a;
    }

    public void onCreate() {
        super.onCreate();
        this.f60917a.mo116a(Event.ON_CREATE);
    }

    public void onDestroy() {
        this.f60917a.mo116a(Event.ON_DESTROY);
        super.onDestroy();
    }

    public void onPause() {
        this.f60917a.mo116a(Event.ON_PAUSE);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f60917a.mo116a(Event.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        this.f60917a.mo116a(Event.ON_START);
    }

    public void onStop() {
        this.f60917a.mo116a(Event.ON_STOP);
        super.onStop();
    }
}
