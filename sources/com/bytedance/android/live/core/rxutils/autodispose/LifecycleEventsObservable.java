package com.bytedance.android.live.core.rxutils.autodispose;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import com.bytedance.android.live.core.rxutils.autodispose.p153a.p154a.C3237a;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.C47546a;
import p346io.reactivex.p354j.C47844a;

final class LifecycleEventsObservable extends C7492s<Event> {

    /* renamed from: a */
    private final Lifecycle f9948a;

    /* renamed from: b */
    private final C47844a<Event> f9949b = C47844a.m148742a();

    static final class ArchLifecycleObserver extends C47546a implements C0042h {

        /* renamed from: a */
        private final Lifecycle f9951a;

        /* renamed from: b */
        private final C7498y<? super Event> f9952b;

        /* renamed from: c */
        private final C47844a<Event> f9953c;

        /* renamed from: a */
        public final void mo10168a() {
            this.f9951a.mo56b(this);
        }

        /* access modifiers changed from: 0000 */
        @C0054q(mo125a = Event.ON_ANY)
        public final void onStateChange(C0043i iVar, Event event) {
            if (!isDisposed()) {
                if (!(event == Event.ON_CREATE && this.f9953c.mo10167b() == event)) {
                    this.f9953c.onNext(event);
                }
                this.f9952b.onNext(event);
            }
        }

        ArchLifecycleObserver(Lifecycle lifecycle, C7498y<? super Event> yVar, C47844a<Event> aVar) {
            this.f9951a = lifecycle;
            this.f9952b = yVar;
            this.f9953c = aVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Event mo10165a() {
        return (Event) this.f9949b.mo10167b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo10167b() {
        Event event;
        switch (this.f9948a.mo54a()) {
            case INITIALIZED:
                event = Event.ON_CREATE;
                break;
            case CREATED:
                event = Event.ON_START;
                break;
            case STARTED:
            case RESUMED:
                event = Event.ON_RESUME;
                break;
            default:
                event = Event.ON_DESTROY;
                break;
        }
        this.f9949b.onNext(event);
    }

    LifecycleEventsObservable(Lifecycle lifecycle) {
        this.f9948a = lifecycle;
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super Event> yVar) {
        ArchLifecycleObserver archLifecycleObserver = new ArchLifecycleObserver(this.f9948a, yVar, this.f9949b);
        yVar.onSubscribe(archLifecycleObserver);
        if (!C3237a.m12267a()) {
            yVar.onError(new IllegalStateException("Lifecycles can only be bound to on the main thread!"));
            return;
        }
        this.f9948a.mo55a(archLifecycleObserver);
        if (archLifecycleObserver.isDisposed()) {
            this.f9948a.mo56b(archLifecycleObserver);
        }
    }
}
