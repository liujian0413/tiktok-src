package com.google.android.play.core.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.play.core.internal.al */
final class C6516al extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f18826a;

    public C6516al(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f18826a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            C6516al alVar = (C6516al) obj;
            return this.f18826a == alVar.f18826a && get() == alVar.get();
        }
    }

    public final int hashCode() {
        return this.f18826a;
    }
}
