package p346io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48294d;
import p346io.reactivex.exceptions.ProtocolViolationException;
import p346io.reactivex.internal.disposables.DisposableHelper;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.subscriptions.SubscriptionHelper;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.util.d */
public final class C47835d {
    /* renamed from: a */
    private static String m148712a(String str) {
        StringBuilder sb = new StringBuilder("It is not allowed to subscribe with a(n) ");
        sb.append(str);
        sb.append(" multiple times. Please create a fresh instance of ");
        sb.append(str);
        sb.append(" and subscribe that to the target source instead.");
        return sb.toString();
    }

    /* renamed from: a */
    private static void m148713a(Class<?> cls) {
        C7332a.m23029a((Throwable) new ProtocolViolationException(m148712a(cls.getName())));
    }

    /* renamed from: a */
    public static boolean m148714a(AtomicReference<C7321c> atomicReference, C7321c cVar, Class<?> cls) {
        C7364b.m23081a(cVar, "next is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.dispose();
        if (atomicReference.get() != DisposableHelper.DISPOSED) {
            m148713a(cls);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m148715a(AtomicReference<C48294d> atomicReference, C48294d dVar, Class<?> cls) {
        C7364b.m23081a(dVar, "next is null");
        if (atomicReference.compareAndSet(null, dVar)) {
            return true;
        }
        dVar.cancel();
        if (atomicReference.get() != SubscriptionHelper.CANCELLED) {
            m148713a(cls);
        }
        return false;
    }
}
