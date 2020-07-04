package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;

class FullLifecycleObserverAdapter implements GenericLifecycleObserver {

    /* renamed from: a */
    private final FullLifecycleObserver f29a;

    FullLifecycleObserverAdapter(FullLifecycleObserver fullLifecycleObserver) {
        this.f29a = fullLifecycleObserver;
    }

    /* renamed from: a */
    public final void mo44a(C0043i iVar, Event event) {
        switch (event) {
            case ON_CREATE:
                return;
            case ON_START:
                return;
            case ON_RESUME:
                return;
            case ON_PAUSE:
                return;
            case ON_STOP:
                return;
            case ON_DESTROY:
                return;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
