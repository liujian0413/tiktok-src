package p346io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.exceptions.CompositeException;

/* renamed from: io.reactivex.internal.util.e */
public final class C47836e {

    /* renamed from: a */
    public static final Throwable f122622a = new C47837a();

    /* renamed from: io.reactivex.internal.util.e$a */
    static final class C47837a extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        public final Throwable fillInStackTrace() {
            return this;
        }

        C47837a() {
            super("No further exceptions");
        }
    }

    /* renamed from: b */
    public static <E extends Throwable> Exception m148719b(Throwable th) throws Throwable {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    /* renamed from: a */
    public static RuntimeException m148716a(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public static <T> Throwable m148717a(AtomicReference<Throwable> atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        if (th != f122622a) {
            return (Throwable) atomicReference.getAndSet(f122622a);
        }
        return th;
    }

    /* renamed from: a */
    public static <T> boolean m148718a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = (Throwable) atomicReference.get();
            if (th2 == f122622a) {
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
