package com.p280ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle.Event;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.SafeHandler */
public class SafeHandler extends Handler implements GenericLifecycleObserver {

    /* renamed from: a */
    private final C0043i f99694a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.SafeHandler$1 */
    static /* synthetic */ class C384011 {

        /* renamed from: a */
        static final /* synthetic */ int[] f99695a = new int[Event.values().length];

        static {
            try {
                f99695a[Event.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo96136a() {
        removeCallbacksAndMessages(null);
        m122677c();
    }

    /* renamed from: b */
    private void m122676b() {
        if (this.f99694a != null) {
            this.f99694a.getLifecycle().mo55a(this);
        }
    }

    /* renamed from: c */
    private void m122677c() {
        if (this.f99694a != null) {
            this.f99694a.getLifecycle().mo56b(this);
        }
    }

    public SafeHandler(C0043i iVar) {
        super(Looper.getMainLooper());
        this.f99694a = iVar;
        m122676b();
    }

    /* renamed from: a */
    public void mo44a(C0043i iVar, Event event) {
        if (C384011.f99695a[event.ordinal()] == 1) {
            mo96136a();
        }
    }
}
