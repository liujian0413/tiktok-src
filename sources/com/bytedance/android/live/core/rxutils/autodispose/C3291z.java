package com.bytedance.android.live.core.rxutils.autodispose;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.exceptions.CompositeException;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.z */
final class C3291z {

    /* renamed from: a */
    private static final Throwable f10026a = new C3292a();

    /* renamed from: com.bytedance.android.live.core.rxutils.autodispose.z$a */
    static final class C3292a extends Throwable {
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }

        C3292a() {
            super("No further exceptions");
        }
    }

    /* renamed from: a */
    static Throwable m12353a(AtomicReference<Throwable> atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        if (th != f10026a) {
            return (Throwable) atomicReference.getAndSet(f10026a);
        }
        return th;
    }

    /* renamed from: a */
    static boolean m12354a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = (Throwable) atomicReference.get();
            if (th2 == f10026a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new CompositeException(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, th3));
        return true;
    }
}
