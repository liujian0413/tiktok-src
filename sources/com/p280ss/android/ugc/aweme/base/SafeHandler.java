package com.p280ss.android.ugc.aweme.base;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle.Event;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ss.android.ugc.aweme.base.SafeHandler */
public class SafeHandler extends Handler implements GenericLifecycleObserver {

    /* renamed from: a */
    private final C0043i f61162a;

    /* renamed from: com.ss.android.ugc.aweme.base.SafeHandler$1 */
    static /* synthetic */ class C231921 {

        /* renamed from: a */
        static final /* synthetic */ int[] f61163a = new int[Event.values().length];

        static {
            try {
                f61163a[Event.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    private void m76149a() {
        removeCallbacksAndMessages(null);
        m76151c();
    }

    /* renamed from: b */
    private void m76150b() {
        if (this.f61162a != null) {
            this.f61162a.getLifecycle().mo55a(this);
        }
    }

    /* renamed from: c */
    private void m76151c() {
        if (this.f61162a != null) {
            this.f61162a.getLifecycle().mo56b(this);
        }
    }

    public SafeHandler(C0043i iVar) {
        super(Looper.getMainLooper());
        this.f61162a = iVar;
        m76150b();
    }

    /* renamed from: a */
    public final void mo44a(C0043i iVar, Event event) {
        if (C231921.f61163a[event.ordinal()] == 1) {
            m76149a();
        }
    }
}
