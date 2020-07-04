package p346io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicInteger;
import org.p361a.C48293c;
import p346io.reactivex.C7498y;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.util.f */
public final class C47838f {
    /* renamed from: a */
    public static void m148722a(C7498y<?> yVar, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable terminate = atomicThrowable.terminate();
            if (terminate != null) {
                yVar.onError(terminate);
                return;
            }
            yVar.onComplete();
        }
    }

    /* renamed from: a */
    public static void m148725a(C48293c<?> cVar, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable terminate = atomicThrowable.terminate();
            if (terminate != null) {
                cVar.onError(terminate);
                return;
            }
            cVar.onComplete();
        }
    }

    /* renamed from: a */
    public static void m148721a(C7498y<?> yVar, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.addThrowable(th)) {
            C7332a.m23029a(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            yVar.onError(atomicThrowable.terminate());
        }
    }

    /* renamed from: a */
    public static <T> void m148720a(C7498y<? super T> yVar, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            yVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable terminate = atomicThrowable.terminate();
                if (terminate != null) {
                    yVar.onError(terminate);
                    return;
                }
                yVar.onComplete();
            }
        }
    }

    /* renamed from: a */
    public static <T> void m148723a(C48293c<? super T> cVar, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            cVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable terminate = atomicThrowable.terminate();
                if (terminate != null) {
                    cVar.onError(terminate);
                    return;
                }
                cVar.onComplete();
            }
        }
    }

    /* renamed from: a */
    public static void m148724a(C48293c<?> cVar, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.addThrowable(th)) {
            C7332a.m23029a(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            cVar.onError(atomicThrowable.terminate());
        }
    }
}
