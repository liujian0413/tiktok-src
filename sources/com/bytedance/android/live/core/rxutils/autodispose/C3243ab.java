package com.bytedance.android.live.core.rxutils.autodispose;

import java.util.concurrent.atomic.AtomicInteger;
import org.p361a.C48293c;
import p346io.reactivex.C7498y;
import p346io.reactivex.p350f.C7332a;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.ab */
final class C3243ab {
    /* renamed from: a */
    public static void m12276a(C7498y<?> yVar, AtomicInteger atomicInteger, C3253c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable a = cVar.mo10188a();
            if (a != null) {
                yVar.onError(a);
                return;
            }
            yVar.onComplete();
        }
    }

    /* renamed from: a */
    public static void m12278a(C48293c<?> cVar, AtomicInteger atomicInteger, C3253c cVar2) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable a = cVar2.mo10188a();
            if (a != null) {
                cVar.onError(a);
                return;
            }
            cVar.onComplete();
        }
    }

    /* renamed from: a */
    public static void m12275a(C7498y<?> yVar, Throwable th, AtomicInteger atomicInteger, C3253c cVar) {
        if (!cVar.mo10189a(th)) {
            C7332a.m23029a(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            yVar.onError(cVar.mo10188a());
        }
    }

    /* renamed from: a */
    public static void m12277a(C48293c<?> cVar, Throwable th, AtomicInteger atomicInteger, C3253c cVar2) {
        if (!cVar2.mo10189a(th)) {
            C7332a.m23029a(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            cVar.onError(cVar2.mo10188a());
        }
    }

    /* renamed from: a */
    public static <T> boolean m12279a(C7498y<? super T> yVar, T t, AtomicInteger atomicInteger, C3253c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            yVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable a = cVar.mo10188a();
                if (a != null) {
                    yVar.onError(a);
                } else {
                    yVar.onComplete();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static <T> boolean m12280a(C48293c<? super T> cVar, T t, AtomicInteger atomicInteger, C3253c cVar2) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            cVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable a = cVar2.mo10188a();
                if (a != null) {
                    cVar.onError(a);
                } else {
                    cVar.onComplete();
                }
                return true;
            }
        }
        return false;
    }
}
