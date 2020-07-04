package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;

class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final Object f51a;

    /* renamed from: b */
    private final C0028a f52b = C0027a.f54a.mo96b(this.f51a.getClass());

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f51a = obj;
    }

    /* renamed from: a */
    public final void mo44a(C0043i iVar, Event event) {
        this.f52b.mo97a(iVar, event, this.f51a);
    }
}
