package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;
import android.os.Handler;

/* renamed from: android.arch.lifecycle.t */
public final class C0061t {

    /* renamed from: a */
    public final C0044j f107a;

    /* renamed from: b */
    private final Handler f108b = new Handler();

    /* renamed from: c */
    private C0062a f109c;

    /* renamed from: android.arch.lifecycle.t$a */
    static class C0062a implements Runnable {

        /* renamed from: a */
        final Event f110a;

        /* renamed from: b */
        private final C0044j f111b;

        /* renamed from: c */
        private boolean f112c;

        public final void run() {
            if (!this.f112c) {
                this.f111b.mo116a(this.f110a);
                this.f112c = true;
            }
        }

        C0062a(C0044j jVar, Event event) {
            this.f111b = jVar;
            this.f110a = event;
        }
    }

    /* renamed from: a */
    public final void mo141a() {
        m144a(Event.ON_CREATE);
    }

    /* renamed from: b */
    public final void mo142b() {
        m144a(Event.ON_START);
    }

    /* renamed from: c */
    public final void mo143c() {
        m144a(Event.ON_START);
    }

    /* renamed from: d */
    public final void mo144d() {
        m144a(Event.ON_STOP);
        m144a(Event.ON_DESTROY);
    }

    public C0061t(C0043i iVar) {
        this.f107a = new C0044j(iVar);
    }

    /* renamed from: a */
    private void m144a(Event event) {
        if (this.f109c != null) {
            this.f109c.run();
        }
        this.f109c = new C0062a(this.f107a, event);
        this.f108b.postAtFrontOfQueue(this.f109c);
    }
}
