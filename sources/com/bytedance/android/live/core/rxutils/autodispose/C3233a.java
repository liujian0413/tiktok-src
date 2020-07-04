package com.bytedance.android.live.core.rxutils.autodispose;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import com.bytedance.android.live.core.rxutils.autodispose.lifecycle.C3268a;
import com.bytedance.android.live.core.rxutils.autodispose.lifecycle.C3269b;
import com.bytedance.android.live.core.rxutils.autodispose.lifecycle.C3270c;
import com.bytedance.android.live.core.rxutils.autodispose.lifecycle.LifecycleEndedException;
import p346io.reactivex.C7322c;
import p346io.reactivex.C7492s;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.a */
public final class C3233a implements C3269b<Event> {

    /* renamed from: a */
    private static final C3268a<Event> f9954a = C3248b.f9966a;

    /* renamed from: b */
    private final C3268a<Event> f9955b;

    /* renamed from: c */
    private final LifecycleEventsObservable f9956c;

    /* renamed from: com.bytedance.android.live.core.rxutils.autodispose.a$a */
    static class C3235a implements C3268a<Event> {

        /* renamed from: a */
        private final Event f9958a;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Event apply(Event event) throws OutsideScopeException {
            return this.f9958a;
        }

        C3235a(Event event) {
            this.f9958a = event;
        }
    }

    /* renamed from: a */
    public final C7492s<Event> mo10171a() {
        return this.f9956c;
    }

    /* renamed from: b */
    public final C3268a<Event> mo10172b() {
        return this.f9955b;
    }

    /* renamed from: c */
    public final C7322c mo10173c() {
        return C3270c.m12328a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public Event mo10174d() {
        this.f9956c.mo10167b();
        return this.f9956c.mo10165a();
    }

    /* renamed from: a */
    static final /* synthetic */ Event m12256a(Event event) throws OutsideScopeException {
        switch (event) {
            case ON_CREATE:
                return Event.ON_DESTROY;
            case ON_START:
                return Event.ON_STOP;
            case ON_RESUME:
                return Event.ON_PAUSE;
            case ON_PAUSE:
                return Event.ON_STOP;
            default:
                StringBuilder sb = new StringBuilder("Lifecycle has ended! Last event was ");
                sb.append(event);
                throw new LifecycleEndedException(sb.toString());
        }
    }

    /* renamed from: a */
    private static C3233a m12258a(Lifecycle lifecycle, C3268a<Event> aVar) {
        return new C3233a(lifecycle, aVar);
    }

    private C3233a(Lifecycle lifecycle, C3268a<Event> aVar) {
        this.f9956c = new LifecycleEventsObservable(lifecycle);
        this.f9955b = aVar;
    }

    /* renamed from: a */
    public static C3233a m12257a(Lifecycle lifecycle, Event event) {
        return m12258a(lifecycle, (C3268a<Event>) new C3235a<Event>(event));
    }

    /* renamed from: a */
    public static C3233a m12259a(C0043i iVar, Event event) {
        return m12257a(iVar.getLifecycle(), event);
    }
}
