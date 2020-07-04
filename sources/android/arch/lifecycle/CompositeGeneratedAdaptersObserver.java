package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;

public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final C0036d[] f28a;

    CompositeGeneratedAdaptersObserver(C0036d[] dVarArr) {
        this.f28a = dVarArr;
    }

    /* renamed from: a */
    public final void mo44a(C0043i iVar, Event event) {
        C0051n nVar = new C0051n();
        for (C0036d a : this.f28a) {
            a.mo108a(iVar, event, false, nVar);
        }
        for (C0036d a2 : this.f28a) {
            a2.mo108a(iVar, event, true, nVar);
        }
    }
}
