package com.bytedance.android.live.core.rxutils.autodispose;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p361a.C48294d;
import p346io.reactivex.p350f.C7332a;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.y */
enum C3290y implements C48294d {
    CANCELLED;

    public final void cancel() {
    }

    public final void request(long j) {
    }

    /* renamed from: a */
    private static void m12347a() {
        C7332a.m23029a((Throwable) new IllegalStateException("Subscription already set!"));
    }

    /* renamed from: a */
    private static boolean m12349a(long j) {
        if (j > 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder("n > 0 required but it was ");
        sb.append(j);
        C7332a.m23029a((Throwable) new IllegalArgumentException(sb.toString()));
        return false;
    }

    /* renamed from: a */
    static boolean m12350a(AtomicReference<C48294d> atomicReference) {
        if (((C48294d) atomicReference.get()) != CANCELLED) {
            C48294d dVar = (C48294d) atomicReference.getAndSet(CANCELLED);
            if (dVar != CANCELLED) {
                if (dVar != null) {
                    dVar.cancel();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m12352a(AtomicReference<C48294d> atomicReference, C48294d dVar) {
        C3281t.m12346a(dVar, "s is null");
        if (atomicReference.compareAndSet(null, dVar)) {
            return true;
        }
        dVar.cancel();
        if (atomicReference.get() != CANCELLED) {
            m12347a();
        }
        return false;
    }

    /* renamed from: a */
    static void m12348a(AtomicReference<C48294d> atomicReference, AtomicLong atomicLong, long j) {
        C48294d dVar = (C48294d) atomicReference.get();
        if (dVar != null) {
            dVar.request(j);
            return;
        }
        if (m12349a(j)) {
            C3267l.m12324a(atomicLong, j);
            C48294d dVar2 = (C48294d) atomicReference.get();
            if (dVar2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    dVar2.request(andSet);
                }
            }
        }
    }

    /* renamed from: a */
    static boolean m12351a(AtomicReference<C48294d> atomicReference, AtomicLong atomicLong, C48294d dVar) {
        if (!m12352a(atomicReference, dVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet != 0) {
            dVar.request(andSet);
        }
        return true;
    }
}
