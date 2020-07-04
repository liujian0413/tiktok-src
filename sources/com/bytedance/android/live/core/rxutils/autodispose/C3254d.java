package com.bytedance.android.live.core.rxutils.autodispose;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.d */
enum C3254d implements C7321c {
    DISPOSED;

    public final void dispose() {
    }

    public final boolean isDisposed() {
        return true;
    }

    /* renamed from: a */
    static boolean m12292a(AtomicReference<C7321c> atomicReference) {
        C7321c cVar = (C7321c) atomicReference.get();
        C3254d dVar = DISPOSED;
        if (cVar != dVar) {
            C7321c cVar2 = (C7321c) atomicReference.getAndSet(dVar);
            if (cVar2 != dVar) {
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                return true;
            }
        }
        return false;
    }
}
