package com.bytedance.android.live.core.rxutils.autodispose;

import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48294d;
import p346io.reactivex.exceptions.ProtocolViolationException;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.n */
final class C3275n {
    /* renamed from: a */
    private static String m12336a(String str) {
        StringBuilder sb = new StringBuilder("It is not allowed to subscribe with a(n) ");
        sb.append(str);
        sb.append(" multiple times. Please create a fresh instance of ");
        sb.append(str);
        sb.append(" and subscribe that to the target source instead.");
        return sb.toString();
    }

    /* renamed from: a */
    private static void m12337a(Class<?> cls) {
        C7332a.m23029a((Throwable) new ProtocolViolationException(m12336a(cls.getName())));
    }

    /* renamed from: a */
    public static boolean m12338a(AtomicReference<C7321c> atomicReference, C7321c cVar, Class<?> cls) {
        C3281t.m12346a(cVar, "next is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.dispose();
        if (atomicReference.get() != C3254d.DISPOSED) {
            m12337a(cls);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m12339a(AtomicReference<C48294d> atomicReference, C48294d dVar, Class<?> cls) {
        C3281t.m12346a(dVar, "next is null");
        if (atomicReference.compareAndSet(null, dVar)) {
            return true;
        }
        dVar.cancel();
        if (atomicReference.get() != C3290y.CANCELLED) {
            m12337a(cls);
        }
        return false;
    }
}
