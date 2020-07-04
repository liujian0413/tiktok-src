package p346io.reactivex.internal.util;

import org.p361a.C48294d;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.p353b.C47603h;
import p346io.reactivex.internal.p353b.C47604i;
import p346io.reactivex.internal.queue.C47791b;
import p346io.reactivex.internal.queue.SpscArrayQueue;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.util.j */
public final class C47842j {
    /* renamed from: a */
    public static <T> C47604i<T> m148737a(int i) {
        if (i < 0) {
            return new C47791b(-i);
        }
        return new SpscArrayQueue(i);
    }

    /* renamed from: a */
    public static void m148739a(C48294d dVar, int i) {
        long j;
        if (i < 0) {
            j = Long.MAX_VALUE;
        } else {
            j = (long) i;
        }
        dVar.request(j);
    }

    /* renamed from: a */
    public static <T, U> void m148738a(C47603h<T> hVar, C7498y<? super U> yVar, boolean z, C7321c cVar, C47839g<T, U> gVar) {
        boolean z2;
        int i = 1;
        while (!m148740a(gVar.mo119711b(), hVar.isEmpty(), yVar, z, hVar, cVar, gVar)) {
            while (true) {
                boolean b = gVar.mo119711b();
                Object poll = hVar.poll();
                if (poll == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!m148740a(b, z2, yVar, z, hVar, cVar, gVar)) {
                    if (!z2) {
                        gVar.mo19216a(yVar, poll);
                    } else {
                        i = gVar.mo119707a(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static <T, U> boolean m148740a(boolean z, boolean z2, C7498y<?> yVar, boolean z3, C47604i<?> iVar, C7321c cVar, C47839g<T, U> gVar) {
        if (gVar.mo119709a()) {
            iVar.clear();
            cVar.dispose();
            return true;
        }
        if (z) {
            if (!z3) {
                Throwable d = gVar.mo119713d();
                if (d != null) {
                    iVar.clear();
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    yVar.onError(d);
                    return true;
                } else if (z2) {
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    yVar.onComplete();
                    return true;
                }
            } else if (z2) {
                if (cVar != null) {
                    cVar.dispose();
                }
                Throwable d2 = gVar.mo119713d();
                if (d2 != null) {
                    yVar.onError(d2);
                } else {
                    yVar.onComplete();
                }
                return true;
            }
        }
        return false;
    }
}
