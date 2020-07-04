package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;

public class SingleGeneratedAdapterObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final C0036d f53a;

    SingleGeneratedAdapterObserver(C0036d dVar) {
        this.f53a = dVar;
    }

    /* renamed from: a */
    public final void mo44a(C0043i iVar, Event event) {
        this.f53a.mo108a(iVar, event, false, null);
        this.f53a.mo108a(iVar, event, true, null);
    }
}
