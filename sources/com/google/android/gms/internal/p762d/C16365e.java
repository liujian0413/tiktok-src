package com.google.android.gms.internal.p762d;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.d.e */
final class C16365e extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f45849a;

    public C16365e(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f45849a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final int hashCode() {
        return this.f45849a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C16365e eVar = (C16365e) obj;
        return this.f45849a == eVar.f45849a && get() == eVar.get();
    }
}
